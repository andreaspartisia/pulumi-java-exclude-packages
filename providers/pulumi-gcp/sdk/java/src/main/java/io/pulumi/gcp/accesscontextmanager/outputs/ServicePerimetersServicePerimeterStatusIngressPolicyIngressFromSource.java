// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource {
    /**
     * An `AccessLevel` resource name that allow resources within the
     * `ServicePerimeters` to be accessed from the internet. `AccessLevels` listed
     * must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent
     * `AccessLevel` will cause an error. If no `AccessLevel` names are listed,
     * resources within the perimeter can only be accessed via Google Cloud calls
     * with request origins within the perimeter.
     * Example `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL.`
     * If * is specified, then all IngressSources will be allowed.
     * 
     */
    private final @Nullable String accessLevel;
    /**
     * A Google Cloud resource that is allowed to ingress the perimeter.
     * Requests from these resources will be allowed to access perimeter data.
     * Currently only projects are allowed. Format `projects/{project_number}`
     * The project may be in any Google Cloud organization, not just the
     * organization that the perimeter is defined in. `*` is not allowed, the case
     * of allowing all Google Cloud resources only is not supported.
     * 
     */
    private final @Nullable String resource;

    @OutputCustomType.Constructor
    private ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource(
        @OutputCustomType.Parameter("accessLevel") @Nullable String accessLevel,
        @OutputCustomType.Parameter("resource") @Nullable String resource) {
        this.accessLevel = accessLevel;
        this.resource = resource;
    }

    /**
     * An `AccessLevel` resource name that allow resources within the
     * `ServicePerimeters` to be accessed from the internet. `AccessLevels` listed
     * must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent
     * `AccessLevel` will cause an error. If no `AccessLevel` names are listed,
     * resources within the perimeter can only be accessed via Google Cloud calls
     * with request origins within the perimeter.
     * Example `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL.`
     * If * is specified, then all IngressSources will be allowed.
     * 
    */
    public Optional<String> getAccessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }
    /**
     * A Google Cloud resource that is allowed to ingress the perimeter.
     * Requests from these resources will be allowed to access perimeter data.
     * Currently only projects are allowed. Format `projects/{project_number}`
     * The project may be in any Google Cloud organization, not just the
     * organization that the perimeter is defined in. `*` is not allowed, the case
     * of allowing all Google Cloud resources only is not supported.
     * 
    */
    public Optional<String> getResource() {
        return Optional.ofNullable(this.resource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessLevel;
        private @Nullable String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
    	      this.resource = defaults.resource;
        }

        public Builder setAccessLevel(@Nullable String accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        public Builder setResource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }
        public ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource build() {
            return new ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSource(accessLevel, resource);
        }
    }
}
