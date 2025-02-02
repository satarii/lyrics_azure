/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.BgpSettings;
import com.microsoft.azure.management.network.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * VpnGateway Resource.
 */
@JsonFlatten
@SkipParentValidation
public class VpnGatewayInner extends Resource {
    /**
     * The VirtualHub to which the gateway belongs.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /**
     * List of all vpn connections to the gateway.
     */
    @JsonProperty(value = "properties.connections")
    private List<VpnConnectionInner> connections;

    /**
     * Local network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "properties.bgpSettings")
    private BgpSettings bgpSettings;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * The scale unit for this vpn gateway.
     */
    @JsonProperty(value = "properties.vpnGatewayScaleUnit")
    private Integer vpnGatewayScaleUnit;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the VirtualHub to which the gateway belongs.
     *
     * @return the virtualHub value
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the VirtualHub to which the gateway belongs.
     *
     * @param virtualHub the virtualHub value to set
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get list of all vpn connections to the gateway.
     *
     * @return the connections value
     */
    public List<VpnConnectionInner> connections() {
        return this.connections;
    }

    /**
     * Set list of all vpn connections to the gateway.
     *
     * @param connections the connections value to set
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withConnections(List<VpnConnectionInner> connections) {
        this.connections = connections;
        return this;
    }

    /**
     * Get local network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set local network gateway's BGP speaker settings.
     *
     * @param bgpSettings the bgpSettings value to set
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the scale unit for this vpn gateway.
     *
     * @return the vpnGatewayScaleUnit value
     */
    public Integer vpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }

    /**
     * Set the scale unit for this vpn gateway.
     *
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        return this;
    }

    /**
     * Get gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

}
