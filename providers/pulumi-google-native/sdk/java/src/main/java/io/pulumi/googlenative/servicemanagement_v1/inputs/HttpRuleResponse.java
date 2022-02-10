// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.CustomHttpPatternResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class HttpRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpRuleResponse Empty = new HttpRuleResponse();

    @InputImport(name="additionalBindings", required=true)
    private final List<HttpRuleResponse> additionalBindings;

    public List<HttpRuleResponse> getAdditionalBindings() {
        return this.additionalBindings;
    }

    @InputImport(name="body", required=true)
    private final String body;

    public String getBody() {
        return this.body;
    }

    @InputImport(name="custom", required=true)
    private final CustomHttpPatternResponse custom;

    public CustomHttpPatternResponse getCustom() {
        return this.custom;
    }

    @InputImport(name="delete", required=true)
    private final String delete;

    public String getDelete() {
        return this.delete;
    }

    @InputImport(name="get", required=true)
    private final String get;

    public String getGet() {
        return this.get;
    }

    @InputImport(name="patch", required=true)
    private final String patch;

    public String getPatch() {
        return this.patch;
    }

    @InputImport(name="post", required=true)
    private final String post;

    public String getPost() {
        return this.post;
    }

    @InputImport(name="put", required=true)
    private final String put;

    public String getPut() {
        return this.put;
    }

    @InputImport(name="responseBody", required=true)
    private final String responseBody;

    public String getResponseBody() {
        return this.responseBody;
    }

    @InputImport(name="selector", required=true)
    private final String selector;

    public String getSelector() {
        return this.selector;
    }

    public HttpRuleResponse(
        List<HttpRuleResponse> additionalBindings,
        String body,
        CustomHttpPatternResponse custom,
        String delete,
        String get,
        String patch,
        String post,
        String put,
        String responseBody,
        String selector) {
        this.additionalBindings = Objects.requireNonNull(additionalBindings, "expected parameter 'additionalBindings' to be non-null");
        this.body = Objects.requireNonNull(body, "expected parameter 'body' to be non-null");
        this.custom = Objects.requireNonNull(custom, "expected parameter 'custom' to be non-null");
        this.delete = Objects.requireNonNull(delete, "expected parameter 'delete' to be non-null");
        this.get = Objects.requireNonNull(get, "expected parameter 'get' to be non-null");
        this.patch = Objects.requireNonNull(patch, "expected parameter 'patch' to be non-null");
        this.post = Objects.requireNonNull(post, "expected parameter 'post' to be non-null");
        this.put = Objects.requireNonNull(put, "expected parameter 'put' to be non-null");
        this.responseBody = Objects.requireNonNull(responseBody, "expected parameter 'responseBody' to be non-null");
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
    }

    private HttpRuleResponse() {
        this.additionalBindings = List.of();
        this.body = null;
        this.custom = null;
        this.delete = null;
        this.get = null;
        this.patch = null;
        this.post = null;
        this.put = null;
        this.responseBody = null;
        this.selector = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HttpRuleResponse> additionalBindings;
        private String body;
        private CustomHttpPatternResponse custom;
        private String delete;
        private String get;
        private String patch;
        private String post;
        private String put;
        private String responseBody;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalBindings = defaults.additionalBindings;
    	      this.body = defaults.body;
    	      this.custom = defaults.custom;
    	      this.delete = defaults.delete;
    	      this.get = defaults.get;
    	      this.patch = defaults.patch;
    	      this.post = defaults.post;
    	      this.put = defaults.put;
    	      this.responseBody = defaults.responseBody;
    	      this.selector = defaults.selector;
        }

        public Builder setAdditionalBindings(List<HttpRuleResponse> additionalBindings) {
            this.additionalBindings = Objects.requireNonNull(additionalBindings);
            return this;
        }

        public Builder setBody(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder setCustom(CustomHttpPatternResponse custom) {
            this.custom = Objects.requireNonNull(custom);
            return this;
        }

        public Builder setDelete(String delete) {
            this.delete = Objects.requireNonNull(delete);
            return this;
        }

        public Builder setGet(String get) {
            this.get = Objects.requireNonNull(get);
            return this;
        }

        public Builder setPatch(String patch) {
            this.patch = Objects.requireNonNull(patch);
            return this;
        }

        public Builder setPost(String post) {
            this.post = Objects.requireNonNull(post);
            return this;
        }

        public Builder setPut(String put) {
            this.put = Objects.requireNonNull(put);
            return this;
        }

        public Builder setResponseBody(String responseBody) {
            this.responseBody = Objects.requireNonNull(responseBody);
            return this;
        }

        public Builder setSelector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public HttpRuleResponse build() {
            return new HttpRuleResponse(additionalBindings, body, custom, delete, get, patch, post, put, responseBody, selector);
        }
    }
}