// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.ContentKeyPolicyPlayReadyContentType;
import io.pulumi.azurenative.media.enums.ContentKeyPolicyPlayReadyLicenseType;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs;
import io.pulumi.azurenative.media.inputs.ContentKeyPolicyPlayReadyPlayRightArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContentKeyPolicyPlayReadyLicenseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyPlayReadyLicenseArgs Empty = new ContentKeyPolicyPlayReadyLicenseArgs();

    @InputImport(name="allowTestDevices", required=true)
    private final Input<Boolean> allowTestDevices;

    public Input<Boolean> getAllowTestDevices() {
        return this.allowTestDevices;
    }

    @InputImport(name="beginDate")
    private final @Nullable Input<String> beginDate;

    public Input<String> getBeginDate() {
        return this.beginDate == null ? Input.empty() : this.beginDate;
    }

    @InputImport(name="contentKeyLocation", required=true)
    private final Input<Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs>> contentKeyLocation;

    public Input<Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs>> getContentKeyLocation() {
        return this.contentKeyLocation;
    }

    @InputImport(name="contentType", required=true)
    private final Input<Either<String,ContentKeyPolicyPlayReadyContentType>> contentType;

    public Input<Either<String,ContentKeyPolicyPlayReadyContentType>> getContentType() {
        return this.contentType;
    }

    @InputImport(name="expirationDate")
    private final @Nullable Input<String> expirationDate;

    public Input<String> getExpirationDate() {
        return this.expirationDate == null ? Input.empty() : this.expirationDate;
    }

    @InputImport(name="gracePeriod")
    private final @Nullable Input<String> gracePeriod;

    public Input<String> getGracePeriod() {
        return this.gracePeriod == null ? Input.empty() : this.gracePeriod;
    }

    @InputImport(name="licenseType", required=true)
    private final Input<Either<String,ContentKeyPolicyPlayReadyLicenseType>> licenseType;

    public Input<Either<String,ContentKeyPolicyPlayReadyLicenseType>> getLicenseType() {
        return this.licenseType;
    }

    @InputImport(name="playRight")
    private final @Nullable Input<ContentKeyPolicyPlayReadyPlayRightArgs> playRight;

    public Input<ContentKeyPolicyPlayReadyPlayRightArgs> getPlayRight() {
        return this.playRight == null ? Input.empty() : this.playRight;
    }

    @InputImport(name="relativeBeginDate")
    private final @Nullable Input<String> relativeBeginDate;

    public Input<String> getRelativeBeginDate() {
        return this.relativeBeginDate == null ? Input.empty() : this.relativeBeginDate;
    }

    @InputImport(name="relativeExpirationDate")
    private final @Nullable Input<String> relativeExpirationDate;

    public Input<String> getRelativeExpirationDate() {
        return this.relativeExpirationDate == null ? Input.empty() : this.relativeExpirationDate;
    }

    public ContentKeyPolicyPlayReadyLicenseArgs(
        Input<Boolean> allowTestDevices,
        @Nullable Input<String> beginDate,
        Input<Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs>> contentKeyLocation,
        Input<Either<String,ContentKeyPolicyPlayReadyContentType>> contentType,
        @Nullable Input<String> expirationDate,
        @Nullable Input<String> gracePeriod,
        Input<Either<String,ContentKeyPolicyPlayReadyLicenseType>> licenseType,
        @Nullable Input<ContentKeyPolicyPlayReadyPlayRightArgs> playRight,
        @Nullable Input<String> relativeBeginDate,
        @Nullable Input<String> relativeExpirationDate) {
        this.allowTestDevices = Objects.requireNonNull(allowTestDevices, "expected parameter 'allowTestDevices' to be non-null");
        this.beginDate = beginDate;
        this.contentKeyLocation = Objects.requireNonNull(contentKeyLocation, "expected parameter 'contentKeyLocation' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.expirationDate = expirationDate;
        this.gracePeriod = gracePeriod;
        this.licenseType = Objects.requireNonNull(licenseType, "expected parameter 'licenseType' to be non-null");
        this.playRight = playRight;
        this.relativeBeginDate = relativeBeginDate;
        this.relativeExpirationDate = relativeExpirationDate;
    }

    private ContentKeyPolicyPlayReadyLicenseArgs() {
        this.allowTestDevices = Input.empty();
        this.beginDate = Input.empty();
        this.contentKeyLocation = Input.empty();
        this.contentType = Input.empty();
        this.expirationDate = Input.empty();
        this.gracePeriod = Input.empty();
        this.licenseType = Input.empty();
        this.playRight = Input.empty();
        this.relativeBeginDate = Input.empty();
        this.relativeExpirationDate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyLicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> allowTestDevices;
        private @Nullable Input<String> beginDate;
        private Input<Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs>> contentKeyLocation;
        private Input<Either<String,ContentKeyPolicyPlayReadyContentType>> contentType;
        private @Nullable Input<String> expirationDate;
        private @Nullable Input<String> gracePeriod;
        private Input<Either<String,ContentKeyPolicyPlayReadyLicenseType>> licenseType;
        private @Nullable Input<ContentKeyPolicyPlayReadyPlayRightArgs> playRight;
        private @Nullable Input<String> relativeBeginDate;
        private @Nullable Input<String> relativeExpirationDate;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyLicenseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTestDevices = defaults.allowTestDevices;
    	      this.beginDate = defaults.beginDate;
    	      this.contentKeyLocation = defaults.contentKeyLocation;
    	      this.contentType = defaults.contentType;
    	      this.expirationDate = defaults.expirationDate;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.licenseType = defaults.licenseType;
    	      this.playRight = defaults.playRight;
    	      this.relativeBeginDate = defaults.relativeBeginDate;
    	      this.relativeExpirationDate = defaults.relativeExpirationDate;
        }

        public Builder setAllowTestDevices(Input<Boolean> allowTestDevices) {
            this.allowTestDevices = Objects.requireNonNull(allowTestDevices);
            return this;
        }

        public Builder setAllowTestDevices(Boolean allowTestDevices) {
            this.allowTestDevices = Input.of(Objects.requireNonNull(allowTestDevices));
            return this;
        }

        public Builder setBeginDate(@Nullable Input<String> beginDate) {
            this.beginDate = beginDate;
            return this;
        }

        public Builder setBeginDate(@Nullable String beginDate) {
            this.beginDate = Input.ofNullable(beginDate);
            return this;
        }

        public Builder setContentKeyLocation(Input<Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs>> contentKeyLocation) {
            this.contentKeyLocation = Objects.requireNonNull(contentKeyLocation);
            return this;
        }

        public Builder setContentKeyLocation(Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderArgs,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierArgs> contentKeyLocation) {
            this.contentKeyLocation = Input.of(Objects.requireNonNull(contentKeyLocation));
            return this;
        }

        public Builder setContentType(Input<Either<String,ContentKeyPolicyPlayReadyContentType>> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setContentType(Either<String,ContentKeyPolicyPlayReadyContentType> contentType) {
            this.contentType = Input.of(Objects.requireNonNull(contentType));
            return this;
        }

        public Builder setExpirationDate(@Nullable Input<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setExpirationDate(@Nullable String expirationDate) {
            this.expirationDate = Input.ofNullable(expirationDate);
            return this;
        }

        public Builder setGracePeriod(@Nullable Input<String> gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }

        public Builder setGracePeriod(@Nullable String gracePeriod) {
            this.gracePeriod = Input.ofNullable(gracePeriod);
            return this;
        }

        public Builder setLicenseType(Input<Either<String,ContentKeyPolicyPlayReadyLicenseType>> licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }

        public Builder setLicenseType(Either<String,ContentKeyPolicyPlayReadyLicenseType> licenseType) {
            this.licenseType = Input.of(Objects.requireNonNull(licenseType));
            return this;
        }

        public Builder setPlayRight(@Nullable Input<ContentKeyPolicyPlayReadyPlayRightArgs> playRight) {
            this.playRight = playRight;
            return this;
        }

        public Builder setPlayRight(@Nullable ContentKeyPolicyPlayReadyPlayRightArgs playRight) {
            this.playRight = Input.ofNullable(playRight);
            return this;
        }

        public Builder setRelativeBeginDate(@Nullable Input<String> relativeBeginDate) {
            this.relativeBeginDate = relativeBeginDate;
            return this;
        }

        public Builder setRelativeBeginDate(@Nullable String relativeBeginDate) {
            this.relativeBeginDate = Input.ofNullable(relativeBeginDate);
            return this;
        }

        public Builder setRelativeExpirationDate(@Nullable Input<String> relativeExpirationDate) {
            this.relativeExpirationDate = relativeExpirationDate;
            return this;
        }

        public Builder setRelativeExpirationDate(@Nullable String relativeExpirationDate) {
            this.relativeExpirationDate = Input.ofNullable(relativeExpirationDate);
            return this;
        }

        public ContentKeyPolicyPlayReadyLicenseArgs build() {
            return new ContentKeyPolicyPlayReadyLicenseArgs(allowTestDevices, beginDate, contentKeyLocation, contentType, expirationDate, gracePeriod, licenseType, playRight, relativeBeginDate, relativeExpirationDate);
        }
    }
}