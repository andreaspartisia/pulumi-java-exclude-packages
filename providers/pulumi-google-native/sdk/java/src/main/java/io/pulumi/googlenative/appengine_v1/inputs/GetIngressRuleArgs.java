// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIngressRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIngressRuleArgs Empty = new GetIngressRuleArgs();

    @Import(name="appId", required=true)
      private final String appId;

    public String appId() {
        return this.appId;
    }

    @Import(name="ingressRuleId", required=true)
      private final String ingressRuleId;

    public String ingressRuleId() {
        return this.ingressRuleId;
    }

    public GetIngressRuleArgs(
        String appId,
        String ingressRuleId) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.ingressRuleId = Objects.requireNonNull(ingressRuleId, "expected parameter 'ingressRuleId' to be non-null");
    }

    private GetIngressRuleArgs() {
        this.appId = null;
        this.ingressRuleId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIngressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String ingressRuleId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIngressRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.ingressRuleId = defaults.ingressRuleId;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder ingressRuleId(String ingressRuleId) {
            this.ingressRuleId = Objects.requireNonNull(ingressRuleId);
            return this;
        }        public GetIngressRuleArgs build() {
            return new GetIngressRuleArgs(appId, ingressRuleId);
        }
    }
}
