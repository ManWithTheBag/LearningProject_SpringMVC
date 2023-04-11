<html>
<head>
    <title>User</title>
</head>
<body>
    <ul>
        <#list usersList as user>
            <li>${user.name}  ${user.surname}  ${user.age}</li>
        </#list>
    </ul>
</body>
</html>