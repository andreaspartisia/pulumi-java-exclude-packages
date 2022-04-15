// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The details needed to configure a reverse SSH tunnel between the source and destination databases. These details will be used when calling the generateSshScript method (see https://cloud.google.com/database-migration/docs/reference/rest/v1beta1/projects.locations.migrationJobs/generateSshScript) to produce the script that will help set up the reverse SSH tunnel, and to set up the VPC peering between the Cloud SQL private network and the VPC.
 * 
 */
public final class ReverseSshConnectivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReverseSshConnectivityArgs Empty = new ReverseSshConnectivityArgs();

    /**
     * The name of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    @Import(name="vm")
      private final @Nullable Output<String> vm;

    public Output<String> vm() {
        return this.vm == null ? Codegen.empty() : this.vm;
    }

    /**
     * The IP of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    @Import(name="vmIp", required=true)
      private final Output<String> vmIp;

    public Output<String> vmIp() {
        return this.vmIp;
    }

    /**
     * The forwarding port of the virtual machine (Compute Engine) used as the bastion server for the SSH tunnel.
     * 
     */
    @Import(name="vmPort", required=true)
      private final Output<Integer> vmPort;

    public Output<Integer> vmPort() {
        return this.vmPort;
    }

    /**
     * The name of the VPC to peer with the Cloud SQL private network.
     * 
     */
    @Import(name="vpc")
      private final @Nullable Output<String> vpc;

    public Output<String> vpc() {
        return this.vpc == null ? Codegen.empty() : this.vpc;
    }

    public ReverseSshConnectivityArgs(
        @Nullable Output<String> vm,
        Output<String> vmIp,
        Output<Integer> vmPort,
        @Nullable Output<String> vpc) {
        this.vm = vm;
        this.vmIp = Objects.requireNonNull(vmIp, "expected parameter 'vmIp' to be non-null");
        this.vmPort = Objects.requireNonNull(vmPort, "expected parameter 'vmPort' to be non-null");
        this.vpc = vpc;
    }

    private ReverseSshConnectivityArgs() {
        this.vm = Codegen.empty();
        this.vmIp = Codegen.empty();
        this.vmPort = Codegen.empty();
        this.vpc = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReverseSshConnectivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> vm;
        private Output<String> vmIp;
        private Output<Integer> vmPort;
        private @Nullable Output<String> vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(ReverseSshConnectivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vm = defaults.vm;
    	      this.vmIp = defaults.vmIp;
    	      this.vmPort = defaults.vmPort;
    	      this.vpc = defaults.vpc;
        }

        public Builder vm(@Nullable Output<String> vm) {
            this.vm = vm;
            return this;
        }
        public Builder vm(@Nullable String vm) {
            this.vm = Codegen.ofNullable(vm);
            return this;
        }
        public Builder vmIp(Output<String> vmIp) {
            this.vmIp = Objects.requireNonNull(vmIp);
            return this;
        }
        public Builder vmIp(String vmIp) {
            this.vmIp = Output.of(Objects.requireNonNull(vmIp));
            return this;
        }
        public Builder vmPort(Output<Integer> vmPort) {
            this.vmPort = Objects.requireNonNull(vmPort);
            return this;
        }
        public Builder vmPort(Integer vmPort) {
            this.vmPort = Output.of(Objects.requireNonNull(vmPort));
            return this;
        }
        public Builder vpc(@Nullable Output<String> vpc) {
            this.vpc = vpc;
            return this;
        }
        public Builder vpc(@Nullable String vpc) {
            this.vpc = Codegen.ofNullable(vpc);
            return this;
        }        public ReverseSshConnectivityArgs build() {
            return new ReverseSshConnectivityArgs(vm, vmIp, vmPort, vpc);
        }
    }
}
