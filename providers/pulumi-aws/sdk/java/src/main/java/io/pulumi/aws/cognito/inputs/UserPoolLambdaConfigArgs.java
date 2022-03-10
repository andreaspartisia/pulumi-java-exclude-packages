// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.aws.cognito.inputs.UserPoolLambdaConfigCustomEmailSenderArgs;
import io.pulumi.aws.cognito.inputs.UserPoolLambdaConfigCustomSmsSenderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolLambdaConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolLambdaConfigArgs Empty = new UserPoolLambdaConfigArgs();

    /**
     * ARN of the lambda creating an authentication challenge.
     * 
     */
    @InputImport(name="createAuthChallenge")
      private final @Nullable Input<String> createAuthChallenge;

    public Input<String> getCreateAuthChallenge() {
        return this.createAuthChallenge == null ? Input.empty() : this.createAuthChallenge;
    }

    /**
     * A custom email sender AWS Lambda trigger. See custom_email_sender Below.
     * 
     */
    @InputImport(name="customEmailSender")
      private final @Nullable Input<UserPoolLambdaConfigCustomEmailSenderArgs> customEmailSender;

    public Input<UserPoolLambdaConfigCustomEmailSenderArgs> getCustomEmailSender() {
        return this.customEmailSender == null ? Input.empty() : this.customEmailSender;
    }

    /**
     * Custom Message AWS Lambda trigger.
     * 
     */
    @InputImport(name="customMessage")
      private final @Nullable Input<String> customMessage;

    public Input<String> getCustomMessage() {
        return this.customMessage == null ? Input.empty() : this.customMessage;
    }

    /**
     * A custom SMS sender AWS Lambda trigger. See custom_sms_sender Below.
     * 
     */
    @InputImport(name="customSmsSender")
      private final @Nullable Input<UserPoolLambdaConfigCustomSmsSenderArgs> customSmsSender;

    public Input<UserPoolLambdaConfigCustomSmsSenderArgs> getCustomSmsSender() {
        return this.customSmsSender == null ? Input.empty() : this.customSmsSender;
    }

    /**
     * Defines the authentication challenge.
     * 
     */
    @InputImport(name="defineAuthChallenge")
      private final @Nullable Input<String> defineAuthChallenge;

    public Input<String> getDefineAuthChallenge() {
        return this.defineAuthChallenge == null ? Input.empty() : this.defineAuthChallenge;
    }

    /**
     * The Amazon Resource Name of Key Management Service Customer master keys. Amazon Cognito uses the key to encrypt codes and temporary passwords sent to CustomEmailSender and CustomSMSSender.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * Post-authentication AWS Lambda trigger.
     * 
     */
    @InputImport(name="postAuthentication")
      private final @Nullable Input<String> postAuthentication;

    public Input<String> getPostAuthentication() {
        return this.postAuthentication == null ? Input.empty() : this.postAuthentication;
    }

    /**
     * Post-confirmation AWS Lambda trigger.
     * 
     */
    @InputImport(name="postConfirmation")
      private final @Nullable Input<String> postConfirmation;

    public Input<String> getPostConfirmation() {
        return this.postConfirmation == null ? Input.empty() : this.postConfirmation;
    }

    /**
     * Pre-authentication AWS Lambda trigger.
     * 
     */
    @InputImport(name="preAuthentication")
      private final @Nullable Input<String> preAuthentication;

    public Input<String> getPreAuthentication() {
        return this.preAuthentication == null ? Input.empty() : this.preAuthentication;
    }

    /**
     * Pre-registration AWS Lambda trigger.
     * 
     */
    @InputImport(name="preSignUp")
      private final @Nullable Input<String> preSignUp;

    public Input<String> getPreSignUp() {
        return this.preSignUp == null ? Input.empty() : this.preSignUp;
    }

    /**
     * Allow to customize identity token claims before token generation.
     * 
     */
    @InputImport(name="preTokenGeneration")
      private final @Nullable Input<String> preTokenGeneration;

    public Input<String> getPreTokenGeneration() {
        return this.preTokenGeneration == null ? Input.empty() : this.preTokenGeneration;
    }

    /**
     * User migration Lambda config type.
     * 
     */
    @InputImport(name="userMigration")
      private final @Nullable Input<String> userMigration;

    public Input<String> getUserMigration() {
        return this.userMigration == null ? Input.empty() : this.userMigration;
    }

    /**
     * Verifies the authentication challenge response.
     * 
     */
    @InputImport(name="verifyAuthChallengeResponse")
      private final @Nullable Input<String> verifyAuthChallengeResponse;

    public Input<String> getVerifyAuthChallengeResponse() {
        return this.verifyAuthChallengeResponse == null ? Input.empty() : this.verifyAuthChallengeResponse;
    }

    public UserPoolLambdaConfigArgs(
        @Nullable Input<String> createAuthChallenge,
        @Nullable Input<UserPoolLambdaConfigCustomEmailSenderArgs> customEmailSender,
        @Nullable Input<String> customMessage,
        @Nullable Input<UserPoolLambdaConfigCustomSmsSenderArgs> customSmsSender,
        @Nullable Input<String> defineAuthChallenge,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> postAuthentication,
        @Nullable Input<String> postConfirmation,
        @Nullable Input<String> preAuthentication,
        @Nullable Input<String> preSignUp,
        @Nullable Input<String> preTokenGeneration,
        @Nullable Input<String> userMigration,
        @Nullable Input<String> verifyAuthChallengeResponse) {
        this.createAuthChallenge = createAuthChallenge;
        this.customEmailSender = customEmailSender;
        this.customMessage = customMessage;
        this.customSmsSender = customSmsSender;
        this.defineAuthChallenge = defineAuthChallenge;
        this.kmsKeyId = kmsKeyId;
        this.postAuthentication = postAuthentication;
        this.postConfirmation = postConfirmation;
        this.preAuthentication = preAuthentication;
        this.preSignUp = preSignUp;
        this.preTokenGeneration = preTokenGeneration;
        this.userMigration = userMigration;
        this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
    }

    private UserPoolLambdaConfigArgs() {
        this.createAuthChallenge = Input.empty();
        this.customEmailSender = Input.empty();
        this.customMessage = Input.empty();
        this.customSmsSender = Input.empty();
        this.defineAuthChallenge = Input.empty();
        this.kmsKeyId = Input.empty();
        this.postAuthentication = Input.empty();
        this.postConfirmation = Input.empty();
        this.preAuthentication = Input.empty();
        this.preSignUp = Input.empty();
        this.preTokenGeneration = Input.empty();
        this.userMigration = Input.empty();
        this.verifyAuthChallengeResponse = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolLambdaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createAuthChallenge;
        private @Nullable Input<UserPoolLambdaConfigCustomEmailSenderArgs> customEmailSender;
        private @Nullable Input<String> customMessage;
        private @Nullable Input<UserPoolLambdaConfigCustomSmsSenderArgs> customSmsSender;
        private @Nullable Input<String> defineAuthChallenge;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> postAuthentication;
        private @Nullable Input<String> postConfirmation;
        private @Nullable Input<String> preAuthentication;
        private @Nullable Input<String> preSignUp;
        private @Nullable Input<String> preTokenGeneration;
        private @Nullable Input<String> userMigration;
        private @Nullable Input<String> verifyAuthChallengeResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolLambdaConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createAuthChallenge = defaults.createAuthChallenge;
    	      this.customEmailSender = defaults.customEmailSender;
    	      this.customMessage = defaults.customMessage;
    	      this.customSmsSender = defaults.customSmsSender;
    	      this.defineAuthChallenge = defaults.defineAuthChallenge;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.postAuthentication = defaults.postAuthentication;
    	      this.postConfirmation = defaults.postConfirmation;
    	      this.preAuthentication = defaults.preAuthentication;
    	      this.preSignUp = defaults.preSignUp;
    	      this.preTokenGeneration = defaults.preTokenGeneration;
    	      this.userMigration = defaults.userMigration;
    	      this.verifyAuthChallengeResponse = defaults.verifyAuthChallengeResponse;
        }

        public Builder setCreateAuthChallenge(@Nullable Input<String> createAuthChallenge) {
            this.createAuthChallenge = createAuthChallenge;
            return this;
        }

        public Builder setCreateAuthChallenge(@Nullable String createAuthChallenge) {
            this.createAuthChallenge = Input.ofNullable(createAuthChallenge);
            return this;
        }

        public Builder setCustomEmailSender(@Nullable Input<UserPoolLambdaConfigCustomEmailSenderArgs> customEmailSender) {
            this.customEmailSender = customEmailSender;
            return this;
        }

        public Builder setCustomEmailSender(@Nullable UserPoolLambdaConfigCustomEmailSenderArgs customEmailSender) {
            this.customEmailSender = Input.ofNullable(customEmailSender);
            return this;
        }

        public Builder setCustomMessage(@Nullable Input<String> customMessage) {
            this.customMessage = customMessage;
            return this;
        }

        public Builder setCustomMessage(@Nullable String customMessage) {
            this.customMessage = Input.ofNullable(customMessage);
            return this;
        }

        public Builder setCustomSmsSender(@Nullable Input<UserPoolLambdaConfigCustomSmsSenderArgs> customSmsSender) {
            this.customSmsSender = customSmsSender;
            return this;
        }

        public Builder setCustomSmsSender(@Nullable UserPoolLambdaConfigCustomSmsSenderArgs customSmsSender) {
            this.customSmsSender = Input.ofNullable(customSmsSender);
            return this;
        }

        public Builder setDefineAuthChallenge(@Nullable Input<String> defineAuthChallenge) {
            this.defineAuthChallenge = defineAuthChallenge;
            return this;
        }

        public Builder setDefineAuthChallenge(@Nullable String defineAuthChallenge) {
            this.defineAuthChallenge = Input.ofNullable(defineAuthChallenge);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setPostAuthentication(@Nullable Input<String> postAuthentication) {
            this.postAuthentication = postAuthentication;
            return this;
        }

        public Builder setPostAuthentication(@Nullable String postAuthentication) {
            this.postAuthentication = Input.ofNullable(postAuthentication);
            return this;
        }

        public Builder setPostConfirmation(@Nullable Input<String> postConfirmation) {
            this.postConfirmation = postConfirmation;
            return this;
        }

        public Builder setPostConfirmation(@Nullable String postConfirmation) {
            this.postConfirmation = Input.ofNullable(postConfirmation);
            return this;
        }

        public Builder setPreAuthentication(@Nullable Input<String> preAuthentication) {
            this.preAuthentication = preAuthentication;
            return this;
        }

        public Builder setPreAuthentication(@Nullable String preAuthentication) {
            this.preAuthentication = Input.ofNullable(preAuthentication);
            return this;
        }

        public Builder setPreSignUp(@Nullable Input<String> preSignUp) {
            this.preSignUp = preSignUp;
            return this;
        }

        public Builder setPreSignUp(@Nullable String preSignUp) {
            this.preSignUp = Input.ofNullable(preSignUp);
            return this;
        }

        public Builder setPreTokenGeneration(@Nullable Input<String> preTokenGeneration) {
            this.preTokenGeneration = preTokenGeneration;
            return this;
        }

        public Builder setPreTokenGeneration(@Nullable String preTokenGeneration) {
            this.preTokenGeneration = Input.ofNullable(preTokenGeneration);
            return this;
        }

        public Builder setUserMigration(@Nullable Input<String> userMigration) {
            this.userMigration = userMigration;
            return this;
        }

        public Builder setUserMigration(@Nullable String userMigration) {
            this.userMigration = Input.ofNullable(userMigration);
            return this;
        }

        public Builder setVerifyAuthChallengeResponse(@Nullable Input<String> verifyAuthChallengeResponse) {
            this.verifyAuthChallengeResponse = verifyAuthChallengeResponse;
            return this;
        }

        public Builder setVerifyAuthChallengeResponse(@Nullable String verifyAuthChallengeResponse) {
            this.verifyAuthChallengeResponse = Input.ofNullable(verifyAuthChallengeResponse);
            return this;
        }
        public UserPoolLambdaConfigArgs build() {
            return new UserPoolLambdaConfigArgs(createAuthChallenge, customEmailSender, customMessage, customSmsSender, defineAuthChallenge, kmsKeyId, postAuthentication, postConfirmation, preAuthentication, preSignUp, preTokenGeneration, userMigration, verifyAuthChallengeResponse);
        }
    }
}