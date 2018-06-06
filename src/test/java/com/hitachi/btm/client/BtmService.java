package com.hitachi.btm.client;

import com.jayway.restassured.response.Response;
import org.slf4j.Logger;

import java.io.IOException;

import static com.hitachi.btm.utils.HttpRequestBuilder.HttpMethod.GET;
import static com.hitachi.btm.utils.HttpRequestBuilder.builder;


public class BtmService {

    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(BtmService.class);


    public static Response getAppStatus(String statusEndpointUrl) throws IOException {
        LOGGER.info("request sending to " + statusEndpointUrl);
        return builder()
            .execute(GET, statusEndpointUrl);

    }
}
