// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.networking.k8s.io_v1beta1.outputs.HTTPIngressRuleValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IngressRule {
    /**
     * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the "host" part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the
     * 	  IP in the Spec of the parent Ingress.
     * 2. The `:` delimiter is not respected because ports are not allowed.
     * 	  Currently the port of an Ingress is implicitly :80 for http and
     * 	  :443 for https.
     * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
     * 
     */
    private final @Nullable String host;
    private final @Nullable HTTPIngressRuleValue http;

    @OutputCustomType.Constructor({"host","http"})
    private IngressRule(
        @Nullable String host,
        @Nullable HTTPIngressRuleValue http) {
        this.host = host;
        this.http = http;
    }

    /**
     * Host is the fully qualified domain name of a network host, as defined by RFC 3986. Note the following deviations from the "host" part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the
     * 	  IP in the Spec of the parent Ingress.
     * 2. The `:` delimiter is not respected because ports are not allowed.
     * 	  Currently the port of an Ingress is implicitly :80 for http and
     * 	  :443 for https.
     * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
     * 
     */
    public Optional<String> getHost() {
        return Optional.ofNullable(this.host);
    }
    public Optional<HTTPIngressRuleValue> getHttp() {
        return Optional.ofNullable(this.http);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String host;
        private @Nullable HTTPIngressRuleValue http;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.http = defaults.http;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setHttp(@Nullable HTTPIngressRuleValue http) {
            this.http = http;
            return this;
        }

        public IngressRule build() {
            return new IngressRule(host, http);
        }
    }
}