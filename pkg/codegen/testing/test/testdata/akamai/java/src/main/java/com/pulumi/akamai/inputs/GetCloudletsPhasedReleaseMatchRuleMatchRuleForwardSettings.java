// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings Empty = new GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings();

    @Import(name="originId", required=true)
    private String originId;

    public String originId() {
        return this.originId;
    }

    @Import(name="percent", required=true)
    private Integer percent;

    public Integer percent() {
        return this.percent;
    }

    private GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings() {}

    private GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings(GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings $) {
        this.originId = $.originId;
        this.percent = $.percent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings $;

        public Builder() {
            $ = new GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings();
        }

        public Builder(GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings defaults) {
            $ = new GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings(Objects.requireNonNull(defaults));
        }

        public Builder originId(String originId) {
            $.originId = originId;
            return this;
        }

        public Builder percent(Integer percent) {
            $.percent = percent;
            return this;
        }

        public GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings build() {
            if ($.originId == null) {
                throw new MissingRequiredPropertyException("GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings", "originId");
            }
            if ($.percent == null) {
                throw new MissingRequiredPropertyException("GetCloudletsPhasedReleaseMatchRuleMatchRuleForwardSettings", "percent");
            }
            return $;
        }
    }

}
