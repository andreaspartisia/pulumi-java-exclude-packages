// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.ErrorDetailResponse;
import io.pulumi.azurenative.recoveryservices.inputs.WorkloadInquiryDetailsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InquiryInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final InquiryInfoResponse Empty = new InquiryInfoResponse();

    @InputImport(name="errorDetail")
    private final @Nullable ErrorDetailResponse errorDetail;

    public Optional<ErrorDetailResponse> getErrorDetail() {
        return this.errorDetail == null ? Optional.empty() : Optional.ofNullable(this.errorDetail);
    }

    @InputImport(name="inquiryDetails")
    private final @Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails;

    public List<WorkloadInquiryDetailsResponse> getInquiryDetails() {
        return this.inquiryDetails == null ? List.of() : this.inquiryDetails;
    }

    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public InquiryInfoResponse(
        @Nullable ErrorDetailResponse errorDetail,
        @Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails,
        @Nullable String status) {
        this.errorDetail = errorDetail;
        this.inquiryDetails = inquiryDetails;
        this.status = status;
    }

    private InquiryInfoResponse() {
        this.errorDetail = null;
        this.inquiryDetails = List.of();
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InquiryInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ErrorDetailResponse errorDetail;
        private @Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(InquiryInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorDetail = defaults.errorDetail;
    	      this.inquiryDetails = defaults.inquiryDetails;
    	      this.status = defaults.status;
        }

        public Builder setErrorDetail(@Nullable ErrorDetailResponse errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        public Builder setInquiryDetails(@Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails) {
            this.inquiryDetails = inquiryDetails;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public InquiryInfoResponse build() {
            return new InquiryInfoResponse(errorDetail, inquiryDetails, status);
        }
    }
}