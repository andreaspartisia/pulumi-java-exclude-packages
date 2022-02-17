// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionCustomOriginConfig {
    private final @Nullable Integer hTTPPort;
    private final @Nullable Integer hTTPSPort;
    private final @Nullable Integer originKeepaliveTimeout;
    private final String originProtocolPolicy;
    private final @Nullable Integer originReadTimeout;
    private final @Nullable List<String> originSSLProtocols;

    @OutputCustomType.Constructor({"hTTPPort","hTTPSPort","originKeepaliveTimeout","originProtocolPolicy","originReadTimeout","originSSLProtocols"})
    private DistributionCustomOriginConfig(
        @Nullable Integer hTTPPort,
        @Nullable Integer hTTPSPort,
        @Nullable Integer originKeepaliveTimeout,
        String originProtocolPolicy,
        @Nullable Integer originReadTimeout,
        @Nullable List<String> originSSLProtocols) {
        this.hTTPPort = hTTPPort;
        this.hTTPSPort = hTTPSPort;
        this.originKeepaliveTimeout = originKeepaliveTimeout;
        this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy);
        this.originReadTimeout = originReadTimeout;
        this.originSSLProtocols = originSSLProtocols;
    }

    public Optional<Integer> getHTTPPort() {
        return Optional.ofNullable(this.hTTPPort);
    }
    public Optional<Integer> getHTTPSPort() {
        return Optional.ofNullable(this.hTTPSPort);
    }
    public Optional<Integer> getOriginKeepaliveTimeout() {
        return Optional.ofNullable(this.originKeepaliveTimeout);
    }
    public String getOriginProtocolPolicy() {
        return this.originProtocolPolicy;
    }
    public Optional<Integer> getOriginReadTimeout() {
        return Optional.ofNullable(this.originReadTimeout);
    }
    public List<String> getOriginSSLProtocols() {
        return this.originSSLProtocols == null ? List.of() : this.originSSLProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCustomOriginConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer hTTPPort;
        private @Nullable Integer hTTPSPort;
        private @Nullable Integer originKeepaliveTimeout;
        private String originProtocolPolicy;
        private @Nullable Integer originReadTimeout;
        private @Nullable List<String> originSSLProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCustomOriginConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hTTPPort = defaults.hTTPPort;
    	      this.hTTPSPort = defaults.hTTPSPort;
    	      this.originKeepaliveTimeout = defaults.originKeepaliveTimeout;
    	      this.originProtocolPolicy = defaults.originProtocolPolicy;
    	      this.originReadTimeout = defaults.originReadTimeout;
    	      this.originSSLProtocols = defaults.originSSLProtocols;
        }

        public Builder setHTTPPort(@Nullable Integer hTTPPort) {
            this.hTTPPort = hTTPPort;
            return this;
        }

        public Builder setHTTPSPort(@Nullable Integer hTTPSPort) {
            this.hTTPSPort = hTTPSPort;
            return this;
        }

        public Builder setOriginKeepaliveTimeout(@Nullable Integer originKeepaliveTimeout) {
            this.originKeepaliveTimeout = originKeepaliveTimeout;
            return this;
        }

        public Builder setOriginProtocolPolicy(String originProtocolPolicy) {
            this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy);
            return this;
        }

        public Builder setOriginReadTimeout(@Nullable Integer originReadTimeout) {
            this.originReadTimeout = originReadTimeout;
            return this;
        }

        public Builder setOriginSSLProtocols(@Nullable List<String> originSSLProtocols) {
            this.originSSLProtocols = originSSLProtocols;
            return this;
        }

        public DistributionCustomOriginConfig build() {
            return new DistributionCustomOriginConfig(hTTPPort, hTTPSPort, originKeepaliveTimeout, originProtocolPolicy, originReadTimeout, originSSLProtocols);
        }
    }
}