// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105Behavior;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105Criterion;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105CustomOverride;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105Variable;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105 extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105 Empty = new GetPropertyRulesBuilderRulesV20230105();

    @Import(name="advancedOverride")
    private @Nullable String advancedOverride;

    public Optional<String> advancedOverride() {
        return Optional.ofNullable(this.advancedOverride);
    }

    @Import(name="behaviors")
    private @Nullable List<GetPropertyRulesBuilderRulesV20230105Behavior> behaviors;

    public Optional<List<GetPropertyRulesBuilderRulesV20230105Behavior>> behaviors() {
        return Optional.ofNullable(this.behaviors);
    }

    @Import(name="childrens")
    private @Nullable List<String> childrens;

    public Optional<List<String>> childrens() {
        return Optional.ofNullable(this.childrens);
    }

    @Import(name="comments")
    private @Nullable String comments;

    public Optional<String> comments() {
        return Optional.ofNullable(this.comments);
    }

    @Import(name="criteriaLocked")
    private @Nullable Boolean criteriaLocked;

    public Optional<Boolean> criteriaLocked() {
        return Optional.ofNullable(this.criteriaLocked);
    }

    @Import(name="criteriaMustSatisfy")
    private @Nullable String criteriaMustSatisfy;

    public Optional<String> criteriaMustSatisfy() {
        return Optional.ofNullable(this.criteriaMustSatisfy);
    }

    @Import(name="criterions")
    private @Nullable List<GetPropertyRulesBuilderRulesV20230105Criterion> criterions;

    public Optional<List<GetPropertyRulesBuilderRulesV20230105Criterion>> criterions() {
        return Optional.ofNullable(this.criterions);
    }

    @Import(name="customOverride")
    private @Nullable GetPropertyRulesBuilderRulesV20230105CustomOverride customOverride;

    public Optional<GetPropertyRulesBuilderRulesV20230105CustomOverride> customOverride() {
        return Optional.ofNullable(this.customOverride);
    }

    @Import(name="isSecure")
    private @Nullable Boolean isSecure;

    public Optional<Boolean> isSecure() {
        return Optional.ofNullable(this.isSecure);
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="templateLink")
    private @Nullable String templateLink;

    public Optional<String> templateLink() {
        return Optional.ofNullable(this.templateLink);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    @Import(name="variables")
    private @Nullable List<GetPropertyRulesBuilderRulesV20230105Variable> variables;

    public Optional<List<GetPropertyRulesBuilderRulesV20230105Variable>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private GetPropertyRulesBuilderRulesV20230105() {}

    private GetPropertyRulesBuilderRulesV20230105(GetPropertyRulesBuilderRulesV20230105 $) {
        this.advancedOverride = $.advancedOverride;
        this.behaviors = $.behaviors;
        this.childrens = $.childrens;
        this.comments = $.comments;
        this.criteriaLocked = $.criteriaLocked;
        this.criteriaMustSatisfy = $.criteriaMustSatisfy;
        this.criterions = $.criterions;
        this.customOverride = $.customOverride;
        this.isSecure = $.isSecure;
        this.name = $.name;
        this.templateLink = $.templateLink;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105 $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105 defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105(Objects.requireNonNull(defaults));
        }

        public Builder advancedOverride(@Nullable String advancedOverride) {
            $.advancedOverride = advancedOverride;
            return this;
        }

        public Builder behaviors(@Nullable List<GetPropertyRulesBuilderRulesV20230105Behavior> behaviors) {
            $.behaviors = behaviors;
            return this;
        }

        public Builder behaviors(GetPropertyRulesBuilderRulesV20230105Behavior... behaviors) {
            return behaviors(List.of(behaviors));
        }

        public Builder childrens(@Nullable List<String> childrens) {
            $.childrens = childrens;
            return this;
        }

        public Builder childrens(String... childrens) {
            return childrens(List.of(childrens));
        }

        public Builder comments(@Nullable String comments) {
            $.comments = comments;
            return this;
        }

        public Builder criteriaLocked(@Nullable Boolean criteriaLocked) {
            $.criteriaLocked = criteriaLocked;
            return this;
        }

        public Builder criteriaMustSatisfy(@Nullable String criteriaMustSatisfy) {
            $.criteriaMustSatisfy = criteriaMustSatisfy;
            return this;
        }

        public Builder criterions(@Nullable List<GetPropertyRulesBuilderRulesV20230105Criterion> criterions) {
            $.criterions = criterions;
            return this;
        }

        public Builder criterions(GetPropertyRulesBuilderRulesV20230105Criterion... criterions) {
            return criterions(List.of(criterions));
        }

        public Builder customOverride(@Nullable GetPropertyRulesBuilderRulesV20230105CustomOverride customOverride) {
            $.customOverride = customOverride;
            return this;
        }

        public Builder isSecure(@Nullable Boolean isSecure) {
            $.isSecure = isSecure;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder templateLink(@Nullable String templateLink) {
            $.templateLink = templateLink;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder variables(@Nullable List<GetPropertyRulesBuilderRulesV20230105Variable> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(GetPropertyRulesBuilderRulesV20230105Variable... variables) {
            return variables(List.of(variables));
        }

        public GetPropertyRulesBuilderRulesV20230105 build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("GetPropertyRulesBuilderRulesV20230105", "name");
            }
            return $;
        }
    }

}
