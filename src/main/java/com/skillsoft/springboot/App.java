package com.skillsoft.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootConfiguration //Proporciona la configuracion de la aplicacion.
//@EnableAutoConfiguration //Configuracion automatica los beans presentes en la ruta java
//@ComponentScan //Indica que tiene que escanear el componente actual
@SpringBootApplication // Realiza las 3 tareas anteriores
public class App {
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
        System.out.println("Hello World!");
    }
}
