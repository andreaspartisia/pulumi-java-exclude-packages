// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SwiftPasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwiftPasswordArgs Empty = new SwiftPasswordArgs();

    /**
     * (Updatable) The description you assign to the Swift password during creation. Does not have to be unique, and it&#39;s changeable.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return (Updatable) The description you assign to the Swift password during creation. Does not have to be unique, and it&#39;s changeable.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

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

    private SwiftPasswordArgs() {}

    private SwiftPasswordArgs(SwiftPasswordArgs $) {
        this.description = $.description;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwiftPasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwiftPasswordArgs $;

        public Builder() {
            $ = new SwiftPasswordArgs();
        }

        public Builder(SwiftPasswordArgs defaults) {
            $ = new SwiftPasswordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description (Updatable) The description you assign to the Swift password during creation. Does not have to be unique, and it&#39;s changeable.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) The description you assign to the Swift password during creation. Does not have to be unique, and it&#39;s changeable.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
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

        public SwiftPasswordArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
