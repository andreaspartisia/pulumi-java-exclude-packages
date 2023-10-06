// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBotmanCustomBotCategoryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanCustomBotCategoryArgs Empty = new GetBotmanCustomBotCategoryArgs();

    @Import(name="categoryId")
    private @Nullable Output<String> categoryId;

    public Optional<Output<String>> categoryId() {
        return Optional.ofNullable(this.categoryId);
    }

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    private GetBotmanCustomBotCategoryArgs() {}

    private GetBotmanCustomBotCategoryArgs(GetBotmanCustomBotCategoryArgs $) {
        this.categoryId = $.categoryId;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanCustomBotCategoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanCustomBotCategoryArgs $;

        public Builder() {
            $ = new GetBotmanCustomBotCategoryArgs();
        }

        public Builder(GetBotmanCustomBotCategoryArgs defaults) {
            $ = new GetBotmanCustomBotCategoryArgs(Objects.requireNonNull(defaults));
        }

        public Builder categoryId(@Nullable Output<String> categoryId) {
            $.categoryId = categoryId;
            return this;
        }

        public Builder categoryId(String categoryId) {
            return categoryId(Output.of(categoryId));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public GetBotmanCustomBotCategoryArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetBotmanCustomBotCategoryArgs", "configId");
            }
            return $;
        }
    }

}
