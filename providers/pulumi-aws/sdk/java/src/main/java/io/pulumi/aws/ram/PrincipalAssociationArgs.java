// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PrincipalAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrincipalAssociationArgs Empty = new PrincipalAssociationArgs();

    /**
     * The principal to associate with the resource share. Possible values are an AWS account ID, an AWS Organizations Organization ARN, or an AWS Organizations Organization Unit ARN.
     * 
     */
    @InputImport(name="principal", required=true)
      private final Input<String> principal;

    public Input<String> getPrincipal() {
        return this.principal;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource share.
     * 
     */
    @InputImport(name="resourceShareArn", required=true)
      private final Input<String> resourceShareArn;

    public Input<String> getResourceShareArn() {
        return this.resourceShareArn;
    }

    public PrincipalAssociationArgs(
        Input<String> principal,
        Input<String> resourceShareArn) {
        this.principal = Objects.requireNonNull(principal, "expected parameter 'principal' to be non-null");
        this.resourceShareArn = Objects.requireNonNull(resourceShareArn, "expected parameter 'resourceShareArn' to be non-null");
    }

    private PrincipalAssociationArgs() {
        this.principal = Input.empty();
        this.resourceShareArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrincipalAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> principal;
        private Input<String> resourceShareArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PrincipalAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principal = defaults.principal;
    	      this.resourceShareArn = defaults.resourceShareArn;
        }

        public Builder setPrincipal(Input<String> principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }

        public Builder setPrincipal(String principal) {
            this.principal = Input.of(Objects.requireNonNull(principal));
            return this;
        }

        public Builder setResourceShareArn(Input<String> resourceShareArn) {
            this.resourceShareArn = Objects.requireNonNull(resourceShareArn);
            return this;
        }

        public Builder setResourceShareArn(String resourceShareArn) {
            this.resourceShareArn = Input.of(Objects.requireNonNull(resourceShareArn));
            return this;
        }
        public PrincipalAssociationArgs build() {
            return new PrincipalAssociationArgs(principal, resourceShareArn);
        }
    }
}