package com.jetbrains.test.boot4.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "custom.config")
class ParentProperties {

    ParentProperties(NestedDto nested) {
      this.nested = nested;
    }

    //Should we always take it into account as a proper nested property without annotation?
    @NestedConfigurationProperty
    private NestedDto nested;

    // Depends on outer / static / etc?
    static class NestedDto {
        String a;
    }
}
