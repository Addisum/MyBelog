package com.clouldskol.restskol.application;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class RestSkolApplication extends ResourceConfig {
    public RestSkolApplication() {
        register(JacksonFeature.class);
    }
}
