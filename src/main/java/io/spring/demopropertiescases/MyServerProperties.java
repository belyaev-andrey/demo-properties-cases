package io.spring.demopropertiescases;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.Name;

import java.util.List;

@ConfigurationProperties(prefix = "server")
class MyServerProperties {

    @Name("port")
    List<Integer> port;

    public List<Integer> getPort() {
        return port;
    }

    public void setPort(List<Integer> port) {
        this.port = port;
    }
}
