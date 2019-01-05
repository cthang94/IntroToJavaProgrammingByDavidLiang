import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.shape.Rectangle;


public class ex6 extends Application {
   @Override
   public void start(Stage myStage) {
      
      GridPane myGP = new GridPane();
      Rectangle whiteBox;
      Rectangle blackBox;
      myGP.setVgap(1);
      myGP.setHgap(1);
      
      for (int i = 0; i < 8; ++i) {
         for (int j = 0; j < 8; ++j) {
            
            if ((i + j) % 2 == 0) {
               blackBox = new Rectangle(25, 25);
               blackBox.setFill(Color.BLACK);
               myGP.addRow(i, blackBox);
            }
            else {
               whiteBox = new Rectangle(25, 25);
               whiteBox.setFill(Color.WHITE);
               myGP.addRow(i, whiteBox);
            }
         }
      }
      
      Scene myScene = new Scene(myGP);
      myStage.setScene(myScene);
      myStage.sizeToScene();
      myStage.show();
      
      
      
   }
   
   public static void main(String[] args) {
      launch(ex6.class);
   }
   
}