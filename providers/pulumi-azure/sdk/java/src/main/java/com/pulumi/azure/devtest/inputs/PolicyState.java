// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyState extends com.pulumi.resources.ResourceArgs {

    public static final PolicyState Empty = new PolicyState();

    /**
     * A description for the Policy.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for the Policy.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Evaluation Type used for this Policy. Possible values include: &#39;AllowedValuesPolicy&#39;, &#39;MaxValuePolicy&#39;. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="evaluatorType")
    private @Nullable Output<String> evaluatorType;

    /**
     * @return The Evaluation Type used for this Policy. Possible values include: &#39;AllowedValuesPolicy&#39;, &#39;MaxValuePolicy&#39;. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> evaluatorType() {
        return Optional.ofNullable(this.evaluatorType);
    }

    /**
     * The Fact Data for this Policy.
     * 
     */
    @Import(name="factData")
    private @Nullable Output<String> factData;

    /**
     * @return The Fact Data for this Policy.
     * 
     */
    public Optional<Output<String>> factData() {
        return Optional.ofNullable(this.factData);
    }

    /**
     * Specifies the name of the Dev Test Lab in which the Policy should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="labName")
    private @Nullable Output<String> labName;

    /**
     * @return Specifies the name of the Dev Test Lab in which the Policy should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> labName() {
        return Optional.ofNullable(this.labName);
    }

    /**
     * Specifies the name of the Dev Test Policy. Possible values are `GalleryImage`, `LabPremiumVmCount`, `LabTargetCost`, `LabVmCount`, `LabVmSize`, `UserOwnedLabPremiumVmCount`, `UserOwnedLabVmCount` and `UserOwnedLabVmCountInSubnet`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Dev Test Policy. Possible values are `GalleryImage`, `LabPremiumVmCount`, `LabTargetCost`, `LabVmCount`, `LabVmSize`, `UserOwnedLabPremiumVmCount`, `UserOwnedLabVmCount` and `UserOwnedLabVmCountInSubnet`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the name of the Policy Set within the Dev Test Lab where this policy should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="policySetName")
    private @Nullable Output<String> policySetName;

    /**
     * @return Specifies the name of the Policy Set within the Dev Test Lab where this policy should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> policySetName() {
        return Optional.ofNullable(this.policySetName);
    }

    /**
     * The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
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

    /**
     * The Threshold for this Policy.
     * 
     */
    @Import(name="threshold")
    private @Nullable Output<String> threshold;

    /**
     * @return The Threshold for this Policy.
     * 
     */
    public Optional<Output<String>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    private PolicyState() {}

    private PolicyState(PolicyState $) {
        this.description = $.description;
        this.evaluatorType = $.evaluatorType;
        this.factData = $.factData;
        this.labName = $.labName;
        this.name = $.name;
        this.policySetName = $.policySetName;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyState $;

        public Builder() {
            $ = new PolicyState();
        }

        public Builder(PolicyState defaults) {
            $ = new PolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description for the Policy.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the Policy.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param evaluatorType The Evaluation Type used for this Policy. Possible values include: &#39;AllowedValuesPolicy&#39;, &#39;MaxValuePolicy&#39;. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder evaluatorType(@Nullable Output<String> evaluatorType) {
            $.evaluatorType = evaluatorType;
            return this;
        }

        /**
         * @param evaluatorType The Evaluation Type used for this Policy. Possible values include: &#39;AllowedValuesPolicy&#39;, &#39;MaxValuePolicy&#39;. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder evaluatorType(String evaluatorType) {
            return evaluatorType(Output.of(evaluatorType));
        }

        /**
         * @param factData The Fact Data for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder factData(@Nullable Output<String> factData) {
            $.factData = factData;
            return this;
        }

        /**
         * @param factData The Fact Data for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder factData(String factData) {
            return factData(Output.of(factData));
        }

        /**
         * @param labName Specifies the name of the Dev Test Lab in which the Policy should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder labName(@Nullable Output<String> labName) {
            $.labName = labName;
            return this;
        }

        /**
         * @param labName Specifies the name of the Dev Test Lab in which the Policy should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder labName(String labName) {
            return labName(Output.of(labName));
        }

        /**
         * @param name Specifies the name of the Dev Test Policy. Possible values are `GalleryImage`, `LabPremiumVmCount`, `LabTargetCost`, `LabVmCount`, `LabVmSize`, `UserOwnedLabPremiumVmCount`, `UserOwnedLabVmCount` and `UserOwnedLabVmCountInSubnet`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Dev Test Policy. Possible values are `GalleryImage`, `LabPremiumVmCount`, `LabTargetCost`, `LabVmCount`, `LabVmSize`, `UserOwnedLabPremiumVmCount`, `UserOwnedLabVmCount` and `UserOwnedLabVmCountInSubnet`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policySetName Specifies the name of the Policy Set within the Dev Test Lab where this policy should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder policySetName(@Nullable Output<String> policySetName) {
            $.policySetName = policySetName;
            return this;
        }

        /**
         * @param policySetName Specifies the name of the Policy Set within the Dev Test Lab where this policy should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder policySetName(String policySetName) {
            return policySetName(Output.of(policySetName));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
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

        /**
         * @param threshold The Threshold for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder threshold(@Nullable Output<String> threshold) {
            $.threshold = threshold;
            return this;
        }

        /**
         * @param threshold The Threshold for this Policy.
         * 
         * @return builder
         * 
         */
        public Builder threshold(String threshold) {
            return threshold(Output.of(threshold));
        }

        public PolicyState build() {
            return $;
        }
    }

}
