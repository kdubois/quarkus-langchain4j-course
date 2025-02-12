package com.kevindubois;

import io.quarkus.logging.Log;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class MyResource {

    @Inject
    MyAiService myAiService;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getWeatherAlerts() {
        String weather = myAiService.getWeatherAlerts("UT");
        Log.info(weather);
        return weather;
    }
}
