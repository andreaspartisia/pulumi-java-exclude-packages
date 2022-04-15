// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.logging_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BillingAccountExclusionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BillingAccountExclusionArgs Empty = new BillingAccountExclusionArgs();

    @Import(name="billingAccountId", required=true)
      private final Output<String> billingAccountId;

    public Output<String> billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Optional. A description of this exclusion.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Optional. If set to True, then this exclusion is disabled and it does not exclude any log entries. You can update an exclusion to change the value of this field.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * An advanced logs filter (https://cloud.google.com/logging/docs/view/advanced-queries) that matches the log entries to be excluded. By using the sample function (https://cloud.google.com/logging/docs/view/advanced-queries#sample), you can exclude less than 100% of the matching log entries.For example, the following query matches 99% of low-severity log entries from Google Cloud Storage buckets:resource.type=gcs_bucket severity<ERROR sample(insertId, 0.99)
     * 
     */
    @Import(name="filter", required=true)
      private final Output<String> filter;

    public Output<String> filter() {
        return this.filter;
    }

    /**
     * A client-assigned identifier, such as "load-balancer-exclusion". Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public BillingAccountExclusionArgs(
        Output<String> billingAccountId,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        Output<String> filter,
        @Nullable Output<String> name) {
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.description = description;
        this.disabled = disabled;
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.name = name;
    }

    private BillingAccountExclusionArgs() {
        this.billingAccountId = Codegen.empty();
        this.description = Codegen.empty();
        this.disabled = Codegen.empty();
        this.filter = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BillingAccountExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> billingAccountId;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private Output<String> filter;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(BillingAccountExclusionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
        }

        public Builder billingAccountId(Output<String> billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }
        public Builder billingAccountId(String billingAccountId) {
            this.billingAccountId = Output.of(Objects.requireNonNull(billingAccountId));
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
        public Builder filter(Output<String> filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public Builder filter(String filter) {
            this.filter = Output.of(Objects.requireNonNull(filter));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public BillingAccountExclusionArgs build() {
            return new BillingAccountExclusionArgs(billingAccountId, description, disabled, filter, name);
        }
    }
}
