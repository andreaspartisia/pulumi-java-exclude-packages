// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.machinelearningservices.enums.ValueFormat;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceConnectionArgs Empty = new WorkspaceConnectionArgs();

    /**
     * Authorization type of the workspace connection.
     * 
     */
    @Import(name="authType")
    private @Nullable Output<String> authType;

    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

    /**
     * Category of the workspace connection.
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * Friendly name of the workspace connection
     * 
     */
    @Import(name="connectionName")
    private @Nullable Output<String> connectionName;

    public Optional<Output<String>> connectionName() {
        return Optional.ofNullable(this.connectionName);
    }

    /**
     * Friendly name of the workspace connection
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Target of the workspace connection.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * Value details of the workspace connection.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    /**
     * format for the workspace connection value
     * 
     */
    @Import(name="valueFormat")
    private @Nullable Output<Either<String,ValueFormat>> valueFormat;

    public Optional<Output<Either<String,ValueFormat>>> valueFormat() {
        return Optional.ofNullable(this.valueFormat);
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private WorkspaceConnectionArgs() {}

    private WorkspaceConnectionArgs(WorkspaceConnectionArgs $) {
        this.authType = $.authType;
        this.category = $.category;
        this.connectionName = $.connectionName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.target = $.target;
        this.value = $.value;
        this.valueFormat = $.valueFormat;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceConnectionArgs $;

        public Builder() {
            $ = new WorkspaceConnectionArgs();
        }

        public Builder(WorkspaceConnectionArgs defaults) {
            $ = new WorkspaceConnectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        public Builder category(String category) {
            return category(Output.of(category));
        }

        public Builder connectionName(@Nullable Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        public Builder target(String target) {
            return target(Output.of(target));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public Builder valueFormat(@Nullable Output<Either<String,ValueFormat>> valueFormat) {
            $.valueFormat = valueFormat;
            return this;
        }

        public Builder valueFormat(Either<String,ValueFormat> valueFormat) {
            return valueFormat(Output.of(valueFormat));
        }

        public Builder valueFormat(String valueFormat) {
            return valueFormat(Either.ofLeft(valueFormat));
        }

        public Builder valueFormat(ValueFormat valueFormat) {
            return valueFormat(Either.ofRight(valueFormat));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public WorkspaceConnectionArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
