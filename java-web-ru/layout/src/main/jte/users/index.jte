@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
        @for(var user : page.getUsers())
            <p>${user.getFirstName()} ${user.getLastName()}</p>
        @endfor
    `,
    footer = @`
        <a href="https://ru.hexlet.io/">Hexlet</a>
    `
)