// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.enums.SupportTier;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Support information for the content item.
 * 
 */
public final class MetadataSupportArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetadataSupportArgs Empty = new MetadataSupportArgs();

    /**
     * Email of support contact
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Link for support help, like to support page to open a ticket etc.
     * 
     */
    @Import(name="link")
    private @Nullable Output<String> link;

    public Optional<Output<String>> link() {
        return Optional.ofNullable(this.link);
    }

    /**
     * Name of the support contact. Company or person.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Type of support for content item
     * 
     */
    @Import(name="tier", required=true)
    private Output<Either<String,SupportTier>> tier;

    public Output<Either<String,SupportTier>> tier() {
        return this.tier;
    }

    private MetadataSupportArgs() {}

    private MetadataSupportArgs(MetadataSupportArgs $) {
        this.email = $.email;
        this.link = $.link;
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetadataSupportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataSupportArgs $;

        public Builder() {
            $ = new MetadataSupportArgs();
        }

        public Builder(MetadataSupportArgs defaults) {
            $ = new MetadataSupportArgs(Objects.requireNonNull(defaults));
        }

        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        public Builder email(String email) {
            return email(Output.of(email));
        }

        public Builder link(@Nullable Output<String> link) {
            $.link = link;
            return this;
        }

        public Builder link(String link) {
            return link(Output.of(link));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tier(Output<Either<String,SupportTier>> tier) {
            $.tier = tier;
            return this;
        }

        public Builder tier(Either<String,SupportTier> tier) {
            return tier(Output.of(tier));
        }

        public Builder tier(String tier) {
            return tier(Either.ofLeft(tier));
        }

        public Builder tier(SupportTier tier) {
            return tier(Either.ofRight(tier));
        }

        public MetadataSupportArgs build() {
            $.tier = Objects.requireNonNull($.tier, "expected parameter 'tier' to be non-null");
            return $;
        }
    }

}
