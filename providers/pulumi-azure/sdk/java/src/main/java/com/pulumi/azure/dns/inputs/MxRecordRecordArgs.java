// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MxRecordRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final MxRecordRecordArgs Empty = new MxRecordRecordArgs();

    /**
     * The mail server responsible for the domain covered by the MX record.
     * 
     */
    @Import(name="exchange", required=true)
    private Output<String> exchange;

    /**
     * @return The mail server responsible for the domain covered by the MX record.
     * 
     */
    public Output<String> exchange() {
        return this.exchange;
    }

    /**
     * String representing the &#34;preference” value of the MX records. Records with lower preference value take priority.
     * 
     */
    @Import(name="preference", required=true)
    private Output<String> preference;

    /**
     * @return String representing the &#34;preference” value of the MX records. Records with lower preference value take priority.
     * 
     */
    public Output<String> preference() {
        return this.preference;
    }

    private MxRecordRecordArgs() {}

    private MxRecordRecordArgs(MxRecordRecordArgs $) {
        this.exchange = $.exchange;
        this.preference = $.preference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MxRecordRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MxRecordRecordArgs $;

        public Builder() {
            $ = new MxRecordRecordArgs();
        }

        public Builder(MxRecordRecordArgs defaults) {
            $ = new MxRecordRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exchange The mail server responsible for the domain covered by the MX record.
         * 
         * @return builder
         * 
         */
        public Builder exchange(Output<String> exchange) {
            $.exchange = exchange;
            return this;
        }

        /**
         * @param exchange The mail server responsible for the domain covered by the MX record.
         * 
         * @return builder
         * 
         */
        public Builder exchange(String exchange) {
            return exchange(Output.of(exchange));
        }

        /**
         * @param preference String representing the &#34;preference” value of the MX records. Records with lower preference value take priority.
         * 
         * @return builder
         * 
         */
        public Builder preference(Output<String> preference) {
            $.preference = preference;
            return this;
        }

        /**
         * @param preference String representing the &#34;preference” value of the MX records. Records with lower preference value take priority.
         * 
         * @return builder
         * 
         */
        public Builder preference(String preference) {
            return preference(Output.of(preference));
        }

        public MxRecordRecordArgs build() {
            $.exchange = Objects.requireNonNull($.exchange, "expected parameter 'exchange' to be non-null");
            $.preference = Objects.requireNonNull($.preference, "expected parameter 'preference' to be non-null");
            return $;
        }
    }

}
