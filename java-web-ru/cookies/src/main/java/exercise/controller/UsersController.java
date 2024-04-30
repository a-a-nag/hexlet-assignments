package exercise.controller;

import org.apache.commons.lang3.StringUtils;
import exercise.util.Security;
import exercise.model.User;
import exercise.util.NamedRoutes;
import static io.javalin.rendering.template.TemplateUtil.model;
import exercise.repository.UserRepository;
import exercise.dto.users.UserPage;
import io.javalin.http.NotFoundResponse;
import io.javalin.http.Context;


public class UsersController {

    public static void build(Context ctx) throws Exception {
        ctx.render("users/build.jte");
    }

    public static void create(Context ctx) {

        String firstName = ctx.formParam("firstName");
        String lastName = ctx.formParam("lastName");
        String email = ctx.formParam("email");
        String password = ctx.formParam("password");
        String token = Security.generateToken();

        User user = new User(firstName, lastName, email, password,  token);

        UserRepository.save(user);

        Long userId = user.getId();
        ctx.redirect(NamedRoutes.userPath(userId));
        ctx.cookie("token", token);
    }

    public static void show(Context ctx) {
        Long id = ctx.pathParamAsClass("id", Long.class).get();
        String cookieToken = String.valueOf(ctx.cookie("token"));

        User user = UserRepository.find(id).orElseThrow(() -> new NotFoundResponse("User was not found"));
        UserPage page = new UserPage(user);

        if(user.getToken().equals(cookieToken)) {
            ctx.render("users/show.jte", model("page", page));
        } else {
            ctx.redirect(NamedRoutes.buildUserPath());
        }
    }
}
