// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AttachedDataNetworkInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of AttachedDataNetwork. */
public interface AttachedDataNetwork {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the provisioningState property: The provisioning state of the attached data network resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the userPlaneDataInterface property: The user plane interface on the data network. In 5G networks this is
     * called as N6 interface whereas in 4G networks this is called as SGi interface.
     *
     * @return the userPlaneDataInterface value.
     */
    InterfaceProperties userPlaneDataInterface();

    /**
     * Gets the naptConfiguration property: The Network Address and Port Translation configuration. If not specified the
     * attached data network uses a default NAPT configuration with NAPT enabled.
     *
     * @return the naptConfiguration value.
     */
    NaptConfiguration naptConfiguration();

    /**
     * Gets the userEquipmentAddressPoolPrefix property: The user equipment address pool prefixes for the attached data
     * network that are dynamically assigned by the core to UEs when they set up a PDU session. At least one of
     * userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both are defined then
     * they must be the same size.
     *
     * @return the userEquipmentAddressPoolPrefix value.
     */
    List<String> userEquipmentAddressPoolPrefix();

    /**
     * Gets the userEquipmentStaticAddressPoolPrefix property: The user equipment address pool prefixes for the attached
     * data network that are statically assigned by the core to UEs when they set up a PDU session. The mapping of
     * static IP to sim is configured in staticIpConfiguration on the sim resource. At least one of
     * userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both are defined then
     * they must be the same size.
     *
     * @return the userEquipmentStaticAddressPoolPrefix value.
     */
    List<String> userEquipmentStaticAddressPoolPrefix();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.mobilenetwork.fluent.models.AttachedDataNetworkInner object.
     *
     * @return the inner object.
     */
    AttachedDataNetworkInner innerModel();

    /** The entirety of the AttachedDataNetwork definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithUserPlaneDataInterface,
            DefinitionStages.WithCreate {
    }
    /** The AttachedDataNetwork definition stages. */
    interface DefinitionStages {
        /** The first stage of the AttachedDataNetwork definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AttachedDataNetwork definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the AttachedDataNetwork definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, packetCoreControlPlaneName, packetCoreDataPlaneName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param packetCoreControlPlaneName The name of the packet core control plane.
             * @param packetCoreDataPlaneName The name of the packet core data plane.
             * @return the next definition stage.
             */
            WithUserPlaneDataInterface withExistingPacketCoreDataPlane(
                String resourceGroupName, String packetCoreControlPlaneName, String packetCoreDataPlaneName);
        }
        /** The stage of the AttachedDataNetwork definition allowing to specify userPlaneDataInterface. */
        interface WithUserPlaneDataInterface {
            /**
             * Specifies the userPlaneDataInterface property: The user plane interface on the data network. In 5G
             * networks this is called as N6 interface whereas in 4G networks this is called as SGi interface..
             *
             * @param userPlaneDataInterface The user plane interface on the data network. In 5G networks this is called
             *     as N6 interface whereas in 4G networks this is called as SGi interface.
             * @return the next definition stage.
             */
            WithCreate withUserPlaneDataInterface(InterfaceProperties userPlaneDataInterface);
        }
        /**
         * The stage of the AttachedDataNetwork definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithNaptConfiguration,
                DefinitionStages.WithUserEquipmentAddressPoolPrefix,
                DefinitionStages.WithUserEquipmentStaticAddressPoolPrefix {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AttachedDataNetwork create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AttachedDataNetwork create(Context context);
        }
        /** The stage of the AttachedDataNetwork definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AttachedDataNetwork definition allowing to specify naptConfiguration. */
        interface WithNaptConfiguration {
            /**
             * Specifies the naptConfiguration property: The Network Address and Port Translation configuration. If not
             * specified the attached data network uses a default NAPT configuration with NAPT enabled..
             *
             * @param naptConfiguration The Network Address and Port Translation configuration. If not specified the
             *     attached data network uses a default NAPT configuration with NAPT enabled.
             * @return the next definition stage.
             */
            WithCreate withNaptConfiguration(NaptConfiguration naptConfiguration);
        }
        /** The stage of the AttachedDataNetwork definition allowing to specify userEquipmentAddressPoolPrefix. */
        interface WithUserEquipmentAddressPoolPrefix {
            /**
             * Specifies the userEquipmentAddressPoolPrefix property: The user equipment address pool prefixes for the
             * attached data network that are dynamically assigned by the core to UEs when they set up a PDU session. At
             * least one of userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If
             * both are defined then they must be the same size..
             *
             * @param userEquipmentAddressPoolPrefix The user equipment address pool prefixes for the attached data
             *     network that are dynamically assigned by the core to UEs when they set up a PDU session. At least one
             *     of userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both
             *     are defined then they must be the same size.
             * @return the next definition stage.
             */
            WithCreate withUserEquipmentAddressPoolPrefix(List<String> userEquipmentAddressPoolPrefix);
        }
        /** The stage of the AttachedDataNetwork definition allowing to specify userEquipmentStaticAddressPoolPrefix. */
        interface WithUserEquipmentStaticAddressPoolPrefix {
            /**
             * Specifies the userEquipmentStaticAddressPoolPrefix property: The user equipment address pool prefixes for
             * the attached data network that are statically assigned by the core to UEs when they set up a PDU session.
             * The mapping of static IP to sim is configured in staticIpConfiguration on the sim resource. At least one
             * of userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both are
             * defined then they must be the same size..
             *
             * @param userEquipmentStaticAddressPoolPrefix The user equipment address pool prefixes for the attached
             *     data network that are statically assigned by the core to UEs when they set up a PDU session. The
             *     mapping of static IP to sim is configured in staticIpConfiguration on the sim resource. At least one
             *     of userEquipmentAddressPoolPrefix and userEquipmentStaticAddressPoolPrefix must be defined. If both
             *     are defined then they must be the same size.
             * @return the next definition stage.
             */
            WithCreate withUserEquipmentStaticAddressPoolPrefix(List<String> userEquipmentStaticAddressPoolPrefix);
        }
    }
    /**
     * Begins update for the AttachedDataNetwork resource.
     *
     * @return the stage of resource update.
     */
    AttachedDataNetwork.Update update();

    /** The template for AttachedDataNetwork update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AttachedDataNetwork apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AttachedDataNetwork apply(Context context);
    }
    /** The AttachedDataNetwork update stages. */
    interface UpdateStages {
        /** The stage of the AttachedDataNetwork update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AttachedDataNetwork refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AttachedDataNetwork refresh(Context context);
}
