// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.domains_v1.inputs.DsRecordArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for an arbitrary DNS provider.
 * 
 */
public final class CustomDnsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomDnsArgs Empty = new CustomDnsArgs();

    /**
     * The list of DS records for this domain, which are used to enable DNSSEC. The domain's DNS provider can provide the values to set here. If this field is empty, DNSSEC is disabled.
     * 
     */
    @Import(name="dsRecords")
      private final @Nullable Output<List<DsRecordArgs>> dsRecords;

    public Output<List<DsRecordArgs>> dsRecords() {
        return this.dsRecords == null ? Codegen.empty() : this.dsRecords;
    }

    /**
     * A list of name servers that store the DNS zone for this domain. Each name server is a domain name, with Unicode domain names expressed in Punycode format.
     * 
     */
    @Import(name="nameServers", required=true)
      private final Output<List<String>> nameServers;

    public Output<List<String>> nameServers() {
        return this.nameServers;
    }

    public CustomDnsArgs(
        @Nullable Output<List<DsRecordArgs>> dsRecords,
        Output<List<String>> nameServers) {
        this.dsRecords = dsRecords;
        this.nameServers = Objects.requireNonNull(nameServers, "expected parameter 'nameServers' to be non-null");
    }

    private CustomDnsArgs() {
        this.dsRecords = Codegen.empty();
        this.nameServers = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DsRecordArgs>> dsRecords;
        private Output<List<String>> nameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDnsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dsRecords = defaults.dsRecords;
    	      this.nameServers = defaults.nameServers;
        }

        public Builder dsRecords(@Nullable Output<List<DsRecordArgs>> dsRecords) {
            this.dsRecords = dsRecords;
            return this;
        }
        public Builder dsRecords(@Nullable List<DsRecordArgs> dsRecords) {
            this.dsRecords = Codegen.ofNullable(dsRecords);
            return this;
        }
        public Builder dsRecords(DsRecordArgs... dsRecords) {
            return dsRecords(List.of(dsRecords));
        }
        public Builder nameServers(Output<List<String>> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }
        public Builder nameServers(List<String> nameServers) {
            this.nameServers = Output.of(Objects.requireNonNull(nameServers));
            return this;
        }
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }        public CustomDnsArgs build() {
            return new CustomDnsArgs(dsRecords, nameServers);
        }
    }
}
