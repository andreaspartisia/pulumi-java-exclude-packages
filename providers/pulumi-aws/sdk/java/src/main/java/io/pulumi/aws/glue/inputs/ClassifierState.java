// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.ClassifierCsvClassifierGetArgs;
import io.pulumi.aws.glue.inputs.ClassifierGrokClassifierGetArgs;
import io.pulumi.aws.glue.inputs.ClassifierJsonClassifierGetArgs;
import io.pulumi.aws.glue.inputs.ClassifierXmlClassifierGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClassifierState extends io.pulumi.resources.ResourceArgs {

    public static final ClassifierState Empty = new ClassifierState();

    /**
     * A classifier for Csv content. Defined below.
     * 
     */
    @InputImport(name="csvClassifier")
      private final @Nullable Input<ClassifierCsvClassifierGetArgs> csvClassifier;

    public Input<ClassifierCsvClassifierGetArgs> getCsvClassifier() {
        return this.csvClassifier == null ? Input.empty() : this.csvClassifier;
    }

    /**
     * A classifier that uses grok patterns. Defined below.
     * 
     */
    @InputImport(name="grokClassifier")
      private final @Nullable Input<ClassifierGrokClassifierGetArgs> grokClassifier;

    public Input<ClassifierGrokClassifierGetArgs> getGrokClassifier() {
        return this.grokClassifier == null ? Input.empty() : this.grokClassifier;
    }

    /**
     * A classifier for JSON content. Defined below.
     * 
     */
    @InputImport(name="jsonClassifier")
      private final @Nullable Input<ClassifierJsonClassifierGetArgs> jsonClassifier;

    public Input<ClassifierJsonClassifierGetArgs> getJsonClassifier() {
        return this.jsonClassifier == null ? Input.empty() : this.jsonClassifier;
    }

    /**
     * The name of the classifier.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A classifier for XML content. Defined below.
     * 
     */
    @InputImport(name="xmlClassifier")
      private final @Nullable Input<ClassifierXmlClassifierGetArgs> xmlClassifier;

    public Input<ClassifierXmlClassifierGetArgs> getXmlClassifier() {
        return this.xmlClassifier == null ? Input.empty() : this.xmlClassifier;
    }

    public ClassifierState(
        @Nullable Input<ClassifierCsvClassifierGetArgs> csvClassifier,
        @Nullable Input<ClassifierGrokClassifierGetArgs> grokClassifier,
        @Nullable Input<ClassifierJsonClassifierGetArgs> jsonClassifier,
        @Nullable Input<String> name,
        @Nullable Input<ClassifierXmlClassifierGetArgs> xmlClassifier) {
        this.csvClassifier = csvClassifier;
        this.grokClassifier = grokClassifier;
        this.jsonClassifier = jsonClassifier;
        this.name = name;
        this.xmlClassifier = xmlClassifier;
    }

    private ClassifierState() {
        this.csvClassifier = Input.empty();
        this.grokClassifier = Input.empty();
        this.jsonClassifier = Input.empty();
        this.name = Input.empty();
        this.xmlClassifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassifierState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClassifierCsvClassifierGetArgs> csvClassifier;
        private @Nullable Input<ClassifierGrokClassifierGetArgs> grokClassifier;
        private @Nullable Input<ClassifierJsonClassifierGetArgs> jsonClassifier;
        private @Nullable Input<String> name;
        private @Nullable Input<ClassifierXmlClassifierGetArgs> xmlClassifier;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassifierState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvClassifier = defaults.csvClassifier;
    	      this.grokClassifier = defaults.grokClassifier;
    	      this.jsonClassifier = defaults.jsonClassifier;
    	      this.name = defaults.name;
    	      this.xmlClassifier = defaults.xmlClassifier;
        }

        public Builder setCsvClassifier(@Nullable Input<ClassifierCsvClassifierGetArgs> csvClassifier) {
            this.csvClassifier = csvClassifier;
            return this;
        }

        public Builder setCsvClassifier(@Nullable ClassifierCsvClassifierGetArgs csvClassifier) {
            this.csvClassifier = Input.ofNullable(csvClassifier);
            return this;
        }

        public Builder setGrokClassifier(@Nullable Input<ClassifierGrokClassifierGetArgs> grokClassifier) {
            this.grokClassifier = grokClassifier;
            return this;
        }

        public Builder setGrokClassifier(@Nullable ClassifierGrokClassifierGetArgs grokClassifier) {
            this.grokClassifier = Input.ofNullable(grokClassifier);
            return this;
        }

        public Builder setJsonClassifier(@Nullable Input<ClassifierJsonClassifierGetArgs> jsonClassifier) {
            this.jsonClassifier = jsonClassifier;
            return this;
        }

        public Builder setJsonClassifier(@Nullable ClassifierJsonClassifierGetArgs jsonClassifier) {
            this.jsonClassifier = Input.ofNullable(jsonClassifier);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setXmlClassifier(@Nullable Input<ClassifierXmlClassifierGetArgs> xmlClassifier) {
            this.xmlClassifier = xmlClassifier;
            return this;
        }

        public Builder setXmlClassifier(@Nullable ClassifierXmlClassifierGetArgs xmlClassifier) {
            this.xmlClassifier = Input.ofNullable(xmlClassifier);
            return this;
        }
        public ClassifierState build() {
            return new ClassifierState(csvClassifier, grokClassifier, jsonClassifier, name, xmlClassifier);
        }
    }
}