// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.managedidentities_v1.DomainArgs;
import io.pulumi.googlenative.managedidentities_v1.outputs.TrustResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a Microsoft AD domain.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:managedidentities/v1:Domain")
public class Domain extends io.pulumi.resources.CustomResource {
    /**
     * Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
     * 
     */
    @Export(name="admin", type=String.class, parameters={})
    private Output<String> admin;

    /**
     * @return Optional. The name of delegated administrator account used to perform Active Directory operations. If not specified, `setupadmin` will be used.
     * 
     */
    public Output<String> admin() {
        return this.admin;
    }
    /**
     * Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
     * 
     */
    @Export(name="auditLogsEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> auditLogsEnabled;

    /**
     * @return Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is audit logs disabled.
     * 
     */
    public Output<Boolean> auditLogsEnabled() {
        return this.auditLogsEnabled;
    }
    /**
     * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    @Export(name="authorizedNetworks", type=List.class, parameters={String.class})
    private Output<List<String>> authorizedNetworks;

    /**
     * @return Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) the domain instance is connected to. Networks can be added using UpdateDomain. The domain is only available on networks listed in `authorized_networks`. If CIDR subnets overlap between networks, domain creation will fail.
     * 
     */
    public Output<List<String>> authorizedNetworks() {
        return this.authorizedNetworks;
    }
    /**
     * The time the instance was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the instance was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would be chosen for an Active Directory set up on an internal network.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return The fully-qualified domain name of the exposed domain used by clients to connect to the service. Similar to what would be chosen for an Active Directory set up on an internal network.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * Optional. Resource labels that can contain user-provided metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Resource labels that can contain user-provided metadata.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    @Export(name="locations", type=List.class, parameters={String.class})
    private Output<List<String>> locations;

    /**
     * @return Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4 Service supports up to 4 locations at once. Each location will use a /26 block.
     * 
     */
    public Output<List<String>> locations() {
        return this.locations;
    }
    /**
     * The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique name of the domain using the form: `projects/{project_id}/locations/global/domains/{domain_name}`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
     * 
     */
    @Export(name="reservedIpRange", type=String.class, parameters={})
    private Output<String> reservedIpRange;

    /**
     * @return The CIDR range of internal addresses that are reserved for this domain. Reserved networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets in [Domain].[authorized_networks].
     * 
     */
    public Output<String> reservedIpRange() {
        return this.reservedIpRange;
    }
    /**
     * The current state of this domain.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of this domain.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Additional information about the current status of this domain, if available.
     * 
     */
    @Export(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return Additional information about the current status of this domain, if available.
     * 
     */
    public Output<String> statusMessage() {
        return this.statusMessage;
    }
    /**
     * The current trusts associated with the domain.
     * 
     */
    @Export(name="trusts", type=List.class, parameters={TrustResponse.class})
    private Output<List<TrustResponse>> trusts;

    /**
     * @return The current trusts associated with the domain.
     * 
     */
    public Output<List<TrustResponse>> trusts() {
        return this.trusts;
    }
    /**
     * The last update time.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The last update time.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, DomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:managedidentities/v1:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:managedidentities/v1:Domain", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Domain get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, options);
    }
}
