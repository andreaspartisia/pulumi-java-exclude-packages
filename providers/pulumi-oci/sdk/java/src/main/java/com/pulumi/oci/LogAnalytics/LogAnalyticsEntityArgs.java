// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LogAnalytics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogAnalyticsEntityArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogAnalyticsEntityArgs Empty = new LogAnalyticsEntityArgs();

    /**
     * The OCID of the Cloud resource which this entity is a representation of. This may be blank when the entity represents a non-cloud resource that the customer may have on their premises.
     * 
     */
    @Import(name="cloudResourceId")
    private @Nullable Output<String> cloudResourceId;

    /**
     * @return The OCID of the Cloud resource which this entity is a representation of. This may be blank when the entity represents a non-cloud resource that the customer may have on their premises.
     * 
     */
    public Optional<Output<String>> cloudResourceId() {
        return Optional.ofNullable(this.cloudResourceId);
    }

    /**
     * (Updatable) Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
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
     * Log analytics entity type name.
     * 
     */
    @Import(name="entityTypeName", required=true)
    private Output<String> entityTypeName;

    /**
     * @return Log analytics entity type name.
     * 
     */
    public Output<String> entityTypeName() {
        return this.entityTypeName;
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
     * (Updatable) The hostname where the entity represented here is actually present. This would be the output one would get if they run `echo $HOSTNAME` on Linux or an equivalent OS command. This may be different from management agents host since logs may be collected remotely.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return (Updatable) The hostname where the entity represented here is actually present. This would be the output one would get if they run `echo $HOSTNAME` on Linux or an equivalent OS command. This may be different from management agents host since logs may be collected remotely.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * (Updatable) The OCID of the Management Agent.
     * 
     */
    @Import(name="managementAgentId")
    private @Nullable Output<String> managementAgentId;

    /**
     * @return (Updatable) The OCID of the Management Agent.
     * 
     */
    public Optional<Output<String>> managementAgentId() {
        return Optional.ofNullable(this.managementAgentId);
    }

    /**
     * (Updatable) Log analytics entity name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Updatable) Log analytics entity name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Logging Analytics namespace used for the request.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return The Logging Analytics namespace used for the request.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * (Updatable) The name/value pairs for parameter values to be used in file patterns specified in log sources.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,Object>> properties;

    /**
     * @return (Updatable) The name/value pairs for parameter values to be used in file patterns specified in log sources.
     * 
     */
    public Optional<Output<Map<String,Object>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * This indicates the type of source. It is primarily for Enterprise Manager Repository ID.
     * 
     */
    @Import(name="sourceId")
    private @Nullable Output<String> sourceId;

    /**
     * @return This indicates the type of source. It is primarily for Enterprise Manager Repository ID.
     * 
     */
    public Optional<Output<String>> sourceId() {
        return Optional.ofNullable(this.sourceId);
    }

    /**
     * (Updatable) The timezone region of the log analytics entity.
     * 
     */
    @Import(name="timezoneRegion")
    private @Nullable Output<String> timezoneRegion;

    /**
     * @return (Updatable) The timezone region of the log analytics entity.
     * 
     */
    public Optional<Output<String>> timezoneRegion() {
        return Optional.ofNullable(this.timezoneRegion);
    }

    private LogAnalyticsEntityArgs() {}

    private LogAnalyticsEntityArgs(LogAnalyticsEntityArgs $) {
        this.cloudResourceId = $.cloudResourceId;
        this.compartmentId = $.compartmentId;
        this.definedTags = $.definedTags;
        this.entityTypeName = $.entityTypeName;
        this.freeformTags = $.freeformTags;
        this.hostname = $.hostname;
        this.managementAgentId = $.managementAgentId;
        this.name = $.name;
        this.namespace = $.namespace;
        this.properties = $.properties;
        this.sourceId = $.sourceId;
        this.timezoneRegion = $.timezoneRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogAnalyticsEntityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogAnalyticsEntityArgs $;

        public Builder() {
            $ = new LogAnalyticsEntityArgs();
        }

        public Builder(LogAnalyticsEntityArgs defaults) {
            $ = new LogAnalyticsEntityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudResourceId The OCID of the Cloud resource which this entity is a representation of. This may be blank when the entity represents a non-cloud resource that the customer may have on their premises.
         * 
         * @return builder
         * 
         */
        public Builder cloudResourceId(@Nullable Output<String> cloudResourceId) {
            $.cloudResourceId = cloudResourceId;
            return this;
        }

        /**
         * @param cloudResourceId The OCID of the Cloud resource which this entity is a representation of. This may be blank when the entity represents a non-cloud resource that the customer may have on their premises.
         * 
         * @return builder
         * 
         */
        public Builder cloudResourceId(String cloudResourceId) {
            return cloudResourceId(Output.of(cloudResourceId));
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
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
         * @param entityTypeName Log analytics entity type name.
         * 
         * @return builder
         * 
         */
        public Builder entityTypeName(Output<String> entityTypeName) {
            $.entityTypeName = entityTypeName;
            return this;
        }

        /**
         * @param entityTypeName Log analytics entity type name.
         * 
         * @return builder
         * 
         */
        public Builder entityTypeName(String entityTypeName) {
            return entityTypeName(Output.of(entityTypeName));
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
         * @param hostname (Updatable) The hostname where the entity represented here is actually present. This would be the output one would get if they run `echo $HOSTNAME` on Linux or an equivalent OS command. This may be different from management agents host since logs may be collected remotely.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname (Updatable) The hostname where the entity represented here is actually present. This would be the output one would get if they run `echo $HOSTNAME` on Linux or an equivalent OS command. This may be different from management agents host since logs may be collected remotely.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param managementAgentId (Updatable) The OCID of the Management Agent.
         * 
         * @return builder
         * 
         */
        public Builder managementAgentId(@Nullable Output<String> managementAgentId) {
            $.managementAgentId = managementAgentId;
            return this;
        }

        /**
         * @param managementAgentId (Updatable) The OCID of the Management Agent.
         * 
         * @return builder
         * 
         */
        public Builder managementAgentId(String managementAgentId) {
            return managementAgentId(Output.of(managementAgentId));
        }

        /**
         * @param name (Updatable) Log analytics entity name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Updatable) Log analytics entity name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param namespace The Logging Analytics namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace The Logging Analytics namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param properties (Updatable) The name/value pairs for parameter values to be used in file patterns specified in log sources.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties (Updatable) The name/value pairs for parameter values to be used in file patterns specified in log sources.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,Object> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param sourceId This indicates the type of source. It is primarily for Enterprise Manager Repository ID.
         * 
         * @return builder
         * 
         */
        public Builder sourceId(@Nullable Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        /**
         * @param sourceId This indicates the type of source. It is primarily for Enterprise Manager Repository ID.
         * 
         * @return builder
         * 
         */
        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        /**
         * @param timezoneRegion (Updatable) The timezone region of the log analytics entity.
         * 
         * @return builder
         * 
         */
        public Builder timezoneRegion(@Nullable Output<String> timezoneRegion) {
            $.timezoneRegion = timezoneRegion;
            return this;
        }

        /**
         * @param timezoneRegion (Updatable) The timezone region of the log analytics entity.
         * 
         * @return builder
         * 
         */
        public Builder timezoneRegion(String timezoneRegion) {
            return timezoneRegion(Output.of(timezoneRegion));
        }

        public LogAnalyticsEntityArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.entityTypeName = Objects.requireNonNull($.entityTypeName, "expected parameter 'entityTypeName' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
