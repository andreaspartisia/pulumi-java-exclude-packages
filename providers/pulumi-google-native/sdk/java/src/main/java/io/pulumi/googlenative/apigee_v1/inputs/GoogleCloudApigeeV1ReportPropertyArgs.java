// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1AttributeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudApigeeV1ReportPropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1ReportPropertyArgs Empty = new GoogleCloudApigeeV1ReportPropertyArgs();

    /**
     * name of the property
     * 
     */
    @Import(name="property")
      private final @Nullable Output<String> property;

    public Output<String> property() {
        return this.property == null ? Codegen.empty() : this.property;
    }

    /**
     * property values
     * 
     */
    @Import(name="value")
      private final @Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> value;

    public Output<List<GoogleCloudApigeeV1AttributeArgs>> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public GoogleCloudApigeeV1ReportPropertyArgs(
        @Nullable Output<String> property,
        @Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> value) {
        this.property = property;
        this.value = value;
    }

    private GoogleCloudApigeeV1ReportPropertyArgs() {
        this.property = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1ReportPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> property;
        private @Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1ReportPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.property = defaults.property;
    	      this.value = defaults.value;
        }

        public Builder property(@Nullable Output<String> property) {
            this.property = property;
            return this;
        }
        public Builder property(@Nullable String property) {
            this.property = Codegen.ofNullable(property);
            return this;
        }
        public Builder value(@Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable List<GoogleCloudApigeeV1AttributeArgs> value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }
        public Builder value(GoogleCloudApigeeV1AttributeArgs... value) {
            return value(List.of(value));
        }        public GoogleCloudApigeeV1ReportPropertyArgs build() {
            return new GoogleCloudApigeeV1ReportPropertyArgs(property, value);
        }
    }
}
