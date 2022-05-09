// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDpsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDpsArgs Empty = new GetDpsArgs();

    /**
     * Specifies the name of the Iot Device Provisioning Service resource.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the Iot Device Provisioning Service resource.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the resource group under which the Iot Device Provisioning Service is located in.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group under which the Iot Device Provisioning Service is located in.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDpsArgs() {}

    private GetDpsArgs(GetDpsArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDpsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDpsArgs $;

        public Builder() {
            $ = new GetDpsArgs();
        }

        public Builder(GetDpsArgs defaults) {
            $ = new GetDpsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Iot Device Provisioning Service resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group under which the Iot Device Provisioning Service is located in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetDpsArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
