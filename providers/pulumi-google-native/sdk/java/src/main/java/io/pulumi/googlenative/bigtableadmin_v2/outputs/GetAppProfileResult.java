// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.MultiClusterRoutingUseAnyResponse;
import io.pulumi.googlenative.bigtableadmin_v2.outputs.SingleClusterRoutingResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppProfileResult {
    /**
     * Long form description of the use case for this AppProfile.
     * 
     */
    private final String description;
    /**
     * Strongly validated etag for optimistic concurrency control. Preserve the value returned from `GetAppProfile` when calling `UpdateAppProfile` to fail the request if there has been a modification in the mean time. The `update_mask` of the request need not include `etag` for this protection to apply. See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and [RFC 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more details.
     * 
     */
    private final String etag;
    /**
     * Use a multi-cluster routing policy.
     * 
     */
    private final MultiClusterRoutingUseAnyResponse multiClusterRoutingUseAny;
    /**
     * The unique name of the app profile. Values are of the form `projects/{project}/instances/{instance}/appProfiles/_a-zA-Z0-9*`.
     * 
     */
    private final String name;
    /**
     * Use a single-cluster routing policy.
     * 
     */
    private final SingleClusterRoutingResponse singleClusterRouting;

    @CustomType.Constructor
    private GetAppProfileResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("multiClusterRoutingUseAny") MultiClusterRoutingUseAnyResponse multiClusterRoutingUseAny,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("singleClusterRouting") SingleClusterRoutingResponse singleClusterRouting) {
        this.description = description;
        this.etag = etag;
        this.multiClusterRoutingUseAny = multiClusterRoutingUseAny;
        this.name = name;
        this.singleClusterRouting = singleClusterRouting;
    }

    /**
     * Long form description of the use case for this AppProfile.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Strongly validated etag for optimistic concurrency control. Preserve the value returned from `GetAppProfile` when calling `UpdateAppProfile` to fail the request if there has been a modification in the mean time. The `update_mask` of the request need not include `etag` for this protection to apply. See [Wikipedia](https://en.wikipedia.org/wiki/HTTP_ETag) and [RFC 7232](https://tools.ietf.org/html/rfc7232#section-2.3) for more details.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Use a multi-cluster routing policy.
     * 
    */
    public MultiClusterRoutingUseAnyResponse multiClusterRoutingUseAny() {
        return this.multiClusterRoutingUseAny;
    }
    /**
     * The unique name of the app profile. Values are of the form `projects/{project}/instances/{instance}/appProfiles/_a-zA-Z0-9*`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Use a single-cluster routing policy.
     * 
    */
    public SingleClusterRoutingResponse singleClusterRouting() {
        return this.singleClusterRouting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String etag;
        private MultiClusterRoutingUseAnyResponse multiClusterRoutingUseAny;
        private String name;
        private SingleClusterRoutingResponse singleClusterRouting;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.multiClusterRoutingUseAny = defaults.multiClusterRoutingUseAny;
    	      this.name = defaults.name;
    	      this.singleClusterRouting = defaults.singleClusterRouting;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder multiClusterRoutingUseAny(MultiClusterRoutingUseAnyResponse multiClusterRoutingUseAny) {
            this.multiClusterRoutingUseAny = Objects.requireNonNull(multiClusterRoutingUseAny);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder singleClusterRouting(SingleClusterRoutingResponse singleClusterRouting) {
            this.singleClusterRouting = Objects.requireNonNull(singleClusterRouting);
            return this;
        }        public GetAppProfileResult build() {
            return new GetAppProfileResult(description, etag, multiClusterRoutingUseAny, name, singleClusterRouting);
        }
    }
}
