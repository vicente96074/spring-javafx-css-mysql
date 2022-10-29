package com.softquark.application;

import com.softquark.application.model.entity.Prueba1;
import com.softquark.application.services.Prueba1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Augusto Vicente
 */
@Configuration
public class DataInitializer {

    @Autowired
    private Prueba1Service prueba1Service;

    @Bean
    public CommandLineRunner getCommandLineRunner() {
        return args -> {
            prueba1Service.encontrarPrueba1(new Prueba1(2));
            prueba1Service.guardar(new Prueba1("Nuevo 2"));
        };
    }
}
