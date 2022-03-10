// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCertificateResult {
    private final String certificate;
    private final Integer certificateId;
    private final String creationTimestamp;
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String namePrefix;
    private final String privateKey;
    private final @Nullable String project;
    private final String selfLink;

    @OutputCustomType.Constructor
    private GetCertificateResult(
        @OutputCustomType.Parameter("certificate") String certificate,
        @OutputCustomType.Parameter("certificateId") Integer certificateId,
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("namePrefix") String namePrefix,
        @OutputCustomType.Parameter("privateKey") String privateKey,
        @OutputCustomType.Parameter("project") @Nullable String project,
        @OutputCustomType.Parameter("selfLink") String selfLink) {
        this.certificate = certificate;
        this.certificateId = certificateId;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.id = id;
        this.name = name;
        this.namePrefix = namePrefix;
        this.privateKey = privateKey;
        this.project = project;
        this.selfLink = selfLink;
    }

    public String getCertificate() {
        return this.certificate;
    }
    public Integer getCertificateId() {
        return this.certificateId;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getSelfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificate;
        private Integer certificateId;
        private String creationTimestamp;
        private String description;
        private String id;
        private String name;
        private String namePrefix;
        private String privateKey;
        private @Nullable String project;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificateId = defaults.certificateId;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.privateKey = defaults.privateKey;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setCertificateId(Integer certificateId) {
            this.certificateId = Objects.requireNonNull(certificateId);
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

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamePrefix(String namePrefix) {
            this.namePrefix = Objects.requireNonNull(namePrefix);
            return this;
        }

        public Builder setPrivateKey(String privateKey) {
            this.privateKey = Objects.requireNonNull(privateKey);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public GetCertificateResult build() {
            return new GetCertificateResult(certificate, certificateId, creationTimestamp, description, id, name, namePrefix, privateKey, project, selfLink);
        }
    }
}
