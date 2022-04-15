// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v3beta1.TestCaseArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ConversationTurnResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1TestCaseResultResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1TestConfigResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a test case for the given agent.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:dialogflow/v3beta1:TestCase")
public class TestCase extends io.pulumi.resources.CustomResource {
    /**
     * When the test was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return When the test was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The human-readable name of the test case, unique within the agent. Limit of 200 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the test case, unique within the agent. Limit of 200 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The latest test result.
     * 
     */
    @Export(name="lastTestResult", type=GoogleCloudDialogflowCxV3beta1TestCaseResultResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3beta1TestCaseResultResponse> lastTestResult;

    /**
     * @return The latest test result.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1TestCaseResultResponse> lastTestResult() {
        return this.lastTestResult;
    }
    /**
     * The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the test case. TestCases.CreateTestCase will populate the name automatically. Otherwise use format: `projects//locations//agents/ /testCases/`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Additional freeform notes about the test case. Limit of 400 characters.
     * 
     */
    @Export(name="notes", type=String.class, parameters={})
    private Output<String> notes;

    /**
     * @return Additional freeform notes about the test case. Limit of 400 characters.
     * 
     */
    public Output<String> notes() {
        return this.notes;
    }
    /**
     * Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with "#" and has a limit of 30 characters.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output<List<String>> tags;

    /**
     * @return Tags are short descriptions that users may apply to test cases for organizational and filtering purposes. Each tag should start with "#" and has a limit of 30 characters.
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }
    /**
     * The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
     * 
     */
    @Export(name="testCaseConversationTurns", type=List.class, parameters={GoogleCloudDialogflowCxV3beta1ConversationTurnResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse>> testCaseConversationTurns;

    /**
     * @return The conversation turns uttered when the test case was created, in chronological order. These include the canonical set of agent utterances that should occur when the agent is working properly.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1ConversationTurnResponse>> testCaseConversationTurns() {
        return this.testCaseConversationTurns;
    }
    /**
     * Config for the test case.
     * 
     */
    @Export(name="testConfig", type=GoogleCloudDialogflowCxV3beta1TestConfigResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3beta1TestConfigResponse> testConfig;

    /**
     * @return Config for the test case.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1TestConfigResponse> testConfig() {
        return this.testConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TestCase(String name) {
        this(name, TestCaseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TestCase(String name, TestCaseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TestCase(String name, TestCaseArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:TestCase", name, args == null ? TestCaseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TestCase(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:TestCase", name, null, makeResourceOptions(options, id));
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
    public static TestCase get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TestCase(name, id, options);
    }
}
