// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.azurenative.servicefabricmesh.enums.AutoScalingResourceMetricName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the resource that is used for triggering auto scaling.
 * 
 */
public final class AutoScalingResourceMetricArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoScalingResourceMetricArgs Empty = new AutoScalingResourceMetricArgs();

    /**
     * Enumerates the metrics that are used for triggering auto scaling.
     * Expected value is &#39;Resource&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name", required=true)
    private Output<Either<String,AutoScalingResourceMetricName>> name;

    public Output<Either<String,AutoScalingResourceMetricName>> name() {
        return this.name;
    }

    private AutoScalingResourceMetricArgs() {}

    private AutoScalingResourceMetricArgs(AutoScalingResourceMetricArgs $) {
        this.kind = $.kind;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoScalingResourceMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoScalingResourceMetricArgs $;

        public Builder() {
            $ = new AutoScalingResourceMetricArgs();
        }

        public Builder(AutoScalingResourceMetricArgs defaults) {
            $ = new AutoScalingResourceMetricArgs(Objects.requireNonNull(defaults));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder name(Output<Either<String,AutoScalingResourceMetricName>> name) {
            $.name = name;
            return this;
        }

        public Builder name(Either<String,AutoScalingResourceMetricName> name) {
            return name(Output.of(name));
        }

        public Builder name(String name) {
            return name(Either.ofLeft(name));
        }

        public Builder name(AutoScalingResourceMetricName name) {
            return name(Either.ofRight(name));
        }

        public AutoScalingResourceMetricArgs build() {
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
