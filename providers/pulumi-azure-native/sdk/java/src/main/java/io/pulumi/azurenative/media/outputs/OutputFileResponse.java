// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OutputFileResponse {
    private final List<String> labels;

    @OutputCustomType.Constructor({"labels"})
    private OutputFileResponse(List<String> labels) {
        this.labels = Objects.requireNonNull(labels);
    }

    public List<String> getLabels() {
        return this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        public Builder setLabels(List<String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public OutputFileResponse build() {
            return new OutputFileResponse(labels);
        }
    }
}