@import exercise.dto.articles.BuildArticlePage
@param BuildArticlePage page

@template.layout.page(
    content = @`

        <form action="/articles" method="post">
            <div class="mb-3">
                <label class="form-label">
                    Title
                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="title" value="${page.getTitle()}">
                </label>
            </div>

            <div data-mdb-input-init class="form-outline">
                <label class="form-label" for="textAreaExample">
                    Content
                    <textarea class="form-control" id="textAreaExample1" rows="10" name="content">${page.getContent()}</textarea>
                </label>
            </div>

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>

        @if(page.getErrors() != null)
            <ul>
                @for(var validator : page.getErrors().values())
                    @for(var error : validator)
                        <li>${error.getMessage()}</li>
                    @endfor
                @endfor
            </ul>
        @endif
    `
)
