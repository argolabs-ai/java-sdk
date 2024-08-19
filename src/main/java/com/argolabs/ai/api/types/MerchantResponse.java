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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = MerchantResponse.Builder.class)
public final class MerchantResponse {
    private final OffsetDateTime createdAt;

    private final String id;

    private final String brandName;

    private final Optional<BusinessTypeSchema> businessType;

    private final Map<String, Object> additionalProperties;

    private MerchantResponse(
            OffsetDateTime createdAt,
            String id,
            String brandName,
            Optional<BusinessTypeSchema> businessType,
            Map<String, Object> additionalProperties) {
        this.createdAt = createdAt;
        this.id = id;
        this.brandName = brandName;
        this.businessType = businessType;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("brand_name")
    public String getBrandName() {
        return brandName;
    }

    @JsonProperty("business_type")
    public Optional<BusinessTypeSchema> getBusinessType() {
        return businessType;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MerchantResponse && equalTo((MerchantResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(MerchantResponse other) {
        return createdAt.equals(other.createdAt)
                && id.equals(other.id)
                && brandName.equals(other.brandName)
                && businessType.equals(other.businessType);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.createdAt, this.id, this.brandName, this.businessType);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static CreatedAtStage builder() {
        return new Builder();
    }

    public interface CreatedAtStage {
        IdStage createdAt(OffsetDateTime createdAt);

        Builder from(MerchantResponse other);
    }

    public interface IdStage {
        BrandNameStage id(String id);
    }

    public interface BrandNameStage {
        _FinalStage brandName(String brandName);
    }

    public interface _FinalStage {
        MerchantResponse build();

        _FinalStage businessType(Optional<BusinessTypeSchema> businessType);

        _FinalStage businessType(BusinessTypeSchema businessType);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements CreatedAtStage, IdStage, BrandNameStage, _FinalStage {
        private OffsetDateTime createdAt;

        private String id;

        private String brandName;

        private Optional<BusinessTypeSchema> businessType = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(MerchantResponse other) {
            createdAt(other.getCreatedAt());
            id(other.getId());
            brandName(other.getBrandName());
            businessType(other.getBusinessType());
            return this;
        }

        @java.lang.Override
        @JsonSetter("created_at")
        public IdStage createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public BrandNameStage id(String id) {
            this.id = id;
            return this;
        }

        @java.lang.Override
        @JsonSetter("brand_name")
        public _FinalStage brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        @java.lang.Override
        public _FinalStage businessType(BusinessTypeSchema businessType) {
            this.businessType = Optional.ofNullable(businessType);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "business_type", nulls = Nulls.SKIP)
        public _FinalStage businessType(Optional<BusinessTypeSchema> businessType) {
            this.businessType = businessType;
            return this;
        }

        @java.lang.Override
        public MerchantResponse build() {
            return new MerchantResponse(createdAt, id, brandName, businessType, additionalProperties);
        }
    }
}