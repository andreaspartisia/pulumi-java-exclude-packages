// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetHttpProxyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTargetHttpProxyArgs Empty = new GetTargetHttpProxyArgs();

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="targetHttpProxy", required=true)
    private final String targetHttpProxy;

    public String getTargetHttpProxy() {
        return this.targetHttpProxy;
    }

    public GetTargetHttpProxyArgs(
        @Nullable String project,
        String targetHttpProxy) {
        this.project = project;
        this.targetHttpProxy = Objects.requireNonNull(targetHttpProxy, "expected parameter 'targetHttpProxy' to be non-null");
    }

    private GetTargetHttpProxyArgs() {
        this.project = null;
        this.targetHttpProxy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetHttpProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String targetHttpProxy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetHttpProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.targetHttpProxy = defaults.targetHttpProxy;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setTargetHttpProxy(String targetHttpProxy) {
            this.targetHttpProxy = Objects.requireNonNull(targetHttpProxy);
            return this;
        }

        public GetTargetHttpProxyArgs build() {
            return new GetTargetHttpProxyArgs(project, targetHttpProxy);
        }
    }
}