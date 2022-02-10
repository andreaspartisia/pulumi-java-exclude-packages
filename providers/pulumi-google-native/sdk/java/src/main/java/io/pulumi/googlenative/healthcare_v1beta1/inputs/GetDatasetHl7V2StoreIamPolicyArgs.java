// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatasetHl7V2StoreIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDatasetHl7V2StoreIamPolicyArgs Empty = new GetDatasetHl7V2StoreIamPolicyArgs();

    @InputImport(name="datasetId", required=true)
    private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    @InputImport(name="hl7V2StoreId", required=true)
    private final String hl7V2StoreId;

    public String getHl7V2StoreId() {
        return this.hl7V2StoreId;
    }

    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="optionsRequestedPolicyVersion")
    private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetDatasetHl7V2StoreIamPolicyArgs(
        String datasetId,
        String hl7V2StoreId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.hl7V2StoreId = Objects.requireNonNull(hl7V2StoreId, "expected parameter 'hl7V2StoreId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetDatasetHl7V2StoreIamPolicyArgs() {
        this.datasetId = null;
        this.hl7V2StoreId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetHl7V2StoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String hl7V2StoreId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetHl7V2StoreIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.hl7V2StoreId = defaults.hl7V2StoreId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setHl7V2StoreId(String hl7V2StoreId) {
            this.hl7V2StoreId = Objects.requireNonNull(hl7V2StoreId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setOptionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public GetDatasetHl7V2StoreIamPolicyArgs build() {
            return new GetDatasetHl7V2StoreIamPolicyArgs(datasetId, hl7V2StoreId, location, optionsRequestedPolicyVersion, project);
        }
    }
}