// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PurgeCacheState extends com.pulumi.resources.ResourceArgs {

    public static final PurgeCacheState Empty = new PurgeCacheState();

    /**
     * A resource to purge, specified by either a hostless absolute path starting with a single slash (Example: `/path/to/resource`) or by a relative path in which the first component will be interpreted as a domain protected by the WAAS policy (Example: `example.com/path/to/resource`).
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return A resource to purge, specified by either a hostless absolute path starting with a single slash (Example: `/path/to/resource`) or by a relative path in which the first component will be interpreted as a domain protected by the WAAS policy (Example: `example.com/path/to/resource`).
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     * 
     */
    @Import(name="waasPolicyId")
    private @Nullable Output<String> waasPolicyId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     * 
     */
    public Optional<Output<String>> waasPolicyId() {
        return Optional.ofNullable(this.waasPolicyId);
    }

    private PurgeCacheState() {}

    private PurgeCacheState(PurgeCacheState $) {
        this.resources = $.resources;
        this.waasPolicyId = $.waasPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PurgeCacheState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PurgeCacheState $;

        public Builder() {
            $ = new PurgeCacheState();
        }

        public Builder(PurgeCacheState defaults) {
            $ = new PurgeCacheState(Objects.requireNonNull(defaults));
        }

        /**
         * @param resources A resource to purge, specified by either a hostless absolute path starting with a single slash (Example: `/path/to/resource`) or by a relative path in which the first component will be interpreted as a domain protected by the WAAS policy (Example: `example.com/path/to/resource`).
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources A resource to purge, specified by either a hostless absolute path starting with a single slash (Example: `/path/to/resource`) or by a relative path in which the first component will be interpreted as a domain protected by the WAAS policy (Example: `example.com/path/to/resource`).
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources A resource to purge, specified by either a hostless absolute path starting with a single slash (Example: `/path/to/resource`) or by a relative path in which the first component will be interpreted as a domain protected by the WAAS policy (Example: `example.com/path/to/resource`).
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        /**
         * @param waasPolicyId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WAAS policy.
         * 
         * @return builder
         * 
         */
        public Builder waasPolicyId(@Nullable Output<String> waasPolicyId) {
            $.waasPolicyId = waasPolicyId;
            return this;
        }

        /**
         * @param waasPolicyId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the WAAS policy.
         * 
         * @return builder
         * 
         */
        public Builder waasPolicyId(String waasPolicyId) {
            return waasPolicyId(Output.of(waasPolicyId));
        }

        public PurgeCacheState build() {
            return $;
        }
    }

}
