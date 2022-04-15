// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Command describes a step performed as part of the build pipeline.
 * 
 */
public final class CommandResponse extends io.pulumi.resources.InvokeArgs {

    public static final CommandResponse Empty = new CommandResponse();

    /**
     * Command-line arguments used when executing this command.
     * 
     */
    @Import(name="args", required=true)
      private final List<String> args;

    public List<String> args() {
        return this.args;
    }

    /**
     * Working directory (relative to project source root) used when running this command.
     * 
     */
    @Import(name="dir", required=true)
      private final String dir;

    public String dir() {
        return this.dir;
    }

    /**
     * Environment variables set before running this command.
     * 
     */
    @Import(name="env", required=true)
      private final List<String> env;

    public List<String> env() {
        return this.env;
    }

    /**
     * Name of the command, as presented on the command line, or if the command is packaged as a Docker container, as presented to `docker pull`.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The ID(s) of the command(s) that this command depends on.
     * 
     */
    @Import(name="waitFor", required=true)
      private final List<String> waitFor;

    public List<String> waitFor() {
        return this.waitFor;
    }

    public CommandResponse(
        List<String> args,
        String dir,
        List<String> env,
        String name,
        List<String> waitFor) {
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.dir = Objects.requireNonNull(dir, "expected parameter 'dir' to be non-null");
        this.env = Objects.requireNonNull(env, "expected parameter 'env' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.waitFor = Objects.requireNonNull(waitFor, "expected parameter 'waitFor' to be non-null");
    }

    private CommandResponse() {
        this.args = List.of();
        this.dir = null;
        this.env = List.of();
        this.name = null;
        this.waitFor = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommandResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private String dir;
        private List<String> env;
        private String name;
        private List<String> waitFor;

        public Builder() {
    	      // Empty
        }

        public Builder(CommandResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.dir = defaults.dir;
    	      this.env = defaults.env;
    	      this.name = defaults.name;
    	      this.waitFor = defaults.waitFor;
        }

        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder dir(String dir) {
            this.dir = Objects.requireNonNull(dir);
            return this;
        }
        public Builder env(List<String> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }
        public Builder env(String... env) {
            return env(List.of(env));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder waitFor(List<String> waitFor) {
            this.waitFor = Objects.requireNonNull(waitFor);
            return this;
        }
        public Builder waitFor(String... waitFor) {
            return waitFor(List.of(waitFor));
        }        public CommandResponse build() {
            return new CommandResponse(args, dir, env, name, waitFor);
        }
    }
}
