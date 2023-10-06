// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GtmAsmapDefaultDatacenter {
    private Integer datacenterId;
    private @Nullable String nickname;

    private GtmAsmapDefaultDatacenter() {}
    public Integer datacenterId() {
        return this.datacenterId;
    }
    public Optional<String> nickname() {
        return Optional.ofNullable(this.nickname);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GtmAsmapDefaultDatacenter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer datacenterId;
        private @Nullable String nickname;
        public Builder() {}
        public Builder(GtmAsmapDefaultDatacenter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenterId = defaults.datacenterId;
    	      this.nickname = defaults.nickname;
        }

        @CustomType.Setter
        public Builder datacenterId(Integer datacenterId) {
            if (datacenterId == null) {
              throw new MissingRequiredPropertyException("GtmAsmapDefaultDatacenter", "datacenterId");
            }
            this.datacenterId = datacenterId;
            return this;
        }
        @CustomType.Setter
        public Builder nickname(@Nullable String nickname) {

            this.nickname = nickname;
            return this;
        }
        public GtmAsmapDefaultDatacenter build() {
            final var _resultValue = new GtmAsmapDefaultDatacenter();
            _resultValue.datacenterId = datacenterId;
            _resultValue.nickname = nickname;
            return _resultValue;
        }
    }
}
