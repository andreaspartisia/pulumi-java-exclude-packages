// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.AuditConfigArgs;
import io.pulumi.googlenative.compute_beta.inputs.BindingArgs;
import io.pulumi.googlenative.compute_beta.inputs.RuleArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyIamPolicyArgs Empty = new FirewallPolicyIamPolicyArgs();

    @InputImport(name="auditConfigs")
    private final @Nullable Input<List<AuditConfigArgs>> auditConfigs;

    public Input<List<AuditConfigArgs>> getAuditConfigs() {
        return this.auditConfigs == null ? Input.empty() : this.auditConfigs;
    }

    @InputImport(name="bindings")
    private final @Nullable Input<List<BindingArgs>> bindings;

    public Input<List<BindingArgs>> getBindings() {
        return this.bindings == null ? Input.empty() : this.bindings;
    }

    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="resource", required=true)
    private final Input<String> resource;

    public Input<String> getResource() {
        return this.resource;
    }

    @InputImport(name="rules")
    private final @Nullable Input<List<RuleArgs>> rules;

    public Input<List<RuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    @InputImport(name="version")
    private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public FirewallPolicyIamPolicyArgs(
        @Nullable Input<List<AuditConfigArgs>> auditConfigs,
        @Nullable Input<List<BindingArgs>> bindings,
        @Nullable Input<String> etag,
        Input<String> resource,
        @Nullable Input<List<RuleArgs>> rules,
        @Nullable Input<Integer> version) {
        this.auditConfigs = auditConfigs;
        this.bindings = bindings;
        this.etag = etag;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
        this.rules = rules;
        this.version = version;
    }

    private FirewallPolicyIamPolicyArgs() {
        this.auditConfigs = Input.empty();
        this.bindings = Input.empty();
        this.etag = Input.empty();
        this.resource = Input.empty();
        this.rules = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AuditConfigArgs>> auditConfigs;
        private @Nullable Input<List<BindingArgs>> bindings;
        private @Nullable Input<String> etag;
        private Input<String> resource;
        private @Nullable Input<List<RuleArgs>> rules;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditConfigs = defaults.auditConfigs;
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.resource = defaults.resource;
    	      this.rules = defaults.rules;
    	      this.version = defaults.version;
        }

        public Builder setAuditConfigs(@Nullable Input<List<AuditConfigArgs>> auditConfigs) {
            this.auditConfigs = auditConfigs;
            return this;
        }

        public Builder setAuditConfigs(@Nullable List<AuditConfigArgs> auditConfigs) {
            this.auditConfigs = Input.ofNullable(auditConfigs);
            return this;
        }

        public Builder setBindings(@Nullable Input<List<BindingArgs>> bindings) {
            this.bindings = bindings;
            return this;
        }

        public Builder setBindings(@Nullable List<BindingArgs> bindings) {
            this.bindings = Input.ofNullable(bindings);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setResource(Input<String> resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }

        public Builder setResource(String resource) {
            this.resource = Input.of(Objects.requireNonNull(resource));
            return this;
        }

        public Builder setRules(@Nullable Input<List<RuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<RuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public FirewallPolicyIamPolicyArgs build() {
            return new FirewallPolicyIamPolicyArgs(auditConfigs, bindings, etag, resource, rules, version);
        }
    }
}