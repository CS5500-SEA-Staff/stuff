package edu.northeastern.cs5500.backend.view;

import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;

import static spark.Spark.get;

@Singleton
@Slf4j
public class StatusView implements View {

    @Inject
    StatusView() {}

    @Override
    public void register() {
        log.info("StatusView > register");

        get(
            "/status",
            (request, response) -> {
                log.debug("/status");
                response.type("application/json");
                return "{\"status\":\"OK\"}";
            }
        );
    }
}
