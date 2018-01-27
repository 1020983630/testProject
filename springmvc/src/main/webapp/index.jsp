<html>
<body>
<h2>Hello World!</h2>

    <a href="springmvc/testRequestHeader">Test RequestHeader</a>
    <br>
    <a href="springmvc/testRequestParam?username=yang&age=9">Test RequestParam</a>
    <br>
    <a href="springmvc/get/1">test getRest</a>
    <br>
    <form action="springmvc/post" method="post">
        <button type="submit">test Post</button>
    </form>
    <br>
    <form action="springmvc/delete/1" method="post">
        <input type="hidden" name="_method" value="DELETE">
        <button type="submit">test Delete</button>
    </form>
    <br>
    <form action="springmvc/put/1" method="post">
        <input type="hidden" name="_method" value="put">
        <button type="submit">test Put</button>
    </form>
    <br>
    <a href="springmvc/testPathVariable/10">Test PathVariable</a>
    <br>
    <a href="springmvc/testParamsAndHeaders?username=yang&age=9">Test ParamsAndHeaders</a>
    <br>
    <a href="helloworld">hello world!</a>
    <br>
    <a href="springmvc/test">test1</a>
    <br>
    <a href="springmvc/testMethod">testMethod</a>
    <br>
    <form action="springmvc/testMethod" method="post">
        <button type="submit">submit</button>
    </form>



</body>
</html>
