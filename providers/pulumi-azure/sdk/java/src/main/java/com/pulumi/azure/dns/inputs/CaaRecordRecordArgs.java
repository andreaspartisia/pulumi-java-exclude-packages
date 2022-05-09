// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class CaaRecordRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final CaaRecordRecordArgs Empty = new CaaRecordRecordArgs();

    /**
     * Extensible CAA flags, currently only 1 is implemented to set the issuer critical flag.
     * 
     */
    @Import(name="flags", required=true)
    private Output<Integer> flags;

    /**
     * @return Extensible CAA flags, currently only 1 is implemented to set the issuer critical flag.
     * 
     */
    public Output<Integer> flags() {
        return this.flags;
    }

    /**
     * A property tag, options are issue, issuewild and iodef.
     * 
     */
    @Import(name="tag", required=true)
    private Output<String> tag;

    /**
     * @return A property tag, options are issue, issuewild and iodef.
     * 
     */
    public Output<String> tag() {
        return this.tag;
    }

    /**
     * A property value such as a registrar domain.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return A property value such as a registrar domain.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private CaaRecordRecordArgs() {}

    private CaaRecordRecordArgs(CaaRecordRecordArgs $) {
        this.flags = $.flags;
        this.tag = $.tag;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CaaRecordRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CaaRecordRecordArgs $;

        public Builder() {
            $ = new CaaRecordRecordArgs();
        }

        public Builder(CaaRecordRecordArgs defaults) {
            $ = new CaaRecordRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param flags Extensible CAA flags, currently only 1 is implemented to set the issuer critical flag.
         * 
         * @return builder
         * 
         */
        public Builder flags(Output<Integer> flags) {
            $.flags = flags;
            return this;
        }

        /**
         * @param flags Extensible CAA flags, currently only 1 is implemented to set the issuer critical flag.
         * 
         * @return builder
         * 
         */
        public Builder flags(Integer flags) {
            return flags(Output.of(flags));
        }

        /**
         * @param tag A property tag, options are issue, issuewild and iodef.
         * 
         * @return builder
         * 
         */
        public Builder tag(Output<String> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag A property tag, options are issue, issuewild and iodef.
         * 
         * @return builder
         * 
         */
        public Builder tag(String tag) {
            return tag(Output.of(tag));
        }

        /**
         * @param value A property value such as a registrar domain.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value A property value such as a registrar domain.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CaaRecordRecordArgs build() {
            $.flags = Objects.requireNonNull($.flags, "expected parameter 'flags' to be non-null");
            $.tag = Objects.requireNonNull($.tag, "expected parameter 'tag' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
