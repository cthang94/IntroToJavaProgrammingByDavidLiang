import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class ex9 extends Application {
   
   @Override
   public void start(Stage myStage) {
      GridPane myGP = new GridPane();
      Circle myCircle;
      myGP.setHgap(10);
      
      for (int i = 0; i < 2; ++i) {
         for (int r = 0; r < 2; r++) {
            StackPane mySP = new StackPane();
            myCircle = new Circle(50);
            myCircle.setFill(Color.WHITE);
            myCircle.setStroke(Color.BLACK);

            mySP.getChildren().add(myCircle);
            
            getArcs(mySP);

            myGP.add(mySP, r, i);
            System.out.println(myCircle.getCenterX());
         }
      }
      
      Scene myScene = new Scene(myGP);
      myStage.setScene(myScene);
      myStage.sizeToScene();
      myStage.show();
   }
   
   public void getArcs(StackPane mySPInput) {
      Arc myArc;
      int angle = 30;
      
      for (int i = 0; i < 4; i++) {
         Pane myP = new Pane();
         myArc = new Arc(50, 50, 40, 40, angle, 40);
         myArc.setFill(Color.RED);
         myArc.setType(ArcType.ROUND);
         angle += 90;
      
         myP.getChildren().add(myArc);
         mySPInput.getChildren().add(myP);
      }
      
   }
   
   public static void main(String[] args) {
      launch(ex9.class);
   }
}