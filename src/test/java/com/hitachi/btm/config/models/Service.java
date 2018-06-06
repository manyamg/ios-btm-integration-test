package com.hitachi.btm.config.models;

import java.util.Map;


public class Service {

    private String baseUrl;
    private Map<String, String> endpoints;

    public String getEndpointUrl(String endpointName) {
        return baseUrl + endpoints.get(endpointName);
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Map<String, String> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(Map<String, String> endpoints) {
        this.endpoints = endpoints;
    }
}
