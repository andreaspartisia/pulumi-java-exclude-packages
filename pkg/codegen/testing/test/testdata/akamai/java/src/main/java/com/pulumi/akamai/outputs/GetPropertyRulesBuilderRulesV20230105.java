// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105Behavior;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105Criterion;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105CustomOverride;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105Variable;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105 {
    private @Nullable String advancedOverride;
    private @Nullable List<GetPropertyRulesBuilderRulesV20230105Behavior> behaviors;
    private @Nullable List<String> childrens;
    private @Nullable String comments;
    private @Nullable Boolean criteriaLocked;
    private @Nullable String criteriaMustSatisfy;
    private @Nullable List<GetPropertyRulesBuilderRulesV20230105Criterion> criterions;
    private @Nullable GetPropertyRulesBuilderRulesV20230105CustomOverride customOverride;
    private @Nullable Boolean isSecure;
    private String name;
    private @Nullable String templateLink;
    private @Nullable String templateUuid;
    private @Nullable String uuid;
    private @Nullable List<GetPropertyRulesBuilderRulesV20230105Variable> variables;

    private GetPropertyRulesBuilderRulesV20230105() {}
    public Optional<String> advancedOverride() {
        return Optional.ofNullable(this.advancedOverride);
    }
    public List<GetPropertyRulesBuilderRulesV20230105Behavior> behaviors() {
        return this.behaviors == null ? List.of() : this.behaviors;
    }
    public List<String> childrens() {
        return this.childrens == null ? List.of() : this.childrens;
    }
    public Optional<String> comments() {
        return Optional.ofNullable(this.comments);
    }
    public Optional<Boolean> criteriaLocked() {
        return Optional.ofNullable(this.criteriaLocked);
    }
    public Optional<String> criteriaMustSatisfy() {
        return Optional.ofNullable(this.criteriaMustSatisfy);
    }
    public List<GetPropertyRulesBuilderRulesV20230105Criterion> criterions() {
        return this.criterions == null ? List.of() : this.criterions;
    }
    public Optional<GetPropertyRulesBuilderRulesV20230105CustomOverride> customOverride() {
        return Optional.ofNullable(this.customOverride);
    }
    public Optional<Boolean> isSecure() {
        return Optional.ofNullable(this.isSecure);
    }
    public String name() {
        return this.name;
    }
    public Optional<String> templateLink() {
        return Optional.ofNullable(this.templateLink);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public List<GetPropertyRulesBuilderRulesV20230105Variable> variables() {
        return this.variables == null ? List.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String advancedOverride;
        private @Nullable List<GetPropertyRulesBuilderRulesV20230105Behavior> behaviors;
        private @Nullable List<String> childrens;
        private @Nullable String comments;
        private @Nullable Boolean criteriaLocked;
        private @Nullable String criteriaMustSatisfy;
        private @Nullable List<GetPropertyRulesBuilderRulesV20230105Criterion> criterions;
        private @Nullable GetPropertyRulesBuilderRulesV20230105CustomOverride customOverride;
        private @Nullable Boolean isSecure;
        private String name;
        private @Nullable String templateLink;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        private @Nullable List<GetPropertyRulesBuilderRulesV20230105Variable> variables;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedOverride = defaults.advancedOverride;
    	      this.behaviors = defaults.behaviors;
    	      this.childrens = defaults.childrens;
    	      this.comments = defaults.comments;
    	      this.criteriaLocked = defaults.criteriaLocked;
    	      this.criteriaMustSatisfy = defaults.criteriaMustSatisfy;
    	      this.criterions = defaults.criterions;
    	      this.customOverride = defaults.customOverride;
    	      this.isSecure = defaults.isSecure;
    	      this.name = defaults.name;
    	      this.templateLink = defaults.templateLink;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
    	      this.variables = defaults.variables;
        }

        @CustomType.Setter
        public Builder advancedOverride(@Nullable String advancedOverride) {

            this.advancedOverride = advancedOverride;
            return this;
        }
        @CustomType.Setter
        public Builder behaviors(@Nullable List<GetPropertyRulesBuilderRulesV20230105Behavior> behaviors) {

            this.behaviors = behaviors;
            return this;
        }
        public Builder behaviors(GetPropertyRulesBuilderRulesV20230105Behavior... behaviors) {
            return behaviors(List.of(behaviors));
        }
        @CustomType.Setter
        public Builder childrens(@Nullable List<String> childrens) {

            this.childrens = childrens;
            return this;
        }
        public Builder childrens(String... childrens) {
            return childrens(List.of(childrens));
        }
        @CustomType.Setter
        public Builder comments(@Nullable String comments) {

            this.comments = comments;
            return this;
        }
        @CustomType.Setter
        public Builder criteriaLocked(@Nullable Boolean criteriaLocked) {

            this.criteriaLocked = criteriaLocked;
            return this;
        }
        @CustomType.Setter
        public Builder criteriaMustSatisfy(@Nullable String criteriaMustSatisfy) {

            this.criteriaMustSatisfy = criteriaMustSatisfy;
            return this;
        }
        @CustomType.Setter
        public Builder criterions(@Nullable List<GetPropertyRulesBuilderRulesV20230105Criterion> criterions) {

            this.criterions = criterions;
            return this;
        }
        public Builder criterions(GetPropertyRulesBuilderRulesV20230105Criterion... criterions) {
            return criterions(List.of(criterions));
        }
        @CustomType.Setter
        public Builder customOverride(@Nullable GetPropertyRulesBuilderRulesV20230105CustomOverride customOverride) {

            this.customOverride = customOverride;
            return this;
        }
        @CustomType.Setter
        public Builder isSecure(@Nullable Boolean isSecure) {

            this.isSecure = isSecure;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetPropertyRulesBuilderRulesV20230105", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder templateLink(@Nullable String templateLink) {

            this.templateLink = templateLink;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder variables(@Nullable List<GetPropertyRulesBuilderRulesV20230105Variable> variables) {

            this.variables = variables;
            return this;
        }
        public Builder variables(GetPropertyRulesBuilderRulesV20230105Variable... variables) {
            return variables(List.of(variables));
        }
        public GetPropertyRulesBuilderRulesV20230105 build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105();
            _resultValue.advancedOverride = advancedOverride;
            _resultValue.behaviors = behaviors;
            _resultValue.childrens = childrens;
            _resultValue.comments = comments;
            _resultValue.criteriaLocked = criteriaLocked;
            _resultValue.criteriaMustSatisfy = criteriaMustSatisfy;
            _resultValue.criterions = criterions;
            _resultValue.customOverride = customOverride;
            _resultValue.isSecure = isSecure;
            _resultValue.name = name;
            _resultValue.templateLink = templateLink;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            _resultValue.variables = variables;
            return _resultValue;
        }
    }
}
