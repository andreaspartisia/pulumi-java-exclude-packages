// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation.outputs;

import io.pulumi.awsnative.cloudformation.enums.TypeActivationVersionBump;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTypeActivationResult {
    /**
     * The Amazon Resource Name (ARN) of the extension.
     * 
     */
    private final @Nullable String arn;
    /**
     * Whether to automatically update the extension in this account and region when a new minor version is published by the extension publisher. Major versions released by the publisher must be manually updated.
     * 
     */
    private final @Nullable Boolean autoUpdate;
    /**
     * The Major Version of the type you want to enable
     * 
     */
    private final @Nullable String majorVersion;
    /**
     * Manually updates a previously-enabled type to a new major or minor version, if available. You can also use this parameter to update the value of AutoUpdateEnabled
     * 
     */
    private final @Nullable TypeActivationVersionBump versionBump;

    @OutputCustomType.Constructor({"arn","autoUpdate","majorVersion","versionBump"})
    private GetTypeActivationResult(
        @Nullable String arn,
        @Nullable Boolean autoUpdate,
        @Nullable String majorVersion,
        @Nullable TypeActivationVersionBump versionBump) {
        this.arn = arn;
        this.autoUpdate = autoUpdate;
        this.majorVersion = majorVersion;
        this.versionBump = versionBump;
    }

    /**
     * The Amazon Resource Name (ARN) of the extension.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Whether to automatically update the extension in this account and region when a new minor version is published by the extension publisher. Major versions released by the publisher must be manually updated.
     * 
     */
    public Optional<Boolean> getAutoUpdate() {
        return Optional.ofNullable(this.autoUpdate);
    }
    /**
     * The Major Version of the type you want to enable
     * 
     */
    public Optional<String> getMajorVersion() {
        return Optional.ofNullable(this.majorVersion);
    }
    /**
     * Manually updates a previously-enabled type to a new major or minor version, if available. You can also use this parameter to update the value of AutoUpdateEnabled
     * 
     */
    public Optional<TypeActivationVersionBump> getVersionBump() {
        return Optional.ofNullable(this.versionBump);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTypeActivationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Boolean autoUpdate;
        private @Nullable String majorVersion;
        private @Nullable TypeActivationVersionBump versionBump;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTypeActivationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.autoUpdate = defaults.autoUpdate;
    	      this.majorVersion = defaults.majorVersion;
    	      this.versionBump = defaults.versionBump;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setAutoUpdate(@Nullable Boolean autoUpdate) {
            this.autoUpdate = autoUpdate;
            return this;
        }

        public Builder setMajorVersion(@Nullable String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }

        public Builder setVersionBump(@Nullable TypeActivationVersionBump versionBump) {
            this.versionBump = versionBump;
            return this;
        }

        public GetTypeActivationResult build() {
            return new GetTypeActivationResult(arn, autoUpdate, majorVersion, versionBump);
        }
    }
}