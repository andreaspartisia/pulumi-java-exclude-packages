// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionState Empty = new ConnectionState();

    /**
     * The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="automationAccountName")
    private @Nullable Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> automationAccountName() {
        return Optional.ofNullable(this.automationAccountName);
    }

    /**
     * A description for this Connection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for this Connection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies the name of the Connection. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Connection. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The type of the Connection - can be either builtin type such as `Azure`, `AzureClassicCertificate`, and `AzureServicePrincipal`, or a user defined types. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the Connection - can be either builtin type such as `Azure`, `AzureClassicCertificate`, and `AzureServicePrincipal`, or a user defined types. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * A mapping of key value pairs passed to the connection. Different `type` needs different parameters in the `values`. Builtin types have required field values as below:
     * 
     */
    @Import(name="values")
    private @Nullable Output<Map<String,String>> values;

    /**
     * @return A mapping of key value pairs passed to the connection. Different `type` needs different parameters in the `values`. Builtin types have required field values as below:
     * 
     */
    public Optional<Output<Map<String,String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ConnectionState() {}

    private ConnectionState(ConnectionState $) {
        this.automationAccountName = $.automationAccountName;
        this.description = $.description;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.type = $.type;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionState $;

        public Builder() {
            $ = new ConnectionState();
        }

        public Builder(ConnectionState defaults) {
            $ = new ConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(@Nullable Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account in which the Connection is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param description A description for this Connection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for this Connection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Specifies the name of the Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Connection. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Connection is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param type The type of the Connection - can be either builtin type such as `Azure`, `AzureClassicCertificate`, and `AzureServicePrincipal`, or a user defined types. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the Connection - can be either builtin type such as `Azure`, `AzureClassicCertificate`, and `AzureServicePrincipal`, or a user defined types. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param values A mapping of key value pairs passed to the connection. Different `type` needs different parameters in the `values`. Builtin types have required field values as below:
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<Map<String,String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values A mapping of key value pairs passed to the connection. Different `type` needs different parameters in the `values`. Builtin types have required field values as below:
         * 
         * @return builder
         * 
         */
        public Builder values(Map<String,String> values) {
            return values(Output.of(values));
        }

        public ConnectionState build() {
            return $;
        }
    }

}
