// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.Context;

/** Samples for MobileNetworks ListByResourceGroup. */
public final class MobileNetworksListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/preview/2022-01-01-preview/examples/MobileNetworkListByResourceGroup.json
     */
    /**
     * Sample code: List mobile networks in resource group.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void listMobileNetworksInResourceGroup(
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.mobileNetworks().listByResourceGroup("rg1", Context.NONE);
    }
}
