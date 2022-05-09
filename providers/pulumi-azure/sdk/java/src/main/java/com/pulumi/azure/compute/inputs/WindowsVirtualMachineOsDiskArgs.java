// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.WindowsVirtualMachineOsDiskDiffDiskSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsVirtualMachineOsDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsVirtualMachineOsDiskArgs Empty = new WindowsVirtualMachineOsDiskArgs();

    /**
     * The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
     * 
     */
    @Import(name="caching", required=true)
    private Output<String> caching;

    /**
     * @return The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
     * 
     */
    public Output<String> caching() {
        return this.caching;
    }

    /**
     * A `diff_disk_settings` block as defined above.
     * 
     */
    @Import(name="diffDiskSettings")
    private @Nullable Output<WindowsVirtualMachineOsDiskDiffDiskSettingsArgs> diffDiskSettings;

    /**
     * @return A `diff_disk_settings` block as defined above.
     * 
     */
    public Optional<Output<WindowsVirtualMachineOsDiskDiffDiskSettingsArgs>> diffDiskSettings() {
        return Optional.ofNullable(this.diffDiskSettings);
    }

    /**
     * The ID of the Disk Encryption Set which should be used to Encrypt this OS Disk.
     * 
     */
    @Import(name="diskEncryptionSetId")
    private @Nullable Output<String> diskEncryptionSetId;

    /**
     * @return The ID of the Disk Encryption Set which should be used to Encrypt this OS Disk.
     * 
     */
    public Optional<Output<String>> diskEncryptionSetId() {
        return Optional.ofNullable(this.diskEncryptionSetId);
    }

    /**
     * The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine is sourced from.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine is sourced from.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * The name which should be used for the Internal OS Disk. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for the Internal OS Disk. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Type of Storage Account which should back this the Internal OS Disk. Possible values are `Standard_LRS`, `StandardSSD_LRS`, `Premium_LRS`, `StandardSSD_ZRS` and `Premium_ZRS`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="storageAccountType", required=true)
    private Output<String> storageAccountType;

    /**
     * @return The Type of Storage Account which should back this the Internal OS Disk. Possible values are `Standard_LRS`, `StandardSSD_LRS`, `Premium_LRS`, `StandardSSD_ZRS` and `Premium_ZRS`. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
     * 
     */
    @Import(name="writeAcceleratorEnabled")
    private @Nullable Output<Boolean> writeAcceleratorEnabled;

    /**
     * @return Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> writeAcceleratorEnabled() {
        return Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    private WindowsVirtualMachineOsDiskArgs() {}

    private WindowsVirtualMachineOsDiskArgs(WindowsVirtualMachineOsDiskArgs $) {
        this.caching = $.caching;
        this.diffDiskSettings = $.diffDiskSettings;
        this.diskEncryptionSetId = $.diskEncryptionSetId;
        this.diskSizeGb = $.diskSizeGb;
        this.name = $.name;
        this.storageAccountType = $.storageAccountType;
        this.writeAcceleratorEnabled = $.writeAcceleratorEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsVirtualMachineOsDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsVirtualMachineOsDiskArgs $;

        public Builder() {
            $ = new WindowsVirtualMachineOsDiskArgs();
        }

        public Builder(WindowsVirtualMachineOsDiskArgs defaults) {
            $ = new WindowsVirtualMachineOsDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caching The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(Output<String> caching) {
            $.caching = caching;
            return this;
        }

        /**
         * @param caching The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(String caching) {
            return caching(Output.of(caching));
        }

        /**
         * @param diffDiskSettings A `diff_disk_settings` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder diffDiskSettings(@Nullable Output<WindowsVirtualMachineOsDiskDiffDiskSettingsArgs> diffDiskSettings) {
            $.diffDiskSettings = diffDiskSettings;
            return this;
        }

        /**
         * @param diffDiskSettings A `diff_disk_settings` block as defined above.
         * 
         * @return builder
         * 
         */
        public Builder diffDiskSettings(WindowsVirtualMachineOsDiskDiffDiskSettingsArgs diffDiskSettings) {
            return diffDiskSettings(Output.of(diffDiskSettings));
        }

        /**
         * @param diskEncryptionSetId The ID of the Disk Encryption Set which should be used to Encrypt this OS Disk.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionSetId(@Nullable Output<String> diskEncryptionSetId) {
            $.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        /**
         * @param diskEncryptionSetId The ID of the Disk Encryption Set which should be used to Encrypt this OS Disk.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionSetId(String diskEncryptionSetId) {
            return diskEncryptionSetId(Output.of(diskEncryptionSetId));
        }

        /**
         * @param diskSizeGb The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine is sourced from.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine is sourced from.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param name The name which should be used for the Internal OS Disk. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for the Internal OS Disk. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param storageAccountType The Type of Storage Account which should back this the Internal OS Disk. Possible values are `Standard_LRS`, `StandardSSD_LRS`, `Premium_LRS`, `StandardSSD_ZRS` and `Premium_ZRS`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(Output<String> storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        /**
         * @param storageAccountType The Type of Storage Account which should back this the Internal OS Disk. Possible values are `Standard_LRS`, `StandardSSD_LRS`, `Premium_LRS`, `StandardSSD_ZRS` and `Premium_ZRS`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(String storageAccountType) {
            return storageAccountType(Output.of(storageAccountType));
        }

        /**
         * @param writeAcceleratorEnabled Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder writeAcceleratorEnabled(@Nullable Output<Boolean> writeAcceleratorEnabled) {
            $.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }

        /**
         * @param writeAcceleratorEnabled Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder writeAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
            return writeAcceleratorEnabled(Output.of(writeAcceleratorEnabled));
        }

        public WindowsVirtualMachineOsDiskArgs build() {
            $.caching = Objects.requireNonNull($.caching, "expected parameter 'caching' to be non-null");
            $.storageAccountType = Objects.requireNonNull($.storageAccountType, "expected parameter 'storageAccountType' to be non-null");
            return $;
        }
    }

}
