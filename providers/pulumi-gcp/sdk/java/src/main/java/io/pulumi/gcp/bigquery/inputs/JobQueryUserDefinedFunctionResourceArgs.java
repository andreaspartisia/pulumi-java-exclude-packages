// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobQueryUserDefinedFunctionResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobQueryUserDefinedFunctionResourceArgs Empty = new JobQueryUserDefinedFunctionResourceArgs();

    /**
     * An inline resource that contains code for a user-defined function (UDF).
     * Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    @InputImport(name="inlineCode")
    private final @Nullable Input<String> inlineCode;

    public Input<String> getInlineCode() {
        return this.inlineCode == null ? Input.empty() : this.inlineCode;
    }

    /**
     * A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    @InputImport(name="resourceUri")
    private final @Nullable Input<String> resourceUri;

    public Input<String> getResourceUri() {
        return this.resourceUri == null ? Input.empty() : this.resourceUri;
    }

    public JobQueryUserDefinedFunctionResourceArgs(
        @Nullable Input<String> inlineCode,
        @Nullable Input<String> resourceUri) {
        this.inlineCode = inlineCode;
        this.resourceUri = resourceUri;
    }

    private JobQueryUserDefinedFunctionResourceArgs() {
        this.inlineCode = Input.empty();
        this.resourceUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryUserDefinedFunctionResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> inlineCode;
        private @Nullable Input<String> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryUserDefinedFunctionResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineCode = defaults.inlineCode;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setInlineCode(@Nullable Input<String> inlineCode) {
            this.inlineCode = inlineCode;
            return this;
        }

        public Builder setInlineCode(@Nullable String inlineCode) {
            this.inlineCode = Input.ofNullable(inlineCode);
            return this;
        }

        public Builder setResourceUri(@Nullable Input<String> resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public Builder setResourceUri(@Nullable String resourceUri) {
            this.resourceUri = Input.ofNullable(resourceUri);
            return this;
        }

        public JobQueryUserDefinedFunctionResourceArgs build() {
            return new JobQueryUserDefinedFunctionResourceArgs(inlineCode, resourceUri);
        }
    }
}