// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.enums.DeprecationStatusState;
import io.pulumi.googlenative.compute_beta.inputs.RolloutPolicyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Deprecation status for a public resource.
 * 
 */
public final class DeprecationStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeprecationStatusArgs Empty = new DeprecationStatusArgs();

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DELETED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @Import(name="deleted")
      private final @Nullable Output<String> deleted;

    public Output<String> deleted() {
        return this.deleted == null ? Codegen.empty() : this.deleted;
    }

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to DEPRECATED. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @Import(name="deprecated")
      private final @Nullable Output<String> deprecated;

    public Output<String> deprecated() {
        return this.deprecated == null ? Codegen.empty() : this.deprecated;
    }

    /**
     * An optional RFC3339 timestamp on or after which the state of this resource is intended to change to OBSOLETE. This is only informational and the status will not change unless the client explicitly changes it.
     * 
     */
    @Import(name="obsolete")
      private final @Nullable Output<String> obsolete;

    public Output<String> obsolete() {
        return this.obsolete == null ? Codegen.empty() : this.obsolete;
    }

    /**
     * The URL of the suggested replacement for a deprecated resource. The suggested replacement resource must be the same kind of resource as the deprecated resource.
     * 
     */
    @Import(name="replacement")
      private final @Nullable Output<String> replacement;

    public Output<String> replacement() {
        return this.replacement == null ? Codegen.empty() : this.replacement;
    }

    /**
     * The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED. Operations which communicate the end of life date for an image, can use ACTIVE. Operations which create a new resource using a DEPRECATED resource will return successfully, but with a warning indicating the deprecated resource and recommending its replacement. Operations which use OBSOLETE or DELETED resources will be rejected and result in an error.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<DeprecationStatusState> state;

    public Output<DeprecationStatusState> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * The rollout policy for this deprecation. This policy is only enforced by image family views. The rollout policy restricts the zones where the associated resource is considered in a deprecated state. When the rollout policy does not include the user specified zone, or if the zone is rolled out, the associated resource is considered in a deprecated state. The rollout policy for this deprecation is read-only, except for allowlisted users. This field might not be configured. To view the latest non-deprecated image in a specific zone, use the imageFamilyViews.get method.
     * 
     */
    @Import(name="stateOverride")
      private final @Nullable Output<RolloutPolicyArgs> stateOverride;

    public Output<RolloutPolicyArgs> stateOverride() {
        return this.stateOverride == null ? Codegen.empty() : this.stateOverride;
    }

    public DeprecationStatusArgs(
        @Nullable Output<String> deleted,
        @Nullable Output<String> deprecated,
        @Nullable Output<String> obsolete,
        @Nullable Output<String> replacement,
        @Nullable Output<DeprecationStatusState> state,
        @Nullable Output<RolloutPolicyArgs> stateOverride) {
        this.deleted = deleted;
        this.deprecated = deprecated;
        this.obsolete = obsolete;
        this.replacement = replacement;
        this.state = state;
        this.stateOverride = stateOverride;
    }

    private DeprecationStatusArgs() {
        this.deleted = Codegen.empty();
        this.deprecated = Codegen.empty();
        this.obsolete = Codegen.empty();
        this.replacement = Codegen.empty();
        this.state = Codegen.empty();
        this.stateOverride = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeprecationStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deleted;
        private @Nullable Output<String> deprecated;
        private @Nullable Output<String> obsolete;
        private @Nullable Output<String> replacement;
        private @Nullable Output<DeprecationStatusState> state;
        private @Nullable Output<RolloutPolicyArgs> stateOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(DeprecationStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.deprecated = defaults.deprecated;
    	      this.obsolete = defaults.obsolete;
    	      this.replacement = defaults.replacement;
    	      this.state = defaults.state;
    	      this.stateOverride = defaults.stateOverride;
        }

        public Builder deleted(@Nullable Output<String> deleted) {
            this.deleted = deleted;
            return this;
        }
        public Builder deleted(@Nullable String deleted) {
            this.deleted = Codegen.ofNullable(deleted);
            return this;
        }
        public Builder deprecated(@Nullable Output<String> deprecated) {
            this.deprecated = deprecated;
            return this;
        }
        public Builder deprecated(@Nullable String deprecated) {
            this.deprecated = Codegen.ofNullable(deprecated);
            return this;
        }
        public Builder obsolete(@Nullable Output<String> obsolete) {
            this.obsolete = obsolete;
            return this;
        }
        public Builder obsolete(@Nullable String obsolete) {
            this.obsolete = Codegen.ofNullable(obsolete);
            return this;
        }
        public Builder replacement(@Nullable Output<String> replacement) {
            this.replacement = replacement;
            return this;
        }
        public Builder replacement(@Nullable String replacement) {
            this.replacement = Codegen.ofNullable(replacement);
            return this;
        }
        public Builder state(@Nullable Output<DeprecationStatusState> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable DeprecationStatusState state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder stateOverride(@Nullable Output<RolloutPolicyArgs> stateOverride) {
            this.stateOverride = stateOverride;
            return this;
        }
        public Builder stateOverride(@Nullable RolloutPolicyArgs stateOverride) {
            this.stateOverride = Codegen.ofNullable(stateOverride);
            return this;
        }        public DeprecationStatusArgs build() {
            return new DeprecationStatusArgs(deleted, deprecated, obsolete, replacement, state, stateOverride);
        }
    }
}
