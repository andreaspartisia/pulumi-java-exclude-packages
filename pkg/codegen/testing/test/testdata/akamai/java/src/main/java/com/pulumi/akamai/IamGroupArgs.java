// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IamGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final IamGroupArgs Empty = new IamGroupArgs();

    /**
     * Human readable name for a group
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Human readable name for a group
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique identifier for the parent group
     * 
     */
    @Import(name="parentGroupId", required=true)
    private Output<Integer> parentGroupId;

    /**
     * @return Unique identifier for the parent group
     * 
     */
    public Output<Integer> parentGroupId() {
        return this.parentGroupId;
    }

    private IamGroupArgs() {}

    private IamGroupArgs(IamGroupArgs $) {
        this.name = $.name;
        this.parentGroupId = $.parentGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamGroupArgs $;

        public Builder() {
            $ = new IamGroupArgs();
        }

        public Builder(IamGroupArgs defaults) {
            $ = new IamGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Human readable name for a group
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Human readable name for a group
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentGroupId Unique identifier for the parent group
         * 
         * @return builder
         * 
         */
        public Builder parentGroupId(Output<Integer> parentGroupId) {
            $.parentGroupId = parentGroupId;
            return this;
        }

        /**
         * @param parentGroupId Unique identifier for the parent group
         * 
         * @return builder
         * 
         */
        public Builder parentGroupId(Integer parentGroupId) {
            return parentGroupId(Output.of(parentGroupId));
        }

        public IamGroupArgs build() {
            if ($.parentGroupId == null) {
                throw new MissingRequiredPropertyException("IamGroupArgs", "parentGroupId");
            }
            return $;
        }
    }

}
