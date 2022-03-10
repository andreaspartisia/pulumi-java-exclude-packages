// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationUrlDispatchRule {
    private final @Nullable String domain;
    private final @Nullable String path;
    private final @Nullable String service;

    @OutputCustomType.Constructor
    private ApplicationUrlDispatchRule(
        @OutputCustomType.Parameter("domain") @Nullable String domain,
        @OutputCustomType.Parameter("path") @Nullable String path,
        @OutputCustomType.Parameter("service") @Nullable String service) {
        this.domain = domain;
        this.path = path;
        this.service = service;
    }

    public Optional<String> getDomain() {
        return Optional.ofNullable(this.domain);
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    public Optional<String> getService() {
        return Optional.ofNullable(this.service);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationUrlDispatchRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String domain;
        private @Nullable String path;
        private @Nullable String service;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationUrlDispatchRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder setDomain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = service;
            return this;
        }
        public ApplicationUrlDispatchRule build() {
            return new ApplicationUrlDispatchRule(domain, path, service);
        }
    }
}
