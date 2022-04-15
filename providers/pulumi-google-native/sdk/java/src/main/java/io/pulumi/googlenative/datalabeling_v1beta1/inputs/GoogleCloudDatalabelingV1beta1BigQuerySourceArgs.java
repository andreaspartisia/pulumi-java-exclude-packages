// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The BigQuery location for input data. If used in an EvaluationJob, this is where the service saves the prediction input and output sampled from the model version.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1BigQuerySourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatalabelingV1beta1BigQuerySourceArgs Empty = new GoogleCloudDatalabelingV1beta1BigQuerySourceArgs();

    /**
     * BigQuery URI to a table, up to 2,000 characters long. If you specify the URI of a table that does not exist, Data Labeling Service creates a table at the URI with the correct schema when you create your EvaluationJob. If you specify the URI of a table that already exists, it must have the [correct schema](/ml-engine/docs/continuous-evaluation/create-job#table-schema). Provide the table URI in the following format: "bq://{your_project_id}/ {your_dataset_name}/{your_table_name}" [Learn more](/ml-engine/docs/continuous-evaluation/create-job#table-schema).
     * 
     */
    @Import(name="inputUri", required=true)
      private final Output<String> inputUri;

    public Output<String> inputUri() {
        return this.inputUri;
    }

    public GoogleCloudDatalabelingV1beta1BigQuerySourceArgs(Output<String> inputUri) {
        this.inputUri = Objects.requireNonNull(inputUri, "expected parameter 'inputUri' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1BigQuerySourceArgs() {
        this.inputUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1BigQuerySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> inputUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1BigQuerySourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputUri = defaults.inputUri;
        }

        public Builder inputUri(Output<String> inputUri) {
            this.inputUri = Objects.requireNonNull(inputUri);
            return this;
        }
        public Builder inputUri(String inputUri) {
            this.inputUri = Output.of(Objects.requireNonNull(inputUri));
            return this;
        }        public GoogleCloudDatalabelingV1beta1BigQuerySourceArgs build() {
            return new GoogleCloudDatalabelingV1beta1BigQuerySourceArgs(inputUri);
        }
    }
}
