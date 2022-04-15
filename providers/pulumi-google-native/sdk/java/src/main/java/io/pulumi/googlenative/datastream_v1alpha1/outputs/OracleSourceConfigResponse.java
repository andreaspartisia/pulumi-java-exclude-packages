// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datastream_v1alpha1.outputs.OracleRdbmsResponse;
import java.util.Objects;

@CustomType
public final class OracleSourceConfigResponse {
    /**
     * Oracle objects to include in the stream.
     * 
     */
    private final OracleRdbmsResponse allowlist;
    /**
     * Oracle objects to exclude from the stream.
     * 
     */
    private final OracleRdbmsResponse rejectlist;

    @CustomType.Constructor
    private OracleSourceConfigResponse(
        @CustomType.Parameter("allowlist") OracleRdbmsResponse allowlist,
        @CustomType.Parameter("rejectlist") OracleRdbmsResponse rejectlist) {
        this.allowlist = allowlist;
        this.rejectlist = rejectlist;
    }

    /**
     * Oracle objects to include in the stream.
     * 
    */
    public OracleRdbmsResponse allowlist() {
        return this.allowlist;
    }
    /**
     * Oracle objects to exclude from the stream.
     * 
    */
    public OracleRdbmsResponse rejectlist() {
        return this.rejectlist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleRdbmsResponse allowlist;
        private OracleRdbmsResponse rejectlist;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlist = defaults.allowlist;
    	      this.rejectlist = defaults.rejectlist;
        }

        public Builder allowlist(OracleRdbmsResponse allowlist) {
            this.allowlist = Objects.requireNonNull(allowlist);
            return this;
        }
        public Builder rejectlist(OracleRdbmsResponse rejectlist) {
            this.rejectlist = Objects.requireNonNull(rejectlist);
            return this;
        }        public OracleSourceConfigResponse build() {
            return new OracleSourceConfigResponse(allowlist, rejectlist);
        }
    }
}
