// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListingDocumentationLink {
    /**
     * @return The category that the document belongs to.
     * 
     */
    private final String documentCategory;
    /**
     * @return Text that describes the resource.
     * 
     */
    private final String name;
    /**
     * @return The URL of the resource.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GetListingDocumentationLink(
        @CustomType.Parameter("documentCategory") String documentCategory,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("url") String url) {
        this.documentCategory = documentCategory;
        this.name = name;
        this.url = url;
    }

    /**
     * @return The category that the document belongs to.
     * 
     */
    public String documentCategory() {
        return this.documentCategory;
    }
    /**
     * @return Text that describes the resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The URL of the resource.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListingDocumentationLink defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentCategory;
        private String name;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListingDocumentationLink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentCategory = defaults.documentCategory;
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder documentCategory(String documentCategory) {
            this.documentCategory = Objects.requireNonNull(documentCategory);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetListingDocumentationLink build() {
            return new GetListingDocumentationLink(documentCategory, name, url);
        }
    }
}
