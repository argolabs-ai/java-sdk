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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = MultilingualText.Builder.class)
public final class MultilingualText {
    private final Map<String, String> translations;

    private final Map<String, Object> additionalProperties;

    private MultilingualText(Map<String, String> translations, Map<String, Object> additionalProperties) {
        this.translations = translations;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("translations")
    public Map<String, String> getTranslations() {
        return translations;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MultilingualText && equalTo((MultilingualText) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(MultilingualText other) {
        return translations.equals(other.translations);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.translations);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Map<String, String> translations = new LinkedHashMap<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(MultilingualText other) {
            translations(other.getTranslations());
            return this;
        }

        @JsonSetter(value = "translations", nulls = Nulls.SKIP)
        public Builder translations(Map<String, String> translations) {
            this.translations.clear();
            this.translations.putAll(translations);
            return this;
        }

        public Builder putAllTranslations(Map<String, String> translations) {
            this.translations.putAll(translations);
            return this;
        }

        public Builder translations(String key, String value) {
            this.translations.put(key, value);
            return this;
        }

        public MultilingualText build() {
            return new MultilingualText(translations, additionalProperties);
        }
    }
}