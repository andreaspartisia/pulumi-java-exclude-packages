// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DocumentationRuleResponse {
    /**
     * Deprecation description of the selected element(s). It can be provided if an element is marked as `deprecated`.
     * 
     */
    private final String deprecationDescription;
    /**
     * Description of the selected proto element (e.g. a message, a method, a 'service' definition, or a field). Defaults to leading & trailing comments taken from the proto source definition of the proto element.
     * 
     */
    private final String description;
    /**
     * The selector is a comma-separated list of patterns for any element such as a method, a field, an enum value. Each pattern is a qualified name of the element which may end in "*", indicating a wildcard. Wildcards are only allowed at the end and for a whole component of the qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match one or more components. To specify a default for all applicable elements, the whole pattern "*" is used.
     * 
     */
    private final String selector;

    @CustomType.Constructor
    private DocumentationRuleResponse(
        @CustomType.Parameter("deprecationDescription") String deprecationDescription,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("selector") String selector) {
        this.deprecationDescription = deprecationDescription;
        this.description = description;
        this.selector = selector;
    }

    /**
     * Deprecation description of the selected element(s). It can be provided if an element is marked as `deprecated`.
     * 
    */
    public String deprecationDescription() {
        return this.deprecationDescription;
    }
    /**
     * Description of the selected proto element (e.g. a message, a method, a 'service' definition, or a field). Defaults to leading & trailing comments taken from the proto source definition of the proto element.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The selector is a comma-separated list of patterns for any element such as a method, a field, an enum value. Each pattern is a qualified name of the element which may end in "*", indicating a wildcard. Wildcards are only allowed at the end and for a whole component of the qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match one or more components. To specify a default for all applicable elements, the whole pattern "*" is used.
     * 
    */
    public String selector() {
        return this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deprecationDescription;
        private String description;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deprecationDescription = defaults.deprecationDescription;
    	      this.description = defaults.description;
    	      this.selector = defaults.selector;
        }

        public Builder deprecationDescription(String deprecationDescription) {
            this.deprecationDescription = Objects.requireNonNull(deprecationDescription);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }        public DocumentationRuleResponse build() {
            return new DocumentationRuleResponse(deprecationDescription, description, selector);
        }
    }
}
