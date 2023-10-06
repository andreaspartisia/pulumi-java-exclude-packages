// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatastreamGcsConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastreamGcsConnectorArgs Empty = new DatastreamGcsConnectorArgs();

    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    @Import(name="compressLogs")
    private @Nullable Output<Boolean> compressLogs;

    public Optional<Output<Boolean>> compressLogs() {
        return Optional.ofNullable(this.compressLogs);
    }

    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    @Import(name="privateKey", required=true)
    private Output<String> privateKey;

    public Output<String> privateKey() {
        return this.privateKey;
    }

    @Import(name="projectId", required=true)
    private Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    @Import(name="serviceAccountName", required=true)
    private Output<String> serviceAccountName;

    public Output<String> serviceAccountName() {
        return this.serviceAccountName;
    }

    private DatastreamGcsConnectorArgs() {}

    private DatastreamGcsConnectorArgs(DatastreamGcsConnectorArgs $) {
        this.bucket = $.bucket;
        this.compressLogs = $.compressLogs;
        this.displayName = $.displayName;
        this.path = $.path;
        this.privateKey = $.privateKey;
        this.projectId = $.projectId;
        this.serviceAccountName = $.serviceAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastreamGcsConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastreamGcsConnectorArgs $;

        public Builder() {
            $ = new DatastreamGcsConnectorArgs();
        }

        public Builder(DatastreamGcsConnectorArgs defaults) {
            $ = new DatastreamGcsConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder compressLogs(@Nullable Output<Boolean> compressLogs) {
            $.compressLogs = compressLogs;
            return this;
        }

        public Builder compressLogs(Boolean compressLogs) {
            return compressLogs(Output.of(compressLogs));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder privateKey(Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder serviceAccountName(Output<String> serviceAccountName) {
            $.serviceAccountName = serviceAccountName;
            return this;
        }

        public Builder serviceAccountName(String serviceAccountName) {
            return serviceAccountName(Output.of(serviceAccountName));
        }

        public DatastreamGcsConnectorArgs build() {
            if ($.bucket == null) {
                throw new MissingRequiredPropertyException("DatastreamGcsConnectorArgs", "bucket");
            }
            if ($.displayName == null) {
                throw new MissingRequiredPropertyException("DatastreamGcsConnectorArgs", "displayName");
            }
            if ($.privateKey == null) {
                throw new MissingRequiredPropertyException("DatastreamGcsConnectorArgs", "privateKey");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("DatastreamGcsConnectorArgs", "projectId");
            }
            if ($.serviceAccountName == null) {
                throw new MissingRequiredPropertyException("DatastreamGcsConnectorArgs", "serviceAccountName");
            }
            return $;
        }
    }

}
