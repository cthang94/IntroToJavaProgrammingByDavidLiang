import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;

// create the GUI application using inheritance
public class ex2 extends Application {
   // override the start method of the Application class
   @Override
   public void start(Stage myStage) {
      //create GridPane and make the lines visible
      GridPane myGP = new GridPane();
      myGP.setGridLinesVisible(true);

      // iterate through the rows and columns accordingly
      for (int i = 0; i < 3; ++i) {
         for (int j = 0; j < 3; ++j) {
            // random is between 0 and 3 non-inclusive
            int random = (int) (Math.random() * 3);
            System.out.println(random);
            // if else-if else statements to decide which image to display
            if (random == 1)
               myGP.add(new ImageView("x.gif"), j, i);
            else if (random == 2)
               myGP.add(new ImageView("o.gif"), j, i);
            else
               myGP.add(new ImageView("noAnswer.jpg"), j, i);
         }
      }
      
      // place the GridPane onto the Scene
      // place the Scene onto the Stage
      Scene myScene = new Scene(myGP);
      myStage.setScene(myScene);
      myStage.sizeToScene();
      myStage.show();
   }

   public static void main(String[] args) {
      // launch the ex2.class application
      Application.launch(ex2.class);
   }
}