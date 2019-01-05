import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.scene.transform.Rotate;

public class ex5 extends Application {
   
   @Override
   public void start(Stage primaryStage) throws Exception {
      String welcome = new String("Welcome to Java");
      GridPane myGP = new GridPane();
      double rotation = 90;
      myGP.setAlignment(Pos.CENTER);
      myGP.setPrefSize(600, 600);
      Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 35);
      
      double x = Math.cos(rotation);
      double y = Math.sin(rotation);
      
      //Loop
      for (int i = 0; i < welcome.length(); i++) {
          Text text = new Text(x, y, welcome.charAt(i) + "");

          text.setFont(font);
          
          Rotate rotateMatrix = new Rotate(rotation, 0, 100);
          text.getTransforms().add(rotateMatrix);
          
          
          myGP.getChildren().add(text);
          rotation += 22.5;
      }

      //Create the scene for the application
      Scene scene = new Scene(myGP);
      primaryStage.setTitle("Characters around circle");
      primaryStage.setScene(scene);
      
      //Display
      primaryStage.show();
  }

   public static void main(String[] args) {
      launch(ex5.class);
   }
}