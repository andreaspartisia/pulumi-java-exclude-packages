// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlElasticPoolResourceSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlElasticPoolResourceSettingsResponse Empty = new SqlElasticPoolResourceSettingsResponse();

    @InputImport(name="resourceType", required=true)
    private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    @InputImport(name="targetResourceName", required=true)
    private final String targetResourceName;

    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    @InputImport(name="zoneRedundant")
    private final @Nullable String zoneRedundant;

    public Optional<String> getZoneRedundant() {
        return this.zoneRedundant == null ? Optional.empty() : Optional.ofNullable(this.zoneRedundant);
    }

    public SqlElasticPoolResourceSettingsResponse(
        String resourceType,
        String targetResourceName,
        @Nullable String zoneRedundant) {
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
        this.zoneRedundant = zoneRedundant;
    }

    private SqlElasticPoolResourceSettingsResponse() {
        this.resourceType = null;
        this.targetResourceName = null;
        this.zoneRedundant = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlElasticPoolResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private String targetResourceName;
        private @Nullable String zoneRedundant;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlElasticPoolResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.zoneRedundant = defaults.zoneRedundant;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setTargetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder setZoneRedundant(@Nullable String zoneRedundant) {
            this.zoneRedundant = zoneRedundant;
            return this;
        }

        public SqlElasticPoolResourceSettingsResponse build() {
            return new SqlElasticPoolResourceSettingsResponse(resourceType, targetResourceName, zoneRedundant);
        }
    }
}