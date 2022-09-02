package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@WebMvcTest(properties = {"my.property=hello"})
class HelloControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void shouldReturnHello() {
        webTestClient.get()
                .uri("/")
                .exchange()
                .expectStatus()
                .is2xxSuccessful()
                .expectBody(String.class)
                .isEqualTo("hello");

    }

}