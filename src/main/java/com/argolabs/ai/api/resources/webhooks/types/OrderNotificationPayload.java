/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.argolabs.ai.api.resources.webhooks.types;

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
@JsonDeserialize(builder = OrderNotificationPayload.Builder.class)
public final class OrderNotificationPayload {
    private final String orderArgoId;

    private final String storeArgoId;

    private final String total;

    private final String customerName;

    private final String customerPhone;

    private final String orderDetailUrl;

    private final Map<String, Object> additionalProperties;

    private OrderNotificationPayload(
            String orderArgoId,
            String storeArgoId,
            String total,
            String customerName,
            String customerPhone,
            String orderDetailUrl,
            Map<String, Object> additionalProperties) {
        this.orderArgoId = orderArgoId;
        this.storeArgoId = storeArgoId;
        this.total = total;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.orderDetailUrl = orderDetailUrl;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The unique identifier for the order
     */
    @JsonProperty("order_argo_id")
    public String getOrderArgoId() {
        return orderArgoId;
    }

    /**
     * @return The unique identifier for the store
     */
    @JsonProperty("store_argo_id")
    public String getStoreArgoId() {
        return storeArgoId;
    }

    /**
     * @return The total cost of the order
     */
    @JsonProperty("total")
    public String getTotal() {
        return total;
    }

    /**
     * @return The name of the customer
     */
    @JsonProperty("customer_name")
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @return The phone number of the customer
     */
    @JsonProperty("customer_phone")
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * @return The URL to retreive the order details
     */
    @JsonProperty("order_detail_url")
    public String getOrderDetailUrl() {
        return orderDetailUrl;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof OrderNotificationPayload && equalTo((OrderNotificationPayload) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(OrderNotificationPayload other) {
        return orderArgoId.equals(other.orderArgoId)
                && storeArgoId.equals(other.storeArgoId)
                && total.equals(other.total)
                && customerName.equals(other.customerName)
                && customerPhone.equals(other.customerPhone)
                && orderDetailUrl.equals(other.orderDetailUrl);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.orderArgoId,
                this.storeArgoId,
                this.total,
                this.customerName,
                this.customerPhone,
                this.orderDetailUrl);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OrderArgoIdStage builder() {
        return new Builder();
    }

    public interface OrderArgoIdStage {
        StoreArgoIdStage orderArgoId(String orderArgoId);

        Builder from(OrderNotificationPayload other);
    }

    public interface StoreArgoIdStage {
        TotalStage storeArgoId(String storeArgoId);
    }

    public interface TotalStage {
        CustomerNameStage total(String total);
    }

    public interface CustomerNameStage {
        CustomerPhoneStage customerName(String customerName);
    }

    public interface CustomerPhoneStage {
        OrderDetailUrlStage customerPhone(String customerPhone);
    }

    public interface OrderDetailUrlStage {
        _FinalStage orderDetailUrl(String orderDetailUrl);
    }

    public interface _FinalStage {
        OrderNotificationPayload build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements OrderArgoIdStage,
                    StoreArgoIdStage,
                    TotalStage,
                    CustomerNameStage,
                    CustomerPhoneStage,
                    OrderDetailUrlStage,
                    _FinalStage {
        private String orderArgoId;

        private String storeArgoId;

        private String total;

        private String customerName;

        private String customerPhone;

        private String orderDetailUrl;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(OrderNotificationPayload other) {
            orderArgoId(other.getOrderArgoId());
            storeArgoId(other.getStoreArgoId());
            total(other.getTotal());
            customerName(other.getCustomerName());
            customerPhone(other.getCustomerPhone());
            orderDetailUrl(other.getOrderDetailUrl());
            return this;
        }

        /**
         * <p>The unique identifier for the order</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("order_argo_id")
        public StoreArgoIdStage orderArgoId(String orderArgoId) {
            this.orderArgoId = orderArgoId;
            return this;
        }

        /**
         * <p>The unique identifier for the store</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("store_argo_id")
        public TotalStage storeArgoId(String storeArgoId) {
            this.storeArgoId = storeArgoId;
            return this;
        }

        /**
         * <p>The total cost of the order</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("total")
        public CustomerNameStage total(String total) {
            this.total = total;
            return this;
        }

        /**
         * <p>The name of the customer</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("customer_name")
        public CustomerPhoneStage customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        /**
         * <p>The phone number of the customer</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("customer_phone")
        public OrderDetailUrlStage customerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }

        /**
         * <p>The URL to retreive the order details</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("order_detail_url")
        public _FinalStage orderDetailUrl(String orderDetailUrl) {
            this.orderDetailUrl = orderDetailUrl;
            return this;
        }

        @java.lang.Override
        public OrderNotificationPayload build() {
            return new OrderNotificationPayload(
                    orderArgoId, storeArgoId, total, customerName, customerPhone, orderDetailUrl, additionalProperties);
        }
    }
}
