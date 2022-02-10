// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetConsentStoreResult {
    private final String defaultConsentTtl;
    private final Boolean enableConsentCreateOnUpdate;
    private final Map<String,String> labels;
    private final String name;

    @OutputCustomType.Constructor({"defaultConsentTtl","enableConsentCreateOnUpdate","labels","name"})
    private GetConsentStoreResult(
        String defaultConsentTtl,
        Boolean enableConsentCreateOnUpdate,
        Map<String,String> labels,
        String name) {
        this.defaultConsentTtl = Objects.requireNonNull(defaultConsentTtl);
        this.enableConsentCreateOnUpdate = Objects.requireNonNull(enableConsentCreateOnUpdate);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
    }

    public String getDefaultConsentTtl() {
        return this.defaultConsentTtl;
    }
    public Boolean getEnableConsentCreateOnUpdate() {
        return this.enableConsentCreateOnUpdate;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsentStoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultConsentTtl;
        private Boolean enableConsentCreateOnUpdate;
        private Map<String,String> labels;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsentStoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultConsentTtl = defaults.defaultConsentTtl;
    	      this.enableConsentCreateOnUpdate = defaults.enableConsentCreateOnUpdate;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder setDefaultConsentTtl(String defaultConsentTtl) {
            this.defaultConsentTtl = Objects.requireNonNull(defaultConsentTtl);
            return this;
        }

        public Builder setEnableConsentCreateOnUpdate(Boolean enableConsentCreateOnUpdate) {
            this.enableConsentCreateOnUpdate = Objects.requireNonNull(enableConsentCreateOnUpdate);
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

        public GetConsentStoreResult build() {
            return new GetConsentStoreResult(defaultConsentTtl, enableConsentCreateOnUpdate, labels, name);
        }
    }
}