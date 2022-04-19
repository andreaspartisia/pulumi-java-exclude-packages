// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Details for the storage account.
 * 
 */
public final class StorageAccountDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final StorageAccountDetailsResponse Empty = new StorageAccountDetailsResponse();

    /**
     * Account Type of the data to be transferred.
     * Expected value is 'StorageAccount'.
     * 
     */
    @Import(name="dataAccountType", required=true)
      private final String dataAccountType;

    public String dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Storage Account Resource Id.
     * 
     */
    @Import(name="storageAccountId", required=true)
      private final String storageAccountId;

    public String storageAccountId() {
        return this.storageAccountId;
    }

    public StorageAccountDetailsResponse(
        String dataAccountType,
        String storageAccountId) {
        this.dataAccountType = Codegen.stringProp("dataAccountType").arg(dataAccountType).def("StorageAccount").require();
        this.storageAccountId = Objects.requireNonNull(storageAccountId, "expected parameter 'storageAccountId' to be non-null");
    }

    private StorageAccountDetailsResponse() {
        this.dataAccountType = null;
        this.storageAccountId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataAccountType;
        private String storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder dataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }
        public Builder storageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }        public StorageAccountDetailsResponse build() {
            return new StorageAccountDetailsResponse(dataAccountType, storageAccountId);
        }
    }
}
