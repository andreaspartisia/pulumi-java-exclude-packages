// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.DiagnosticResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PollingOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final PollingOptionsResponse Empty = new PollingOptionsResponse();

    /**
     * An array of diagnostics to be collected by Deployment Manager, these diagnostics will be displayed to the user.
     * 
     */
    @Import(name="diagnostics", required=true)
      private final List<DiagnosticResponse> diagnostics;

    public List<DiagnosticResponse> diagnostics() {
        return this.diagnostics;
    }

    /**
     * JsonPath expression that determines if the request failed.
     * 
     */
    @Import(name="failCondition", required=true)
      private final String failCondition;

    public String failCondition() {
        return this.failCondition;
    }

    /**
     * JsonPath expression that determines if the request is completed.
     * 
     */
    @Import(name="finishCondition", required=true)
      private final String finishCondition;

    public String finishCondition() {
        return this.finishCondition;
    }

    /**
     * JsonPath expression that evaluates to string, it indicates where to poll.
     * 
     */
    @Import(name="pollingLink", required=true)
      private final String pollingLink;

    public String pollingLink() {
        return this.pollingLink;
    }

    /**
     * JsonPath expression, after polling is completed, indicates where to fetch the resource.
     * 
     */
    @Import(name="targetLink", required=true)
      private final String targetLink;

    public String targetLink() {
        return this.targetLink;
    }

    public PollingOptionsResponse(
        List<DiagnosticResponse> diagnostics,
        String failCondition,
        String finishCondition,
        String pollingLink,
        String targetLink) {
        this.diagnostics = Objects.requireNonNull(diagnostics, "expected parameter 'diagnostics' to be non-null");
        this.failCondition = Objects.requireNonNull(failCondition, "expected parameter 'failCondition' to be non-null");
        this.finishCondition = Objects.requireNonNull(finishCondition, "expected parameter 'finishCondition' to be non-null");
        this.pollingLink = Objects.requireNonNull(pollingLink, "expected parameter 'pollingLink' to be non-null");
        this.targetLink = Objects.requireNonNull(targetLink, "expected parameter 'targetLink' to be non-null");
    }

    private PollingOptionsResponse() {
        this.diagnostics = List.of();
        this.failCondition = null;
        this.finishCondition = null;
        this.pollingLink = null;
        this.targetLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PollingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DiagnosticResponse> diagnostics;
        private String failCondition;
        private String finishCondition;
        private String pollingLink;
        private String targetLink;

        public Builder() {
    	      // Empty
        }

        public Builder(PollingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diagnostics = defaults.diagnostics;
    	      this.failCondition = defaults.failCondition;
    	      this.finishCondition = defaults.finishCondition;
    	      this.pollingLink = defaults.pollingLink;
    	      this.targetLink = defaults.targetLink;
        }

        public Builder diagnostics(List<DiagnosticResponse> diagnostics) {
            this.diagnostics = Objects.requireNonNull(diagnostics);
            return this;
        }
        public Builder diagnostics(DiagnosticResponse... diagnostics) {
            return diagnostics(List.of(diagnostics));
        }
        public Builder failCondition(String failCondition) {
            this.failCondition = Objects.requireNonNull(failCondition);
            return this;
        }
        public Builder finishCondition(String finishCondition) {
            this.finishCondition = Objects.requireNonNull(finishCondition);
            return this;
        }
        public Builder pollingLink(String pollingLink) {
            this.pollingLink = Objects.requireNonNull(pollingLink);
            return this;
        }
        public Builder targetLink(String targetLink) {
            this.targetLink = Objects.requireNonNull(targetLink);
            return this;
        }        public PollingOptionsResponse build() {
            return new PollingOptionsResponse(diagnostics, failCondition, finishCondition, pollingLink, targetLink);
        }
    }
}
