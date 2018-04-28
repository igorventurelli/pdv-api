package br.com.bilac.pdv.service.configuration;

import br.com.bilac.pdv.business.configuration.BusinessModuleConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BusinessModuleConfiguration.class)
@ComponentScan(basePackages = {"br.com.bilac.pdv.service.service"})
public class ServiceModuleConfiguration {
}
