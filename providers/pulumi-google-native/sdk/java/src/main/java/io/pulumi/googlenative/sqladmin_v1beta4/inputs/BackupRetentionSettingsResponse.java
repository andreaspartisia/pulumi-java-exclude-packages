// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * We currently only support backup retention by specifying the number of backups we will retain.
 * 
 */
public final class BackupRetentionSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackupRetentionSettingsResponse Empty = new BackupRetentionSettingsResponse();

    /**
     * Depending on the value of retention_unit, this is used to determine if a backup needs to be deleted. If retention_unit is 'COUNT', we will retain this many backups.
     * 
     */
    @Import(name="retainedBackups", required=true)
      private final Integer retainedBackups;

    public Integer retainedBackups() {
        return this.retainedBackups;
    }

    /**
     * The unit that 'retained_backups' represents.
     * 
     */
    @Import(name="retentionUnit", required=true)
      private final String retentionUnit;

    public String retentionUnit() {
        return this.retentionUnit;
    }

    public BackupRetentionSettingsResponse(
        Integer retainedBackups,
        String retentionUnit) {
        this.retainedBackups = Objects.requireNonNull(retainedBackups, "expected parameter 'retainedBackups' to be non-null");
        this.retentionUnit = Objects.requireNonNull(retentionUnit, "expected parameter 'retentionUnit' to be non-null");
    }

    private BackupRetentionSettingsResponse() {
        this.retainedBackups = null;
        this.retentionUnit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupRetentionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer retainedBackups;
        private String retentionUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupRetentionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retainedBackups = defaults.retainedBackups;
    	      this.retentionUnit = defaults.retentionUnit;
        }

        public Builder retainedBackups(Integer retainedBackups) {
            this.retainedBackups = Objects.requireNonNull(retainedBackups);
            return this;
        }
        public Builder retentionUnit(String retentionUnit) {
            this.retentionUnit = Objects.requireNonNull(retentionUnit);
            return this;
        }        public BackupRetentionSettingsResponse build() {
            return new BackupRetentionSettingsResponse(retainedBackups, retentionUnit);
        }
    }
}
