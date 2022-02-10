// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSensorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSensorArgs Empty = new GetSensorArgs();

    @InputImport(name="scope", required=true)
    private final String scope;

    public String getScope() {
        return this.scope;
    }

    @InputImport(name="sensorName", required=true)
    private final String sensorName;

    public String getSensorName() {
        return this.sensorName;
    }

    public GetSensorArgs(
        String scope,
        String sensorName) {
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.sensorName = Objects.requireNonNull(sensorName, "expected parameter 'sensorName' to be non-null");
    }

    private GetSensorArgs() {
        this.scope = null;
        this.sensorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scope;
        private String sensorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSensorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
    	      this.sensorName = defaults.sensorName;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setSensorName(String sensorName) {
            this.sensorName = Objects.requireNonNull(sensorName);
            return this;
        }

        public GetSensorArgs build() {
            return new GetSensorArgs(scope, sensorName);
        }
    }
}