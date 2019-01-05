//import classes we need
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;

// create the GUI Application
public class ex1 extends Application{
   // define how the GUI is displayed
   @Override
   public void start(Stage myStage) {
      // Instantiate some objects
      GridPane myGP = new GridPane();
      // set some gaps between each node
      myGP.setHgap(6.5);
      myGP.setVgap(6.5);
      // center the nodes in the pane
      myGP.setAlignment(Pos.CENTER);
      
      // specify size for the images
      // add the images into the Pane according to column and row
      ImageView myIV = new ImageView("https://images.homedepot-static.com/productImages/db985bd3-d47b-4b1a-a270-a1bd84e55b62/svn/seasonal-designs-house-flags-rf3n-64_1000.jpg");
      myIV.setFitHeight(100);
      myIV.setFitWidth(100);
      myGP.add(myIV, 0, 0);
      
      ImageView myIV2 = new ImageView("https://www.graphicmaps.com/r/w1047/images/flags/ca-flag.jpg");
      myIV2.setFitHeight(100);
      myIV2.setFitWidth(100);
      myGP.add(myIV2, 1, 0);
      
      ImageView myIV3 = new ImageView("https://www.graphicmaps.com/r/w250/images/flags/bz-flag.jpg");
      myIV3.setFitHeight(100);
      myIV3.setFitWidth(100);
      myGP.add(myIV3, 0, 1);
      
      ImageView myIV4 = new ImageView("https://www.graphicmaps.com/r/w250/images/flags/cu-flag.jpg");
      myIV4.setFitHeight(100);
      myIV4.setFitWidth(100);
      myGP.add(myIV4, 1, 1);
      
      
      // create a scene with the pane inside of it
      Scene myScene = new Scene(myGP);
      
      // put the scene on the stage and display
      myStage.setTitle("Flags of Countries");
      myStage.setScene(myScene);
      myStage.sizeToScene();
      myStage.show();
      
   }
   
   public static void main(String[] args) {
      // launch the ex1.class application
      launch(ex1.class);
   }
   
}