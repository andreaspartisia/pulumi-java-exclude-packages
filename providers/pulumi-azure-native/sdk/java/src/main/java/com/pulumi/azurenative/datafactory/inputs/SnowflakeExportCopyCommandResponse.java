// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Snowflake export command settings.
 * 
 */
public final class SnowflakeExportCopyCommandResponse extends com.pulumi.resources.InvokeArgs {

    public static final SnowflakeExportCopyCommandResponse Empty = new SnowflakeExportCopyCommandResponse();

    /**
     * Additional copy options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalCopyOptions": { "DATE_FORMAT": "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }
     * 
     */
    @Import(name="additionalCopyOptions")
      private final @Nullable Map<String,Object> additionalCopyOptions;

    public Map<String,Object> additionalCopyOptions() {
        return this.additionalCopyOptions == null ? Map.of() : this.additionalCopyOptions;
    }

    /**
     * Additional format options directly passed to snowflake Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalFormatOptions": { "OVERWRITE": "TRUE", "MAX_FILE_SIZE": "'FALSE'" }
     * 
     */
    @Import(name="additionalFormatOptions")
      private final @Nullable Map<String,Object> additionalFormatOptions;

    public Map<String,Object> additionalFormatOptions() {
        return this.additionalFormatOptions == null ? Map.of() : this.additionalFormatOptions;
    }

    /**
     * The export setting type.
     * Expected value is 'SnowflakeExportCopyCommand'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public SnowflakeExportCopyCommandResponse(
        @Nullable Map<String,Object> additionalCopyOptions,
        @Nullable Map<String,Object> additionalFormatOptions,
        String type) {
        this.additionalCopyOptions = additionalCopyOptions;
        this.additionalFormatOptions = additionalFormatOptions;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private SnowflakeExportCopyCommandResponse() {
        this.additionalCopyOptions = Map.of();
        this.additionalFormatOptions = Map.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnowflakeExportCopyCommandResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Object> additionalCopyOptions;
        private @Nullable Map<String,Object> additionalFormatOptions;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SnowflakeExportCopyCommandResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCopyOptions = defaults.additionalCopyOptions;
    	      this.additionalFormatOptions = defaults.additionalFormatOptions;
    	      this.type = defaults.type;
        }

        public Builder additionalCopyOptions(@Nullable Map<String,Object> additionalCopyOptions) {
            this.additionalCopyOptions = additionalCopyOptions;
            return this;
        }
        public Builder additionalFormatOptions(@Nullable Map<String,Object> additionalFormatOptions) {
            this.additionalFormatOptions = additionalFormatOptions;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SnowflakeExportCopyCommandResponse build() {
            return new SnowflakeExportCopyCommandResponse(additionalCopyOptions, additionalFormatOptions, type);
        }
    }
}
