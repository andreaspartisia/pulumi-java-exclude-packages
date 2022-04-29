// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataFlow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInvokeRunParameter {
    /**
     * @return The name of the parameter.  It must be a string of one or more word characters (a-z, A-Z, 0-9, _). Examples: &#34;iterations&#34;, &#34;input_file&#34;
     * 
     */
    private final String name;
    /**
     * @return The value of the parameter. It must be a string of 0 or more characters of any kind. Examples: &#34;&#34; (empty string), &#34;10&#34;, &#34;mydata.xml&#34;, &#34;${x}&#34;
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetInvokeRunParameter(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return The name of the parameter.  It must be a string of one or more word characters (a-z, A-Z, 0-9, _). Examples: &#34;iterations&#34;, &#34;input_file&#34;
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the parameter. It must be a string of 0 or more characters of any kind. Examples: &#34;&#34; (empty string), &#34;10&#34;, &#34;mydata.xml&#34;, &#34;${x}&#34;
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInvokeRunParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInvokeRunParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetInvokeRunParameter build() {
            return new GetInvokeRunParameter(name, value);
        }
    }
}
