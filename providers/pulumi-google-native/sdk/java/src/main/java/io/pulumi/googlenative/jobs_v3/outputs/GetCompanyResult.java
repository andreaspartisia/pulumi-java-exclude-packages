// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.jobs_v3.outputs.CompanyDerivedInfoResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCompanyResult {
    /**
     * Optional. The URI to employer's career site or careers page on the employer's web site, for example, "https://careers.google.com".
     * 
     */
    private final String careerSiteUri;
    /**
     * Derived details about the company.
     * 
     */
    private final CompanyDerivedInfoResponse derivedInfo;
    /**
     * The display name of the company, for example, "Google LLC".
     * 
     */
    private final String displayName;
    /**
     * Optional. Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
     * 
     */
    private final String eeoText;
    /**
     * Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
     * 
     */
    private final String externalId;
    /**
     * Optional. The street address of the company's main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
     * 
     */
    private final String headquartersAddress;
    /**
     * Optional. Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
     * 
     */
    private final Boolean hiringAgency;
    /**
     * Optional. A URI that hosts the employer's company logo.
     * 
     */
    private final String imageUri;
    /**
     * Optional. A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword search. Jobs with `string_values` under these specified field keys are returned if any of the values matches the search keyword. Custom field values with parenthesis, brackets and special symbols won't be properly searchable, and those keyword queries need to be surrounded by quotes.
     * 
     */
    private final List<String> keywordSearchableJobCustomAttributes;
    /**
     * Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
     * 
     */
    private final String name;
    /**
     * Optional. The employer's company size.
     * 
     */
    private final String size;
    /**
     * Indicates whether a company is flagged to be suspended from public availability by the service when job content appears suspicious, abusive, or spammy.
     * 
     */
    private final Boolean suspended;
    /**
     * Optional. The URI representing the company's primary web site or home page, for example, "https://www.google.com". The maximum number of allowed characters is 255.
     * 
     */
    private final String websiteUri;

    @CustomType.Constructor
    private GetCompanyResult(
        @CustomType.Parameter("careerSiteUri") String careerSiteUri,
        @CustomType.Parameter("derivedInfo") CompanyDerivedInfoResponse derivedInfo,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("eeoText") String eeoText,
        @CustomType.Parameter("externalId") String externalId,
        @CustomType.Parameter("headquartersAddress") String headquartersAddress,
        @CustomType.Parameter("hiringAgency") Boolean hiringAgency,
        @CustomType.Parameter("imageUri") String imageUri,
        @CustomType.Parameter("keywordSearchableJobCustomAttributes") List<String> keywordSearchableJobCustomAttributes,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("size") String size,
        @CustomType.Parameter("suspended") Boolean suspended,
        @CustomType.Parameter("websiteUri") String websiteUri) {
        this.careerSiteUri = careerSiteUri;
        this.derivedInfo = derivedInfo;
        this.displayName = displayName;
        this.eeoText = eeoText;
        this.externalId = externalId;
        this.headquartersAddress = headquartersAddress;
        this.hiringAgency = hiringAgency;
        this.imageUri = imageUri;
        this.keywordSearchableJobCustomAttributes = keywordSearchableJobCustomAttributes;
        this.name = name;
        this.size = size;
        this.suspended = suspended;
        this.websiteUri = websiteUri;
    }

    /**
     * Optional. The URI to employer's career site or careers page on the employer's web site, for example, "https://careers.google.com".
     * 
    */
    public String careerSiteUri() {
        return this.careerSiteUri;
    }
    /**
     * Derived details about the company.
     * 
    */
    public CompanyDerivedInfoResponse derivedInfo() {
        return this.derivedInfo;
    }
    /**
     * The display name of the company, for example, "Google LLC".
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * Optional. Equal Employment Opportunity legal disclaimer text to be associated with all jobs, and typically to be displayed in all roles. The maximum number of allowed characters is 500.
     * 
    */
    public String eeoText() {
        return this.eeoText;
    }
    /**
     * Client side company identifier, used to uniquely identify the company. The maximum number of allowed characters is 255.
     * 
    */
    public String externalId() {
        return this.externalId;
    }
    /**
     * Optional. The street address of the company's main headquarters, which may be different from the job location. The service attempts to geolocate the provided address, and populates a more specific location wherever possible in DerivedInfo.headquarters_location.
     * 
    */
    public String headquartersAddress() {
        return this.headquartersAddress;
    }
    /**
     * Optional. Set to true if it is the hiring agency that post jobs for other employers. Defaults to false if not provided.
     * 
    */
    public Boolean hiringAgency() {
        return this.hiringAgency;
    }
    /**
     * Optional. A URI that hosts the employer's company logo.
     * 
    */
    public String imageUri() {
        return this.imageUri;
    }
    /**
     * Optional. A list of keys of filterable Job.custom_attributes, whose corresponding `string_values` are used in keyword search. Jobs with `string_values` under these specified field keys are returned if any of the values matches the search keyword. Custom field values with parenthesis, brackets and special symbols won't be properly searchable, and those keyword queries need to be surrounded by quotes.
     * 
    */
    public List<String> keywordSearchableJobCustomAttributes() {
        return this.keywordSearchableJobCustomAttributes;
    }
    /**
     * Required during company update. The resource name for a company. This is generated by the service when a company is created. The format is "projects/{project_id}/companies/{company_id}", for example, "projects/api-test-project/companies/foo".
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Optional. The employer's company size.
     * 
    */
    public String size() {
        return this.size;
    }
    /**
     * Indicates whether a company is flagged to be suspended from public availability by the service when job content appears suspicious, abusive, or spammy.
     * 
    */
    public Boolean suspended() {
        return this.suspended;
    }
    /**
     * Optional. The URI representing the company's primary web site or home page, for example, "https://www.google.com". The maximum number of allowed characters is 255.
     * 
    */
    public String websiteUri() {
        return this.websiteUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCompanyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String careerSiteUri;
        private CompanyDerivedInfoResponse derivedInfo;
        private String displayName;
        private String eeoText;
        private String externalId;
        private String headquartersAddress;
        private Boolean hiringAgency;
        private String imageUri;
        private List<String> keywordSearchableJobCustomAttributes;
        private String name;
        private String size;
        private Boolean suspended;
        private String websiteUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCompanyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.careerSiteUri = defaults.careerSiteUri;
    	      this.derivedInfo = defaults.derivedInfo;
    	      this.displayName = defaults.displayName;
    	      this.eeoText = defaults.eeoText;
    	      this.externalId = defaults.externalId;
    	      this.headquartersAddress = defaults.headquartersAddress;
    	      this.hiringAgency = defaults.hiringAgency;
    	      this.imageUri = defaults.imageUri;
    	      this.keywordSearchableJobCustomAttributes = defaults.keywordSearchableJobCustomAttributes;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.suspended = defaults.suspended;
    	      this.websiteUri = defaults.websiteUri;
        }

        public Builder careerSiteUri(String careerSiteUri) {
            this.careerSiteUri = Objects.requireNonNull(careerSiteUri);
            return this;
        }
        public Builder derivedInfo(CompanyDerivedInfoResponse derivedInfo) {
            this.derivedInfo = Objects.requireNonNull(derivedInfo);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder eeoText(String eeoText) {
            this.eeoText = Objects.requireNonNull(eeoText);
            return this;
        }
        public Builder externalId(String externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }
        public Builder headquartersAddress(String headquartersAddress) {
            this.headquartersAddress = Objects.requireNonNull(headquartersAddress);
            return this;
        }
        public Builder hiringAgency(Boolean hiringAgency) {
            this.hiringAgency = Objects.requireNonNull(hiringAgency);
            return this;
        }
        public Builder imageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }
        public Builder keywordSearchableJobCustomAttributes(List<String> keywordSearchableJobCustomAttributes) {
            this.keywordSearchableJobCustomAttributes = Objects.requireNonNull(keywordSearchableJobCustomAttributes);
            return this;
        }
        public Builder keywordSearchableJobCustomAttributes(String... keywordSearchableJobCustomAttributes) {
            return keywordSearchableJobCustomAttributes(List.of(keywordSearchableJobCustomAttributes));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder size(String size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder suspended(Boolean suspended) {
            this.suspended = Objects.requireNonNull(suspended);
            return this;
        }
        public Builder websiteUri(String websiteUri) {
            this.websiteUri = Objects.requireNonNull(websiteUri);
            return this;
        }        public GetCompanyResult build() {
            return new GetCompanyResult(careerSiteUri, derivedInfo, displayName, eeoText, externalId, headquartersAddress, hiringAgency, imageUri, keywordSearchableJobCustomAttributes, name, size, suspended, websiteUri);
        }
    }
}
