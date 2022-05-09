// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutomationRuleActionPlaybook {
    /**
     * @return The ID of the Logic App that defines the playbook&#39;s logic.
     * 
     */
    private final String logicAppId;
    /**
     * @return The execution order of this action.
     * 
     */
    private final Integer order;
    /**
     * @return The ID of the Tenant that owns the playbook.
     * 
     */
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private AutomationRuleActionPlaybook(
        @CustomType.Parameter("logicAppId") String logicAppId,
        @CustomType.Parameter("order") Integer order,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.logicAppId = logicAppId;
        this.order = order;
        this.tenantId = tenantId;
    }

    /**
     * @return The ID of the Logic App that defines the playbook&#39;s logic.
     * 
     */
    public String logicAppId() {
        return this.logicAppId;
    }
    /**
     * @return The execution order of this action.
     * 
     */
    public Integer order() {
        return this.order;
    }
    /**
     * @return The ID of the Tenant that owns the playbook.
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleActionPlaybook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logicAppId;
        private Integer order;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleActionPlaybook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logicAppId = defaults.logicAppId;
    	      this.order = defaults.order;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder logicAppId(String logicAppId) {
            this.logicAppId = Objects.requireNonNull(logicAppId);
            return this;
        }
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public AutomationRuleActionPlaybook build() {
            return new AutomationRuleActionPlaybook(logicAppId, order, tenantId);
        }
    }
}
