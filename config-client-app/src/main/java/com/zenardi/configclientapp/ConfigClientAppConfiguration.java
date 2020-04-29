package com.zenardi.configclientapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix="some")
@Data
public class ConfigClientAppConfiguration {
    private String property;


}