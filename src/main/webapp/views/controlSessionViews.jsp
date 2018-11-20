<%-- 
    Document   : controlSessionViews
    Created on : 20 nov. 2018, 14:08:31
    Author     : pierr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SuperMega Jeu</title>
    </head>     
    <c:choose>
        <!-- On a pas de donne donc on affiche le formulaire de saisie du nom -->
        <c:when test="${empty playerName}">
            <body>
                <h1>Bienvenue dans le super jeu!</h1>
                <hr>
                <h2>Nombre de joueur connecté : ${numberConnected} </h2>
                <hr>
                <form method="POST">
                    <label>Ton prénom : <input name="playerName"></label>
                    <input name="action" value="Connexion" type="SUBMIT">
                </form>
           </body>
        </c:when>
        <!-- On lance le jeu -->
        <c:otherwise>
           <body onload="document.guessForm.guess.focus()">
                <h2>Nombre de joueur connecté : ${numberConnected} </h2>
                <br />
                <h3> Hello <b>${playerName}</b>, Devine mon nombre </h3>
                <hr>
                Essai n° <b></b>
                <b>${val}</b> ${resultat}
                <h2><b>Je pense à un nombre compris entre 0 et 100</b></h2>
                <form name="guessForm" methode="POST" accept-charset="UTF-8">
                    <label>Ta proposition : <input type="number" min="0" max="100" required name="guess"></label>
                    <input type="SUBMIT" name="action" value="Deviner">
                </form>
            </body>
        </c:otherwise>
    </c:choose>
</html>
