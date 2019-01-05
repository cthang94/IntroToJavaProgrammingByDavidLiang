import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;

// application that shows a cylinder
public class ex10 extends Application {
   
   // JVM automatically launches the JavaFX GUI application
   @Override
   public void start(Stage myStage) {
      // create objects
      Pane myPane = new Pane();
      Arc topArc = new Arc(250, 100, 100, 50, 0, 365);
      GridPane myGP = new GridPane();
      Pane myP = new Pane();
      Line one = new Line(150, 100, 150, 300);
      Line two = new Line(350, 100, 350, 300);
      Arc bottomArc = new Arc (250, 300, 100, 50, 182.5, 182.5);
      Arc dashArc = new Arc(250, 300, 100, 50, 0, 182.5);
      
      // change attributes of the objects
      topArc.setFill(Color.WHITE);
      topArc.setStroke(Color.BLACK);
      bottomArc.setFill(Color.WHITE);
      bottomArc.setStroke(Color.BLACK);
      dashArc.setFill(Color.WHITE);
      dashArc.setStroke(Color.BLACK);
      dashArc.getStrokeDashArray().addAll(6.0, 21.0);
      
      // put all the objects/nodes in the Pane
      myP.getChildren().addAll(topArc, one, two, dashArc, bottomArc);
      
      // puts the Pane into the Scene object
      Scene myScene = new Scene(myP);
      // puts the Scene into the Stage and then it shows Stage
      myStage.setScene(myScene);
      myStage.setHeight(500);
      myStage.setWidth(500);
      myStage.show();
   }

   // JVM looks for the main method first and executes it
   public static void main(String[] args) {
      // launch the class
      launch(ex10.class);
   }
}