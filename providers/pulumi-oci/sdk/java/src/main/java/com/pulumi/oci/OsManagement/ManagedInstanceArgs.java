// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsManagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceArgs Empty = new ManagedInstanceArgs();

    /**
     * (Updatable) True if user allow data collection for this instance
     * 
     */
    @Import(name="isDataCollectionAuthorized")
    private @Nullable Output<Boolean> isDataCollectionAuthorized;

    /**
     * @return (Updatable) True if user allow data collection for this instance
     * 
     */
    public Optional<Output<Boolean>> isDataCollectionAuthorized() {
        return Optional.ofNullable(this.isDataCollectionAuthorized);
    }

    /**
     * OCID for the managed instance
     * 
     */
    @Import(name="managedInstanceId", required=true)
    private Output<String> managedInstanceId;

    /**
     * @return OCID for the managed instance
     * 
     */
    public Output<String> managedInstanceId() {
        return this.managedInstanceId;
    }

    /**
     * (Updatable) OCID of the ONS topic used to send notification to users
     * 
     */
    @Import(name="notificationTopicId")
    private @Nullable Output<String> notificationTopicId;

    /**
     * @return (Updatable) OCID of the ONS topic used to send notification to users
     * 
     */
    public Optional<Output<String>> notificationTopicId() {
        return Optional.ofNullable(this.notificationTopicId);
    }

    private ManagedInstanceArgs() {}

    private ManagedInstanceArgs(ManagedInstanceArgs $) {
        this.isDataCollectionAuthorized = $.isDataCollectionAuthorized;
        this.managedInstanceId = $.managedInstanceId;
        this.notificationTopicId = $.notificationTopicId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedInstanceArgs $;

        public Builder() {
            $ = new ManagedInstanceArgs();
        }

        public Builder(ManagedInstanceArgs defaults) {
            $ = new ManagedInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isDataCollectionAuthorized (Updatable) True if user allow data collection for this instance
         * 
         * @return builder
         * 
         */
        public Builder isDataCollectionAuthorized(@Nullable Output<Boolean> isDataCollectionAuthorized) {
            $.isDataCollectionAuthorized = isDataCollectionAuthorized;
            return this;
        }

        /**
         * @param isDataCollectionAuthorized (Updatable) True if user allow data collection for this instance
         * 
         * @return builder
         * 
         */
        public Builder isDataCollectionAuthorized(Boolean isDataCollectionAuthorized) {
            return isDataCollectionAuthorized(Output.of(isDataCollectionAuthorized));
        }

        /**
         * @param managedInstanceId OCID for the managed instance
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceId(Output<String> managedInstanceId) {
            $.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * @param managedInstanceId OCID for the managed instance
         * 
         * @return builder
         * 
         */
        public Builder managedInstanceId(String managedInstanceId) {
            return managedInstanceId(Output.of(managedInstanceId));
        }

        /**
         * @param notificationTopicId (Updatable) OCID of the ONS topic used to send notification to users
         * 
         * @return builder
         * 
         */
        public Builder notificationTopicId(@Nullable Output<String> notificationTopicId) {
            $.notificationTopicId = notificationTopicId;
            return this;
        }

        /**
         * @param notificationTopicId (Updatable) OCID of the ONS topic used to send notification to users
         * 
         * @return builder
         * 
         */
        public Builder notificationTopicId(String notificationTopicId) {
            return notificationTopicId(Output.of(notificationTopicId));
        }

        public ManagedInstanceArgs build() {
            $.managedInstanceId = Objects.requireNonNull($.managedInstanceId, "expected parameter 'managedInstanceId' to be non-null");
            return $;
        }
    }

}
