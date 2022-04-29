// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetUserAssessmentUsersFilter;
import com.pulumi.oci.DataSafe.outputs.GetUserAssessmentUsersUser;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserAssessmentUsersResult {
    private final @Nullable String accessLevel;
    /**
     * @return The user account status.
     * 
     */
    private final @Nullable String accountStatus;
    /**
     * @return The user authentication method.
     * 
     */
    private final @Nullable String authenticationType;
    private final @Nullable Boolean compartmentIdInSubtree;
    private final @Nullable List<GetUserAssessmentUsersFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The OCID of the target database.
     * 
     */
    private final @Nullable String targetId;
    private final @Nullable String timeLastLoginGreaterThanOrEqualTo;
    private final @Nullable String timeLastLoginLessThan;
    private final @Nullable String timePasswordLastChangedGreaterThanOrEqualTo;
    private final @Nullable String timePasswordLastChangedLessThan;
    private final @Nullable String timeUserCreatedGreaterThanOrEqualTo;
    private final @Nullable String timeUserCreatedLessThan;
    private final String userAssessmentId;
    /**
     * @return The user category based on the privileges and other details of the user.
     * 
     */
    private final @Nullable String userCategory;
    private final @Nullable String userKey;
    /**
     * @return The database user name.
     * 
     */
    private final @Nullable String userName;
    /**
     * @return The list of users.
     * 
     */
    private final List<GetUserAssessmentUsersUser> users;

    @CustomType.Constructor
    private GetUserAssessmentUsersResult(
        @CustomType.Parameter("accessLevel") @Nullable String accessLevel,
        @CustomType.Parameter("accountStatus") @Nullable String accountStatus,
        @CustomType.Parameter("authenticationType") @Nullable String authenticationType,
        @CustomType.Parameter("compartmentIdInSubtree") @Nullable Boolean compartmentIdInSubtree,
        @CustomType.Parameter("filters") @Nullable List<GetUserAssessmentUsersFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("targetId") @Nullable String targetId,
        @CustomType.Parameter("timeLastLoginGreaterThanOrEqualTo") @Nullable String timeLastLoginGreaterThanOrEqualTo,
        @CustomType.Parameter("timeLastLoginLessThan") @Nullable String timeLastLoginLessThan,
        @CustomType.Parameter("timePasswordLastChangedGreaterThanOrEqualTo") @Nullable String timePasswordLastChangedGreaterThanOrEqualTo,
        @CustomType.Parameter("timePasswordLastChangedLessThan") @Nullable String timePasswordLastChangedLessThan,
        @CustomType.Parameter("timeUserCreatedGreaterThanOrEqualTo") @Nullable String timeUserCreatedGreaterThanOrEqualTo,
        @CustomType.Parameter("timeUserCreatedLessThan") @Nullable String timeUserCreatedLessThan,
        @CustomType.Parameter("userAssessmentId") String userAssessmentId,
        @CustomType.Parameter("userCategory") @Nullable String userCategory,
        @CustomType.Parameter("userKey") @Nullable String userKey,
        @CustomType.Parameter("userName") @Nullable String userName,
        @CustomType.Parameter("users") List<GetUserAssessmentUsersUser> users) {
        this.accessLevel = accessLevel;
        this.accountStatus = accountStatus;
        this.authenticationType = authenticationType;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.filters = filters;
        this.id = id;
        this.targetId = targetId;
        this.timeLastLoginGreaterThanOrEqualTo = timeLastLoginGreaterThanOrEqualTo;
        this.timeLastLoginLessThan = timeLastLoginLessThan;
        this.timePasswordLastChangedGreaterThanOrEqualTo = timePasswordLastChangedGreaterThanOrEqualTo;
        this.timePasswordLastChangedLessThan = timePasswordLastChangedLessThan;
        this.timeUserCreatedGreaterThanOrEqualTo = timeUserCreatedGreaterThanOrEqualTo;
        this.timeUserCreatedLessThan = timeUserCreatedLessThan;
        this.userAssessmentId = userAssessmentId;
        this.userCategory = userCategory;
        this.userKey = userKey;
        this.userName = userName;
        this.users = users;
    }

    public Optional<String> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }
    /**
     * @return The user account status.
     * 
     */
    public Optional<String> accountStatus() {
        return Optional.ofNullable(this.accountStatus);
    }
    /**
     * @return The user authentication method.
     * 
     */
    public Optional<String> authenticationType() {
        return Optional.ofNullable(this.authenticationType);
    }
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }
    public List<GetUserAssessmentUsersFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The OCID of the target database.
     * 
     */
    public Optional<String> targetId() {
        return Optional.ofNullable(this.targetId);
    }
    public Optional<String> timeLastLoginGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeLastLoginGreaterThanOrEqualTo);
    }
    public Optional<String> timeLastLoginLessThan() {
        return Optional.ofNullable(this.timeLastLoginLessThan);
    }
    public Optional<String> timePasswordLastChangedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timePasswordLastChangedGreaterThanOrEqualTo);
    }
    public Optional<String> timePasswordLastChangedLessThan() {
        return Optional.ofNullable(this.timePasswordLastChangedLessThan);
    }
    public Optional<String> timeUserCreatedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeUserCreatedGreaterThanOrEqualTo);
    }
    public Optional<String> timeUserCreatedLessThan() {
        return Optional.ofNullable(this.timeUserCreatedLessThan);
    }
    public String userAssessmentId() {
        return this.userAssessmentId;
    }
    /**
     * @return The user category based on the privileges and other details of the user.
     * 
     */
    public Optional<String> userCategory() {
        return Optional.ofNullable(this.userCategory);
    }
    public Optional<String> userKey() {
        return Optional.ofNullable(this.userKey);
    }
    /**
     * @return The database user name.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }
    /**
     * @return The list of users.
     * 
     */
    public List<GetUserAssessmentUsersUser> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserAssessmentUsersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessLevel;
        private @Nullable String accountStatus;
        private @Nullable String authenticationType;
        private @Nullable Boolean compartmentIdInSubtree;
        private @Nullable List<GetUserAssessmentUsersFilter> filters;
        private String id;
        private @Nullable String targetId;
        private @Nullable String timeLastLoginGreaterThanOrEqualTo;
        private @Nullable String timeLastLoginLessThan;
        private @Nullable String timePasswordLastChangedGreaterThanOrEqualTo;
        private @Nullable String timePasswordLastChangedLessThan;
        private @Nullable String timeUserCreatedGreaterThanOrEqualTo;
        private @Nullable String timeUserCreatedLessThan;
        private String userAssessmentId;
        private @Nullable String userCategory;
        private @Nullable String userKey;
        private @Nullable String userName;
        private List<GetUserAssessmentUsersUser> users;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserAssessmentUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
    	      this.accountStatus = defaults.accountStatus;
    	      this.authenticationType = defaults.authenticationType;
    	      this.compartmentIdInSubtree = defaults.compartmentIdInSubtree;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.targetId = defaults.targetId;
    	      this.timeLastLoginGreaterThanOrEqualTo = defaults.timeLastLoginGreaterThanOrEqualTo;
    	      this.timeLastLoginLessThan = defaults.timeLastLoginLessThan;
    	      this.timePasswordLastChangedGreaterThanOrEqualTo = defaults.timePasswordLastChangedGreaterThanOrEqualTo;
    	      this.timePasswordLastChangedLessThan = defaults.timePasswordLastChangedLessThan;
    	      this.timeUserCreatedGreaterThanOrEqualTo = defaults.timeUserCreatedGreaterThanOrEqualTo;
    	      this.timeUserCreatedLessThan = defaults.timeUserCreatedLessThan;
    	      this.userAssessmentId = defaults.userAssessmentId;
    	      this.userCategory = defaults.userCategory;
    	      this.userKey = defaults.userKey;
    	      this.userName = defaults.userName;
    	      this.users = defaults.users;
        }

        public Builder accessLevel(@Nullable String accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Builder accountStatus(@Nullable String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }
        public Builder filters(@Nullable List<GetUserAssessmentUsersFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetUserAssessmentUsersFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder targetId(@Nullable String targetId) {
            this.targetId = targetId;
            return this;
        }
        public Builder timeLastLoginGreaterThanOrEqualTo(@Nullable String timeLastLoginGreaterThanOrEqualTo) {
            this.timeLastLoginGreaterThanOrEqualTo = timeLastLoginGreaterThanOrEqualTo;
            return this;
        }
        public Builder timeLastLoginLessThan(@Nullable String timeLastLoginLessThan) {
            this.timeLastLoginLessThan = timeLastLoginLessThan;
            return this;
        }
        public Builder timePasswordLastChangedGreaterThanOrEqualTo(@Nullable String timePasswordLastChangedGreaterThanOrEqualTo) {
            this.timePasswordLastChangedGreaterThanOrEqualTo = timePasswordLastChangedGreaterThanOrEqualTo;
            return this;
        }
        public Builder timePasswordLastChangedLessThan(@Nullable String timePasswordLastChangedLessThan) {
            this.timePasswordLastChangedLessThan = timePasswordLastChangedLessThan;
            return this;
        }
        public Builder timeUserCreatedGreaterThanOrEqualTo(@Nullable String timeUserCreatedGreaterThanOrEqualTo) {
            this.timeUserCreatedGreaterThanOrEqualTo = timeUserCreatedGreaterThanOrEqualTo;
            return this;
        }
        public Builder timeUserCreatedLessThan(@Nullable String timeUserCreatedLessThan) {
            this.timeUserCreatedLessThan = timeUserCreatedLessThan;
            return this;
        }
        public Builder userAssessmentId(String userAssessmentId) {
            this.userAssessmentId = Objects.requireNonNull(userAssessmentId);
            return this;
        }
        public Builder userCategory(@Nullable String userCategory) {
            this.userCategory = userCategory;
            return this;
        }
        public Builder userKey(@Nullable String userKey) {
            this.userKey = userKey;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public Builder users(List<GetUserAssessmentUsersUser> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public Builder users(GetUserAssessmentUsersUser... users) {
            return users(List.of(users));
        }        public GetUserAssessmentUsersResult build() {
            return new GetUserAssessmentUsersResult(accessLevel, accountStatus, authenticationType, compartmentIdInSubtree, filters, id, targetId, timeLastLoginGreaterThanOrEqualTo, timeLastLoginLessThan, timePasswordLastChangedGreaterThanOrEqualTo, timePasswordLastChangedLessThan, timeUserCreatedGreaterThanOrEqualTo, timeUserCreatedLessThan, userAssessmentId, userCategory, userKey, userName, users);
        }
    }
}
