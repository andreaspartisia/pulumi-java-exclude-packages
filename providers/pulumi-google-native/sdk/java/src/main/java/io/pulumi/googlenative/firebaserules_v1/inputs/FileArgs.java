// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaserules_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * `File` containing source content.
 * 
 */
public final class FileArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileArgs Empty = new FileArgs();

    /**
     * Textual Content.
     * 
     */
    @Import(name="content", required=true)
      private final Output<String> content;

    public Output<String> content() {
        return this.content;
    }

    /**
     * Fingerprint (e.g. github sha) associated with the `File`.
     * 
     */
    @Import(name="fingerprint")
      private final @Nullable Output<String> fingerprint;

    public Output<String> fingerprint() {
        return this.fingerprint == null ? Codegen.empty() : this.fingerprint;
    }

    /**
     * File name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public FileArgs(
        Output<String> content,
        @Nullable Output<String> fingerprint,
        Output<String> name) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.fingerprint = fingerprint;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private FileArgs() {
        this.content = Codegen.empty();
        this.fingerprint = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> content;
        private @Nullable Output<String> fingerprint;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.fingerprint = defaults.fingerprint;
    	      this.name = defaults.name;
        }

        public Builder content(Output<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder content(String content) {
            this.content = Output.of(Objects.requireNonNull(content));
            return this;
        }
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public Builder fingerprint(@Nullable String fingerprint) {
            this.fingerprint = Codegen.ofNullable(fingerprint);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public FileArgs build() {
            return new FileArgs(content, fingerprint, name);
        }
    }
}
