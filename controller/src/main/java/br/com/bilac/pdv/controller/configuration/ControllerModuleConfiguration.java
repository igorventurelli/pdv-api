package br.com.bilac.pdv.controller.configuration;

import br.com.bilac.pdv.service.configuration.ServiceModuleConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ServiceModuleConfiguration.class)
@ComponentScan(basePackages = {"br.com.bilac.pdv.controller.endpoint",
        "br.com.bilac.pdv.controller.exception",
        "br.com.bilac.pdv.controller.swagger"})
public class ControllerModuleConfiguration {
}
