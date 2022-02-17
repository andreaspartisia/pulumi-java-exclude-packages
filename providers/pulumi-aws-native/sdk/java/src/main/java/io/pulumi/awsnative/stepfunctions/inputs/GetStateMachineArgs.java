// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetStateMachineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStateMachineArgs Empty = new GetStateMachineArgs();

    @InputImport(name="arn", required=true)
    private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetStateMachineArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetStateMachineArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStateMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStateMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public GetStateMachineArgs build() {
            return new GetStateMachineArgs(arn);
        }
    }
}