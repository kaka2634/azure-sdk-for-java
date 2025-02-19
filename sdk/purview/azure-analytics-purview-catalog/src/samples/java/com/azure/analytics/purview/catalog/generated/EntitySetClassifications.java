// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.EntityClient;
import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class EntitySetClassifications {
    public static void main(String[] args) {
        EntityClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildEntityClient();
        BinaryData entityHeaders =
                BinaryData.fromString(
                        "{\"guidHeaderMap\":{\"7fcc43ab-55ea-45d4-9971-ce0443cb10bb\":{\"attributes\":{\"qualifiedName\":\"https://exampleaccount2.core.windows.net\"},\"classifications\":[{\"typeName\":\"MICROSOFT.PERSONAL.IPADDRESS\"}],\"typeName\":\"azure_storage_account\"},\"9fb74c11-ac48-4650-95bc-760665c5bd92\":{\"attributes\":{\"qualifiedName\":\"https://exampleaccount1.core.windows.net\"},\"classifications\":[{\"typeName\":\"MICROSOFT.PERSONAL.EMAIL\"}],\"typeName\":\"azure_storage_account\"}}}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.setClassificationsWithResponse(entityHeaders, requestOptions);
    }
}
