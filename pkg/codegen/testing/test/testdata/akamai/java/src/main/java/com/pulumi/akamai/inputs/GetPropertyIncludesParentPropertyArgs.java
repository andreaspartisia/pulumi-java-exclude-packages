// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetPropertyIncludesParentPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyIncludesParentPropertyArgs Empty = new GetPropertyIncludesParentPropertyArgs();

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    @Import(name="version", required=true)
    private Output<Integer> version;

    public Output<Integer> version() {
        return this.version;
    }

    private GetPropertyIncludesParentPropertyArgs() {}

    private GetPropertyIncludesParentPropertyArgs(GetPropertyIncludesParentPropertyArgs $) {
        this.id = $.id;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyIncludesParentPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyIncludesParentPropertyArgs $;

        public Builder() {
            $ = new GetPropertyIncludesParentPropertyArgs();
        }

        public Builder(GetPropertyIncludesParentPropertyArgs defaults) {
            $ = new GetPropertyIncludesParentPropertyArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder version(Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public GetPropertyIncludesParentPropertyArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetPropertyIncludesParentPropertyArgs", "id");
            }
            if ($.version == null) {
                throw new MissingRequiredPropertyException("GetPropertyIncludesParentPropertyArgs", "version");
            }
            return $;
        }
    }

}
