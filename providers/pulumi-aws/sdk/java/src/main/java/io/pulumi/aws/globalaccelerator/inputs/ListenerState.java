// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.inputs;

import io.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerState extends io.pulumi.resources.ResourceArgs {

    public static final ListenerState Empty = new ListenerState();

    /**
     * The Amazon Resource Name (ARN) of your accelerator.
     * 
     */
    @InputImport(name="acceleratorArn")
      private final @Nullable Input<String> acceleratorArn;

    public Input<String> getAcceleratorArn() {
        return this.acceleratorArn == null ? Input.empty() : this.acceleratorArn;
    }

    /**
     * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the "five-tuple" properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the "two-tuple" properties of source (client) IP address and destination IP address to select the hash value.
     * 
     */
    @InputImport(name="clientAffinity")
      private final @Nullable Input<String> clientAffinity;

    public Input<String> getClientAffinity() {
        return this.clientAffinity == null ? Input.empty() : this.clientAffinity;
    }

    /**
     * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     * 
     */
    @InputImport(name="portRanges")
      private final @Nullable Input<List<ListenerPortRangeGetArgs>> portRanges;

    public Input<List<ListenerPortRangeGetArgs>> getPortRanges() {
        return this.portRanges == null ? Input.empty() : this.portRanges;
    }

    /**
     * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
     * 
     */
    @InputImport(name="protocol")
      private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public ListenerState(
        @Nullable Input<String> acceleratorArn,
        @Nullable Input<String> clientAffinity,
        @Nullable Input<List<ListenerPortRangeGetArgs>> portRanges,
        @Nullable Input<String> protocol) {
        this.acceleratorArn = acceleratorArn;
        this.clientAffinity = clientAffinity;
        this.portRanges = portRanges;
        this.protocol = protocol;
    }

    private ListenerState() {
        this.acceleratorArn = Input.empty();
        this.clientAffinity = Input.empty();
        this.portRanges = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> acceleratorArn;
        private @Nullable Input<String> clientAffinity;
        private @Nullable Input<List<ListenerPortRangeGetArgs>> portRanges;
        private @Nullable Input<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorArn = defaults.acceleratorArn;
    	      this.clientAffinity = defaults.clientAffinity;
    	      this.portRanges = defaults.portRanges;
    	      this.protocol = defaults.protocol;
        }

        public Builder setAcceleratorArn(@Nullable Input<String> acceleratorArn) {
            this.acceleratorArn = acceleratorArn;
            return this;
        }

        public Builder setAcceleratorArn(@Nullable String acceleratorArn) {
            this.acceleratorArn = Input.ofNullable(acceleratorArn);
            return this;
        }

        public Builder setClientAffinity(@Nullable Input<String> clientAffinity) {
            this.clientAffinity = clientAffinity;
            return this;
        }

        public Builder setClientAffinity(@Nullable String clientAffinity) {
            this.clientAffinity = Input.ofNullable(clientAffinity);
            return this;
        }

        public Builder setPortRanges(@Nullable Input<List<ListenerPortRangeGetArgs>> portRanges) {
            this.portRanges = portRanges;
            return this;
        }

        public Builder setPortRanges(@Nullable List<ListenerPortRangeGetArgs> portRanges) {
            this.portRanges = Input.ofNullable(portRanges);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }
        public ListenerState build() {
            return new ListenerState(acceleratorArn, clientAffinity, portRanges, protocol);
        }
    }
}