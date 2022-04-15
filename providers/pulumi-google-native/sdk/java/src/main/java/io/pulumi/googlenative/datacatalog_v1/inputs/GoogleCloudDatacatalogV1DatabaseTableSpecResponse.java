// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specification that applies to a table resource. Valid only for entries with the `TABLE` type.
 * 
 */
public final class GoogleCloudDatacatalogV1DatabaseTableSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1DatabaseTableSpecResponse Empty = new GoogleCloudDatacatalogV1DatabaseTableSpecResponse();

    /**
     * Type of this table.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public GoogleCloudDatacatalogV1DatabaseTableSpecResponse(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDatacatalogV1DatabaseTableSpecResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1DatabaseTableSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1DatabaseTableSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudDatacatalogV1DatabaseTableSpecResponse build() {
            return new GoogleCloudDatacatalogV1DatabaseTableSpecResponse(type);
        }
    }
}
