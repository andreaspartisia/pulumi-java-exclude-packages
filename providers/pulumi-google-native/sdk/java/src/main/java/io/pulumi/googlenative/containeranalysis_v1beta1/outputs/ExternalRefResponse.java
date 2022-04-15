// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ExternalRefResponse {
    /**
     * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
     * 
     */
    private final String category;
    /**
     * Human-readable information about the purpose and target of the reference
     * 
     */
    private final String comment;
    /**
     * The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location
     * 
     */
    private final String locator;
    /**
     * Type of category (e.g. 'npm' for the PACKAGE_MANAGER category)
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ExternalRefResponse(
        @CustomType.Parameter("category") String category,
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("locator") String locator,
        @CustomType.Parameter("type") String type) {
        this.category = category;
        this.comment = comment;
        this.locator = locator;
        this.type = type;
    }

    /**
     * An External Reference allows a Package to reference an external source of additional information, metadata, enumerations, asset identifiers, or downloadable content believed to be relevant to the Package
     * 
    */
    public String category() {
        return this.category;
    }
    /**
     * Human-readable information about the purpose and target of the reference
     * 
    */
    public String comment() {
        return this.comment;
    }
    /**
     * The unique string with no spaces necessary to access the package-specific information, metadata, or content within the target location
     * 
    */
    public String locator() {
        return this.locator;
    }
    /**
     * Type of category (e.g. 'npm' for the PACKAGE_MANAGER category)
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalRefResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String category;
        private String comment;
        private String locator;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalRefResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.comment = defaults.comment;
    	      this.locator = defaults.locator;
    	      this.type = defaults.type;
        }

        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder locator(String locator) {
            this.locator = Objects.requireNonNull(locator);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ExternalRefResponse build() {
            return new ExternalRefResponse(category, comment, locator, type);
        }
    }
}
