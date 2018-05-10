/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skyrim;

import Datos.Bda;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author chipi
 */
public class SkyrimController implements Initializable {
    Bda bd = new Bda();
    @FXML
    private Label label;
    @FXML
    private Button btConectar;
    @FXML
    private Button btCerrarConexion;
    @FXML
    private TextField tfUsuario;
    @FXML
    private TextField tfBda;
    @FXML
    private TextField tfContrasenya;    
    @FXML
    private TextArea tfDatos;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Conectarse(ActionEvent event) {
        String usuario = tfUsuario.getText();
        String pwd = tfContrasenya.getText();
        String bda = tfBda.getText();
        bd.conectar(usuario, pwd, bda);
        tfDatos.appendText("Estableciendo conexion con la base de datos" + "\n" + "Conexion establecida con la base de datos");
        btCerrarConexion.setDisable(false);
        
        Parent root;
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
    private void cerrarConexion(ActionEvent event) throws SQLException {
        bd.desconectar();
        tfBda.clear();
        tfContrasenya.clear();
        tfUsuario.clear();
        tfDatos.clear();
        tfDatos.appendText("La conexion ha sido cerrada con exito");
    }
    
}
