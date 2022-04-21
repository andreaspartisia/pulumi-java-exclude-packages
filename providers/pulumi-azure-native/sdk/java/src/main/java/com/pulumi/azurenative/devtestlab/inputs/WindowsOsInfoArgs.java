// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.enums.WindowsOsState;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about a Windows OS.
 * 
 */
public final class WindowsOsInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsOsInfoArgs Empty = new WindowsOsInfoArgs();

    /**
     * The state of the Windows OS (i.e. NonSysprepped, SysprepRequested, SysprepApplied).
     * 
     */
    @Import(name="windowsOsState")
    private @Nullable Output<Either<String,WindowsOsState>> windowsOsState;

    public Optional<Output<Either<String,WindowsOsState>>> windowsOsState() {
        return Optional.ofNullable(this.windowsOsState);
    }

    private WindowsOsInfoArgs() {}

    private WindowsOsInfoArgs(WindowsOsInfoArgs $) {
        this.windowsOsState = $.windowsOsState;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsOsInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsOsInfoArgs $;

        public Builder() {
            $ = new WindowsOsInfoArgs();
        }

        public Builder(WindowsOsInfoArgs defaults) {
            $ = new WindowsOsInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder windowsOsState(@Nullable Output<Either<String,WindowsOsState>> windowsOsState) {
            $.windowsOsState = windowsOsState;
            return this;
        }

        public Builder windowsOsState(Either<String,WindowsOsState> windowsOsState) {
            return windowsOsState(Output.of(windowsOsState));
        }

        public Builder windowsOsState(String windowsOsState) {
            return windowsOsState(Either.ofLeft(windowsOsState));
        }

        public Builder windowsOsState(WindowsOsState windowsOsState) {
            return windowsOsState(Either.ofRight(windowsOsState));
        }

        public WindowsOsInfoArgs build() {
            return $;
        }
    }

}
