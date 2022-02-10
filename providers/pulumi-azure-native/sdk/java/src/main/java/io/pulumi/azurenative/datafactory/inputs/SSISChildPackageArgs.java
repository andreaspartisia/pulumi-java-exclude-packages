// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SSISChildPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final SSISChildPackageArgs Empty = new SSISChildPackageArgs();

    @InputImport(name="packageContent", required=true)
    private final Input<Object> packageContent;

    public Input<Object> getPackageContent() {
        return this.packageContent;
    }

    @InputImport(name="packageLastModifiedDate")
    private final @Nullable Input<String> packageLastModifiedDate;

    public Input<String> getPackageLastModifiedDate() {
        return this.packageLastModifiedDate == null ? Input.empty() : this.packageLastModifiedDate;
    }

    @InputImport(name="packageName")
    private final @Nullable Input<String> packageName;

    public Input<String> getPackageName() {
        return this.packageName == null ? Input.empty() : this.packageName;
    }

    @InputImport(name="packagePath", required=true)
    private final Input<Object> packagePath;

    public Input<Object> getPackagePath() {
        return this.packagePath;
    }

    public SSISChildPackageArgs(
        Input<Object> packageContent,
        @Nullable Input<String> packageLastModifiedDate,
        @Nullable Input<String> packageName,
        Input<Object> packagePath) {
        this.packageContent = Objects.requireNonNull(packageContent, "expected parameter 'packageContent' to be non-null");
        this.packageLastModifiedDate = packageLastModifiedDate;
        this.packageName = packageName;
        this.packagePath = Objects.requireNonNull(packagePath, "expected parameter 'packagePath' to be non-null");
    }

    private SSISChildPackageArgs() {
        this.packageContent = Input.empty();
        this.packageLastModifiedDate = Input.empty();
        this.packageName = Input.empty();
        this.packagePath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISChildPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Object> packageContent;
        private @Nullable Input<String> packageLastModifiedDate;
        private @Nullable Input<String> packageName;
        private Input<Object> packagePath;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISChildPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageContent = defaults.packageContent;
    	      this.packageLastModifiedDate = defaults.packageLastModifiedDate;
    	      this.packageName = defaults.packageName;
    	      this.packagePath = defaults.packagePath;
        }

        public Builder setPackageContent(Input<Object> packageContent) {
            this.packageContent = Objects.requireNonNull(packageContent);
            return this;
        }

        public Builder setPackageContent(Object packageContent) {
            this.packageContent = Input.of(Objects.requireNonNull(packageContent));
            return this;
        }

        public Builder setPackageLastModifiedDate(@Nullable Input<String> packageLastModifiedDate) {
            this.packageLastModifiedDate = packageLastModifiedDate;
            return this;
        }

        public Builder setPackageLastModifiedDate(@Nullable String packageLastModifiedDate) {
            this.packageLastModifiedDate = Input.ofNullable(packageLastModifiedDate);
            return this;
        }

        public Builder setPackageName(@Nullable Input<String> packageName) {
            this.packageName = packageName;
            return this;
        }

        public Builder setPackageName(@Nullable String packageName) {
            this.packageName = Input.ofNullable(packageName);
            return this;
        }

        public Builder setPackagePath(Input<Object> packagePath) {
            this.packagePath = Objects.requireNonNull(packagePath);
            return this;
        }

        public Builder setPackagePath(Object packagePath) {
            this.packagePath = Input.of(Objects.requireNonNull(packagePath));
            return this;
        }

        public SSISChildPackageArgs build() {
            return new SSISChildPackageArgs(packageContent, packageLastModifiedDate, packageName, packagePath);
        }
    }
}