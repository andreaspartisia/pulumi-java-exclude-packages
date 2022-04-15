// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.deploymentmanager_alpha.enums.TemplateContentsInterpreter;
import io.pulumi.googlenative.deploymentmanager_alpha.inputs.ImportFileArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Files that make up the template contents of a template type.
 * 
 */
public final class TemplateContentsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateContentsArgs Empty = new TemplateContentsArgs();

    /**
     * Import files referenced by the main template.
     * 
     */
    @Import(name="imports")
      private final @Nullable Output<List<ImportFileArgs>> imports;

    public Output<List<ImportFileArgs>> imports() {
        return this.imports == null ? Codegen.empty() : this.imports;
    }

    /**
     * Which interpreter (python or jinja) should be used during expansion.
     * 
     */
    @Import(name="interpreter")
      private final @Nullable Output<TemplateContentsInterpreter> interpreter;

    public Output<TemplateContentsInterpreter> interpreter() {
        return this.interpreter == null ? Codegen.empty() : this.interpreter;
    }

    /**
     * The filename of the mainTemplate
     * 
     */
    @Import(name="mainTemplate")
      private final @Nullable Output<String> mainTemplate;

    public Output<String> mainTemplate() {
        return this.mainTemplate == null ? Codegen.empty() : this.mainTemplate;
    }

    /**
     * The contents of the template schema.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<String> schema;

    public Output<String> schema() {
        return this.schema == null ? Codegen.empty() : this.schema;
    }

    /**
     * The contents of the main template file.
     * 
     */
    @Import(name="template")
      private final @Nullable Output<String> template;

    public Output<String> template() {
        return this.template == null ? Codegen.empty() : this.template;
    }

    public TemplateContentsArgs(
        @Nullable Output<List<ImportFileArgs>> imports,
        @Nullable Output<TemplateContentsInterpreter> interpreter,
        @Nullable Output<String> mainTemplate,
        @Nullable Output<String> schema,
        @Nullable Output<String> template) {
        this.imports = imports;
        this.interpreter = interpreter;
        this.mainTemplate = mainTemplate;
        this.schema = schema;
        this.template = template;
    }

    private TemplateContentsArgs() {
        this.imports = Codegen.empty();
        this.interpreter = Codegen.empty();
        this.mainTemplate = Codegen.empty();
        this.schema = Codegen.empty();
        this.template = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateContentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ImportFileArgs>> imports;
        private @Nullable Output<TemplateContentsInterpreter> interpreter;
        private @Nullable Output<String> mainTemplate;
        private @Nullable Output<String> schema;
        private @Nullable Output<String> template;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateContentsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imports = defaults.imports;
    	      this.interpreter = defaults.interpreter;
    	      this.mainTemplate = defaults.mainTemplate;
    	      this.schema = defaults.schema;
    	      this.template = defaults.template;
        }

        public Builder imports(@Nullable Output<List<ImportFileArgs>> imports) {
            this.imports = imports;
            return this;
        }
        public Builder imports(@Nullable List<ImportFileArgs> imports) {
            this.imports = Codegen.ofNullable(imports);
            return this;
        }
        public Builder imports(ImportFileArgs... imports) {
            return imports(List.of(imports));
        }
        public Builder interpreter(@Nullable Output<TemplateContentsInterpreter> interpreter) {
            this.interpreter = interpreter;
            return this;
        }
        public Builder interpreter(@Nullable TemplateContentsInterpreter interpreter) {
            this.interpreter = Codegen.ofNullable(interpreter);
            return this;
        }
        public Builder mainTemplate(@Nullable Output<String> mainTemplate) {
            this.mainTemplate = mainTemplate;
            return this;
        }
        public Builder mainTemplate(@Nullable String mainTemplate) {
            this.mainTemplate = Codegen.ofNullable(mainTemplate);
            return this;
        }
        public Builder schema(@Nullable Output<String> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable String schema) {
            this.schema = Codegen.ofNullable(schema);
            return this;
        }
        public Builder template(@Nullable Output<String> template) {
            this.template = template;
            return this;
        }
        public Builder template(@Nullable String template) {
            this.template = Codegen.ofNullable(template);
            return this;
        }        public TemplateContentsArgs build() {
            return new TemplateContentsArgs(imports, interpreter, mainTemplate, schema, template);
        }
    }
}
