// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.HealthChecks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PingMonitorState extends com.pulumi.resources.ResourceArgs {

    public static final PingMonitorState Empty = new PingMonitorState();

    /**
     * (Updatable) The OCID of the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) A user-friendly and mutable name suitable for display in a user interface.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly and mutable name suitable for display in a user interface.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.  For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.  For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * The region where updates must be made and where results must be fetched from.
     * 
     */
    @Import(name="homeRegion")
    private @Nullable Output<String> homeRegion;

    /**
     * @return The region where updates must be made and where results must be fetched from.
     * 
     */
    public Optional<Output<String>> homeRegion() {
        return Optional.ofNullable(this.homeRegion);
    }

    /**
     * (Updatable) The monitor interval in seconds. Valid values: 10, 30, and 60.
     * 
     */
    @Import(name="intervalInSeconds")
    private @Nullable Output<Integer> intervalInSeconds;

    /**
     * @return (Updatable) The monitor interval in seconds. Valid values: 10, 30, and 60.
     * 
     */
    public Optional<Output<Integer>> intervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }

    /**
     * (Updatable) Enables or disables the monitor. Set to &#39;true&#39; to launch monitoring.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return (Updatable) Enables or disables the monitor. Set to &#39;true&#39; to launch monitoring.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * (Updatable) The port on which to probe endpoints. If unspecified, probes will use the default port of their protocol.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return (Updatable) The port on which to probe endpoints. If unspecified, probes will use the default port of their protocol.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * (Updatable) The protocols for ping probes.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return (Updatable) The protocols for ping probes.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * A URL for fetching the probe results.
     * 
     */
    @Import(name="resultsUrl")
    private @Nullable Output<String> resultsUrl;

    /**
     * @return A URL for fetching the probe results.
     * 
     */
    public Optional<Output<String>> resultsUrl() {
        return Optional.ofNullable(this.resultsUrl);
    }

    /**
     * (Updatable) A list of targets (hostnames or IP addresses) of the probe.
     * 
     */
    @Import(name="targets")
    private @Nullable Output<List<String>> targets;

    /**
     * @return (Updatable) A list of targets (hostnames or IP addresses) of the probe.
     * 
     */
    public Optional<Output<List<String>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    /**
     * The RFC 3339-formatted creation date and time of the probe.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The RFC 3339-formatted creation date and time of the probe.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * (Updatable) The probe timeout in seconds. Valid values: 10, 20, 30, and 60. The probe timeout must be less than or equal to `intervalInSeconds` for monitors.
     * 
     */
    @Import(name="timeoutInSeconds")
    private @Nullable Output<Integer> timeoutInSeconds;

    /**
     * @return (Updatable) The probe timeout in seconds. Valid values: 10, 20, 30, and 60. The probe timeout must be less than or equal to `intervalInSeconds` for monitors.
     * 
     */
    public Optional<Output<Integer>> timeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }

    /**
     * (Updatable) A list of names of vantage points from which to execute the probe.
     * 
     */
    @Import(name="vantagePointNames")
    private @Nullable Output<List<String>> vantagePointNames;

    /**
     * @return (Updatable) A list of names of vantage points from which to execute the probe.
     * 
     */
    public Optional<Output<List<String>>> vantagePointNames() {
        return Optional.ofNullable(this.vantagePointNames);
    }

    private PingMonitorState() {}

    private PingMonitorState(PingMonitorState $) {
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.homeRegion = $.homeRegion;
        this.intervalInSeconds = $.intervalInSeconds;
        this.isEnabled = $.isEnabled;
        this.port = $.port;
        this.protocol = $.protocol;
        this.resultsUrl = $.resultsUrl;
        this.targets = $.targets;
        this.timeCreated = $.timeCreated;
        this.timeoutInSeconds = $.timeoutInSeconds;
        this.vantagePointNames = $.vantagePointNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PingMonitorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PingMonitorState $;

        public Builder() {
            $ = new PingMonitorState();
        }

        public Builder(PingMonitorState defaults) {
            $ = new PingMonitorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param displayName (Updatable) A user-friendly and mutable name suitable for display in a user interface.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-friendly and mutable name suitable for display in a user interface.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.  For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.  For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param homeRegion The region where updates must be made and where results must be fetched from.
         * 
         * @return builder
         * 
         */
        public Builder homeRegion(@Nullable Output<String> homeRegion) {
            $.homeRegion = homeRegion;
            return this;
        }

        /**
         * @param homeRegion The region where updates must be made and where results must be fetched from.
         * 
         * @return builder
         * 
         */
        public Builder homeRegion(String homeRegion) {
            return homeRegion(Output.of(homeRegion));
        }

        /**
         * @param intervalInSeconds (Updatable) The monitor interval in seconds. Valid values: 10, 30, and 60.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(@Nullable Output<Integer> intervalInSeconds) {
            $.intervalInSeconds = intervalInSeconds;
            return this;
        }

        /**
         * @param intervalInSeconds (Updatable) The monitor interval in seconds. Valid values: 10, 30, and 60.
         * 
         * @return builder
         * 
         */
        public Builder intervalInSeconds(Integer intervalInSeconds) {
            return intervalInSeconds(Output.of(intervalInSeconds));
        }

        /**
         * @param isEnabled (Updatable) Enables or disables the monitor. Set to &#39;true&#39; to launch monitoring.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled (Updatable) Enables or disables the monitor. Set to &#39;true&#39; to launch monitoring.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param port (Updatable) The port on which to probe endpoints. If unspecified, probes will use the default port of their protocol.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port (Updatable) The port on which to probe endpoints. If unspecified, probes will use the default port of their protocol.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol (Updatable) The protocols for ping probes.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol (Updatable) The protocols for ping probes.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param resultsUrl A URL for fetching the probe results.
         * 
         * @return builder
         * 
         */
        public Builder resultsUrl(@Nullable Output<String> resultsUrl) {
            $.resultsUrl = resultsUrl;
            return this;
        }

        /**
         * @param resultsUrl A URL for fetching the probe results.
         * 
         * @return builder
         * 
         */
        public Builder resultsUrl(String resultsUrl) {
            return resultsUrl(Output.of(resultsUrl));
        }

        /**
         * @param targets (Updatable) A list of targets (hostnames or IP addresses) of the probe.
         * 
         * @return builder
         * 
         */
        public Builder targets(@Nullable Output<List<String>> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @param targets (Updatable) A list of targets (hostnames or IP addresses) of the probe.
         * 
         * @return builder
         * 
         */
        public Builder targets(List<String> targets) {
            return targets(Output.of(targets));
        }

        /**
         * @param targets (Updatable) A list of targets (hostnames or IP addresses) of the probe.
         * 
         * @return builder
         * 
         */
        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }

        /**
         * @param timeCreated The RFC 3339-formatted creation date and time of the probe.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The RFC 3339-formatted creation date and time of the probe.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeoutInSeconds (Updatable) The probe timeout in seconds. Valid values: 10, 20, 30, and 60. The probe timeout must be less than or equal to `intervalInSeconds` for monitors.
         * 
         * @return builder
         * 
         */
        public Builder timeoutInSeconds(@Nullable Output<Integer> timeoutInSeconds) {
            $.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        /**
         * @param timeoutInSeconds (Updatable) The probe timeout in seconds. Valid values: 10, 20, 30, and 60. The probe timeout must be less than or equal to `intervalInSeconds` for monitors.
         * 
         * @return builder
         * 
         */
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            return timeoutInSeconds(Output.of(timeoutInSeconds));
        }

        /**
         * @param vantagePointNames (Updatable) A list of names of vantage points from which to execute the probe.
         * 
         * @return builder
         * 
         */
        public Builder vantagePointNames(@Nullable Output<List<String>> vantagePointNames) {
            $.vantagePointNames = vantagePointNames;
            return this;
        }

        /**
         * @param vantagePointNames (Updatable) A list of names of vantage points from which to execute the probe.
         * 
         * @return builder
         * 
         */
        public Builder vantagePointNames(List<String> vantagePointNames) {
            return vantagePointNames(Output.of(vantagePointNames));
        }

        /**
         * @param vantagePointNames (Updatable) A list of names of vantage points from which to execute the probe.
         * 
         * @return builder
         * 
         */
        public Builder vantagePointNames(String... vantagePointNames) {
            return vantagePointNames(List.of(vantagePointNames));
        }

        public PingMonitorState build() {
            return $;
        }
    }

}
