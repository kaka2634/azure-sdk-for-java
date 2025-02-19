// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservice.fluent.models.PrivateLinkResourceInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResolvePrivateLinkServiceIdsClient. */
public interface ResolvePrivateLinkServiceIdsClient {
    /**
     * Gets the private link service ID for the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param parameters Parameters required in order to resolve a private link service ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link service ID for the specified managed cluster along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PrivateLinkResourceInner>> postWithResponseAsync(
        String resourceGroupName, String resourceName, PrivateLinkResourceInner parameters);

    /**
     * Gets the private link service ID for the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param parameters Parameters required in order to resolve a private link service ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link service ID for the specified managed cluster on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PrivateLinkResourceInner> postAsync(
        String resourceGroupName, String resourceName, PrivateLinkResourceInner parameters);

    /**
     * Gets the private link service ID for the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param parameters Parameters required in order to resolve a private link service ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link service ID for the specified managed cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourceInner post(String resourceGroupName, String resourceName, PrivateLinkResourceInner parameters);

    /**
     * Gets the private link service ID for the specified managed cluster.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param parameters Parameters required in order to resolve a private link service ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link service ID for the specified managed cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourceInner> postWithResponse(
        String resourceGroupName, String resourceName, PrivateLinkResourceInner parameters, Context context);
}
