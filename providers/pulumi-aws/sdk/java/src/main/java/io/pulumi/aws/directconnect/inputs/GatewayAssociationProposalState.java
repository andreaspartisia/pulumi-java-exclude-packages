// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayAssociationProposalState extends io.pulumi.resources.ResourceArgs {

    public static final GatewayAssociationProposalState Empty = new GatewayAssociationProposalState();

    /**
     * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
     * 
     */
    @InputImport(name="allowedPrefixes")
      private final @Nullable Input<List<String>> allowedPrefixes;

    public Input<List<String>> getAllowedPrefixes() {
        return this.allowedPrefixes == null ? Input.empty() : this.allowedPrefixes;
    }

    /**
     * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
     * 
     */
    @InputImport(name="associatedGatewayId")
      private final @Nullable Input<String> associatedGatewayId;

    public Input<String> getAssociatedGatewayId() {
        return this.associatedGatewayId == null ? Input.empty() : this.associatedGatewayId;
    }

    /**
     * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
     * 
     */
    @InputImport(name="associatedGatewayOwnerAccountId")
      private final @Nullable Input<String> associatedGatewayOwnerAccountId;

    public Input<String> getAssociatedGatewayOwnerAccountId() {
        return this.associatedGatewayOwnerAccountId == null ? Input.empty() : this.associatedGatewayOwnerAccountId;
    }

    /**
     * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
     * 
     */
    @InputImport(name="associatedGatewayType")
      private final @Nullable Input<String> associatedGatewayType;

    public Input<String> getAssociatedGatewayType() {
        return this.associatedGatewayType == null ? Input.empty() : this.associatedGatewayType;
    }

    /**
     * Direct Connect Gateway identifier.
     * 
     */
    @InputImport(name="dxGatewayId")
      private final @Nullable Input<String> dxGatewayId;

    public Input<String> getDxGatewayId() {
        return this.dxGatewayId == null ? Input.empty() : this.dxGatewayId;
    }

    /**
     * AWS Account identifier of the Direct Connect Gateway's owner.
     * 
     */
    @InputImport(name="dxGatewayOwnerAccountId")
      private final @Nullable Input<String> dxGatewayOwnerAccountId;

    public Input<String> getDxGatewayOwnerAccountId() {
        return this.dxGatewayOwnerAccountId == null ? Input.empty() : this.dxGatewayOwnerAccountId;
    }

    public GatewayAssociationProposalState(
        @Nullable Input<List<String>> allowedPrefixes,
        @Nullable Input<String> associatedGatewayId,
        @Nullable Input<String> associatedGatewayOwnerAccountId,
        @Nullable Input<String> associatedGatewayType,
        @Nullable Input<String> dxGatewayId,
        @Nullable Input<String> dxGatewayOwnerAccountId) {
        this.allowedPrefixes = allowedPrefixes;
        this.associatedGatewayId = associatedGatewayId;
        this.associatedGatewayOwnerAccountId = associatedGatewayOwnerAccountId;
        this.associatedGatewayType = associatedGatewayType;
        this.dxGatewayId = dxGatewayId;
        this.dxGatewayOwnerAccountId = dxGatewayOwnerAccountId;
    }

    private GatewayAssociationProposalState() {
        this.allowedPrefixes = Input.empty();
        this.associatedGatewayId = Input.empty();
        this.associatedGatewayOwnerAccountId = Input.empty();
        this.associatedGatewayType = Input.empty();
        this.dxGatewayId = Input.empty();
        this.dxGatewayOwnerAccountId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayAssociationProposalState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedPrefixes;
        private @Nullable Input<String> associatedGatewayId;
        private @Nullable Input<String> associatedGatewayOwnerAccountId;
        private @Nullable Input<String> associatedGatewayType;
        private @Nullable Input<String> dxGatewayId;
        private @Nullable Input<String> dxGatewayOwnerAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayAssociationProposalState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPrefixes = defaults.allowedPrefixes;
    	      this.associatedGatewayId = defaults.associatedGatewayId;
    	      this.associatedGatewayOwnerAccountId = defaults.associatedGatewayOwnerAccountId;
    	      this.associatedGatewayType = defaults.associatedGatewayType;
    	      this.dxGatewayId = defaults.dxGatewayId;
    	      this.dxGatewayOwnerAccountId = defaults.dxGatewayOwnerAccountId;
        }

        public Builder setAllowedPrefixes(@Nullable Input<List<String>> allowedPrefixes) {
            this.allowedPrefixes = allowedPrefixes;
            return this;
        }

        public Builder setAllowedPrefixes(@Nullable List<String> allowedPrefixes) {
            this.allowedPrefixes = Input.ofNullable(allowedPrefixes);
            return this;
        }

        public Builder setAssociatedGatewayId(@Nullable Input<String> associatedGatewayId) {
            this.associatedGatewayId = associatedGatewayId;
            return this;
        }

        public Builder setAssociatedGatewayId(@Nullable String associatedGatewayId) {
            this.associatedGatewayId = Input.ofNullable(associatedGatewayId);
            return this;
        }

        public Builder setAssociatedGatewayOwnerAccountId(@Nullable Input<String> associatedGatewayOwnerAccountId) {
            this.associatedGatewayOwnerAccountId = associatedGatewayOwnerAccountId;
            return this;
        }

        public Builder setAssociatedGatewayOwnerAccountId(@Nullable String associatedGatewayOwnerAccountId) {
            this.associatedGatewayOwnerAccountId = Input.ofNullable(associatedGatewayOwnerAccountId);
            return this;
        }

        public Builder setAssociatedGatewayType(@Nullable Input<String> associatedGatewayType) {
            this.associatedGatewayType = associatedGatewayType;
            return this;
        }

        public Builder setAssociatedGatewayType(@Nullable String associatedGatewayType) {
            this.associatedGatewayType = Input.ofNullable(associatedGatewayType);
            return this;
        }

        public Builder setDxGatewayId(@Nullable Input<String> dxGatewayId) {
            this.dxGatewayId = dxGatewayId;
            return this;
        }

        public Builder setDxGatewayId(@Nullable String dxGatewayId) {
            this.dxGatewayId = Input.ofNullable(dxGatewayId);
            return this;
        }

        public Builder setDxGatewayOwnerAccountId(@Nullable Input<String> dxGatewayOwnerAccountId) {
            this.dxGatewayOwnerAccountId = dxGatewayOwnerAccountId;
            return this;
        }

        public Builder setDxGatewayOwnerAccountId(@Nullable String dxGatewayOwnerAccountId) {
            this.dxGatewayOwnerAccountId = Input.ofNullable(dxGatewayOwnerAccountId);
            return this;
        }
        public GatewayAssociationProposalState build() {
            return new GatewayAssociationProposalState(allowedPrefixes, associatedGatewayId, associatedGatewayOwnerAccountId, associatedGatewayType, dxGatewayId, dxGatewayOwnerAccountId);
        }
    }
}