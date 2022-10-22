/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softquark.application.views;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Augusto Vicente
 */
public class Login {

    @FXML
    public static void loadView(Stage stage) {
        
        try {
            FXMLLoader loader = new FXMLLoader(Login.class.getResource("Login.fxml"));
            Parent view = loader.load();
            stage.setScene(new Scene(view));
            stage.show();
        } catch (IOException e) {
        }
    }

}
