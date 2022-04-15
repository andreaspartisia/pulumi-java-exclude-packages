// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message representing a set of files in a Cloud Storage bucket. Regular expressions are used to allow fine-grained control over which files in the bucket to include. Included files are those that match at least one item in `include_regex` and do not match any items in `exclude_regex`. Note that a file that matches items from both lists will _not_ be included. For a match to occur, the entire file path (i.e., everything in the url after the bucket name) must match the regular expression. For example, given the input `{bucket_name: "mybucket", include_regex: ["directory1/.*"], exclude_regex: ["directory1/excluded.*"]}`: * `gs://mybucket/directory1/myfile` will be included * `gs://mybucket/directory1/directory2/myfile` will be included (`.*` matches across `/`) * `gs://mybucket/directory0/directory1/myfile` will _not_ be included (the full path doesn't match any items in `include_regex`) * `gs://mybucket/directory1/excludedfile` will _not_ be included (the path matches an item in `exclude_regex`) If `include_regex` is left empty, it will match all files by default (this is equivalent to setting `include_regex: [".*"]`). Some other common use cases: * `{bucket_name: "mybucket", exclude_regex: [".*\.pdf"]}` will include all files in `mybucket` except for .pdf files * `{bucket_name: "mybucket", include_regex: ["directory/[^/]+"]}` will include all files directly under `gs://mybucket/directory/`, without matching across `/`
 * 
 */
public final class GooglePrivacyDlpV2CloudStorageRegexFileSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CloudStorageRegexFileSetArgs Empty = new GooglePrivacyDlpV2CloudStorageRegexFileSetArgs();

    /**
     * The name of a Cloud Storage bucket. Required.
     * 
     */
    @Import(name="bucketName")
      private final @Nullable Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName == null ? Codegen.empty() : this.bucketName;
    }

    /**
     * A list of regular expressions matching file paths to exclude. All files in the bucket that match at least one of these regular expressions will be excluded from the scan. Regular expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
     * 
     */
    @Import(name="excludeRegex")
      private final @Nullable Output<List<String>> excludeRegex;

    public Output<List<String>> excludeRegex() {
        return this.excludeRegex == null ? Codegen.empty() : this.excludeRegex;
    }

    /**
     * A list of regular expressions matching file paths to include. All files in the bucket that match at least one of these regular expressions will be included in the set of files, except for those that also match an item in `exclude_regex`. Leaving this field empty will match all files by default (this is equivalent to including `.*` in the list). Regular expressions use RE2 [syntax](https://github.com/google/re2/wiki/Syntax); a guide can be found under the google/re2 repository on GitHub.
     * 
     */
    @Import(name="includeRegex")
      private final @Nullable Output<List<String>> includeRegex;

    public Output<List<String>> includeRegex() {
        return this.includeRegex == null ? Codegen.empty() : this.includeRegex;
    }

    public GooglePrivacyDlpV2CloudStorageRegexFileSetArgs(
        @Nullable Output<String> bucketName,
        @Nullable Output<List<String>> excludeRegex,
        @Nullable Output<List<String>> includeRegex) {
        this.bucketName = bucketName;
        this.excludeRegex = excludeRegex;
        this.includeRegex = includeRegex;
    }

    private GooglePrivacyDlpV2CloudStorageRegexFileSetArgs() {
        this.bucketName = Codegen.empty();
        this.excludeRegex = Codegen.empty();
        this.includeRegex = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CloudStorageRegexFileSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucketName;
        private @Nullable Output<List<String>> excludeRegex;
        private @Nullable Output<List<String>> includeRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CloudStorageRegexFileSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketName = defaults.bucketName;
    	      this.excludeRegex = defaults.excludeRegex;
    	      this.includeRegex = defaults.includeRegex;
        }

        public Builder bucketName(@Nullable Output<String> bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public Builder bucketName(@Nullable String bucketName) {
            this.bucketName = Codegen.ofNullable(bucketName);
            return this;
        }
        public Builder excludeRegex(@Nullable Output<List<String>> excludeRegex) {
            this.excludeRegex = excludeRegex;
            return this;
        }
        public Builder excludeRegex(@Nullable List<String> excludeRegex) {
            this.excludeRegex = Codegen.ofNullable(excludeRegex);
            return this;
        }
        public Builder excludeRegex(String... excludeRegex) {
            return excludeRegex(List.of(excludeRegex));
        }
        public Builder includeRegex(@Nullable Output<List<String>> includeRegex) {
            this.includeRegex = includeRegex;
            return this;
        }
        public Builder includeRegex(@Nullable List<String> includeRegex) {
            this.includeRegex = Codegen.ofNullable(includeRegex);
            return this;
        }
        public Builder includeRegex(String... includeRegex) {
            return includeRegex(List.of(includeRegex));
        }        public GooglePrivacyDlpV2CloudStorageRegexFileSetArgs build() {
            return new GooglePrivacyDlpV2CloudStorageRegexFileSetArgs(bucketName, excludeRegex, includeRegex);
        }
    }
}
