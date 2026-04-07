package io.spring.demopropertiescases;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "custom.config")
class ParentProperties {

    //Should we always take it into account as a proper nested property without annotation?
    //@NestedConfigurationProperty
    private NestedDto nested;

    public NestedDto getNested() {
        return nested;
    }

    public void setNested(NestedDto nested) {
        this.nested = nested;
    }

}
