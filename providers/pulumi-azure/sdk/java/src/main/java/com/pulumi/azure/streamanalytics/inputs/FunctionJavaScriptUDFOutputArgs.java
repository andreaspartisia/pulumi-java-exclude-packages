// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FunctionJavaScriptUDFOutputArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionJavaScriptUDFOutputArgs Empty = new FunctionJavaScriptUDFOutputArgs();

    /**
     * The Data Type output from this JavaScript Function. Possible values include `array`, `any`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The Data Type output from this JavaScript Function. Possible values include `array`, `any`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private FunctionJavaScriptUDFOutputArgs() {}

    private FunctionJavaScriptUDFOutputArgs(FunctionJavaScriptUDFOutputArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionJavaScriptUDFOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionJavaScriptUDFOutputArgs $;

        public Builder() {
            $ = new FunctionJavaScriptUDFOutputArgs();
        }

        public Builder(FunctionJavaScriptUDFOutputArgs defaults) {
            $ = new FunctionJavaScriptUDFOutputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The Data Type output from this JavaScript Function. Possible values include `array`, `any`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The Data Type output from this JavaScript Function. Possible values include `array`, `any`, `bigint`, `datetime`, `float`, `nvarchar(max)` and `record`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FunctionJavaScriptUDFOutputArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
