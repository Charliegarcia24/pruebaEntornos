/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyrim;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author chipi
 */
public class Skyrim extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Skyrim.fxml"));

        Scene scene = new Scene(root);
        Image icono = new Image(this.getClass().getResource("/imagenes/logo1.png").toString());
        stage.getIcons().add(icono);
        stage.setScene(scene);
        stage.setTitle("The Elder Scrolls V SKYRIM");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
