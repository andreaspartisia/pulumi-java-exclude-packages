// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gameservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector {
    /**
     * List of realms to match against.
     * 
     */
    private final @Nullable List<String> realms;

    @OutputCustomType.Constructor
    private GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector(@OutputCustomType.Parameter("realms") @Nullable List<String> realms) {
        this.realms = realms;
    }

    /**
     * List of realms to match against.
     * 
    */
    public List<String> getRealms() {
        return this.realms == null ? List.of() : this.realms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> realms;

        public Builder() {
    	      // Empty
        }

        public Builder(GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.realms = defaults.realms;
        }

        public Builder setRealms(@Nullable List<String> realms) {
            this.realms = realms;
            return this;
        }
        public GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector build() {
            return new GameServerDeploymentRolloutGameServerConfigOverrideRealmsSelector(realms);
        }
    }
}
