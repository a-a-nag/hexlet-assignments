@template.layout.page(
    content = @`
        <form action="/users" method="post">
            <div class="form-group">
                <label>
                    First Name
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter First Name" name="firstName">
                </label>
            </div>

            <div class="form-group">
                <label>
                    Last Name
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Last Name" name="lastName">
                </label>
            </div>

            <div class="form-group">
                <label>
                    Email
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Email" name="email">
                </label>
            </div>

            <div class="form-group">
                <label>
                    Password
                    <input type="password" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Password" name="password">
                </label>
            </div>

            <div class="form-group">
                <label>
                    Password Conformation
                    <input type="password" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Password Conformation" name="passwordConfirmation">
                </label>
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    `
)