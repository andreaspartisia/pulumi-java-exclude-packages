// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1beta1.inputs.LicenseArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PackageInfoOccurrence represents an SPDX Package Information section: https://spdx.github.io/spdx-spec/3-package-information/
 * 
 */
public final class PackageInfoOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PackageInfoOccurrenceArgs Empty = new PackageInfoOccurrenceArgs();

    /**
     * A place for the SPDX file creator to record any general comments about the package being described
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> comment() {
        return this.comment == null ? Codegen.empty() : this.comment;
    }

    /**
     * Provide the actual file name of the package, or path of the directory being treated as a package
     * 
     */
    @Import(name="filename")
      private final @Nullable Output<String> filename;

    public Output<String> filename() {
        return this.filename == null ? Codegen.empty() : this.filename;
    }

    /**
     * Uniquely identify any element in an SPDX document which may be referenced by other elements
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * package or alternative values, if the governing license cannot be determined
     * 
     */
    @Import(name="licenseConcluded")
      private final @Nullable Output<LicenseArgs> licenseConcluded;

    public Output<LicenseArgs> licenseConcluded() {
        return this.licenseConcluded == null ? Codegen.empty() : this.licenseConcluded;
    }

    /**
     * Provide a place for the SPDX file creator to record any relevant background information or additional comments about the origin of the package
     * 
     */
    @Import(name="sourceInfo")
      private final @Nullable Output<String> sourceInfo;

    public Output<String> sourceInfo() {
        return this.sourceInfo == null ? Codegen.empty() : this.sourceInfo;
    }

    public PackageInfoOccurrenceArgs(
        @Nullable Output<String> comment,
        @Nullable Output<String> filename,
        @Nullable Output<String> id,
        @Nullable Output<LicenseArgs> licenseConcluded,
        @Nullable Output<String> sourceInfo) {
        this.comment = comment;
        this.filename = filename;
        this.id = id;
        this.licenseConcluded = licenseConcluded;
        this.sourceInfo = sourceInfo;
    }

    private PackageInfoOccurrenceArgs() {
        this.comment = Codegen.empty();
        this.filename = Codegen.empty();
        this.id = Codegen.empty();
        this.licenseConcluded = Codegen.empty();
        this.sourceInfo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageInfoOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;
        private @Nullable Output<String> filename;
        private @Nullable Output<String> id;
        private @Nullable Output<LicenseArgs> licenseConcluded;
        private @Nullable Output<String> sourceInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageInfoOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.filename = defaults.filename;
    	      this.id = defaults.id;
    	      this.licenseConcluded = defaults.licenseConcluded;
    	      this.sourceInfo = defaults.sourceInfo;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Codegen.ofNullable(comment);
            return this;
        }
        public Builder filename(@Nullable Output<String> filename) {
            this.filename = filename;
            return this;
        }
        public Builder filename(@Nullable String filename) {
            this.filename = Codegen.ofNullable(filename);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder licenseConcluded(@Nullable Output<LicenseArgs> licenseConcluded) {
            this.licenseConcluded = licenseConcluded;
            return this;
        }
        public Builder licenseConcluded(@Nullable LicenseArgs licenseConcluded) {
            this.licenseConcluded = Codegen.ofNullable(licenseConcluded);
            return this;
        }
        public Builder sourceInfo(@Nullable Output<String> sourceInfo) {
            this.sourceInfo = sourceInfo;
            return this;
        }
        public Builder sourceInfo(@Nullable String sourceInfo) {
            this.sourceInfo = Codegen.ofNullable(sourceInfo);
            return this;
        }        public PackageInfoOccurrenceArgs build() {
            return new PackageInfoOccurrenceArgs(comment, filename, id, licenseConcluded, sourceInfo);
        }
    }
}
