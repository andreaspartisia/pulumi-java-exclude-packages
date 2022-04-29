// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAuditArchiveRetrievalArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuditArchiveRetrievalArgs Empty = new GetAuditArchiveRetrievalArgs();

    /**
     * OCID of the archive retrieval.
     * 
     */
    @Import(name="auditArchiveRetrievalId", required=true)
    private String auditArchiveRetrievalId;

    /**
     * @return OCID of the archive retrieval.
     * 
     */
    public String auditArchiveRetrievalId() {
        return this.auditArchiveRetrievalId;
    }

    private GetAuditArchiveRetrievalArgs() {}

    private GetAuditArchiveRetrievalArgs(GetAuditArchiveRetrievalArgs $) {
        this.auditArchiveRetrievalId = $.auditArchiveRetrievalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuditArchiveRetrievalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuditArchiveRetrievalArgs $;

        public Builder() {
            $ = new GetAuditArchiveRetrievalArgs();
        }

        public Builder(GetAuditArchiveRetrievalArgs defaults) {
            $ = new GetAuditArchiveRetrievalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auditArchiveRetrievalId OCID of the archive retrieval.
         * 
         * @return builder
         * 
         */
        public Builder auditArchiveRetrievalId(String auditArchiveRetrievalId) {
            $.auditArchiveRetrievalId = auditArchiveRetrievalId;
            return this;
        }

        public GetAuditArchiveRetrievalArgs build() {
            $.auditArchiveRetrievalId = Objects.requireNonNull($.auditArchiveRetrievalId, "expected parameter 'auditArchiveRetrievalId' to be non-null");
            return $;
        }
    }

}
