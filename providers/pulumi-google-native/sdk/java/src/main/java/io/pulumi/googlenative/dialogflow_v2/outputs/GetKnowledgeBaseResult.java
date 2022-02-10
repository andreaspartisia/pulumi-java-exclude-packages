// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetKnowledgeBaseResult {
    private final String displayName;
    private final String languageCode;
    private final String name;

    @OutputCustomType.Constructor({"displayName","languageCode","name"})
    private GetKnowledgeBaseResult(
        String displayName,
        String languageCode,
        String name) {
        this.displayName = Objects.requireNonNull(displayName);
        this.languageCode = Objects.requireNonNull(languageCode);
        this.name = Objects.requireNonNull(name);
    }

    public String getDisplayName() {
        return this.displayName;
    }
    public String getLanguageCode() {
        return this.languageCode;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKnowledgeBaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String languageCode;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKnowledgeBaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.languageCode = defaults.languageCode;
    	      this.name = defaults.name;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setLanguageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public GetKnowledgeBaseResult build() {
            return new GetKnowledgeBaseResult(displayName, languageCode, name);
        }
    }
}