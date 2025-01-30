//Clock 
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.scene.shape.Line;

public class Clockex extends Application{
    public static void main(String[] args) {
        Application.launch(args);}
    
  public void start(Stage primayStage){
     Pane pane=new Pane();
     
     Circle c1=new Circle(100,100,50);
     Circle c2=new Circle(100,100,4);
     c1.setStroke(Color.BLACK);
     c1.setFill(Color.color(Math.random(),Math.random(),Math.random(),Math.random()));
     c1.setStrokeWidth(3);
     
     Line line1=new Line(100,100,120,100);
     Line line2=new Line(100,100,100,75);
     
     Label lbl1 = new Label("12"); Label lbl2 = new Label("6");
     Label lbl3 = new Label("3");  Label lbl4 = new Label("9");
     
     lbl1.setTranslateX(98); lbl1.setTranslateY(50);
     lbl2.setTranslateY(130);lbl2.setTranslateX(93);
     lbl3.setTranslateX(140);lbl3.setTranslateY(93);
     lbl4.setTranslateY(93);lbl4.setTranslateX(55);
     
     pane.getChildren().addAll(c1,c2,line1,line2,lbl1,lbl2,lbl3,lbl4);
     
     Scene scene=new Scene(pane,300,300);
     primayStage.setTitle("Clock");
     primayStage.setScene(scene);
     primayStage.show();
  }  
}
