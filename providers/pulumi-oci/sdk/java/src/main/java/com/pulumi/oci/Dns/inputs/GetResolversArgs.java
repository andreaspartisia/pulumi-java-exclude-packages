// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Dns.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Dns.inputs.GetResolversFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResolversArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResolversArgs Empty = new GetResolversArgs();

    /**
     * The OCID of the compartment the resource belongs to.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID of the compartment the resource belongs to.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * The displayName of a resource.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return The displayName of a resource.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetResolversFilter> filters;

    public Optional<List<GetResolversFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The OCID of a resource.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The OCID of a resource.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Value must be `PRIVATE` when listing private name resolvers.
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    /**
     * @return Value must be `PRIVATE` when listing private name resolvers.
     * 
     */
    public String scope() {
        return this.scope;
    }

    /**
     * The state of a resource.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The state of a resource.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetResolversArgs() {}

    private GetResolversArgs(GetResolversArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.id = $.id;
        this.scope = $.scope;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResolversArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResolversArgs $;

        public Builder() {
            $ = new GetResolversArgs();
        }

        public Builder(GetResolversArgs defaults) {
            $ = new GetResolversArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment the resource belongs to.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName The displayName of a resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetResolversFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetResolversFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id The OCID of a resource.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param scope Value must be `PRIVATE` when listing private name resolvers.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param state The state of a resource.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetResolversArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
