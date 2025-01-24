package org.acme;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService( )
public interface MyAiService {

    @SystemMessage("You are a movie expert") 
    @UserMessage("""
                return the name of a famous movie star and the movie they are best known for
            """)
    MovieStar getMovieStar(); 
}
