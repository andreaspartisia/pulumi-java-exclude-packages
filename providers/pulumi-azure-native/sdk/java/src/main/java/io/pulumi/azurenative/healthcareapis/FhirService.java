// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.healthcareapis.FhirServiceArgs;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceAccessPolicyEntryResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceAcrConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceAuthenticationConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceCorsConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.FhirServiceExportConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.ServiceManagedIdentityResponseIdentity;
import io.pulumi.azurenative.healthcareapis.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:healthcareapis:FhirService")
public class FhirService extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessPolicies", type=List.class, parameters={FhirServiceAccessPolicyEntryResponse.class})
    private Output</* @Nullable */ List<FhirServiceAccessPolicyEntryResponse>> accessPolicies;

    public Output</* @Nullable */ List<FhirServiceAccessPolicyEntryResponse>> getAccessPolicies() {
        return this.accessPolicies;
    }
    @OutputExport(name="acrConfiguration", type=FhirServiceAcrConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ FhirServiceAcrConfigurationResponse> acrConfiguration;

    public Output</* @Nullable */ FhirServiceAcrConfigurationResponse> getAcrConfiguration() {
        return this.acrConfiguration;
    }
    @OutputExport(name="authenticationConfiguration", type=FhirServiceAuthenticationConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ FhirServiceAuthenticationConfigurationResponse> authenticationConfiguration;

    public Output</* @Nullable */ FhirServiceAuthenticationConfigurationResponse> getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }
    @OutputExport(name="corsConfiguration", type=FhirServiceCorsConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ FhirServiceCorsConfigurationResponse> corsConfiguration;

    public Output</* @Nullable */ FhirServiceCorsConfigurationResponse> getCorsConfiguration() {
        return this.corsConfiguration;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="exportConfiguration", type=FhirServiceExportConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ FhirServiceExportConfigurationResponse> exportConfiguration;

    public Output</* @Nullable */ FhirServiceExportConfigurationResponse> getExportConfiguration() {
        return this.exportConfiguration;
    }
    @OutputExport(name="identity", type=ServiceManagedIdentityResponseIdentity.class, parameters={})
    private Output</* @Nullable */ ServiceManagedIdentityResponseIdentity> identity;

    public Output</* @Nullable */ ServiceManagedIdentityResponseIdentity> getIdentity() {
        return this.identity;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public FhirService(String name, FhirServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:FhirService", name, args == null ? FhirServiceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FhirService(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:FhirService", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:healthcareapis/v20210601preview:FhirService").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static FhirService get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FhirService(name, id, options);
    }
}