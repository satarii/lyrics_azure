/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WebApplicationFirewallOperator.
 */
public final class WebApplicationFirewallOperator extends ExpandableStringEnum<WebApplicationFirewallOperator> {
    /** Static value IPMatch for WebApplicationFirewallOperator. */
    public static final WebApplicationFirewallOperator IPMATCH = fromString("IPMatch");

    /** Static value Equal for WebApplicationFirewallOperator. */
    public static final WebApplicationFirewallOperator EQUAL = fromString("Equal");

    /** Static value Contains for WebApplicationFirewallOperator. */
    public static final WebApplicationFirewallOperator CONTAINS = fromString("Contains");

    /** Static value LessThan for WebApplicationFirewallOperator. */
    public static final WebApplicationFirewallOperator LESS_THAN = fromString("LessThan");

    /** Static value GreaterThan for WebApplicationFirewallOperator. */
    public static final WebApplicationFirewallOperator GREATER_THAN = fromString("GreaterThan");

    /** Static value LessThanOrEqual for WebApplicationFirewallOperator. */
    public static final WebApplicationFirewallOperator LESS_THAN_OR_EQUAL = fromString("LessThanOrEqual");

    /** Static value GreaterThanOrEqual for WebApplicationFirewallOperator. */
    public static final WebApplicationFirewallOperator GREATER_THAN_OR_EQUAL = fromString("GreaterThanOrEqual");

    /** Static value BeginsWith for WebApplicationFirewallOperator. */
    public static final WebApplicationFirewallOperator BEGINS_WITH = fromString("BeginsWith");

    /** Static value EndsWith for WebApplicationFirewallOperator. */
    public static final WebApplicationFirewallOperator ENDS_WITH = fromString("EndsWith");

    /** Static value Regex for WebApplicationFirewallOperator. */
    public static final WebApplicationFirewallOperator REGEX = fromString("Regex");

    /**
     * Creates or finds a WebApplicationFirewallOperator from its string representation.
     * @param name a name to look for
     * @return the corresponding WebApplicationFirewallOperator
     */
    @JsonCreator
    public static WebApplicationFirewallOperator fromString(String name) {
        return fromString(name, WebApplicationFirewallOperator.class);
    }

    /**
     * @return known WebApplicationFirewallOperator values
     */
    public static Collection<WebApplicationFirewallOperator> values() {
        return values(WebApplicationFirewallOperator.class);
    }
}
