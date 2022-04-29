// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.StackMonitoring;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.StackMonitoring.inputs.DiscoveryJobDiscoveryDetailsArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiscoveryJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiscoveryJobArgs Empty = new DiscoveryJobArgs();

    /**
     * The OCID of Compartment
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The OCID of Compartment
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * Client who submits discovery job.
     * 
     */
    @Import(name="discoveryClient")
    private @Nullable Output<String> discoveryClient;

    /**
     * @return Client who submits discovery job.
     * 
     */
    public Optional<Output<String>> discoveryClient() {
        return Optional.ofNullable(this.discoveryClient);
    }

    /**
     * The request of DiscoveryJob Resource details.
     * 
     */
    @Import(name="discoveryDetails", required=true)
    private Output<DiscoveryJobDiscoveryDetailsArgs> discoveryDetails;

    /**
     * @return The request of DiscoveryJob Resource details.
     * 
     */
    public Output<DiscoveryJobDiscoveryDetailsArgs> discoveryDetails() {
        return this.discoveryDetails;
    }

    /**
     * Add option submits new discovery Job. Add with retry option to re-submit failed discovery job. Refresh option refreshes the existing discovered resources.
     * 
     */
    @Import(name="discoveryType")
    private @Nullable Output<String> discoveryType;

    /**
     * @return Add option submits new discovery Job. Add with retry option to re-submit failed discovery job. Refresh option refreshes the existing discovered resources.
     * 
     */
    public Optional<Output<String>> discoveryType() {
        return Optional.ofNullable(this.discoveryType);
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    private DiscoveryJobArgs() {}

    private DiscoveryJobArgs(DiscoveryJobArgs $) {
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.discoveryClient = $.discoveryClient;
        this.discoveryDetails = $.discoveryDetails;
        this.discoveryType = $.discoveryType;
        this.freeformTags = $.freeformTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiscoveryJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiscoveryJobArgs $;

        public Builder() {
            $ = new DiscoveryJobArgs();
        }

        public Builder(DiscoveryJobArgs defaults) {
            $ = new DiscoveryJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of Compartment
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of Compartment
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param definedTags Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param discoveryClient Client who submits discovery job.
         * 
         * @return builder
         * 
         */
        public Builder discoveryClient(@Nullable Output<String> discoveryClient) {
            $.discoveryClient = discoveryClient;
            return this;
        }

        /**
         * @param discoveryClient Client who submits discovery job.
         * 
         * @return builder
         * 
         */
        public Builder discoveryClient(String discoveryClient) {
            return discoveryClient(Output.of(discoveryClient));
        }

        /**
         * @param discoveryDetails The request of DiscoveryJob Resource details.
         * 
         * @return builder
         * 
         */
        public Builder discoveryDetails(Output<DiscoveryJobDiscoveryDetailsArgs> discoveryDetails) {
            $.discoveryDetails = discoveryDetails;
            return this;
        }

        /**
         * @param discoveryDetails The request of DiscoveryJob Resource details.
         * 
         * @return builder
         * 
         */
        public Builder discoveryDetails(DiscoveryJobDiscoveryDetailsArgs discoveryDetails) {
            return discoveryDetails(Output.of(discoveryDetails));
        }

        /**
         * @param discoveryType Add option submits new discovery Job. Add with retry option to re-submit failed discovery job. Refresh option refreshes the existing discovered resources.
         * 
         * @return builder
         * 
         */
        public Builder discoveryType(@Nullable Output<String> discoveryType) {
            $.discoveryType = discoveryType;
            return this;
        }

        /**
         * @param discoveryType Add option submits new discovery Job. Add with retry option to re-submit failed discovery job. Refresh option refreshes the existing discovered resources.
         * 
         * @return builder
         * 
         */
        public Builder discoveryType(String discoveryType) {
            return discoveryType(Output.of(discoveryType));
        }

        /**
         * @param freeformTags Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        public DiscoveryJobArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.discoveryDetails = Objects.requireNonNull($.discoveryDetails, "expected parameter 'discoveryDetails' to be non-null");
            return $;
        }
    }

}
