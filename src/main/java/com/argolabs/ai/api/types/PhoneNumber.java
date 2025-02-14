/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.argolabs.ai.api.types;

import com.argolabs.ai.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = PhoneNumber.Builder.class)
public final class PhoneNumber {
    private final String id;

    private final String phoneNumber;

    private final OffsetDateTime createDateTime;

    private final Map<String, Object> additionalProperties;

    private PhoneNumber(
            String id, String phoneNumber, OffsetDateTime createDateTime, Map<String, Object> additionalProperties) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.createDateTime = createDateTime;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("create_date_time")
    public OffsetDateTime getCreateDateTime() {
        return createDateTime;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PhoneNumber && equalTo((PhoneNumber) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PhoneNumber other) {
        return id.equals(other.id)
                && phoneNumber.equals(other.phoneNumber)
                && createDateTime.equals(other.createDateTime);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.phoneNumber, this.createDateTime);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        PhoneNumberStage id(String id);

        Builder from(PhoneNumber other);
    }

    public interface PhoneNumberStage {
        CreateDateTimeStage phoneNumber(String phoneNumber);
    }

    public interface CreateDateTimeStage {
        _FinalStage createDateTime(OffsetDateTime createDateTime);
    }

    public interface _FinalStage {
        PhoneNumber build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, PhoneNumberStage, CreateDateTimeStage, _FinalStage {
        private String id;

        private String phoneNumber;

        private OffsetDateTime createDateTime;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PhoneNumber other) {
            id(other.getId());
            phoneNumber(other.getPhoneNumber());
            createDateTime(other.getCreateDateTime());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public PhoneNumberStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("phone_number")
        public CreateDateTimeStage phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        @java.lang.Override
        @JsonSetter("create_date_time")
        public _FinalStage createDateTime(OffsetDateTime createDateTime) {
            this.createDateTime = createDateTime;
            return this;
        }

        @java.lang.Override
        public PhoneNumber build() {
            return new PhoneNumber(id, phoneNumber, createDateTime, additionalProperties);
        }
    }
}
