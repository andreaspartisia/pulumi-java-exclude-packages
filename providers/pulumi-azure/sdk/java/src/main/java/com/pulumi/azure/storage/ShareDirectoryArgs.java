// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShareDirectoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShareDirectoryArgs Empty = new ShareDirectoryArgs();

    /**
     * A mapping of metadata to assign to this Directory.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    /**
     * @return A mapping of metadata to assign to this Directory.
     * 
     */
    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name (or path) of the Directory that should be created within this File Share. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name (or path) of the Directory that should be created within this File Share. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the File Share where this Directory should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="shareName", required=true)
    private Output<String> shareName;

    /**
     * @return The name of the File Share where this Directory should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }

    /**
     * The name of the Storage Account within which the File Share is located. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageAccountName", required=true)
    private Output<String> storageAccountName;

    /**
     * @return The name of the Storage Account within which the File Share is located. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    private ShareDirectoryArgs() {}

    private ShareDirectoryArgs(ShareDirectoryArgs $) {
        this.metadata = $.metadata;
        this.name = $.name;
        this.shareName = $.shareName;
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShareDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShareDirectoryArgs $;

        public Builder() {
            $ = new ShareDirectoryArgs();
        }

        public Builder(ShareDirectoryArgs defaults) {
            $ = new ShareDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadata A mapping of metadata to assign to this Directory.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata A mapping of metadata to assign to this Directory.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param name The name (or path) of the Directory that should be created within this File Share. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name (or path) of the Directory that should be created within this File Share. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param shareName The name of the File Share where this Directory should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder shareName(Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName The name of the File Share where this Directory should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        /**
         * @param storageAccountName The name of the Storage Account within which the File Share is located. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName The name of the Storage Account within which the File Share is located. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public ShareDirectoryArgs build() {
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            return $;
        }
    }

}
