// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Setting a parameter value.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs Empty = new GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs();

    /**
     * Display name of the parameter.
     * 
     */
    @Import(name="parameter")
      private final @Nullable Output<String> parameter;

    public Output<String> parameter() {
        return this.parameter == null ? Codegen.empty() : this.parameter;
    }

    /**
     * The new value of the parameter. A null value clears the parameter.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<Object> value;

    public Output<Object> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs(
        @Nullable Output<String> parameter,
        @Nullable Output<Object> value) {
        this.parameter = parameter;
        this.value = value;
    }

    private GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs() {
        this.parameter = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> parameter;
        private @Nullable Output<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameter = defaults.parameter;
    	      this.value = defaults.value;
        }

        public Builder parameter(@Nullable Output<String> parameter) {
            this.parameter = parameter;
            return this;
        }
        public Builder parameter(@Nullable String parameter) {
            this.parameter = Codegen.ofNullable(parameter);
            return this;
        }
        public Builder value(@Nullable Output<Object> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable Object value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentSetParameterActionArgs(parameter, value);
        }
    }
}
