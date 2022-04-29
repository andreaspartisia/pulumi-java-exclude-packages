// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Dns.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Dns.outputs.GetRecordsFilter;
import com.pulumi.oci.Dns.outputs.GetRecordsRecord;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRecordsResult {
    private final @Nullable String compartmentId;
    /**
     * @return The fully qualified domain name where the record can be located.
     * 
     */
    private final @Nullable String domain;
    private final @Nullable String domainContains;
    private final @Nullable List<GetRecordsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The list of records.
     * 
     */
    private final List<GetRecordsRecord> records;
    /**
     * @return The canonical name for the record&#39;s type, such as A or CNAME. For more information, see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     * 
     */
    private final @Nullable String rtype;
    private final @Nullable String sortBy;
    private final @Nullable String sortOrder;
    /**
     * @return The name or OCID of the target zone.
     * 
     * @deprecated
     * The &#39;oci_dns_records&#39; resource has been deprecated. Please use &#39;oci_dns_rrset&#39; instead.
     * 
     */
    @Deprecated /* The 'oci_dns_records' resource has been deprecated. Please use 'oci_dns_rrset' instead. */
    private final String zoneNameOrId;
    private final @Nullable String zoneVersion;

    @CustomType.Constructor
    private GetRecordsResult(
        @CustomType.Parameter("compartmentId") @Nullable String compartmentId,
        @CustomType.Parameter("domain") @Nullable String domain,
        @CustomType.Parameter("domainContains") @Nullable String domainContains,
        @CustomType.Parameter("filters") @Nullable List<GetRecordsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("records") List<GetRecordsRecord> records,
        @CustomType.Parameter("rtype") @Nullable String rtype,
        @CustomType.Parameter("sortBy") @Nullable String sortBy,
        @CustomType.Parameter("sortOrder") @Nullable String sortOrder,
        @CustomType.Parameter("zoneNameOrId") String zoneNameOrId,
        @CustomType.Parameter("zoneVersion") @Nullable String zoneVersion) {
        this.compartmentId = compartmentId;
        this.domain = domain;
        this.domainContains = domainContains;
        this.filters = filters;
        this.id = id;
        this.records = records;
        this.rtype = rtype;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.zoneNameOrId = zoneNameOrId;
        this.zoneVersion = zoneVersion;
    }

    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }
    /**
     * @return The fully qualified domain name where the record can be located.
     * 
     */
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    public Optional<String> domainContains() {
        return Optional.ofNullable(this.domainContains);
    }
    public List<GetRecordsFilter> filters() {
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
     * @return The list of records.
     * 
     */
    public List<GetRecordsRecord> records() {
        return this.records;
    }
    /**
     * @return The canonical name for the record&#39;s type, such as A or CNAME. For more information, see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     * 
     */
    public Optional<String> rtype() {
        return Optional.ofNullable(this.rtype);
    }
    public Optional<String> sortBy() {
        return Optional.ofNullable(this.sortBy);
    }
    public Optional<String> sortOrder() {
        return Optional.ofNullable(this.sortOrder);
    }
    /**
     * @return The name or OCID of the target zone.
     * 
     * @deprecated
     * The &#39;oci_dns_records&#39; resource has been deprecated. Please use &#39;oci_dns_rrset&#39; instead.
     * 
     */
    @Deprecated /* The 'oci_dns_records' resource has been deprecated. Please use 'oci_dns_rrset' instead. */
    public String zoneNameOrId() {
        return this.zoneNameOrId;
    }
    public Optional<String> zoneVersion() {
        return Optional.ofNullable(this.zoneVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRecordsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String compartmentId;
        private @Nullable String domain;
        private @Nullable String domainContains;
        private @Nullable List<GetRecordsFilter> filters;
        private String id;
        private List<GetRecordsRecord> records;
        private @Nullable String rtype;
        private @Nullable String sortBy;
        private @Nullable String sortOrder;
        private String zoneNameOrId;
        private @Nullable String zoneVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRecordsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.domain = defaults.domain;
    	      this.domainContains = defaults.domainContains;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.records = defaults.records;
    	      this.rtype = defaults.rtype;
    	      this.sortBy = defaults.sortBy;
    	      this.sortOrder = defaults.sortOrder;
    	      this.zoneNameOrId = defaults.zoneNameOrId;
    	      this.zoneVersion = defaults.zoneVersion;
        }

        public Builder compartmentId(@Nullable String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        public Builder domainContains(@Nullable String domainContains) {
            this.domainContains = domainContains;
            return this;
        }
        public Builder filters(@Nullable List<GetRecordsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetRecordsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder records(List<GetRecordsRecord> records) {
            this.records = Objects.requireNonNull(records);
            return this;
        }
        public Builder records(GetRecordsRecord... records) {
            return records(List.of(records));
        }
        public Builder rtype(@Nullable String rtype) {
            this.rtype = rtype;
            return this;
        }
        public Builder sortBy(@Nullable String sortBy) {
            this.sortBy = sortBy;
            return this;
        }
        public Builder sortOrder(@Nullable String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Builder zoneNameOrId(String zoneNameOrId) {
            this.zoneNameOrId = Objects.requireNonNull(zoneNameOrId);
            return this;
        }
        public Builder zoneVersion(@Nullable String zoneVersion) {
            this.zoneVersion = zoneVersion;
            return this;
        }        public GetRecordsResult build() {
            return new GetRecordsResult(compartmentId, domain, domainContains, filters, id, records, rtype, sortBy, sortOrder, zoneNameOrId, zoneVersion);
        }
    }
}
