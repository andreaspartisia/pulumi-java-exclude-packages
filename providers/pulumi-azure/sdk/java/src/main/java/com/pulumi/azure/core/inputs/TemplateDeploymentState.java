// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemplateDeploymentState extends com.pulumi.resources.ResourceArgs {

    public static final TemplateDeploymentState Empty = new TemplateDeploymentState();

    /**
     * Specifies the mode that is used to deploy resources. This value could be either `Incremental` or `Complete`.
     * Note that you will almost *always* want this to be set to `Incremental` otherwise the deployment will destroy all infrastructure not
     * specified within the template, and this provider will not be aware of this.
     * 
     */
    @Import(name="deploymentMode")
    private @Nullable Output<String> deploymentMode;

    /**
     * @return Specifies the mode that is used to deploy resources. This value could be either `Incremental` or `Complete`.
     * Note that you will almost *always* want this to be set to `Incremental` otherwise the deployment will destroy all infrastructure not
     * specified within the template, and this provider will not be aware of this.
     * 
     */
    public Optional<Output<String>> deploymentMode() {
        return Optional.ofNullable(this.deploymentMode);
    }

    /**
     * Specifies the name of the template deployment. Changing this forces a
     * new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the template deployment. Changing this forces a
     * new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of supported scalar output types returned from the deployment (currently, Azure Template Deployment outputs of type String, Int and Bool are supported, and are converted to strings - others will be ignored) and can be accessed using `.outputs[&#34;name&#34;]`.
     * 
     */
    @Import(name="outputs")
    private @Nullable Output<Map<String,String>> outputs;

    /**
     * @return A map of supported scalar output types returned from the deployment (currently, Azure Template Deployment outputs of type String, Int and Bool are supported, and are converted to strings - others will be ignored) and can be accessed using `.outputs[&#34;name&#34;]`.
     * 
     */
    public Optional<Output<Map<String,String>>> outputs() {
        return Optional.ofNullable(this.outputs);
    }

    /**
     * Specifies the name and value pairs that define the deployment parameters for the template.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return Specifies the name and value pairs that define the deployment parameters for the template.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Specifies a valid Azure JSON parameters file that define the deployment parameters. It can contain KeyVault references
     * 
     */
    @Import(name="parametersBody")
    private @Nullable Output<String> parametersBody;

    /**
     * @return Specifies a valid Azure JSON parameters file that define the deployment parameters. It can contain KeyVault references
     * 
     */
    public Optional<Output<String>> parametersBody() {
        return Optional.ofNullable(this.parametersBody);
    }

    /**
     * The name of the resource group in which to
     * create the template deployment.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to
     * create the template deployment.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * Specifies the JSON definition for the template.
     * 
     */
    @Import(name="templateBody")
    private @Nullable Output<String> templateBody;

    /**
     * @return Specifies the JSON definition for the template.
     * 
     */
    public Optional<Output<String>> templateBody() {
        return Optional.ofNullable(this.templateBody);
    }

    private TemplateDeploymentState() {}

    private TemplateDeploymentState(TemplateDeploymentState $) {
        this.deploymentMode = $.deploymentMode;
        this.name = $.name;
        this.outputs = $.outputs;
        this.parameters = $.parameters;
        this.parametersBody = $.parametersBody;
        this.resourceGroupName = $.resourceGroupName;
        this.templateBody = $.templateBody;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemplateDeploymentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemplateDeploymentState $;

        public Builder() {
            $ = new TemplateDeploymentState();
        }

        public Builder(TemplateDeploymentState defaults) {
            $ = new TemplateDeploymentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentMode Specifies the mode that is used to deploy resources. This value could be either `Incremental` or `Complete`.
         * Note that you will almost *always* want this to be set to `Incremental` otherwise the deployment will destroy all infrastructure not
         * specified within the template, and this provider will not be aware of this.
         * 
         * @return builder
         * 
         */
        public Builder deploymentMode(@Nullable Output<String> deploymentMode) {
            $.deploymentMode = deploymentMode;
            return this;
        }

        /**
         * @param deploymentMode Specifies the mode that is used to deploy resources. This value could be either `Incremental` or `Complete`.
         * Note that you will almost *always* want this to be set to `Incremental` otherwise the deployment will destroy all infrastructure not
         * specified within the template, and this provider will not be aware of this.
         * 
         * @return builder
         * 
         */
        public Builder deploymentMode(String deploymentMode) {
            return deploymentMode(Output.of(deploymentMode));
        }

        /**
         * @param name Specifies the name of the template deployment. Changing this forces a
         * new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the template deployment. Changing this forces a
         * new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputs A map of supported scalar output types returned from the deployment (currently, Azure Template Deployment outputs of type String, Int and Bool are supported, and are converted to strings - others will be ignored) and can be accessed using `.outputs[&#34;name&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder outputs(@Nullable Output<Map<String,String>> outputs) {
            $.outputs = outputs;
            return this;
        }

        /**
         * @param outputs A map of supported scalar output types returned from the deployment (currently, Azure Template Deployment outputs of type String, Int and Bool are supported, and are converted to strings - others will be ignored) and can be accessed using `.outputs[&#34;name&#34;]`.
         * 
         * @return builder
         * 
         */
        public Builder outputs(Map<String,String> outputs) {
            return outputs(Output.of(outputs));
        }

        /**
         * @param parameters Specifies the name and value pairs that define the deployment parameters for the template.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Specifies the name and value pairs that define the deployment parameters for the template.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parametersBody Specifies a valid Azure JSON parameters file that define the deployment parameters. It can contain KeyVault references
         * 
         * @return builder
         * 
         */
        public Builder parametersBody(@Nullable Output<String> parametersBody) {
            $.parametersBody = parametersBody;
            return this;
        }

        /**
         * @param parametersBody Specifies a valid Azure JSON parameters file that define the deployment parameters. It can contain KeyVault references
         * 
         * @return builder
         * 
         */
        public Builder parametersBody(String parametersBody) {
            return parametersBody(Output.of(parametersBody));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the template deployment.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the template deployment.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param templateBody Specifies the JSON definition for the template.
         * 
         * @return builder
         * 
         */
        public Builder templateBody(@Nullable Output<String> templateBody) {
            $.templateBody = templateBody;
            return this;
        }

        /**
         * @param templateBody Specifies the JSON definition for the template.
         * 
         * @return builder
         * 
         */
        public Builder templateBody(String templateBody) {
            return templateBody(Output.of(templateBody));
        }

        public TemplateDeploymentState build() {
            return $;
        }
    }

}
