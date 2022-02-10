// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PowerBIOutputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PowerBIOutputDataSourceArgs Empty = new PowerBIOutputDataSourceArgs();

    @InputImport(name="dataset")
    private final @Nullable Input<String> dataset;

    public Input<String> getDataset() {
        return this.dataset == null ? Input.empty() : this.dataset;
    }

    @InputImport(name="groupId")
    private final @Nullable Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId == null ? Input.empty() : this.groupId;
    }

    @InputImport(name="groupName")
    private final @Nullable Input<String> groupName;

    public Input<String> getGroupName() {
        return this.groupName == null ? Input.empty() : this.groupName;
    }

    @InputImport(name="refreshToken")
    private final @Nullable Input<String> refreshToken;

    public Input<String> getRefreshToken() {
        return this.refreshToken == null ? Input.empty() : this.refreshToken;
    }

    @InputImport(name="table")
    private final @Nullable Input<String> table;

    public Input<String> getTable() {
        return this.table == null ? Input.empty() : this.table;
    }

    @InputImport(name="tokenUserDisplayName")
    private final @Nullable Input<String> tokenUserDisplayName;

    public Input<String> getTokenUserDisplayName() {
        return this.tokenUserDisplayName == null ? Input.empty() : this.tokenUserDisplayName;
    }

    @InputImport(name="tokenUserPrincipalName")
    private final @Nullable Input<String> tokenUserPrincipalName;

    public Input<String> getTokenUserPrincipalName() {
        return this.tokenUserPrincipalName == null ? Input.empty() : this.tokenUserPrincipalName;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public PowerBIOutputDataSourceArgs(
        @Nullable Input<String> dataset,
        @Nullable Input<String> groupId,
        @Nullable Input<String> groupName,
        @Nullable Input<String> refreshToken,
        @Nullable Input<String> table,
        @Nullable Input<String> tokenUserDisplayName,
        @Nullable Input<String> tokenUserPrincipalName,
        Input<String> type) {
        this.dataset = dataset;
        this.groupId = groupId;
        this.groupName = groupName;
        this.refreshToken = refreshToken;
        this.table = table;
        this.tokenUserDisplayName = tokenUserDisplayName;
        this.tokenUserPrincipalName = tokenUserPrincipalName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PowerBIOutputDataSourceArgs() {
        this.dataset = Input.empty();
        this.groupId = Input.empty();
        this.groupName = Input.empty();
        this.refreshToken = Input.empty();
        this.table = Input.empty();
        this.tokenUserDisplayName = Input.empty();
        this.tokenUserPrincipalName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerBIOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dataset;
        private @Nullable Input<String> groupId;
        private @Nullable Input<String> groupName;
        private @Nullable Input<String> refreshToken;
        private @Nullable Input<String> table;
        private @Nullable Input<String> tokenUserDisplayName;
        private @Nullable Input<String> tokenUserPrincipalName;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PowerBIOutputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.groupId = defaults.groupId;
    	      this.groupName = defaults.groupName;
    	      this.refreshToken = defaults.refreshToken;
    	      this.table = defaults.table;
    	      this.tokenUserDisplayName = defaults.tokenUserDisplayName;
    	      this.tokenUserPrincipalName = defaults.tokenUserPrincipalName;
    	      this.type = defaults.type;
        }

        public Builder setDataset(@Nullable Input<String> dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder setDataset(@Nullable String dataset) {
            this.dataset = Input.ofNullable(dataset);
            return this;
        }

        public Builder setGroupId(@Nullable Input<String> groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setGroupId(@Nullable String groupId) {
            this.groupId = Input.ofNullable(groupId);
            return this;
        }

        public Builder setGroupName(@Nullable Input<String> groupName) {
            this.groupName = groupName;
            return this;
        }

        public Builder setGroupName(@Nullable String groupName) {
            this.groupName = Input.ofNullable(groupName);
            return this;
        }

        public Builder setRefreshToken(@Nullable Input<String> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder setRefreshToken(@Nullable String refreshToken) {
            this.refreshToken = Input.ofNullable(refreshToken);
            return this;
        }

        public Builder setTable(@Nullable Input<String> table) {
            this.table = table;
            return this;
        }

        public Builder setTable(@Nullable String table) {
            this.table = Input.ofNullable(table);
            return this;
        }

        public Builder setTokenUserDisplayName(@Nullable Input<String> tokenUserDisplayName) {
            this.tokenUserDisplayName = tokenUserDisplayName;
            return this;
        }

        public Builder setTokenUserDisplayName(@Nullable String tokenUserDisplayName) {
            this.tokenUserDisplayName = Input.ofNullable(tokenUserDisplayName);
            return this;
        }

        public Builder setTokenUserPrincipalName(@Nullable Input<String> tokenUserPrincipalName) {
            this.tokenUserPrincipalName = tokenUserPrincipalName;
            return this;
        }

        public Builder setTokenUserPrincipalName(@Nullable String tokenUserPrincipalName) {
            this.tokenUserPrincipalName = Input.ofNullable(tokenUserPrincipalName);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public PowerBIOutputDataSourceArgs build() {
            return new PowerBIOutputDataSourceArgs(dataset, groupId, groupName, refreshToken, table, tokenUserDisplayName, tokenUserPrincipalName, type);
        }
    }
}