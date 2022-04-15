// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LocalDiskResponse {
    /**
     * Specifies the number of such disks.
     * 
     */
    private final Integer diskCount;
    /**
     * Specifies the size of the disk in base-2 GB.
     * 
     */
    private final Integer diskSizeGb;
    /**
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * 
     */
    private final String diskType;

    @CustomType.Constructor
    private LocalDiskResponse(
        @CustomType.Parameter("diskCount") Integer diskCount,
        @CustomType.Parameter("diskSizeGb") Integer diskSizeGb,
        @CustomType.Parameter("diskType") String diskType) {
        this.diskCount = diskCount;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
    }

    /**
     * Specifies the number of such disks.
     * 
    */
    public Integer diskCount() {
        return this.diskCount;
    }
    /**
     * Specifies the size of the disk in base-2 GB.
     * 
    */
    public Integer diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * 
    */
    public String diskType() {
        return this.diskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer diskCount;
        private Integer diskSizeGb;
        private String diskType;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskCount = defaults.diskCount;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
        }

        public Builder diskCount(Integer diskCount) {
            this.diskCount = Objects.requireNonNull(diskCount);
            return this;
        }
        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }        public LocalDiskResponse build() {
            return new LocalDiskResponse(diskCount, diskSizeGb, diskType);
        }
    }
}
