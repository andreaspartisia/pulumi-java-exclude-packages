// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VmStateDetailsResponse {
    private final String lastKnownPowerState;
    private final String powerState;
    private final String rdpAuthority;
    private final String sshAuthority;

    @OutputCustomType.Constructor({"lastKnownPowerState","powerState","rdpAuthority","sshAuthority"})
    private VmStateDetailsResponse(
        String lastKnownPowerState,
        String powerState,
        String rdpAuthority,
        String sshAuthority) {
        this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState);
        this.powerState = Objects.requireNonNull(powerState);
        this.rdpAuthority = Objects.requireNonNull(rdpAuthority);
        this.sshAuthority = Objects.requireNonNull(sshAuthority);
    }

    public String getLastKnownPowerState() {
        return this.lastKnownPowerState;
    }
    public String getPowerState() {
        return this.powerState;
    }
    public String getRdpAuthority() {
        return this.rdpAuthority;
    }
    public String getSshAuthority() {
        return this.sshAuthority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmStateDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastKnownPowerState;
        private String powerState;
        private String rdpAuthority;
        private String sshAuthority;

        public Builder() {
    	      // Empty
        }

        public Builder(VmStateDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastKnownPowerState = defaults.lastKnownPowerState;
    	      this.powerState = defaults.powerState;
    	      this.rdpAuthority = defaults.rdpAuthority;
    	      this.sshAuthority = defaults.sshAuthority;
        }

        public Builder setLastKnownPowerState(String lastKnownPowerState) {
            this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState);
            return this;
        }

        public Builder setPowerState(String powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }

        public Builder setRdpAuthority(String rdpAuthority) {
            this.rdpAuthority = Objects.requireNonNull(rdpAuthority);
            return this;
        }

        public Builder setSshAuthority(String sshAuthority) {
            this.sshAuthority = Objects.requireNonNull(sshAuthority);
            return this;
        }

        public VmStateDetailsResponse build() {
            return new VmStateDetailsResponse(lastKnownPowerState, powerState, rdpAuthority, sshAuthority);
        }
    }
}