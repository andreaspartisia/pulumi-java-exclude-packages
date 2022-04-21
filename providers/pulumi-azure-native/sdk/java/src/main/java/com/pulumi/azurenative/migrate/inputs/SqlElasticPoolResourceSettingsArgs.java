// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.azurenative.migrate.enums.ZoneRedundant;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the Sql ElasticPool resource settings.
 * 
 */
public final class SqlElasticPoolResourceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlElasticPoolResourceSettingsArgs Empty = new SqlElasticPoolResourceSettingsArgs();

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Sql/servers/elasticPools&#39;.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @Import(name="targetResourceName", required=true)
    private Output<String> targetResourceName;

    public Output<String> targetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Defines the zone redundant resource setting.
     * 
     */
    @Import(name="zoneRedundant")
    private @Nullable Output<Either<String,ZoneRedundant>> zoneRedundant;

    public Optional<Output<Either<String,ZoneRedundant>>> zoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    private SqlElasticPoolResourceSettingsArgs() {}

    private SqlElasticPoolResourceSettingsArgs(SqlElasticPoolResourceSettingsArgs $) {
        this.resourceType = $.resourceType;
        this.targetResourceName = $.targetResourceName;
        this.zoneRedundant = $.zoneRedundant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlElasticPoolResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlElasticPoolResourceSettingsArgs $;

        public Builder() {
            $ = new SqlElasticPoolResourceSettingsArgs();
        }

        public Builder(SqlElasticPoolResourceSettingsArgs defaults) {
            $ = new SqlElasticPoolResourceSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public Builder targetResourceName(Output<String> targetResourceName) {
            $.targetResourceName = targetResourceName;
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            return targetResourceName(Output.of(targetResourceName));
        }

        public Builder zoneRedundant(@Nullable Output<Either<String,ZoneRedundant>> zoneRedundant) {
            $.zoneRedundant = zoneRedundant;
            return this;
        }

        public Builder zoneRedundant(Either<String,ZoneRedundant> zoneRedundant) {
            return zoneRedundant(Output.of(zoneRedundant));
        }

        public Builder zoneRedundant(String zoneRedundant) {
            return zoneRedundant(Either.ofLeft(zoneRedundant));
        }

        public Builder zoneRedundant(ZoneRedundant zoneRedundant) {
            return zoneRedundant(Either.ofRight(zoneRedundant));
        }

        public SqlElasticPoolResourceSettingsArgs build() {
            $.resourceType = Codegen.stringProp("resourceType").output().arg($.resourceType).require();
            $.targetResourceName = Objects.requireNonNull($.targetResourceName, "expected parameter 'targetResourceName' to be non-null");
            return $;
        }
    }

}
