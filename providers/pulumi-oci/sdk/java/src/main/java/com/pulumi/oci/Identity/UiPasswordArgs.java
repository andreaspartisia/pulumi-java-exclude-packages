// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class UiPasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final UiPasswordArgs Empty = new UiPasswordArgs();

    /**
     * The OCID of the user.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The OCID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private UiPasswordArgs() {}

    private UiPasswordArgs(UiPasswordArgs $) {
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UiPasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UiPasswordArgs $;

        public Builder() {
            $ = new UiPasswordArgs();
        }

        public Builder(UiPasswordArgs defaults) {
            $ = new UiPasswordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param userId The OCID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The OCID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UiPasswordArgs build() {
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
