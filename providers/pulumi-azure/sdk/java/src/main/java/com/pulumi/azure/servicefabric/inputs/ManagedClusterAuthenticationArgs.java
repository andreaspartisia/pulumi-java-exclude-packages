// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.inputs;

import com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationActiveDirectoryArgs;
import com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationCertificateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedClusterAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedClusterAuthenticationArgs Empty = new ManagedClusterAuthenticationArgs();

    /**
     * A `active_directory` block as defined above.
     * 
     */
    @Import(name="activeDirectory")
    private @Nullable Output<ManagedClusterAuthenticationActiveDirectoryArgs> activeDirectory;

    /**
     * @return A `active_directory` block as defined above.
     * 
     */
    public Optional<Output<ManagedClusterAuthenticationActiveDirectoryArgs>> activeDirectory() {
        return Optional.ofNullable(this.activeDirectory);
    }

    /**
     * One or more `certificate` blocks as defined below.
     * 
     */
    @Import(name="certificates")
    private @Nullable Output<List<ManagedClusterAuthenticationCertificateArgs>> certificates;

    /**
     * @return One or more `certificate` blocks as defined below.
     * 
     */
    public Optional<Output<List<ManagedClusterAuthenticationCertificateArgs>>> certificates() {
        return Optional.ofNullable(this.certificates);
    }

    private ManagedClusterAuthenticationArgs() {}

    private ManagedClusterAuthenticationArgs(ManagedClusterAuthenticationArgs $) {
        this.activeDirectory = $.activeDirectory;
        this.certificates = $.certificates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterAuthenticationArgs $;

        public Builder() {
            $ = new ManagedClusterAuthenticationArgs();
        }

        public Builder(ManagedClusterAuthenticationArgs defaults) {
            $ = new ManagedClusterAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeDirectory A `active_directory` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectory(@Nullable Output<ManagedClusterAuthenticationActiveDirectoryArgs> activeDirectory) {
            $.activeDirectory = activeDirectory;
            return this;
        }

        /**
         * @param activeDirectory A `active_directory` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder activeDirectory(ManagedClusterAuthenticationActiveDirectoryArgs activeDirectory) {
            return activeDirectory(Output.of(activeDirectory));
        }

        /**
         * @param certificates One or more `certificate` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificates(@Nullable Output<List<ManagedClusterAuthenticationCertificateArgs>> certificates) {
            $.certificates = certificates;
            return this;
        }

        /**
         * @param certificates One or more `certificate` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificates(List<ManagedClusterAuthenticationCertificateArgs> certificates) {
            return certificates(Output.of(certificates));
        }

        /**
         * @param certificates One or more `certificate` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder certificates(ManagedClusterAuthenticationCertificateArgs... certificates) {
            return certificates(List.of(certificates));
        }

        public ManagedClusterAuthenticationArgs build() {
            return $;
        }
    }

}
