package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;
import java.util.List;
import java.util.ArrayList;
import exercise.dto.posts.PostsPage;
import exercise.dto.posts.PostPage;
import exercise.model.Post;
import exercise.repository.PostRepository;

import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;

public class PostsController {

//    public static void show(Context ctx) {
//        PostsPage page = new PostsPage(PostRepository.getEntities());
//        ctx.render("posts/index.jte", model("page", page));
//    }

    public static void showPost(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var post = PostRepository.find(id)
                .orElseThrow(() -> new NotFoundResponse("Page not found"));
        PostPage page = new PostPage(post);
        ctx.render("posts/show.jte", model("page", page));
    }

    public static void show(Context ctx) {
        var pageNumber = ctx.queryParamAsClass("page", Integer.class).getOrDefault(1);
        int postsPerPage = 5;

        int offset = (pageNumber - 1) * postsPerPage;
        List<Post> posts = PostRepository.getEntities().subList(offset, pageNumber * postsPerPage);
        int maxPage = PostRepository.getEntities().size() / postsPerPage;

        PostsPage page = new PostsPage(posts, pageNumber, maxPage);

        ctx.render("posts/index.jte", model("page", page));
    }
}
