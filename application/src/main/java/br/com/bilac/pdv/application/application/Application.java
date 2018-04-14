package br.com.bilac.pdv.application.application;

import br.com.bilac.pdv.controller.br.com.bilac.pdv.controller.configuration.ControllerModuleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ControllerModuleConfiguration.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
