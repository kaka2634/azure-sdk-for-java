// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.Context;

/** Samples for Watchlists List. */
public final class WatchlistsListSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2021-09-01-preview/examples/watchlists/GetWatchlists.json
     */
    /**
     * Sample code: Get all watchlists.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAllWatchlists(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.watchlists().list("myRg", "myWorkspace", Context.NONE);
    }
}
