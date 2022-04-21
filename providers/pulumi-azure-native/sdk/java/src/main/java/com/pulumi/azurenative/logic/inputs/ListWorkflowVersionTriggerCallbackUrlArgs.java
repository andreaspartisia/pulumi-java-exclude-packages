// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.KeyType;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListWorkflowVersionTriggerCallbackUrlArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWorkflowVersionTriggerCallbackUrlArgs Empty = new ListWorkflowVersionTriggerCallbackUrlArgs();

    /**
     * The key type.
     * 
     */
    @Import(name="keyType")
    private @Nullable Either<String,KeyType> keyType;

    public Optional<Either<String,KeyType>> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    /**
     * The expiry time.
     * 
     */
    @Import(name="notAfter")
    private @Nullable String notAfter;

    public Optional<String> notAfter() {
        return Optional.ofNullable(this.notAfter);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workflow trigger name.
     * 
     */
    @Import(name="triggerName", required=true)
    private String triggerName;

    public String triggerName() {
        return this.triggerName;
    }

    /**
     * The workflow versionId.
     * 
     */
    @Import(name="versionId", required=true)
    private String versionId;

    public String versionId() {
        return this.versionId;
    }

    /**
     * The workflow name.
     * 
     */
    @Import(name="workflowName", required=true)
    private String workflowName;

    public String workflowName() {
        return this.workflowName;
    }

    private ListWorkflowVersionTriggerCallbackUrlArgs() {}

    private ListWorkflowVersionTriggerCallbackUrlArgs(ListWorkflowVersionTriggerCallbackUrlArgs $) {
        this.keyType = $.keyType;
        this.notAfter = $.notAfter;
        this.resourceGroupName = $.resourceGroupName;
        this.triggerName = $.triggerName;
        this.versionId = $.versionId;
        this.workflowName = $.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWorkflowVersionTriggerCallbackUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWorkflowVersionTriggerCallbackUrlArgs $;

        public Builder() {
            $ = new ListWorkflowVersionTriggerCallbackUrlArgs();
        }

        public Builder(ListWorkflowVersionTriggerCallbackUrlArgs defaults) {
            $ = new ListWorkflowVersionTriggerCallbackUrlArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyType(@Nullable Either<String,KeyType> keyType) {
            $.keyType = keyType;
            return this;
        }

        public Builder keyType(String keyType) {
            return keyType(Either.ofLeft(keyType));
        }

        public Builder keyType(KeyType keyType) {
            return keyType(Either.ofRight(keyType));
        }

        public Builder notAfter(@Nullable String notAfter) {
            $.notAfter = notAfter;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder triggerName(String triggerName) {
            $.triggerName = triggerName;
            return this;
        }

        public Builder versionId(String versionId) {
            $.versionId = versionId;
            return this;
        }

        public Builder workflowName(String workflowName) {
            $.workflowName = workflowName;
            return this;
        }

        public ListWorkflowVersionTriggerCallbackUrlArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.triggerName = Objects.requireNonNull($.triggerName, "expected parameter 'triggerName' to be non-null");
            $.versionId = Objects.requireNonNull($.versionId, "expected parameter 'versionId' to be non-null");
            $.workflowName = Objects.requireNonNull($.workflowName, "expected parameter 'workflowName' to be non-null");
            return $;
        }
    }

}
