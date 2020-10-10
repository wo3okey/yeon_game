<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Yeontris</title>
    <meta property="og:title" content="Yeontris" />
    <meta name="keywords" content="JavaScript, Tetris" />
    <meta
      property="og:image"
      content="https://focused-mestorf-930f82.netlify.com/assets/share-image.png"
    />
    <link href="https://fonts.googleapis.com/css?family=Press+Start+2P" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="../../static/css/styles.css" />
  </head>
  <body>
    <div class="grid">
      <div class="board-score">
        <div class="top-column">
          <h2>YEONTRIS</h2>
<%--          <ol id="highScores"></ol>--%>
        </div>
      </div>
      <div class="board-column">
        <canvas id="board" class="game-board"></canvas>
      </div>
      <div class="right-column">
        <div>
          <p>Score: <span id="score">0</span></p>
          <p>Lines: <span id="lines">0</span></p>
          <p>Level: <span id="level">0</span></p>
          <canvas id="next" class="next"></canvas>
        </div>
        <button id="play-btn" onclick="play()" class="play-button">Play</button>
        <button id="pause-btn" onclick="pause()" class="play-button">Pause</button>
      </div>
    </div>

    <script type="text/javascript" src="../../static/js/constants.js"></script>
    <script type="text/javascript" src="../../static/js/board.js"></script>
    <script type="text/javascript" src="../../static/js/piece.js"></script>
    <script type="text/javascript" src="../../static/js/main.js"></script>
  </body>
</html>
