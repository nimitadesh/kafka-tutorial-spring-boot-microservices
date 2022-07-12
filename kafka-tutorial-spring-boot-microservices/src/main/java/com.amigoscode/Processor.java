package com.amigoscode;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Processor {

    private static final Serde<String> STRING_SERDE = Serdes.String();

    @Autowired
    public void process(StreamsBuilder streamsBuilder) {

        KStream<String, String> inputStream = streamsBuilder
                .stream("planning-events-topic-BR", Consumed.with(STRING_SERDE, STRING_SERDE));

        KStream<String, String> outputStream = inputStream;

        outputStream.to("projector-events-topic-BR");
    }
}
