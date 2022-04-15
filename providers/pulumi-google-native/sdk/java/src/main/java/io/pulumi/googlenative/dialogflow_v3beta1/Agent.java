// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3beta1.AgentArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an agent in the specified location. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
 * 
 */
@ResourceType(type="google-native:dialogflow/v3beta1:Agent")
public class Agent extends io.pulumi.resources.CustomResource {
    /**
     * Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
     * 
     */
    @Export(name="advancedSettings", type=GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse> advancedSettings;

    /**
     * @return Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsResponse> advancedSettings() {
        return this.advancedSettings;
    }
    /**
     * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo) integration.
     * 
     */
    @Export(name="avatarUri", type=String.class, parameters={})
    private Output<String> avatarUri;

    /**
     * @return The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo) integration.
     * 
     */
    public Output<String> avatarUri() {
        return this.avatarUri;
    }
    /**
     * Immutable. The default language of the agent as a language tag. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
     * 
     */
    @Export(name="defaultLanguageCode", type=String.class, parameters={})
    private Output<String> defaultLanguageCode;

    /**
     * @return Immutable. The default language of the agent as a language tag. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
     * 
     */
    public Output<String> defaultLanguageCode() {
        return this.defaultLanguageCode;
    }
    /**
     * The description of the agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The human-readable name of the agent, unique within the location.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the agent, unique within the location.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    @Export(name="enableSpellCorrection", type=Boolean.class, parameters={})
    private Output<Boolean> enableSpellCorrection;

    /**
     * @return Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    public Output<Boolean> enableSpellCorrection() {
        return this.enableSpellCorrection;
    }
    /**
     * Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings instead.
     * 
     */
    @Export(name="enableStackdriverLogging", type=Boolean.class, parameters={})
    private Output<Boolean> enableStackdriverLogging;

    /**
     * @return Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings instead.
     * 
     */
    public Output<Boolean> enableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }
    /**
     * The unique identifier of the agent. Required for the Agents.UpdateAgent method. Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the agent. Required for the Agents.UpdateAgent method. Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Name of the SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    @Export(name="securitySettings", type=String.class, parameters={})
    private Output<String> securitySettings;

    /**
     * @return Name of the SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    public Output<String> securitySettings() {
        return this.securitySettings;
    }
    /**
     * Speech recognition related settings.
     * 
     */
    @Export(name="speechToTextSettings", type=GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsResponse> speechToTextSettings;

    /**
     * @return Speech recognition related settings.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsResponse> speechToTextSettings() {
        return this.speechToTextSettings;
    }
    /**
     * Immutable. Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: `projects//locations//agents//flows/`.
     * 
     */
    @Export(name="startFlow", type=String.class, parameters={})
    private Output<String> startFlow;

    /**
     * @return Immutable. Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: `projects//locations//agents//flows/`.
     * 
     */
    public Output<String> startFlow() {
        return this.startFlow;
    }
    /**
     * The list of all languages supported by the agent (except for the `default_language_code`).
     * 
     */
    @Export(name="supportedLanguageCodes", type=List.class, parameters={String.class})
    private Output<List<String>> supportedLanguageCodes;

    /**
     * @return The list of all languages supported by the agent (except for the `default_language_code`).
     * 
     */
    public Output<List<String>> supportedLanguageCodes() {
        return this.supportedLanguageCodes;
    }
    /**
     * The time zone of the agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris.
     * 
     */
    @Export(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return The time zone of the agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Agent(String name) {
        this(name, AgentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Agent(String name, AgentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Agent(String name, AgentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:Agent", name, args == null ? AgentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Agent(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:Agent", name, null, makeResourceOptions(options, id));
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
    public static Agent get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Agent(name, id, options);
    }
}
