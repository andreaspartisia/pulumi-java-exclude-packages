// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyArgs Empty = new ResourcePolicyArgs();

    /**
     * The policy document
     * 
     */
    @InputImport(name="policyDocument", required=true)
    private final Input<String> policyDocument;

    public Input<String> getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * A name for resource policy
     * 
     */
    @InputImport(name="policyName", required=true)
    private final Input<String> policyName;

    public Input<String> getPolicyName() {
        return this.policyName;
    }

    public ResourcePolicyArgs(
        Input<String> policyDocument,
        Input<String> policyName) {
        this.policyDocument = Objects.requireNonNull(policyDocument, "expected parameter 'policyDocument' to be non-null");
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
    }

    private ResourcePolicyArgs() {
        this.policyDocument = Input.empty();
        this.policyName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policyDocument;
        private Input<String> policyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyDocument = defaults.policyDocument;
    	      this.policyName = defaults.policyName;
        }

        public Builder setPolicyDocument(Input<String> policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }

        public Builder setPolicyDocument(String policyDocument) {
            this.policyDocument = Input.of(Objects.requireNonNull(policyDocument));
            return this;
        }

        public Builder setPolicyName(Input<String> policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }

        public Builder setPolicyName(String policyName) {
            this.policyName = Input.of(Objects.requireNonNull(policyName));
            return this;
        }

        public ResourcePolicyArgs build() {
            return new ResourcePolicyArgs(policyDocument, policyName);
        }
    }
}