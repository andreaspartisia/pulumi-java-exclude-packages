// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetImagingPolicyVideoPolicyVariableEnumOption;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagingPolicyVideoPolicyVariable extends com.pulumi.resources.InvokeArgs {

    public static final GetImagingPolicyVideoPolicyVariable Empty = new GetImagingPolicyVideoPolicyVariable();

    @Import(name="defaultValue", required=true)
    private String defaultValue;

    public String defaultValue() {
        return this.defaultValue;
    }

    @Import(name="enumOptions")
    private @Nullable List<GetImagingPolicyVideoPolicyVariableEnumOption> enumOptions;

    public Optional<List<GetImagingPolicyVideoPolicyVariableEnumOption>> enumOptions() {
        return Optional.ofNullable(this.enumOptions);
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="postfix")
    private @Nullable String postfix;

    public Optional<String> postfix() {
        return Optional.ofNullable(this.postfix);
    }

    @Import(name="prefix")
    private @Nullable String prefix;

    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private GetImagingPolicyVideoPolicyVariable() {}

    private GetImagingPolicyVideoPolicyVariable(GetImagingPolicyVideoPolicyVariable $) {
        this.defaultValue = $.defaultValue;
        this.enumOptions = $.enumOptions;
        this.name = $.name;
        this.postfix = $.postfix;
        this.prefix = $.prefix;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagingPolicyVideoPolicyVariable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagingPolicyVideoPolicyVariable $;

        public Builder() {
            $ = new GetImagingPolicyVideoPolicyVariable();
        }

        public Builder(GetImagingPolicyVideoPolicyVariable defaults) {
            $ = new GetImagingPolicyVideoPolicyVariable(Objects.requireNonNull(defaults));
        }

        public Builder defaultValue(String defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        public Builder enumOptions(@Nullable List<GetImagingPolicyVideoPolicyVariableEnumOption> enumOptions) {
            $.enumOptions = enumOptions;
            return this;
        }

        public Builder enumOptions(GetImagingPolicyVideoPolicyVariableEnumOption... enumOptions) {
            return enumOptions(List.of(enumOptions));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder postfix(@Nullable String postfix) {
            $.postfix = postfix;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetImagingPolicyVideoPolicyVariable build() {
            if ($.defaultValue == null) {
                throw new MissingRequiredPropertyException("GetImagingPolicyVideoPolicyVariable", "defaultValue");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetImagingPolicyVideoPolicyVariable", "name");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GetImagingPolicyVideoPolicyVariable", "type");
            }
            return $;
        }
    }

}
