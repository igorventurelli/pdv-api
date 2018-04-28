package br.com.bilac.pdv.business.configuration;

import br.com.bilac.pdv.model.configuration.ModelModuleConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ModelModuleConfiguration.class)
@ComponentScan(basePackages = {"br.com.bilac.pdv.business.business"})
public class BusinessModuleConfiguration {
}
