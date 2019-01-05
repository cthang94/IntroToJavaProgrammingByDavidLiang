import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;

// GUI that displays a smiley face
public class ex11 extends Application {
   
   //start of GUI
   @Override
   public void start(Stage myStage) {
      // create objects with parameters specified
      Pane myPane = new Pane();
      Circle smiley = new Circle(250, 250, 150);
      Ellipse myEye1 = new Ellipse(200, 200, 30, 20);
      Ellipse myEye2 = new Ellipse(300, 200, 30, 20);
      Ellipse eye1 = new Ellipse(200, 200, 15, 10);
      Ellipse eye2 = new Ellipse(300, 200, 15, 10);
      Line side1 = new Line(250, 220, 270, 280);
      Line side2 = new Line(250, 220, 230, 280);
      Line side3 = new Line(230, 280, 270, 280);
      Arc smile = new Arc(250, 300, 50, 25, 0, -180);
      
      // change attributes of objects
      myEye1.setFill(Color.WHITE);
      myEye1.setStroke(Color.BLACK);  
      myEye2.setFill(Color.WHITE);
      myEye2.setStroke(Color.BLACK);
      smiley.setFill(Color.WHITE);
      smiley.setStroke(Color.BLACK);
      smile.setFill(Color.WHITE);
      smile.setStroke(Color.BLACK);
      
      // add all the nodes onto the pane
      myPane.getChildren().addAll(smiley, myEye1, eye1, myEye2, side1, side2, side3, smile, eye2);
      
      // create a scene with the pane included
      Scene myScene = new Scene(myPane);
      
      // set the scene onto the stage and show the stage
      myStage.setScene(myScene);
      myStage.setHeight(500);
      myStage.setWidth(500);
      myStage.show();
   }
   
   // main method where the program executes
   public static void main(String[] args) {
      // executes the class file
      launch(ex11.class);
   }
}