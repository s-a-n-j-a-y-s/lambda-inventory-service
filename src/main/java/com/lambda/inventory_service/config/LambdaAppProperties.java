package com.lambda.inventory_service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "lambda")
public class LambdaAppProperties {
    private String appName;
    private String appVersion;

}
