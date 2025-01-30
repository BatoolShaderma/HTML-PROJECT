
package javaapplication74;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class JavaApplication74 extends Application{

   
    public static void main(String[] args) 
    {Application.launch(args);
       
    }
    public void start(Stage primaryStage){
        Pane p=new Pane();
       String label = JOptionPane.showInputDialog("Enter the Label");
        String xShiftInput = JOptionPane.showInputDialog("Enter the X-shift");
        String yShiftInput = JOptionPane.showInputDialog("Enter the Y-shift");
        String rotationInput = JOptionPane.showInputDialog("Enter the Rotate angle");
        String fontSizeInput = JOptionPane.showInputDialog("Enter the font size");
  
         double xShift = Double.parseDouble(xShiftInput);
        double yShift = Double.parseDouble(yShiftInput);
        double rotationAngle = Double.parseDouble(rotationInput);
        double fontSize = Double.parseDouble(fontSizeInput);

        // Create and configure the text object
        Text text = new Text(label);
        text.setTranslateX(xShift);
        text.setTranslateY(yShift);
        text.setRotate(rotationAngle);
        text.setFont(new Font(fontSize)); 
      StackPane root = new StackPane(text);
            Scene scene = new Scene(root, 400, 300);

            primaryStage.setTitle("Text Transformation");
            primaryStage.setScene(scene);
            primaryStage.show();
    }
    
}
