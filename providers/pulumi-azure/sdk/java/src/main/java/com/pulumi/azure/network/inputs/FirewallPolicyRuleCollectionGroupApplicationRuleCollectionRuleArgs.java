// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.azure.network.inputs.FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs Empty = new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs();

    /**
     * The description which should be used for this rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description which should be used for this rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies a list of destination IP addresses (including CIDR and `*`) or Service Tags.
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable Output<List<String>> destinationAddresses;

    /**
     * @return Specifies a list of destination IP addresses (including CIDR and `*`) or Service Tags.
     * 
     */
    public Optional<Output<List<String>>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
    }

    /**
     * Specifies a list of destination FQDN tags.
     * 
     */
    @Import(name="destinationFqdnTags")
    private @Nullable Output<List<String>> destinationFqdnTags;

    /**
     * @return Specifies a list of destination FQDN tags.
     * 
     */
    public Optional<Output<List<String>>> destinationFqdnTags() {
        return Optional.ofNullable(this.destinationFqdnTags);
    }

    /**
     * Specifies a list of destination FQDNs.
     * 
     */
    @Import(name="destinationFqdns")
    private @Nullable Output<List<String>> destinationFqdns;

    /**
     * @return Specifies a list of destination FQDNs.
     * 
     */
    public Optional<Output<List<String>>> destinationFqdns() {
        return Optional.ofNullable(this.destinationFqdns);
    }

    /**
     * Specifies a list of destination URLs for which policy should hold. Needs Premium SKU for Firewall Policy. Conflicts with `destination_fqdns`.
     * 
     */
    @Import(name="destinationUrls")
    private @Nullable Output<List<String>> destinationUrls;

    /**
     * @return Specifies a list of destination URLs for which policy should hold. Needs Premium SKU for Firewall Policy. Conflicts with `destination_fqdns`.
     * 
     */
    public Optional<Output<List<String>>> destinationUrls() {
        return Optional.ofNullable(this.destinationUrls);
    }

    /**
     * The name which should be used for this rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs>> protocols;

    /**
     * @return Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
     * 
     */
    public Optional<Output<List<FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * Specifies a list of source IP addresses (including CIDR and `*`).
     * 
     */
    @Import(name="sourceAddresses")
    private @Nullable Output<List<String>> sourceAddresses;

    /**
     * @return Specifies a list of source IP addresses (including CIDR and `*`).
     * 
     */
    public Optional<Output<List<String>>> sourceAddresses() {
        return Optional.ofNullable(this.sourceAddresses);
    }

    /**
     * Specifies a list of source IP groups.
     * 
     */
    @Import(name="sourceIpGroups")
    private @Nullable Output<List<String>> sourceIpGroups;

    /**
     * @return Specifies a list of source IP groups.
     * 
     */
    public Optional<Output<List<String>>> sourceIpGroups() {
        return Optional.ofNullable(this.sourceIpGroups);
    }

    /**
     * Boolean specifying if TLS shall be terminated (true) or not (false). Must be  `true` when using `destination_urls`. Needs Premium SKU for Firewall Policy.
     * 
     */
    @Import(name="terminateTls")
    private @Nullable Output<Boolean> terminateTls;

    /**
     * @return Boolean specifying if TLS shall be terminated (true) or not (false). Must be  `true` when using `destination_urls`. Needs Premium SKU for Firewall Policy.
     * 
     */
    public Optional<Output<Boolean>> terminateTls() {
        return Optional.ofNullable(this.terminateTls);
    }

    /**
     * Specifies a list of web categories to which access is denied or allowed depending on the value of `action` above. Needs Premium SKU for Firewall Policy.
     * 
     */
    @Import(name="webCategories")
    private @Nullable Output<List<String>> webCategories;

    /**
     * @return Specifies a list of web categories to which access is denied or allowed depending on the value of `action` above. Needs Premium SKU for Firewall Policy.
     * 
     */
    public Optional<Output<List<String>>> webCategories() {
        return Optional.ofNullable(this.webCategories);
    }

    private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs() {}

    private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs $) {
        this.description = $.description;
        this.destinationAddresses = $.destinationAddresses;
        this.destinationFqdnTags = $.destinationFqdnTags;
        this.destinationFqdns = $.destinationFqdns;
        this.destinationUrls = $.destinationUrls;
        this.name = $.name;
        this.protocols = $.protocols;
        this.sourceAddresses = $.sourceAddresses;
        this.sourceIpGroups = $.sourceIpGroups;
        this.terminateTls = $.terminateTls;
        this.webCategories = $.webCategories;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs();
        }

        public Builder(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs defaults) {
            $ = new FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description which should be used for this rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description which should be used for this rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationAddresses Specifies a list of destination IP addresses (including CIDR and `*`) or Service Tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            $.destinationAddresses = destinationAddresses;
            return this;
        }

        /**
         * @param destinationAddresses Specifies a list of destination IP addresses (including CIDR and `*`) or Service Tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(List<String> destinationAddresses) {
            return destinationAddresses(Output.of(destinationAddresses));
        }

        /**
         * @param destinationAddresses Specifies a list of destination IP addresses (including CIDR and `*`) or Service Tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }

        /**
         * @param destinationFqdnTags Specifies a list of destination FQDN tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationFqdnTags(@Nullable Output<List<String>> destinationFqdnTags) {
            $.destinationFqdnTags = destinationFqdnTags;
            return this;
        }

        /**
         * @param destinationFqdnTags Specifies a list of destination FQDN tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationFqdnTags(List<String> destinationFqdnTags) {
            return destinationFqdnTags(Output.of(destinationFqdnTags));
        }

        /**
         * @param destinationFqdnTags Specifies a list of destination FQDN tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationFqdnTags(String... destinationFqdnTags) {
            return destinationFqdnTags(List.of(destinationFqdnTags));
        }

        /**
         * @param destinationFqdns Specifies a list of destination FQDNs.
         * 
         * @return builder
         * 
         */
        public Builder destinationFqdns(@Nullable Output<List<String>> destinationFqdns) {
            $.destinationFqdns = destinationFqdns;
            return this;
        }

        /**
         * @param destinationFqdns Specifies a list of destination FQDNs.
         * 
         * @return builder
         * 
         */
        public Builder destinationFqdns(List<String> destinationFqdns) {
            return destinationFqdns(Output.of(destinationFqdns));
        }

        /**
         * @param destinationFqdns Specifies a list of destination FQDNs.
         * 
         * @return builder
         * 
         */
        public Builder destinationFqdns(String... destinationFqdns) {
            return destinationFqdns(List.of(destinationFqdns));
        }

        /**
         * @param destinationUrls Specifies a list of destination URLs for which policy should hold. Needs Premium SKU for Firewall Policy. Conflicts with `destination_fqdns`.
         * 
         * @return builder
         * 
         */
        public Builder destinationUrls(@Nullable Output<List<String>> destinationUrls) {
            $.destinationUrls = destinationUrls;
            return this;
        }

        /**
         * @param destinationUrls Specifies a list of destination URLs for which policy should hold. Needs Premium SKU for Firewall Policy. Conflicts with `destination_fqdns`.
         * 
         * @return builder
         * 
         */
        public Builder destinationUrls(List<String> destinationUrls) {
            return destinationUrls(Output.of(destinationUrls));
        }

        /**
         * @param destinationUrls Specifies a list of destination URLs for which policy should hold. Needs Premium SKU for Firewall Policy. Conflicts with `destination_fqdns`.
         * 
         * @return builder
         * 
         */
        public Builder destinationUrls(String... destinationUrls) {
            return destinationUrls(List.of(destinationUrls));
        }

        /**
         * @param name The name which should be used for this rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protocols Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable Output<List<FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs>> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocols(List<FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs> protocols) {
            return protocols(Output.of(protocols));
        }

        /**
         * @param protocols Specifies a list of network protocols this rule applies to. Possible values are `TCP`, `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocols(FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleProtocolArgs... protocols) {
            return protocols(List.of(protocols));
        }

        /**
         * @param sourceAddresses Specifies a list of source IP addresses (including CIDR and `*`).
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            $.sourceAddresses = sourceAddresses;
            return this;
        }

        /**
         * @param sourceAddresses Specifies a list of source IP addresses (including CIDR and `*`).
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(List<String> sourceAddresses) {
            return sourceAddresses(Output.of(sourceAddresses));
        }

        /**
         * @param sourceAddresses Specifies a list of source IP addresses (including CIDR and `*`).
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }

        /**
         * @param sourceIpGroups Specifies a list of source IP groups.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(@Nullable Output<List<String>> sourceIpGroups) {
            $.sourceIpGroups = sourceIpGroups;
            return this;
        }

        /**
         * @param sourceIpGroups Specifies a list of source IP groups.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(List<String> sourceIpGroups) {
            return sourceIpGroups(Output.of(sourceIpGroups));
        }

        /**
         * @param sourceIpGroups Specifies a list of source IP groups.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }

        /**
         * @param terminateTls Boolean specifying if TLS shall be terminated (true) or not (false). Must be  `true` when using `destination_urls`. Needs Premium SKU for Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder terminateTls(@Nullable Output<Boolean> terminateTls) {
            $.terminateTls = terminateTls;
            return this;
        }

        /**
         * @param terminateTls Boolean specifying if TLS shall be terminated (true) or not (false). Must be  `true` when using `destination_urls`. Needs Premium SKU for Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder terminateTls(Boolean terminateTls) {
            return terminateTls(Output.of(terminateTls));
        }

        /**
         * @param webCategories Specifies a list of web categories to which access is denied or allowed depending on the value of `action` above. Needs Premium SKU for Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder webCategories(@Nullable Output<List<String>> webCategories) {
            $.webCategories = webCategories;
            return this;
        }

        /**
         * @param webCategories Specifies a list of web categories to which access is denied or allowed depending on the value of `action` above. Needs Premium SKU for Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder webCategories(List<String> webCategories) {
            return webCategories(Output.of(webCategories));
        }

        /**
         * @param webCategories Specifies a list of web categories to which access is denied or allowed depending on the value of `action` above. Needs Premium SKU for Firewall Policy.
         * 
         * @return builder
         * 
         */
        public Builder webCategories(String... webCategories) {
            return webCategories(List.of(webCategories));
        }

        public FirewallPolicyRuleCollectionGroupApplicationRuleCollectionRuleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
