// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.automation.inputs.RunBookJobScheduleArgs;
import com.pulumi.azure.automation.inputs.RunBookPublishContentLinkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RunBookArgs extends com.pulumi.resources.ResourceArgs {

    public static final RunBookArgs Empty = new RunBookArgs();

    /**
     * The name of the automation account in which the Runbook is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Runbook is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The desired content of the runbook.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The desired content of the runbook.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * A description for this credential.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for this credential.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="jobSchedules")
    private @Nullable Output<List<RunBookJobScheduleArgs>> jobSchedules;

    public Optional<Output<List<RunBookJobScheduleArgs>>> jobSchedules() {
        return Optional.ofNullable(this.jobSchedules);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Progress log option.
     * 
     */
    @Import(name="logProgress", required=true)
    private Output<Boolean> logProgress;

    /**
     * @return Progress log option.
     * 
     */
    public Output<Boolean> logProgress() {
        return this.logProgress;
    }

    /**
     * Verbose log option.
     * 
     */
    @Import(name="logVerbose", required=true)
    private Output<Boolean> logVerbose;

    /**
     * @return Verbose log option.
     * 
     */
    public Output<Boolean> logVerbose() {
        return this.logVerbose;
    }

    /**
     * Specifies the name of the Runbook. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Runbook. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The published runbook content link.
     * 
     */
    @Import(name="publishContentLink")
    private @Nullable Output<RunBookPublishContentLinkArgs> publishContentLink;

    /**
     * @return The published runbook content link.
     * 
     */
    public Optional<Output<RunBookPublishContentLinkArgs>> publishContentLink() {
        return Optional.ofNullable(this.publishContentLink);
    }

    /**
     * The name of the resource group in which the Runbook is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Runbook is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The type of the runbook - can be either `Graph`, `GraphPowerShell`, `GraphPowerShellWorkflow`, `PowerShellWorkflow`, `PowerShell` or `Script`.
     * 
     */
    @Import(name="runbookType", required=true)
    private Output<String> runbookType;

    /**
     * @return The type of the runbook - can be either `Graph`, `GraphPowerShell`, `GraphPowerShellWorkflow`, `PowerShellWorkflow`, `PowerShell` or `Script`.
     * 
     */
    public Output<String> runbookType() {
        return this.runbookType;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private RunBookArgs() {}

    private RunBookArgs(RunBookArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.content = $.content;
        this.description = $.description;
        this.jobSchedules = $.jobSchedules;
        this.location = $.location;
        this.logProgress = $.logProgress;
        this.logVerbose = $.logVerbose;
        this.name = $.name;
        this.publishContentLink = $.publishContentLink;
        this.resourceGroupName = $.resourceGroupName;
        this.runbookType = $.runbookType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RunBookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RunBookArgs $;

        public Builder() {
            $ = new RunBookArgs();
        }

        public Builder(RunBookArgs defaults) {
            $ = new RunBookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account in which the Runbook is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account in which the Runbook is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param content The desired content of the runbook.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The desired content of the runbook.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param description A description for this credential.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for this credential.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder jobSchedules(@Nullable Output<List<RunBookJobScheduleArgs>> jobSchedules) {
            $.jobSchedules = jobSchedules;
            return this;
        }

        public Builder jobSchedules(List<RunBookJobScheduleArgs> jobSchedules) {
            return jobSchedules(Output.of(jobSchedules));
        }

        public Builder jobSchedules(RunBookJobScheduleArgs... jobSchedules) {
            return jobSchedules(List.of(jobSchedules));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param logProgress Progress log option.
         * 
         * @return builder
         * 
         */
        public Builder logProgress(Output<Boolean> logProgress) {
            $.logProgress = logProgress;
            return this;
        }

        /**
         * @param logProgress Progress log option.
         * 
         * @return builder
         * 
         */
        public Builder logProgress(Boolean logProgress) {
            return logProgress(Output.of(logProgress));
        }

        /**
         * @param logVerbose Verbose log option.
         * 
         * @return builder
         * 
         */
        public Builder logVerbose(Output<Boolean> logVerbose) {
            $.logVerbose = logVerbose;
            return this;
        }

        /**
         * @param logVerbose Verbose log option.
         * 
         * @return builder
         * 
         */
        public Builder logVerbose(Boolean logVerbose) {
            return logVerbose(Output.of(logVerbose));
        }

        /**
         * @param name Specifies the name of the Runbook. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Runbook. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param publishContentLink The published runbook content link.
         * 
         * @return builder
         * 
         */
        public Builder publishContentLink(@Nullable Output<RunBookPublishContentLinkArgs> publishContentLink) {
            $.publishContentLink = publishContentLink;
            return this;
        }

        /**
         * @param publishContentLink The published runbook content link.
         * 
         * @return builder
         * 
         */
        public Builder publishContentLink(RunBookPublishContentLinkArgs publishContentLink) {
            return publishContentLink(Output.of(publishContentLink));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Runbook is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Runbook is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param runbookType The type of the runbook - can be either `Graph`, `GraphPowerShell`, `GraphPowerShellWorkflow`, `PowerShellWorkflow`, `PowerShell` or `Script`.
         * 
         * @return builder
         * 
         */
        public Builder runbookType(Output<String> runbookType) {
            $.runbookType = runbookType;
            return this;
        }

        /**
         * @param runbookType The type of the runbook - can be either `Graph`, `GraphPowerShell`, `GraphPowerShellWorkflow`, `PowerShellWorkflow`, `PowerShell` or `Script`.
         * 
         * @return builder
         * 
         */
        public Builder runbookType(String runbookType) {
            return runbookType(Output.of(runbookType));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public RunBookArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.logProgress = Objects.requireNonNull($.logProgress, "expected parameter 'logProgress' to be non-null");
            $.logVerbose = Objects.requireNonNull($.logVerbose, "expected parameter 'logVerbose' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.runbookType = Objects.requireNonNull($.runbookType, "expected parameter 'runbookType' to be non-null");
            return $;
        }
    }

}
