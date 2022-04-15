// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is used for defining User Defined Function (UDF) resources only when using legacy SQL. Users of Standard SQL should leverage either DDL (e.g. CREATE [TEMPORARY] FUNCTION ... ) or the Routines API to define UDF resources. For additional information on migrating, see: https://cloud.google.com/bigquery/docs/reference/standard-sql/migrating-from-legacy-sql#differences_in_user-defined_javascript_functions
 * 
 */
public final class UserDefinedFunctionResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserDefinedFunctionResourceArgs Empty = new UserDefinedFunctionResourceArgs();

    /**
     * [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    @Import(name="inlineCode")
      private final @Nullable Output<String> inlineCode;

    public Output<String> inlineCode() {
        return this.inlineCode == null ? Codegen.empty() : this.inlineCode;
    }

    /**
     * [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    @Import(name="resourceUri")
      private final @Nullable Output<String> resourceUri;

    public Output<String> resourceUri() {
        return this.resourceUri == null ? Codegen.empty() : this.resourceUri;
    }

    public UserDefinedFunctionResourceArgs(
        @Nullable Output<String> inlineCode,
        @Nullable Output<String> resourceUri) {
        this.inlineCode = inlineCode;
        this.resourceUri = resourceUri;
    }

    private UserDefinedFunctionResourceArgs() {
        this.inlineCode = Codegen.empty();
        this.resourceUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserDefinedFunctionResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> inlineCode;
        private @Nullable Output<String> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(UserDefinedFunctionResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineCode = defaults.inlineCode;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder inlineCode(@Nullable Output<String> inlineCode) {
            this.inlineCode = inlineCode;
            return this;
        }
        public Builder inlineCode(@Nullable String inlineCode) {
            this.inlineCode = Codegen.ofNullable(inlineCode);
            return this;
        }
        public Builder resourceUri(@Nullable Output<String> resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }
        public Builder resourceUri(@Nullable String resourceUri) {
            this.resourceUri = Codegen.ofNullable(resourceUri);
            return this;
        }        public UserDefinedFunctionResourceArgs build() {
            return new UserDefinedFunctionResourceArgs(inlineCode, resourceUri);
        }
    }
}
