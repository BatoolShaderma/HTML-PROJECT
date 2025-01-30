
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ground extends Application {
public static void main(String[] args) {
   Application.launch(args);}
    public void start(Stage primaryStage)
    {
      Pane p=new Pane();
      Circle c1=new Circle(300,300,150);
      c1.setFill(null);
      c1.setStroke(Color.BLACK);
      c1.setStrokeWidth(2);
      
      Circle c2=new Circle(300,300,50);
      c2.setFill(Color.BLUE);
      
      Circle c3=new Circle(40,40,30);
      c3.setFill(Color.ORANGERED);
      
     Label txt=new Label("Moon");
      txt.setTranslateX(27);
      txt.setTranslateY(30);
      
      PathTransition t=new PathTransition(Duration.seconds(3),c1,c3);
      t.setPath(c1);
      t.setNode(c3);
      t.setCycleCount(Timeline.INDEFINITE);
      t.setAutoReverse(false);
      t.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
     
      PathTransition t2=new PathTransition(Duration.seconds(3),c1,txt);
      t2.setCycleCount(Timeline.INDEFINITE);
      t2.setAutoReverse(false);
      p.getChildren().addAll(c1,c2,c3,txt);
      
      t2.play();
      t.play();
      
     c2.setOnMousePressed(e-> t.pause());
     c2.setOnMouseReleased(e-> t.play());
     
    Scene scene=new Scene(p,500,500);
    primaryStage.setTitle("Ground");
    primaryStage.setScene(scene);
    primaryStage.show();
    }
}
