package com.light.bit.lash.config;

import org.springframework.boot.autoconfigure.mongo.MongoReactiveAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig extends MongoReactiveAutoConfiguration {

    /*
     * Use the Reactive Streams Mongo Client API to create a com.mongodb.reactivestreams.client.MongoClient instance.
     */
//    public @Bean
//    MongoClient reactiveMongoClient()  {
//        return MongoClients.create("mongodb+srv://micra:<passwords>@cluster0.telps.mongodb.net/test");
//    }
}
