// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApiGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentSpecificationRouteRequestPoliciesHeaderTransformationsSetHeadersItem {
    /**
     * @return (Updatable) If a header with the same name already exists in the request, OVERWRITE will overwrite the value, APPEND will append to the existing value, or SKIP will keep the existing value.
     * 
     */
    private final @Nullable String ifExists;
    /**
     * @return (Updatable) The case-insensitive name of the header.  This name must be unique across transformation policies.
     * 
     */
    private final String name;
    /**
     * @return (Updatable) A list of new values.  Each value can be a constant or may include one or more expressions enclosed within ${} delimiters.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private DeploymentSpecificationRouteRequestPoliciesHeaderTransformationsSetHeadersItem(
        @CustomType.Parameter("ifExists") @Nullable String ifExists,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("values") List<String> values) {
        this.ifExists = ifExists;
        this.name = name;
        this.values = values;
    }

    /**
     * @return (Updatable) If a header with the same name already exists in the request, OVERWRITE will overwrite the value, APPEND will append to the existing value, or SKIP will keep the existing value.
     * 
     */
    public Optional<String> ifExists() {
        return Optional.ofNullable(this.ifExists);
    }
    /**
     * @return (Updatable) The case-insensitive name of the header.  This name must be unique across transformation policies.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Updatable) A list of new values.  Each value can be a constant or may include one or more expressions enclosed within ${} delimiters.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSpecificationRouteRequestPoliciesHeaderTransformationsSetHeadersItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ifExists;
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSpecificationRouteRequestPoliciesHeaderTransformationsSetHeadersItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ifExists = defaults.ifExists;
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder ifExists(@Nullable String ifExists) {
            this.ifExists = ifExists;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public DeploymentSpecificationRouteRequestPoliciesHeaderTransformationsSetHeadersItem build() {
            return new DeploymentSpecificationRouteRequestPoliciesHeaderTransformationsSetHeadersItem(ifExists, name, values);
        }
    }
}
