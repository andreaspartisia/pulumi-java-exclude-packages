// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datastream_v1.inputs.MysqlRdbmsResponse;
import java.util.Objects;


/**
 * MySQL source configuration
 * 
 */
public final class MysqlSourceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final MysqlSourceConfigResponse Empty = new MysqlSourceConfigResponse();

    /**
     * MySQL objects to exclude from the stream.
     * 
     */
    @Import(name="excludeObjects", required=true)
      private final MysqlRdbmsResponse excludeObjects;

    public MysqlRdbmsResponse excludeObjects() {
        return this.excludeObjects;
    }

    /**
     * MySQL objects to retrieve from the source.
     * 
     */
    @Import(name="includeObjects", required=true)
      private final MysqlRdbmsResponse includeObjects;

    public MysqlRdbmsResponse includeObjects() {
        return this.includeObjects;
    }

    public MysqlSourceConfigResponse(
        MysqlRdbmsResponse excludeObjects,
        MysqlRdbmsResponse includeObjects) {
        this.excludeObjects = Objects.requireNonNull(excludeObjects, "expected parameter 'excludeObjects' to be non-null");
        this.includeObjects = Objects.requireNonNull(includeObjects, "expected parameter 'includeObjects' to be non-null");
    }

    private MysqlSourceConfigResponse() {
        this.excludeObjects = null;
        this.includeObjects = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlSourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlRdbmsResponse excludeObjects;
        private MysqlRdbmsResponse includeObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlSourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeObjects = defaults.excludeObjects;
    	      this.includeObjects = defaults.includeObjects;
        }

        public Builder excludeObjects(MysqlRdbmsResponse excludeObjects) {
            this.excludeObjects = Objects.requireNonNull(excludeObjects);
            return this;
        }
        public Builder includeObjects(MysqlRdbmsResponse includeObjects) {
            this.includeObjects = Objects.requireNonNull(includeObjects);
            return this;
        }        public MysqlSourceConfigResponse build() {
            return new MysqlSourceConfigResponse(excludeObjects, includeObjects);
        }
    }
}
