// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BgpSessionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BgpSessionArgs Empty = new BgpSessionArgs();

    @InputImport(name="maxPrefixesAdvertisedV4")
    private final @Nullable Input<Integer> maxPrefixesAdvertisedV4;

    public Input<Integer> getMaxPrefixesAdvertisedV4() {
        return this.maxPrefixesAdvertisedV4 == null ? Input.empty() : this.maxPrefixesAdvertisedV4;
    }

    @InputImport(name="maxPrefixesAdvertisedV6")
    private final @Nullable Input<Integer> maxPrefixesAdvertisedV6;

    public Input<Integer> getMaxPrefixesAdvertisedV6() {
        return this.maxPrefixesAdvertisedV6 == null ? Input.empty() : this.maxPrefixesAdvertisedV6;
    }

    @InputImport(name="md5AuthenticationKey")
    private final @Nullable Input<String> md5AuthenticationKey;

    public Input<String> getMd5AuthenticationKey() {
        return this.md5AuthenticationKey == null ? Input.empty() : this.md5AuthenticationKey;
    }

    @InputImport(name="microsoftSessionIPv4Address")
    private final @Nullable Input<String> microsoftSessionIPv4Address;

    public Input<String> getMicrosoftSessionIPv4Address() {
        return this.microsoftSessionIPv4Address == null ? Input.empty() : this.microsoftSessionIPv4Address;
    }

    @InputImport(name="microsoftSessionIPv6Address")
    private final @Nullable Input<String> microsoftSessionIPv6Address;

    public Input<String> getMicrosoftSessionIPv6Address() {
        return this.microsoftSessionIPv6Address == null ? Input.empty() : this.microsoftSessionIPv6Address;
    }

    @InputImport(name="peerSessionIPv4Address")
    private final @Nullable Input<String> peerSessionIPv4Address;

    public Input<String> getPeerSessionIPv4Address() {
        return this.peerSessionIPv4Address == null ? Input.empty() : this.peerSessionIPv4Address;
    }

    @InputImport(name="peerSessionIPv6Address")
    private final @Nullable Input<String> peerSessionIPv6Address;

    public Input<String> getPeerSessionIPv6Address() {
        return this.peerSessionIPv6Address == null ? Input.empty() : this.peerSessionIPv6Address;
    }

    @InputImport(name="sessionPrefixV4")
    private final @Nullable Input<String> sessionPrefixV4;

    public Input<String> getSessionPrefixV4() {
        return this.sessionPrefixV4 == null ? Input.empty() : this.sessionPrefixV4;
    }

    @InputImport(name="sessionPrefixV6")
    private final @Nullable Input<String> sessionPrefixV6;

    public Input<String> getSessionPrefixV6() {
        return this.sessionPrefixV6 == null ? Input.empty() : this.sessionPrefixV6;
    }

    public BgpSessionArgs(
        @Nullable Input<Integer> maxPrefixesAdvertisedV4,
        @Nullable Input<Integer> maxPrefixesAdvertisedV6,
        @Nullable Input<String> md5AuthenticationKey,
        @Nullable Input<String> microsoftSessionIPv4Address,
        @Nullable Input<String> microsoftSessionIPv6Address,
        @Nullable Input<String> peerSessionIPv4Address,
        @Nullable Input<String> peerSessionIPv6Address,
        @Nullable Input<String> sessionPrefixV4,
        @Nullable Input<String> sessionPrefixV6) {
        this.maxPrefixesAdvertisedV4 = maxPrefixesAdvertisedV4;
        this.maxPrefixesAdvertisedV6 = maxPrefixesAdvertisedV6;
        this.md5AuthenticationKey = md5AuthenticationKey;
        this.microsoftSessionIPv4Address = microsoftSessionIPv4Address;
        this.microsoftSessionIPv6Address = microsoftSessionIPv6Address;
        this.peerSessionIPv4Address = peerSessionIPv4Address;
        this.peerSessionIPv6Address = peerSessionIPv6Address;
        this.sessionPrefixV4 = sessionPrefixV4;
        this.sessionPrefixV6 = sessionPrefixV6;
    }

    private BgpSessionArgs() {
        this.maxPrefixesAdvertisedV4 = Input.empty();
        this.maxPrefixesAdvertisedV6 = Input.empty();
        this.md5AuthenticationKey = Input.empty();
        this.microsoftSessionIPv4Address = Input.empty();
        this.microsoftSessionIPv6Address = Input.empty();
        this.peerSessionIPv4Address = Input.empty();
        this.peerSessionIPv6Address = Input.empty();
        this.sessionPrefixV4 = Input.empty();
        this.sessionPrefixV6 = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BgpSessionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxPrefixesAdvertisedV4;
        private @Nullable Input<Integer> maxPrefixesAdvertisedV6;
        private @Nullable Input<String> md5AuthenticationKey;
        private @Nullable Input<String> microsoftSessionIPv4Address;
        private @Nullable Input<String> microsoftSessionIPv6Address;
        private @Nullable Input<String> peerSessionIPv4Address;
        private @Nullable Input<String> peerSessionIPv6Address;
        private @Nullable Input<String> sessionPrefixV4;
        private @Nullable Input<String> sessionPrefixV6;

        public Builder() {
    	      // Empty
        }

        public Builder(BgpSessionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPrefixesAdvertisedV4 = defaults.maxPrefixesAdvertisedV4;
    	      this.maxPrefixesAdvertisedV6 = defaults.maxPrefixesAdvertisedV6;
    	      this.md5AuthenticationKey = defaults.md5AuthenticationKey;
    	      this.microsoftSessionIPv4Address = defaults.microsoftSessionIPv4Address;
    	      this.microsoftSessionIPv6Address = defaults.microsoftSessionIPv6Address;
    	      this.peerSessionIPv4Address = defaults.peerSessionIPv4Address;
    	      this.peerSessionIPv6Address = defaults.peerSessionIPv6Address;
    	      this.sessionPrefixV4 = defaults.sessionPrefixV4;
    	      this.sessionPrefixV6 = defaults.sessionPrefixV6;
        }

        public Builder setMaxPrefixesAdvertisedV4(@Nullable Input<Integer> maxPrefixesAdvertisedV4) {
            this.maxPrefixesAdvertisedV4 = maxPrefixesAdvertisedV4;
            return this;
        }

        public Builder setMaxPrefixesAdvertisedV4(@Nullable Integer maxPrefixesAdvertisedV4) {
            this.maxPrefixesAdvertisedV4 = Input.ofNullable(maxPrefixesAdvertisedV4);
            return this;
        }

        public Builder setMaxPrefixesAdvertisedV6(@Nullable Input<Integer> maxPrefixesAdvertisedV6) {
            this.maxPrefixesAdvertisedV6 = maxPrefixesAdvertisedV6;
            return this;
        }

        public Builder setMaxPrefixesAdvertisedV6(@Nullable Integer maxPrefixesAdvertisedV6) {
            this.maxPrefixesAdvertisedV6 = Input.ofNullable(maxPrefixesAdvertisedV6);
            return this;
        }

        public Builder setMd5AuthenticationKey(@Nullable Input<String> md5AuthenticationKey) {
            this.md5AuthenticationKey = md5AuthenticationKey;
            return this;
        }

        public Builder setMd5AuthenticationKey(@Nullable String md5AuthenticationKey) {
            this.md5AuthenticationKey = Input.ofNullable(md5AuthenticationKey);
            return this;
        }

        public Builder setMicrosoftSessionIPv4Address(@Nullable Input<String> microsoftSessionIPv4Address) {
            this.microsoftSessionIPv4Address = microsoftSessionIPv4Address;
            return this;
        }

        public Builder setMicrosoftSessionIPv4Address(@Nullable String microsoftSessionIPv4Address) {
            this.microsoftSessionIPv4Address = Input.ofNullable(microsoftSessionIPv4Address);
            return this;
        }

        public Builder setMicrosoftSessionIPv6Address(@Nullable Input<String> microsoftSessionIPv6Address) {
            this.microsoftSessionIPv6Address = microsoftSessionIPv6Address;
            return this;
        }

        public Builder setMicrosoftSessionIPv6Address(@Nullable String microsoftSessionIPv6Address) {
            this.microsoftSessionIPv6Address = Input.ofNullable(microsoftSessionIPv6Address);
            return this;
        }

        public Builder setPeerSessionIPv4Address(@Nullable Input<String> peerSessionIPv4Address) {
            this.peerSessionIPv4Address = peerSessionIPv4Address;
            return this;
        }

        public Builder setPeerSessionIPv4Address(@Nullable String peerSessionIPv4Address) {
            this.peerSessionIPv4Address = Input.ofNullable(peerSessionIPv4Address);
            return this;
        }

        public Builder setPeerSessionIPv6Address(@Nullable Input<String> peerSessionIPv6Address) {
            this.peerSessionIPv6Address = peerSessionIPv6Address;
            return this;
        }

        public Builder setPeerSessionIPv6Address(@Nullable String peerSessionIPv6Address) {
            this.peerSessionIPv6Address = Input.ofNullable(peerSessionIPv6Address);
            return this;
        }

        public Builder setSessionPrefixV4(@Nullable Input<String> sessionPrefixV4) {
            this.sessionPrefixV4 = sessionPrefixV4;
            return this;
        }

        public Builder setSessionPrefixV4(@Nullable String sessionPrefixV4) {
            this.sessionPrefixV4 = Input.ofNullable(sessionPrefixV4);
            return this;
        }

        public Builder setSessionPrefixV6(@Nullable Input<String> sessionPrefixV6) {
            this.sessionPrefixV6 = sessionPrefixV6;
            return this;
        }

        public Builder setSessionPrefixV6(@Nullable String sessionPrefixV6) {
            this.sessionPrefixV6 = Input.ofNullable(sessionPrefixV6);
            return this;
        }

        public BgpSessionArgs build() {
            return new BgpSessionArgs(maxPrefixesAdvertisedV4, maxPrefixesAdvertisedV6, md5AuthenticationKey, microsoftSessionIPv4Address, microsoftSessionIPv6Address, peerSessionIPv4Address, peerSessionIPv6Address, sessionPrefixV4, sessionPrefixV6);
        }
    }
}