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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = CategoryFlat.Builder.class)
public final class CategoryFlat {
    private final String externalId;

    private final MultilingualText name;

    private final Optional<MultilingualText> description;

    private final Optional<List<String>> itemExternalIds;

    private final int id;

    private final Map<String, Object> additionalProperties;

    private CategoryFlat(
            String externalId,
            MultilingualText name,
            Optional<MultilingualText> description,
            Optional<List<String>> itemExternalIds,
            int id,
            Map<String, Object> additionalProperties) {
        this.externalId = externalId;
        this.name = name;
        this.description = description;
        this.itemExternalIds = itemExternalIds;
        this.id = id;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("external_id")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("name")
    public MultilingualText getName() {
        return name;
    }

    @JsonProperty("description")
    public Optional<MultilingualText> getDescription() {
        return description;
    }

    @JsonProperty("item_external_ids")
    public Optional<List<String>> getItemExternalIds() {
        return itemExternalIds;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof CategoryFlat && equalTo((CategoryFlat) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(CategoryFlat other) {
        return externalId.equals(other.externalId)
                && name.equals(other.name)
                && description.equals(other.description)
                && itemExternalIds.equals(other.itemExternalIds)
                && id == other.id;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.externalId, this.name, this.description, this.itemExternalIds, this.id);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ExternalIdStage builder() {
        return new Builder();
    }

    public interface ExternalIdStage {
        NameStage externalId(String externalId);

        Builder from(CategoryFlat other);
    }

    public interface NameStage {
        IdStage name(MultilingualText name);
    }

    public interface IdStage {
        _FinalStage id(int id);
    }

    public interface _FinalStage {
        CategoryFlat build();

        _FinalStage description(Optional<MultilingualText> description);

        _FinalStage description(MultilingualText description);

        _FinalStage itemExternalIds(Optional<List<String>> itemExternalIds);

        _FinalStage itemExternalIds(List<String> itemExternalIds);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ExternalIdStage, NameStage, IdStage, _FinalStage {
        private String externalId;

        private MultilingualText name;

        private int id;

        private Optional<List<String>> itemExternalIds = Optional.empty();

        private Optional<MultilingualText> description = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(CategoryFlat other) {
            externalId(other.getExternalId());
            name(other.getName());
            description(other.getDescription());
            itemExternalIds(other.getItemExternalIds());
            id(other.getId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("external_id")
        public NameStage externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("name")
        public IdStage name(MultilingualText name) {
            this.name = name;
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public _FinalStage id(int id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        public _FinalStage itemExternalIds(List<String> itemExternalIds) {
            this.itemExternalIds = Optional.ofNullable(itemExternalIds);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "item_external_ids", nulls = Nulls.SKIP)
        public _FinalStage itemExternalIds(Optional<List<String>> itemExternalIds) {
            this.itemExternalIds = itemExternalIds;
            return this;
        }

        @java.lang.Override
        public _FinalStage description(MultilingualText description) {
            this.description = Optional.ofNullable(description);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "description", nulls = Nulls.SKIP)
        public _FinalStage description(Optional<MultilingualText> description) {
            this.description = description;
            return this;
        }

        @java.lang.Override
        public CategoryFlat build() {
            return new CategoryFlat(externalId, name, description, itemExternalIds, id, additionalProperties);
        }
    }
}