@import exercise.dto.users.UserPage
@param UserPage userPage

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
    <title>Document</title>
</head>
<body>
<div class="mx-auto p-4 py-md-5">
    <table class="table">
        <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
        </tr>
        </thead>

        <tbody>
            <tr>
                <td>${userPage.getUser().getId()}</td>
                <td>${userPage.getUser().getFirstName()}</td>
                <td>${userPage.getUser().getLastName()}</td>
                <td>${userPage.getUser().getEmail()}</td>
            </tr>
        </tbody>
    </table>
</div>
</body>
</html>
