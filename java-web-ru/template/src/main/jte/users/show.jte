@import exercise.dto.users.UserPage
@param UserPage userPage

<html lang="en">
<body>
<div>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
        </tr>

        <tr>
            <td>${userPage.getUser().getFirstName()}</td>
            <td>${userPage.getUser().getLastName()}</td>
            <td>${userPage.getUser().getEmail()}</td>
        </tr>
    </table>
</div>
</body>
</html>
