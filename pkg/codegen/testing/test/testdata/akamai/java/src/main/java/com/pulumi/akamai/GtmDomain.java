// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.GtmDomainArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.GtmDomainState;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/gtmDomain:GtmDomain")
public class GtmDomain extends com.pulumi.resources.CustomResource {
    @Export(name="cnameCoalescingEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> cnameCoalescingEnabled;

    public Output<Optional<Boolean>> cnameCoalescingEnabled() {
        return Codegen.optional(this.cnameCoalescingEnabled);
    }
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    @Export(name="contract", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contract;

    public Output<Optional<String>> contract() {
        return Codegen.optional(this.contract);
    }
    @Export(name="defaultErrorPenalty", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> defaultErrorPenalty;

    public Output<Optional<Integer>> defaultErrorPenalty() {
        return Codegen.optional(this.defaultErrorPenalty);
    }
    @Export(name="defaultHealthMax", refs={Double.class}, tree="[0]")
    private Output<Double> defaultHealthMax;

    public Output<Double> defaultHealthMax() {
        return this.defaultHealthMax;
    }
    @Export(name="defaultHealthMultiplier", refs={Double.class}, tree="[0]")
    private Output<Double> defaultHealthMultiplier;

    public Output<Double> defaultHealthMultiplier() {
        return this.defaultHealthMultiplier;
    }
    @Export(name="defaultHealthThreshold", refs={Double.class}, tree="[0]")
    private Output<Double> defaultHealthThreshold;

    public Output<Double> defaultHealthThreshold() {
        return this.defaultHealthThreshold;
    }
    @Export(name="defaultMaxUnreachablePenalty", refs={Integer.class}, tree="[0]")
    private Output<Integer> defaultMaxUnreachablePenalty;

    public Output<Integer> defaultMaxUnreachablePenalty() {
        return this.defaultMaxUnreachablePenalty;
    }
    @Export(name="defaultSslClientCertificate", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultSslClientCertificate;

    public Output<Optional<String>> defaultSslClientCertificate() {
        return Codegen.optional(this.defaultSslClientCertificate);
    }
    @Export(name="defaultSslClientPrivateKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultSslClientPrivateKey;

    public Output<Optional<String>> defaultSslClientPrivateKey() {
        return Codegen.optional(this.defaultSslClientPrivateKey);
    }
    @Export(name="defaultTimeoutPenalty", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> defaultTimeoutPenalty;

    public Output<Optional<Integer>> defaultTimeoutPenalty() {
        return Codegen.optional(this.defaultTimeoutPenalty);
    }
    @Export(name="defaultUnreachableThreshold", refs={Double.class}, tree="[0]")
    private Output<Double> defaultUnreachableThreshold;

    public Output<Double> defaultUnreachableThreshold() {
        return this.defaultUnreachableThreshold;
    }
    @Export(name="emailNotificationLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> emailNotificationLists;

    public Output<Optional<List<String>>> emailNotificationLists() {
        return Codegen.optional(this.emailNotificationLists);
    }
    @Export(name="endUserMappingEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> endUserMappingEnabled;

    public Output<Optional<Boolean>> endUserMappingEnabled() {
        return Codegen.optional(this.endUserMappingEnabled);
    }
    @Export(name="group", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> group;

    public Output<Optional<String>> group() {
        return Codegen.optional(this.group);
    }
    @Export(name="loadFeedback", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> loadFeedback;

    public Output<Optional<Boolean>> loadFeedback() {
        return Codegen.optional(this.loadFeedback);
    }
    @Export(name="loadImbalancePercentage", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> loadImbalancePercentage;

    public Output<Optional<Double>> loadImbalancePercentage() {
        return Codegen.optional(this.loadImbalancePercentage);
    }
    @Export(name="mapUpdateInterval", refs={Integer.class}, tree="[0]")
    private Output<Integer> mapUpdateInterval;

    public Output<Integer> mapUpdateInterval() {
        return this.mapUpdateInterval;
    }
    @Export(name="maxProperties", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxProperties;

    public Output<Integer> maxProperties() {
        return this.maxProperties;
    }
    @Export(name="maxResources", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxResources;

    public Output<Integer> maxResources() {
        return this.maxResources;
    }
    @Export(name="maxTestTimeout", refs={Double.class}, tree="[0]")
    private Output<Double> maxTestTimeout;

    public Output<Double> maxTestTimeout() {
        return this.maxTestTimeout;
    }
    @Export(name="maxTtl", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxTtl;

    public Output<Integer> maxTtl() {
        return this.maxTtl;
    }
    @Export(name="minPingableRegionFraction", refs={Double.class}, tree="[0]")
    private Output<Double> minPingableRegionFraction;

    public Output<Double> minPingableRegionFraction() {
        return this.minPingableRegionFraction;
    }
    @Export(name="minTestInterval", refs={Integer.class}, tree="[0]")
    private Output<Integer> minTestInterval;

    public Output<Integer> minTestInterval() {
        return this.minTestInterval;
    }
    @Export(name="minTtl", refs={Integer.class}, tree="[0]")
    private Output<Integer> minTtl;

    public Output<Integer> minTtl() {
        return this.minTtl;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="pingInterval", refs={Integer.class}, tree="[0]")
    private Output<Integer> pingInterval;

    public Output<Integer> pingInterval() {
        return this.pingInterval;
    }
    @Export(name="pingPacketSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> pingPacketSize;

    public Output<Integer> pingPacketSize() {
        return this.pingPacketSize;
    }
    @Export(name="roundRobinPrefix", refs={String.class}, tree="[0]")
    private Output<String> roundRobinPrefix;

    public Output<String> roundRobinPrefix() {
        return this.roundRobinPrefix;
    }
    @Export(name="servermonitorLivenessCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> servermonitorLivenessCount;

    public Output<Integer> servermonitorLivenessCount() {
        return this.servermonitorLivenessCount;
    }
    @Export(name="servermonitorLoadCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> servermonitorLoadCount;

    public Output<Integer> servermonitorLoadCount() {
        return this.servermonitorLoadCount;
    }
    @Export(name="servermonitorPool", refs={String.class}, tree="[0]")
    private Output<String> servermonitorPool;

    public Output<String> servermonitorPool() {
        return this.servermonitorPool;
    }
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }
    @Export(name="waitOnComplete", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitOnComplete;

    public Output<Optional<Boolean>> waitOnComplete() {
        return Codegen.optional(this.waitOnComplete);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GtmDomain(java.lang.String name) {
        this(name, GtmDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GtmDomain(String name, GtmDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GtmDomain(java.lang.String name, GtmDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/gtmDomain:GtmDomain", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private GtmDomain(java.lang.String name, Output<java.lang.String> id, @Nullable GtmDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/gtmDomain:GtmDomain", name, state, makeResourceOptions(options, id));
    }

    private static GtmDomainArgs makeArgs(GtmDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GtmDomainArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("akamai:trafficmanagement/gtmDomain:GtmDomain").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GtmDomain get(java.lang.String name, Output<java.lang.String> id, @Nullable GtmDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GtmDomain(name, id, state, options);
    }
}
