package lk.ijse.citroessentional;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class main extends Application {
        public static void main(String[] args) {launch(args);
        }

        @Override
        public void start(Stage stage) throws Exception {
            stage
                    .setScene(new Scene(FXMLLoader
                            .load(this.getClass()
                                    .getResource("/view/login_form.fxml"))));

            stage.setTitle("Login Form");
            stage.centerOnScreen();
            stage.show();
        }
    }
