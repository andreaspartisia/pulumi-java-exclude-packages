// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.gkehub_v1alpha2.outputs.ResourceManifestResponse;
import io.pulumi.googlenative.gkehub_v1alpha2.outputs.ResourceOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class KubernetesResourceResponse {
    /**
     * The Kubernetes resources for installing the GKE Connect agent. This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
     * 
     */
    private final List<ResourceManifestResponse> connectResources;
    /**
     * Input only. The YAML representation of the Membership CR. This field is ignored for GKE clusters where Hub can read the CR directly. Callers should provide the CR that is currently present in the cluster during Create or Update, or leave this field empty if none exists. The CR manifest is used to validate the cluster has not been registered with another Membership.
     * 
     */
    private final String membershipCrManifest;
    /**
     * Additional Kubernetes resources that need to be applied to the cluster after Membership creation, and after every update. This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
     * 
     */
    private final List<ResourceManifestResponse> membershipResources;
    /**
     * Optional. Options for Kubernetes resource generation.
     * 
     */
    private final ResourceOptionsResponse resourceOptions;

    @CustomType.Constructor
    private KubernetesResourceResponse(
        @CustomType.Parameter("connectResources") List<ResourceManifestResponse> connectResources,
        @CustomType.Parameter("membershipCrManifest") String membershipCrManifest,
        @CustomType.Parameter("membershipResources") List<ResourceManifestResponse> membershipResources,
        @CustomType.Parameter("resourceOptions") ResourceOptionsResponse resourceOptions) {
        this.connectResources = connectResources;
        this.membershipCrManifest = membershipCrManifest;
        this.membershipResources = membershipResources;
        this.resourceOptions = resourceOptions;
    }

    /**
     * The Kubernetes resources for installing the GKE Connect agent. This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
     * 
    */
    public List<ResourceManifestResponse> connectResources() {
        return this.connectResources;
    }
    /**
     * Input only. The YAML representation of the Membership CR. This field is ignored for GKE clusters where Hub can read the CR directly. Callers should provide the CR that is currently present in the cluster during Create or Update, or leave this field empty if none exists. The CR manifest is used to validate the cluster has not been registered with another Membership.
     * 
    */
    public String membershipCrManifest() {
        return this.membershipCrManifest;
    }
    /**
     * Additional Kubernetes resources that need to be applied to the cluster after Membership creation, and after every update. This field is only populated in the Membership returned from a successful long-running operation from CreateMembership or UpdateMembership. It is not populated during normal GetMembership or ListMemberships requests. To get the resource manifest after the initial registration, the caller should make a UpdateMembership call with an empty field mask.
     * 
    */
    public List<ResourceManifestResponse> membershipResources() {
        return this.membershipResources;
    }
    /**
     * Optional. Options for Kubernetes resource generation.
     * 
    */
    public ResourceOptionsResponse resourceOptions() {
        return this.resourceOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ResourceManifestResponse> connectResources;
        private String membershipCrManifest;
        private List<ResourceManifestResponse> membershipResources;
        private ResourceOptionsResponse resourceOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectResources = defaults.connectResources;
    	      this.membershipCrManifest = defaults.membershipCrManifest;
    	      this.membershipResources = defaults.membershipResources;
    	      this.resourceOptions = defaults.resourceOptions;
        }

        public Builder connectResources(List<ResourceManifestResponse> connectResources) {
            this.connectResources = Objects.requireNonNull(connectResources);
            return this;
        }
        public Builder connectResources(ResourceManifestResponse... connectResources) {
            return connectResources(List.of(connectResources));
        }
        public Builder membershipCrManifest(String membershipCrManifest) {
            this.membershipCrManifest = Objects.requireNonNull(membershipCrManifest);
            return this;
        }
        public Builder membershipResources(List<ResourceManifestResponse> membershipResources) {
            this.membershipResources = Objects.requireNonNull(membershipResources);
            return this;
        }
        public Builder membershipResources(ResourceManifestResponse... membershipResources) {
            return membershipResources(List.of(membershipResources));
        }
        public Builder resourceOptions(ResourceOptionsResponse resourceOptions) {
            this.resourceOptions = Objects.requireNonNull(resourceOptions);
            return this;
        }        public KubernetesResourceResponse build() {
            return new KubernetesResourceResponse(connectResources, membershipCrManifest, membershipResources, resourceOptions);
        }
    }
}
