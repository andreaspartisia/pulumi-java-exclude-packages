// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The ZipDeflate compression read settings.
 * 
 */
public final class ZipDeflateReadSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZipDeflateReadSettingsArgs Empty = new ZipDeflateReadSettingsArgs();

    /**
     * Preserve the zip file name as folder path. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="preserveZipFileNameAsFolder")
      private final @Nullable Output<Object> preserveZipFileNameAsFolder;

    public Output<Object> preserveZipFileNameAsFolder() {
        return this.preserveZipFileNameAsFolder == null ? Codegen.empty() : this.preserveZipFileNameAsFolder;
    }

    /**
     * The Compression setting type.
     * Expected value is 'ZipDeflateReadSettings'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public ZipDeflateReadSettingsArgs(
        @Nullable Output<Object> preserveZipFileNameAsFolder,
        Output<String> type) {
        this.preserveZipFileNameAsFolder = preserveZipFileNameAsFolder;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private ZipDeflateReadSettingsArgs() {
        this.preserveZipFileNameAsFolder = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZipDeflateReadSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> preserveZipFileNameAsFolder;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ZipDeflateReadSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preserveZipFileNameAsFolder = defaults.preserveZipFileNameAsFolder;
    	      this.type = defaults.type;
        }

        public Builder preserveZipFileNameAsFolder(@Nullable Output<Object> preserveZipFileNameAsFolder) {
            this.preserveZipFileNameAsFolder = preserveZipFileNameAsFolder;
            return this;
        }
        public Builder preserveZipFileNameAsFolder(@Nullable Object preserveZipFileNameAsFolder) {
            this.preserveZipFileNameAsFolder = Codegen.ofNullable(preserveZipFileNameAsFolder);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ZipDeflateReadSettingsArgs build() {
            return new ZipDeflateReadSettingsArgs(preserveZipFileNameAsFolder, type);
        }
    }
}
