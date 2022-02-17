// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerWebhookConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerWebhookConfigArgs Empty = new TriggerWebhookConfigArgs();

    /**
     * Secrets to decrypt using Cloud Key Management Service.
     * Structure is documented below.
     * 
     */
    @InputImport(name="secret", required=true)
    private final Input<String> secret;

    public Input<String> getSecret() {
        return this.secret;
    }

    /**
     * - 
     * Potential issues with the underlying Pub/Sub subscription configuration.
     * Only populated on get requests.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public TriggerWebhookConfigArgs(
        Input<String> secret,
        @Nullable Input<String> state) {
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
        this.state = state;
    }

    private TriggerWebhookConfigArgs() {
        this.secret = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerWebhookConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> secret;
        private @Nullable Input<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerWebhookConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secret = defaults.secret;
    	      this.state = defaults.state;
        }

        public Builder setSecret(Input<String> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Input.of(Objects.requireNonNull(secret));
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public TriggerWebhookConfigArgs build() {
            return new TriggerWebhookConfigArgs(secret, state);
        }
    }
}