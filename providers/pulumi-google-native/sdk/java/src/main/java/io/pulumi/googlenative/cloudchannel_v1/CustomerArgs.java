// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GoogleCloudChannelV1ContactInfoArgs;
import io.pulumi.googlenative.cloudchannel_v1.inputs.GoogleTypePostalAddressArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomerArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomerArgs Empty = new CustomerArgs();

    @Import(name="accountId", required=true)
      private final Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Secondary contact email. You need to provide an alternate email to create different domains if a primary contact email already exists. Users will receive a notification with credentials when you create an admin.google.com account. Secondary emails are also recovery email addresses. Alternate emails are optional when you create Team customers.
     * 
     */
    @Import(name="alternateEmail")
      private final @Nullable Output<String> alternateEmail;

    public Output<String> alternateEmail() {
        return this.alternateEmail == null ? Codegen.empty() : this.alternateEmail;
    }

    /**
     * Cloud Identity ID of the customer's channel partner. Populated only if a channel partner exists for this customer.
     * 
     */
    @Import(name="channelPartnerId")
      private final @Nullable Output<String> channelPartnerId;

    public Output<String> channelPartnerId() {
        return this.channelPartnerId == null ? Codegen.empty() : this.channelPartnerId;
    }

    @Import(name="channelPartnerLinkId", required=true)
      private final Output<String> channelPartnerLinkId;

    public Output<String> channelPartnerLinkId() {
        return this.channelPartnerLinkId;
    }

    /**
     * The customer's primary domain. Must match the primary contact email's domain.
     * 
     */
    @Import(name="domain", required=true)
      private final Output<String> domain;

    public Output<String> domain() {
        return this.domain;
    }

    /**
     * Optional. The BCP-47 language code, such as "en-US" or "sr-Latn". For more information, see https://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
     * 
     */
    @Import(name="languageCode")
      private final @Nullable Output<String> languageCode;

    public Output<String> languageCode() {
        return this.languageCode == null ? Codegen.empty() : this.languageCode;
    }

    /**
     * Name of the organization that the customer entity represents.
     * 
     */
    @Import(name="orgDisplayName", required=true)
      private final Output<String> orgDisplayName;

    public Output<String> orgDisplayName() {
        return this.orgDisplayName;
    }

    /**
     * The organization address for the customer. To enforce US laws and embargoes, we require a region and zip code. You must provide valid addresses for every customer. To set the customer's language, use the Customer-level language code.
     * 
     */
    @Import(name="orgPostalAddress", required=true)
      private final Output<GoogleTypePostalAddressArgs> orgPostalAddress;

    public Output<GoogleTypePostalAddressArgs> orgPostalAddress() {
        return this.orgPostalAddress;
    }

    /**
     * Primary contact info.
     * 
     */
    @Import(name="primaryContactInfo")
      private final @Nullable Output<GoogleCloudChannelV1ContactInfoArgs> primaryContactInfo;

    public Output<GoogleCloudChannelV1ContactInfoArgs> primaryContactInfo() {
        return this.primaryContactInfo == null ? Codegen.empty() : this.primaryContactInfo;
    }

    public CustomerArgs(
        Output<String> accountId,
        @Nullable Output<String> alternateEmail,
        @Nullable Output<String> channelPartnerId,
        Output<String> channelPartnerLinkId,
        Output<String> domain,
        @Nullable Output<String> languageCode,
        Output<String> orgDisplayName,
        Output<GoogleTypePostalAddressArgs> orgPostalAddress,
        @Nullable Output<GoogleCloudChannelV1ContactInfoArgs> primaryContactInfo) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.alternateEmail = alternateEmail;
        this.channelPartnerId = channelPartnerId;
        this.channelPartnerLinkId = Objects.requireNonNull(channelPartnerLinkId, "expected parameter 'channelPartnerLinkId' to be non-null");
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.languageCode = languageCode;
        this.orgDisplayName = Objects.requireNonNull(orgDisplayName, "expected parameter 'orgDisplayName' to be non-null");
        this.orgPostalAddress = Objects.requireNonNull(orgPostalAddress, "expected parameter 'orgPostalAddress' to be non-null");
        this.primaryContactInfo = primaryContactInfo;
    }

    private CustomerArgs() {
        this.accountId = Codegen.empty();
        this.alternateEmail = Codegen.empty();
        this.channelPartnerId = Codegen.empty();
        this.channelPartnerLinkId = Codegen.empty();
        this.domain = Codegen.empty();
        this.languageCode = Codegen.empty();
        this.orgDisplayName = Codegen.empty();
        this.orgPostalAddress = Codegen.empty();
        this.primaryContactInfo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountId;
        private @Nullable Output<String> alternateEmail;
        private @Nullable Output<String> channelPartnerId;
        private Output<String> channelPartnerLinkId;
        private Output<String> domain;
        private @Nullable Output<String> languageCode;
        private Output<String> orgDisplayName;
        private Output<GoogleTypePostalAddressArgs> orgPostalAddress;
        private @Nullable Output<GoogleCloudChannelV1ContactInfoArgs> primaryContactInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.alternateEmail = defaults.alternateEmail;
    	      this.channelPartnerId = defaults.channelPartnerId;
    	      this.channelPartnerLinkId = defaults.channelPartnerLinkId;
    	      this.domain = defaults.domain;
    	      this.languageCode = defaults.languageCode;
    	      this.orgDisplayName = defaults.orgDisplayName;
    	      this.orgPostalAddress = defaults.orgPostalAddress;
    	      this.primaryContactInfo = defaults.primaryContactInfo;
        }

        public Builder accountId(Output<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Output.of(Objects.requireNonNull(accountId));
            return this;
        }
        public Builder alternateEmail(@Nullable Output<String> alternateEmail) {
            this.alternateEmail = alternateEmail;
            return this;
        }
        public Builder alternateEmail(@Nullable String alternateEmail) {
            this.alternateEmail = Codegen.ofNullable(alternateEmail);
            return this;
        }
        public Builder channelPartnerId(@Nullable Output<String> channelPartnerId) {
            this.channelPartnerId = channelPartnerId;
            return this;
        }
        public Builder channelPartnerId(@Nullable String channelPartnerId) {
            this.channelPartnerId = Codegen.ofNullable(channelPartnerId);
            return this;
        }
        public Builder channelPartnerLinkId(Output<String> channelPartnerLinkId) {
            this.channelPartnerLinkId = Objects.requireNonNull(channelPartnerLinkId);
            return this;
        }
        public Builder channelPartnerLinkId(String channelPartnerLinkId) {
            this.channelPartnerLinkId = Output.of(Objects.requireNonNull(channelPartnerLinkId));
            return this;
        }
        public Builder domain(Output<String> domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Output.of(Objects.requireNonNull(domain));
            return this;
        }
        public Builder languageCode(@Nullable Output<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public Builder languageCode(@Nullable String languageCode) {
            this.languageCode = Codegen.ofNullable(languageCode);
            return this;
        }
        public Builder orgDisplayName(Output<String> orgDisplayName) {
            this.orgDisplayName = Objects.requireNonNull(orgDisplayName);
            return this;
        }
        public Builder orgDisplayName(String orgDisplayName) {
            this.orgDisplayName = Output.of(Objects.requireNonNull(orgDisplayName));
            return this;
        }
        public Builder orgPostalAddress(Output<GoogleTypePostalAddressArgs> orgPostalAddress) {
            this.orgPostalAddress = Objects.requireNonNull(orgPostalAddress);
            return this;
        }
        public Builder orgPostalAddress(GoogleTypePostalAddressArgs orgPostalAddress) {
            this.orgPostalAddress = Output.of(Objects.requireNonNull(orgPostalAddress));
            return this;
        }
        public Builder primaryContactInfo(@Nullable Output<GoogleCloudChannelV1ContactInfoArgs> primaryContactInfo) {
            this.primaryContactInfo = primaryContactInfo;
            return this;
        }
        public Builder primaryContactInfo(@Nullable GoogleCloudChannelV1ContactInfoArgs primaryContactInfo) {
            this.primaryContactInfo = Codegen.ofNullable(primaryContactInfo);
            return this;
        }        public CustomerArgs build() {
            return new CustomerArgs(accountId, alternateEmail, channelPartnerId, channelPartnerLinkId, domain, languageCode, orgDisplayName, orgPostalAddress, primaryContactInfo);
        }
    }
}
