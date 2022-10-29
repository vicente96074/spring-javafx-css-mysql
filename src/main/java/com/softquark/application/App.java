package com.softquark.application;

import com.softquark.application.views.Login;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * Clase principal
 *
 * @author Augusto Vicente
 */
@Configuration
@SpringBootApplication
public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Login.loadView(stage);
    }

    @Override
    public void stop() throws Exception {
        applicationContext.close();
    }

    @Override
    public void init() throws Exception {
        this.applicationContext = SpringApplication.run(App.class);
    }

    private ConfigurableApplicationContext applicationContext;
}
