@import exercise.dto.posts.PostPage
@param PostPage page

@template.layout.page(
    content = @`
        <h1><p>${page.getPost().getName()} ${page.getPost().getBody()}</p></h1>
        <a href="/posts">Show All Posts</a>
    `
)
