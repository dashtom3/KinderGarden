
<html>
<head>
    <title></title>
</head>
<body>


<form action="http://localhost:8080/Jeff/api/news/addNews?token=testToken" method="post" enctype="multipart/form-data">
    <table id="mytb">
        <tr>
            <td>name<input type="text" name="name" id="name" value=""></td>
            <td>intro<input type="text" name="intro" id="intro" value=""></td>
            <td>type<input type="number" name="type" id="type" value=""></td>

            <td><input type="file" name="files" id="file1" value=""></td>
            <td><input type="file" name="files" id="file2" value=""></td>
            <td><input type="file" name="files" id="file3" value=""></td>
        </tr>
    </table>
    <input type="submit" value="upload">
</form>



</body>
</html>
