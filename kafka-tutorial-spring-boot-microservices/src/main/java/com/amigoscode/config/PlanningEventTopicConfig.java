package com.amigoscode.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * The KafkaTopicConfig class is responsible for creating topics.
 */

@Configuration
public class PlanningEventTopicConfig {

    /**
     * The amigoscodeTopic() method builds and returns a new topic named "amigoscode".
     * @return a new topic of type NewTopic
     */
    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic amigoscodeTopic() {
        return TopicBuilder.name("amigoscode")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic planningEventsTopicBR() {
        return TopicBuilder.name("planning-events-topic-BR")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic planningEventsTopicBRFS() {
        return TopicBuilder.name("planning-events-topic-BRFS")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic planningEventsTopicGAP() {
        return TopicBuilder.name("planning-events-topic-GAP")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic planningEventsTopicGO() {
        return TopicBuilder.name("planning-events-topic-GO")
                .build();
    }

    @Bean                                       // The @Bean annotation instantiates a new topic
    public NewTopic planningEventsTopicON() {
        return TopicBuilder.name("planning-events-topic-ON")
                .build();
    }
}
