// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs Empty = new RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs();

    /**
     * (Updatable) Key of the parent object.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return (Updatable) Key of the parent object.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    private RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs() {}

    private RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs(RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs $) {
        this.parent = $.parent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs $;

        public Builder() {
            $ = new RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs();
        }

        public Builder(RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs defaults) {
            $ = new RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parent (Updatable) Key of the parent object.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent (Updatable) Key of the parent object.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public RegistryDataAssetNativeTypeSystemTypeConfigDefinitionParentRefArgs build() {
            return $;
        }
    }

}
