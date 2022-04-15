// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A set of Android device configuration permutations is defined by the the cross-product of the given axes. Internally, the given AndroidMatrix will be expanded into a set of AndroidDevices. Only supported permutations will be instantiated. Invalid permutations (e.g., incompatible models/versions) are ignored.
 * 
 */
public final class AndroidMatrixResponse extends io.pulumi.resources.InvokeArgs {

    public static final AndroidMatrixResponse Empty = new AndroidMatrixResponse();

    /**
     * The ids of the set of Android device to be used. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @Import(name="androidModelIds", required=true)
      private final List<String> androidModelIds;

    public List<String> androidModelIds() {
        return this.androidModelIds;
    }

    /**
     * The ids of the set of Android OS version to be used. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @Import(name="androidVersionIds", required=true)
      private final List<String> androidVersionIds;

    public List<String> androidVersionIds() {
        return this.androidVersionIds;
    }

    /**
     * The set of locales the test device will enable for testing. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @Import(name="locales", required=true)
      private final List<String> locales;

    public List<String> locales() {
        return this.locales;
    }

    /**
     * The set of orientations to test with. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @Import(name="orientations", required=true)
      private final List<String> orientations;

    public List<String> orientations() {
        return this.orientations;
    }

    public AndroidMatrixResponse(
        List<String> androidModelIds,
        List<String> androidVersionIds,
        List<String> locales,
        List<String> orientations) {
        this.androidModelIds = Objects.requireNonNull(androidModelIds, "expected parameter 'androidModelIds' to be non-null");
        this.androidVersionIds = Objects.requireNonNull(androidVersionIds, "expected parameter 'androidVersionIds' to be non-null");
        this.locales = Objects.requireNonNull(locales, "expected parameter 'locales' to be non-null");
        this.orientations = Objects.requireNonNull(orientations, "expected parameter 'orientations' to be non-null");
    }

    private AndroidMatrixResponse() {
        this.androidModelIds = List.of();
        this.androidVersionIds = List.of();
        this.locales = List.of();
        this.orientations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidMatrixResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> androidModelIds;
        private List<String> androidVersionIds;
        private List<String> locales;
        private List<String> orientations;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidMatrixResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidModelIds = defaults.androidModelIds;
    	      this.androidVersionIds = defaults.androidVersionIds;
    	      this.locales = defaults.locales;
    	      this.orientations = defaults.orientations;
        }

        public Builder androidModelIds(List<String> androidModelIds) {
            this.androidModelIds = Objects.requireNonNull(androidModelIds);
            return this;
        }
        public Builder androidModelIds(String... androidModelIds) {
            return androidModelIds(List.of(androidModelIds));
        }
        public Builder androidVersionIds(List<String> androidVersionIds) {
            this.androidVersionIds = Objects.requireNonNull(androidVersionIds);
            return this;
        }
        public Builder androidVersionIds(String... androidVersionIds) {
            return androidVersionIds(List.of(androidVersionIds));
        }
        public Builder locales(List<String> locales) {
            this.locales = Objects.requireNonNull(locales);
            return this;
        }
        public Builder locales(String... locales) {
            return locales(List.of(locales));
        }
        public Builder orientations(List<String> orientations) {
            this.orientations = Objects.requireNonNull(orientations);
            return this;
        }
        public Builder orientations(String... orientations) {
            return orientations(List.of(orientations));
        }        public AndroidMatrixResponse build() {
            return new AndroidMatrixResponse(androidModelIds, androidVersionIds, locales, orientations);
        }
    }
}
