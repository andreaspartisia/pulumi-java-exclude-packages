// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebhookArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookArgs Empty = new WebhookArgs();

    /**
     * The unique ID for an Amplify app.
     * 
     */
    @InputImport(name="appId", required=true)
      private final Input<String> appId;

    public Input<String> getAppId() {
        return this.appId;
    }

    /**
     * The name for a branch that is part of the Amplify app.
     * 
     */
    @InputImport(name="branchName", required=true)
      private final Input<String> branchName;

    public Input<String> getBranchName() {
        return this.branchName;
    }

    /**
     * The description for a webhook.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    public WebhookArgs(
        Input<String> appId,
        Input<String> branchName,
        @Nullable Input<String> description) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.branchName = Objects.requireNonNull(branchName, "expected parameter 'branchName' to be non-null");
        this.description = description;
    }

    private WebhookArgs() {
        this.appId = Input.empty();
        this.branchName = Input.empty();
        this.description = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appId;
        private Input<String> branchName;
        private @Nullable Input<String> description;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.branchName = defaults.branchName;
    	      this.description = defaults.description;
        }

        public Builder setAppId(Input<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppId(String appId) {
            this.appId = Input.of(Objects.requireNonNull(appId));
            return this;
        }

        public Builder setBranchName(Input<String> branchName) {
            this.branchName = Objects.requireNonNull(branchName);
            return this;
        }

        public Builder setBranchName(String branchName) {
            this.branchName = Input.of(Objects.requireNonNull(branchName));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }
        public WebhookArgs build() {
            return new WebhookArgs(appId, branchName, description);
        }
    }
}