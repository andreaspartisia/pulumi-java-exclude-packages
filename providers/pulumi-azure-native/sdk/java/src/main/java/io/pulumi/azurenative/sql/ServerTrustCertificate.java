// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ServerTrustCertificateArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:sql:ServerTrustCertificate")
public class ServerTrustCertificate extends io.pulumi.resources.CustomResource {
    @OutputExport(name="certificateName", type=String.class, parameters={})
    private Output<String> certificateName;

    public Output<String> getCertificateName() {
        return this.certificateName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="publicBlob", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicBlob;

    public Output</* @Nullable */ String> getPublicBlob() {
        return this.publicBlob;
    }
    @OutputExport(name="thumbprint", type=String.class, parameters={})
    private Output<String> thumbprint;

    public Output<String> getThumbprint() {
        return this.thumbprint;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ServerTrustCertificate(String name, ServerTrustCertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerTrustCertificate", name, args == null ? ServerTrustCertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ServerTrustCertificate(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ServerTrustCertificate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:ServerTrustCertificate").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:ServerTrustCertificate").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static ServerTrustCertificate get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerTrustCertificate(name, id, options);
    }
}