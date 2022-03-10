// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNodePoolNodeConfigSandboxConfig {
    private final String sandboxType;

    @OutputCustomType.Constructor
    private GetClusterNodePoolNodeConfigSandboxConfig(@OutputCustomType.Parameter("sandboxType") String sandboxType) {
        this.sandboxType = sandboxType;
    }

    public String getSandboxType() {
        return this.sandboxType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolNodeConfigSandboxConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sandboxType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodePoolNodeConfigSandboxConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sandboxType = defaults.sandboxType;
        }

        public Builder setSandboxType(String sandboxType) {
            this.sandboxType = Objects.requireNonNull(sandboxType);
            return this;
        }
        public GetClusterNodePoolNodeConfigSandboxConfig build() {
            return new GetClusterNodePoolNodeConfigSandboxConfig(sandboxType);
        }
    }
}
