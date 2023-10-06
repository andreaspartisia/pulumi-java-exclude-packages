// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetBotmanCustomBotCategorySequenceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanCustomBotCategorySequenceArgs Empty = new GetBotmanCustomBotCategorySequenceArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    private GetBotmanCustomBotCategorySequenceArgs() {}

    private GetBotmanCustomBotCategorySequenceArgs(GetBotmanCustomBotCategorySequenceArgs $) {
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanCustomBotCategorySequenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanCustomBotCategorySequenceArgs $;

        public Builder() {
            $ = new GetBotmanCustomBotCategorySequenceArgs();
        }

        public Builder(GetBotmanCustomBotCategorySequenceArgs defaults) {
            $ = new GetBotmanCustomBotCategorySequenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public GetBotmanCustomBotCategorySequenceArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetBotmanCustomBotCategorySequenceArgs", "configId");
            }
            return $;
        }
    }

}
