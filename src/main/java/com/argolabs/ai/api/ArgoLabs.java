/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.argolabs.ai.api;

import com.argolabs.ai.api.core.ClientOptions;
import com.argolabs.ai.api.core.Suppliers;
import com.argolabs.ai.api.resources.menu.MenuClient;
import com.argolabs.ai.api.resources.merchants.MerchantsClient;
import com.argolabs.ai.api.resources.orders.OrdersClient;
import com.argolabs.ai.api.resources.stores.StoresClient;
import java.util.function.Supplier;

public class ArgoLabs {
    protected final ClientOptions clientOptions;

    protected final Supplier<MenuClient> menuClient;

    protected final Supplier<MerchantsClient> merchantsClient;

    protected final Supplier<OrdersClient> ordersClient;

    protected final Supplier<StoresClient> storesClient;

    public ArgoLabs(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        this.menuClient = Suppliers.memoize(() -> new MenuClient(clientOptions));
        this.merchantsClient = Suppliers.memoize(() -> new MerchantsClient(clientOptions));
        this.ordersClient = Suppliers.memoize(() -> new OrdersClient(clientOptions));
        this.storesClient = Suppliers.memoize(() -> new StoresClient(clientOptions));
    }

    public MenuClient menu() {
        return this.menuClient.get();
    }

    public MerchantsClient merchants() {
        return this.merchantsClient.get();
    }

    public OrdersClient orders() {
        return this.ordersClient.get();
    }

    public StoresClient stores() {
        return this.storesClient.get();
    }

    public static ArgoLabsBuilder builder() {
        return new ArgoLabsBuilder();
    }
}