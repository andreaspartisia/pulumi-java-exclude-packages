// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.azurenative.streamanalytics.inputs.AzureMachineLearningWebServiceFunctionBindingResponse;
import com.pulumi.azurenative.streamanalytics.inputs.FunctionInputResponse;
import com.pulumi.azurenative.streamanalytics.inputs.FunctionOutputResponse;
import com.pulumi.azurenative.streamanalytics.inputs.JavaScriptFunctionBindingResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that are associated with a scalar function.
 * 
 */
public final class ScalarFunctionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScalarFunctionPropertiesResponse Empty = new ScalarFunctionPropertiesResponse();

    /**
     * The physical binding of the function. For example, in the Azure Machine Learning web service’s case, this describes the endpoint.
     * 
     */
    @Import(name="binding")
    private @Nullable Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse> binding;

    public Optional<Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse>> binding() {
        return Optional.ofNullable(this.binding);
    }

    /**
     * The current entity tag for the function. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * A list of inputs describing the parameters of the function.
     * 
     */
    @Import(name="inputs")
    private @Nullable List<FunctionInputResponse> inputs;

    public Optional<List<FunctionInputResponse>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    /**
     * The output of the function.
     * 
     */
    @Import(name="output")
    private @Nullable FunctionOutputResponse output;

    public Optional<FunctionOutputResponse> output() {
        return Optional.ofNullable(this.output);
    }

    /**
     * Indicates the type of function.
     * Expected value is &#39;Scalar&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private ScalarFunctionPropertiesResponse() {}

    private ScalarFunctionPropertiesResponse(ScalarFunctionPropertiesResponse $) {
        this.binding = $.binding;
        this.etag = $.etag;
        this.inputs = $.inputs;
        this.output = $.output;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScalarFunctionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScalarFunctionPropertiesResponse $;

        public Builder() {
            $ = new ScalarFunctionPropertiesResponse();
        }

        public Builder(ScalarFunctionPropertiesResponse defaults) {
            $ = new ScalarFunctionPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder binding(@Nullable Either<AzureMachineLearningWebServiceFunctionBindingResponse,JavaScriptFunctionBindingResponse> binding) {
            $.binding = binding;
            return this;
        }

        public Builder binding(AzureMachineLearningWebServiceFunctionBindingResponse binding) {
            return binding(Either.ofLeft(binding));
        }

        public Builder binding(JavaScriptFunctionBindingResponse binding) {
            return binding(Either.ofRight(binding));
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder inputs(@Nullable List<FunctionInputResponse> inputs) {
            $.inputs = inputs;
            return this;
        }

        public Builder inputs(FunctionInputResponse... inputs) {
            return inputs(List.of(inputs));
        }

        public Builder output(@Nullable FunctionOutputResponse output) {
            $.output = output;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ScalarFunctionPropertiesResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
