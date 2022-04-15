// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Validation based on regular expressions.
 * 
 */
public final class RegexValidationResponse extends io.pulumi.resources.InvokeArgs {

    public static final RegexValidationResponse Empty = new RegexValidationResponse();

    /**
     * RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient).
     * 
     */
    @Import(name="regexes", required=true)
      private final List<String> regexes;

    public List<String> regexes() {
        return this.regexes;
    }

    public RegexValidationResponse(List<String> regexes) {
        this.regexes = Objects.requireNonNull(regexes, "expected parameter 'regexes' to be non-null");
    }

    private RegexValidationResponse() {
        this.regexes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegexValidationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> regexes;

        public Builder() {
    	      // Empty
        }

        public Builder(RegexValidationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexes = defaults.regexes;
        }

        public Builder regexes(List<String> regexes) {
            this.regexes = Objects.requireNonNull(regexes);
            return this;
        }
        public Builder regexes(String... regexes) {
            return regexes(List.of(regexes));
        }        public RegexValidationResponse build() {
            return new RegexValidationResponse(regexes);
        }
    }
}
