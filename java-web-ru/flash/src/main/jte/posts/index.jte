@import exercise.dto.posts.PostsPage
@param PostsPage page

@template.layout.page(
page = page,
content = @`
    @for(var course : page.getPosts())
        <div>
            <p>${course.getId()}</p>
            <p>${course.getName()}</p>
            <p>${course.getBody()}</p>
        </div>
    @endfor
`
)