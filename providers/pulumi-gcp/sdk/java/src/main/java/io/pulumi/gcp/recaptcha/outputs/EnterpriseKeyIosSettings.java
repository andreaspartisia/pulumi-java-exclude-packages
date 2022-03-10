// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.recaptcha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnterpriseKeyIosSettings {
    /**
     * If set to true, it means allowed_bundle_ids will not be enforced.
     * 
     */
    private final @Nullable Boolean allowAllBundleIds;
    /**
     * iOS bundle ids of apps allowed to use the key. Example: 'com.companyname.productname.appname'
     * 
     */
    private final @Nullable List<String> allowedBundleIds;

    @OutputCustomType.Constructor
    private EnterpriseKeyIosSettings(
        @OutputCustomType.Parameter("allowAllBundleIds") @Nullable Boolean allowAllBundleIds,
        @OutputCustomType.Parameter("allowedBundleIds") @Nullable List<String> allowedBundleIds) {
        this.allowAllBundleIds = allowAllBundleIds;
        this.allowedBundleIds = allowedBundleIds;
    }

    /**
     * If set to true, it means allowed_bundle_ids will not be enforced.
     * 
    */
    public Optional<Boolean> getAllowAllBundleIds() {
        return Optional.ofNullable(this.allowAllBundleIds);
    }
    /**
     * iOS bundle ids of apps allowed to use the key. Example: 'com.companyname.productname.appname'
     * 
    */
    public List<String> getAllowedBundleIds() {
        return this.allowedBundleIds == null ? List.of() : this.allowedBundleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseKeyIosSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowAllBundleIds;
        private @Nullable List<String> allowedBundleIds;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseKeyIosSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllBundleIds = defaults.allowAllBundleIds;
    	      this.allowedBundleIds = defaults.allowedBundleIds;
        }

        public Builder setAllowAllBundleIds(@Nullable Boolean allowAllBundleIds) {
            this.allowAllBundleIds = allowAllBundleIds;
            return this;
        }

        public Builder setAllowedBundleIds(@Nullable List<String> allowedBundleIds) {
            this.allowedBundleIds = allowedBundleIds;
            return this;
        }
        public EnterpriseKeyIosSettings build() {
            return new EnterpriseKeyIosSettings(allowAllBundleIds, allowedBundleIds);
        }
    }
}
