// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Not supported by Cloud Run SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext. When both are set, the values in SecurityContext take precedence.
 * 
 */
public final class SecurityContextResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecurityContextResponse Empty = new SecurityContextResponse();

    /**
     * (Optional) The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @Import(name="runAsUser", required=true)
      private final Integer runAsUser;

    public Integer runAsUser() {
        return this.runAsUser;
    }

    public SecurityContextResponse(Integer runAsUser) {
        this.runAsUser = Objects.requireNonNull(runAsUser, "expected parameter 'runAsUser' to be non-null");
    }

    private SecurityContextResponse() {
        this.runAsUser = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer runAsUser;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.runAsUser = defaults.runAsUser;
        }

        public Builder runAsUser(Integer runAsUser) {
            this.runAsUser = Objects.requireNonNull(runAsUser);
            return this;
        }        public SecurityContextResponse build() {
            return new SecurityContextResponse(runAsUser);
        }
    }
}
