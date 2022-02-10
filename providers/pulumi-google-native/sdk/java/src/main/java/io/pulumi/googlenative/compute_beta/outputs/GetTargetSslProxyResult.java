// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetTargetSslProxyResult {
    private final String certificateMap;
    private final String creationTimestamp;
    private final String description;
    private final String kind;
    private final String name;
    private final String proxyHeader;
    private final String selfLink;
    private final String service;
    private final List<String> sslCertificates;
    private final String sslPolicy;

    @OutputCustomType.Constructor({"certificateMap","creationTimestamp","description","kind","name","proxyHeader","selfLink","service","sslCertificates","sslPolicy"})
    private GetTargetSslProxyResult(
        String certificateMap,
        String creationTimestamp,
        String description,
        String kind,
        String name,
        String proxyHeader,
        String selfLink,
        String service,
        List<String> sslCertificates,
        String sslPolicy) {
        this.certificateMap = Objects.requireNonNull(certificateMap);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.proxyHeader = Objects.requireNonNull(proxyHeader);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.service = Objects.requireNonNull(service);
        this.sslCertificates = Objects.requireNonNull(sslCertificates);
        this.sslPolicy = Objects.requireNonNull(sslPolicy);
    }

    public String getCertificateMap() {
        return this.certificateMap;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public String getProxyHeader() {
        return this.proxyHeader;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public String getService() {
        return this.service;
    }
    public List<String> getSslCertificates() {
        return this.sslCertificates;
    }
    public String getSslPolicy() {
        return this.sslPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetSslProxyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateMap;
        private String creationTimestamp;
        private String description;
        private String kind;
        private String name;
        private String proxyHeader;
        private String selfLink;
        private String service;
        private List<String> sslCertificates;
        private String sslPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetSslProxyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateMap = defaults.certificateMap;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.selfLink = defaults.selfLink;
    	      this.service = defaults.service;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
        }

        public Builder setCertificateMap(String certificateMap) {
            this.certificateMap = Objects.requireNonNull(certificateMap);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProxyHeader(String proxyHeader) {
            this.proxyHeader = Objects.requireNonNull(proxyHeader);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setSslCertificates(List<String> sslCertificates) {
            this.sslCertificates = Objects.requireNonNull(sslCertificates);
            return this;
        }

        public Builder setSslPolicy(String sslPolicy) {
            this.sslPolicy = Objects.requireNonNull(sslPolicy);
            return this;
        }

        public GetTargetSslProxyResult build() {
            return new GetTargetSslProxyResult(certificateMap, creationTimestamp, description, kind, name, proxyHeader, selfLink, service, sslCertificates, sslPolicy);
        }
    }
}