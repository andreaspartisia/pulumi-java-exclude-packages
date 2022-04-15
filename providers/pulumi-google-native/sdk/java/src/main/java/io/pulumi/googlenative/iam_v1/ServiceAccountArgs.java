// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAccountArgs Empty = new ServiceAccountArgs();

    /**
     * The account id that is used to generate the service account email address and a stable unique id. It is unique within a project, must be 6-30 characters long, and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])` to comply with RFC1035.
     * 
     */
    @Import(name="accountId", required=true)
      private final Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * Optional. A user-specified, human-readable description of the service account. The maximum length is 256 UTF-8 bytes.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Optional. A user-specified, human-readable name for the service account. The maximum length is 100 UTF-8 bytes.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The resource name of the service account. Use one of the following formats: * `projects/{PROJECT_ID}/serviceAccounts/{EMAIL_ADDRESS}` * `projects/{PROJECT_ID}/serviceAccounts/{UNIQUE_ID}` As an alternative, you can use the `-` wildcard character instead of the project ID: * `projects/-/serviceAccounts/{EMAIL_ADDRESS}` * `projects/-/serviceAccounts/{UNIQUE_ID}` When possible, avoid using the `-` wildcard character, because it can cause response messages to contain misleading error codes. For example, if you try to get the service account `projects/-/serviceAccounts/fake@example.com`, which does not exist, the response contains an HTTP `403 Forbidden` error instead of a `404 Not Found` error.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public ServiceAccountArgs(
        Output<String> accountId,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.project = project;
    }

    private ServiceAccountArgs() {
        this.accountId = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder accountId(Output<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Output.of(Objects.requireNonNull(accountId));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public ServiceAccountArgs build() {
            return new ServiceAccountArgs(accountId, description, displayName, name, project);
        }
    }
}
