import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.geometry.Insets;
import javafx.scene.text.FontWeight;
import javafx.scene.paint.Color;

public class ex4 extends Application {
   
   @Override
   public void start(Stage myStage) {
      Text myJavaText;
      Color myColor;
      GridPane myGP = new GridPane();
      Font tmr = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
      Insets myInsets = new Insets(40, 40, 40, 40);
      myGP.setVgap(3);
      myGP.setHgap(3);
      
      for (int i = 0; i < 5; ++i) {
         myJavaText = new Text("My Java");
         myColor = new Color(Math.random(), Math.random(), Math.random(), Math.random());
         
         myJavaText.setFill(myColor);
         myJavaText.setFont(tmr);
         myJavaText.setRotate(90);
         myJavaText.setStyle("");
         myGP.addColumn(i, myJavaText);
         myGP.setMargin(myJavaText, myInsets);
      }
      
      Scene myScene = new Scene(myGP);
      myStage.setScene(myScene);
      myStage.sizeToScene();
      myStage.show();
   }
   
   public static void main(String[] args) {
      launch(ex4.class);
   }
}