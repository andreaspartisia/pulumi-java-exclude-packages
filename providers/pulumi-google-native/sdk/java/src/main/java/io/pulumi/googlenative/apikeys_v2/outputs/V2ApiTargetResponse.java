// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class V2ApiTargetResponse {
    private final List<String> methods;
    private final String service;

    @OutputCustomType.Constructor({"methods","service"})
    private V2ApiTargetResponse(
        List<String> methods,
        String service) {
        this.methods = Objects.requireNonNull(methods);
        this.service = Objects.requireNonNull(service);
    }

    public List<String> getMethods() {
        return this.methods;
    }
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2ApiTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> methods;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(V2ApiTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.service = defaults.service;
        }

        public Builder setMethods(List<String> methods) {
            this.methods = Objects.requireNonNull(methods);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public V2ApiTargetResponse build() {
            return new V2ApiTargetResponse(methods, service);
        }
    }
}