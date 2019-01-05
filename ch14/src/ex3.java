import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.util.ArrayList;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos;


public class ex3 extends Application{
   public ArrayList<String> deck = new ArrayList<String>();
   
   @Override
   public void start(Stage myStage) {
      FlowPane myFP = new FlowPane();
      myFP.setAlignment(Pos.CENTER);
      
      for (int i = 1; i <= 52; ++i) {
         deck.add(Integer.toString(i));
      }
      
      // shuffle the deck to randomize it
      java.util.Collections.shuffle(deck);
      
      // get the first 3 elements from the ArrayList
      for (int i = 0; i < 3; ++i) {
         int digit = Integer.parseInt(deck.get(i));
         // put the ImageView into the FlowPane
         myFP.getChildren().add(new ImageView("image/card/" + Integer.toString(digit) + ".png"));
      }
      // add the FlowPane onto the Scene
      Scene myScene = new Scene(myFP);
      
      // put the Scene onto the Stage
      myStage.setScene(myScene);
      myStage.sizeToScene();
      myStage.show();
   }
   
   public static void main(String[] args) {
      Application.launch(ex3.class);
   }
}