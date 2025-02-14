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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = TimePeriodsRequest.Builder.class)
public final class TimePeriodsRequest {
    private final String startTime;

    private final String endTime;

    private final Map<String, Object> additionalProperties;

    private TimePeriodsRequest(String startTime, String endTime, Map<String, Object> additionalProperties) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("start_time")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("end_time")
    public String getEndTime() {
        return endTime;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TimePeriodsRequest && equalTo((TimePeriodsRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(TimePeriodsRequest other) {
        return startTime.equals(other.startTime) && endTime.equals(other.endTime);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.startTime, this.endTime);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StartTimeStage builder() {
        return new Builder();
    }

    public interface StartTimeStage {
        EndTimeStage startTime(String startTime);

        Builder from(TimePeriodsRequest other);
    }

    public interface EndTimeStage {
        _FinalStage endTime(String endTime);
    }

    public interface _FinalStage {
        TimePeriodsRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements StartTimeStage, EndTimeStage, _FinalStage {
        private String startTime;

        private String endTime;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(TimePeriodsRequest other) {
            startTime(other.getStartTime());
            endTime(other.getEndTime());
            return this;
        }

        @java.lang.Override
        @JsonSetter("start_time")
        public EndTimeStage startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        @java.lang.Override
        @JsonSetter("end_time")
        public _FinalStage endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        @java.lang.Override
        public TimePeriodsRequest build() {
            return new TimePeriodsRequest(startTime, endTime, additionalProperties);
        }
    }
}
