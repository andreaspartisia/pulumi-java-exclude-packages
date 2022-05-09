// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.LinkedServiceAzureSqlDatabaseArgs;
import com.pulumi.azure.datafactory.inputs.LinkedServiceAzureSqlDatabaseState;
import com.pulumi.azure.datafactory.outputs.LinkedServiceAzureSqlDatabaseKeyVaultConnectionString;
import com.pulumi.azure.datafactory.outputs.LinkedServiceAzureSqlDatabaseKeyVaultPassword;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Linked Service (connection) between Azure SQL Database and Azure Data Factory.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleFactory = new Factory(&#34;exampleFactory&#34;, FactoryArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleLinkedServiceAzureSqlDatabase = new LinkedServiceAzureSqlDatabase(&#34;exampleLinkedServiceAzureSqlDatabase&#34;, LinkedServiceAzureSqlDatabaseArgs.builder()        
 *             .dataFactoryId(exampleFactory.getId())
 *             .connectionString(&#34;data source=serverhostname;initial catalog=master;user id=testUser;Password=test;integrated security=False;encrypt=True;connection timeout=30&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Factory Azure SQL Database Linked Service&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datafactory/linkedServiceAzureSqlDatabase:LinkedServiceAzureSqlDatabase example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/linkedServiceAzureSqlDatabase:LinkedServiceAzureSqlDatabase")
public class LinkedServiceAzureSqlDatabase extends com.pulumi.resources.CustomResource {
    /**
     * A map of additional properties to associate with the Data Factory Linked Service Azure SQL Database.
     * 
     */
    @Export(name="additionalProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service Azure SQL Database.
     * 
     */
    public Output<Optional<Map<String,String>>> additionalProperties() {
        return Codegen.optional(this.additionalProperties);
    }
    /**
     * List of tags that can be used for describing the Data Factory Linked Service Azure SQL Database.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service Azure SQL Database.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The connection string in which to authenticate with Azure SQL Database. Exactly one of either `connection_string` or `key_vault_connection_string` is required.
     * 
     */
    @Export(name="connectionString", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionString;

    /**
     * @return The connection string in which to authenticate with Azure SQL Database. Exactly one of either `connection_string` or `key_vault_connection_string` is required.
     * 
     */
    public Output<Optional<String>> connectionString() {
        return Codegen.optional(this.connectionString);
    }
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", type=String.class, parameters={})
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The description for the Data Factory Linked Service Azure SQL Database.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Linked Service Azure SQL Database.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service Azure SQL Database.
     * 
     */
    @Export(name="integrationRuntimeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service Azure SQL Database.
     * 
     */
    public Output<Optional<String>> integrationRuntimeName() {
        return Codegen.optional(this.integrationRuntimeName);
    }
    /**
     * A `key_vault_connection_string` block as defined below. Use this argument to store Azure SQL Database connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connection_string` or `key_vault_connection_string` is required.
     * 
     */
    @Export(name="keyVaultConnectionString", type=LinkedServiceAzureSqlDatabaseKeyVaultConnectionString.class, parameters={})
    private Output</* @Nullable */ LinkedServiceAzureSqlDatabaseKeyVaultConnectionString> keyVaultConnectionString;

    /**
     * @return A `key_vault_connection_string` block as defined below. Use this argument to store Azure SQL Database connection string in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service. Exactly one of either `connection_string` or `key_vault_connection_string` is required.
     * 
     */
    public Output<Optional<LinkedServiceAzureSqlDatabaseKeyVaultConnectionString>> keyVaultConnectionString() {
        return Codegen.optional(this.keyVaultConnectionString);
    }
    /**
     * A `key_vault_password` block as defined below. Use this argument to store SQL Server password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * 
     */
    @Export(name="keyVaultPassword", type=LinkedServiceAzureSqlDatabaseKeyVaultPassword.class, parameters={})
    private Output</* @Nullable */ LinkedServiceAzureSqlDatabaseKeyVaultPassword> keyVaultPassword;

    /**
     * @return A `key_vault_password` block as defined below. Use this argument to store SQL Server password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * 
     */
    public Output<Optional<LinkedServiceAzureSqlDatabaseKeyVaultPassword>> keyVaultPassword() {
        return Codegen.optional(this.keyVaultPassword);
    }
    /**
     * Specifies the name of the Data Factory Linked Service Azure SQL Database. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service Azure SQL Database. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of parameters to associate with the Data Factory Linked Service Azure SQL Database.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service Azure SQL Database.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The service principal id in which to authenticate against the Azure SQL Database. Required if `service_principal_key` is set.
     * 
     */
    @Export(name="servicePrincipalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> servicePrincipalId;

    /**
     * @return The service principal id in which to authenticate against the Azure SQL Database. Required if `service_principal_key` is set.
     * 
     */
    public Output<Optional<String>> servicePrincipalId() {
        return Codegen.optional(this.servicePrincipalId);
    }
    /**
     * The service principal key in which to authenticate against the Azure SQL Database. Required if `service_principal_id` is set.
     * 
     */
    @Export(name="servicePrincipalKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> servicePrincipalKey;

    /**
     * @return The service principal key in which to authenticate against the Azure SQL Database. Required if `service_principal_id` is set.
     * 
     */
    public Output<Optional<String>> servicePrincipalKey() {
        return Codegen.optional(this.servicePrincipalKey);
    }
    /**
     * The tenant id or name in which to authenticate against the Azure SQL Database.
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return The tenant id or name in which to authenticate against the Azure SQL Database.
     * 
     */
    public Output<Optional<String>> tenantId() {
        return Codegen.optional(this.tenantId);
    }
    /**
     * Whether to use the Data Factory&#39;s managed identity to authenticate against the Azure SQL Database. Incompatible with `service_principal_id` and `service_principal_key`
     * 
     */
    @Export(name="useManagedIdentity", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useManagedIdentity;

    /**
     * @return Whether to use the Data Factory&#39;s managed identity to authenticate against the Azure SQL Database. Incompatible with `service_principal_id` and `service_principal_key`
     * 
     */
    public Output<Optional<Boolean>> useManagedIdentity() {
        return Codegen.optional(this.useManagedIdentity);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedServiceAzureSqlDatabase(String name) {
        this(name, LinkedServiceAzureSqlDatabaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedServiceAzureSqlDatabase(String name, LinkedServiceAzureSqlDatabaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedServiceAzureSqlDatabase(String name, LinkedServiceAzureSqlDatabaseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceAzureSqlDatabase:LinkedServiceAzureSqlDatabase", name, args == null ? LinkedServiceAzureSqlDatabaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkedServiceAzureSqlDatabase(String name, Output<String> id, @Nullable LinkedServiceAzureSqlDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceAzureSqlDatabase:LinkedServiceAzureSqlDatabase", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LinkedServiceAzureSqlDatabase get(String name, Output<String> id, @Nullable LinkedServiceAzureSqlDatabaseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkedServiceAzureSqlDatabase(name, id, state, options);
    }
}
