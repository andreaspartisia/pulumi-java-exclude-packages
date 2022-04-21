// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.HDInsightActivityDebugInfoOption;
import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import com.pulumi.azurenative.datafactory.inputs.ActivityPolicyArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HDInsight streaming activity type.
 * 
 */
public final class HDInsightStreamingActivityArgs extends com.pulumi.resources.ResourceArgs {

    public static final HDInsightStreamingActivityArgs Empty = new HDInsightStreamingActivityArgs();

    /**
     * User specified arguments to HDInsightActivity.
     * 
     */
    @Import(name="arguments")
    private @Nullable Output<List<Object>> arguments;

    public Optional<Output<List<Object>>> arguments() {
        return Optional.ofNullable(this.arguments);
    }

    /**
     * Combiner executable name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="combiner")
    private @Nullable Output<Object> combiner;

    public Optional<Output<Object>> combiner() {
        return Optional.ofNullable(this.combiner);
    }

    /**
     * Command line environment values.
     * 
     */
    @Import(name="commandEnvironment")
    private @Nullable Output<List<Object>> commandEnvironment;

    public Optional<Output<List<Object>>> commandEnvironment() {
        return Optional.ofNullable(this.commandEnvironment);
    }

    /**
     * Allows user to specify defines for streaming job request.
     * 
     */
    @Import(name="defines")
    private @Nullable Output<Map<String,Object>> defines;

