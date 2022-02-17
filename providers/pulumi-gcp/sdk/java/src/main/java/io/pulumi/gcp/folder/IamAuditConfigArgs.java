// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.folder.inputs.IamAuditConfigAuditLogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class IamAuditConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IamAuditConfigArgs Empty = new IamAuditConfigArgs();

    /**
     * The configuration for logging of each type of permission. This can be specified multiple times.
     * 
     */
    @InputImport(name="auditLogConfigs", required=true)
    private final Input<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs;

    public Input<List<IamAuditConfigAuditLogConfigArgs>> getAuditLogConfigs() {
        return this.auditLogConfigs;
    }

    @InputImport(name="folder", required=true)
    private final Input<String> folder;

    public Input<String> getFolder() {
        return this.folder;
    }

    /**
     * Service which will be enabled for audit logging. The special value allServices covers all services.
     * 
     */
    @InputImport(name="service", required=true)
    private final Input<String> service;

    public Input<String> getService() {
        return this.service;
    }

    public IamAuditConfigArgs(
        Input<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs,
        Input<String> folder,
        Input<String> service) {
        this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs, "expected parameter 'auditLogConfigs' to be non-null");
        this.folder = Objects.requireNonNull(folder, "expected parameter 'folder' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private IamAuditConfigArgs() {
        this.auditLogConfigs = Input.empty();
        this.folder = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamAuditConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs;
        private Input<String> folder;
        private Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(IamAuditConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.folder = defaults.folder;
    	      this.service = defaults.service;
        }

        public Builder setAuditLogConfigs(Input<List<IamAuditConfigAuditLogConfigArgs>> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }

        public Builder setAuditLogConfigs(List<IamAuditConfigAuditLogConfigArgs> auditLogConfigs) {
            this.auditLogConfigs = Input.of(Objects.requireNonNull(auditLogConfigs));
            return this;
        }

        public Builder setFolder(Input<String> folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }

        public Builder setFolder(String folder) {
            this.folder = Input.of(Objects.requireNonNull(folder));
            return this;
        }

        public Builder setService(Input<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setService(String service) {
            this.service = Input.of(Objects.requireNonNull(service));
            return this;
        }

        public IamAuditConfigArgs build() {
            return new IamAuditConfigArgs(auditLogConfigs, folder, service);
        }
    }
}