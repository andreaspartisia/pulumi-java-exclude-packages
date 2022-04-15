// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A file or script to execute.
 * 
 */
public final class OSPolicyResourceExecResourceExecResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceExecResourceExecResponse Empty = new OSPolicyResourceExecResourceExecResponse();

    /**
     * Optional arguments to pass to the source during execution.
     * 
     */
    @Import(name="args", required=true)
      private final List<String> args;

    public List<String> args() {
        return this.args;
    }

    /**
     * A remote or local file.
     * 
     */
    @Import(name="file", required=true)
      private final OSPolicyResourceFileResponse file;

    public OSPolicyResourceFileResponse file() {
        return this.file;
    }

    /**
     * The script interpreter to use.
     * 
     */
    @Import(name="interpreter", required=true)
      private final String interpreter;

    public String interpreter() {
        return this.interpreter;
    }

    /**
     * Only recorded for enforce Exec. Path to an output file (that is created by this Exec) whose content will be recorded in OSPolicyResourceCompliance after a successful run. Absence or failure to read this file will result in this ExecResource being non-compliant. Output file size is limited to 100K bytes.
     * 
     */
    @Import(name="outputFilePath", required=true)
      private final String outputFilePath;

    public String outputFilePath() {
        return this.outputFilePath;
    }

    /**
     * An inline script. The size of the script is limited to 1024 characters.
     * 
     */
    @Import(name="script", required=true)
      private final String script;

    public String script() {
        return this.script;
    }

    public OSPolicyResourceExecResourceExecResponse(
        List<String> args,
        OSPolicyResourceFileResponse file,
        String interpreter,
        String outputFilePath,
        String script) {
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.file = Objects.requireNonNull(file, "expected parameter 'file' to be non-null");
        this.interpreter = Objects.requireNonNull(interpreter, "expected parameter 'interpreter' to be non-null");
        this.outputFilePath = Objects.requireNonNull(outputFilePath, "expected parameter 'outputFilePath' to be non-null");
        this.script = Objects.requireNonNull(script, "expected parameter 'script' to be non-null");
    }

    private OSPolicyResourceExecResourceExecResponse() {
        this.args = List.of();
        this.file = null;
        this.interpreter = null;
        this.outputFilePath = null;
        this.script = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceExecResourceExecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private OSPolicyResourceFileResponse file;
        private String interpreter;
        private String outputFilePath;
        private String script;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceExecResourceExecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.file = defaults.file;
    	      this.interpreter = defaults.interpreter;
    	      this.outputFilePath = defaults.outputFilePath;
    	      this.script = defaults.script;
        }

        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder file(OSPolicyResourceFileResponse file) {
            this.file = Objects.requireNonNull(file);
            return this;
        }
        public Builder interpreter(String interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }
        public Builder outputFilePath(String outputFilePath) {
            this.outputFilePath = Objects.requireNonNull(outputFilePath);
            return this;
        }
        public Builder script(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }        public OSPolicyResourceExecResourceExecResponse build() {
            return new OSPolicyResourceExecResourceExecResponse(args, file, interpreter, outputFilePath, script);
        }
    }
}
