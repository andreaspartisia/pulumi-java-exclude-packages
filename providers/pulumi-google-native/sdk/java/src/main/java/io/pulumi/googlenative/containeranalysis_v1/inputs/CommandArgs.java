// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CommandArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommandArgs Empty = new CommandArgs();

    @InputImport(name="args")
    private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    @InputImport(name="dir")
    private final @Nullable Input<String> dir;

    public Input<String> getDir() {
        return this.dir == null ? Input.empty() : this.dir;
    }

    @InputImport(name="env")
    private final @Nullable Input<List<String>> env;

    public Input<List<String>> getEnv() {
        return this.env == null ? Input.empty() : this.env;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="waitFor")
    private final @Nullable Input<List<String>> waitFor;

    public Input<List<String>> getWaitFor() {
        return this.waitFor == null ? Input.empty() : this.waitFor;
    }

    public CommandArgs(
        @Nullable Input<List<String>> args,
        @Nullable Input<String> dir,
        @Nullable Input<List<String>> env,
        @Nullable Input<String> id,
        Input<String> name,
        @Nullable Input<List<String>> waitFor) {
        this.args = args;
        this.dir = dir;
        this.env = env;
        this.id = id;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.waitFor = waitFor;
    }

    private CommandArgs() {
        this.args = Input.empty();
        this.dir = Input.empty();
        this.env = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.waitFor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> args;
        private @Nullable Input<String> dir;
        private @Nullable Input<List<String>> env;
        private @Nullable Input<String> id;
        private Input<String> name;
        private @Nullable Input<List<String>> waitFor;

        public Builder() {
    	      // Empty
        }

        public Builder(CommandArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.dir = defaults.dir;
    	      this.env = defaults.env;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.waitFor = defaults.waitFor;
        }

        public Builder setArgs(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder setDir(@Nullable Input<String> dir) {
            this.dir = dir;
            return this;
        }

        public Builder setDir(@Nullable String dir) {
            this.dir = Input.ofNullable(dir);
            return this;
        }

        public Builder setEnv(@Nullable Input<List<String>> env) {
            this.env = env;
            return this;
        }

        public Builder setEnv(@Nullable List<String> env) {
            this.env = Input.ofNullable(env);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setWaitFor(@Nullable Input<List<String>> waitFor) {
            this.waitFor = waitFor;
            return this;
        }

        public Builder setWaitFor(@Nullable List<String> waitFor) {
            this.waitFor = Input.ofNullable(waitFor);
            return this;
        }

        public CommandArgs build() {
            return new CommandArgs(args, dir, env, id, name, waitFor);
        }
    }
}