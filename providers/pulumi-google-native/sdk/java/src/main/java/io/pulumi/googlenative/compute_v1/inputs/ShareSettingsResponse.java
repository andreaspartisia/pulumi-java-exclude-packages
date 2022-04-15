// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * The share setting for reservations and sole tenancy node groups.
 * 
 */
public final class ShareSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ShareSettingsResponse Empty = new ShareSettingsResponse();

    /**
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    @Import(name="projectMap", required=true)
      private final Map<String,String> projectMap;

    public Map<String,String> projectMap() {
        return this.projectMap;
    }

    /**
     * Type of sharing for this shared-reservation
     * 
     */
    @Import(name="shareType", required=true)
      private final String shareType;

    public String shareType() {
        return this.shareType;
    }

    public ShareSettingsResponse(
        Map<String,String> projectMap,
        String shareType) {
        this.projectMap = Objects.requireNonNull(projectMap, "expected parameter 'projectMap' to be non-null");
        this.shareType = Objects.requireNonNull(shareType, "expected parameter 'shareType' to be non-null");
    }

    private ShareSettingsResponse() {
        this.projectMap = Map.of();
        this.shareType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> projectMap;
        private String shareType;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectMap = defaults.projectMap;
    	      this.shareType = defaults.shareType;
        }

        public Builder projectMap(Map<String,String> projectMap) {
            this.projectMap = Objects.requireNonNull(projectMap);
            return this;
        }
        public Builder shareType(String shareType) {
            this.shareType = Objects.requireNonNull(shareType);
            return this;
        }        public ShareSettingsResponse build() {
            return new ShareSettingsResponse(projectMap, shareType);
        }
    }
}
