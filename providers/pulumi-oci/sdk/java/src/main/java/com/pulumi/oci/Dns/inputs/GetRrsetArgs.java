// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Dns.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRrsetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRrsetArgs Empty = new GetRrsetArgs();

    /**
     * The OCID of the compartment the resource belongs to.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable String compartmentId;

    /**
     * @return The OCID of the compartment the resource belongs to.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * The target fully-qualified domain name (FQDN) within the target zone.
     * 
     */
    @Import(name="domain", required=true)
    private String domain;

    /**
     * @return The target fully-qualified domain name (FQDN) within the target zone.
     * 
     */
    public String domain() {
        return this.domain;
    }

    /**
     * The type of the target RRSet within the target zone.
     * 
     */
    @Import(name="rtype", required=true)
    private String rtype;

    /**
     * @return The type of the target RRSet within the target zone.
     * 
     */
    public String rtype() {
        return this.rtype;
    }

    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     * This value will be null for zones in the global DNS and `PRIVATE` when listing private Rrsets.
     * 
     */
    @Import(name="scope")
    private @Nullable String scope;

    /**
     * @return Specifies to operate only on resources that have a matching DNS scope.
     * This value will be null for zones in the global DNS and `PRIVATE` when listing private Rrsets.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * The OCID of the view the resource is associated with.
     * 
     */
    @Import(name="viewId")
    private @Nullable String viewId;

    /**
     * @return The OCID of the view the resource is associated with.
     * 
     */
    public Optional<String> viewId() {
        return Optional.ofNullable(this.viewId);
    }

    /**
     * The name or OCID of the target zone.
     * 
     */
    @Import(name="zoneNameOrId", required=true)
    private String zoneNameOrId;

    /**
     * @return The name or OCID of the target zone.
     * 
     */
    public String zoneNameOrId() {
        return this.zoneNameOrId;
    }

    /**
     * The version of the zone for which data is requested.
     * 
     */
    @Import(name="zoneVersion")
    private @Nullable String zoneVersion;

    /**
     * @return The version of the zone for which data is requested.
     * 
     */
    public Optional<String> zoneVersion() {
        return Optional.ofNullable(this.zoneVersion);
    }

    private GetRrsetArgs() {}

    private GetRrsetArgs(GetRrsetArgs $) {
        this.compartmentId = $.compartmentId;
        this.domain = $.domain;
        this.rtype = $.rtype;
        this.scope = $.scope;
        this.viewId = $.viewId;
        this.zoneNameOrId = $.zoneNameOrId;
        this.zoneVersion = $.zoneVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRrsetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRrsetArgs $;

        public Builder() {
            $ = new GetRrsetArgs();
        }

        public Builder(GetRrsetArgs defaults) {
            $ = new GetRrsetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment the resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param domain The target fully-qualified domain name (FQDN) within the target zone.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param rtype The type of the target RRSet within the target zone.
         * 
         * @return builder
         * 
         */
        public Builder rtype(String rtype) {
            $.rtype = rtype;
            return this;
        }

        /**
         * @param scope Specifies to operate only on resources that have a matching DNS scope.
         * This value will be null for zones in the global DNS and `PRIVATE` when listing private Rrsets.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable String scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param viewId The OCID of the view the resource is associated with.
         * 
         * @return builder
         * 
         */
        public Builder viewId(@Nullable String viewId) {
            $.viewId = viewId;
            return this;
        }

        /**
         * @param zoneNameOrId The name or OCID of the target zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneNameOrId(String zoneNameOrId) {
            $.zoneNameOrId = zoneNameOrId;
            return this;
        }

        /**
         * @param zoneVersion The version of the zone for which data is requested.
         * 
         * @return builder
         * 
         */
        public Builder zoneVersion(@Nullable String zoneVersion) {
            $.zoneVersion = zoneVersion;
            return this;
        }

        public GetRrsetArgs build() {
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.rtype = Objects.requireNonNull($.rtype, "expected parameter 'rtype' to be non-null");
            $.zoneNameOrId = Objects.requireNonNull($.zoneNameOrId, "expected parameter 'zoneNameOrId' to be non-null");
            return $;
        }
    }

}
