package svanimpeFxPong;

import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;


    public class PongGame extends Application {

        private static final int windowWidtch = 1000;
        private static final int windowHeight = 800;
        private static final int PLAYER_HEIGHT = 300;
        private static final int PLAYER_WIDTH = 20;
        private static final double BALL_R = 20;
        private int ballYSpeed = 1;
        private int ballXSpeed = 1;
        private double playerOneYPosition = windowHeight / 2;
        private double playerTwoYPosition = windowHeight / 2;
        private double ballXPosition = windowWidtch / 2;
        private double ballYPosition = windowHeight / 2;
        private int scoreP1 = 0;
        private int scoreP2 = 0;
        private boolean gameStarted;
        private int playerOneXPos = 0;
        private double playerTwoXPos = windowWidtch - PLAYER_WIDTH;

        public void start(Stage stage) throws Exception {
            Canvas canvas = new Canvas(windowWidtch, windowHeight);
            GraphicsContext graphicsContext2D = canvas.getGraphicsContext2D();
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(15), e -> run(graphicsContext2D)));
            timeline.setCycleCount(Timeline.INDEFINITE);
            canvas.setOnMouseMoved(e -> playerOneYPosition = e.getY());
            canvas.setOnMouseClicked(e -> gameStarted = true);
            stage.setScene(new Scene(new StackPane(canvas)));
            stage.show();
            timeline.play();
        }

        private void run(GraphicsContext graphicsContext) {
            graphicsContext.setFill(Color.BLACK);
            graphicsContext.fillRect(0, 0, windowWidtch, windowHeight);
            graphicsContext.setFill(Color.WHITE);
            graphicsContext.setFont(Font.font(25));
            if (gameStarted) {
                ballXPosition += ballXSpeed;
                ballYPosition += ballYSpeed;
                if (ballXPosition < windowWidtch - windowWidtch / 4) {
                    playerTwoYPosition = ballYPosition - PLAYER_HEIGHT / 4;
                } else {
                    playerTwoYPosition = ballYPosition > playerTwoYPosition + PLAYER_HEIGHT / 2 ? playerTwoYPosition += 1 : playerTwoYPosition - 1;
                }
                graphicsContext.fillOval(ballXPosition, ballYPosition, BALL_R, BALL_R);
            } else {
                graphicsContext.setStroke(Color.YELLOW);
                graphicsContext.setTextAlign(TextAlignment.CENTER);
                graphicsContext.strokeText("Click to Start", windowWidtch / 2, windowHeight / 2);
                ballXPosition = windowWidtch / 2;
                ballYPosition = windowHeight / 2;
                ballXSpeed = new Random().nextInt(2) == 0 ? 1 : -1;
                ballYSpeed = new Random().nextInt(2) == 0 ? 1 : -1;
            }
            if (ballYPosition > windowHeight || ballYPosition < 0) ballYSpeed *= -1;
            if (ballXPosition < playerOneXPos - PLAYER_WIDTH) {
                scoreP2++;
                gameStarted = false;
            }
            if (ballXPosition > playerTwoXPos + PLAYER_WIDTH) {
                scoreP1++;
                gameStarted = false;
            }
            if (((ballXPosition + BALL_R > playerTwoXPos) && ballYPosition >= playerTwoYPosition && ballYPosition <= playerTwoYPosition + PLAYER_HEIGHT) ||
                    ((ballXPosition < playerOneXPos + PLAYER_WIDTH) && ballYPosition >= playerOneYPosition && ballYPosition <= playerOneYPosition + PLAYER_HEIGHT)) {
                ballYSpeed += 1 * Math.signum(ballYSpeed);
                ballXSpeed += 1 * Math.signum(ballXSpeed);
                ballXSpeed *= -1;
                ballYSpeed *= -1;
            }
            graphicsContext.fillText(scoreP1 + "\t\t\t\t\t\t\t\t" + scoreP2, windowWidtch / 2, 100);
            graphicsContext.fillRect(playerTwoXPos, playerTwoYPosition, PLAYER_WIDTH, PLAYER_HEIGHT);
            graphicsContext.fillRect(playerOneXPos, playerOneYPosition, PLAYER_WIDTH, PLAYER_HEIGHT);

        }
    }


