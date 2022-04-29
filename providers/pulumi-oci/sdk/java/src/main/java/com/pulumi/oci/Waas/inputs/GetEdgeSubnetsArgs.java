// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Waas.inputs.GetEdgeSubnetsFilter;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEdgeSubnetsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEdgeSubnetsArgs Empty = new GetEdgeSubnetsArgs();

    @Import(name="filters")
    private @Nullable List<GetEdgeSubnetsFilter> filters;

    public Optional<List<GetEdgeSubnetsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetEdgeSubnetsArgs() {}

    private GetEdgeSubnetsArgs(GetEdgeSubnetsArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEdgeSubnetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEdgeSubnetsArgs $;

        public Builder() {
            $ = new GetEdgeSubnetsArgs();
        }

        public Builder(GetEdgeSubnetsArgs defaults) {
            $ = new GetEdgeSubnetsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetEdgeSubnetsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetEdgeSubnetsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetEdgeSubnetsArgs build() {
            return $;
        }
    }

}
