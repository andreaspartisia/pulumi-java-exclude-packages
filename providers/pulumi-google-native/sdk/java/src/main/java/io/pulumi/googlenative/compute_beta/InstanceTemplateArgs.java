// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.inputs.InstancePropertiesArgs;
import io.pulumi.googlenative.compute_beta.inputs.SourceInstanceParamsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateArgs Empty = new InstanceTemplateArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The instance properties for this instance template.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<InstancePropertiesArgs> properties;

    public Output<InstancePropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    @Import(name="sourceInstance")
      private final @Nullable Output<String> sourceInstance;

    public Output<String> sourceInstance() {
        return this.sourceInstance == null ? Codegen.empty() : this.sourceInstance;
    }

    /**
     * The source instance params to use to create this instance template.
     * 
     */
    @Import(name="sourceInstanceParams")
      private final @Nullable Output<SourceInstanceParamsArgs> sourceInstanceParams;

    public Output<SourceInstanceParamsArgs> sourceInstanceParams() {
        return this.sourceInstanceParams == null ? Codegen.empty() : this.sourceInstanceParams;
    }

    public InstanceTemplateArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<InstancePropertiesArgs> properties,
        @Nullable Output<String> requestId,
        @Nullable Output<String> sourceInstance,
        @Nullable Output<SourceInstanceParamsArgs> sourceInstanceParams) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.properties = properties;
        this.requestId = requestId;
        this.sourceInstance = sourceInstance;
        this.sourceInstanceParams = sourceInstanceParams;
    }

    private InstanceTemplateArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.properties = Codegen.empty();
        this.requestId = Codegen.empty();
        this.sourceInstance = Codegen.empty();
        this.sourceInstanceParams = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<InstancePropertiesArgs> properties;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> sourceInstance;
        private @Nullable Output<SourceInstanceParamsArgs> sourceInstanceParams;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.properties = defaults.properties;
    	      this.requestId = defaults.requestId;
    	      this.sourceInstance = defaults.sourceInstance;
    	      this.sourceInstanceParams = defaults.sourceInstanceParams;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder properties(@Nullable Output<InstancePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable InstancePropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder sourceInstance(@Nullable Output<String> sourceInstance) {
            this.sourceInstance = sourceInstance;
            return this;
        }
        public Builder sourceInstance(@Nullable String sourceInstance) {
            this.sourceInstance = Codegen.ofNullable(sourceInstance);
            return this;
        }
        public Builder sourceInstanceParams(@Nullable Output<SourceInstanceParamsArgs> sourceInstanceParams) {
            this.sourceInstanceParams = sourceInstanceParams;
            return this;
        }
        public Builder sourceInstanceParams(@Nullable SourceInstanceParamsArgs sourceInstanceParams) {
            this.sourceInstanceParams = Codegen.ofNullable(sourceInstanceParams);
            return this;
        }        public InstanceTemplateArgs build() {
            return new InstanceTemplateArgs(description, name, project, properties, requestId, sourceInstance, sourceInstanceParams);
        }
    }
}
