@import exercise.dto.posts.PostsPage;
@param PostsPage page

@template.layout.page(
    content = @`
        @for(var post : page.getPosts())
            <div>
                <a href="/posts/${post.getId()}">${post.getName()}</a>
            </div>
        @endfor

        @if(page.getPageNumber() != 1)
            <a href="/posts?page=${page.getPageNumber() - 1}">Previous</a>
        @endif

        @if(page.getPageNumber() < page.getMaxPage())
            <a href="/posts?page=${page.getPageNumber() + 1}">Next</a>
        @endif
    `
)
