// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.AiAnomalyDetection.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDetectionModelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDetectionModelArgs Empty = new GetDetectionModelArgs();

    /**
     * The OCID of the Model.
     * 
     */
    @Import(name="modelId", required=true)
    private String modelId;

    /**
     * @return The OCID of the Model.
     * 
     */
    public String modelId() {
        return this.modelId;
    }

    private GetDetectionModelArgs() {}

    private GetDetectionModelArgs(GetDetectionModelArgs $) {
        this.modelId = $.modelId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDetectionModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDetectionModelArgs $;

        public Builder() {
            $ = new GetDetectionModelArgs();
        }

        public Builder(GetDetectionModelArgs defaults) {
            $ = new GetDetectionModelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param modelId The OCID of the Model.
         * 
         * @return builder
         * 
         */
        public Builder modelId(String modelId) {
            $.modelId = modelId;
            return this;
        }

        public GetDetectionModelArgs build() {
            $.modelId = Objects.requireNonNull($.modelId, "expected parameter 'modelId' to be non-null");
            return $;
        }
    }

}
