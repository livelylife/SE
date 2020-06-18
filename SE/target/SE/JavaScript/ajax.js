<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<script type="text/javascript">
    function getXHR() {
        if (window.XMLHttpRequest) {
            return new XMLHttpRequest();
        } else {
            //遍历IE中不同版本的ActiveX对象
            var versions = ["Microsoft", "msxm3", "msxml2", "msxml1"];
            for (var i = 0; i < versions.length; i++) {
                try {
                    var version = versions[i] + ".XMLHTTP";
                    return new ActiveXObject(version);
                } catch (e) {
                }
            }
        }
    }

    window.onload = function () {
        var xmlhttp = getXHR();
        xmlhttp.withCredentials = true;
        xmlhttp.onreadystatechange = function () {
            if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
                var response = xmlhttp.responseText;
                console.log(response)
            }
        }
        xmlhttp.open("GET", "myServlet?parameters=54654654646", true);
        xmlhttp.send();
    }
</script>
</body>
</html>
