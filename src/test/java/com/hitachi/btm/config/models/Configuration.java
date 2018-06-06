package com.hitachi.btm.config.models;

import java.util.Map;

public class Configuration {

    private String environment;
    private Map<String, Service> services;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Map<String, Service> getServices() {
        return services;
    }

    public void setServices(Map<String, Service> services) {
        this.services = services;
    }

    public String getEndpointUrl(String serviceName, String endpointName) {
        return services.get(serviceName).getEndpointUrl(endpointName);
    }

}
