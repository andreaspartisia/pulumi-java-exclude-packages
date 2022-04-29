// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyWafConfigJsChallengeChallengeSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyWafConfigJsChallengeChallengeSettingsArgs Empty = new PolicyWafConfigJsChallengeChallengeSettingsArgs();

    /**
     * (Updatable) If `action` is set to `BLOCK`, this specifies how the traffic is blocked when detected as malicious by a protection rule. If unspecified, defaults to `SET_RESPONSE_CODE`.
     * 
     */
    @Import(name="blockAction")
    private @Nullable Output<String> blockAction;

    /**
     * @return (Updatable) If `action` is set to `BLOCK`, this specifies how the traffic is blocked when detected as malicious by a protection rule. If unspecified, defaults to `SET_RESPONSE_CODE`.
     * 
     */
    public Optional<Output<String>> blockAction() {
        return Optional.ofNullable(this.blockAction);
    }

    /**
     * (Updatable) The error code to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`.
     * 
     */
    @Import(name="blockErrorPageCode")
    private @Nullable Output<String> blockErrorPageCode;

    /**
     * @return (Updatable) The error code to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`.
     * 
     */
    public Optional<Output<String>> blockErrorPageCode() {
        return Optional.ofNullable(this.blockErrorPageCode);
    }

    /**
     * (Updatable) The description text to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `Access blocked by website owner. Please contact support.`
     * 
     */
    @Import(name="blockErrorPageDescription")
    private @Nullable Output<String> blockErrorPageDescription;

    /**
     * @return (Updatable) The description text to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `Access blocked by website owner. Please contact support.`
     * 
     */
    public Optional<Output<String>> blockErrorPageDescription() {
        return Optional.ofNullable(this.blockErrorPageDescription);
    }

    /**
     * (Updatable) The message to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to &#39;Access to the website is blocked.&#39;
     * 
     */
    @Import(name="blockErrorPageMessage")
    private @Nullable Output<String> blockErrorPageMessage;

    /**
     * @return (Updatable) The message to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to &#39;Access to the website is blocked.&#39;
     * 
     */
    public Optional<Output<String>> blockErrorPageMessage() {
        return Optional.ofNullable(this.blockErrorPageMessage);
    }

    /**
     * (Updatable) The response code returned when `action` is set to `BLOCK`, `blockAction` is set to `SET_RESPONSE_CODE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`. The list of available response codes: `400`, `401`, `403`, `405`, `409`, `411`, `412`, `413`, `414`, `415`, `416`, `500`, `501`, `502`, `503`, `504`, `507`.
     * 
     */
    @Import(name="blockResponseCode")
    private @Nullable Output<Integer> blockResponseCode;

    /**
     * @return (Updatable) The response code returned when `action` is set to `BLOCK`, `blockAction` is set to `SET_RESPONSE_CODE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`. The list of available response codes: `400`, `401`, `403`, `405`, `409`, `411`, `412`, `413`, `414`, `415`, `416`, `500`, `501`, `502`, `503`, `504`, `507`.
     * 
     */
    public Optional<Output<Integer>> blockResponseCode() {
        return Optional.ofNullable(this.blockResponseCode);
    }

    /**
     * (Updatable) The text to show in the footer when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, default to `Enter the letters and numbers as they are shown in image above`.
     * 
     */
    @Import(name="captchaFooter")
    private @Nullable Output<String> captchaFooter;

    /**
     * @return (Updatable) The text to show in the footer when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, default to `Enter the letters and numbers as they are shown in image above`.
     * 
     */
    public Optional<Output<String>> captchaFooter() {
        return Optional.ofNullable(this.captchaFooter);
    }

    /**
     * (Updatable) The text to show in the header when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `We have detected an increased number of attempts to access this webapp. To help us keep this webapp secure, please let us know that you are not a robot by entering the text from captcha below.`
     * 
     */
    @Import(name="captchaHeader")
    private @Nullable Output<String> captchaHeader;

    /**
     * @return (Updatable) The text to show in the header when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `We have detected an increased number of attempts to access this webapp. To help us keep this webapp secure, please let us know that you are not a robot by entering the text from captcha below.`
     * 
     */
    public Optional<Output<String>> captchaHeader() {
        return Optional.ofNullable(this.captchaHeader);
    }

    /**
     * (Updatable) The text to show on the label of the CAPTCHA challenge submit button when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `Yes, I am human`.
     * 
     */
    @Import(name="captchaSubmitLabel")
    private @Nullable Output<String> captchaSubmitLabel;

    /**
     * @return (Updatable) The text to show on the label of the CAPTCHA challenge submit button when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `Yes, I am human`.
     * 
     */
    public Optional<Output<String>> captchaSubmitLabel() {
        return Optional.ofNullable(this.captchaSubmitLabel);
    }

    /**
     * (Updatable) The title used when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `Are you human?`
     * 
     */
    @Import(name="captchaTitle")
    private @Nullable Output<String> captchaTitle;

    /**
     * @return (Updatable) The title used when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `Are you human?`
     * 
     */
    public Optional<Output<String>> captchaTitle() {
        return Optional.ofNullable(this.captchaTitle);
    }

    private PolicyWafConfigJsChallengeChallengeSettingsArgs() {}

    private PolicyWafConfigJsChallengeChallengeSettingsArgs(PolicyWafConfigJsChallengeChallengeSettingsArgs $) {
        this.blockAction = $.blockAction;
        this.blockErrorPageCode = $.blockErrorPageCode;
        this.blockErrorPageDescription = $.blockErrorPageDescription;
        this.blockErrorPageMessage = $.blockErrorPageMessage;
        this.blockResponseCode = $.blockResponseCode;
        this.captchaFooter = $.captchaFooter;
        this.captchaHeader = $.captchaHeader;
        this.captchaSubmitLabel = $.captchaSubmitLabel;
        this.captchaTitle = $.captchaTitle;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyWafConfigJsChallengeChallengeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyWafConfigJsChallengeChallengeSettingsArgs $;

        public Builder() {
            $ = new PolicyWafConfigJsChallengeChallengeSettingsArgs();
        }

        public Builder(PolicyWafConfigJsChallengeChallengeSettingsArgs defaults) {
            $ = new PolicyWafConfigJsChallengeChallengeSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockAction (Updatable) If `action` is set to `BLOCK`, this specifies how the traffic is blocked when detected as malicious by a protection rule. If unspecified, defaults to `SET_RESPONSE_CODE`.
         * 
         * @return builder
         * 
         */
        public Builder blockAction(@Nullable Output<String> blockAction) {
            $.blockAction = blockAction;
            return this;
        }

        /**
         * @param blockAction (Updatable) If `action` is set to `BLOCK`, this specifies how the traffic is blocked when detected as malicious by a protection rule. If unspecified, defaults to `SET_RESPONSE_CODE`.
         * 
         * @return builder
         * 
         */
        public Builder blockAction(String blockAction) {
            return blockAction(Output.of(blockAction));
        }

        /**
         * @param blockErrorPageCode (Updatable) The error code to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`.
         * 
         * @return builder
         * 
         */
        public Builder blockErrorPageCode(@Nullable Output<String> blockErrorPageCode) {
            $.blockErrorPageCode = blockErrorPageCode;
            return this;
        }

        /**
         * @param blockErrorPageCode (Updatable) The error code to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`.
         * 
         * @return builder
         * 
         */
        public Builder blockErrorPageCode(String blockErrorPageCode) {
            return blockErrorPageCode(Output.of(blockErrorPageCode));
        }

        /**
         * @param blockErrorPageDescription (Updatable) The description text to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `Access blocked by website owner. Please contact support.`
         * 
         * @return builder
         * 
         */
        public Builder blockErrorPageDescription(@Nullable Output<String> blockErrorPageDescription) {
            $.blockErrorPageDescription = blockErrorPageDescription;
            return this;
        }

        /**
         * @param blockErrorPageDescription (Updatable) The description text to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `Access blocked by website owner. Please contact support.`
         * 
         * @return builder
         * 
         */
        public Builder blockErrorPageDescription(String blockErrorPageDescription) {
            return blockErrorPageDescription(Output.of(blockErrorPageDescription));
        }

        /**
         * @param blockErrorPageMessage (Updatable) The message to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to &#39;Access to the website is blocked.&#39;
         * 
         * @return builder
         * 
         */
        public Builder blockErrorPageMessage(@Nullable Output<String> blockErrorPageMessage) {
            $.blockErrorPageMessage = blockErrorPageMessage;
            return this;
        }

        /**
         * @param blockErrorPageMessage (Updatable) The message to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to &#39;Access to the website is blocked.&#39;
         * 
         * @return builder
         * 
         */
        public Builder blockErrorPageMessage(String blockErrorPageMessage) {
            return blockErrorPageMessage(Output.of(blockErrorPageMessage));
        }

        /**
         * @param blockResponseCode (Updatable) The response code returned when `action` is set to `BLOCK`, `blockAction` is set to `SET_RESPONSE_CODE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`. The list of available response codes: `400`, `401`, `403`, `405`, `409`, `411`, `412`, `413`, `414`, `415`, `416`, `500`, `501`, `502`, `503`, `504`, `507`.
         * 
         * @return builder
         * 
         */
        public Builder blockResponseCode(@Nullable Output<Integer> blockResponseCode) {
            $.blockResponseCode = blockResponseCode;
            return this;
        }

        /**
         * @param blockResponseCode (Updatable) The response code returned when `action` is set to `BLOCK`, `blockAction` is set to `SET_RESPONSE_CODE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`. The list of available response codes: `400`, `401`, `403`, `405`, `409`, `411`, `412`, `413`, `414`, `415`, `416`, `500`, `501`, `502`, `503`, `504`, `507`.
         * 
         * @return builder
         * 
         */
        public Builder blockResponseCode(Integer blockResponseCode) {
            return blockResponseCode(Output.of(blockResponseCode));
        }

        /**
         * @param captchaFooter (Updatable) The text to show in the footer when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, default to `Enter the letters and numbers as they are shown in image above`.
         * 
         * @return builder
         * 
         */
        public Builder captchaFooter(@Nullable Output<String> captchaFooter) {
            $.captchaFooter = captchaFooter;
            return this;
        }

        /**
         * @param captchaFooter (Updatable) The text to show in the footer when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, default to `Enter the letters and numbers as they are shown in image above`.
         * 
         * @return builder
         * 
         */
        public Builder captchaFooter(String captchaFooter) {
            return captchaFooter(Output.of(captchaFooter));
        }

        /**
         * @param captchaHeader (Updatable) The text to show in the header when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `We have detected an increased number of attempts to access this webapp. To help us keep this webapp secure, please let us know that you are not a robot by entering the text from captcha below.`
         * 
         * @return builder
         * 
         */
        public Builder captchaHeader(@Nullable Output<String> captchaHeader) {
            $.captchaHeader = captchaHeader;
            return this;
        }

        /**
         * @param captchaHeader (Updatable) The text to show in the header when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `We have detected an increased number of attempts to access this webapp. To help us keep this webapp secure, please let us know that you are not a robot by entering the text from captcha below.`
         * 
         * @return builder
         * 
         */
        public Builder captchaHeader(String captchaHeader) {
            return captchaHeader(Output.of(captchaHeader));
        }

        /**
         * @param captchaSubmitLabel (Updatable) The text to show on the label of the CAPTCHA challenge submit button when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `Yes, I am human`.
         * 
         * @return builder
         * 
         */
        public Builder captchaSubmitLabel(@Nullable Output<String> captchaSubmitLabel) {
            $.captchaSubmitLabel = captchaSubmitLabel;
            return this;
        }

        /**
         * @param captchaSubmitLabel (Updatable) The text to show on the label of the CAPTCHA challenge submit button when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `Yes, I am human`.
         * 
         * @return builder
         * 
         */
        public Builder captchaSubmitLabel(String captchaSubmitLabel) {
            return captchaSubmitLabel(Output.of(captchaSubmitLabel));
        }

        /**
         * @param captchaTitle (Updatable) The title used when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `Are you human?`
         * 
         * @return builder
         * 
         */
        public Builder captchaTitle(@Nullable Output<String> captchaTitle) {
            $.captchaTitle = captchaTitle;
            return this;
        }

        /**
         * @param captchaTitle (Updatable) The title used when showing a CAPTCHA challenge when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_CAPTCHA`, and the request is blocked. If unspecified, defaults to `Are you human?`
         * 
         * @return builder
         * 
         */
        public Builder captchaTitle(String captchaTitle) {
            return captchaTitle(Output.of(captchaTitle));
        }

        public PolicyWafConfigJsChallengeChallengeSettingsArgs build() {
            return $;
        }
    }

}
