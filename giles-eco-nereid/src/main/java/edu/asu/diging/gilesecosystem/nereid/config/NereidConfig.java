package edu.asu.diging.gilesecosystem.nereid.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.asu.diging.gilesecosystem.nereid.core.util.Properties;
import edu.asu.diging.gilesecosystem.septemberutil.service.ISystemMessageHandler;
import edu.asu.diging.gilesecosystem.septemberutil.service.impl.SystemMessageHandler;
import edu.asu.diging.gilesecosystem.util.properties.IPropertiesManager;

@Configuration
public class NereidConfig {

    @Autowired
    private IPropertiesManager propertyManager;

    @Bean
    public ISystemMessageHandler getMessageHandler() {
        return new SystemMessageHandler(propertyManager.getProperty(Properties.APPLICATION_ID));
    }
}
