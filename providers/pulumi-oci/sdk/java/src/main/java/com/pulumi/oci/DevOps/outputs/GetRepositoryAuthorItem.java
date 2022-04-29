// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetRepositoryAuthorItem {
    /**
     * @return Author name.
     * 
     */
    private final String authorName;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;

    @CustomType.Constructor
    private GetRepositoryAuthorItem(
        @CustomType.Parameter("authorName") String authorName,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags) {
        this.authorName = authorName;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    /**
     * @return Author name.
     * 
     */
    public String authorName() {
        return this.authorName;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryAuthorItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorName;
        private Map<String,Object> definedTags;
        private Map<String,Object> freeformTags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryAuthorItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorName = defaults.authorName;
    	      this.definedTags = defaults.definedTags;
    	      this.freeformTags = defaults.freeformTags;
        }

        public Builder authorName(String authorName) {
            this.authorName = Objects.requireNonNull(authorName);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }        public GetRepositoryAuthorItem build() {
            return new GetRepositoryAuthorItem(authorName, definedTags, freeformTags);
        }
    }
}
