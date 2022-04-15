// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.clouddeploy_v1.inputs.PipelineConditionResponse;
import io.pulumi.googlenative.clouddeploy_v1.inputs.SerialPipelineResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * A `DeliveryPipeline` resource in the Google Cloud Deploy API. A `DeliveryPipeline` defines a pipeline through which a Skaffold configuration can progress.
 * 
 */
public final class DeliveryPipelineResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryPipelineResponse Empty = new DeliveryPipelineResponse();

    /**
     * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    @Import(name="annotations", required=true)
      private final Map<String,String> annotations;

    public Map<String,String> annotations() {
        return this.annotations;
    }

    /**
     * Information around the state of the Delivery Pipeline.
     * 
     */
    @Import(name="condition", required=true)
      private final PipelineConditionResponse condition;

    public PipelineConditionResponse condition() {
        return this.condition;
    }

    /**
     * Time at which the pipeline was created.
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * Description of the `DeliveryPipeline`. Max length is 255 characters.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * Optional. Name of the `DeliveryPipeline`. Format is projects/{project}/ locations/{location}/deliveryPipelines/a-z{0,62}.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
     * 
     */
    @Import(name="serialPipeline", required=true)
      private final SerialPipelineResponse serialPipeline;

    public SerialPipelineResponse serialPipeline() {
        return this.serialPipeline;
    }

    /**
     * Unique identifier of the `DeliveryPipeline`.
     * 
     */
    @Import(name="uid", required=true)
      private final String uid;

    public String uid() {
        return this.uid;
    }

    /**
     * Most recent time at which the pipeline was updated.
     * 
     */
    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String updateTime() {
        return this.updateTime;
    }

    public DeliveryPipelineResponse(
        Map<String,String> annotations,
        PipelineConditionResponse condition,
        String createTime,
        String description,
        String etag,
        Map<String,String> labels,
        String name,
        SerialPipelineResponse serialPipeline,
        String uid,
        String updateTime) {
        this.annotations = Objects.requireNonNull(annotations, "expected parameter 'annotations' to be non-null");
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.serialPipeline = Objects.requireNonNull(serialPipeline, "expected parameter 'serialPipeline' to be non-null");
        this.uid = Objects.requireNonNull(uid, "expected parameter 'uid' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private DeliveryPipelineResponse() {
        this.annotations = Map.of();
        this.condition = null;
        this.createTime = null;
        this.description = null;
        this.etag = null;
        this.labels = Map.of();
        this.name = null;
        this.serialPipeline = null;
        this.uid = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPipelineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> annotations;
        private PipelineConditionResponse condition;
        private String createTime;
        private String description;
        private String etag;
        private Map<String,String> labels;
        private String name;
        private SerialPipelineResponse serialPipeline;
        private String uid;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryPipelineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.condition = defaults.condition;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.serialPipeline = defaults.serialPipeline;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder condition(PipelineConditionResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder serialPipeline(SerialPipelineResponse serialPipeline) {
            this.serialPipeline = Objects.requireNonNull(serialPipeline);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public DeliveryPipelineResponse build() {
            return new DeliveryPipelineResponse(annotations, condition, createTime, description, etag, labels, name, serialPipeline, uid, updateTime);
        }
    }
}
