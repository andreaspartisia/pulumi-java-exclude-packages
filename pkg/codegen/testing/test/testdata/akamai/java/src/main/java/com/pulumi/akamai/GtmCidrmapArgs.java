// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.inputs.GtmCidrmapAssignmentArgs;
import com.pulumi.akamai.inputs.GtmCidrmapDefaultDatacenterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GtmCidrmapArgs extends com.pulumi.resources.ResourceArgs {

    public static final GtmCidrmapArgs Empty = new GtmCidrmapArgs();

    @Import(name="assignments")
    private @Nullable Output<List<GtmCidrmapAssignmentArgs>> assignments;

    public Optional<Output<List<GtmCidrmapAssignmentArgs>>> assignments() {
        return Optional.ofNullable(this.assignments);
    }

    @Import(name="defaultDatacenter", required=true)
    private Output<GtmCidrmapDefaultDatacenterArgs> defaultDatacenter;

    public Output<GtmCidrmapDefaultDatacenterArgs> defaultDatacenter() {
        return this.defaultDatacenter;
    }

    @Import(name="domain", required=true)
    private Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="waitOnComplete")
    private @Nullable Output<Boolean> waitOnComplete;

    public Optional<Output<Boolean>> waitOnComplete() {
        return Optional.ofNullable(this.waitOnComplete);
    }

    private GtmCidrmapArgs() {}

    private GtmCidrmapArgs(GtmCidrmapArgs $) {
        this.assignments = $.assignments;
        this.defaultDatacenter = $.defaultDatacenter;
        this.domain = $.domain;
        this.name = $.name;
        this.waitOnComplete = $.waitOnComplete;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GtmCidrmapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GtmCidrmapArgs $;

        public Builder() {
            $ = new GtmCidrmapArgs();
        }

        public Builder(GtmCidrmapArgs defaults) {
            $ = new GtmCidrmapArgs(Objects.requireNonNull(defaults));
        }

        public Builder assignments(@Nullable Output<List<GtmCidrmapAssignmentArgs>> assignments) {
            $.assignments = assignments;
            return this;
        }

        public Builder assignments(List<GtmCidrmapAssignmentArgs> assignments) {
            return assignments(Output.of(assignments));
        }

        public Builder assignments(GtmCidrmapAssignmentArgs... assignments) {
            return assignments(List.of(assignments));
        }

        public Builder defaultDatacenter(Output<GtmCidrmapDefaultDatacenterArgs> defaultDatacenter) {
            $.defaultDatacenter = defaultDatacenter;
            return this;
        }

        public Builder defaultDatacenter(GtmCidrmapDefaultDatacenterArgs defaultDatacenter) {
            return defaultDatacenter(Output.of(defaultDatacenter));
        }

        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder waitOnComplete(@Nullable Output<Boolean> waitOnComplete) {
            $.waitOnComplete = waitOnComplete;
            return this;
        }

        public Builder waitOnComplete(Boolean waitOnComplete) {
            return waitOnComplete(Output.of(waitOnComplete));
        }

        public GtmCidrmapArgs build() {
            if ($.defaultDatacenter == null) {
                throw new MissingRequiredPropertyException("GtmCidrmapArgs", "defaultDatacenter");
            }
            if ($.domain == null) {
                throw new MissingRequiredPropertyException("GtmCidrmapArgs", "domain");
            }
            return $;
        }
    }

}
