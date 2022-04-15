// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1BudgetAmountArgs;
import io.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1FilterArgs;
import io.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1NotificationsRuleArgs;
import io.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1ThresholdRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetArgs Empty = new BudgetArgs();

    /**
     * Budgeted amount.
     * 
     */
    @Import(name="amount", required=true)
      private final Output<GoogleCloudBillingBudgetsV1BudgetAmountArgs> amount;

    public Output<GoogleCloudBillingBudgetsV1BudgetAmountArgs> amount() {
        return this.amount;
    }

    @Import(name="billingAccountId", required=true)
      private final Output<String> billingAccountId;

    public Output<String> billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Optional. Filters that define which resources are used to compute the actual spend against the budget amount, such as projects, services, and the budget's time period, as well as other filters.
     * 
     */
    @Import(name="budgetFilter")
      private final @Nullable Output<GoogleCloudBillingBudgetsV1FilterArgs> budgetFilter;

    public Output<GoogleCloudBillingBudgetsV1FilterArgs> budgetFilter() {
        return this.budgetFilter == null ? Codegen.empty() : this.budgetFilter;
    }

    /**
     * User data for display name in UI. The name must be less than or equal to 60 characters.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Optional. Etag to validate that the object is unchanged for a read-modify-write operation. An empty etag causes an update to overwrite other changes.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * Optional. Rules to apply to notifications sent based on budget spend and thresholds.
     * 
     */
    @Import(name="notificationsRule")
      private final @Nullable Output<GoogleCloudBillingBudgetsV1NotificationsRuleArgs> notificationsRule;

    public Output<GoogleCloudBillingBudgetsV1NotificationsRuleArgs> notificationsRule() {
        return this.notificationsRule == null ? Codegen.empty() : this.notificationsRule;
    }

    /**
     * Optional. Rules that trigger alerts (notifications of thresholds being crossed) when spend exceeds the specified percentages of the budget. Optional for `pubsubTopic` notifications. Required if using email notifications.
     * 
     */
    @Import(name="thresholdRules")
      private final @Nullable Output<List<GoogleCloudBillingBudgetsV1ThresholdRuleArgs>> thresholdRules;

    public Output<List<GoogleCloudBillingBudgetsV1ThresholdRuleArgs>> thresholdRules() {
        return this.thresholdRules == null ? Codegen.empty() : this.thresholdRules;
    }

    public BudgetArgs(
        Output<GoogleCloudBillingBudgetsV1BudgetAmountArgs> amount,
        Output<String> billingAccountId,
        @Nullable Output<GoogleCloudBillingBudgetsV1FilterArgs> budgetFilter,
        @Nullable Output<String> displayName,
        @Nullable Output<String> etag,
        @Nullable Output<GoogleCloudBillingBudgetsV1NotificationsRuleArgs> notificationsRule,
        @Nullable Output<List<GoogleCloudBillingBudgetsV1ThresholdRuleArgs>> thresholdRules) {
        this.amount = Objects.requireNonNull(amount, "expected parameter 'amount' to be non-null");
        this.billingAccountId = Objects.requireNonNull(billingAccountId, "expected parameter 'billingAccountId' to be non-null");
        this.budgetFilter = budgetFilter;
        this.displayName = displayName;
        this.etag = etag;
        this.notificationsRule = notificationsRule;
        this.thresholdRules = thresholdRules;
    }

    private BudgetArgs() {
        this.amount = Codegen.empty();
        this.billingAccountId = Codegen.empty();
        this.budgetFilter = Codegen.empty();
        this.displayName = Codegen.empty();
        this.etag = Codegen.empty();
        this.notificationsRule = Codegen.empty();
        this.thresholdRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GoogleCloudBillingBudgetsV1BudgetAmountArgs> amount;
        private Output<String> billingAccountId;
        private @Nullable Output<GoogleCloudBillingBudgetsV1FilterArgs> budgetFilter;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> etag;
        private @Nullable Output<GoogleCloudBillingBudgetsV1NotificationsRuleArgs> notificationsRule;
        private @Nullable Output<List<GoogleCloudBillingBudgetsV1ThresholdRuleArgs>> thresholdRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.billingAccountId = defaults.billingAccountId;
    	      this.budgetFilter = defaults.budgetFilter;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.notificationsRule = defaults.notificationsRule;
    	      this.thresholdRules = defaults.thresholdRules;
        }

        public Builder amount(Output<GoogleCloudBillingBudgetsV1BudgetAmountArgs> amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }
        public Builder amount(GoogleCloudBillingBudgetsV1BudgetAmountArgs amount) {
            this.amount = Output.of(Objects.requireNonNull(amount));
            return this;
        }
        public Builder billingAccountId(Output<String> billingAccountId) {
            this.billingAccountId = Objects.requireNonNull(billingAccountId);
            return this;
        }
        public Builder billingAccountId(String billingAccountId) {
            this.billingAccountId = Output.of(Objects.requireNonNull(billingAccountId));
            return this;
        }
        public Builder budgetFilter(@Nullable Output<GoogleCloudBillingBudgetsV1FilterArgs> budgetFilter) {
            this.budgetFilter = budgetFilter;
            return this;
        }
        public Builder budgetFilter(@Nullable GoogleCloudBillingBudgetsV1FilterArgs budgetFilter) {
            this.budgetFilter = Codegen.ofNullable(budgetFilter);
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
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder notificationsRule(@Nullable Output<GoogleCloudBillingBudgetsV1NotificationsRuleArgs> notificationsRule) {
            this.notificationsRule = notificationsRule;
            return this;
        }
        public Builder notificationsRule(@Nullable GoogleCloudBillingBudgetsV1NotificationsRuleArgs notificationsRule) {
            this.notificationsRule = Codegen.ofNullable(notificationsRule);
            return this;
        }
        public Builder thresholdRules(@Nullable Output<List<GoogleCloudBillingBudgetsV1ThresholdRuleArgs>> thresholdRules) {
            this.thresholdRules = thresholdRules;
            return this;
        }
        public Builder thresholdRules(@Nullable List<GoogleCloudBillingBudgetsV1ThresholdRuleArgs> thresholdRules) {
            this.thresholdRules = Codegen.ofNullable(thresholdRules);
            return this;
        }
        public Builder thresholdRules(GoogleCloudBillingBudgetsV1ThresholdRuleArgs... thresholdRules) {
            return thresholdRules(List.of(thresholdRules));
        }        public BudgetArgs build() {
            return new BudgetArgs(amount, billingAccountId, budgetFilter, displayName, etag, notificationsRule, thresholdRules);
        }
    }
}
