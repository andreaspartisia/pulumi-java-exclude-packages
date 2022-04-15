// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.iam_v1.inputs.AwsArgs;
import io.pulumi.googlenative.iam_v1.inputs.OidcArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * [A Common Expression Language](https://opensource.google/projects/cel) expression, in plain text, to restrict what otherwise valid authentication credentials issued by the provider should not be accepted. The expression must output a boolean representing whether to allow the federation. The following keywords may be referenced in the expressions: * `assertion`: JSON representing the authentication credential issued by the provider. * `google`: The Google attributes mapped from the assertion in the `attribute_mappings`. * `attribute`: The custom attributes mapped from the assertion in the `attribute_mappings`. The maximum length of the attribute condition expression is 4096 characters. If unspecified, all valid authentication credential are accepted. The following example shows how to only allow credentials with a mapped `google.groups` value of `admins`: ```"'admins' in google.groups"```
     * 
     */
    @Import(name="attributeCondition")
      private final @Nullable Output<String> attributeCondition;

    public Output<String> attributeCondition() {
        return this.attributeCondition == null ? Codegen.empty() : this.attributeCondition;
    }

    /**
     * Maps attributes from authentication credentials issued by an external identity provider to Google Cloud attributes, such as `subject` and `segment`. Each key must be a string specifying the Google Cloud IAM attribute to map to. The following keys are supported: * `google.subject`: The principal IAM is authenticating. You can reference this value in IAM bindings. This is also the subject that appears in Cloud Logging logs. Cannot exceed 127 characters. * `google.groups`: Groups the external identity belongs to. You can grant groups access to resources using an IAM `principalSet` binding; access applies to all members of the group. You can also provide custom attributes by specifying `attribute.{custom_attribute}`, where `{custom_attribute}` is the name of the custom attribute to be mapped. You can define a maximum of 50 custom attributes. The maximum length of a mapped attribute key is 100 characters, and the key may only contain the characters [a-z0-9_]. You can reference these attributes in IAM policies to define fine-grained access for a workload to Google Cloud resources. For example: * `google.subject`: `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}` * `google.groups`: `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}` * `attribute.{custom_attribute}`: `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}` Each value must be a [Common Expression Language] (https://opensource.google/projects/cel) function that maps an identity provider credential to the normalized attribute specified by the corresponding map key. You can use the `assertion` keyword in the expression to access a JSON representation of the authentication credential issued by the provider. The maximum length of an attribute mapping expression is 2048 characters. When evaluated, the total size of all mapped attributes must not exceed 8KB. For AWS providers, if no attribute mapping is defined, the following default mapping applies: ```{ "google.subject":"assertion.arn", "attribute.aws_role": "assertion.arn.contains('assumed-role')" " ? assertion.arn.extract('{account_arn}assumed-role/')" " + 'assumed-role/'" " + assertion.arn.extract('assumed-role/{role_name}/')" " : assertion.arn", }``` If any custom attribute mappings are defined, they must include a mapping to the `google.subject` attribute. For OIDC providers, you must supply a custom mapping, which must include the `google.subject` attribute. For example, the following maps the `sub` claim of the incoming credential to the `subject` attribute on a Google token: ```{"google.subject": "assertion.sub"}```
     * 
     */
    @Import(name="attributeMapping")
      private final @Nullable Output<Map<String,String>> attributeMapping;

    public Output<Map<String,String>> attributeMapping() {
        return this.attributeMapping == null ? Codegen.empty() : this.attributeMapping;
    }

    /**
     * An Amazon Web Services identity provider.
     * 
     */
    @Import(name="aws")
      private final @Nullable Output<AwsArgs> aws;

    public Output<AwsArgs> aws() {
        return this.aws == null ? Codegen.empty() : this.aws;
    }

    /**
     * A description for the provider. Cannot exceed 256 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Whether the provider is disabled. You cannot use a disabled provider to exchange tokens. However, existing tokens still grant access.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * A display name for the provider. Cannot exceed 32 characters.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * An OpenId Connect 1.0 identity provider.
     * 
     */
    @Import(name="oidc")
      private final @Nullable Output<OidcArgs> oidc;

    public Output<OidcArgs> oidc() {
        return this.oidc == null ? Codegen.empty() : this.oidc;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="workloadIdentityPoolId", required=true)
      private final Output<String> workloadIdentityPoolId;

    public Output<String> workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    @Import(name="workloadIdentityPoolProviderId", required=true)
      private final Output<String> workloadIdentityPoolProviderId;

    public Output<String> workloadIdentityPoolProviderId() {
        return this.workloadIdentityPoolProviderId;
    }

    public ProviderArgs(
        @Nullable Output<String> attributeCondition,
        @Nullable Output<Map<String,String>> attributeMapping,
        @Nullable Output<AwsArgs> aws,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<String> displayName,
        @Nullable Output<String> location,
        @Nullable Output<OidcArgs> oidc,
        @Nullable Output<String> project,
        Output<String> workloadIdentityPoolId,
        Output<String> workloadIdentityPoolProviderId) {
        this.attributeCondition = attributeCondition;
        this.attributeMapping = attributeMapping;
        this.aws = aws;
        this.description = description;
        this.disabled = disabled;
        this.displayName = displayName;
        this.location = location;
        this.oidc = oidc;
        this.project = project;
        this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId, "expected parameter 'workloadIdentityPoolId' to be non-null");
        this.workloadIdentityPoolProviderId = Objects.requireNonNull(workloadIdentityPoolProviderId, "expected parameter 'workloadIdentityPoolProviderId' to be non-null");
    }

    private ProviderArgs() {
        this.attributeCondition = Codegen.empty();
        this.attributeMapping = Codegen.empty();
        this.aws = Codegen.empty();
        this.description = Codegen.empty();
        this.disabled = Codegen.empty();
        this.displayName = Codegen.empty();
        this.location = Codegen.empty();
        this.oidc = Codegen.empty();
        this.project = Codegen.empty();
        this.workloadIdentityPoolId = Codegen.empty();
        this.workloadIdentityPoolProviderId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> attributeCondition;
        private @Nullable Output<Map<String,String>> attributeMapping;
        private @Nullable Output<AwsArgs> aws;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> location;
        private @Nullable Output<OidcArgs> oidc;
        private @Nullable Output<String> project;
        private Output<String> workloadIdentityPoolId;
        private Output<String> workloadIdentityPoolProviderId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeCondition = defaults.attributeCondition;
    	      this.attributeMapping = defaults.attributeMapping;
    	      this.aws = defaults.aws;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.location = defaults.location;
    	      this.oidc = defaults.oidc;
    	      this.project = defaults.project;
    	      this.workloadIdentityPoolId = defaults.workloadIdentityPoolId;
    	      this.workloadIdentityPoolProviderId = defaults.workloadIdentityPoolProviderId;
        }

        public Builder attributeCondition(@Nullable Output<String> attributeCondition) {
            this.attributeCondition = attributeCondition;
            return this;
        }
        public Builder attributeCondition(@Nullable String attributeCondition) {
            this.attributeCondition = Codegen.ofNullable(attributeCondition);
            return this;
        }
        public Builder attributeMapping(@Nullable Output<Map<String,String>> attributeMapping) {
            this.attributeMapping = attributeMapping;
            return this;
        }
        public Builder attributeMapping(@Nullable Map<String,String> attributeMapping) {
            this.attributeMapping = Codegen.ofNullable(attributeMapping);
            return this;
        }
        public Builder aws(@Nullable Output<AwsArgs> aws) {
            this.aws = aws;
            return this;
        }
        public Builder aws(@Nullable AwsArgs aws) {
            this.aws = Codegen.ofNullable(aws);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
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
        public Builder oidc(@Nullable Output<OidcArgs> oidc) {
            this.oidc = oidc;
            return this;
        }
        public Builder oidc(@Nullable OidcArgs oidc) {
            this.oidc = Codegen.ofNullable(oidc);
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
        public Builder workloadIdentityPoolId(Output<String> workloadIdentityPoolId) {
            this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId);
            return this;
        }
        public Builder workloadIdentityPoolId(String workloadIdentityPoolId) {
            this.workloadIdentityPoolId = Output.of(Objects.requireNonNull(workloadIdentityPoolId));
            return this;
        }
        public Builder workloadIdentityPoolProviderId(Output<String> workloadIdentityPoolProviderId) {
            this.workloadIdentityPoolProviderId = Objects.requireNonNull(workloadIdentityPoolProviderId);
            return this;
        }
        public Builder workloadIdentityPoolProviderId(String workloadIdentityPoolProviderId) {
            this.workloadIdentityPoolProviderId = Output.of(Objects.requireNonNull(workloadIdentityPoolProviderId));
            return this;
        }        public ProviderArgs build() {
            return new ProviderArgs(attributeCondition, attributeMapping, aws, description, disabled, displayName, location, oidc, project, workloadIdentityPoolId, workloadIdentityPoolProviderId);
        }
    }
}
