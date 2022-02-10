// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppHostNameBindingArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:web:WebAppHostNameBinding")
public class WebAppHostNameBinding extends io.pulumi.resources.CustomResource {
    @OutputExport(name="azureResourceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureResourceName;

    public Output</* @Nullable */ String> getAzureResourceName() {
        return this.azureResourceName;
    }
    @OutputExport(name="azureResourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureResourceType;

    public Output</* @Nullable */ String> getAzureResourceType() {
        return this.azureResourceType;
    }
    @OutputExport(name="customHostNameDnsRecordType", type=String.class, parameters={})
    private Output</* @Nullable */ String> customHostNameDnsRecordType;

    public Output</* @Nullable */ String> getCustomHostNameDnsRecordType() {
        return this.customHostNameDnsRecordType;
    }
    @OutputExport(name="domainId", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainId;

    public Output</* @Nullable */ String> getDomainId() {
        return this.domainId;
    }
    @OutputExport(name="hostNameType", type=String.class, parameters={})
    private Output</* @Nullable */ String> hostNameType;

    public Output</* @Nullable */ String> getHostNameType() {
        return this.hostNameType;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="siteName", type=String.class, parameters={})
    private Output</* @Nullable */ String> siteName;

    public Output</* @Nullable */ String> getSiteName() {
        return this.siteName;
    }
    @OutputExport(name="sslState", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslState;

    public Output</* @Nullable */ String> getSslState() {
        return this.sslState;
    }
    @OutputExport(name="thumbprint", type=String.class, parameters={})
    private Output</* @Nullable */ String> thumbprint;

    public Output</* @Nullable */ String> getThumbprint() {
        return this.thumbprint;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="virtualIP", type=String.class, parameters={})
    private Output<String> virtualIP;

    public Output<String> getVirtualIP() {
        return this.virtualIP;
    }

    public WebAppHostNameBinding(String name, WebAppHostNameBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHostNameBinding", name, args == null ? WebAppHostNameBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppHostNameBinding(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppHostNameBinding", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppHostNameBinding").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppHostNameBinding").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WebAppHostNameBinding get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppHostNameBinding(name, id, options);
    }
}