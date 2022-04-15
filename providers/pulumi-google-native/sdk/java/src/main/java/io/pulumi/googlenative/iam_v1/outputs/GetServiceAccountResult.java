// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceAccountResult {
    /**
     * Optional. A user-specified, human-readable description of the service account. The maximum length is 256 UTF-8 bytes.
     * 
     */
    private final String description;
    /**
     * Whether the service account is disabled.
     * 
     */
    private final Boolean disabled;
    /**
     * Optional. A user-specified, human-readable name for the service account. The maximum length is 100 UTF-8 bytes.
     * 
     */
    private final String displayName;
    /**
     * The email address of the service account.
     * 
     */
    private final String email;
    /**
     * The resource name of the service account. Use one of the following formats: * `projects/{PROJECT_ID}/serviceAccounts/{EMAIL_ADDRESS}` * `projects/{PROJECT_ID}/serviceAccounts/{UNIQUE_ID}` As an alternative, you can use the `-` wildcard character instead of the project ID: * `projects/-/serviceAccounts/{EMAIL_ADDRESS}` * `projects/-/serviceAccounts/{UNIQUE_ID}` When possible, avoid using the `-` wildcard character, because it can cause response messages to contain misleading error codes. For example, if you try to get the service account `projects/-/serviceAccounts/fake@example.com`, which does not exist, the response contains an HTTP `403 Forbidden` error instead of a `404 Not Found` error.
     * 
     */
    private final String name;
    /**
     * The OAuth 2.0 client ID for the service account.
     * 
     */
    private final String oauth2ClientId;
    /**
     * The ID of the project that owns the service account.
     * 
     */
    private final String project;
    /**
     * The unique, stable numeric ID for the service account. Each service account retains its unique ID even if you delete the service account. For example, if you delete a service account, then create a new service account with the same name, the new service account has a different unique ID than the deleted service account.
     * 
     */
    private final String uniqueId;

    @CustomType.Constructor
    private GetServiceAccountResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("disabled") Boolean disabled,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("oauth2ClientId") String oauth2ClientId,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("uniqueId") String uniqueId) {
        this.description = description;
        this.disabled = disabled;
        this.displayName = displayName;
        this.email = email;
        this.name = name;
        this.oauth2ClientId = oauth2ClientId;
        this.project = project;
        this.uniqueId = uniqueId;
    }

    /**
     * Optional. A user-specified, human-readable description of the service account. The maximum length is 256 UTF-8 bytes.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Whether the service account is disabled.
     * 
    */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * Optional. A user-specified, human-readable name for the service account. The maximum length is 100 UTF-8 bytes.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * The email address of the service account.
     * 
    */
    public String email() {
        return this.email;
    }
    /**
     * The resource name of the service account. Use one of the following formats: * `projects/{PROJECT_ID}/serviceAccounts/{EMAIL_ADDRESS}` * `projects/{PROJECT_ID}/serviceAccounts/{UNIQUE_ID}` As an alternative, you can use the `-` wildcard character instead of the project ID: * `projects/-/serviceAccounts/{EMAIL_ADDRESS}` * `projects/-/serviceAccounts/{UNIQUE_ID}` When possible, avoid using the `-` wildcard character, because it can cause response messages to contain misleading error codes. For example, if you try to get the service account `projects/-/serviceAccounts/fake@example.com`, which does not exist, the response contains an HTTP `403 Forbidden` error instead of a `404 Not Found` error.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The OAuth 2.0 client ID for the service account.
     * 
    */
    public String oauth2ClientId() {
        return this.oauth2ClientId;
    }
    /**
     * The ID of the project that owns the service account.
     * 
    */
    public String project() {
        return this.project;
    }
    /**
     * The unique, stable numeric ID for the service account. Each service account retains its unique ID even if you delete the service account. For example, if you delete a service account, then create a new service account with the same name, the new service account has a different unique ID than the deleted service account.
     * 
    */
    public String uniqueId() {
        return this.uniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private Boolean disabled;
        private String displayName;
        private String email;
        private String name;
        private String oauth2ClientId;
        private String project;
        private String uniqueId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.email = defaults.email;
    	      this.name = defaults.name;
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.project = defaults.project;
    	      this.uniqueId = defaults.uniqueId;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder oauth2ClientId(String oauth2ClientId) {
            this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder uniqueId(String uniqueId) {
            this.uniqueId = Objects.requireNonNull(uniqueId);
            return this;
        }        public GetServiceAccountResult build() {
            return new GetServiceAccountResult(description, disabled, displayName, email, name, oauth2ClientId, project, uniqueId);
        }
    }
}
