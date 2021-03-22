<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
    <style>
        table {
            font-family: "Times New Roman", sans-serif;
            width: 100%;
            margin-top: 20px;
            border-style: dashed;
            border-color: black;
        }

        td{
            text-align: center;
            padding: 8px;
            width: 150px;
        }

        th {
            text-align: center;
            text-decoration: underline;
            padding: 8px;
            width: 150px;
        }

        div {
            background-color: lightgrey;
            width: 100%;
            border-style: dashed;
            text-align: center;
        }

        tr:nth-child(even) {
            background-color: lightgrey;
        }

        img {
            max-width: 100px;
            height: 100px;
        }

    </style>
</head>
<body>

<div><h2> <u> Human Viruses </u> </h2></div>

<table>
    <tr>
        <th>Virus Name</th>
        <th>Virus Description</th>
        <th>Virus Symptoms</th>
        <th>Virus Duration</th>
        <th>Virus Mortality Rate</th>
        <th>Virus Image</th>

    </tr>
    <c:forEach var = "listitem" items = "${humanviruses}">
        <tr>
            <td>${listitem.getVirusName()}</td>
            <td>${listitem.getVirusDescription()}</td>
            <td>${listitem.getVirusSymptoms()}</td>
            <td>${listitem.getVirusDuration()}</td>
            <td>${listitem.getVirusMortalityrate()}</td>

            <td> <a href="${listitem.getVirusImageURL()}" target="_blank"><img src="../../img/${listitem.getVirusImage()}"></a>
        </tr>
    </c:forEach>
</table>
</body>
</html>