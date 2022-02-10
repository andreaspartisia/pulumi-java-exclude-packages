// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance;

import io.pulumi.azurenative.maintenance.enums.MaintenanceScope;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceConfigurationArgs Empty = new MaintenanceConfigurationArgs();

    @InputImport(name="extensionProperties")
    private final @Nullable Input<Map<String,String>> extensionProperties;

    public Input<Map<String,String>> getExtensionProperties() {
        return this.extensionProperties == null ? Input.empty() : this.extensionProperties;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="maintenanceScope")
    private final @Nullable Input<Either<String,MaintenanceScope>> maintenanceScope;

    public Input<Either<String,MaintenanceScope>> getMaintenanceScope() {
        return this.maintenanceScope == null ? Input.empty() : this.maintenanceScope;
    }

    @InputImport(name="namespace")
    private final @Nullable Input<String> namespace;

    public Input<String> getNamespace() {
        return this.namespace == null ? Input.empty() : this.namespace;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="resourceName")
    private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public MaintenanceConfigurationArgs(
        @Nullable Input<Map<String,String>> extensionProperties,
        @Nullable Input<String> location,
        @Nullable Input<Either<String,MaintenanceScope>> maintenanceScope,
        @Nullable Input<String> namespace,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<Map<String,String>> tags) {
        this.extensionProperties = extensionProperties;
        this.location = location;
        this.maintenanceScope = maintenanceScope;
        this.namespace = namespace;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.tags = tags;
    }

    private MaintenanceConfigurationArgs() {
        this.extensionProperties = Input.empty();
        this.location = Input.empty();
        this.maintenanceScope = Input.empty();
        this.namespace = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> extensionProperties;
        private @Nullable Input<String> location;
        private @Nullable Input<Either<String,MaintenanceScope>> maintenanceScope;
        private @Nullable Input<String> namespace;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensionProperties = defaults.extensionProperties;
    	      this.location = defaults.location;
    	      this.maintenanceScope = defaults.maintenanceScope;
    	      this.namespace = defaults.namespace;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.tags = defaults.tags;
        }

        public Builder setExtensionProperties(@Nullable Input<Map<String,String>> extensionProperties) {
            this.extensionProperties = extensionProperties;
            return this;
        }

        public Builder setExtensionProperties(@Nullable Map<String,String> extensionProperties) {
            this.extensionProperties = Input.ofNullable(extensionProperties);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMaintenanceScope(@Nullable Input<Either<String,MaintenanceScope>> maintenanceScope) {
            this.maintenanceScope = maintenanceScope;
            return this;
        }

        public Builder setMaintenanceScope(@Nullable Either<String,MaintenanceScope> maintenanceScope) {
            this.maintenanceScope = Input.ofNullable(maintenanceScope);
            return this;
        }

        public Builder setNamespace(@Nullable Input<String> namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = Input.ofNullable(namespace);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public MaintenanceConfigurationArgs build() {
            return new MaintenanceConfigurationArgs(extensionProperties, location, maintenanceScope, namespace, resourceGroupName, resourceName, tags);
        }
    }
}