import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class ex12 extends Application {
   
   public void start(Stage myStage) {
      Rectangle project = new Rectangle(20, 70, 70, 20);
      Rectangle quiz = new Rectangle(100, 80, 70, 10);
      Rectangle midterm = new Rectangle(180, 60, 70, 30);
      Rectangle finalGrade = new Rectangle(260, 50, 70, 40);
      
      Text projText = new Text(18, 60, "Project -- 20%");
      Text quizText = new Text(98, 75, "Quiz -- 10%");
      Text midtermText = new Text(160, 55, "Midterm -- 30%");
      Text finalGradeText = new Text(260, 45, "Final -- 40%");
      
      project.setFill(Color.RED);
      quiz.setFill(Color.BLUE);
      midterm.setFill(Color.GREEN);
      finalGrade.setFill(Color.ORANGE);
   
      Pane myP = new Pane();
      myP.getChildren().addAll(project, quiz, midterm, finalGrade, projText, quizText, midtermText, finalGradeText);
      GridPane myGP = new GridPane();
      myGP.getChildren().add(myP);
      
      
      Scene myScene = new Scene(myGP);
      myStage.setScene(myScene);
      myStage.setHeight(150);
      myStage.setWidth(350);
      
      myStage.show();
   }
   
   
   
   
   public static void main(String[] args) {
      launch(ex12.class);
   }
}