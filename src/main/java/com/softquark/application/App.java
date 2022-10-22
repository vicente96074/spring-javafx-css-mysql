package com.softquark.application;

import com.softquark.application.views.Login;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Clase principal
 *
 * @author Augusto Vicente
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Login.loadView(stage);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
