// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InterconnectMacsecPreSharedKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final InterconnectMacsecPreSharedKeyArgs Empty = new InterconnectMacsecPreSharedKeyArgs();

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public InterconnectMacsecPreSharedKeyArgs(
        Input<String> name,
        @Nullable Input<String> startTime) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.startTime = startTime;
    }

    private InterconnectMacsecPreSharedKeyArgs() {
        this.name = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectMacsecPreSharedKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectMacsecPreSharedKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.startTime = defaults.startTime;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public InterconnectMacsecPreSharedKeyArgs build() {
            return new InterconnectMacsecPreSharedKeyArgs(name, startTime);
        }
    }
}