/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.argolabs.ai.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStatusEnum {
    PENDING("PENDING"),

    CUSTOMER_CANCELLED("CUSTOMER_CANCELLED"),

    STORE_CANCELLED("STORE_CANCELLED"),

    ACCEPTED("ACCEPTED"),

    REJECTED("REJECTED"),

    READY("READY"),

    FULFILLED("FULFILLED");

    private final String value;

    OrderStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}
