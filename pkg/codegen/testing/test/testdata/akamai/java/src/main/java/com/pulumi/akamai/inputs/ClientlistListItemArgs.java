// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientlistListItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientlistListItemArgs Empty = new ClientlistListItemArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="expirationDate")
    private @Nullable Output<String> expirationDate;

    public Optional<Output<String>> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private ClientlistListItemArgs() {}

    private ClientlistListItemArgs(ClientlistListItemArgs $) {
        this.description = $.description;
        this.expirationDate = $.expirationDate;
        this.tags = $.tags;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientlistListItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientlistListItemArgs $;

        public Builder() {
            $ = new ClientlistListItemArgs();
        }

        public Builder(ClientlistListItemArgs defaults) {
            $ = new ClientlistListItemArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            $.expirationDate = expirationDate;
            return this;
        }

        public Builder expirationDate(String expirationDate) {
            return expirationDate(Output.of(expirationDate));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClientlistListItemArgs build() {
            if ($.value == null) {
                throw new MissingRequiredPropertyException("ClientlistListItemArgs", "value");
            }
            return $;
        }
    }

}
