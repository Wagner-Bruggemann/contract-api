package com.namgrengaw.contracts.application.config.beans;

import com.namgrengaw.contracts.application.core.ports.in.AuthInputGateway;
import com.namgrengaw.contracts.application.core.ports.out.AuthOutputGateway;
import com.namgrengaw.contracts.application.core.usecases.AuthUsecase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AuthBeanConfig {

    @Bean
    AuthInputGateway authInputGatewayBean(AuthOutputGateway authOutputGateway) {
        return new AuthUsecase(authOutputGateway);
    }

}
