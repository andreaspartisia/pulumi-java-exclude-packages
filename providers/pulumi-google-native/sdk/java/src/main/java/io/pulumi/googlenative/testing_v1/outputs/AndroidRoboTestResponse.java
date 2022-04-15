// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.testing_v1.outputs.AppBundleResponse;
import io.pulumi.googlenative.testing_v1.outputs.FileReferenceResponse;
import io.pulumi.googlenative.testing_v1.outputs.RoboDirectiveResponse;
import io.pulumi.googlenative.testing_v1.outputs.RoboStartingIntentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AndroidRoboTestResponse {
    /**
     * The APK for the application under test.
     * 
     */
    private final FileReferenceResponse appApk;
    /**
     * A multi-apk app bundle for the application under test.
     * 
     */
    private final AppBundleResponse appBundle;
    /**
     * The initial activity that should be used to start the app.
     * 
     */
    private final String appInitialActivity;
    /**
     * The java package for the application under test. The default value is determined by examining the application's manifest.
     * 
     */
    private final String appPackageId;
    /**
     * A set of directives Robo should apply during the crawl. This allows users to customize the crawl. For example, the username and password for a test account can be provided.
     * 
     */
    private final List<RoboDirectiveResponse> roboDirectives;
    /**
     * The mode in which Robo should run. Most clients should allow the server to populate this field automatically.
     * 
     */
    private final String roboMode;
    /**
     * A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
     * 
     */
    private final FileReferenceResponse roboScript;
    /**
     * The intents used to launch the app for the crawl. If none are provided, then the main launcher activity is launched. If some are provided, then only those provided are launched (the main launcher activity must be provided explicitly).
     * 
     */
    private final List<RoboStartingIntentResponse> startingIntents;

    @CustomType.Constructor
    private AndroidRoboTestResponse(
        @CustomType.Parameter("appApk") FileReferenceResponse appApk,
        @CustomType.Parameter("appBundle") AppBundleResponse appBundle,
        @CustomType.Parameter("appInitialActivity") String appInitialActivity,
        @CustomType.Parameter("appPackageId") String appPackageId,
        @CustomType.Parameter("roboDirectives") List<RoboDirectiveResponse> roboDirectives,
        @CustomType.Parameter("roboMode") String roboMode,
        @CustomType.Parameter("roboScript") FileReferenceResponse roboScript,
        @CustomType.Parameter("startingIntents") List<RoboStartingIntentResponse> startingIntents) {
        this.appApk = appApk;
        this.appBundle = appBundle;
        this.appInitialActivity = appInitialActivity;
        this.appPackageId = appPackageId;
        this.roboDirectives = roboDirectives;
        this.roboMode = roboMode;
        this.roboScript = roboScript;
        this.startingIntents = startingIntents;
    }

    /**
     * The APK for the application under test.
     * 
    */
    public FileReferenceResponse appApk() {
        return this.appApk;
    }
    /**
     * A multi-apk app bundle for the application under test.
     * 
    */
    public AppBundleResponse appBundle() {
        return this.appBundle;
    }
    /**
     * The initial activity that should be used to start the app.
     * 
    */
    public String appInitialActivity() {
        return this.appInitialActivity;
    }
    /**
     * The java package for the application under test. The default value is determined by examining the application's manifest.
     * 
    */
    public String appPackageId() {
        return this.appPackageId;
    }
    /**
     * A set of directives Robo should apply during the crawl. This allows users to customize the crawl. For example, the username and password for a test account can be provided.
     * 
    */
    public List<RoboDirectiveResponse> roboDirectives() {
        return this.roboDirectives;
    }
    /**
     * The mode in which Robo should run. Most clients should allow the server to populate this field automatically.
     * 
    */
    public String roboMode() {
        return this.roboMode;
    }
    /**
     * A JSON file with a sequence of actions Robo should perform as a prologue for the crawl.
     * 
    */
    public FileReferenceResponse roboScript() {
        return this.roboScript;
    }
    /**
     * The intents used to launch the app for the crawl. If none are provided, then the main launcher activity is launched. If some are provided, then only those provided are launched (the main launcher activity must be provided explicitly).
     * 
    */
    public List<RoboStartingIntentResponse> startingIntents() {
        return this.startingIntents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidRoboTestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileReferenceResponse appApk;
        private AppBundleResponse appBundle;
        private String appInitialActivity;
        private String appPackageId;
        private List<RoboDirectiveResponse> roboDirectives;
        private String roboMode;
        private FileReferenceResponse roboScript;
        private List<RoboStartingIntentResponse> startingIntents;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidRoboTestResponse defaults) {
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

        public Builder appApk(FileReferenceResponse appApk) {
            this.appApk = Objects.requireNonNull(appApk);
            return this;
        }
        public Builder appBundle(AppBundleResponse appBundle) {
            this.appBundle = Objects.requireNonNull(appBundle);
            return this;
        }
        public Builder appInitialActivity(String appInitialActivity) {
            this.appInitialActivity = Objects.requireNonNull(appInitialActivity);
            return this;
        }
        public Builder appPackageId(String appPackageId) {
            this.appPackageId = Objects.requireNonNull(appPackageId);
            return this;
        }
        public Builder roboDirectives(List<RoboDirectiveResponse> roboDirectives) {
            this.roboDirectives = Objects.requireNonNull(roboDirectives);
            return this;
        }
        public Builder roboDirectives(RoboDirectiveResponse... roboDirectives) {
            return roboDirectives(List.of(roboDirectives));
        }
        public Builder roboMode(String roboMode) {
            this.roboMode = Objects.requireNonNull(roboMode);
            return this;
        }
        public Builder roboScript(FileReferenceResponse roboScript) {
            this.roboScript = Objects.requireNonNull(roboScript);
            return this;
        }
        public Builder startingIntents(List<RoboStartingIntentResponse> startingIntents) {
            this.startingIntents = Objects.requireNonNull(startingIntents);
            return this;
        }
        public Builder startingIntents(RoboStartingIntentResponse... startingIntents) {
            return startingIntents(List.of(startingIntents));
        }        public AndroidRoboTestResponse build() {
            return new AndroidRoboTestResponse(appApk, appBundle, appInitialActivity, appPackageId, roboDirectives, roboMode, roboScript, startingIntents);
        }
    }
}
