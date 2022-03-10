// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetNetworkInterfacesFilter extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkInterfacesFilter Empty = new GetNetworkInterfacesFilter();

    /**
     * The name of the field to filter by, as defined by
     * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInterfaces.html).
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Set of values that are accepted for the given field.
     * 
     */
    @InputImport(name="values", required=true)
      private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public GetNetworkInterfacesFilter(
        String name,
        List<String> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private GetNetworkInterfacesFilter() {
        this.name = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfacesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInterfacesFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetNetworkInterfacesFilter build() {
            return new GetNetworkInterfacesFilter(name, values);
        }
    }
}