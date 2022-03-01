// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContainerUlimit {
    private final Integer hard;
    private final String name;
    private final Integer soft;

    @OutputCustomType.Constructor({"hard","name","soft"})
    private ContainerUlimit(
        Integer hard,
        String name,
        Integer soft) {
        this.hard = Objects.requireNonNull(hard);
        this.name = Objects.requireNonNull(name);
        this.soft = Objects.requireNonNull(soft);
    }

    public Integer getHard() {
        return this.hard;
    }
    public String getName() {
        return this.name;
    }
    public Integer getSoft() {
        return this.soft;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerUlimit defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hard;
        private String name;
        private Integer soft;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerUlimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hard = defaults.hard;
    	      this.name = defaults.name;
    	      this.soft = defaults.soft;
        }

        public Builder setHard(Integer hard) {
            this.hard = Objects.requireNonNull(hard);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSoft(Integer soft) {
            this.soft = Objects.requireNonNull(soft);
            return this;
        }
        public ContainerUlimit build() {
            return new ContainerUlimit(hard, name, soft);
        }
    }
}
