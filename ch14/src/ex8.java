import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import java.util.ArrayList;

public class ex8 extends Application {
   public ArrayList<Integer> myList = new ArrayList<Integer>();
   
   @Override
   public void start(Stage myStage) {
      GridPane myGP = new GridPane();
      ImageView card;
      int counter = 1;
      
      for (int r = 0; r < 6; ++r) {
         for (int c = 0; c < 9; c++) {
            card = new ImageView("image/card/" + Integer.toString(counter) + ".png");
            myGP.add(card, c, r);
            counter++;
         }
      }
      
      Scene myScene = new Scene(myGP);
      myStage.setScene(myScene);
      myStage.sizeToScene();
      myStage.show();
   }
   
   public static void main(String[] args) {
      launch(ex8.class);
   }
}