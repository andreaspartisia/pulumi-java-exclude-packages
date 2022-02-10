// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datacatalog;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datacatalog.ADCCatalogArgs;
import io.pulumi.azurenative.datacatalog.outputs.PrincipalsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:datacatalog:ADCCatalog")
public class ADCCatalog extends io.pulumi.resources.CustomResource {
    @OutputExport(name="admins", type=List.class, parameters={PrincipalsResponse.class})
    private Output</* @Nullable */ List<PrincipalsResponse>> admins;

    public Output</* @Nullable */ List<PrincipalsResponse>> getAdmins() {
        return this.admins;
    }
    @OutputExport(name="enableAutomaticUnitAdjustment", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutomaticUnitAdjustment;

    public Output</* @Nullable */ Boolean> getEnableAutomaticUnitAdjustment() {
        return this.enableAutomaticUnitAdjustment;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
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
    @OutputExport(name="sku", type=String.class, parameters={})
    private Output</* @Nullable */ String> sku;

    public Output</* @Nullable */ String> getSku() {
        return this.sku;
    }
    @OutputExport(name="successfullyProvisioned", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> successfullyProvisioned;

    public Output</* @Nullable */ Boolean> getSuccessfullyProvisioned() {
        return this.successfullyProvisioned;
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
    @OutputExport(name="units", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> units;

    public Output</* @Nullable */ Integer> getUnits() {
        return this.units;
    }
    @OutputExport(name="users", type=List.class, parameters={PrincipalsResponse.class})
    private Output</* @Nullable */ List<PrincipalsResponse>> users;

    public Output</* @Nullable */ List<PrincipalsResponse>> getUsers() {
        return this.users;
    }

    public ADCCatalog(String name, ADCCatalogArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datacatalog:ADCCatalog", name, args == null ? ADCCatalogArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ADCCatalog(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datacatalog:ADCCatalog", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datacatalog/v20160330:ADCCatalog").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ADCCatalog get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ADCCatalog(name, id, options);
    }
}