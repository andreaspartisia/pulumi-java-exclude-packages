// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Service Account used as a credential.
 * 
 */
public final class ServiceAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAccountArgs Empty = new ServiceAccountArgs();

    /**
     * The IAM service account email address like test@myproject.iam.gserviceaccount.com
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> email() {
        return this.email == null ? Codegen.empty() : this.email;
    }

    public ServiceAccountArgs(@Nullable Output<String> email) {
        this.email = email;
    }

    private ServiceAccountArgs() {
        this.email = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> email;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
        }

        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = Codegen.ofNullable(email);
            return this;
        }        public ServiceAccountArgs build() {
            return new ServiceAccountArgs(email);
        }
    }
}
