// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @InputImport(name="andStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs> andStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs> getAndStatement() {
        return this.andStatement == null ? Input.empty() : this.andStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @InputImport(name="byteMatchStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs> getByteMatchStatement() {
        return this.byteMatchStatement == null ? Input.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @InputImport(name="geoMatchStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs> getGeoMatchStatement() {
        return this.geoMatchStatement == null ? Input.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @InputImport(name="ipSetReferenceStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs> getIpSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Input.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @InputImport(name="labelMatchStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs> getLabelMatchStatement() {
        return this.labelMatchStatement == null ? Input.empty() : this.labelMatchStatement;
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @InputImport(name="notStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs> notStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs> getNotStatement() {
        return this.notStatement == null ? Input.empty() : this.notStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @InputImport(name="orStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs> orStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs> getOrStatement() {
        return this.orStatement == null ? Input.empty() : this.orStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @InputImport(name="regexPatternSetReferenceStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> getRegexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Input.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (>) or less than (<). See Size Constraint Statement below for more details.
     * 
     */
    @InputImport(name="sizeConstraintStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs> getSizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Input.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @InputImport(name="sqliMatchStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs> getSqliMatchStatement() {
        return this.sqliMatchStatement == null ? Input.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @InputImport(name="xssMatchStatement")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs> getXssMatchStatement() {
        return this.xssMatchStatement == null ? Input.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs(
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs> andStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs> notStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs> orStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs() {
        this.andStatement = Input.empty();
        this.byteMatchStatement = Input.empty();
        this.geoMatchStatement = Input.empty();
        this.ipSetReferenceStatement = Input.empty();
        this.labelMatchStatement = Input.empty();
        this.notStatement = Input.empty();
        this.orStatement = Input.empty();
        this.regexPatternSetReferenceStatement = Input.empty();
        this.sizeConstraintStatement = Input.empty();
        this.sqliMatchStatement = Input.empty();
        this.xssMatchStatement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs> andStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs> notStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs> orStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder setAndStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        public Builder setAndStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementArgs andStatement) {
            this.andStatement = Input.ofNullable(andStatement);
            return this;
        }

        public Builder setByteMatchStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder setByteMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs byteMatchStatement) {
            this.byteMatchStatement = Input.ofNullable(byteMatchStatement);
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder setGeoMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementGeoMatchStatementArgs geoMatchStatement) {
            this.geoMatchStatement = Input.ofNullable(geoMatchStatement);
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder setIpSetReferenceStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Input.ofNullable(ipSetReferenceStatement);
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder setLabelMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementLabelMatchStatementArgs labelMatchStatement) {
            this.labelMatchStatement = Input.ofNullable(labelMatchStatement);
            return this;
        }

        public Builder setNotStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        public Builder setNotStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementArgs notStatement) {
            this.notStatement = Input.ofNullable(notStatement);
            return this;
        }

        public Builder setOrStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        public Builder setOrStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementArgs orStatement) {
            this.orStatement = Input.ofNullable(orStatement);
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder setRegexPatternSetReferenceStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Input.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder setSizeConstraintStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSizeConstraintStatementArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Input.ofNullable(sizeConstraintStatement);
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder setSqliMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementSqliMatchStatementArgs sqliMatchStatement) {
            this.sqliMatchStatement = Input.ofNullable(sqliMatchStatement);
            return this;
        }

        public Builder setXssMatchStatement(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder setXssMatchStatement(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementXssMatchStatementArgs xssMatchStatement) {
            this.xssMatchStatement = Input.ofNullable(xssMatchStatement);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementArgs(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}