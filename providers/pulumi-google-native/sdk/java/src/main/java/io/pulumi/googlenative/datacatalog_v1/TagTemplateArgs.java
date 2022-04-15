// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateArgs Empty = new TagTemplateArgs();

    /**
     * Display name for this template. Defaults to an empty string. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can't start or end with spaces. The maximum length is 200 characters.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. The map must contain at least one field and at most 500 fields. The keys to this map are tag template field IDs. The IDs have the following limitations: * Can contain uppercase and lowercase letters, numbers (0-9) and underscores (_). * Must be at least 1 character and at most 64 characters long. * Must start with a letter or underscore.
     * 
     */
    @Import(name="fields", required=true)
      private final Output<Map<String,String>> fields;

    public Output<Map<String,String>> fields() {
        return this.fields;
    }

    /**
     * Indicates whether this is a public tag template. Every user has view access to a *public* tag template by default. This means that: * Every user can use this tag template to tag an entry. * If an entry is tagged using the tag template, the tag is always shown in the response to ``ListTags`` called on the entry. * To get the template using the GetTagTemplate method, you need view access either on the project or the organization the tag template resides in but no other permission is needed. * Operations on the tag template other than viewing (for example, editing IAM policies) follow standard IAM structures. Tags created with a public tag template are referred to as public tags. You can search for a public tag by value with a simple search query instead of using a ``tag:`` predicate. Public tag templates may not appear in search results depending on scope, see: include_public_tag_templates Note: If an [IAM domain restriction](https://cloud.google.com/resource-manager/docs/organization-policy/restricting-domains) is configured in the tag template's location, the public access will not be enabled but the simple search for tag values will still work.
     * 
     */
    @Import(name="isPubliclyReadable")
      private final @Nullable Output<Boolean> isPubliclyReadable;

    public Output<Boolean> isPubliclyReadable() {
        return this.isPubliclyReadable == null ? Codegen.empty() : this.isPubliclyReadable;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The resource name of the tag template in URL format. Note: The tag template itself and its child resources might not be stored in the location specified in its name.
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

    @Import(name="tagTemplateId", required=true)
      private final Output<String> tagTemplateId;

    public Output<String> tagTemplateId() {
        return this.tagTemplateId;
    }

    public TagTemplateArgs(
        @Nullable Output<String> displayName,
        Output<Map<String,String>> fields,
        @Nullable Output<Boolean> isPubliclyReadable,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> tagTemplateId) {
        this.displayName = displayName;
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.isPubliclyReadable = isPubliclyReadable;
        this.location = location;
        this.name = name;
        this.project = project;
        this.tagTemplateId = Objects.requireNonNull(tagTemplateId, "expected parameter 'tagTemplateId' to be non-null");
    }

    private TagTemplateArgs() {
        this.displayName = Codegen.empty();
        this.fields = Codegen.empty();
        this.isPubliclyReadable = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.tagTemplateId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private Output<Map<String,String>> fields;
        private @Nullable Output<Boolean> isPubliclyReadable;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> tagTemplateId;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.fields = defaults.fields;
    	      this.isPubliclyReadable = defaults.isPubliclyReadable;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.tagTemplateId = defaults.tagTemplateId;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder fields(Output<Map<String,String>> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder fields(Map<String,String> fields) {
            this.fields = Output.of(Objects.requireNonNull(fields));
            return this;
        }
        public Builder isPubliclyReadable(@Nullable Output<Boolean> isPubliclyReadable) {
            this.isPubliclyReadable = isPubliclyReadable;
            return this;
        }
        public Builder isPubliclyReadable(@Nullable Boolean isPubliclyReadable) {
            this.isPubliclyReadable = Codegen.ofNullable(isPubliclyReadable);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        public Builder tagTemplateId(Output<String> tagTemplateId) {
            this.tagTemplateId = Objects.requireNonNull(tagTemplateId);
            return this;
        }
        public Builder tagTemplateId(String tagTemplateId) {
            this.tagTemplateId = Output.of(Objects.requireNonNull(tagTemplateId));
            return this;
        }        public TagTemplateArgs build() {
            return new TagTemplateArgs(displayName, fields, isPubliclyReadable, location, name, project, tagTemplateId);
        }
    }
}
