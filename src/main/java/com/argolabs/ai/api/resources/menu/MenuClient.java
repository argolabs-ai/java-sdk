/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.argolabs.ai.api.resources.menu;

import com.argolabs.ai.api.core.ArgoLabsApiException;
import com.argolabs.ai.api.core.ArgoLabsException;
import com.argolabs.ai.api.core.ClientOptions;
import com.argolabs.ai.api.core.MediaTypes;
import com.argolabs.ai.api.core.ObjectMappers;
import com.argolabs.ai.api.core.RequestOptions;
import com.argolabs.ai.api.errors.UnprocessableEntityError;
import com.argolabs.ai.api.resources.menu.requests.StoreMenu;
import com.argolabs.ai.api.types.HttpValidationError;
import com.argolabs.ai.api.types.StoreMenuResponseFlat;
import com.argolabs.ai.api.types.StoreMenuResponseTree;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MenuClient {
    protected final ClientOptions clientOptions;

    public MenuClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public StoreMenuResponseTree getMenuConfigurationTree(String storeArgoId) {
        return getMenuConfigurationTree(storeArgoId, null);
    }

    public StoreMenuResponseTree getMenuConfigurationTree(String storeArgoId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v1/stores")
                .addPathSegment(storeArgoId)
                .addPathSegments("menu_configuration")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), StoreMenuResponseTree.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 422) {
                    throw new UnprocessableEntityError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, HttpValidationError.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new ArgoLabsApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new ArgoLabsException("Network error executing HTTP request", e);
        }
    }

    public StoreMenuResponseTree createMenuConfiguration(String storeArgoId, StoreMenu request) {
        return createMenuConfiguration(storeArgoId, request, null);
    }

    public StoreMenuResponseTree createMenuConfiguration(
            String storeArgoId, StoreMenu request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v1/stores")
                .addPathSegment(storeArgoId)
                .addPathSegments("menu_configuration")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (JsonProcessingException e) {
            throw new ArgoLabsException("Failed to serialize request", e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), StoreMenuResponseTree.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 422) {
                    throw new UnprocessableEntityError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, HttpValidationError.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new ArgoLabsApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new ArgoLabsException("Network error executing HTTP request", e);
        }
    }

    public StoreMenuResponseFlat getMenuConfigurationFlat(String storeArgoId) {
        return getMenuConfigurationFlat(storeArgoId, null);
    }

    public StoreMenuResponseFlat getMenuConfigurationFlat(String storeArgoId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("v1/stores")
                .addPathSegment(storeArgoId)
                .addPathSegments("menu_configuration/flat")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        OkHttpClient client = clientOptions.httpClient();
        if (requestOptions != null && requestOptions.getTimeout().isPresent()) {
            client = clientOptions.httpClientWithTimeout(requestOptions);
        }
        try (Response response = client.newCall(okhttpRequest).execute()) {
            ResponseBody responseBody = response.body();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(responseBody.string(), StoreMenuResponseFlat.class);
            }
            String responseBodyString = responseBody != null ? responseBody.string() : "{}";
            try {
                if (response.code() == 422) {
                    throw new UnprocessableEntityError(
                            ObjectMappers.JSON_MAPPER.readValue(responseBodyString, HttpValidationError.class));
                }
            } catch (JsonProcessingException ignored) {
                // unable to map error response, throwing generic error
            }
            throw new ArgoLabsApiException(
                    "Error with status code " + response.code(),
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(responseBodyString, Object.class));
        } catch (IOException e) {
            throw new ArgoLabsException("Network error executing HTTP request", e);
        }
    }
}
