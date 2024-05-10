package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;
import exercise.dto.MainPage;
import exercise.dto.LoginPage;
import exercise.model.User;
import exercise.repository.UsersRepository;
import static exercise.util.Security.encrypt;

import exercise.util.Generator;
import exercise.util.NamedRoutes;
import exercise.util.Security;
import io.javalin.http.Context;

public class SessionsController {
    public static void index(Context ctx) {
        MainPage page = new MainPage(ctx.sessionAttribute("currentUser"));
        ctx.render("index.jte", model("page", page));
    }

    public static void build(Context ctx) {
        LoginPage page = new LoginPage("", "");
        ctx.render("build.jte", model("page", page));
    }

    public static void create(Context ctx) {
        String username = ctx.formParam("name");
        String password = ctx.formParam("password");

        User user = UsersRepository.findByName(username);

        if (user != null && user.getPassword().equals(Security.encrypt(password))) {
            ctx.sessionAttribute("currentUser", user.getName());
            ctx.redirect("/");
        } else {
            LoginPage page = new LoginPage(username, "Wrong username or password");
            ctx.render("build.jte", model("page", page));
        }
    }

    public static void destroy(Context ctx) {
        ctx.sessionAttribute("currentUser", null);
        ctx.redirect(NamedRoutes.rootPath());
    }
}
