// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.testing_v1.enums.AndroidRoboTestRoboMode;
import io.pulumi.googlenative.testing_v1.inputs.AppBundleArgs;
import io.pulumi.googlenative.testing_v1.inputs.FileReferenceArgs;
import io.pulumi.googlenative.testing_v1.inputs.RoboDirectiveArgs;
import io.pulumi.googlenative.testing_v1.inputs.RoboStartingIntentArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A test of an android application that explores the application on a virtual or physical Android Device, finding culprits and crashes as it goes.
 * 
 */
public final class AndroidRoboTestArgs extends io.pulumi.resources.ResourceArgs {

    public static final AndroidRoboTestArgs Empty = new AndroidRoboTestArgs();

    /**
     * The APK for the application under test.
     * 
     */
    @Import(name="appApk")
      private final @Nullable Output<FileReferenceArgs> appApk;

    public Output<FileReferenceArgs> appApk() {
        return this.appApk == null ? Codegen.empty() : this.appApk;
    }

    /**
     * A multi-apk app bundle for the application under test.
     * 
     */
    @Import(name="appBundle")
      private final @Nullable Output<AppBundleArgs> appBundle;

    public Output<AppBundleArgs> appBundle() {
        return this.appBundle == null ? Codegen.empty() : this.appBundle;
    }

    /**
     * The initial activity that should be used to start the app.
     * 
     */
    @Import(name="appInitialActivity")
      private final @Nullable Output<String> appInitialActivity;

    public Output<String> appInitialActivity() {
        return this.appInitialActivity == null ? Codegen.empty() : this.appInitialActivity;
    }

    /**
     * The java package for the application under test. The default value is determined by examining the application's manifest.
     * 
     */
    @Import(name="appPackageId")
      private final @Nullable Output<String> appPackageId;

    public Output<String> appPackageId() {
        return this.appPackageId == null ? Codegen.empty() : this.appPackageId;
    }

    /**
     * A set of directives Robo should apply during the crawl. This allows users to customize the crawl. For example, the username and password for a test account can be provided.
     * 
     */
    @Import(name="roboDirectives")
      private final @Nullable Output<List<RoboDirectiveArgs>> roboDirectives;

    public Output<List<RoboDirectiveArgs>> roboDirectives() {
        return this.roboDirectives == null ? Codegen.empty() : this.roboDirectives;
    }

    /**
     * The mode in which Robo should run. Most clients should allow the server to populate this field automatically.
     * 
     */
    @Import(name="roboMode")
      private final @Nullable Output<AndroidRoboTestRoboMode> roboMode;

    public Output<AndroidRoboTestRoboMode> roboMode() {
        return this.roboMode == null ? Codegen.empty() : this.roboMode;
    }

    /**
     * A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
     * 
     */
    @Import(name="roboScript")
      private final @Nullable Output<FileReferenceArgs> roboScript;

    public Output<FileReferenceArgs> roboScript() {
        return this.roboScript == null ? Codegen.empty() : this.roboScript;
    }

    /**
     * The intents used to launch the app for the crawl. If none are provided, then the main launcher activity is launched. If some are provided, then only those provided are launched (the main launcher activity must be provided explicitly).
     * 
     */
    @Import(name="startingIntents")
      private final @Nullable Output<List<RoboStartingIntentArgs>> startingIntents;

    public Output<List<RoboStartingIntentArgs>> startingIntents() {
        return this.startingIntents == null ? Codegen.empty() : this.startingIntents;
    }

    public AndroidRoboTestArgs(
        @Nullable Output<FileReferenceArgs> appApk,
        @Nullable Output<AppBundleArgs> appBundle,
        @Nullable Output<String> appInitialActivity,
        @Nullable Output<String> appPackageId,
        @Nullable Output<List<RoboDirectiveArgs>> roboDirectives,
        @Nullable Output<AndroidRoboTestRoboMode> roboMode,
        @Nullable Output<FileReferenceArgs> roboScript,
        @Nullable Output<List<RoboStartingIntentArgs>> startingIntents) {
        this.appApk = appApk;
        this.appBundle = appBundle;
        this.appInitialActivity = appInitialActivity;
        this.appPackageId = appPackageId;
        this.roboDirectives = roboDirectives;
        this.roboMode = roboMode;
        this.roboScript = roboScript;
        this.startingIntents = startingIntents;
    }

