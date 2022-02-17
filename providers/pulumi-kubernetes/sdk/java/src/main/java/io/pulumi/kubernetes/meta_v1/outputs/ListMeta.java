// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListMeta {
    /**
     * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
     * 
     */
    private final @Nullable String $continue;
    /**
     * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
     * 
     */
    private final @Nullable Integer remainingItemCount;
    /**
     * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    private final @Nullable String resourceVersion;
    /**
     * selfLink is a URL representing this object. Populated by the system. Read-only.
     * 
     * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
     * 
     */
    private final @Nullable String selfLink;

    @OutputCustomType.Constructor({"$continue","remainingItemCount","resourceVersion","selfLink"})
    private ListMeta(
        @Nullable String $continue,
        @Nullable Integer remainingItemCount,
        @Nullable String resourceVersion,
        @Nullable String selfLink) {
        this.$continue = $continue;
        this.remainingItemCount = remainingItemCount;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
    }

    /**
     * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a consistent list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response, unless you have received this token from an error message.
     * 
     */
    public Optional<String> get$continue() {
        return Optional.ofNullable(this.$continue);
    }
    /**
     * remainingItemCount is the number of subsequent items in the list which are not included in this list response. If the list request contained label or field selectors, then the number of remaining items is unknown and the field will be left unset and omitted during serialization. If the list is complete (either because it is not chunking or because this is the last chunk), then there are no more remaining items and this field will be left unset and omitted during serialization. Servers older than v1.15 do not set this field. The intended use of the remainingItemCount is *estimating* the size of a collection. Clients should not rely on the remainingItemCount to be set or to be exact.
     * 
     */
    public Optional<Integer> getRemainingItemCount() {
        return Optional.ofNullable(this.remainingItemCount);
    }
    /**
     * String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
     * 
     */
    public Optional<String> getResourceVersion() {
        return Optional.ofNullable(this.resourceVersion);
    }
    /**
     * selfLink is a URL representing this object. Populated by the system. Read-only.
     * 
     * DEPRECATED Kubernetes will stop propagating this field in 1.20 release and the field is planned to be removed in 1.21 release.
     * 
     */
    public Optional<String> getSelfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMeta defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String $continue;
        private @Nullable Integer remainingItemCount;
        private @Nullable String resourceVersion;
        private @Nullable String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMeta defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$continue = defaults.$continue;
    	      this.remainingItemCount = defaults.remainingItemCount;
    	      this.resourceVersion = defaults.resourceVersion;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder set$continue(@Nullable String $continue) {
            this.$continue = $continue;
            return this;
        }

        public Builder setRemainingItemCount(@Nullable Integer remainingItemCount) {
            this.remainingItemCount = remainingItemCount;
            return this;
        }

        public Builder setResourceVersion(@Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public ListMeta build() {
            return new ListMeta($continue, remainingItemCount, resourceVersion, selfLink);
        }
    }
}