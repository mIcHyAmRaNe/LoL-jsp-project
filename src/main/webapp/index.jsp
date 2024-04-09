<%@ page import="java.util.List" %>
<%@page import="jsp_lol.DBConnect"%>
<%@page import="java.sql.*"%>
<%@ page import="jsp_lol.ChampionsDAO" %>
<%@ page import="jsp_lol.Champions" %>

<!DOCTYPE html>
<html>
<head>
    <title>League of Legends Champions</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.16/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100 font-sans">
    <div class="container mx-auto my-8">
        <h1 class="text-3xl font-bold mb-4 grid justify-items-center">League of Legends Champions</h1>
        <div class="grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-4 gap-4 p-4">
            <%
                ChampionsDAO dao = new ChampionsDAO();
                List<Champions> champions = dao.getAllChampions();
                for (Champions champion : champions) {
            %>
            <div class="bg-white shadow-md rounded-lg overflow-hidden">
                <div class="p-4">
                    <h2 class="text-xl font-bold mb-2"><%= champion.getChampName() %></h2>
                    <img class="object-cover h-48 w-96 ..." src="images/<%=champion.getChampName() %>.jpg"></img>
                    <p class="text-gray-600 mb-4"><%= champion.getChampDesc() %></p>
                    <div class="flex justify-between">
                        <p class="text-blue-500">Blue Essence: <%= champion.getChampBECost() %></p>
                        <p class="text-yellow-500">RP: <%= champion.getChampRPCost() %></p>
                    </div>
                    <button onclick="location.href='images/<%=champion.getChampName() %>.jpg'" class="button bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded mt-4 w-full">
					  Preview
					</button>
                </div>
            </div>
            <%
                }
            %>
        </div>
    </div>
</body>
</html>