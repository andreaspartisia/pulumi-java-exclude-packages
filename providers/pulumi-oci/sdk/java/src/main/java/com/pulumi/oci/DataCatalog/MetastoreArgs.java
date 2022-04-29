// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetastoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreArgs Empty = new MetastoreArgs();

    /**
     * (Updatable) OCID of the compartment which holds the metastore.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return (Updatable) OCID of the compartment which holds the metastore.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * Location under which external tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     * 
     */
    @Import(name="defaultExternalTableLocation", required=true)
    private Output<String> defaultExternalTableLocation;

    /**
     * @return Location under which external tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     * 
     */
    public Output<String> defaultExternalTableLocation() {
        return this.defaultExternalTableLocation;
    }

    /**
     * Location under which managed tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     * 
     */
    @Import(name="defaultManagedTableLocation", required=true)
    private Output<String> defaultManagedTableLocation;

    /**
     * @return Location under which managed tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
     * 
     */
    public Output<String> defaultManagedTableLocation() {
        return this.defaultManagedTableLocation;
    }

    /**
     * (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) Mutable name of the metastore.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) Mutable name of the metastore.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
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

    private MetastoreArgs() {}

    private MetastoreArgs(MetastoreArgs $) {
        this.compartmentId = $.compartmentId;
        this.defaultExternalTableLocation = $.defaultExternalTableLocation;
        this.defaultManagedTableLocation = $.defaultManagedTableLocation;
        this.definedTags = $.definedTags;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreArgs $;

        public Builder() {
            $ = new MetastoreArgs();
        }

        public Builder(MetastoreArgs defaults) {
            $ = new MetastoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) OCID of the compartment which holds the metastore.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) OCID of the compartment which holds the metastore.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param defaultExternalTableLocation Location under which external tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
         * 
         * @return builder
         * 
         */
        public Builder defaultExternalTableLocation(Output<String> defaultExternalTableLocation) {
            $.defaultExternalTableLocation = defaultExternalTableLocation;
            return this;
        }

        /**
         * @param defaultExternalTableLocation Location under which external tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
         * 
         * @return builder
         * 
         */
        public Builder defaultExternalTableLocation(String defaultExternalTableLocation) {
            return defaultExternalTableLocation(Output.of(defaultExternalTableLocation));
        }

        /**
         * @param defaultManagedTableLocation Location under which managed tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
         * 
         * @return builder
         * 
         */
        public Builder defaultManagedTableLocation(Output<String> defaultManagedTableLocation) {
            $.defaultManagedTableLocation = defaultManagedTableLocation;
            return this;
        }

        /**
         * @param defaultManagedTableLocation Location under which managed tables will be created by default. This references Object Storage using an HDFS URI format. Example: oci://bucket@namespace/sub-dir/
         * 
         * @return builder
         * 
         */
        public Builder defaultManagedTableLocation(String defaultManagedTableLocation) {
            return defaultManagedTableLocation(Output.of(defaultManagedTableLocation));
        }

        /**
         * @param definedTags (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param displayName (Updatable) Mutable name of the metastore.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) Mutable name of the metastore.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
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

        public MetastoreArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.defaultExternalTableLocation = Objects.requireNonNull($.defaultExternalTableLocation, "expected parameter 'defaultExternalTableLocation' to be non-null");
            $.defaultManagedTableLocation = Objects.requireNonNull($.defaultManagedTableLocation, "expected parameter 'defaultManagedTableLocation' to be non-null");
            return $;
        }
    }

}
