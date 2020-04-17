package com.trelloiii;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.trelloiii.repository")
@ComponentScan({"com.trelloiii","com.trelloiii.services"})
public class ConfigurationClass {
}
