// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Specifies how metastore metadata should be integrated with the Dataplex service.
 * 
 */
public final class DataplexConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataplexConfigResponse Empty = new DataplexConfigResponse();

    /**
     * A reference to the Lake resources that this metastore service is attached to. The key is the lake resource name. Example: projects/{project_number}/locations/{location_id}/lakes/{lake_id}.
     * 
     */
    @Import(name="lakeResources", required=true)
      private final Map<String,String> lakeResources;

    public Map<String,String> lakeResources() {
        return this.lakeResources;
    }

    public DataplexConfigResponse(Map<String,String> lakeResources) {
        this.lakeResources = Objects.requireNonNull(lakeResources, "expected parameter 'lakeResources' to be non-null");
    }

    private DataplexConfigResponse() {
        this.lakeResources = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataplexConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> lakeResources;

        public Builder() {
    	      // Empty
        }

        public Builder(DataplexConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lakeResources = defaults.lakeResources;
        }

        public Builder lakeResources(Map<String,String> lakeResources) {
            this.lakeResources = Objects.requireNonNull(lakeResources);
            return this;
        }        public DataplexConfigResponse build() {
            return new DataplexConfigResponse(lakeResources);
        }
    }
}
