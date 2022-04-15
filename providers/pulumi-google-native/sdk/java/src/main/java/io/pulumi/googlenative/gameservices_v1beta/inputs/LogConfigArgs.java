// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.gameservices_v1beta.inputs.CloudAuditOptionsArgs;
import io.pulumi.googlenative.gameservices_v1beta.inputs.CounterOptionsArgs;
import io.pulumi.googlenative.gameservices_v1beta.inputs.DataAccessOptionsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies what kind of log the caller must write
 * 
 */
public final class LogConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogConfigArgs Empty = new LogConfigArgs();

    /**
     * Cloud audit options.
     * 
     */
    @Import(name="cloudAudit")
      private final @Nullable Output<CloudAuditOptionsArgs> cloudAudit;

    public Output<CloudAuditOptionsArgs> cloudAudit() {
        return this.cloudAudit == null ? Codegen.empty() : this.cloudAudit;
    }

    /**
     * Counter options.
     * 
     */
    @Import(name="counter")
      private final @Nullable Output<CounterOptionsArgs> counter;

    public Output<CounterOptionsArgs> counter() {
        return this.counter == null ? Codegen.empty() : this.counter;
    }

    /**
     * Data access options.
     * 
     */
    @Import(name="dataAccess")
      private final @Nullable Output<DataAccessOptionsArgs> dataAccess;

    public Output<DataAccessOptionsArgs> dataAccess() {
        return this.dataAccess == null ? Codegen.empty() : this.dataAccess;
    }

    public LogConfigArgs(
        @Nullable Output<CloudAuditOptionsArgs> cloudAudit,
        @Nullable Output<CounterOptionsArgs> counter,
        @Nullable Output<DataAccessOptionsArgs> dataAccess) {
        this.cloudAudit = cloudAudit;
        this.counter = counter;
        this.dataAccess = dataAccess;
    }

    private LogConfigArgs() {
        this.cloudAudit = Codegen.empty();
        this.counter = Codegen.empty();
        this.dataAccess = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CloudAuditOptionsArgs> cloudAudit;
        private @Nullable Output<CounterOptionsArgs> counter;
        private @Nullable Output<DataAccessOptionsArgs> dataAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudAudit = defaults.cloudAudit;
    	      this.counter = defaults.counter;
    	      this.dataAccess = defaults.dataAccess;
        }

        public Builder cloudAudit(@Nullable Output<CloudAuditOptionsArgs> cloudAudit) {
            this.cloudAudit = cloudAudit;
            return this;
        }
        public Builder cloudAudit(@Nullable CloudAuditOptionsArgs cloudAudit) {
            this.cloudAudit = Codegen.ofNullable(cloudAudit);
            return this;
        }
        public Builder counter(@Nullable Output<CounterOptionsArgs> counter) {
            this.counter = counter;
            return this;
        }
        public Builder counter(@Nullable CounterOptionsArgs counter) {
            this.counter = Codegen.ofNullable(counter);
            return this;
        }
        public Builder dataAccess(@Nullable Output<DataAccessOptionsArgs> dataAccess) {
            this.dataAccess = dataAccess;
            return this;
        }
        public Builder dataAccess(@Nullable DataAccessOptionsArgs dataAccess) {
            this.dataAccess = Codegen.ofNullable(dataAccess);
            return this;
        }        public LogConfigArgs build() {
            return new LogConfigArgs(cloudAudit, counter, dataAccess);
        }
    }
}
