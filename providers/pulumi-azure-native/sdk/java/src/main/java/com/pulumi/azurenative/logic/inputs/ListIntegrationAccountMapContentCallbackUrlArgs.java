// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.KeyType;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListIntegrationAccountMapContentCallbackUrlArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListIntegrationAccountMapContentCallbackUrlArgs Empty = new ListIntegrationAccountMapContentCallbackUrlArgs();

    /**
     * The integration account name.
     * 
     */
    @Import(name="integrationAccountName", required=true)
    private String integrationAccountName;

    public String integrationAccountName() {
        return this.integrationAccountName;
    }

    /**
     * The key type.
     * 
     */
    @Import(name="keyType")
    private @Nullable Either<String,KeyType> keyType;

    public Optional<Either<String,KeyType>> keyType() {
        return Optional.ofNullable(this.keyType);
    }

    /**
     * The integration account map name.
     * 
     */
    @Import(name="mapName", required=true)
    private String mapName;

    public String mapName() {
        return this.mapName;
    }

    /**
     * The expiry time.
     * 
     */
    @Import(name="notAfter")
    private @Nullable String notAfter;

    public Optional<String> notAfter() {
        return Optional.ofNullable(this.notAfter);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListIntegrationAccountMapContentCallbackUrlArgs() {}

    private ListIntegrationAccountMapContentCallbackUrlArgs(ListIntegrationAccountMapContentCallbackUrlArgs $) {
        this.integrationAccountName = $.integrationAccountName;
        this.keyType = $.keyType;
        this.mapName = $.mapName;
        this.notAfter = $.notAfter;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListIntegrationAccountMapContentCallbackUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListIntegrationAccountMapContentCallbackUrlArgs $;

        public Builder() {
            $ = new ListIntegrationAccountMapContentCallbackUrlArgs();
        }

        public Builder(ListIntegrationAccountMapContentCallbackUrlArgs defaults) {
            $ = new ListIntegrationAccountMapContentCallbackUrlArgs(Objects.requireNonNull(defaults));
        }

        public Builder integrationAccountName(String integrationAccountName) {
            $.integrationAccountName = integrationAccountName;
            return this;
        }

        public Builder keyType(@Nullable Either<String,KeyType> keyType) {
            $.keyType = keyType;
            return this;
        }

        public Builder keyType(String keyType) {
            return keyType(Either.ofLeft(keyType));
        }

        public Builder keyType(KeyType keyType) {
            return keyType(Either.ofRight(keyType));
        }

        public Builder mapName(String mapName) {
            $.mapName = mapName;
            return this;
        }

        public Builder notAfter(@Nullable String notAfter) {
            $.notAfter = notAfter;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListIntegrationAccountMapContentCallbackUrlArgs build() {
            $.integrationAccountName = Objects.requireNonNull($.integrationAccountName, "expected parameter 'integrationAccountName' to be non-null");
            $.mapName = Objects.requireNonNull($.mapName, "expected parameter 'mapName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
