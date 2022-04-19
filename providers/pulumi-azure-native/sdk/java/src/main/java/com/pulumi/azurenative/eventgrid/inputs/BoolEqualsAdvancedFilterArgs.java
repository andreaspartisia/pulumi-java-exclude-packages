// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * BoolEquals Advanced Filter.
 * 
 */
public final class BoolEqualsAdvancedFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BoolEqualsAdvancedFilterArgs Empty = new BoolEqualsAdvancedFilterArgs();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> key() {
        return this.key == null ? Codegen.empty() : this.key;
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'BoolEquals'.
     * 
     */
    @Import(name="operatorType", required=true)
      private final Output<String> operatorType;

    public Output<String> operatorType() {
        return this.operatorType;
    }

    /**
     * The boolean filter value.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<Boolean> value;

    public Output<Boolean> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public BoolEqualsAdvancedFilterArgs(
        @Nullable Output<String> key,
        Output<String> operatorType,
        @Nullable Output<Boolean> value) {
        this.key = key;
        this.operatorType = Codegen.stringProp("operatorType").output().arg(operatorType).require();
        this.value = value;
    }

    private BoolEqualsAdvancedFilterArgs() {
        this.key = Codegen.empty();
        this.operatorType = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BoolEqualsAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private Output<String> operatorType;
        private @Nullable Output<Boolean> value;

        public Builder() {
    	      // Empty
        }

        public Builder(BoolEqualsAdvancedFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.value = defaults.value;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Codegen.ofNullable(key);
            return this;
        }
        public Builder operatorType(Output<String> operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }
        public Builder operatorType(String operatorType) {
            this.operatorType = Output.of(Objects.requireNonNull(operatorType));
            return this;
        }
        public Builder value(@Nullable Output<Boolean> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable Boolean value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public BoolEqualsAdvancedFilterArgs build() {
            return new BoolEqualsAdvancedFilterArgs(key, operatorType, value);
        }
    }
}
