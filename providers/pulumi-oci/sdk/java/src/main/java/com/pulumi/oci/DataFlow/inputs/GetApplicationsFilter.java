// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataFlow.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationsFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationsFilter Empty = new GetApplicationsFilter();

    /**
     * The name of the parameter.  It must be a string of one or more word characters (a-z, A-Z, 0-9, _). Examples: &#34;iterations&#34;, &#34;input_file&#34;
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the parameter.  It must be a string of one or more word characters (a-z, A-Z, 0-9, _). Examples: &#34;iterations&#34;, &#34;input_file&#34;
     * 
     */
    public String name() {
        return this.name;
    }

    @Import(name="regex")
    private @Nullable Boolean regex;

    public Optional<Boolean> regex() {
        return Optional.ofNullable(this.regex);
    }

    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetApplicationsFilter() {}

    private GetApplicationsFilter(GetApplicationsFilter $) {
        this.name = $.name;
        this.regex = $.regex;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationsFilter $;

        public Builder() {
            $ = new GetApplicationsFilter();
        }

        public Builder(GetApplicationsFilter defaults) {
            $ = new GetApplicationsFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the parameter.  It must be a string of one or more word characters (a-z, A-Z, 0-9, _). Examples: &#34;iterations&#34;, &#34;input_file&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder regex(@Nullable Boolean regex) {
            $.regex = regex;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetApplicationsFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
