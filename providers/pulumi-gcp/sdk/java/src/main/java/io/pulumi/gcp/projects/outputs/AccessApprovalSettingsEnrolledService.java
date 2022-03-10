// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessApprovalSettingsEnrolledService {
    /**
     * The product for which Access Approval will be enrolled. Allowed values are listed (case-sensitive):
     * all
     * appengine.googleapis.com
     * bigquery.googleapis.com
     * bigtable.googleapis.com
     * cloudkms.googleapis.com
     * compute.googleapis.com
     * dataflow.googleapis.com
     * iam.googleapis.com
     * pubsub.googleapis.com
     * storage.googleapis.com
     * 
     */
    private final String cloudProduct;
    /**
     * The enrollment level of the service.
     * Default value is `BLOCK_ALL`.
     * Possible values are `BLOCK_ALL`.
     * 
     */
    private final @Nullable String enrollmentLevel;

    @OutputCustomType.Constructor
    private AccessApprovalSettingsEnrolledService(
        @OutputCustomType.Parameter("cloudProduct") String cloudProduct,
        @OutputCustomType.Parameter("enrollmentLevel") @Nullable String enrollmentLevel) {
        this.cloudProduct = cloudProduct;
        this.enrollmentLevel = enrollmentLevel;
    }

    /**
     * The product for which Access Approval will be enrolled. Allowed values are listed (case-sensitive):
     * all
     * appengine.googleapis.com
     * bigquery.googleapis.com
     * bigtable.googleapis.com
     * cloudkms.googleapis.com
     * compute.googleapis.com
     * dataflow.googleapis.com
     * iam.googleapis.com
     * pubsub.googleapis.com
     * storage.googleapis.com
     * 
    */
    public String getCloudProduct() {
        return this.cloudProduct;
    }
    /**
     * The enrollment level of the service.
     * Default value is `BLOCK_ALL`.
     * Possible values are `BLOCK_ALL`.
     * 
    */
    public Optional<String> getEnrollmentLevel() {
        return Optional.ofNullable(this.enrollmentLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApprovalSettingsEnrolledService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudProduct;
        private @Nullable String enrollmentLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessApprovalSettingsEnrolledService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudProduct = defaults.cloudProduct;
    	      this.enrollmentLevel = defaults.enrollmentLevel;
        }

        public Builder setCloudProduct(String cloudProduct) {
            this.cloudProduct = Objects.requireNonNull(cloudProduct);
            return this;
        }

        public Builder setEnrollmentLevel(@Nullable String enrollmentLevel) {
            this.enrollmentLevel = enrollmentLevel;
            return this;
        }
        public AccessApprovalSettingsEnrolledService build() {
            return new AccessApprovalSettingsEnrolledService(cloudProduct, enrollmentLevel);
        }
    }
}
