// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VideoStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoStreamArgs Empty = new VideoStreamArgs();

    /**
     * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
     * 
     */
    @InputImport(name="dataRetentionInHours")
      private final @Nullable Input<Integer> dataRetentionInHours;

    public Input<Integer> getDataRetentionInHours() {
        return this.dataRetentionInHours == null ? Input.empty() : this.dataRetentionInHours;
    }

    /**
     * The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
     * 
     */
    @InputImport(name="deviceName")
      private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
     * 
     */
    @InputImport(name="kmsKeyId")
      private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
     * 
     */
    @InputImport(name="mediaType")
      private final @Nullable Input<String> mediaType;

    public Input<String> getMediaType() {
        return this.mediaType == null ? Input.empty() : this.mediaType;
    }

    /**
     * A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public VideoStreamArgs(
        @Nullable Input<Integer> dataRetentionInHours,
        @Nullable Input<String> deviceName,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<String> mediaType,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags) {
        this.dataRetentionInHours = dataRetentionInHours;
        this.deviceName = deviceName;
        this.kmsKeyId = kmsKeyId;
        this.mediaType = mediaType;
        this.name = name;
        this.tags = tags;
    }

    private VideoStreamArgs() {
        this.dataRetentionInHours = Input.empty();
        this.deviceName = Input.empty();
        this.kmsKeyId = Input.empty();
        this.mediaType = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> dataRetentionInHours;
        private @Nullable Input<String> deviceName;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<String> mediaType;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRetentionInHours = defaults.dataRetentionInHours;
    	      this.deviceName = defaults.deviceName;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.mediaType = defaults.mediaType;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setDataRetentionInHours(@Nullable Input<Integer> dataRetentionInHours) {
            this.dataRetentionInHours = dataRetentionInHours;
            return this;
        }

        public Builder setDataRetentionInHours(@Nullable Integer dataRetentionInHours) {
            this.dataRetentionInHours = Input.ofNullable(dataRetentionInHours);
            return this;
        }

        public Builder setDeviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder setDeviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setMediaType(@Nullable Input<String> mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        public Builder setMediaType(@Nullable String mediaType) {
            this.mediaType = Input.ofNullable(mediaType);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public VideoStreamArgs build() {
            return new VideoStreamArgs(dataRetentionInHours, deviceName, kmsKeyId, mediaType, name, tags);
        }
    }
}