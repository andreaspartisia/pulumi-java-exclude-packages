// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceResult {
    private final String config;
    private final String displayName;
    private final Map<String,String> labels;
    private final String name;
    private final Integer nodeCount;
    private final Integer processingUnits;
    private final String state;

    @OutputCustomType.Constructor({"config","displayName","labels","name","nodeCount","processingUnits","state"})
    private GetInstanceResult(
        String config,
        String displayName,
        Map<String,String> labels,
        String name,
        Integer nodeCount,
        Integer processingUnits,
        String state) {
        this.config = Objects.requireNonNull(config);
        this.displayName = Objects.requireNonNull(displayName);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.nodeCount = Objects.requireNonNull(nodeCount);
        this.processingUnits = Objects.requireNonNull(processingUnits);
        this.state = Objects.requireNonNull(state);
    }

    public String getConfig() {
        return this.config;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }
    public Integer getProcessingUnits() {
        return this.processingUnits;
    }
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String config;
        private String displayName;
        private Map<String,String> labels;
        private String name;
        private Integer nodeCount;
        private Integer processingUnits;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.nodeCount = defaults.nodeCount;
    	      this.processingUnits = defaults.processingUnits;
    	      this.state = defaults.state;
        }

        public Builder setConfig(String config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }

        public Builder setProcessingUnits(Integer processingUnits) {
            this.processingUnits = Objects.requireNonNull(processingUnits);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public GetInstanceResult build() {
            return new GetInstanceResult(config, displayName, labels, name, nodeCount, processingUnits, state);
        }
    }
}