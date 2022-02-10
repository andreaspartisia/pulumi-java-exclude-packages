// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudRetailV2betaAudienceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaAudienceArgs Empty = new GoogleCloudRetailV2betaAudienceArgs();

    @InputImport(name="ageGroups")
    private final @Nullable Input<List<String>> ageGroups;

    public Input<List<String>> getAgeGroups() {
        return this.ageGroups == null ? Input.empty() : this.ageGroups;
    }

    @InputImport(name="genders")
    private final @Nullable Input<List<String>> genders;

    public Input<List<String>> getGenders() {
        return this.genders == null ? Input.empty() : this.genders;
    }

    public GoogleCloudRetailV2betaAudienceArgs(
        @Nullable Input<List<String>> ageGroups,
        @Nullable Input<List<String>> genders) {
        this.ageGroups = ageGroups;
        this.genders = genders;
    }

    private GoogleCloudRetailV2betaAudienceArgs() {
        this.ageGroups = Input.empty();
        this.genders = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaAudienceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> ageGroups;
        private @Nullable Input<List<String>> genders;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaAudienceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ageGroups = defaults.ageGroups;
    	      this.genders = defaults.genders;
        }

        public Builder setAgeGroups(@Nullable Input<List<String>> ageGroups) {
            this.ageGroups = ageGroups;
            return this;
        }

        public Builder setAgeGroups(@Nullable List<String> ageGroups) {
            this.ageGroups = Input.ofNullable(ageGroups);
            return this;
        }

        public Builder setGenders(@Nullable Input<List<String>> genders) {
            this.genders = genders;
            return this;
        }

        public Builder setGenders(@Nullable List<String> genders) {
            this.genders = Input.ofNullable(genders);
            return this;
        }

        public GoogleCloudRetailV2betaAudienceArgs build() {
            return new GoogleCloudRetailV2betaAudienceArgs(ageGroups, genders);
        }
    }
}