    public Optional<Output<Map<String,Object>>> defines() {
        return Optional.ofNullable(this.defines);
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
    private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Optional<Output<List<ActivityDependencyArgs>>> dependsOn() {
        return Optional.ofNullable(this.dependsOn);
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Linked service reference where the files are located.
     * 
     */
    @Import(name="fileLinkedService")
    private @Nullable Output<LinkedServiceReferenceArgs> fileLinkedService;

    public Optional<Output<LinkedServiceReferenceArgs>> fileLinkedService() {
        return Optional.ofNullable(this.fileLinkedService);
    }

    /**
     * Paths to streaming job files. Can be directories.
     * 
     */
    @Import(name="filePaths", required=true)
    private Output<List<Object>> filePaths;

    public Output<List<Object>> filePaths() {
        return this.filePaths;
    }

    /**
     * Debug info option.
     * 
     */
    @Import(name="getDebugInfo")
    private @Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo;

    public Optional<Output<Either<String,HDInsightActivityDebugInfoOption>>> getDebugInfo() {
        return Optional.ofNullable(this.getDebugInfo);
    }

    /**
     * Input blob path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="input", required=true)
    private Output<Object> input;

    public Output<Object> input() {
        return this.input;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Optional<Output<LinkedServiceReferenceArgs>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Mapper executable name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="mapper", required=true)
    private Output<Object> mapper;

    public Output<Object> mapper() {
        return this.mapper;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Output blob path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="output", required=true)
    private Output<Object> output;

    public Output<Object> output() {
        return this.output;
    }

    /**
     * Activity policy.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<ActivityPolicyArgs> policy;

    public Optional<Output<ActivityPolicyArgs>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * Reducer executable name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="reducer", required=true)
    private Output<Object> reducer;

    public Output<Object> reducer() {
        return this.reducer;
    }

    /**
     * Storage linked service references.
     * 
     */
    @Import(name="storageLinkedServices")
    private @Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices;

    public Optional<Output<List<LinkedServiceReferenceArgs>>> storageLinkedServices() {
        return Optional.ofNullable(this.storageLinkedServices);
    }

    /**
     * Type of activity.
     * Expected value is &#39;HDInsightStreaming&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
    private @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Optional<Output<List<UserPropertyArgs>>> userProperties() {
        return Optional.ofNullable(this.userProperties);
    }

    private HDInsightStreamingActivityArgs() {}

    private HDInsightStreamingActivityArgs(HDInsightStreamingActivityArgs $) {
        this.arguments = $.arguments;
        this.combiner = $.combiner;
        this.commandEnvironment = $.commandEnvironment;
        this.defines = $.defines;
        this.dependsOn = $.dependsOn;
        this.description = $.description;
        this.fileLinkedService = $.fileLinkedService;
        this.filePaths = $.filePaths;
        this.getDebugInfo = $.getDebugInfo;
        this.input = $.input;
        this.linkedServiceName = $.linkedServiceName;
        this.mapper = $.mapper;
        this.name = $.name;
        this.output = $.output;
        this.policy = $.policy;
        this.reducer = $.reducer;
        this.storageLinkedServices = $.storageLinkedServices;
        this.type = $.type;
        this.userProperties = $.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HDInsightStreamingActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HDInsightStreamingActivityArgs $;

        public Builder() {
            $ = new HDInsightStreamingActivityArgs();
        }

        public Builder(HDInsightStreamingActivityArgs defaults) {
            $ = new HDInsightStreamingActivityArgs(Objects.requireNonNull(defaults));
        }

        public Builder arguments(@Nullable Output<List<Object>> arguments) {
            $.arguments = arguments;
            return this;
        }

        public Builder arguments(List<Object> arguments) {
            return arguments(Output.of(arguments));
        }

        public Builder arguments(Object... arguments) {
            return arguments(List.of(arguments));
        }

        public Builder combiner(@Nullable Output<Object> combiner) {
            $.combiner = combiner;
            return this;
        }

        public Builder combiner(Object combiner) {
            return combiner(Output.of(combiner));
        }

        public Builder commandEnvironment(@Nullable Output<List<Object>> commandEnvironment) {
            $.commandEnvironment = commandEnvironment;
            return this;
        }

        public Builder commandEnvironment(List<Object> commandEnvironment) {
            return commandEnvironment(Output.of(commandEnvironment));
        }

        public Builder commandEnvironment(Object... commandEnvironment) {
            return commandEnvironment(List.of(commandEnvironment));
        }

        public Builder defines(@Nullable Output<Map<String,Object>> defines) {
            $.defines = defines;
            return this;
        }

        public Builder defines(Map<String,Object> defines) {
            return defines(Output.of(defines));
        }

        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            $.dependsOn = dependsOn;
            return this;
        }

        public Builder dependsOn(List<ActivityDependencyArgs> dependsOn) {
            return dependsOn(Output.of(dependsOn));
        }

        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder fileLinkedService(@Nullable Output<LinkedServiceReferenceArgs> fileLinkedService) {
            $.fileLinkedService = fileLinkedService;
            return this;
        }

        public Builder fileLinkedService(LinkedServiceReferenceArgs fileLinkedService) {
            return fileLinkedService(Output.of(fileLinkedService));
        }

        public Builder filePaths(Output<List<Object>> filePaths) {
            $.filePaths = filePaths;
            return this;
        }

        public Builder filePaths(List<Object> filePaths) {
            return filePaths(Output.of(filePaths));
        }

        public Builder filePaths(Object... filePaths) {
            return filePaths(List.of(filePaths));
        }

        public Builder getDebugInfo(@Nullable Output<Either<String,HDInsightActivityDebugInfoOption>> getDebugInfo) {
            $.getDebugInfo = getDebugInfo;
            return this;
        }

        public Builder getDebugInfo(Either<String,HDInsightActivityDebugInfoOption> getDebugInfo) {
            return getDebugInfo(Output.of(getDebugInfo));
        }

        public Builder getDebugInfo(String getDebugInfo) {
            return getDebugInfo(Either.ofLeft(getDebugInfo));
        }

        public Builder getDebugInfo(HDInsightActivityDebugInfoOption getDebugInfo) {
            return getDebugInfo(Either.ofRight(getDebugInfo));
        }

        public Builder input(Output<Object> input) {
            $.input = input;
            return this;
        }

        public Builder input(Object input) {
            return input(Output.of(input));
        }

        public Builder linkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        public Builder mapper(Output<Object> mapper) {
            $.mapper = mapper;
            return this;
        }

        public Builder mapper(Object mapper) {
            return mapper(Output.of(mapper));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder output(Output<Object> output) {
            $.output = output;
            return this;
        }

        public Builder output(Object output) {
            return output(Output.of(output));
        }

        public Builder policy(@Nullable Output<ActivityPolicyArgs> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(ActivityPolicyArgs policy) {
            return policy(Output.of(policy));
        }

        public Builder reducer(Output<Object> reducer) {
            $.reducer = reducer;
            return this;
        }

        public Builder reducer(Object reducer) {
            return reducer(Output.of(reducer));
        }

        public Builder storageLinkedServices(@Nullable Output<List<LinkedServiceReferenceArgs>> storageLinkedServices) {
            $.storageLinkedServices = storageLinkedServices;
            return this;
        }

        public Builder storageLinkedServices(List<LinkedServiceReferenceArgs> storageLinkedServices) {
            return storageLinkedServices(Output.of(storageLinkedServices));
        }

        public Builder storageLinkedServices(LinkedServiceReferenceArgs... storageLinkedServices) {
            return storageLinkedServices(List.of(storageLinkedServices));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            $.userProperties = userProperties;
            return this;
        }

        public Builder userProperties(List<UserPropertyArgs> userProperties) {
            return userProperties(Output.of(userProperties));
        }

        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }

        public HDInsightStreamingActivityArgs build() {
            $.filePaths = Objects.requireNonNull($.filePaths, "expected parameter 'filePaths' to be non-null");
            $.input = Objects.requireNonNull($.input, "expected parameter 'input' to be non-null");
            $.mapper = Objects.requireNonNull($.mapper, "expected parameter 'mapper' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.output = Objects.requireNonNull($.output, "expected parameter 'output' to be non-null");
            $.reducer = Objects.requireNonNull($.reducer, "expected parameter 'reducer' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
