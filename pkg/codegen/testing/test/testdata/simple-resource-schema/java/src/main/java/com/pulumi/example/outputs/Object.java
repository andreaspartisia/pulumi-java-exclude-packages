// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.example.Resource;
import com.pulumi.example.outputs.ConfigMap;
import com.pulumi.example.outputs.SomeOtherObject;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class Object {
    private @Nullable String bar;
    private @Nullable List<ConfigMap> configs;
    private @Nullable Resource foo;
    /**
     * @return List of lists of other objects
     * 
     */
    private @Nullable List<List<SomeOtherObject>> others;
    /**
     * @return Mapping from string to list of some other object
     * 
     */
    private @Nullable Map<String,List<SomeOtherObject>> stillOthers;

    private Object() {}
    public Optional<String> bar() {
        return Optional.ofNullable(this.bar);
    }
    public List<ConfigMap> configs() {
        return this.configs == null ? List.of() : this.configs;
    }
    public Optional<Resource> foo() {
        return Optional.ofNullable(this.foo);
    }
    /**
     * @return List of lists of other objects
     * 
     */
    public List<List<SomeOtherObject>> others() {
        return this.others == null ? List.of() : this.others;
    }
    /**
     * @return Mapping from string to list of some other object
     * 
     */
    public Map<String,List<SomeOtherObject>> stillOthers() {
        return this.stillOthers == null ? Map.of() : this.stillOthers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Object defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bar;
        private @Nullable List<ConfigMap> configs;
        private @Nullable Resource foo;
        private @Nullable List<List<SomeOtherObject>> others;
        private @Nullable Map<String,List<SomeOtherObject>> stillOthers;
        public Builder() {}
        public Builder(Object defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bar = defaults.bar;
    	      this.configs = defaults.configs;
    	      this.foo = defaults.foo;
    	      this.others = defaults.others;
    	      this.stillOthers = defaults.stillOthers;
        }

        @CustomType.Setter
        public Builder bar(@Nullable String bar) {
            this.bar = bar;
            return this;
        }
        @CustomType.Setter
        public Builder configs(@Nullable List<ConfigMap> configs) {
            this.configs = configs;
            return this;
        }
        public Builder configs(ConfigMap... configs) {
            return configs(List.of(configs));
        }
        @CustomType.Setter
        public Builder foo(@Nullable Resource foo) {
            this.foo = foo;
            return this;
        }
        @CustomType.Setter
        public Builder others(@Nullable List<List<SomeOtherObject>> others) {
            this.others = others;
            return this;
        }
        @CustomType.Setter
        public Builder stillOthers(@Nullable Map<String,List<SomeOtherObject>> stillOthers) {
            this.stillOthers = stillOthers;
            return this;
        }
        public Object build() {
            final var o = new Object();
            o.bar = bar;
            o.configs = configs;
            o.foo = foo;
            o.others = others;
            o.stillOthers = stillOthers;
            return o;
        }
    }
}
