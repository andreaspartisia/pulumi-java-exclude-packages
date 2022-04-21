// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.AccountEncryptionKeyType;
import com.pulumi.azurenative.media.inputs.KeyVaultPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountEncryptionArgs Empty = new AccountEncryptionArgs();

    /**
     * The properties of the key used to encrypt the account.
     * 
     */
    @Import(name="keyVaultProperties")
    private @Nullable Output<KeyVaultPropertiesArgs> keyVaultProperties;

    public Optional<Output<KeyVaultPropertiesArgs>> keyVaultProperties() {
        return Optional.ofNullable(this.keyVaultProperties);
    }

    /**
     * The type of key used to encrypt the Account Key.
     * 
     */
    @Import(name="type", required=true)
    private Output<Either<String,AccountEncryptionKeyType>> type;

    public Output<Either<String,AccountEncryptionKeyType>> type() {
        return this.type;
    }

    private AccountEncryptionArgs() {}

    private AccountEncryptionArgs(AccountEncryptionArgs $) {
        this.keyVaultProperties = $.keyVaultProperties;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountEncryptionArgs $;

        public Builder() {
            $ = new AccountEncryptionArgs();
        }

        public Builder(AccountEncryptionArgs defaults) {
            $ = new AccountEncryptionArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyVaultProperties(@Nullable Output<KeyVaultPropertiesArgs> keyVaultProperties) {
            $.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public Builder keyVaultProperties(KeyVaultPropertiesArgs keyVaultProperties) {
            return keyVaultProperties(Output.of(keyVaultProperties));
        }

        public Builder type(Output<Either<String,AccountEncryptionKeyType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,AccountEncryptionKeyType> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(AccountEncryptionKeyType type) {
            return type(Either.ofRight(type));
        }

        public AccountEncryptionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
