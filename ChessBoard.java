import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ChessBoard extends Application {

    @Override
    public void start(Stage primaryStage)
    {GridPane gridPane = new GridPane();
         for (int row = 0; row < 8; row++)
         {for (int col = 0; col < 8; col++)
         {Rectangle square = new Rectangle(50, 50);
                 if ((row + col) % 2 == 0) {
                    square.setFill(Color.WHITE); 
                }
                 else {
                    square.setFill(Color.BLACK); 
                }
          gridPane.add(square, col, row);
            }
        }

      
        Scene scene = new Scene(gridPane, 400, 400);
        primaryStage.setTitle("Chess Board");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

