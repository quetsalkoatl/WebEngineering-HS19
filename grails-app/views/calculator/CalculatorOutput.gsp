<!doctype html>
<html>
<head>
    <title>Average</title>
    <link rel="stylesheet" href="/static/css/main.css"/>
</head>
<body>

<g:if test="${!model.error}"><p>Your average is <output>${model.result}</output>.</p></g:if>
<g:else><p class="red"><output>${model.result}</output></p></g:else>

<p> Back to the <a href="/static/GradeCalculator.html">calculator</a>.</p>

</body>
</html>