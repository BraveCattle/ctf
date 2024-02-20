<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Upload Yor Icon</title>
    <link rel="stylesheet" href="/statics/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
        <a href="${pageContext.request.contextPath}/"
           class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none">
            <svg class="bi me-2" width="40" height="32">
                <use xlink:href="#bootstrap"></use>
            </svg>
            <span class="fs-4">Elegant</span>
        </a>
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="#" class="nav-link">Home</a></li>
        </ul>
    </header>
</div>
<main class="container py-5">


    <div class="p-5 mb-4 bg-body-tertiary rounded-3">
        <div class="container-fluid py-5">
            <h1 class="display-5 fw-bold">Upload Your Icon</h1>
            <form action="upload.action" method="post" enctype="multipart/form-data">
                <label for="uploadFile" class="form-label">Be More Elegant</label>
                <div class="row g-3 align-items-center">
                    <div class="col-auto">
                        <input class="g-col-6 form-control" type="file" id="uploadFile" name="fileUpload">
                    </div>
                    <div class="col-auto">
                        <button type="submit" class="g-col-6 btn btn-primary">Submmit</button>
                    </div>

                </div>
            </form>
        </div>
    </div>

    <footer class="pt-3 mt-4 text-body-secondary border-top">
        &copy; 6TH RWCTF
    </footer>
</main>


</body>
<script src="/statics/js/bootstrap.bundle.js"></script>
</html>