    private AndroidRoboTestArgs() {
        this.appApk = Codegen.empty();
        this.appBundle = Codegen.empty();
        this.appInitialActivity = Codegen.empty();
        this.appPackageId = Codegen.empty();
        this.roboDirectives = Codegen.empty();
        this.roboMode = Codegen.empty();
        this.roboScript = Codegen.empty();
        this.startingIntents = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidRoboTestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FileReferenceArgs> appApk;
        private @Nullable Output<AppBundleArgs> appBundle;
        private @Nullable Output<String> appInitialActivity;
        private @Nullable Output<String> appPackageId;
        private @Nullable Output<List<RoboDirectiveArgs>> roboDirectives;
        private @Nullable Output<AndroidRoboTestRoboMode> roboMode;
        private @Nullable Output<FileReferenceArgs> roboScript;
        private @Nullable Output<List<RoboStartingIntentArgs>> startingIntents;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidRoboTestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appApk = defaults.appApk;
    	      this.appBundle = defaults.appBundle;
    	      this.appInitialActivity = defaults.appInitialActivity;
    	      this.appPackageId = defaults.appPackageId;
    	      this.roboDirectives = defaults.roboDirectives;
    	      this.roboMode = defaults.roboMode;
    	      this.roboScript = defaults.roboScript;
    	      this.startingIntents = defaults.startingIntents;
        }

        public Builder appApk(@Nullable Output<FileReferenceArgs> appApk) {
            this.appApk = appApk;
            return this;
        }
        public Builder appApk(@Nullable FileReferenceArgs appApk) {
            this.appApk = Codegen.ofNullable(appApk);
            return this;
        }
        public Builder appBundle(@Nullable Output<AppBundleArgs> appBundle) {
            this.appBundle = appBundle;
            return this;
        }
        public Builder appBundle(@Nullable AppBundleArgs appBundle) {
            this.appBundle = Codegen.ofNullable(appBundle);
            return this;
        }
        public Builder appInitialActivity(@Nullable Output<String> appInitialActivity) {
            this.appInitialActivity = appInitialActivity;
            return this;
        }
        public Builder appInitialActivity(@Nullable String appInitialActivity) {
            this.appInitialActivity = Codegen.ofNullable(appInitialActivity);
            return this;
        }
        public Builder appPackageId(@Nullable Output<String> appPackageId) {
            this.appPackageId = appPackageId;
            return this;
        }
        public Builder appPackageId(@Nullable String appPackageId) {
            this.appPackageId = Codegen.ofNullable(appPackageId);
            return this;
        }
        public Builder roboDirectives(@Nullable Output<List<RoboDirectiveArgs>> roboDirectives) {
            this.roboDirectives = roboDirectives;
            return this;
        }
        public Builder roboDirectives(@Nullable List<RoboDirectiveArgs> roboDirectives) {
            this.roboDirectives = Codegen.ofNullable(roboDirectives);
            return this;
        }
        public Builder roboDirectives(RoboDirectiveArgs... roboDirectives) {
            return roboDirectives(List.of(roboDirectives));
        }
        public Builder roboMode(@Nullable Output<AndroidRoboTestRoboMode> roboMode) {
            this.roboMode = roboMode;
            return this;
        }
        public Builder roboMode(@Nullable AndroidRoboTestRoboMode roboMode) {
            this.roboMode = Codegen.ofNullable(roboMode);
            return this;
        }
        public Builder roboScript(@Nullable Output<FileReferenceArgs> roboScript) {
            this.roboScript = roboScript;
            return this;
        }
        public Builder roboScript(@Nullable FileReferenceArgs roboScript) {
            this.roboScript = Codegen.ofNullable(roboScript);
            return this;
        }
        public Builder startingIntents(@Nullable Output<List<RoboStartingIntentArgs>> startingIntents) {
            this.startingIntents = startingIntents;
            return this;
        }
        public Builder startingIntents(@Nullable List<RoboStartingIntentArgs> startingIntents) {
            this.startingIntents = Codegen.ofNullable(startingIntents);
            return this;
        }
        public Builder startingIntents(RoboStartingIntentArgs... startingIntents) {
            return startingIntents(List.of(startingIntents));
        }        public AndroidRoboTestArgs build() {
            return new AndroidRoboTestArgs(appApk, appBundle, appInitialActivity, appPackageId, roboDirectives, roboMode, roboScript, startingIntents);
        }
    }
}
