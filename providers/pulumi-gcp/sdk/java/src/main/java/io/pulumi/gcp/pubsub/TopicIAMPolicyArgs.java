// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicIAMPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicIAMPolicyArgs Empty = new TopicIAMPolicyArgs();

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
    private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="topic", required=true)
    private final Input<String> topic;

    public Input<String> getTopic() {
        return this.topic;
    }

    public TopicIAMPolicyArgs(
        Input<String> policyData,
        @Nullable Input<String> project,
        Input<String> topic) {
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private TopicIAMPolicyArgs() {
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policyData;
        private @Nullable Input<String> project;
        private Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicIAMPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.topic = defaults.topic;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setTopic(Input<String> topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Input.of(Objects.requireNonNull(topic));
            return this;
        }

        public TopicIAMPolicyArgs build() {
            return new TopicIAMPolicyArgs(policyData, project, topic);
        }
    }
}