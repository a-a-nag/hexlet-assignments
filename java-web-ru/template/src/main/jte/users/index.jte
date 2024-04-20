@import exercise.dto.users.UsersPage
@import exercise.model.User
@param UsersPage page

<div>
    <div>
        @for(User user : page.getUsers())
            <a href="/users/${user.getId()}">${user.getFirstName()}</a>
            <p>${user.getLastName()}</p>
        @endfor
    </div>
</div>