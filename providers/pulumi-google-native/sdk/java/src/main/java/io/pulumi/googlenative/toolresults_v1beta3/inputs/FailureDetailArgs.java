// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details for an outcome with a FAILURE outcome summary.
 * 
 */
public final class FailureDetailArgs extends io.pulumi.resources.ResourceArgs {

    public static final FailureDetailArgs Empty = new FailureDetailArgs();

    /**
     * If the failure was severe because the system (app) under test crashed.
     * 
     */
    @Import(name="crashed")
      private final @Nullable Output<Boolean> crashed;

    public Output<Boolean> crashed() {
        return this.crashed == null ? Codegen.empty() : this.crashed;
    }

    /**
     * If the device ran out of memory during a test, causing the test to crash.
     * 
     */
    @Import(name="deviceOutOfMemory")
      private final @Nullable Output<Boolean> deviceOutOfMemory;

    public Output<Boolean> deviceOutOfMemory() {
        return this.deviceOutOfMemory == null ? Codegen.empty() : this.deviceOutOfMemory;
    }

    /**
     * If the Roboscript failed to complete successfully, e.g., because a Roboscript action or assertion failed or a Roboscript action could not be matched during the entire crawl.
     * 
     */
    @Import(name="failedRoboscript")
      private final @Nullable Output<Boolean> failedRoboscript;

    public Output<Boolean> failedRoboscript() {
        return this.failedRoboscript == null ? Codegen.empty() : this.failedRoboscript;
    }

    /**
     * If an app is not installed and thus no test can be run with the app. This might be caused by trying to run a test on an unsupported platform.
     * 
     */
    @Import(name="notInstalled")
      private final @Nullable Output<Boolean> notInstalled;

    public Output<Boolean> notInstalled() {
        return this.notInstalled == null ? Codegen.empty() : this.notInstalled;
    }

    /**
     * If a native process (including any other than the app) crashed.
     * 
     */
    @Import(name="otherNativeCrash")
      private final @Nullable Output<Boolean> otherNativeCrash;

    public Output<Boolean> otherNativeCrash() {
        return this.otherNativeCrash == null ? Codegen.empty() : this.otherNativeCrash;
    }

    /**
     * If the test overran some time limit, and that is why it failed.
     * 
     */
    @Import(name="timedOut")
      private final @Nullable Output<Boolean> timedOut;

    public Output<Boolean> timedOut() {
        return this.timedOut == null ? Codegen.empty() : this.timedOut;
    }

    /**
     * If the robo was unable to crawl the app; perhaps because the app did not start.
     * 
     */
    @Import(name="unableToCrawl")
      private final @Nullable Output<Boolean> unableToCrawl;

    public Output<Boolean> unableToCrawl() {
        return this.unableToCrawl == null ? Codegen.empty() : this.unableToCrawl;
    }

    public FailureDetailArgs(
        @Nullable Output<Boolean> crashed,
        @Nullable Output<Boolean> deviceOutOfMemory,
        @Nullable Output<Boolean> failedRoboscript,
        @Nullable Output<Boolean> notInstalled,
        @Nullable Output<Boolean> otherNativeCrash,
        @Nullable Output<Boolean> timedOut,
        @Nullable Output<Boolean> unableToCrawl) {
        this.crashed = crashed;
        this.deviceOutOfMemory = deviceOutOfMemory;
        this.failedRoboscript = failedRoboscript;
        this.notInstalled = notInstalled;
        this.otherNativeCrash = otherNativeCrash;
        this.timedOut = timedOut;
        this.unableToCrawl = unableToCrawl;
    }

    private FailureDetailArgs() {
        this.crashed = Codegen.empty();
        this.deviceOutOfMemory = Codegen.empty();
        this.failedRoboscript = Codegen.empty();
        this.notInstalled = Codegen.empty();
        this.otherNativeCrash = Codegen.empty();
        this.timedOut = Codegen.empty();
        this.unableToCrawl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailureDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> crashed;
        private @Nullable Output<Boolean> deviceOutOfMemory;
        private @Nullable Output<Boolean> failedRoboscript;
        private @Nullable Output<Boolean> notInstalled;
        private @Nullable Output<Boolean> otherNativeCrash;
        private @Nullable Output<Boolean> timedOut;
        private @Nullable Output<Boolean> unableToCrawl;

        public Builder() {
    	      // Empty
        }

        public Builder(FailureDetailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crashed = defaults.crashed;
    	      this.deviceOutOfMemory = defaults.deviceOutOfMemory;
    	      this.failedRoboscript = defaults.failedRoboscript;
    	      this.notInstalled = defaults.notInstalled;
    	      this.otherNativeCrash = defaults.otherNativeCrash;
    	      this.timedOut = defaults.timedOut;
    	      this.unableToCrawl = defaults.unableToCrawl;
        }

        public Builder crashed(@Nullable Output<Boolean> crashed) {
            this.crashed = crashed;
            return this;
        }
        public Builder crashed(@Nullable Boolean crashed) {
            this.crashed = Codegen.ofNullable(crashed);
            return this;
        }
        public Builder deviceOutOfMemory(@Nullable Output<Boolean> deviceOutOfMemory) {
            this.deviceOutOfMemory = deviceOutOfMemory;
            return this;
        }
        public Builder deviceOutOfMemory(@Nullable Boolean deviceOutOfMemory) {
            this.deviceOutOfMemory = Codegen.ofNullable(deviceOutOfMemory);
            return this;
        }
        public Builder failedRoboscript(@Nullable Output<Boolean> failedRoboscript) {
            this.failedRoboscript = failedRoboscript;
            return this;
        }
        public Builder failedRoboscript(@Nullable Boolean failedRoboscript) {
            this.failedRoboscript = Codegen.ofNullable(failedRoboscript);
            return this;
        }
        public Builder notInstalled(@Nullable Output<Boolean> notInstalled) {
            this.notInstalled = notInstalled;
            return this;
        }
        public Builder notInstalled(@Nullable Boolean notInstalled) {
            this.notInstalled = Codegen.ofNullable(notInstalled);
            return this;
        }
        public Builder otherNativeCrash(@Nullable Output<Boolean> otherNativeCrash) {
            this.otherNativeCrash = otherNativeCrash;
            return this;
        }
        public Builder otherNativeCrash(@Nullable Boolean otherNativeCrash) {
            this.otherNativeCrash = Codegen.ofNullable(otherNativeCrash);
            return this;
        }
        public Builder timedOut(@Nullable Output<Boolean> timedOut) {
            this.timedOut = timedOut;
            return this;
        }
        public Builder timedOut(@Nullable Boolean timedOut) {
            this.timedOut = Codegen.ofNullable(timedOut);
            return this;
        }
        public Builder unableToCrawl(@Nullable Output<Boolean> unableToCrawl) {
            this.unableToCrawl = unableToCrawl;
            return this;
        }
        public Builder unableToCrawl(@Nullable Boolean unableToCrawl) {
            this.unableToCrawl = Codegen.ofNullable(unableToCrawl);
            return this;
        }        public FailureDetailArgs build() {
            return new FailureDetailArgs(crashed, deviceOutOfMemory, failedRoboscript, notInstalled, otherNativeCrash, timedOut, unableToCrawl);
        }
    }
}
