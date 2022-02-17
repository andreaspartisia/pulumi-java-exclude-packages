// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PackagingGroupLogConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final PackagingGroupLogConfiguration Empty = new PackagingGroupLogConfiguration();

    /**
     * Sets a custom AWS CloudWatch log group name for egress logs. If a log group name isn't specified, the default name is used: /aws/MediaPackage/VodEgressAccessLogs.
     * 
     */
    @InputImport(name="logGroupName")
    private final @Nullable String logGroupName;

    public Optional<String> getLogGroupName() {
        return this.logGroupName == null ? Optional.empty() : Optional.ofNullable(this.logGroupName);
    }

    public PackagingGroupLogConfiguration(@Nullable String logGroupName) {
        this.logGroupName = logGroupName;
    }

    private PackagingGroupLogConfiguration() {
        this.logGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingGroupLogConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingGroupLogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
        }

        public Builder setLogGroupName(@Nullable String logGroupName) {
            this.logGroupName = logGroupName;
            return this;
        }

        public PackagingGroupLogConfiguration build() {
            return new PackagingGroupLogConfiguration(logGroupName);
        }
    }
}