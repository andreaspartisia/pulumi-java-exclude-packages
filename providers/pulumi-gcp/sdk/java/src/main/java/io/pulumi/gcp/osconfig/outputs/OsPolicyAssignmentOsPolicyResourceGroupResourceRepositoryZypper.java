// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper {
    /**
     * Required. The location of the repository directory.
     * 
     */
    private final String baseUrl;
    /**
     * The display name of the repository.
     * 
     */
    private final @Nullable String displayName;
    /**
     * URIs of GPG keys.
     * 
     */
    private final @Nullable List<String> gpgKeys;
    /**
     * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper(
        @OutputCustomType.Parameter("baseUrl") String baseUrl,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("gpgKeys") @Nullable List<String> gpgKeys,
        @OutputCustomType.Parameter("id") String id) {
        this.baseUrl = baseUrl;
        this.displayName = displayName;
        this.gpgKeys = gpgKeys;
        this.id = id;
    }

    /**
     * Required. The location of the repository directory.
     * 
    */
    public String getBaseUrl() {
        return this.baseUrl;
    }
    /**
     * The display name of the repository.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * URIs of GPG keys.
     * 
    */
    public List<String> getGpgKeys() {
        return this.gpgKeys == null ? List.of() : this.gpgKeys;
    }
    /**
     * Required. A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseUrl;
        private @Nullable String displayName;
        private @Nullable List<String> gpgKeys;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.displayName = defaults.displayName;
    	      this.gpgKeys = defaults.gpgKeys;
    	      this.id = defaults.id;
        }

        public Builder setBaseUrl(String baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setGpgKeys(@Nullable List<String> gpgKeys) {
            this.gpgKeys = gpgKeys;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryZypper(baseUrl, displayName, gpgKeys, id);
        }
    }
}
