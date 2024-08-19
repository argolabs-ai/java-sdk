/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.argolabs.ai.api;

import com.argolabs.ai.api.core.ClientOptions;
import com.argolabs.ai.api.core.Environment;

public final class ArgoLabsBuilder {
    private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

    private Environment environment = Environment.STAGING;

    public ArgoLabsBuilder environment(Environment environment) {
        this.environment = environment;
        return this;
    }

    public ArgoLabsBuilder url(String url) {
        this.environment = Environment.custom(url);
        return this;
    }

    public ArgoLabs build() {
        clientOptionsBuilder.environment(this.environment);
        return new ArgoLabs(clientOptionsBuilder.build());
    }
}