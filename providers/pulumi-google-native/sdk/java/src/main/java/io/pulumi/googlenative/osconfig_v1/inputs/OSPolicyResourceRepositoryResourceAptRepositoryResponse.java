// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a single apt package repository. These will be added to a repo file that will be managed at `/etc/apt/sources.list.d/google_osconfig.list`.
 * 
 */
public final class OSPolicyResourceRepositoryResourceAptRepositoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceRepositoryResourceAptRepositoryResponse Empty = new OSPolicyResourceRepositoryResourceAptRepositoryResponse();

    /**
     * Type of archive files in this repository.
     * 
     */
    @Import(name="archiveType", required=true)
      private final String archiveType;

    public String archiveType() {
        return this.archiveType;
    }

    /**
     * List of components for this repository. Must contain at least one item.
     * 
     */
    @Import(name="components", required=true)
      private final List<String> components;

    public List<String> components() {
        return this.components;
    }

    /**
     * Distribution of this repository.
     * 
     */
    @Import(name="distribution", required=true)
      private final String distribution;

    public String distribution() {
        return this.distribution;
    }

    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
     * 
     */
    @Import(name="gpgKey", required=true)
      private final String gpgKey;

    public String gpgKey() {
        return this.gpgKey;
    }

    /**
     * URI for this repository.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String uri() {
        return this.uri;
    }

    public OSPolicyResourceRepositoryResourceAptRepositoryResponse(
        String archiveType,
        List<String> components,
        String distribution,
        String gpgKey,
        String uri) {
        this.archiveType = Objects.requireNonNull(archiveType, "expected parameter 'archiveType' to be non-null");
        this.components = Objects.requireNonNull(components, "expected parameter 'components' to be non-null");
        this.distribution = Objects.requireNonNull(distribution, "expected parameter 'distribution' to be non-null");
        this.gpgKey = Objects.requireNonNull(gpgKey, "expected parameter 'gpgKey' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private OSPolicyResourceRepositoryResourceAptRepositoryResponse() {
        this.archiveType = null;
        this.components = List.of();
        this.distribution = null;
        this.gpgKey = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceAptRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String archiveType;
        private List<String> components;
        private String distribution;
        private String gpgKey;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceAptRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveType = defaults.archiveType;
    	      this.components = defaults.components;
    	      this.distribution = defaults.distribution;
    	      this.gpgKey = defaults.gpgKey;
    	      this.uri = defaults.uri;
        }

        public Builder archiveType(String archiveType) {
            this.archiveType = Objects.requireNonNull(archiveType);
            return this;
        }
        public Builder components(List<String> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }
        public Builder components(String... components) {
            return components(List.of(components));
        }
        public Builder distribution(String distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }
        public Builder gpgKey(String gpgKey) {
            this.gpgKey = Objects.requireNonNull(gpgKey);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public OSPolicyResourceRepositoryResourceAptRepositoryResponse build() {
            return new OSPolicyResourceRepositoryResourceAptRepositoryResponse(archiveType, components, distribution, gpgKey, uri);
        }
    }
}
