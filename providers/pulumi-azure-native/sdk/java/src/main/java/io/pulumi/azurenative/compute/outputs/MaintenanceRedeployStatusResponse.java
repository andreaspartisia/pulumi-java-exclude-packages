// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MaintenanceRedeployStatusResponse {
    private final @Nullable Boolean isCustomerInitiatedMaintenanceAllowed;
    private final @Nullable String lastOperationMessage;
    private final @Nullable String lastOperationResultCode;
    private final @Nullable String maintenanceWindowEndTime;
    private final @Nullable String maintenanceWindowStartTime;
    private final @Nullable String preMaintenanceWindowEndTime;
    private final @Nullable String preMaintenanceWindowStartTime;

    @OutputCustomType.Constructor({"isCustomerInitiatedMaintenanceAllowed","lastOperationMessage","lastOperationResultCode","maintenanceWindowEndTime","maintenanceWindowStartTime","preMaintenanceWindowEndTime","preMaintenanceWindowStartTime"})
    private MaintenanceRedeployStatusResponse(
        @Nullable Boolean isCustomerInitiatedMaintenanceAllowed,
        @Nullable String lastOperationMessage,
        @Nullable String lastOperationResultCode,
        @Nullable String maintenanceWindowEndTime,
        @Nullable String maintenanceWindowStartTime,
        @Nullable String preMaintenanceWindowEndTime,
        @Nullable String preMaintenanceWindowStartTime) {
        this.isCustomerInitiatedMaintenanceAllowed = isCustomerInitiatedMaintenanceAllowed;
        this.lastOperationMessage = lastOperationMessage;
        this.lastOperationResultCode = lastOperationResultCode;
        this.maintenanceWindowEndTime = maintenanceWindowEndTime;
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
        this.preMaintenanceWindowEndTime = preMaintenanceWindowEndTime;
        this.preMaintenanceWindowStartTime = preMaintenanceWindowStartTime;
    }

    public Optional<Boolean> getIsCustomerInitiatedMaintenanceAllowed() {
        return Optional.ofNullable(this.isCustomerInitiatedMaintenanceAllowed);
    }
    public Optional<String> getLastOperationMessage() {
        return Optional.ofNullable(this.lastOperationMessage);
    }
    public Optional<String> getLastOperationResultCode() {
        return Optional.ofNullable(this.lastOperationResultCode);
    }
    public Optional<String> getMaintenanceWindowEndTime() {
        return Optional.ofNullable(this.maintenanceWindowEndTime);
    }
    public Optional<String> getMaintenanceWindowStartTime() {
        return Optional.ofNullable(this.maintenanceWindowStartTime);
    }
    public Optional<String> getPreMaintenanceWindowEndTime() {
        return Optional.ofNullable(this.preMaintenanceWindowEndTime);
    }
    public Optional<String> getPreMaintenanceWindowStartTime() {
        return Optional.ofNullable(this.preMaintenanceWindowStartTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceRedeployStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isCustomerInitiatedMaintenanceAllowed;
        private @Nullable String lastOperationMessage;
        private @Nullable String lastOperationResultCode;
        private @Nullable String maintenanceWindowEndTime;
        private @Nullable String maintenanceWindowStartTime;
        private @Nullable String preMaintenanceWindowEndTime;
        private @Nullable String preMaintenanceWindowStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceRedeployStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCustomerInitiatedMaintenanceAllowed = defaults.isCustomerInitiatedMaintenanceAllowed;
    	      this.lastOperationMessage = defaults.lastOperationMessage;
    	      this.lastOperationResultCode = defaults.lastOperationResultCode;
    	      this.maintenanceWindowEndTime = defaults.maintenanceWindowEndTime;
    	      this.maintenanceWindowStartTime = defaults.maintenanceWindowStartTime;
    	      this.preMaintenanceWindowEndTime = defaults.preMaintenanceWindowEndTime;
    	      this.preMaintenanceWindowStartTime = defaults.preMaintenanceWindowStartTime;
        }

        public Builder setIsCustomerInitiatedMaintenanceAllowed(@Nullable Boolean isCustomerInitiatedMaintenanceAllowed) {
            this.isCustomerInitiatedMaintenanceAllowed = isCustomerInitiatedMaintenanceAllowed;
            return this;
        }

        public Builder setLastOperationMessage(@Nullable String lastOperationMessage) {
            this.lastOperationMessage = lastOperationMessage;
            return this;
        }

        public Builder setLastOperationResultCode(@Nullable String lastOperationResultCode) {
            this.lastOperationResultCode = lastOperationResultCode;
            return this;
        }

        public Builder setMaintenanceWindowEndTime(@Nullable String maintenanceWindowEndTime) {
            this.maintenanceWindowEndTime = maintenanceWindowEndTime;
            return this;
        }

        public Builder setMaintenanceWindowStartTime(@Nullable String maintenanceWindowStartTime) {
            this.maintenanceWindowStartTime = maintenanceWindowStartTime;
            return this;
        }

        public Builder setPreMaintenanceWindowEndTime(@Nullable String preMaintenanceWindowEndTime) {
            this.preMaintenanceWindowEndTime = preMaintenanceWindowEndTime;
            return this;
        }

        public Builder setPreMaintenanceWindowStartTime(@Nullable String preMaintenanceWindowStartTime) {
            this.preMaintenanceWindowStartTime = preMaintenanceWindowStartTime;
            return this;
        }

        public MaintenanceRedeployStatusResponse build() {
            return new MaintenanceRedeployStatusResponse(isCustomerInitiatedMaintenanceAllowed, lastOperationMessage, lastOperationResultCode, maintenanceWindowEndTime, maintenanceWindowStartTime, preMaintenanceWindowEndTime, preMaintenanceWindowStartTime);
        }
    }
}