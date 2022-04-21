// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.enums.ActiveRevisionsMode;
import com.pulumi.azurenative.web.inputs.IngressArgs;
import com.pulumi.azurenative.web.inputs.RegistryCredentialsArgs;
import com.pulumi.azurenative.web.inputs.SecretArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Non versioned Container App configuration properties that define the mutable settings of a Container app
 * 
 */
public final class ConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationArgs Empty = new ConfigurationArgs();

    /**
     * ActiveRevisionsMode controls how active revisions are handled for the Container app:
     * &lt;list&gt;&lt;item&gt;Multiple: multiple revisions can be active. If no value if provided, this is the default&lt;/item&gt;&lt;item&gt;Single: Only one revision can be active at a time. Revision weights can not be used in this mode&lt;/item&gt;&lt;/list&gt;
     * 
     */
    @Import(name="activeRevisionsMode")
    private @Nullable Output<Either<String,ActiveRevisionsMode>> activeRevisionsMode;

    public Optional<Output<Either<String,ActiveRevisionsMode>>> activeRevisionsMode() {
        return Optional.ofNullable(this.activeRevisionsMode);
    }

    /**
     * Ingress configurations.
     * 
     */
    @Import(name="ingress")
    private @Nullable Output<IngressArgs> ingress;

    public Optional<Output<IngressArgs>> ingress() {
        return Optional.ofNullable(this.ingress);
    }

    /**
     * Collection of private container registry credentials for containers used by the Container app
     * 
     */
    @Import(name="registries")
    private @Nullable Output<List<RegistryCredentialsArgs>> registries;

    public Optional<Output<List<RegistryCredentialsArgs>>> registries() {
        return Optional.ofNullable(this.registries);
    }

    /**
     * Collection of secrets used by a Container app
     * 
     */
    @Import(name="secrets")
    private @Nullable Output<List<SecretArgs>> secrets;

    public Optional<Output<List<SecretArgs>>> secrets() {
        return Optional.ofNullable(this.secrets);
    }

    private ConfigurationArgs() {}

    private ConfigurationArgs(ConfigurationArgs $) {
        this.activeRevisionsMode = $.activeRevisionsMode;
        this.ingress = $.ingress;
        this.registries = $.registries;
        this.secrets = $.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationArgs $;

        public Builder() {
            $ = new ConfigurationArgs();
        }

        public Builder(ConfigurationArgs defaults) {
            $ = new ConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder activeRevisionsMode(@Nullable Output<Either<String,ActiveRevisionsMode>> activeRevisionsMode) {
            $.activeRevisionsMode = activeRevisionsMode;
            return this;
        }

        public Builder activeRevisionsMode(Either<String,ActiveRevisionsMode> activeRevisionsMode) {
            return activeRevisionsMode(Output.of(activeRevisionsMode));
        }

        public Builder activeRevisionsMode(String activeRevisionsMode) {
            return activeRevisionsMode(Either.ofLeft(activeRevisionsMode));
        }

        public Builder activeRevisionsMode(ActiveRevisionsMode activeRevisionsMode) {
            return activeRevisionsMode(Either.ofRight(activeRevisionsMode));
        }

        public Builder ingress(@Nullable Output<IngressArgs> ingress) {
            $.ingress = ingress;
            return this;
        }

        public Builder ingress(IngressArgs ingress) {
            return ingress(Output.of(ingress));
        }

        public Builder registries(@Nullable Output<List<RegistryCredentialsArgs>> registries) {
            $.registries = registries;
            return this;
        }

        public Builder registries(List<RegistryCredentialsArgs> registries) {
            return registries(Output.of(registries));
        }

        public Builder registries(RegistryCredentialsArgs... registries) {
            return registries(List.of(registries));
        }

        public Builder secrets(@Nullable Output<List<SecretArgs>> secrets) {
            $.secrets = secrets;
            return this;
        }

        public Builder secrets(List<SecretArgs> secrets) {
            return secrets(Output.of(secrets));
        }

        public Builder secrets(SecretArgs... secrets) {
            return secrets(List.of(secrets));
        }

        public ConfigurationArgs build() {
            return $;
        }
    }

}
