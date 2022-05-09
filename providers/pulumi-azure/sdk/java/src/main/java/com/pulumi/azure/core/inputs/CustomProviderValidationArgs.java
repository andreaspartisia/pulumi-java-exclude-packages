// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CustomProviderValidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomProviderValidationArgs Empty = new CustomProviderValidationArgs();

    /**
     * The endpoint where the validation specification is located.
     * 
     */
    @Import(name="specification", required=true)
    private Output<String> specification;

    /**
     * @return The endpoint where the validation specification is located.
     * 
     */
    public Output<String> specification() {
        return this.specification;
    }

    private CustomProviderValidationArgs() {}

    private CustomProviderValidationArgs(CustomProviderValidationArgs $) {
        this.specification = $.specification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomProviderValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomProviderValidationArgs $;

        public Builder() {
            $ = new CustomProviderValidationArgs();
        }

        public Builder(CustomProviderValidationArgs defaults) {
            $ = new CustomProviderValidationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param specification The endpoint where the validation specification is located.
         * 
         * @return builder
         * 
         */
        public Builder specification(Output<String> specification) {
            $.specification = specification;
            return this;
        }

        /**
         * @param specification The endpoint where the validation specification is located.
         * 
         * @return builder
         * 
         */
        public Builder specification(String specification) {
            return specification(Output.of(specification));
        }

        public CustomProviderValidationArgs build() {
            $.specification = Objects.requireNonNull($.specification, "expected parameter 'specification' to be non-null");
            return $;
        }
    }

}
