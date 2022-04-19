// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VMware Cbt specific policy details.
 * 
 */
public final class VmwareCbtPolicyDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final VmwareCbtPolicyDetailsResponse Empty = new VmwareCbtPolicyDetailsResponse();

    /**
     * The app consistent snapshot frequency in minutes.
     * 
     */
    @Import(name="appConsistentFrequencyInMinutes")
      private final @Nullable Integer appConsistentFrequencyInMinutes;

    public Optional<Integer> appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes == null ? Optional.empty() : Optional.ofNullable(this.appConsistentFrequencyInMinutes);
    }

    /**
     * The crash consistent snapshot frequency in minutes.
     * 
     */
    @Import(name="crashConsistentFrequencyInMinutes")
      private final @Nullable Integer crashConsistentFrequencyInMinutes;

    public Optional<Integer> crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes == null ? Optional.empty() : Optional.ofNullable(this.crashConsistentFrequencyInMinutes);
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'VMwareCbt'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    /**
     * The duration in minutes until which the recovery points need to be stored.
     * 
     */
    @Import(name="recoveryPointHistoryInMinutes")
      private final @Nullable Integer recoveryPointHistoryInMinutes;

    public Optional<Integer> recoveryPointHistoryInMinutes() {
        return this.recoveryPointHistoryInMinutes == null ? Optional.empty() : Optional.ofNullable(this.recoveryPointHistoryInMinutes);
    }

    public VmwareCbtPolicyDetailsResponse(
        @Nullable Integer appConsistentFrequencyInMinutes,
        @Nullable Integer crashConsistentFrequencyInMinutes,
        String instanceType,
        @Nullable Integer recoveryPointHistoryInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        this.instanceType = Codegen.stringProp("instanceType").arg(instanceType).require();
        this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
    }

    private VmwareCbtPolicyDetailsResponse() {
        this.appConsistentFrequencyInMinutes = null;
        this.crashConsistentFrequencyInMinutes = null;
        this.instanceType = null;
        this.recoveryPointHistoryInMinutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareCbtPolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer appConsistentFrequencyInMinutes;
        private @Nullable Integer crashConsistentFrequencyInMinutes;
        private String instanceType;
        private @Nullable Integer recoveryPointHistoryInMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareCbtPolicyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appConsistentFrequencyInMinutes = defaults.appConsistentFrequencyInMinutes;
    	      this.crashConsistentFrequencyInMinutes = defaults.crashConsistentFrequencyInMinutes;
    	      this.instanceType = defaults.instanceType;
    	      this.recoveryPointHistoryInMinutes = defaults.recoveryPointHistoryInMinutes;
        }

        public Builder appConsistentFrequencyInMinutes(@Nullable Integer appConsistentFrequencyInMinutes) {
            this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
            return this;
        }
        public Builder crashConsistentFrequencyInMinutes(@Nullable Integer crashConsistentFrequencyInMinutes) {
            this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder recoveryPointHistoryInMinutes(@Nullable Integer recoveryPointHistoryInMinutes) {
            this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
            return this;
        }        public VmwareCbtPolicyDetailsResponse build() {
            return new VmwareCbtPolicyDetailsResponse(appConsistentFrequencyInMinutes, crashConsistentFrequencyInMinutes, instanceType, recoveryPointHistoryInMinutes);
        }
    }
}
