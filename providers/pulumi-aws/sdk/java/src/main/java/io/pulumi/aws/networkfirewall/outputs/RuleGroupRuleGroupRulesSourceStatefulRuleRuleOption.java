// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption {
    /**
     * Keyword defined by open source detection systems like Snort or Suricata for stateful rule inspection.
     * See [Snort General Rule Options](http://manual-snort-org.s3-website-us-east-1.amazonaws.com/node31.html) or [Suricata Rule Options](https://suricata.readthedocs.io/en/suricata-5.0.1/rules/intro.html#rule-options) for more details.
     * 
     */
    private final String keyword;
    /**
     * Set of strings for additional settings to use in stateful rule inspection.
     * 
     */
    private final @Nullable List<String> settings;

    @OutputCustomType.Constructor
    private RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption(
        @OutputCustomType.Parameter("keyword") String keyword,
        @OutputCustomType.Parameter("settings") @Nullable List<String> settings) {
        this.keyword = keyword;
        this.settings = settings;
    }

    /**
     * Keyword defined by open source detection systems like Snort or Suricata for stateful rule inspection.
     * See [Snort General Rule Options](http://manual-snort-org.s3-website-us-east-1.amazonaws.com/node31.html) or [Suricata Rule Options](https://suricata.readthedocs.io/en/suricata-5.0.1/rules/intro.html#rule-options) for more details.
     * 
    */
    public String getKeyword() {
        return this.keyword;
    }
    /**
     * Set of strings for additional settings to use in stateful rule inspection.
     * 
    */
    public List<String> getSettings() {
        return this.settings == null ? List.of() : this.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyword;
        private @Nullable List<String> settings;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyword = defaults.keyword;
    	      this.settings = defaults.settings;
        }

        public Builder setKeyword(String keyword) {
            this.keyword = Objects.requireNonNull(keyword);
            return this;
        }

        public Builder setSettings(@Nullable List<String> settings) {
            this.settings = settings;
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption build() {
            return new RuleGroupRuleGroupRulesSourceStatefulRuleRuleOption(keyword, settings);
        }
    }
}