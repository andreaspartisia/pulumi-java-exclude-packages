// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.CertificatesManagement.outputs.GetCaBundlesCaBundleCollection;
import com.pulumi.oci.CertificatesManagement.outputs.GetCaBundlesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCaBundlesResult {
    /**
     * @return The list of ca_bundle_collection.
     * 
     */
    private final List<GetCaBundlesCaBundleCollection> caBundleCollections;
    private final @Nullable String caBundleId;
    /**
     * @return The OCID of the compartment for the CA bundle.
     * 
     */
    private final @Nullable String compartmentId;
    private final @Nullable List<GetCaBundlesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A user-friendly name for the CA bundle. Names are unique within a compartment. Avoid entering confidential information. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The current lifecycle state of the CA bundle.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetCaBundlesResult(
        @CustomType.Parameter("caBundleCollections") List<GetCaBundlesCaBundleCollection> caBundleCollections,
        @CustomType.Parameter("caBundleId") @Nullable String caBundleId,
        @CustomType.Parameter("compartmentId") @Nullable String compartmentId,
        @CustomType.Parameter("filters") @Nullable List<GetCaBundlesFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("state") @Nullable String state) {
        this.caBundleCollections = caBundleCollections;
        this.caBundleId = caBundleId;
        this.compartmentId = compartmentId;
        this.filters = filters;
        this.id = id;
        this.name = name;
        this.state = state;
    }

    /**
     * @return The list of ca_bundle_collection.
     * 
     */
    public List<GetCaBundlesCaBundleCollection> caBundleCollections() {
        return this.caBundleCollections;
    }
    public Optional<String> caBundleId() {
        return Optional.ofNullable(this.caBundleId);
    }
    /**
     * @return The OCID of the compartment for the CA bundle.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }
    public List<GetCaBundlesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A user-friendly name for the CA bundle. Names are unique within a compartment. Avoid entering confidential information. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The current lifecycle state of the CA bundle.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCaBundlesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetCaBundlesCaBundleCollection> caBundleCollections;
        private @Nullable String caBundleId;
        private @Nullable String compartmentId;
        private @Nullable List<GetCaBundlesFilter> filters;
        private String id;
        private @Nullable String name;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCaBundlesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caBundleCollections = defaults.caBundleCollections;
    	      this.caBundleId = defaults.caBundleId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder caBundleCollections(List<GetCaBundlesCaBundleCollection> caBundleCollections) {
            this.caBundleCollections = Objects.requireNonNull(caBundleCollections);
            return this;
        }
        public Builder caBundleCollections(GetCaBundlesCaBundleCollection... caBundleCollections) {
            return caBundleCollections(List.of(caBundleCollections));
        }
        public Builder caBundleId(@Nullable String caBundleId) {
            this.caBundleId = caBundleId;
            return this;
        }
        public Builder compartmentId(@Nullable String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }
        public Builder filters(@Nullable List<GetCaBundlesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetCaBundlesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetCaBundlesResult build() {
            return new GetCaBundlesResult(caBundleCollections, caBundleId, compartmentId, filters, id, name, state);
        }
    }
}
