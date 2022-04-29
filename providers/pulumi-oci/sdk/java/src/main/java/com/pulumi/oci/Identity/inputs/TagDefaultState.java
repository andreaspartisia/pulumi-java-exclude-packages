// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagDefaultState extends com.pulumi.resources.ResourceArgs {

    public static final TagDefaultState Empty = new TagDefaultState();

    /**
     * The OCID of the compartment. The tag default will be applied to all new resources created in this compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The OCID of the compartment. The tag default will be applied to all new resources created in this compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) If you specify that a value is required, a value is set during resource creation (either by the user creating the resource or another tag defualt). If no value is set, resource creation is blocked.
     * * If the `isRequired` flag is set to &#34;true&#34;, the value is set during resource creation.
     * * If the `isRequired` flag is set to &#34;false&#34;, the value you enter is set during resource creation.
     * 
     */
    @Import(name="isRequired")
    private @Nullable Output<Boolean> isRequired;

    /**
     * @return (Updatable) If you specify that a value is required, a value is set during resource creation (either by the user creating the resource or another tag defualt). If no value is set, resource creation is blocked.
     * * If the `isRequired` flag is set to &#34;true&#34;, the value is set during resource creation.
     * * If the `isRequired` flag is set to &#34;false&#34;, the value you enter is set during resource creation.
     * 
     */
    public Optional<Output<Boolean>> isRequired() {
        return Optional.ofNullable(this.isRequired);
    }

    /**
     * The tag default&#39;s current state. After creating a `TagDefault`, make sure its `lifecycleState` is ACTIVE before using it.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The tag default&#39;s current state. After creating a `TagDefault`, make sure its `lifecycleState` is ACTIVE before using it.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The OCID of the tag definition. The tag default will always assign a default value for this tag definition.
     * 
     */
    @Import(name="tagDefinitionId")
    private @Nullable Output<String> tagDefinitionId;

    /**
     * @return The OCID of the tag definition. The tag default will always assign a default value for this tag definition.
     * 
     */
    public Optional<Output<String>> tagDefinitionId() {
        return Optional.ofNullable(this.tagDefinitionId);
    }

    /**
     * The name used in the tag definition. This field is informational in the context of the tag default.
     * 
     */
    @Import(name="tagDefinitionName")
    private @Nullable Output<String> tagDefinitionName;

    /**
     * @return The name used in the tag definition. This field is informational in the context of the tag default.
     * 
     */
    public Optional<Output<String>> tagDefinitionName() {
        return Optional.ofNullable(this.tagDefinitionName);
    }

    /**
     * The OCID of the tag namespace that contains the tag definition.
     * 
     */
    @Import(name="tagNamespaceId")
    private @Nullable Output<String> tagNamespaceId;

    /**
     * @return The OCID of the tag namespace that contains the tag definition.
     * 
     */
    public Optional<Output<String>> tagNamespaceId() {
        return Optional.ofNullable(this.tagNamespaceId);
    }

    /**
     * Date and time the `TagDefault` object was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return Date and time the `TagDefault` object was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * (Updatable) The default value for the tag definition. This will be applied to all new resources created in the compartment.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return (Updatable) The default value for the tag definition. This will be applied to all new resources created in the compartment.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private TagDefaultState() {}

    private TagDefaultState(TagDefaultState $) {
        this.compartmentId = $.compartmentId;
        this.isRequired = $.isRequired;
        this.state = $.state;
        this.tagDefinitionId = $.tagDefinitionId;
        this.tagDefinitionName = $.tagDefinitionName;
        this.tagNamespaceId = $.tagNamespaceId;
        this.timeCreated = $.timeCreated;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagDefaultState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagDefaultState $;

        public Builder() {
            $ = new TagDefaultState();
        }

        public Builder(TagDefaultState defaults) {
            $ = new TagDefaultState(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment. The tag default will be applied to all new resources created in this compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment. The tag default will be applied to all new resources created in this compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param isRequired (Updatable) If you specify that a value is required, a value is set during resource creation (either by the user creating the resource or another tag defualt). If no value is set, resource creation is blocked.
         * * If the `isRequired` flag is set to &#34;true&#34;, the value is set during resource creation.
         * * If the `isRequired` flag is set to &#34;false&#34;, the value you enter is set during resource creation.
         * 
         * @return builder
         * 
         */
        public Builder isRequired(@Nullable Output<Boolean> isRequired) {
            $.isRequired = isRequired;
            return this;
        }

        /**
         * @param isRequired (Updatable) If you specify that a value is required, a value is set during resource creation (either by the user creating the resource or another tag defualt). If no value is set, resource creation is blocked.
         * * If the `isRequired` flag is set to &#34;true&#34;, the value is set during resource creation.
         * * If the `isRequired` flag is set to &#34;false&#34;, the value you enter is set during resource creation.
         * 
         * @return builder
         * 
         */
        public Builder isRequired(Boolean isRequired) {
            return isRequired(Output.of(isRequired));
        }

        /**
         * @param state The tag default&#39;s current state. After creating a `TagDefault`, make sure its `lifecycleState` is ACTIVE before using it.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The tag default&#39;s current state. After creating a `TagDefault`, make sure its `lifecycleState` is ACTIVE before using it.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tagDefinitionId The OCID of the tag definition. The tag default will always assign a default value for this tag definition.
         * 
         * @return builder
         * 
         */
        public Builder tagDefinitionId(@Nullable Output<String> tagDefinitionId) {
            $.tagDefinitionId = tagDefinitionId;
            return this;
        }

        /**
         * @param tagDefinitionId The OCID of the tag definition. The tag default will always assign a default value for this tag definition.
         * 
         * @return builder
         * 
         */
        public Builder tagDefinitionId(String tagDefinitionId) {
            return tagDefinitionId(Output.of(tagDefinitionId));
        }

        /**
         * @param tagDefinitionName The name used in the tag definition. This field is informational in the context of the tag default.
         * 
         * @return builder
         * 
         */
        public Builder tagDefinitionName(@Nullable Output<String> tagDefinitionName) {
            $.tagDefinitionName = tagDefinitionName;
            return this;
        }

        /**
         * @param tagDefinitionName The name used in the tag definition. This field is informational in the context of the tag default.
         * 
         * @return builder
         * 
         */
        public Builder tagDefinitionName(String tagDefinitionName) {
            return tagDefinitionName(Output.of(tagDefinitionName));
        }

        /**
         * @param tagNamespaceId The OCID of the tag namespace that contains the tag definition.
         * 
         * @return builder
         * 
         */
        public Builder tagNamespaceId(@Nullable Output<String> tagNamespaceId) {
            $.tagNamespaceId = tagNamespaceId;
            return this;
        }

        /**
         * @param tagNamespaceId The OCID of the tag namespace that contains the tag definition.
         * 
         * @return builder
         * 
         */
        public Builder tagNamespaceId(String tagNamespaceId) {
            return tagNamespaceId(Output.of(tagNamespaceId));
        }

        /**
         * @param timeCreated Date and time the `TagDefault` object was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated Date and time the `TagDefault` object was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param value (Updatable) The default value for the tag definition. This will be applied to all new resources created in the compartment.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value (Updatable) The default value for the tag definition. This will be applied to all new resources created in the compartment.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public TagDefaultState build() {
            return $;
        }
    }

}
