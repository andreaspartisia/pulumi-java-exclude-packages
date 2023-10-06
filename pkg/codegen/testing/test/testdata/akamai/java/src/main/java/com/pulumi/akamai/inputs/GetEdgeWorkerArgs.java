// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEdgeWorkerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEdgeWorkerArgs Empty = new GetEdgeWorkerArgs();

    @Import(name="edgeworkerId", required=true)
    private Output<Integer> edgeworkerId;

    public Output<Integer> edgeworkerId() {
        return this.edgeworkerId;
    }

    @Import(name="localBundle")
    private @Nullable Output<String> localBundle;

    public Optional<Output<String>> localBundle() {
        return Optional.ofNullable(this.localBundle);
    }

    private GetEdgeWorkerArgs() {}

    private GetEdgeWorkerArgs(GetEdgeWorkerArgs $) {
        this.edgeworkerId = $.edgeworkerId;
        this.localBundle = $.localBundle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEdgeWorkerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEdgeWorkerArgs $;

        public Builder() {
            $ = new GetEdgeWorkerArgs();
        }

        public Builder(GetEdgeWorkerArgs defaults) {
            $ = new GetEdgeWorkerArgs(Objects.requireNonNull(defaults));
        }

        public Builder edgeworkerId(Output<Integer> edgeworkerId) {
            $.edgeworkerId = edgeworkerId;
            return this;
        }

        public Builder edgeworkerId(Integer edgeworkerId) {
            return edgeworkerId(Output.of(edgeworkerId));
        }

        public Builder localBundle(@Nullable Output<String> localBundle) {
            $.localBundle = localBundle;
            return this;
        }

        public Builder localBundle(String localBundle) {
            return localBundle(Output.of(localBundle));
        }

        public GetEdgeWorkerArgs build() {
            if ($.edgeworkerId == null) {
                throw new MissingRequiredPropertyException("GetEdgeWorkerArgs", "edgeworkerId");
            }
            return $;
        }
    }

}
