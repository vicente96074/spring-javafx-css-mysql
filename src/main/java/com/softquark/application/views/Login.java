package com.softquark.application.views;

import com.softquark.application.model.entity.Prueba1;
import com.softquark.application.services.Prueba1Service;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * FXML Controller class
 *
 * @author Augusto Vicente
 */
@Configuration
public class Login {

    @FXML
    @Bean
    public void mostrarTexto(javafx.event.ActionEvent evt) {
        prueba1Service.guardar(new Prueba1("Hello"));
        mostrarDatos.setText("");
    }

    @FXML
    private void eliminarTexto(javafx.event.ActionEvent evt) {
        mostrarDatos.setText("");
    }

    @FXML
    public static void loadView(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(Login.class.getResource("Login.fxml"));
            Parent view = loader.load();

            stage.setScene(new Scene(view));
            stage.show();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    @FXML
    private Button btnInicio;

    @FXML
    private Label mostrarDatos;

    @Autowired
    private Prueba1Service prueba1Service;
}
