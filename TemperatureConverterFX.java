package javaapplication69;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TemperatureConverterFX extends Application {
public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage)
  {   
        VBox layout = new VBox(10); 
        Label lab=new Label("Temperature Converter:");
        Label celsiusLabel = new Label("Celsius: ");
        TextField cel = new TextField();
        Label lab2 = new Label("Fehernhit");
        TextField feh = new TextField();
        Label lab3 = new Label("Kalvan");
        TextField kal = new TextField();
        Button convertButton=new Button("Convert");
        
        convertButton.setOnAction(e -> {
        String ft = cel.getText();
        double celsius = Double.parseDouble(ft);
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double kalvan = celsius + 273.15;

        feh.setText(Double.toString(fahrenheit));
        kal.setText(Double.toString(kalvan));

        });
        Font fnt=Font.font("ink free",FontWeight.BOLD,FontPosture.ITALIC,30);
        lab.setFont(fnt);lab2.setFont(fnt);lab3.setFont(fnt);
        celsiusLabel.setFont(fnt);
        
        layout.getChildren().addAll(lab,celsiusLabel,cel,lab2,feh,lab3,kal, convertButton);
        Scene scene = new Scene(layout, 500, 500);
        primaryStage.setTitle("Temperature Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
