package io.spring.demopropertiescases;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "custom.config")
class MyServerProperties {

}
