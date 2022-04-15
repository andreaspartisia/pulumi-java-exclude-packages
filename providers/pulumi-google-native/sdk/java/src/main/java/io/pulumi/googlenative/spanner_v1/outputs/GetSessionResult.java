// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.spanner_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSessionResult {
    /**
     * The approximate timestamp when the session is last used. It is typically earlier than the actual last use time.
     * 
     */
    private final String approximateLastUseTime;
    /**
     * The timestamp when the session is created.
     * 
     */
    private final String createTime;
    /**
     * The labels for the session. * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. * No more than 64 labels can be associated with a given session. See https://goo.gl/xmQnxf for more information on and examples of labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The name of the session. This is always system-assigned.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetSessionResult(
        @CustomType.Parameter("approximateLastUseTime") String approximateLastUseTime,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name) {
        this.approximateLastUseTime = approximateLastUseTime;
        this.createTime = createTime;
        this.labels = labels;
        this.name = name;
    }

    /**
     * The approximate timestamp when the session is last used. It is typically earlier than the actual last use time.
     * 
    */
    public String approximateLastUseTime() {
        return this.approximateLastUseTime;
    }
    /**
     * The timestamp when the session is created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * The labels for the session. * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. * Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. * No more than 64 labels can be associated with a given session. See https://goo.gl/xmQnxf for more information on and examples of labels.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The name of the session. This is always system-assigned.
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSessionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String approximateLastUseTime;
        private String createTime;
        private Map<String,String> labels;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSessionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approximateLastUseTime = defaults.approximateLastUseTime;
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder approximateLastUseTime(String approximateLastUseTime) {
            this.approximateLastUseTime = Objects.requireNonNull(approximateLastUseTime);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetSessionResult build() {
            return new GetSessionResult(approximateLastUseTime, createTime, labels, name);
        }
    }
}
