@import exercise.dto.users.UsersPage
@param UsersPage usersPage

<html lang="en">
    <body>
        <div>
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                </tr>

                @for(var user : usersPage.getUsers())
                    <tr>
                        <td>${user.getFirstName()}</td>
                        <td>${user.getLastName()}</td>
                        <td>${user.getEmail()}</td>
                    </tr>
                @endfor
            </table>
        </div>
    </body>
</html>
