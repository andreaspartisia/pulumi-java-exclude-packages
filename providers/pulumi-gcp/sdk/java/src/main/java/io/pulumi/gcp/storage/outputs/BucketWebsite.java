// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BucketWebsite {
    /**
     * Behaves as the bucket's directory index where
     * missing objects are treated as potential directories.
     * 
     */
    private final @Nullable String mainPageSuffix;
    /**
     * The custom object to return when a requested
     * resource is not found.
     * 
     */
    private final @Nullable String notFoundPage;

    @OutputCustomType.Constructor({"mainPageSuffix","notFoundPage"})
    private BucketWebsite(
        @Nullable String mainPageSuffix,
        @Nullable String notFoundPage) {
        this.mainPageSuffix = mainPageSuffix;
        this.notFoundPage = notFoundPage;
    }

    /**
     * Behaves as the bucket's directory index where
     * missing objects are treated as potential directories.
     * 
     */
    public Optional<String> getMainPageSuffix() {
        return Optional.ofNullable(this.mainPageSuffix);
    }
    /**
     * The custom object to return when a requested
     * resource is not found.
     * 
     */
    public Optional<String> getNotFoundPage() {
        return Optional.ofNullable(this.notFoundPage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsite defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mainPageSuffix;
        private @Nullable String notFoundPage;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketWebsite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mainPageSuffix = defaults.mainPageSuffix;
    	      this.notFoundPage = defaults.notFoundPage;
        }

        public Builder setMainPageSuffix(@Nullable String mainPageSuffix) {
            this.mainPageSuffix = mainPageSuffix;
            return this;
        }

        public Builder setNotFoundPage(@Nullable String notFoundPage) {
            this.notFoundPage = notFoundPage;
            return this;
        }

        public BucketWebsite build() {
            return new BucketWebsite(mainPageSuffix, notFoundPage);
        }
    }
}