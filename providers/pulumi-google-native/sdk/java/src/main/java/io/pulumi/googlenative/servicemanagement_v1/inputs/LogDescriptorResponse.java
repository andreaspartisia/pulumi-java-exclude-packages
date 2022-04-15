// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.LabelDescriptorResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A description of a log type. Example in YAML format: - name: library.googleapis.com/activity_history description: The history of borrowing and returning library items. display_name: Activity labels: - key: /customer_id description: Identifier of a library customer
 * 
 */
public final class LogDescriptorResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogDescriptorResponse Empty = new LogDescriptorResponse();

    /**
     * A human-readable description of this log. This information appears in the documentation and can contain details.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * The human-readable name for this log. This information appears on the user interface and should be concise.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * The set of labels that are available to describe a specific log entry. Runtime requests that contain labels not specified here are considered invalid.
     * 
     */
    @Import(name="labels", required=true)
      private final List<LabelDescriptorResponse> labels;

    public List<LabelDescriptorResponse> labels() {
        return this.labels;
    }

    /**
     * The name of the log. It must be less than 512 characters long and can include the following characters: upper- and lower-case alphanumeric characters [A-Za-z0-9], and punctuation characters including slash, underscore, hyphen, period [/_-.].
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public LogDescriptorResponse(
        String description,
        String displayName,
        List<LabelDescriptorResponse> labels,
        String name) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private LogDescriptorResponse() {
        this.description = null;
        this.displayName = null;
        this.labels = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private List<LabelDescriptorResponse> labels;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(LogDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder labels(List<LabelDescriptorResponse> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder labels(LabelDescriptorResponse... labels) {
            return labels(List.of(labels));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public LogDescriptorResponse build() {
            return new LogDescriptorResponse(description, displayName, labels, name);
        }
    }
}
