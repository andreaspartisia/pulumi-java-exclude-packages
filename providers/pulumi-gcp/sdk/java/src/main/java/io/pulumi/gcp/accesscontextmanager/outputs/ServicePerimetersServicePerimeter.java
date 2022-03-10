// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterSpec;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterStatus;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicePerimetersServicePerimeter {
    /**
     * - 
     * Time the AccessPolicy was created in UTC.
     * 
     */
    private final @Nullable String createTime;
    /**
     * Description of the ServicePerimeter and its use. Does not affect
     * behavior.
     * 
     */
    private final @Nullable String description;
    /**
     * Resource name for the ServicePerimeter. The short_name component must
     * begin with a letter and only include alphanumeric and '_'.
     * Format: accessPolicies/{policy_id}/servicePerimeters/{short_name}
     * 
     */
    private final String name;
    /**
     * Specifies the type of the Perimeter. There are two types: regular and
     * bridge. Regular Service Perimeter contains resources, access levels,
     * and restricted services. Every resource can be in at most
     * ONE regular Service Perimeter.
     * In addition to being in a regular service perimeter, a resource can also
     * be in zero or more perimeter bridges. A perimeter bridge only contains
     * resources. Cross project operations are permitted if all effected
     * resources share some perimeter (whether bridge or regular). Perimeter
     * Bridge does not contain access levels or services: those are governed
     * entirely by the regular perimeter that resource is in.
     * Perimeter Bridges are typically useful when building more complex
     * topologies with many independent perimeters that need to share some data
     * with a common perimeter, but should not be able to share data among
     * themselves.
     * Default value is `PERIMETER_TYPE_REGULAR`.
     * Possible values are `PERIMETER_TYPE_REGULAR` and `PERIMETER_TYPE_BRIDGE`.
     * 
     */
    private final @Nullable String perimeterType;
    /**
     * Proposed (or dry run) ServicePerimeter configuration.
     * This configuration allows to specify and test ServicePerimeter configuration
     * without enforcing actual access restrictions. Only allowed to be set when
     * the `useExplicitDryRunSpec` flag is set.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimetersServicePerimeterSpec spec;
    /**
     * ServicePerimeter configuration. Specifies sets of resources,
     * restricted services and access levels that determine
     * perimeter content and boundaries.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimetersServicePerimeterStatus status;
    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    private final String title;
    /**
     * - 
     * Time the AccessPolicy was updated in UTC.
     * 
     */
    private final @Nullable String updateTime;
    /**
     * Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists
     * for all Service Perimeters, and that spec is identical to the status for those
     * Service Perimeters. When this flag is set, it inhibits the generation of the
     * implicit spec, thereby allowing the user to explicitly provide a
     * configuration ("spec") to use in a dry-run version of the Service Perimeter.
     * This allows the user to test changes to the enforced config ("status") without
     * actually enforcing them. This testing is done through analyzing the differences
     * between currently enforced and suggested restrictions. useExplicitDryRunSpec must
     * bet set to True if any of the fields in the spec are set to non-default values.
     * 
     */
    private final @Nullable Boolean useExplicitDryRunSpec;

    @OutputCustomType.Constructor
    private ServicePerimetersServicePerimeter(
        @OutputCustomType.Parameter("createTime") @Nullable String createTime,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("perimeterType") @Nullable String perimeterType,
        @OutputCustomType.Parameter("spec") @Nullable ServicePerimetersServicePerimeterSpec spec,
        @OutputCustomType.Parameter("status") @Nullable ServicePerimetersServicePerimeterStatus status,
        @OutputCustomType.Parameter("title") String title,
        @OutputCustomType.Parameter("updateTime") @Nullable String updateTime,
        @OutputCustomType.Parameter("useExplicitDryRunSpec") @Nullable Boolean useExplicitDryRunSpec) {
        this.createTime = createTime;
        this.description = description;
        this.name = name;
        this.perimeterType = perimeterType;
        this.spec = spec;
        this.status = status;
        this.title = title;
        this.updateTime = updateTime;
        this.useExplicitDryRunSpec = useExplicitDryRunSpec;
    }

    /**
     * - 
     * Time the AccessPolicy was created in UTC.
     * 
    */
    public Optional<String> getCreateTime() {
        return Optional.ofNullable(this.createTime);
    }
    /**
     * Description of the ServicePerimeter and its use. Does not affect
     * behavior.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Resource name for the ServicePerimeter. The short_name component must
     * begin with a letter and only include alphanumeric and '_'.
     * Format: accessPolicies/{policy_id}/servicePerimeters/{short_name}
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the type of the Perimeter. There are two types: regular and
     * bridge. Regular Service Perimeter contains resources, access levels,
     * and restricted services. Every resource can be in at most
     * ONE regular Service Perimeter.
     * In addition to being in a regular service perimeter, a resource can also
     * be in zero or more perimeter bridges. A perimeter bridge only contains
     * resources. Cross project operations are permitted if all effected
     * resources share some perimeter (whether bridge or regular). Perimeter
     * Bridge does not contain access levels or services: those are governed
     * entirely by the regular perimeter that resource is in.
     * Perimeter Bridges are typically useful when building more complex
     * topologies with many independent perimeters that need to share some data
     * with a common perimeter, but should not be able to share data among
     * themselves.
     * Default value is `PERIMETER_TYPE_REGULAR`.
     * Possible values are `PERIMETER_TYPE_REGULAR` and `PERIMETER_TYPE_BRIDGE`.
     * 
    */
    public Optional<String> getPerimeterType() {
        return Optional.ofNullable(this.perimeterType);
    }
    /**
     * Proposed (or dry run) ServicePerimeter configuration.
     * This configuration allows to specify and test ServicePerimeter configuration
     * without enforcing actual access restrictions. Only allowed to be set when
     * the `useExplicitDryRunSpec` flag is set.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimetersServicePerimeterSpec> getSpec() {
        return Optional.ofNullable(this.spec);
    }
    /**
     * ServicePerimeter configuration. Specifies sets of resources,
     * restricted services and access levels that determine
     * perimeter content and boundaries.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimetersServicePerimeterStatus> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Human readable title. Must be unique within the Policy.
     * 
    */
    public String getTitle() {
        return this.title;
    }
    /**
     * - 
     * Time the AccessPolicy was updated in UTC.
     * 
    */
    public Optional<String> getUpdateTime() {
        return Optional.ofNullable(this.updateTime);
    }
    /**
     * Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists
     * for all Service Perimeters, and that spec is identical to the status for those
     * Service Perimeters. When this flag is set, it inhibits the generation of the
     * implicit spec, thereby allowing the user to explicitly provide a
     * configuration ("spec") to use in a dry-run version of the Service Perimeter.
     * This allows the user to test changes to the enforced config ("status") without
     * actually enforcing them. This testing is done through analyzing the differences
     * between currently enforced and suggested restrictions. useExplicitDryRunSpec must
     * bet set to True if any of the fields in the spec are set to non-default values.
     * 
    */
    public Optional<Boolean> getUseExplicitDryRunSpec() {
        return Optional.ofNullable(this.useExplicitDryRunSpec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createTime;
        private @Nullable String description;
        private String name;
        private @Nullable String perimeterType;
        private @Nullable ServicePerimetersServicePerimeterSpec spec;
        private @Nullable ServicePerimetersServicePerimeterStatus status;
        private String title;
        private @Nullable String updateTime;
        private @Nullable Boolean useExplicitDryRunSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.perimeterType = defaults.perimeterType;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
    	      this.title = defaults.title;
    	      this.updateTime = defaults.updateTime;
    	      this.useExplicitDryRunSpec = defaults.useExplicitDryRunSpec;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPerimeterType(@Nullable String perimeterType) {
            this.perimeterType = perimeterType;
            return this;
        }

        public Builder setSpec(@Nullable ServicePerimetersServicePerimeterSpec spec) {
            this.spec = spec;
            return this;
        }

        public Builder setStatus(@Nullable ServicePerimetersServicePerimeterStatus status) {
            this.status = status;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUseExplicitDryRunSpec(@Nullable Boolean useExplicitDryRunSpec) {
            this.useExplicitDryRunSpec = useExplicitDryRunSpec;
            return this;
        }
        public ServicePerimetersServicePerimeter build() {
            return new ServicePerimetersServicePerimeter(createTime, description, name, perimeterType, spec, status, title, updateTime, useExplicitDryRunSpec);
        }
    }
}
