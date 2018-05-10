/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author chipi
 */
public class VentanaPrincipalController implements Initializable {
    Parent root;
    @FXML
    private Button btForjar;
    @FXML
    private Button btListar;
    @FXML
    private Button btDestruir;
    @FXML
    private Button btEncantar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    

    @FXML
    private void forjarArma(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Vista/VentanaPrincipal.fxml"));
            root = loader.load();

            Stage escenario = new Stage();
            Image icono = new Image(this.getClass().getResource("/imagenes/logo1.png").toString());
            escenario.getIcons().add(icono);
            escenario.setScene(new Scene(root));
            escenario.setTitle("Acciones a realizar");
            escenario.show();
        } catch (IOException ex) {            
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

    @FXML
    private void listarArmas(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Vista/VentanaPrincipal.fxml"));
            root = loader.load();

            Stage escenario = new Stage();
            Image icono = new Image(this.getClass().getResource("/imagenes/logo1.png").toString());
            escenario.getIcons().add(icono);
            escenario.setScene(new Scene(root));
            escenario.setTitle("Acciones a realizar");
            escenario.show();
        } catch (IOException ex) {            
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

    @FXML
    private void destruirArmas(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Vista/VentanaPrincipal.fxml"));
            root = loader.load();

            Stage escenario = new Stage();
            Image icono = new Image(this.getClass().getResource("/imagenes/logo1.png").toString());
            escenario.getIcons().add(icono);
            escenario.setScene(new Scene(root));
            escenario.setTitle("Acciones a realizar");
            escenario.show();
        } catch (IOException ex) {            
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }

    @FXML
    private void encantarArma(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Vista/VentanaPrincipal.fxml"));
            root = loader.load();

            Stage escenario = new Stage();
            Image icono = new Image(this.getClass().getResource("/imagenes/logo1.png").toString());
            escenario.getIcons().add(icono);
            escenario.setScene(new Scene(root));
            escenario.setTitle("Acciones a realizar");
            escenario.show();
        } catch (IOException ex) {            
            System.out.println("ERROR IOExcepction:  No se encuentra la ventana de login");
        }
    }
    
}
