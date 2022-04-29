// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ObjectStorage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNamespaceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespaceArgs Empty = new GetNamespaceArgs();

    /**
     * This is an optional field representing either the tenancy [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or the compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) within the tenancy whose Object Storage namespace is to be retrieved.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable String compartmentId;

    /**
     * @return This is an optional field representing either the tenancy [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or the compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) within the tenancy whose Object Storage namespace is to be retrieved.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    private GetNamespaceArgs() {}

    private GetNamespaceArgs(GetNamespaceArgs $) {
        this.compartmentId = $.compartmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespaceArgs $;

        public Builder() {
            $ = new GetNamespaceArgs();
        }

        public Builder(GetNamespaceArgs defaults) {
            $ = new GetNamespaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId This is an optional field representing either the tenancy [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or the compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) within the tenancy whose Object Storage namespace is to be retrieved.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public GetNamespaceArgs build() {
            return $;
        }
    }

}
