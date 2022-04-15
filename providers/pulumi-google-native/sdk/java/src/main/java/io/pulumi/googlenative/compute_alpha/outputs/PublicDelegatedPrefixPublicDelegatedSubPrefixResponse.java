// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PublicDelegatedPrefixPublicDelegatedSubPrefixResponse {
    /**
     * Name of the project scoping this PublicDelegatedSubPrefix.
     * 
     */
    private final String delegateeProject;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * The IPv4 address range, in CIDR format, represented by this sub public delegated prefix.
     * 
     */
    private final String ipCidrRange;
    /**
     * Whether the sub prefix is delegated to create Address resources in the delegatee project.
     * 
     */
    private final Boolean isAddress;
    /**
     * The name of the sub public delegated prefix.
     * 
     */
    private final String name;
    /**
     * The region of the sub public delegated prefix if it is regional. If absent, the sub prefix is global.
     * 
     */
    private final String region;
    /**
     * The status of the sub public delegated prefix.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private PublicDelegatedPrefixPublicDelegatedSubPrefixResponse(
        @CustomType.Parameter("delegateeProject") String delegateeProject,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("ipCidrRange") String ipCidrRange,
        @CustomType.Parameter("isAddress") Boolean isAddress,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("status") String status) {
        this.delegateeProject = delegateeProject;
        this.description = description;
        this.ipCidrRange = ipCidrRange;
        this.isAddress = isAddress;
        this.name = name;
        this.region = region;
        this.status = status;
    }

    /**
     * Name of the project scoping this PublicDelegatedSubPrefix.
     * 
    */
    public String delegateeProject() {
        return this.delegateeProject;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The IPv4 address range, in CIDR format, represented by this sub public delegated prefix.
     * 
    */
    public String ipCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * Whether the sub prefix is delegated to create Address resources in the delegatee project.
     * 
    */
    public Boolean isAddress() {
        return this.isAddress;
    }
    /**
     * The name of the sub public delegated prefix.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The region of the sub public delegated prefix if it is regional. If absent, the sub prefix is global.
     * 
    */
    public String region() {
        return this.region;
    }
    /**
     * The status of the sub public delegated prefix.
     * 
    */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicDelegatedPrefixPublicDelegatedSubPrefixResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String delegateeProject;
        private String description;
        private String ipCidrRange;
        private Boolean isAddress;
        private String name;
        private String region;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicDelegatedPrefixPublicDelegatedSubPrefixResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegateeProject = defaults.delegateeProject;
    	      this.description = defaults.description;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.isAddress = defaults.isAddress;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
        }

        public Builder delegateeProject(String delegateeProject) {
            this.delegateeProject = Objects.requireNonNull(delegateeProject);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder isAddress(Boolean isAddress) {
            this.isAddress = Objects.requireNonNull(isAddress);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public PublicDelegatedPrefixPublicDelegatedSubPrefixResponse build() {
            return new PublicDelegatedPrefixPublicDelegatedSubPrefixResponse(delegateeProject, description, ipCidrRange, isAddress, name, region, status);
        }
    }
}
