package com.kevindubois;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import jakarta.enterprise.context.SessionScoped;

@RegisterAiService( )
public interface MyAiService {

    @SystemMessage("You are a weather expert")
    @UserMessage("""
                Get the most recent weather alerts for a given state with state code {state}
            """)
    String getWeatherAlerts(String state);
}
