package dev.kevindubois;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService(
//        chatMemoryProviderSupplier = RegisterAiService.NoChatMemoryProviderSupplier.class
        chatMemoryProviderSupplier = RegisterAiService.BeanChatMemoryProviderSupplier.class
)
public interface MyAiService {

    String chat(String message);

    String parallelChat(@MemoryId Integer id, @UserMessage String message);
}
