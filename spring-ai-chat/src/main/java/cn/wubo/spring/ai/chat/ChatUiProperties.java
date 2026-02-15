package cn.wubo.spring.ai.chat;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring.ai.chat.ui")
public class ChatUiProperties {
    private String defaultSystem;
    private boolean init = true;
    private Rag rag = new Rag();

    @Data
    public static class Rag {
        private double similarityThreshold = 0.0F;
        private int topK = 4;
        private String defaultPromptTemplate = """
                Context information is below.
                
                ---------------------
                {context}
                ---------------------
                
                Given the context information and no prior knowledge, answer the query.
                
                Follow these rules:
                
                1. If the answer is not in the context, just say that you don't know.
                2. Avoid statements like "Based on the context..." or "The provided information...".
                
                Query: {query}
                
                Answer:
                """;
        private String defaultEmptyContextPromptTemplate = """
                The user query is outside your knowledge base.
                Politely inform the user that you can't answer it.
                """;
    }
}
