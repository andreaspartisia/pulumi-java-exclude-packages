// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataScience.outputs.NotebookSessionNotebookSessionConfigDetailsNotebookSessionShapeConfigDetails;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotebookSessionNotebookSessionConfigDetails {
    /**
     * @return (Updatable) A notebook session instance is provided with a block storage volume. This specifies the size of the volume in GBs.
     * 
     */
    private final @Nullable Integer blockStorageSizeInGbs;
    /**
     * @return (Updatable) Details for the notebook session shape configuration.
     * 
     */
    private final @Nullable NotebookSessionNotebookSessionConfigDetailsNotebookSessionShapeConfigDetails notebookSessionShapeConfigDetails;
    /**
     * @return (Updatable) The shape used to launch the notebook session compute instance.  The list of available shapes in a given compartment can be retrieved using the `ListNotebookSessionShapes` endpoint.
     * 
     */
    private final String shape;
    /**
     * @return (Updatable) A notebook session instance is provided with a VNIC for network access.  This specifies the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet to create a VNIC in.  The subnet should be in a VCN with a NAT gateway for egress to the internet.
     * 
     */
    private final @Nullable String subnetId;

    @CustomType.Constructor
    private NotebookSessionNotebookSessionConfigDetails(
        @CustomType.Parameter("blockStorageSizeInGbs") @Nullable Integer blockStorageSizeInGbs,
        @CustomType.Parameter("notebookSessionShapeConfigDetails") @Nullable NotebookSessionNotebookSessionConfigDetailsNotebookSessionShapeConfigDetails notebookSessionShapeConfigDetails,
        @CustomType.Parameter("shape") String shape,
        @CustomType.Parameter("subnetId") @Nullable String subnetId) {
        this.blockStorageSizeInGbs = blockStorageSizeInGbs;
        this.notebookSessionShapeConfigDetails = notebookSessionShapeConfigDetails;
        this.shape = shape;
        this.subnetId = subnetId;
    }

    /**
     * @return (Updatable) A notebook session instance is provided with a block storage volume. This specifies the size of the volume in GBs.
     * 
     */
    public Optional<Integer> blockStorageSizeInGbs() {
        return Optional.ofNullable(this.blockStorageSizeInGbs);
    }
    /**
     * @return (Updatable) Details for the notebook session shape configuration.
     * 
     */
    public Optional<NotebookSessionNotebookSessionConfigDetailsNotebookSessionShapeConfigDetails> notebookSessionShapeConfigDetails() {
        return Optional.ofNullable(this.notebookSessionShapeConfigDetails);
    }
    /**
     * @return (Updatable) The shape used to launch the notebook session compute instance.  The list of available shapes in a given compartment can be retrieved using the `ListNotebookSessionShapes` endpoint.
     * 
     */
    public String shape() {
        return this.shape;
    }
    /**
     * @return (Updatable) A notebook session instance is provided with a VNIC for network access.  This specifies the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet to create a VNIC in.  The subnet should be in a VCN with a NAT gateway for egress to the internet.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookSessionNotebookSessionConfigDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer blockStorageSizeInGbs;
        private @Nullable NotebookSessionNotebookSessionConfigDetailsNotebookSessionShapeConfigDetails notebookSessionShapeConfigDetails;
        private String shape;
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NotebookSessionNotebookSessionConfigDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockStorageSizeInGbs = defaults.blockStorageSizeInGbs;
    	      this.notebookSessionShapeConfigDetails = defaults.notebookSessionShapeConfigDetails;
    	      this.shape = defaults.shape;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder blockStorageSizeInGbs(@Nullable Integer blockStorageSizeInGbs) {
            this.blockStorageSizeInGbs = blockStorageSizeInGbs;
            return this;
        }
        public Builder notebookSessionShapeConfigDetails(@Nullable NotebookSessionNotebookSessionConfigDetailsNotebookSessionShapeConfigDetails notebookSessionShapeConfigDetails) {
            this.notebookSessionShapeConfigDetails = notebookSessionShapeConfigDetails;
            return this;
        }
        public Builder shape(String shape) {
            this.shape = Objects.requireNonNull(shape);
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }        public NotebookSessionNotebookSessionConfigDetails build() {
            return new NotebookSessionNotebookSessionConfigDetails(blockStorageSizeInGbs, notebookSessionShapeConfigDetails, shape, subnetId);
        }
    }
}
