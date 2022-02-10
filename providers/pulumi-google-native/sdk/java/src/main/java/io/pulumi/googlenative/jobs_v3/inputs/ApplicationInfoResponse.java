// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ApplicationInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationInfoResponse Empty = new ApplicationInfoResponse();

    @InputImport(name="emails", required=true)
    private final List<String> emails;

    public List<String> getEmails() {
        return this.emails;
    }

    @InputImport(name="instruction", required=true)
    private final String instruction;

    public String getInstruction() {
        return this.instruction;
    }

    @InputImport(name="uris", required=true)
    private final List<String> uris;

    public List<String> getUris() {
        return this.uris;
    }

    public ApplicationInfoResponse(
        List<String> emails,
        String instruction,
        List<String> uris) {
        this.emails = Objects.requireNonNull(emails, "expected parameter 'emails' to be non-null");
        this.instruction = Objects.requireNonNull(instruction, "expected parameter 'instruction' to be non-null");
        this.uris = Objects.requireNonNull(uris, "expected parameter 'uris' to be non-null");
    }

    private ApplicationInfoResponse() {
        this.emails = List.of();
        this.instruction = null;
        this.uris = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> emails;
        private String instruction;
        private List<String> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emails = defaults.emails;
    	      this.instruction = defaults.instruction;
    	      this.uris = defaults.uris;
        }

        public Builder setEmails(List<String> emails) {
            this.emails = Objects.requireNonNull(emails);
            return this;
        }

        public Builder setInstruction(String instruction) {
            this.instruction = Objects.requireNonNull(instruction);
            return this;
        }

        public Builder setUris(List<String> uris) {
            this.uris = Objects.requireNonNull(uris);
            return this;
        }

        public ApplicationInfoResponse build() {
            return new ApplicationInfoResponse(emails, instruction, uris);
        }
    }
}