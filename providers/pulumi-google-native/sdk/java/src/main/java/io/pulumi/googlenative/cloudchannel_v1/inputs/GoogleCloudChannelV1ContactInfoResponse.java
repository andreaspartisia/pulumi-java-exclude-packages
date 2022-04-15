// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contact information for a customer account.
 * 
 */
public final class GoogleCloudChannelV1ContactInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudChannelV1ContactInfoResponse Empty = new GoogleCloudChannelV1ContactInfoResponse();

    /**
     * The customer account contact's display name, formatted as a combination of the customer's first and last name.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * The customer account's contact email. Required for entitlements that create admin.google.com accounts, and serves as the customer's username for those accounts. Use this email to invite Team customers.
     * 
     */
    @Import(name="email", required=true)
      private final String email;

    public String email() {
        return this.email;
    }

    /**
     * The customer account contact's first name. Optional for Team customers.
     * 
     */
    @Import(name="firstName", required=true)
      private final String firstName;

    public String firstName() {
        return this.firstName;
    }

    /**
     * The customer account contact's last name. Optional for Team customers.
     * 
     */
    @Import(name="lastName", required=true)
      private final String lastName;

    public String lastName() {
        return this.lastName;
    }

    /**
     * The customer account's contact phone number.
     * 
     */
    @Import(name="phone", required=true)
      private final String phone;

    public String phone() {
        return this.phone;
    }

    /**
     * Optional. The customer account contact's job title.
     * 
     */
    @Import(name="title", required=true)
      private final String title;

    public String title() {
        return this.title;
    }

    public GoogleCloudChannelV1ContactInfoResponse(
        String displayName,
        String email,
        String firstName,
        String lastName,
        String phone,
        String title) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.firstName = Objects.requireNonNull(firstName, "expected parameter 'firstName' to be non-null");
        this.lastName = Objects.requireNonNull(lastName, "expected parameter 'lastName' to be non-null");
        this.phone = Objects.requireNonNull(phone, "expected parameter 'phone' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudChannelV1ContactInfoResponse() {
        this.displayName = null;
        this.email = null;
        this.firstName = null;
        this.lastName = null;
        this.phone = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1ContactInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String email;
        private String firstName;
        private String lastName;
        private String phone;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1ContactInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.phone = defaults.phone;
    	      this.title = defaults.title;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GoogleCloudChannelV1ContactInfoResponse build() {
            return new GoogleCloudChannelV1ContactInfoResponse(displayName, email, firstName, lastName, phone, title);
        }
    }
}
