// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DiskPoolIscsiTargetLunState extends com.pulumi.resources.ResourceArgs {

    public static final DiskPoolIscsiTargetLunState Empty = new DiskPoolIscsiTargetLunState();

    /**
     * The ID of the `azure.compute.DiskPoolManagedDiskAttachment`. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    @Import(name="diskPoolManagedDiskAttachmentId")
    private @Nullable Output<String> diskPoolManagedDiskAttachmentId;

    /**
     * @return The ID of the `azure.compute.DiskPoolManagedDiskAttachment`. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    public Optional<Output<String>> diskPoolManagedDiskAttachmentId() {
        return Optional.ofNullable(this.diskPoolManagedDiskAttachmentId);
    }

    /**
     * The ID of the iSCSI Target. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    @Import(name="iscsiTargetId")
    private @Nullable Output<String> iscsiTargetId;

    /**
     * @return The ID of the iSCSI Target. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    public Optional<Output<String>> iscsiTargetId() {
        return Optional.ofNullable(this.iscsiTargetId);
    }

    /**
     * The Logical Unit Number of the iSCSI Target LUN.
     * 
     */
    @Import(name="lun")
    private @Nullable Output<Integer> lun;

    /**
     * @return The Logical Unit Number of the iSCSI Target LUN.
     * 
     */
    public Optional<Output<Integer>> lun() {
        return Optional.ofNullable(this.lun);
    }

    /**
     * User defined name for iSCSI LUN. Supported characters include uppercase letters, lowercase letters, numbers, periods, underscores or hyphens. Name should end with an alphanumeric character. The length must be between `1` and `90`. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return User defined name for iSCSI LUN. Supported characters include uppercase letters, lowercase letters, numbers, periods, underscores or hyphens. Name should end with an alphanumeric character. The length must be between `1` and `90`. Changing this forces a new iSCSI Target LUN to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DiskPoolIscsiTargetLunState() {}

    private DiskPoolIscsiTargetLunState(DiskPoolIscsiTargetLunState $) {
        this.diskPoolManagedDiskAttachmentId = $.diskPoolManagedDiskAttachmentId;
        this.iscsiTargetId = $.iscsiTargetId;
        this.lun = $.lun;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskPoolIscsiTargetLunState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskPoolIscsiTargetLunState $;

        public Builder() {
            $ = new DiskPoolIscsiTargetLunState();
        }

        public Builder(DiskPoolIscsiTargetLunState defaults) {
            $ = new DiskPoolIscsiTargetLunState(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskPoolManagedDiskAttachmentId The ID of the `azure.compute.DiskPoolManagedDiskAttachment`. Changing this forces a new iSCSI Target LUN to be created.
         * 
         * @return builder
         * 
         */
        public Builder diskPoolManagedDiskAttachmentId(@Nullable Output<String> diskPoolManagedDiskAttachmentId) {
            $.diskPoolManagedDiskAttachmentId = diskPoolManagedDiskAttachmentId;
            return this;
        }

        /**
         * @param diskPoolManagedDiskAttachmentId The ID of the `azure.compute.DiskPoolManagedDiskAttachment`. Changing this forces a new iSCSI Target LUN to be created.
         * 
         * @return builder
         * 
         */
        public Builder diskPoolManagedDiskAttachmentId(String diskPoolManagedDiskAttachmentId) {
            return diskPoolManagedDiskAttachmentId(Output.of(diskPoolManagedDiskAttachmentId));
        }

        /**
         * @param iscsiTargetId The ID of the iSCSI Target. Changing this forces a new iSCSI Target LUN to be created.
         * 
         * @return builder
         * 
         */
        public Builder iscsiTargetId(@Nullable Output<String> iscsiTargetId) {
            $.iscsiTargetId = iscsiTargetId;
            return this;
        }

        /**
         * @param iscsiTargetId The ID of the iSCSI Target. Changing this forces a new iSCSI Target LUN to be created.
         * 
         * @return builder
         * 
         */
        public Builder iscsiTargetId(String iscsiTargetId) {
            return iscsiTargetId(Output.of(iscsiTargetId));
        }

        /**
         * @param lun The Logical Unit Number of the iSCSI Target LUN.
         * 
         * @return builder
         * 
         */
        public Builder lun(@Nullable Output<Integer> lun) {
            $.lun = lun;
            return this;
        }

        /**
         * @param lun The Logical Unit Number of the iSCSI Target LUN.
         * 
         * @return builder
         * 
         */
        public Builder lun(Integer lun) {
            return lun(Output.of(lun));
        }

        /**
         * @param name User defined name for iSCSI LUN. Supported characters include uppercase letters, lowercase letters, numbers, periods, underscores or hyphens. Name should end with an alphanumeric character. The length must be between `1` and `90`. Changing this forces a new iSCSI Target LUN to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name User defined name for iSCSI LUN. Supported characters include uppercase letters, lowercase letters, numbers, periods, underscores or hyphens. Name should end with an alphanumeric character. The length must be between `1` and `90`. Changing this forces a new iSCSI Target LUN to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DiskPoolIscsiTargetLunState build() {
            return $;
        }
    }

}
