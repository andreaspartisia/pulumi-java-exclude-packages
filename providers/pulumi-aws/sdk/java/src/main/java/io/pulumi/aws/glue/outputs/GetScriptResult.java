// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.aws.glue.outputs.GetScriptDagEdge;
import io.pulumi.aws.glue.outputs.GetScriptDagNode;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScriptResult {
    private final List<GetScriptDagEdge> dagEdges;
    private final List<GetScriptDagNode> dagNodes;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String language;
    /**
     * The Python script generated from the DAG when the `language` argument is set to `PYTHON`.
     * 
     */
    private final String pythonScript;
    /**
     * The Scala code generated from the DAG when the `language` argument is set to `SCALA`.
     * 
     */
    private final String scalaCode;

    @OutputCustomType.Constructor
    private GetScriptResult(
        @OutputCustomType.Parameter("dagEdges") List<GetScriptDagEdge> dagEdges,
        @OutputCustomType.Parameter("dagNodes") List<GetScriptDagNode> dagNodes,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("language") @Nullable String language,
        @OutputCustomType.Parameter("pythonScript") String pythonScript,
        @OutputCustomType.Parameter("scalaCode") String scalaCode) {
        this.dagEdges = dagEdges;
        this.dagNodes = dagNodes;
        this.id = id;
        this.language = language;
        this.pythonScript = pythonScript;
        this.scalaCode = scalaCode;
    }

    public List<GetScriptDagEdge> getDagEdges() {
        return this.dagEdges;
    }
    public List<GetScriptDagNode> getDagNodes() {
        return this.dagNodes;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Optional<String> getLanguage() {
        return Optional.ofNullable(this.language);
    }
    /**
     * The Python script generated from the DAG when the `language` argument is set to `PYTHON`.
     * 
    */
    public String getPythonScript() {
        return this.pythonScript;
    }
    /**
     * The Scala code generated from the DAG when the `language` argument is set to `SCALA`.
     * 
    */
    public String getScalaCode() {
        return this.scalaCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetScriptDagEdge> dagEdges;
        private List<GetScriptDagNode> dagNodes;
        private String id;
        private @Nullable String language;
        private String pythonScript;
        private String scalaCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScriptResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dagEdges = defaults.dagEdges;
    	      this.dagNodes = defaults.dagNodes;
    	      this.id = defaults.id;
    	      this.language = defaults.language;
    	      this.pythonScript = defaults.pythonScript;
    	      this.scalaCode = defaults.scalaCode;
        }

        public Builder setDagEdges(List<GetScriptDagEdge> dagEdges) {
            this.dagEdges = Objects.requireNonNull(dagEdges);
            return this;
        }

        public Builder setDagNodes(List<GetScriptDagNode> dagNodes) {
            this.dagNodes = Objects.requireNonNull(dagNodes);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLanguage(@Nullable String language) {
            this.language = language;
            return this;
        }

        public Builder setPythonScript(String pythonScript) {
            this.pythonScript = Objects.requireNonNull(pythonScript);
            return this;
        }

        public Builder setScalaCode(String scalaCode) {
            this.scalaCode = Objects.requireNonNull(scalaCode);
            return this;
        }
        public GetScriptResult build() {
            return new GetScriptResult(dagEdges, dagNodes, id, language, pythonScript, scalaCode);
        }
    }
}