// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative;

import com.pulumi.core.TypeShape;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("azure-native");
    public Optional<List<String>> auxiliaryTenantIds() {
        return Codegen.objectProp("auxiliaryTenantIds", TypeShape.<List<String>>builder(List.class).addParameter(String.class).build()).config(config).get();
    }
/**
 * The password associated with the Client Certificate. For use when authenticating as a Service Principal using a Client Certificate
 * 
 */
    public Optional<String> clientCertificatePassword() {
        return Codegen.stringProp("clientCertificatePassword").config(config).get();
    }
/**
 * The path to the Client Certificate associated with the Service Principal for use when authenticating as a Service Principal using a Client Certificate.
 * 
 */
    public Optional<String> clientCertificatePath() {
        return Codegen.stringProp("clientCertificatePath").config(config).get();
    }
/**
 * The Client ID which should be used.
 * 
 */
    public Optional<String> clientId() {
        return Codegen.stringProp("clientId").config(config).get();
    }
/**
 * The Client Secret which should be used. For use When authenticating as a Service Principal using a Client Secret.
 * 
 */
    public Optional<String> clientSecret() {
        return Codegen.stringProp("clientSecret").config(config).get();
    }
/**
 * This will disable the Pulumi Partner ID which is used if a custom `partnerId` isn't specified.
 * 
 */
    public Optional<Boolean> disablePulumiPartnerId() {
        return Codegen.booleanProp("disablePulumiPartnerId").config(config).get();
    }
/**
 * The Cloud Environment which should be used. Possible values are public, usgovernment, german, and china. Defaults to public.
 * 
 */
    public Optional<String> environment() {
        return Codegen.stringProp("environment").config(config).get();
    }
/**
 * The path to a custom endpoint for Managed Service Identity - in most circumstances this should be detected automatically.
 * 
 */
    public Optional<String> msiEndpoint() {
        return Codegen.stringProp("msiEndpoint").config(config).get();
    }
/**
 * A GUID/UUID that is registered with Microsoft to facilitate partner resource usage attribution.
 * 
 */
    public Optional<String> partnerId() {
        return Codegen.stringProp("partnerId").config(config).get();
    }
/**
 * The Subscription ID which should be used.
 * 
 */
    public Optional<String> subscriptionId() {
        return Codegen.stringProp("subscriptionId").config(config).get();
    }
/**
 * The Tenant ID which should be used.
 * 
 */
    public Optional<String> tenantId() {
        return Codegen.stringProp("tenantId").config(config).get();
    }
/**
 * Allowed Managed Service Identity be used for Authentication.
 * 
 */
    public Optional<Boolean> useMsi() {
        return Codegen.booleanProp("useMsi").config(config).def(false).get();
    }
}
