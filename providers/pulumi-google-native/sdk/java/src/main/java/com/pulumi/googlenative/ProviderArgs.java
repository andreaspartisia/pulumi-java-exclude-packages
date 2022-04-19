// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * Additional user-agent string to append to the default one (<prod_name>/<ver>).
     * 
     */
    @Import(name="appendUserAgent")
      private final @Nullable Output<String> appendUserAgent;

    public Output<String> appendUserAgent() {
        return this.appendUserAgent == null ? Codegen.empty() : this.appendUserAgent;
    }

    /**
     * This will disable the Pulumi Partner Name which is used if a custom `partnerName` isn't specified.
     * 
     */
    @Import(name="disablePartnerName", json=true)
      private final @Nullable Output<Boolean> disablePartnerName;

    public Output<Boolean> disablePartnerName() {
        return this.disablePartnerName == null ? Codegen.empty() : this.disablePartnerName;
    }

    /**
     * A Google Partner Name to facilitate partner resource usage attribution.
     * 
     */
    @Import(name="partnerName")
      private final @Nullable Output<String> partnerName;

    public Output<String> partnerName() {
        return this.partnerName == null ? Codegen.empty() : this.partnerName;
    }

    /**
     * The default project to manage resources in. If another project is specified on a resource, it will take precedence.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The default region to manage resources in. If another region is specified on a regional resource, it will take precedence.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The default zone to manage resources in. Generally, this zone should be within the default region you specified. If another zone is specified on a zonal resource, it will take precedence.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public ProviderArgs(
        @Nullable Output<String> appendUserAgent,
        @Nullable Output<Boolean> disablePartnerName,
        @Nullable Output<String> partnerName,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> zone) {
        this.appendUserAgent = Codegen.stringProp("appendUserAgent").output().arg(appendUserAgent).env("GOOGLE_APPEND_USER_AGENT").getNullable();
        this.disablePartnerName = Codegen.booleanProp("disablePartnerName").output().arg(disablePartnerName).env("GOOGLE_DISABLE_PARTNER_NAME").getNullable();
        this.partnerName = Codegen.stringProp("partnerName").output().arg(partnerName).env("GOOGLE_PARTNER_NAME").getNullable();
        this.project = Codegen.stringProp("project").output().arg(project).env("GOOGLE_PROJECT", "GOOGLE_CLOUD_PROJECT", "GCLOUD_PROJECT", "CLOUDSDK_CORE_PROJECT").getNullable();
        this.region = Codegen.stringProp("region").output().arg(region).env("GOOGLE_REGION", "GCLOUD_REGION", "CLOUDSDK_COMPUTE_REGION").getNullable();
        this.zone = Codegen.stringProp("zone").output().arg(zone).env("GOOGLE_ZONE", "GCLOUD_ZONE", "CLOUDSDK_COMPUTE_ZONE").getNullable();
    }

    private ProviderArgs() {
        this.appendUserAgent = Codegen.empty();
        this.disablePartnerName = Codegen.empty();
        this.partnerName = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appendUserAgent;
        private @Nullable Output<Boolean> disablePartnerName;
        private @Nullable Output<String> partnerName;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appendUserAgent = defaults.appendUserAgent;
    	      this.disablePartnerName = defaults.disablePartnerName;
    	      this.partnerName = defaults.partnerName;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.zone = defaults.zone;
        }

        public Builder appendUserAgent(@Nullable Output<String> appendUserAgent) {
            this.appendUserAgent = appendUserAgent;
            return this;
        }
        public Builder appendUserAgent(@Nullable String appendUserAgent) {
            this.appendUserAgent = Codegen.ofNullable(appendUserAgent);
            return this;
        }
        public Builder disablePartnerName(@Nullable Output<Boolean> disablePartnerName) {
            this.disablePartnerName = disablePartnerName;
            return this;
        }
        public Builder disablePartnerName(@Nullable Boolean disablePartnerName) {
            this.disablePartnerName = Codegen.ofNullable(disablePartnerName);
            return this;
        }
        public Builder partnerName(@Nullable Output<String> partnerName) {
            this.partnerName = partnerName;
            return this;
        }
        public Builder partnerName(@Nullable String partnerName) {
            this.partnerName = Codegen.ofNullable(partnerName);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public ProviderArgs build() {
            return new ProviderArgs(appendUserAgent, disablePartnerName, partnerName, project, region, zone);
        }
    }
}
