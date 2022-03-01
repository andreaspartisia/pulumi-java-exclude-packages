// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecDnsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecDnsConfigArgs Empty = new ServiceTaskSpecContainerSpecDnsConfigArgs();

    @InputImport(name="nameservers", required=true)
      private final Input<List<String>> nameservers;

    public Input<List<String>> getNameservers() {
        return this.nameservers;
    }

    @InputImport(name="options")
      private final @Nullable Input<List<String>> options;

    public Input<List<String>> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    @InputImport(name="searches")
      private final @Nullable Input<List<String>> searches;

    public Input<List<String>> getSearches() {
        return this.searches == null ? Input.empty() : this.searches;
    }

    public ServiceTaskSpecContainerSpecDnsConfigArgs(
        Input<List<String>> nameservers,
        @Nullable Input<List<String>> options,
        @Nullable Input<List<String>> searches) {
        this.nameservers = Objects.requireNonNull(nameservers, "expected parameter 'nameservers' to be non-null");
        this.options = options;
        this.searches = searches;
    }

    private ServiceTaskSpecContainerSpecDnsConfigArgs() {
        this.nameservers = Input.empty();
        this.options = Input.empty();
        this.searches = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecDnsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> nameservers;
        private @Nullable Input<List<String>> options;
        private @Nullable Input<List<String>> searches;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecDnsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameservers = defaults.nameservers;
    	      this.options = defaults.options;
    	      this.searches = defaults.searches;
        }

        public Builder setNameservers(Input<List<String>> nameservers) {
            this.nameservers = Objects.requireNonNull(nameservers);
            return this;
        }

        public Builder setNameservers(List<String> nameservers) {
            this.nameservers = Input.of(Objects.requireNonNull(nameservers));
            return this;
        }

        public Builder setOptions(@Nullable Input<List<String>> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable List<String> options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setSearches(@Nullable Input<List<String>> searches) {
            this.searches = searches;
            return this;
        }

        public Builder setSearches(@Nullable List<String> searches) {
            this.searches = Input.ofNullable(searches);
            return this;
        }
        public ServiceTaskSpecContainerSpecDnsConfigArgs build() {
            return new ServiceTaskSpecContainerSpecDnsConfigArgs(nameservers, options, searches);
        }
    }
}
