// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.MethodResponse;
import io.pulumi.googlenative.servicemanagement_v1.inputs.MixinResponse;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionResponse;
import io.pulumi.googlenative.servicemanagement_v1.inputs.SourceContextResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Api is a light-weight descriptor for an API Interface. Interfaces are also described as "protocol buffer services" in some contexts, such as by the "service" keyword in a .proto file, but they are different from API Services, which represent a concrete implementation of an interface as opposed to simply a description of methods and bindings. They are also sometimes simply referred to as "APIs" in other contexts, such as the name of this message itself. See https://cloud.google.com/apis/design/glossary for detailed terminology.
 * 
 */
public final class ApiResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiResponse Empty = new ApiResponse();

    /**
     * The methods of this interface, in unspecified order.
     * 
     */
    @Import(name="methods", required=true)
      private final List<MethodResponse> methods;

    public List<MethodResponse> methods() {
        return this.methods;
    }

    /**
     * Included interfaces. See Mixin.
     * 
     */
    @Import(name="mixins", required=true)
      private final List<MixinResponse> mixins;

    public List<MixinResponse> mixins() {
        return this.mixins;
    }

    /**
     * The fully qualified name of this interface, including package name followed by the interface's simple name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Any metadata attached to the interface.
     * 
     */
    @Import(name="options", required=true)
      private final List<OptionResponse> options;

    public List<OptionResponse> options() {
        return this.options;
    }

    /**
     * Source context for the protocol buffer service represented by this message.
     * 
     */
    @Import(name="sourceContext", required=true)
      private final SourceContextResponse sourceContext;

    public SourceContextResponse sourceContext() {
        return this.sourceContext;
    }

    /**
     * The source syntax of the service.
     * 
     */
    @Import(name="syntax", required=true)
      private final String syntax;

    public String syntax() {
        return this.syntax;
    }

    /**
     * A version string for this interface. If specified, must have the form `major-version.minor-version`, as in `1.10`. If the minor version is omitted, it defaults to zero. If the entire version field is empty, the major version is derived from the package name, as outlined below. If the field is not empty, the version in the package name will be verified to be consistent with what is provided here. The versioning schema uses [semantic versioning](http://semver.org) where the major version number indicates a breaking change and the minor version an additive, non-breaking change. Both version numbers are signals to users what to expect from different versions, and should be carefully chosen based on the product plan. The major version is also reflected in the package name of the interface, which must end in `v`, as in `google.feature.v1`. For major versions 0 and 1, the suffix can be omitted. Zero major versions must only be used for experimental, non-GA interfaces.
     * 
     */
    @Import(name="version", required=true)
      private final String version;

    public String version() {
        return this.version;
    }

    public ApiResponse(
        List<MethodResponse> methods,
        List<MixinResponse> mixins,
        String name,
        List<OptionResponse> options,
        SourceContextResponse sourceContext,
        String syntax,
        String version) {
        this.methods = Objects.requireNonNull(methods, "expected parameter 'methods' to be non-null");
        this.mixins = Objects.requireNonNull(mixins, "expected parameter 'mixins' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.options = Objects.requireNonNull(options, "expected parameter 'options' to be non-null");
        this.sourceContext = Objects.requireNonNull(sourceContext, "expected parameter 'sourceContext' to be non-null");
        this.syntax = Objects.requireNonNull(syntax, "expected parameter 'syntax' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private ApiResponse() {
        this.methods = List.of();
        this.mixins = List.of();
        this.name = null;
        this.options = List.of();
        this.sourceContext = null;
        this.syntax = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MethodResponse> methods;
        private List<MixinResponse> mixins;
        private String name;
        private List<OptionResponse> options;
        private SourceContextResponse sourceContext;
        private String syntax;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.mixins = defaults.mixins;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.sourceContext = defaults.sourceContext;
    	      this.syntax = defaults.syntax;
    	      this.version = defaults.version;
        }

        public Builder methods(List<MethodResponse> methods) {
            this.methods = Objects.requireNonNull(methods);
            return this;
        }
        public Builder methods(MethodResponse... methods) {
            return methods(List.of(methods));
        }
        public Builder mixins(List<MixinResponse> mixins) {
            this.mixins = Objects.requireNonNull(mixins);
            return this;
        }
        public Builder mixins(MixinResponse... mixins) {
            return mixins(List.of(mixins));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder options(List<OptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder options(OptionResponse... options) {
            return options(List.of(options));
        }
        public Builder sourceContext(SourceContextResponse sourceContext) {
            this.sourceContext = Objects.requireNonNull(sourceContext);
            return this;
        }
        public Builder syntax(String syntax) {
            this.syntax = Objects.requireNonNull(syntax);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public ApiResponse build() {
            return new ApiResponse(methods, mixins, name, options, sourceContext, syntax, version);
        }
    }
}
