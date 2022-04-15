// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConsentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConsentArgs Empty = new GetConsentArgs();

    @Import(name="consentId", required=true)
      private final String consentId;

    public String consentId() {
        return this.consentId;
    }

    @Import(name="consentStoreId", required=true)
      private final String consentStoreId;

    public String consentStoreId() {
        return this.consentStoreId;
    }

    @Import(name="datasetId", required=true)
      private final String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetConsentArgs(
        String consentId,
        String consentStoreId,
        String datasetId,
        String location,
        @Nullable String project) {
        this.consentId = Objects.requireNonNull(consentId, "expected parameter 'consentId' to be non-null");
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetConsentArgs() {
        this.consentId = null;
        this.consentStoreId = null;
        this.datasetId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consentId;
        private String consentStoreId;
        private String datasetId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentId = defaults.consentId;
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder consentId(String consentId) {
            this.consentId = Objects.requireNonNull(consentId);
            return this;
        }
        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetConsentArgs build() {
            return new GetConsentArgs(consentId, consentStoreId, datasetId, location, project);
        }
    }
}
