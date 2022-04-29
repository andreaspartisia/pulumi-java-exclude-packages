// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApmSynthetics.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ApmSynthetics.outputs.GetMonitorConfiguration;
import com.pulumi.oci.ApmSynthetics.outputs.GetMonitorScriptParameter;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMonitorResult {
    private final String apmDomainId;
    /**
     * @return Details of monitor configuration.
     * 
     */
    private final List<GetMonitorConfiguration> configurations;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return Unique name that can be edited. The name should not contain any confidential information.
     * 
     */
    private final String displayName;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the monitor.
     * 
     */
    private final String id;
    /**
     * @return If runOnce is enabled, then the monitor will run once.
     * 
     */
    private final Boolean isRunOnce;
    private final String monitorId;
    /**
     * @return Type of the monitor.
     * 
     */
    private final String monitorType;
    /**
     * @return Interval in seconds after the start time when the job should be repeated. Minimum repeatIntervalInSeconds should be 300 seconds.
     * 
     */
    private final Integer repeatIntervalInSeconds;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor types. For other monitor types, it should be set to null.
     * 
     */
    private final String scriptId;
    /**
     * @return Name of the script.
     * 
     */
    private final String scriptName;
    /**
     * @return List of script parameters. Example: `[{&#34;monitorScriptParameter&#34;: {&#34;paramName&#34;: &#34;userid&#34;, &#34;paramValue&#34;:&#34;testuser&#34;}, &#34;isSecret&#34;: false, &#34;isOverwritten&#34;: false}]`
     * 
     */
    private final List<GetMonitorScriptParameter> scriptParameters;
    /**
     * @return Enables or disables the monitor.
     * 
     */
    private final String status;
    /**
     * @return Specify the endpoint on which to run the monitor. For BROWSER and REST monitor types, target is mandatory. If target is specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script (specified by scriptId in monitor) against the specified target endpoint. If target is not specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script as it is.
     * 
     */
    private final String target;
    /**
     * @return The time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2020-02-12T22:47:12.613Z`
     * 
     */
    private final String timeCreated;
    /**
     * @return The time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2020-02-13T22:47:12.613Z`
     * 
     */
    private final String timeUpdated;
    /**
     * @return Timeout in seconds. Timeout cannot be more than 30% of repeatIntervalInSeconds time for monitors. Also, timeoutInSeconds should be a multiple of 60. Monitor will be allowed to run only for timeoutInSeconds time. It would be terminated after that.
     * 
     */
    private final Integer timeoutInSeconds;
    /**
     * @return Number of vantage points where monitor is running.
     * 
     */
    private final Integer vantagePointCount;
    /**
     * @return List of vantage points from where monitor is running.
     * 
     */
    private final List<String> vantagePoints;

    @CustomType.Constructor
    private GetMonitorResult(
        @CustomType.Parameter("apmDomainId") String apmDomainId,
        @CustomType.Parameter("configurations") List<GetMonitorConfiguration> configurations,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isRunOnce") Boolean isRunOnce,
        @CustomType.Parameter("monitorId") String monitorId,
        @CustomType.Parameter("monitorType") String monitorType,
        @CustomType.Parameter("repeatIntervalInSeconds") Integer repeatIntervalInSeconds,
        @CustomType.Parameter("scriptId") String scriptId,
        @CustomType.Parameter("scriptName") String scriptName,
        @CustomType.Parameter("scriptParameters") List<GetMonitorScriptParameter> scriptParameters,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("target") String target,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated,
        @CustomType.Parameter("timeoutInSeconds") Integer timeoutInSeconds,
        @CustomType.Parameter("vantagePointCount") Integer vantagePointCount,
        @CustomType.Parameter("vantagePoints") List<String> vantagePoints) {
        this.apmDomainId = apmDomainId;
        this.configurations = configurations;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isRunOnce = isRunOnce;
        this.monitorId = monitorId;
        this.monitorType = monitorType;
        this.repeatIntervalInSeconds = repeatIntervalInSeconds;
        this.scriptId = scriptId;
        this.scriptName = scriptName;
        this.scriptParameters = scriptParameters;
        this.status = status;
        this.target = target;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeoutInSeconds = timeoutInSeconds;
        this.vantagePointCount = vantagePointCount;
        this.vantagePoints = vantagePoints;
    }

    public String apmDomainId() {
        return this.apmDomainId;
    }
    /**
     * @return Details of monitor configuration.
     * 
     */
    public List<GetMonitorConfiguration> configurations() {
        return this.configurations;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return Unique name that can be edited. The name should not contain any confidential information.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the monitor.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return If runOnce is enabled, then the monitor will run once.
     * 
     */
    public Boolean isRunOnce() {
        return this.isRunOnce;
    }
    public String monitorId() {
        return this.monitorId;
    }
    /**
     * @return Type of the monitor.
     * 
     */
    public String monitorType() {
        return this.monitorType;
    }
    /**
     * @return Interval in seconds after the start time when the job should be repeated. Minimum repeatIntervalInSeconds should be 300 seconds.
     * 
     */
    public Integer repeatIntervalInSeconds() {
        return this.repeatIntervalInSeconds;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor types. For other monitor types, it should be set to null.
     * 
     */
    public String scriptId() {
        return this.scriptId;
    }
    /**
     * @return Name of the script.
     * 
     */
    public String scriptName() {
        return this.scriptName;
    }
    /**
     * @return List of script parameters. Example: `[{&#34;monitorScriptParameter&#34;: {&#34;paramName&#34;: &#34;userid&#34;, &#34;paramValue&#34;:&#34;testuser&#34;}, &#34;isSecret&#34;: false, &#34;isOverwritten&#34;: false}]`
     * 
     */
    public List<GetMonitorScriptParameter> scriptParameters() {
        return this.scriptParameters;
    }
    /**
     * @return Enables or disables the monitor.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Specify the endpoint on which to run the monitor. For BROWSER and REST monitor types, target is mandatory. If target is specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script (specified by scriptId in monitor) against the specified target endpoint. If target is not specified in the SCRIPTED_BROWSER monitor type, then the monitor will run the selected script as it is.
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return The time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2020-02-12T22:47:12.613Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2020-02-13T22:47:12.613Z`
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * @return Timeout in seconds. Timeout cannot be more than 30% of repeatIntervalInSeconds time for monitors. Also, timeoutInSeconds should be a multiple of 60. Monitor will be allowed to run only for timeoutInSeconds time. It would be terminated after that.
     * 
     */
    public Integer timeoutInSeconds() {
        return this.timeoutInSeconds;
    }
    /**
     * @return Number of vantage points where monitor is running.
     * 
     */
    public Integer vantagePointCount() {
        return this.vantagePointCount;
    }
    /**
     * @return List of vantage points from where monitor is running.
     * 
     */
    public List<String> vantagePoints() {
        return this.vantagePoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apmDomainId;
        private List<GetMonitorConfiguration> configurations;
        private Map<String,Object> definedTags;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isRunOnce;
        private String monitorId;
        private String monitorType;
        private Integer repeatIntervalInSeconds;
        private String scriptId;
        private String scriptName;
        private List<GetMonitorScriptParameter> scriptParameters;
        private String status;
        private String target;
        private String timeCreated;
        private String timeUpdated;
        private Integer timeoutInSeconds;
        private Integer vantagePointCount;
        private List<String> vantagePoints;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMonitorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apmDomainId = defaults.apmDomainId;
    	      this.configurations = defaults.configurations;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isRunOnce = defaults.isRunOnce;
    	      this.monitorId = defaults.monitorId;
    	      this.monitorType = defaults.monitorType;
    	      this.repeatIntervalInSeconds = defaults.repeatIntervalInSeconds;
    	      this.scriptId = defaults.scriptId;
    	      this.scriptName = defaults.scriptName;
    	      this.scriptParameters = defaults.scriptParameters;
    	      this.status = defaults.status;
    	      this.target = defaults.target;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.vantagePointCount = defaults.vantagePointCount;
    	      this.vantagePoints = defaults.vantagePoints;
        }

        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = Objects.requireNonNull(apmDomainId);
            return this;
        }
        public Builder configurations(List<GetMonitorConfiguration> configurations) {
            this.configurations = Objects.requireNonNull(configurations);
            return this;
        }
        public Builder configurations(GetMonitorConfiguration... configurations) {
            return configurations(List.of(configurations));
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isRunOnce(Boolean isRunOnce) {
            this.isRunOnce = Objects.requireNonNull(isRunOnce);
            return this;
        }
        public Builder monitorId(String monitorId) {
            this.monitorId = Objects.requireNonNull(monitorId);
            return this;
        }
        public Builder monitorType(String monitorType) {
            this.monitorType = Objects.requireNonNull(monitorType);
            return this;
        }
        public Builder repeatIntervalInSeconds(Integer repeatIntervalInSeconds) {
            this.repeatIntervalInSeconds = Objects.requireNonNull(repeatIntervalInSeconds);
            return this;
        }
        public Builder scriptId(String scriptId) {
            this.scriptId = Objects.requireNonNull(scriptId);
            return this;
        }
        public Builder scriptName(String scriptName) {
            this.scriptName = Objects.requireNonNull(scriptName);
            return this;
        }
        public Builder scriptParameters(List<GetMonitorScriptParameter> scriptParameters) {
            this.scriptParameters = Objects.requireNonNull(scriptParameters);
            return this;
        }
        public Builder scriptParameters(GetMonitorScriptParameter... scriptParameters) {
            return scriptParameters(List.of(scriptParameters));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = Objects.requireNonNull(timeoutInSeconds);
            return this;
        }
        public Builder vantagePointCount(Integer vantagePointCount) {
            this.vantagePointCount = Objects.requireNonNull(vantagePointCount);
            return this;
        }
        public Builder vantagePoints(List<String> vantagePoints) {
            this.vantagePoints = Objects.requireNonNull(vantagePoints);
            return this;
        }
        public Builder vantagePoints(String... vantagePoints) {
            return vantagePoints(List.of(vantagePoints));
        }        public GetMonitorResult build() {
            return new GetMonitorResult(apmDomainId, configurations, definedTags, displayName, freeformTags, id, isRunOnce, monitorId, monitorType, repeatIntervalInSeconds, scriptId, scriptName, scriptParameters, status, target, timeCreated, timeUpdated, timeoutInSeconds, vantagePointCount, vantagePoints);
        }
    }
}
