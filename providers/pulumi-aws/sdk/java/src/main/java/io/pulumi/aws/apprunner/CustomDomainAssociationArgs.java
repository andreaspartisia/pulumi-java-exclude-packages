// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomDomainAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomDomainAssociationArgs Empty = new CustomDomainAssociationArgs();

    /**
     * The custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
     * 
     */
    @InputImport(name="enableWwwSubdomain")
      private final @Nullable Input<Boolean> enableWwwSubdomain;

    public Input<Boolean> getEnableWwwSubdomain() {
        return this.enableWwwSubdomain == null ? Input.empty() : this.enableWwwSubdomain;
    }

    /**
     * The ARN of the App Runner service.
     * 
     */
    @InputImport(name="serviceArn", required=true)
      private final Input<String> serviceArn;

    public Input<String> getServiceArn() {
        return this.serviceArn;
    }

    public CustomDomainAssociationArgs(
        Input<String> domainName,
        @Nullable Input<Boolean> enableWwwSubdomain,
        Input<String> serviceArn) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.enableWwwSubdomain = enableWwwSubdomain;
        this.serviceArn = Objects.requireNonNull(serviceArn, "expected parameter 'serviceArn' to be non-null");
    }

    private CustomDomainAssociationArgs() {
        this.domainName = Input.empty();
        this.enableWwwSubdomain = Input.empty();
        this.serviceArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domainName;
        private @Nullable Input<Boolean> enableWwwSubdomain;
        private Input<String> serviceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDomainAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.enableWwwSubdomain = defaults.enableWwwSubdomain;
    	      this.serviceArn = defaults.serviceArn;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setEnableWwwSubdomain(@Nullable Input<Boolean> enableWwwSubdomain) {
            this.enableWwwSubdomain = enableWwwSubdomain;
            return this;
        }

        public Builder setEnableWwwSubdomain(@Nullable Boolean enableWwwSubdomain) {
            this.enableWwwSubdomain = Input.ofNullable(enableWwwSubdomain);
            return this;
        }

        public Builder setServiceArn(Input<String> serviceArn) {
            this.serviceArn = Objects.requireNonNull(serviceArn);
            return this;
        }

        public Builder setServiceArn(String serviceArn) {
            this.serviceArn = Input.of(Objects.requireNonNull(serviceArn));
            return this;
        }
        public CustomDomainAssociationArgs build() {
            return new CustomDomainAssociationArgs(domainName, enableWwwSubdomain, serviceArn);
        }
    }
}