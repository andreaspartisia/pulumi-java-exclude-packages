// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OspGateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSubscriptionsSubscriptionCollectionItemBillingAddress {
    /**
     * @return Address identifier.
     * 
     */
    private final String addressKey;
    /**
     * @return Name of the city.
     * 
     */
    private final String city;
    /**
     * @return Name of the customer company.
     * 
     */
    private final String companyName;
    /**
     * @return Country of the address.
     * 
     */
    private final String country;
    /**
     * @return The email address of the paypal user.
     * 
     */
    private final String emailAddress;
    /**
     * @return First name of the paypal user.
     * 
     */
    private final String firstName;
    /**
     * @return Last name of the paypal user.
     * 
     */
    private final String lastName;
    /**
     * @return Address line 1.
     * 
     */
    private final String line1;
    /**
     * @return Address line 2.
     * 
     */
    private final String line2;
    /**
     * @return Post code of the address.
     * 
     */
    private final String postalCode;
    /**
     * @return State of the address.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetSubscriptionsSubscriptionCollectionItemBillingAddress(
        @CustomType.Parameter("addressKey") String addressKey,
        @CustomType.Parameter("city") String city,
        @CustomType.Parameter("companyName") String companyName,
        @CustomType.Parameter("country") String country,
        @CustomType.Parameter("emailAddress") String emailAddress,
        @CustomType.Parameter("firstName") String firstName,
        @CustomType.Parameter("lastName") String lastName,
        @CustomType.Parameter("line1") String line1,
        @CustomType.Parameter("line2") String line2,
        @CustomType.Parameter("postalCode") String postalCode,
        @CustomType.Parameter("state") String state) {
        this.addressKey = addressKey;
        this.city = city;
        this.companyName = companyName;
        this.country = country;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
    }

    /**
     * @return Address identifier.
     * 
     */
    public String addressKey() {
        return this.addressKey;
    }
    /**
     * @return Name of the city.
     * 
     */
    public String city() {
        return this.city;
    }
    /**
     * @return Name of the customer company.
     * 
     */
    public String companyName() {
        return this.companyName;
    }
    /**
     * @return Country of the address.
     * 
     */
    public String country() {
        return this.country;
    }
    /**
     * @return The email address of the paypal user.
     * 
     */
    public String emailAddress() {
        return this.emailAddress;
    }
    /**
     * @return First name of the paypal user.
     * 
     */
    public String firstName() {
        return this.firstName;
    }
    /**
     * @return Last name of the paypal user.
     * 
     */
    public String lastName() {
        return this.lastName;
    }
    /**
     * @return Address line 1.
     * 
     */
    public String line1() {
        return this.line1;
    }
    /**
     * @return Address line 2.
     * 
     */
    public String line2() {
        return this.line2;
    }
    /**
     * @return Post code of the address.
     * 
     */
    public String postalCode() {
        return this.postalCode;
    }
    /**
     * @return State of the address.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionsSubscriptionCollectionItemBillingAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressKey;
        private String city;
        private String companyName;
        private String country;
        private String emailAddress;
        private String firstName;
        private String lastName;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionsSubscriptionCollectionItemBillingAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressKey = defaults.addressKey;
    	      this.city = defaults.city;
    	      this.companyName = defaults.companyName;
    	      this.country = defaults.country;
    	      this.emailAddress = defaults.emailAddress;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.line1 = defaults.line1;
    	      this.line2 = defaults.line2;
    	      this.postalCode = defaults.postalCode;
    	      this.state = defaults.state;
        }

        public Builder addressKey(String addressKey) {
            this.addressKey = Objects.requireNonNull(addressKey);
            return this;
        }
        public Builder city(String city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }
        public Builder companyName(String companyName) {
            this.companyName = Objects.requireNonNull(companyName);
            return this;
        }
        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
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
        public Builder line1(String line1) {
            this.line1 = Objects.requireNonNull(line1);
            return this;
        }
        public Builder line2(String line2) {
            this.line2 = Objects.requireNonNull(line2);
            return this;
        }
        public Builder postalCode(String postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetSubscriptionsSubscriptionCollectionItemBillingAddress build() {
            return new GetSubscriptionsSubscriptionCollectionItemBillingAddress(addressKey, city, companyName, country, emailAddress, firstName, lastName, line1, line2, postalCode, state);
        }
    }
}
