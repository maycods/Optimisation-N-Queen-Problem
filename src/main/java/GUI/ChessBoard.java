package GUI;

import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;




class ChessBoard extends GridPane {

    public ChessBoard(int size, int[] sol) {
        //assets..
        var cream = Color.web("#ebebd3");
        var green= Color.web("#749454");


        var blackQueenImg = new ImagePattern(new Image("/blackqueen.png"));
        int squareSize = 55;


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Rectangle bg = new Rectangle(squareSize , squareSize );
                StackPane pane = new StackPane(bg);
                if (sol[i] == j){

                    Rectangle square = new Rectangle(squareSize -4, squareSize -4);
                    square.setFill(blackQueenImg);
                    pane.getChildren().add(square);
                }
                bg.setFill((i + j) % 2 == 0 ? cream : green);
                add(pane, i, j);
            }
        }
    }
    public ChessBoard(int size, int[] sol, double width, double height) {
        //assets..
        var cream = Color.web("#ebebd3");
        var green= Color.web("#749454");


        var blackQueenImg = new ImagePattern(new Image("/blackqueen.png"));
        int squareWidth = (int) (width/size);
        int squareHeight = (int) (height/size);


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Rectangle bg = new Rectangle(squareWidth , squareHeight );
                StackPane pane = new StackPane(bg);
                if (sol[i] == j){

                    Rectangle square = new Rectangle(squareWidth -4, squareHeight -4);
                    square.setFill(blackQueenImg);
                    pane.getChildren().add(square);
                }
                bg.setFill((i + j) % 2 == 0 ? cream : green);
                add(pane, i, j);
            }
        }
    }
    public ChessBoard(int size) {
        //assets..
        var cream = Color.web("#ebebd3");
        var green= Color.web("#749454");
//        var blackQueenImg = new ImagePattern(new Image("/blackqueen.png"));

        int squareSize = 55;


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Rectangle bg = new Rectangle(squareSize , squareSize );
//                Rectangle square = new Rectangle(squareSize -4, squareSize -4);
//                square.setFill(blackQueenImg);
                bg.setFill((i + j) % 2 == 0 ? cream : green);
//                StackPane pane = new StackPane(bg, square);
                add(bg, i, j);
            }
        }
    }
}