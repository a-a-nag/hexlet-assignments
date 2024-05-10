@import exercise.dto.MainPage
@import exercise.util.NamedRoutes
@param MainPage page

@template.layout.page(
content = @`
    @if(page.getName() == null)
        <a href="${NamedRoutes.buildSessionPath()}">Войти</a>
    @endif

    @if(page.getName() != null)
        <p>${page.getName().toString()}</p>
        <form action="${NamedRoutes.logoutPath()}" method="post">
            <button type="submit" name="logout">Выйти</button>
        </form>
    @endif
`
)