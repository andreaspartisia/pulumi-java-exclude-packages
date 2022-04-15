// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.OracleRdbmsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Oracle data source configuration
 * 
 */
public final class OracleSourceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final OracleSourceConfigArgs Empty = new OracleSourceConfigArgs();

    /**
     * Oracle objects to include in the stream.
     * 
     */
    @Import(name="allowlist")
      private final @Nullable Output<OracleRdbmsArgs> allowlist;

    public Output<OracleRdbmsArgs> allowlist() {
        return this.allowlist == null ? Codegen.empty() : this.allowlist;
    }

    /**
     * Oracle objects to exclude from the stream.
     * 
     */
    @Import(name="rejectlist")
      private final @Nullable Output<OracleRdbmsArgs> rejectlist;

    public Output<OracleRdbmsArgs> rejectlist() {
        return this.rejectlist == null ? Codegen.empty() : this.rejectlist;
    }

    public OracleSourceConfigArgs(
        @Nullable Output<OracleRdbmsArgs> allowlist,
        @Nullable Output<OracleRdbmsArgs> rejectlist) {
        this.allowlist = allowlist;
        this.rejectlist = rejectlist;
    }

    private OracleSourceConfigArgs() {
        this.allowlist = Codegen.empty();
        this.rejectlist = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OracleRdbmsArgs> allowlist;
        private @Nullable Output<OracleRdbmsArgs> rejectlist;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSourceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlist = defaults.allowlist;
    	      this.rejectlist = defaults.rejectlist;
        }

        public Builder allowlist(@Nullable Output<OracleRdbmsArgs> allowlist) {
            this.allowlist = allowlist;
            return this;
        }
        public Builder allowlist(@Nullable OracleRdbmsArgs allowlist) {
            this.allowlist = Codegen.ofNullable(allowlist);
            return this;
        }
        public Builder rejectlist(@Nullable Output<OracleRdbmsArgs> rejectlist) {
            this.rejectlist = rejectlist;
            return this;
        }
        public Builder rejectlist(@Nullable OracleRdbmsArgs rejectlist) {
            this.rejectlist = Codegen.ofNullable(rejectlist);
            return this;
        }        public OracleSourceConfigArgs build() {
            return new OracleSourceConfigArgs(allowlist, rejectlist);
        }
    }
}
