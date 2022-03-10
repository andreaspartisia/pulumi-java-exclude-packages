// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter {
    /**
     * The parameter name.
     * 
     */
    private final String name;
    /**
     * The array of strings.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor
    private MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("values") List<String> values) {
        this.name = name;
        this.values = values;
    }

    /**
     * The parameter name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The array of strings.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter build() {
            return new MaintenanceWindowTaskTaskInvocationParametersAutomationParametersParameter(name, values);
        }
    }
}