// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import java.util.Objects;


public final class StreamingImageTagsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamingImageTagsArgs Empty = new StreamingImageTagsArgs();

    public StreamingImageTagsArgs() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingImageTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingImageTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public StreamingImageTagsArgs build() {
            return new StreamingImageTagsArgs();
        }
    }
}