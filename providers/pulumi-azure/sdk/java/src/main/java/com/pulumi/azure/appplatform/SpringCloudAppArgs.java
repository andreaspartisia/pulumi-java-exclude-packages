// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appplatform;

import com.pulumi.azure.appplatform.inputs.SpringCloudAppCustomPersistentDiskArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudAppIdentityArgs;
import com.pulumi.azure.appplatform.inputs.SpringCloudAppPersistentDiskArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpringCloudAppArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpringCloudAppArgs Empty = new SpringCloudAppArgs();

    /**
     * A `custom_persistent_disk` block as defined below.
     * 
     */
    @Import(name="customPersistentDisks")
    private @Nullable Output<List<SpringCloudAppCustomPersistentDiskArgs>> customPersistentDisks;

    /**
     * @return A `custom_persistent_disk` block as defined below.
     * 
     */
    public Optional<Output<List<SpringCloudAppCustomPersistentDiskArgs>>> customPersistentDisks() {
        return Optional.ofNullable(this.customPersistentDisks);
    }

    /**
     * Is only HTTPS allowed? Defaults to `false`.
     * 
     */
    @Import(name="httpsOnly")
    private @Nullable Output<Boolean> httpsOnly;

    /**
     * @return Is only HTTPS allowed? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<SpringCloudAppIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<SpringCloudAppIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Does the Spring Cloud Application have public endpoint? Defaults to `false`.
     * 
     */
    @Import(name="isPublic")
    private @Nullable Output<Boolean> isPublic;

    /**
     * @return Does the Spring Cloud Application have public endpoint? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> isPublic() {
        return Optional.ofNullable(this.isPublic);
    }

    /**
     * Specifies the name of the Spring Cloud Application. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Spring Cloud Application. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An `persistent_disk` block as defined below.
     * 
     */
    @Import(name="persistentDisk")
    private @Nullable Output<SpringCloudAppPersistentDiskArgs> persistentDisk;

    /**
     * @return An `persistent_disk` block as defined below.
     * 
     */
    public Optional<Output<SpringCloudAppPersistentDiskArgs>> persistentDisk() {
        return Optional.ofNullable(this.persistentDisk);
    }

    /**
     * Specifies the name of the resource group in which to create the Spring Cloud Application. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the resource group in which to create the Spring Cloud Application. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the name of the Spring Cloud Service resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return Specifies the name of the Spring Cloud Service resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Is End to End TLS Enabled? Defaults to `false`.
     * 
     */
    @Import(name="tlsEnabled")
    private @Nullable Output<Boolean> tlsEnabled;

    /**
     * @return Is End to End TLS Enabled? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> tlsEnabled() {
        return Optional.ofNullable(this.tlsEnabled);
    }

    private SpringCloudAppArgs() {}

    private SpringCloudAppArgs(SpringCloudAppArgs $) {
        this.customPersistentDisks = $.customPersistentDisks;
        this.httpsOnly = $.httpsOnly;
        this.identity = $.identity;
        this.isPublic = $.isPublic;
        this.name = $.name;
        this.persistentDisk = $.persistentDisk;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.tlsEnabled = $.tlsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpringCloudAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpringCloudAppArgs $;

        public Builder() {
            $ = new SpringCloudAppArgs();
        }

        public Builder(SpringCloudAppArgs defaults) {
            $ = new SpringCloudAppArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customPersistentDisks A `custom_persistent_disk` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customPersistentDisks(@Nullable Output<List<SpringCloudAppCustomPersistentDiskArgs>> customPersistentDisks) {
            $.customPersistentDisks = customPersistentDisks;
            return this;
        }

        /**
         * @param customPersistentDisks A `custom_persistent_disk` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customPersistentDisks(List<SpringCloudAppCustomPersistentDiskArgs> customPersistentDisks) {
            return customPersistentDisks(Output.of(customPersistentDisks));
        }

        /**
         * @param customPersistentDisks A `custom_persistent_disk` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder customPersistentDisks(SpringCloudAppCustomPersistentDiskArgs... customPersistentDisks) {
            return customPersistentDisks(List.of(customPersistentDisks));
        }

        /**
         * @param httpsOnly Is only HTTPS allowed? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            $.httpsOnly = httpsOnly;
            return this;
        }

        /**
         * @param httpsOnly Is only HTTPS allowed? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(Boolean httpsOnly) {
            return httpsOnly(Output.of(httpsOnly));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<SpringCloudAppIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(SpringCloudAppIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param isPublic Does the Spring Cloud Application have public endpoint? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isPublic(@Nullable Output<Boolean> isPublic) {
            $.isPublic = isPublic;
            return this;
        }

        /**
         * @param isPublic Does the Spring Cloud Application have public endpoint? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isPublic(Boolean isPublic) {
            return isPublic(Output.of(isPublic));
        }

        /**
         * @param name Specifies the name of the Spring Cloud Application. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Spring Cloud Application. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param persistentDisk An `persistent_disk` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder persistentDisk(@Nullable Output<SpringCloudAppPersistentDiskArgs> persistentDisk) {
            $.persistentDisk = persistentDisk;
            return this;
        }

        /**
         * @param persistentDisk An `persistent_disk` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder persistentDisk(SpringCloudAppPersistentDiskArgs persistentDisk) {
            return persistentDisk(Output.of(persistentDisk));
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group in which to create the Spring Cloud Application. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group in which to create the Spring Cloud Application. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName Specifies the name of the Spring Cloud Service resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Specifies the name of the Spring Cloud Service resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param tlsEnabled Is End to End TLS Enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsEnabled(@Nullable Output<Boolean> tlsEnabled) {
            $.tlsEnabled = tlsEnabled;
            return this;
        }

        /**
         * @param tlsEnabled Is End to End TLS Enabled? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder tlsEnabled(Boolean tlsEnabled) {
            return tlsEnabled(Output.of(tlsEnabled));
        }

        public SpringCloudAppArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
