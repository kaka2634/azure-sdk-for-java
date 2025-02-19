// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Caching settings for a caching-type route. To disable caching, do not provide a cacheConfiguration object. */
@Fluent
public final class CacheConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CacheConfiguration.class);

    /*
     * Defines how Frontdoor caches requests that include query strings. You
     * can ignore any query strings when caching, ignore specific query
     * strings, cache every request with a unique URL, or cache specific query
     * strings.
     */
    @JsonProperty(value = "queryStringCachingBehavior")
    private RuleQueryStringCachingBehavior queryStringCachingBehavior;

    /*
     * query parameters to include or exclude (comma separated).
     */
    @JsonProperty(value = "queryParameters")
    private String queryParameters;

    /*
     * Indicates whether content compression is enabled. If compression is
     * enabled, content will be served as compressed if user requests for a
     * compressed version. Content won't be compressed on AzureFrontDoor when
     * requested content is smaller than 1 byte or larger than 1 MB.
     */
    @JsonProperty(value = "isCompressionEnabled")
    private RuleIsCompressionEnabled isCompressionEnabled;

    /*
     * Caching behavior for the requests
     */
    @JsonProperty(value = "cacheBehavior")
    private RuleCacheBehavior cacheBehavior;

    /*
     * The duration for which the content needs to be cached. Allowed format is
     * [d.]hh:mm:ss
     */
    @JsonProperty(value = "cacheDuration")
    private String cacheDuration;

    /**
     * Get the queryStringCachingBehavior property: Defines how Frontdoor caches requests that include query strings.
     * You can ignore any query strings when caching, ignore specific query strings, cache every request with a unique
     * URL, or cache specific query strings.
     *
     * @return the queryStringCachingBehavior value.
     */
    public RuleQueryStringCachingBehavior queryStringCachingBehavior() {
        return this.queryStringCachingBehavior;
    }

    /**
     * Set the queryStringCachingBehavior property: Defines how Frontdoor caches requests that include query strings.
     * You can ignore any query strings when caching, ignore specific query strings, cache every request with a unique
     * URL, or cache specific query strings.
     *
     * @param queryStringCachingBehavior the queryStringCachingBehavior value to set.
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withQueryStringCachingBehavior(
        RuleQueryStringCachingBehavior queryStringCachingBehavior) {
        this.queryStringCachingBehavior = queryStringCachingBehavior;
        return this;
    }

    /**
     * Get the queryParameters property: query parameters to include or exclude (comma separated).
     *
     * @return the queryParameters value.
     */
    public String queryParameters() {
        return this.queryParameters;
    }

    /**
     * Set the queryParameters property: query parameters to include or exclude (comma separated).
     *
     * @param queryParameters the queryParameters value to set.
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withQueryParameters(String queryParameters) {
        this.queryParameters = queryParameters;
        return this;
    }

    /**
     * Get the isCompressionEnabled property: Indicates whether content compression is enabled. If compression is
     * enabled, content will be served as compressed if user requests for a compressed version. Content won't be
     * compressed on AzureFrontDoor when requested content is smaller than 1 byte or larger than 1 MB.
     *
     * @return the isCompressionEnabled value.
     */
    public RuleIsCompressionEnabled isCompressionEnabled() {
        return this.isCompressionEnabled;
    }

    /**
     * Set the isCompressionEnabled property: Indicates whether content compression is enabled. If compression is
     * enabled, content will be served as compressed if user requests for a compressed version. Content won't be
     * compressed on AzureFrontDoor when requested content is smaller than 1 byte or larger than 1 MB.
     *
     * @param isCompressionEnabled the isCompressionEnabled value to set.
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withIsCompressionEnabled(RuleIsCompressionEnabled isCompressionEnabled) {
        this.isCompressionEnabled = isCompressionEnabled;
        return this;
    }

    /**
     * Get the cacheBehavior property: Caching behavior for the requests.
     *
     * @return the cacheBehavior value.
     */
    public RuleCacheBehavior cacheBehavior() {
        return this.cacheBehavior;
    }

    /**
     * Set the cacheBehavior property: Caching behavior for the requests.
     *
     * @param cacheBehavior the cacheBehavior value to set.
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withCacheBehavior(RuleCacheBehavior cacheBehavior) {
        this.cacheBehavior = cacheBehavior;
        return this;
    }

    /**
     * Get the cacheDuration property: The duration for which the content needs to be cached. Allowed format is
     * [d.]hh:mm:ss.
     *
     * @return the cacheDuration value.
     */
    public String cacheDuration() {
        return this.cacheDuration;
    }

    /**
     * Set the cacheDuration property: The duration for which the content needs to be cached. Allowed format is
     * [d.]hh:mm:ss.
     *
     * @param cacheDuration the cacheDuration value to set.
     * @return the CacheConfiguration object itself.
     */
    public CacheConfiguration withCacheDuration(String cacheDuration) {
        this.cacheDuration = cacheDuration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
