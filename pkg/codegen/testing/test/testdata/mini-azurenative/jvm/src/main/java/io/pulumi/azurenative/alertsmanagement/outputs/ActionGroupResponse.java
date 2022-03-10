// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ActionGroupResponse {
    /**
     * Action group to trigger if action rule matches
     * 
     */
    private final String actionGroupId;
    /**
     * Creation time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    private final String createdAt;
    /**
     * Created by user name.
     * 
     */
    private final String createdBy;
    /**
     * Description of action rule
     * 
     */
    private final @Nullable String description;
    /**
     * Last updated time of action rule. Date-Time in ISO-8601 format.
     * 
     */
    private final String lastModifiedAt;
    /**
     * Last modified by user name.
     * 
     */
    private final String lastModifiedBy;
    /**
     * Indicates if the given action rule is enabled or disabled
     * 
     */
    private final @Nullable String status;
    /**
     * Indicates type of action rule
     * Expected value is 'ActionGroup'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ActionGroupResponse(
        @OutputCustomType.Parameter("actionGroupId") String actionGroupId,
        @OutputCustomType.Parameter("createdAt") String createdAt,
        @OutputCustomType.Parameter("createdBy") String createdBy,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("lastModifiedAt") String lastModifiedAt,
        @OutputCustomType.Parameter("lastModifiedBy") String lastModifiedBy,
        @OutputCustomType.Parameter("status") @Nullable String status,
        @OutputCustomType.Parameter("type") String type) {
        this.actionGroupId = actionGroupId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.description = description;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.status = status;
        this.type = type;
    }

    /**
     * Action group to trigger if action rule matches
     * 
    */
    public String getActionGroupId() {
        return this.actionGroupId;
    }
    /**
     * Creation time of action rule. Date-Time in ISO-8601 format.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Created by user name.
     * 
    */
    public String getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Description of action rule
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Last updated time of action rule. Date-Time in ISO-8601 format.
     * 
    */
    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Last modified by user name.
     * 
    */
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * Indicates if the given action rule is enabled or disabled
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * Indicates type of action rule
     * Expected value is 'ActionGroup'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActionGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionGroupId;
        private String createdAt;
        private String createdBy;
        private @Nullable String description;
        private String lastModifiedAt;
        private String lastModifiedBy;
        private @Nullable String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ActionGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionGroupId = defaults.actionGroupId;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.description = defaults.description;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setActionGroupId(String actionGroupId) {
            this.actionGroupId = Objects.requireNonNull(actionGroupId);
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setCreatedBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }

        public Builder setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ActionGroupResponse build() {
            return new ActionGroupResponse(actionGroupId, createdAt, createdBy, description, lastModifiedAt, lastModifiedBy, status, type);
        }
    }
}
