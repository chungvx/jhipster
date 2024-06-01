package com.chung.java;

import com.chung.java.config.AsyncSyncConfiguration;
import com.chung.java.config.EmbeddedElasticsearch;
import com.chung.java.config.EmbeddedKafka;
import com.chung.java.config.EmbeddedRedis;
import com.chung.java.config.EmbeddedSQL;
import com.chung.java.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { DemoApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
