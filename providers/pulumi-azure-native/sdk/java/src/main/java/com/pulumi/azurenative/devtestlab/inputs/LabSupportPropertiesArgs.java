// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.enums.EnableStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a lab&#39;s support banner
 * 
 */
public final class LabSupportPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final LabSupportPropertiesArgs Empty = new LabSupportPropertiesArgs();

    /**
     * Is the lab support banner active/enabled at this time?
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Either<String,EnableStatus>> enabled;

    public Optional<Output<Either<String,EnableStatus>>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     * 
     */
    @Import(name="markdown")
    private @Nullable Output<String> markdown;

    public Optional<Output<String>> markdown() {
        return Optional.ofNullable(this.markdown);
    }

    private LabSupportPropertiesArgs() {}

    private LabSupportPropertiesArgs(LabSupportPropertiesArgs $) {
        this.enabled = $.enabled;
        this.markdown = $.markdown;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabSupportPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabSupportPropertiesArgs $;

        public Builder() {
            $ = new LabSupportPropertiesArgs();
        }

        public Builder(LabSupportPropertiesArgs defaults) {
            $ = new LabSupportPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Either<String,EnableStatus>> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Either<String,EnableStatus> enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder enabled(String enabled) {
            return enabled(Either.ofLeft(enabled));
        }

        public Builder enabled(EnableStatus enabled) {
            return enabled(Either.ofRight(enabled));
        }

        public Builder markdown(@Nullable Output<String> markdown) {
            $.markdown = markdown;
            return this;
        }

        public Builder markdown(String markdown) {
            return markdown(Output.of(markdown));
        }

        public LabSupportPropertiesArgs build() {
            return $;
        }
    }

}
