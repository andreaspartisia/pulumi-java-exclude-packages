// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.WidgetResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RowResponse extends io.pulumi.resources.InvokeArgs {

    public static final RowResponse Empty = new RowResponse();

    @InputImport(name="weight", required=true)
    private final String weight;

    public String getWeight() {
        return this.weight;
    }

    @InputImport(name="widgets", required=true)
    private final List<WidgetResponse> widgets;

    public List<WidgetResponse> getWidgets() {
        return this.widgets;
    }

    public RowResponse(
        String weight,
        List<WidgetResponse> widgets) {
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
        this.widgets = Objects.requireNonNull(widgets, "expected parameter 'widgets' to be non-null");
    }

    private RowResponse() {
        this.weight = null;
        this.widgets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String weight;
        private List<WidgetResponse> widgets;

        public Builder() {
    	      // Empty
        }

        public Builder(RowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weight = defaults.weight;
    	      this.widgets = defaults.widgets;
        }

        public Builder setWeight(String weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public Builder setWidgets(List<WidgetResponse> widgets) {
            this.widgets = Objects.requireNonNull(widgets);
            return this;
        }

        public RowResponse build() {
            return new RowResponse(weight, widgets);
        }
    }
}