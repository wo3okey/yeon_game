<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Yeontris</title>
    <meta property="og:title" content="Yeontris"/>
    <link href="https://fonts.googleapis.com/css?family=Press+Start+2P" rel="stylesheet"/>
    <link rel="stylesheet" type="text/css" href="../../static/css/styles.css"/>
</head>
<body>
<div class="grid">
    <div class="top-column">
        <h2>YEONTRIS</h2>
    </div>
    <div class="board-column">
        <canvas id="board" class="game-board"></canvas>

    </div>
    <div class="right-column">
        <button id="play-btn" onclick="play()" class="play-button">Play</button>
        <button id="pause-btn" onclick="pause()" class="play-button">Pause</button>
        <br>
        <div>
            <p>Score: <span id="score">0</span></p>
            <p>Lines: <span id="lines">0</span></p>
            <p>Level: <span id="level">0</span></p>
            <canvas id="next" class="next"></canvas>
            <br><br><br><br>
            <div class="board-score">
                updating..T_T<br><br>
                <span>[Rank]</span>
                <c:forEach var="item" items="${rankList}" varStatus="status">
                   <li>1. <c:out value="${item.id}"/>-<c:out value="${item.score}"/></li>
                </c:forEach>
                <li>2. yeon-32,603</li>
                <li>3. jam-12,701</li>
            </div>
        </div>


    </div>


    <div class="bottom-column">
        <div class="button-set1">
            <button onmousedown="moveUp()" class="direct-button"></button>
            <div style="margin-bottom: 8px"></div>
            <button onmousedown="moveLeft()" class="direct-button"></button>
            <button onmousedown="moveDown()" class="direct-button"></button>
            <button onmousedown="moveRight()" class="direct-button"></button>
        </div>
        <div class="button-set2">
            <button onmousedown="moveDrop()" class="drop-button">DROP</button>
            <br><br>
        </div>
    </div>
</div>


<script type="text/javascript" src="../../static/js/constants.js"></script>
<script type="text/javascript" src="../../static/js/board.js"></script>
<script type="text/javascript" src="../../static/js/piece.js"></script>
<script type="text/javascript" src="../../static/js/main.js"></script>
</body>
</html>
