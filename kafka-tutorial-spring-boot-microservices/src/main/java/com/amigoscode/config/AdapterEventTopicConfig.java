package com.amigoscode.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class AdapterEventTopicConfig {

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic projectorEventsTopicBR() {
        return TopicBuilder.name("projector-events-topic-BR")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic projectorEventsTopicBRFS() {
        return TopicBuilder.name("projector-events-topic-BRFS")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic projectorEventsTopicGAP() {
        return TopicBuilder.name("projector-events-topic-GAP")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic projectorEventsTopicGO() {
        return TopicBuilder.name("projector-events-topic-GO")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic projectorEventsTopicON() {
        return TopicBuilder.name("projector-events-topic-ON")
                .build();
    }
}

