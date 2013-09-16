package com.github.andykram;


import com.github.andykram.resources.ExampleResource;
import com.google.common.collect.ImmutableMap;
import com.sun.jersey.api.core.DefaultResourceConfig;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.simple.container.SimpleServerFactory;

import java.io.Closeable;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        final ResourceConfig config = new DefaultResourceConfig(ExampleResource.class);

        config.setPropertiesAndFeatures(ImmutableMap.<String, Object>of(
                JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE,
                PackagesResourceConfig.PROPERTY_PACKAGES, "com.github.andykram"
        ));

        final String url = "http://0.0.0.0:8000";

        try (final Closeable server = SimpleServerFactory.create(url, config)) {
            while (true) {
                Thread.sleep(Long.MAX_VALUE);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
