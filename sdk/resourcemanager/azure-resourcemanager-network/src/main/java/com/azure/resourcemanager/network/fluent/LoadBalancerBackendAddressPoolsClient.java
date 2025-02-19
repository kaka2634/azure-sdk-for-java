// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.BackendAddressPoolInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LoadBalancerBackendAddressPoolsClient. */
public interface LoadBalancerBackendAddressPoolsClient {
    /**
     * Gets all the load balancer backed address pools.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancer backed address pools as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<BackendAddressPoolInner> listAsync(String resourceGroupName, String loadBalancerName);

    /**
     * Gets all the load balancer backed address pools.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancer backed address pools as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackendAddressPoolInner> list(String resourceGroupName, String loadBalancerName);

    /**
     * Gets all the load balancer backed address pools.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the load balancer backed address pools as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BackendAddressPoolInner> list(String resourceGroupName, String loadBalancerName, Context context);

    /**
     * Gets load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return load balancer backend address pool along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<BackendAddressPoolInner>> getWithResponseAsync(
        String resourceGroupName, String loadBalancerName, String backendAddressPoolName);

    /**
     * Gets load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return load balancer backend address pool on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<BackendAddressPoolInner> getAsync(
        String resourceGroupName, String loadBalancerName, String backendAddressPoolName);

    /**
     * Gets load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return load balancer backend address pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackendAddressPoolInner get(String resourceGroupName, String loadBalancerName, String backendAddressPoolName);

    /**
     * Gets load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return load balancer backend address pool along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BackendAddressPoolInner> getWithResponse(
        String resourceGroupName, String loadBalancerName, String backendAddressPoolName, Context context);

    /**
     * Creates or updates a load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @param parameters Parameters supplied to the create or update load balancer backend address pool operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pool of backend IP addresses along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String loadBalancerName,
        String backendAddressPoolName,
        BackendAddressPoolInner parameters);

    /**
     * Creates or updates a load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @param parameters Parameters supplied to the create or update load balancer backend address pool operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of pool of backend IP addresses.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<BackendAddressPoolInner>, BackendAddressPoolInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String loadBalancerName,
        String backendAddressPoolName,
        BackendAddressPoolInner parameters);

    /**
     * Creates or updates a load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @param parameters Parameters supplied to the create or update load balancer backend address pool operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of pool of backend IP addresses.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackendAddressPoolInner>, BackendAddressPoolInner> beginCreateOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String backendAddressPoolName,
        BackendAddressPoolInner parameters);

    /**
     * Creates or updates a load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @param parameters Parameters supplied to the create or update load balancer backend address pool operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of pool of backend IP addresses.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<BackendAddressPoolInner>, BackendAddressPoolInner> beginCreateOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String backendAddressPoolName,
        BackendAddressPoolInner parameters,
        Context context);

    /**
     * Creates or updates a load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @param parameters Parameters supplied to the create or update load balancer backend address pool operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pool of backend IP addresses on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<BackendAddressPoolInner> createOrUpdateAsync(
        String resourceGroupName,
        String loadBalancerName,
        String backendAddressPoolName,
        BackendAddressPoolInner parameters);

    /**
     * Creates or updates a load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @param parameters Parameters supplied to the create or update load balancer backend address pool operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pool of backend IP addresses.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackendAddressPoolInner createOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String backendAddressPoolName,
        BackendAddressPoolInner parameters);

    /**
     * Creates or updates a load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @param parameters Parameters supplied to the create or update load balancer backend address pool operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pool of backend IP addresses.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BackendAddressPoolInner createOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String backendAddressPoolName,
        BackendAddressPoolInner parameters,
        Context context);

    /**
     * Deletes the specified load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String loadBalancerName, String backendAddressPoolName);

    /**
     * Deletes the specified load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String loadBalancerName, String backendAddressPoolName);

    /**
     * Deletes the specified load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String loadBalancerName, String backendAddressPoolName);

    /**
     * Deletes the specified load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String loadBalancerName, String backendAddressPoolName, Context context);

    /**
     * Deletes the specified load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String loadBalancerName, String backendAddressPoolName);

    /**
     * Deletes the specified load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String loadBalancerName, String backendAddressPoolName);

    /**
     * Deletes the specified load balancer backend address pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param backendAddressPoolName The name of the backend address pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String loadBalancerName, String backendAddressPoolName, Context context);
}
