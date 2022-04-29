// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryTypeArgs Empty = new GetRegistryTypeArgs();

    /**
     * Specifies the fields to get for an object.
     * 
     */
    @Import(name="fields")
    private @Nullable List<String> fields;

    /**
     * @return Specifies the fields to get for an object.
     * 
     */
    public Optional<List<String>> fields() {
        return Optional.ofNullable(this.fields);
    }

    /**
     * The registry Ocid.
     * 
     */
    @Import(name="registryId", required=true)
    private String registryId;

    /**
     * @return The registry Ocid.
     * 
     */
    public String registryId() {
        return this.registryId;
    }

    /**
     * key of the a specefic Type.
     * 
     */
    @Import(name="typeKey", required=true)
    private String typeKey;

    /**
     * @return key of the a specefic Type.
     * 
     */
    public String typeKey() {
        return this.typeKey;
    }

    private GetRegistryTypeArgs() {}

    private GetRegistryTypeArgs(GetRegistryTypeArgs $) {
        this.fields = $.fields;
        this.registryId = $.registryId;
        this.typeKey = $.typeKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryTypeArgs $;

        public Builder() {
            $ = new GetRegistryTypeArgs();
        }

        public Builder(GetRegistryTypeArgs defaults) {
            $ = new GetRegistryTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fields Specifies the fields to get for an object.
         * 
         * @return builder
         * 
         */
        public Builder fields(@Nullable List<String> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields Specifies the fields to get for an object.
         * 
         * @return builder
         * 
         */
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }

        /**
         * @param registryId The registry Ocid.
         * 
         * @return builder
         * 
         */
        public Builder registryId(String registryId) {
            $.registryId = registryId;
            return this;
        }

        /**
         * @param typeKey key of the a specefic Type.
         * 
         * @return builder
         * 
         */
        public Builder typeKey(String typeKey) {
            $.typeKey = typeKey;
            return this;
        }

        public GetRegistryTypeArgs build() {
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            $.typeKey = Objects.requireNonNull($.typeKey, "expected parameter 'typeKey' to be non-null");
            return $;
        }
    }

}
