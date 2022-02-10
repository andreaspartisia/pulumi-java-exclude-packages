// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions;

import io.pulumi.azurenative.solutions.inputs.ApplicationJitAccessPolicyArgs;
import io.pulumi.azurenative.solutions.inputs.IdentityArgs;
import io.pulumi.azurenative.solutions.inputs.PlanArgs;
import io.pulumi.azurenative.solutions.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    @InputImport(name="applicationDefinitionId")
    private final @Nullable Input<String> applicationDefinitionId;

    public Input<String> getApplicationDefinitionId() {
        return this.applicationDefinitionId == null ? Input.empty() : this.applicationDefinitionId;
    }

    @InputImport(name="applicationName")
    private final @Nullable Input<String> applicationName;

    public Input<String> getApplicationName() {
        return this.applicationName == null ? Input.empty() : this.applicationName;
    }

    @InputImport(name="identity")
    private final @Nullable Input<IdentityArgs> identity;

    public Input<IdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="jitAccessPolicy")
    private final @Nullable Input<ApplicationJitAccessPolicyArgs> jitAccessPolicy;

    public Input<ApplicationJitAccessPolicyArgs> getJitAccessPolicy() {
        return this.jitAccessPolicy == null ? Input.empty() : this.jitAccessPolicy;
    }

    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="managedBy")
    private final @Nullable Input<String> managedBy;

    public Input<String> getManagedBy() {
        return this.managedBy == null ? Input.empty() : this.managedBy;
    }

    @InputImport(name="managedResourceGroupId")
    private final @Nullable Input<String> managedResourceGroupId;

    public Input<String> getManagedResourceGroupId() {
        return this.managedResourceGroupId == null ? Input.empty() : this.managedResourceGroupId;
    }

    @InputImport(name="parameters")
    private final @Nullable Input<Object> parameters;

    public Input<Object> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    @InputImport(name="plan")
    private final @Nullable Input<PlanArgs> plan;

    public Input<PlanArgs> getPlan() {
        return this.plan == null ? Input.empty() : this.plan;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sku")
    private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ApplicationArgs(
        @Nullable Input<String> applicationDefinitionId,
        @Nullable Input<String> applicationName,
        @Nullable Input<IdentityArgs> identity,
        @Nullable Input<ApplicationJitAccessPolicyArgs> jitAccessPolicy,
        Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> managedBy,
        @Nullable Input<String> managedResourceGroupId,
        @Nullable Input<Object> parameters,
        @Nullable Input<PlanArgs> plan,
        Input<String> resourceGroupName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.applicationDefinitionId = applicationDefinitionId;
        this.applicationName = applicationName;
        this.identity = identity;
        this.jitAccessPolicy = jitAccessPolicy;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.managedBy = managedBy;
        this.managedResourceGroupId = managedResourceGroupId;
        this.parameters = parameters;
        this.plan = plan;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private ApplicationArgs() {
        this.applicationDefinitionId = Input.empty();
        this.applicationName = Input.empty();
        this.identity = Input.empty();
        this.jitAccessPolicy = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.managedBy = Input.empty();
        this.managedResourceGroupId = Input.empty();
        this.parameters = Input.empty();
        this.plan = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationDefinitionId;
        private @Nullable Input<String> applicationName;
        private @Nullable Input<IdentityArgs> identity;
        private @Nullable Input<ApplicationJitAccessPolicyArgs> jitAccessPolicy;
        private Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> managedBy;
        private @Nullable Input<String> managedResourceGroupId;
        private @Nullable Input<Object> parameters;
        private @Nullable Input<PlanArgs> plan;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationDefinitionId = defaults.applicationDefinitionId;
    	      this.applicationName = defaults.applicationName;
    	      this.identity = defaults.identity;
    	      this.jitAccessPolicy = defaults.jitAccessPolicy;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.managedResourceGroupId = defaults.managedResourceGroupId;
    	      this.parameters = defaults.parameters;
    	      this.plan = defaults.plan;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setApplicationDefinitionId(@Nullable Input<String> applicationDefinitionId) {
            this.applicationDefinitionId = applicationDefinitionId;
            return this;
        }

        public Builder setApplicationDefinitionId(@Nullable String applicationDefinitionId) {
            this.applicationDefinitionId = Input.ofNullable(applicationDefinitionId);
            return this;
        }

        public Builder setApplicationName(@Nullable Input<String> applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public Builder setApplicationName(@Nullable String applicationName) {
            this.applicationName = Input.ofNullable(applicationName);
            return this;
        }

        public Builder setIdentity(@Nullable Input<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setJitAccessPolicy(@Nullable Input<ApplicationJitAccessPolicyArgs> jitAccessPolicy) {
            this.jitAccessPolicy = jitAccessPolicy;
            return this;
        }

        public Builder setJitAccessPolicy(@Nullable ApplicationJitAccessPolicyArgs jitAccessPolicy) {
            this.jitAccessPolicy = Input.ofNullable(jitAccessPolicy);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
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

        public Builder setManagedBy(@Nullable Input<String> managedBy) {
            this.managedBy = managedBy;
            return this;
        }

        public Builder setManagedBy(@Nullable String managedBy) {
            this.managedBy = Input.ofNullable(managedBy);
            return this;
        }

        public Builder setManagedResourceGroupId(@Nullable Input<String> managedResourceGroupId) {
            this.managedResourceGroupId = managedResourceGroupId;
            return this;
        }

        public Builder setManagedResourceGroupId(@Nullable String managedResourceGroupId) {
            this.managedResourceGroupId = Input.ofNullable(managedResourceGroupId);
            return this;
        }

        public Builder setParameters(@Nullable Input<Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Object parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setPlan(@Nullable Input<PlanArgs> plan) {
            this.plan = plan;
            return this;
        }

        public Builder setPlan(@Nullable PlanArgs plan) {
            this.plan = Input.ofNullable(plan);
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

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
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

        public ApplicationArgs build() {
            return new ApplicationArgs(applicationDefinitionId, applicationName, identity, jitAccessPolicy, kind, location, managedBy, managedResourceGroupId, parameters, plan, resourceGroupName, sku, tags);
        }
    }
}