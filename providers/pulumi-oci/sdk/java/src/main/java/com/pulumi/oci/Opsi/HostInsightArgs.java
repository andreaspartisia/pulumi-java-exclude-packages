// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostInsightArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostInsightArgs Empty = new HostInsightArgs();

    /**
     * (Updatable) Compartment Identifier of host
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment Identifier of host
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * OPSI Enterprise Manager Bridge OCID
     * 
     */
    @Import(name="enterpriseManagerBridgeId")
    private @Nullable Output<String> enterpriseManagerBridgeId;

    /**
     * @return OPSI Enterprise Manager Bridge OCID
     * 
     */
    public Optional<Output<String>> enterpriseManagerBridgeId() {
        return Optional.ofNullable(this.enterpriseManagerBridgeId);
    }

    /**
     * Enterprise Manager Entity Unique Identifier
     * 
     */
    @Import(name="enterpriseManagerEntityIdentifier")
    private @Nullable Output<String> enterpriseManagerEntityIdentifier;

    /**
     * @return Enterprise Manager Entity Unique Identifier
     * 
     */
    public Optional<Output<String>> enterpriseManagerEntityIdentifier() {
        return Optional.ofNullable(this.enterpriseManagerEntityIdentifier);
    }

    /**
     * Enterprise Manager Unique Identifier
     * 
     */
    @Import(name="enterpriseManagerIdentifier")
    private @Nullable Output<String> enterpriseManagerIdentifier;

    /**
     * @return Enterprise Manager Unique Identifier
     * 
     */
    public Optional<Output<String>> enterpriseManagerIdentifier() {
        return Optional.ofNullable(this.enterpriseManagerIdentifier);
    }

    /**
     * (Updatable) Source of the host entity.
     * 
     */
    @Import(name="entitySource", required=true)
    private Output<String> entitySource;

    /**
     * @return (Updatable) Source of the host entity.
     * 
     */
    public Output<String> entitySource() {
        return this.entitySource;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     * 
     */
    @Import(name="exadataInsightId")
    private @Nullable Output<String> exadataInsightId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     * 
     */
    public Optional<Output<String>> exadataInsightId() {
        return Optional.ofNullable(this.exadataInsightId);
    }

    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Management Agent
     * 
     */
    @Import(name="managementAgentId")
    private @Nullable Output<String> managementAgentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Management Agent
     * 
     */
    public Optional<Output<String>> managementAgentId() {
        return Optional.ofNullable(this.managementAgentId);
    }

    /**
     * (Updatable) Status of the resource. Example: &#34;ENABLED&#34;, &#34;DISABLED&#34;. Resource can be either enabled or disabled by updating the value of status field to either &#34;ENABLED&#34; or &#34;DISABLED&#34;
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return (Updatable) Status of the resource. Example: &#34;ENABLED&#34;, &#34;DISABLED&#34;. Resource can be either enabled or disabled by updating the value of status field to either &#34;ENABLED&#34; or &#34;DISABLED&#34;
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private HostInsightArgs() {}

    private HostInsightArgs(HostInsightArgs $) {
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.enterpriseManagerBridgeId = $.enterpriseManagerBridgeId;
        this.enterpriseManagerEntityIdentifier = $.enterpriseManagerEntityIdentifier;
        this.enterpriseManagerIdentifier = $.enterpriseManagerIdentifier;
        this.entitySource = $.entitySource;
        this.exadataInsightId = $.exadataInsightId;
        this.freeformTags = $.freeformTags;
        this.managementAgentId = $.managementAgentId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostInsightArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostInsightArgs $;

        public Builder() {
            $ = new HostInsightArgs();
        }

        public Builder(HostInsightArgs defaults) {
            $ = new HostInsightArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier of host
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier of host
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param enterpriseManagerBridgeId OPSI Enterprise Manager Bridge OCID
         * 
         * @return builder
         * 
         */
        public Builder enterpriseManagerBridgeId(@Nullable Output<String> enterpriseManagerBridgeId) {
            $.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            return this;
        }

        /**
         * @param enterpriseManagerBridgeId OPSI Enterprise Manager Bridge OCID
         * 
         * @return builder
         * 
         */
        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            return enterpriseManagerBridgeId(Output.of(enterpriseManagerBridgeId));
        }

        /**
         * @param enterpriseManagerEntityIdentifier Enterprise Manager Entity Unique Identifier
         * 
         * @return builder
         * 
         */
        public Builder enterpriseManagerEntityIdentifier(@Nullable Output<String> enterpriseManagerEntityIdentifier) {
            $.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
            return this;
        }

        /**
         * @param enterpriseManagerEntityIdentifier Enterprise Manager Entity Unique Identifier
         * 
         * @return builder
         * 
         */
        public Builder enterpriseManagerEntityIdentifier(String enterpriseManagerEntityIdentifier) {
            return enterpriseManagerEntityIdentifier(Output.of(enterpriseManagerEntityIdentifier));
        }

        /**
         * @param enterpriseManagerIdentifier Enterprise Manager Unique Identifier
         * 
         * @return builder
         * 
         */
        public Builder enterpriseManagerIdentifier(@Nullable Output<String> enterpriseManagerIdentifier) {
            $.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
            return this;
        }

        /**
         * @param enterpriseManagerIdentifier Enterprise Manager Unique Identifier
         * 
         * @return builder
         * 
         */
        public Builder enterpriseManagerIdentifier(String enterpriseManagerIdentifier) {
            return enterpriseManagerIdentifier(Output.of(enterpriseManagerIdentifier));
        }

        /**
         * @param entitySource (Updatable) Source of the host entity.
         * 
         * @return builder
         * 
         */
        public Builder entitySource(Output<String> entitySource) {
            $.entitySource = entitySource;
            return this;
        }

        /**
         * @param entitySource (Updatable) Source of the host entity.
         * 
         * @return builder
         * 
         */
        public Builder entitySource(String entitySource) {
            return entitySource(Output.of(entitySource));
        }

        /**
         * @param exadataInsightId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
         * 
         * @return builder
         * 
         */
        public Builder exadataInsightId(@Nullable Output<String> exadataInsightId) {
            $.exadataInsightId = exadataInsightId;
            return this;
        }

        /**
         * @param exadataInsightId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
         * 
         * @return builder
         * 
         */
        public Builder exadataInsightId(String exadataInsightId) {
            return exadataInsightId(Output.of(exadataInsightId));
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param managementAgentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Management Agent
         * 
         * @return builder
         * 
         */
        public Builder managementAgentId(@Nullable Output<String> managementAgentId) {
            $.managementAgentId = managementAgentId;
            return this;
        }

        /**
         * @param managementAgentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Management Agent
         * 
         * @return builder
         * 
         */
        public Builder managementAgentId(String managementAgentId) {
            return managementAgentId(Output.of(managementAgentId));
        }

        /**
         * @param status (Updatable) Status of the resource. Example: &#34;ENABLED&#34;, &#34;DISABLED&#34;. Resource can be either enabled or disabled by updating the value of status field to either &#34;ENABLED&#34; or &#34;DISABLED&#34;
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status (Updatable) Status of the resource. Example: &#34;ENABLED&#34;, &#34;DISABLED&#34;. Resource can be either enabled or disabled by updating the value of status field to either &#34;ENABLED&#34; or &#34;DISABLED&#34;
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public HostInsightArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.entitySource = Objects.requireNonNull($.entitySource, "expected parameter 'entitySource' to be non-null");
            return $;
        }
    }

}
