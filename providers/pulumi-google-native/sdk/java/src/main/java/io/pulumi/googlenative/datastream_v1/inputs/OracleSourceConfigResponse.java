// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.datastream_v1.inputs.OracleRdbmsResponse;
import java.util.Objects;


public final class OracleSourceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final OracleSourceConfigResponse Empty = new OracleSourceConfigResponse();

    @InputImport(name="excludeObjects", required=true)
    private final OracleRdbmsResponse excludeObjects;

    public OracleRdbmsResponse getExcludeObjects() {
        return this.excludeObjects;
    }

    @InputImport(name="includeObjects", required=true)
    private final OracleRdbmsResponse includeObjects;

    public OracleRdbmsResponse getIncludeObjects() {
        return this.includeObjects;
    }

    public OracleSourceConfigResponse(
        OracleRdbmsResponse excludeObjects,
        OracleRdbmsResponse includeObjects) {
        this.excludeObjects = Objects.requireNonNull(excludeObjects, "expected parameter 'excludeObjects' to be non-null");
        this.includeObjects = Objects.requireNonNull(includeObjects, "expected parameter 'includeObjects' to be non-null");
    }

    private OracleSourceConfigResponse() {
        this.excludeObjects = null;
        this.includeObjects = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleSourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleRdbmsResponse excludeObjects;
        private OracleRdbmsResponse includeObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleSourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeObjects = defaults.excludeObjects;
    	      this.includeObjects = defaults.includeObjects;
        }

        public Builder setExcludeObjects(OracleRdbmsResponse excludeObjects) {
            this.excludeObjects = Objects.requireNonNull(excludeObjects);
            return this;
        }

        public Builder setIncludeObjects(OracleRdbmsResponse includeObjects) {
            this.includeObjects = Objects.requireNonNull(includeObjects);
            return this;
        }

        public OracleSourceConfigResponse build() {
            return new OracleSourceConfigResponse(excludeObjects, includeObjects);
        }
    }
}