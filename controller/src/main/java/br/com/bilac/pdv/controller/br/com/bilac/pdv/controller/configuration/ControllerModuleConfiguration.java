package br.com.bilac.pdv.controller.br.com.bilac.pdv.controller.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"br.com.bilac.pdv.controller.endpoint"})
public class ControllerModuleConfiguration {
}
