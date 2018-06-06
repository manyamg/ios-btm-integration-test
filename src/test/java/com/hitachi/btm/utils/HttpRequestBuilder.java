package com.hitachi.btm.utils;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import java.net.MalformedURLException;
import java.util.Map;

import static com.jayway.restassured.RestAssured.given;

public class HttpRequestBuilder {

    private RequestSpecification requestSpecification;
    private String body;
    private Map<String, String> headers;

    public enum HttpMethod {GET, POST, PUT, DELETE, PATCH}

    private HttpRequestBuilder() {
        requestSpecification = given();
    }

    public HttpRequestBuilder withHeaders(Map<String, String> headers) {
        this.headers = headers;
        requestSpecification.headers(headers);
        return this;
    }

    public HttpRequestBuilder withBody(String body) {
        this.body = body;
        requestSpecification.body(body);
        return this;
    }

    public HttpRequestBuilder withBasicAuth(String username, String password) {
        requestSpecification.auth().preemptive().basic(username, password);
        return this;
    }


    public Response execute(HttpMethod httpMethod, String url) throws MalformedURLException {
        switch (httpMethod) {
            case GET:
                return requestSpecification.get(url).andReturn();
            case POST:
                return requestSpecification.post(url).andReturn();
            case PUT:
                return requestSpecification.put(url).andReturn();
            case DELETE:
                return requestSpecification.delete(url).andReturn();
            case PATCH:
                return requestSpecification.patch(url).andReturn();
            default:
                throw new RuntimeException("Unsupported HTTP method");
        }
    }

    public static HttpRequestBuilder builder() {
        return new HttpRequestBuilder();
    }

}
