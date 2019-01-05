import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;


public class ex7 extends Application {
   @Override
   public void start(Stage myStage) {
      GridPane myGP = new GridPane();
      TextField myTextField;
      
      for (int r = 0; r < 10; r++) {
         for (int c = 0; c < 10; c++) {
            int random = ((int) (Math.random() * 2.0)) % 2;
            System.out.println(random);
            
            if (random == 0) {
               myTextField = new TextField();
               myTextField.setText(Integer.toString(random));
               myTextField.setEditable(false);
               myTextField.setMaxSize(50, 50);
               myTextField.setAlignment(Pos.CENTER);
               myGP.add(myTextField, c, r);
            } else {
               myTextField = new TextField();
               myTextField.setText(Integer.toString(random));
               myTextField.setEditable(false);
               myTextField.setMaxSize(50, 50);
               myTextField.setAlignment(Pos.CENTER);
               myGP.add(myTextField, c, r);
            }
         }
      }
      
      Scene myScene = new Scene(myGP);
      myStage.setScene(myScene);
      myStage.show();
   }
   
   public static void main(String[] args) {
      launch(ex7.class);
   }
}