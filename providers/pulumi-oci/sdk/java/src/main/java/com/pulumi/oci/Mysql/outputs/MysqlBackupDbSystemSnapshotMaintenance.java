// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MysqlBackupDbSystemSnapshotMaintenance {
    /**
     * @return The start time of the maintenance window.
     * 
     */
    private final @Nullable String windowStartTime;

    @CustomType.Constructor
    private MysqlBackupDbSystemSnapshotMaintenance(@CustomType.Parameter("windowStartTime") @Nullable String windowStartTime) {
        this.windowStartTime = windowStartTime;
    }

    /**
     * @return The start time of the maintenance window.
     * 
     */
    public Optional<String> windowStartTime() {
        return Optional.ofNullable(this.windowStartTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlBackupDbSystemSnapshotMaintenance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String windowStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlBackupDbSystemSnapshotMaintenance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.windowStartTime = defaults.windowStartTime;
        }

        public Builder windowStartTime(@Nullable String windowStartTime) {
            this.windowStartTime = windowStartTime;
            return this;
        }        public MysqlBackupDbSystemSnapshotMaintenance build() {
            return new MysqlBackupDbSystemSnapshotMaintenance(windowStartTime);
        }
    }
}
