// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCompatibleFormatsForSensitiveTypeFormatsForSensitiveTypeMaskingFormat {
    /**
     * @return The description of the masking format.
     * 
     */
    private final String description;
    /**
     * @return The OCID of the masking format.
     * 
     */
    private final String id;
    /**
     * @return The name of the masking format.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetCompatibleFormatsForSensitiveTypeFormatsForSensitiveTypeMaskingFormat(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name) {
        this.description = description;
        this.id = id;
        this.name = name;
    }

    /**
     * @return The description of the masking format.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The OCID of the masking format.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the masking format.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCompatibleFormatsForSensitiveTypeFormatsForSensitiveTypeMaskingFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCompatibleFormatsForSensitiveTypeFormatsForSensitiveTypeMaskingFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetCompatibleFormatsForSensitiveTypeFormatsForSensitiveTypeMaskingFormat build() {
            return new GetCompatibleFormatsForSensitiveTypeFormatsForSensitiveTypeMaskingFormat(description, id, name);
        }
    }
}
