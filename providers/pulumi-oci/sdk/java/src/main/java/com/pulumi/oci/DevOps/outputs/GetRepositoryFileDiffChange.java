// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DevOps.outputs.GetRepositoryFileDiffChangeDiffSection;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRepositoryFileDiffChange {
    /**
     * @return The number of a line in the base version.
     * 
     */
    private final Integer baseLine;
    /**
     * @return Number of lines chunk spans in base version.
     * 
     */
    private final Integer baseSpan;
    /**
     * @return List of difference section.
     * 
     */
    private final List<GetRepositoryFileDiffChangeDiffSection> diffSections;
    /**
     * @return Line number in target version where changes begin.
     * 
     */
    private final Integer targetLine;
    /**
     * @return Number of lines chunk spans in target version.
     * 
     */
    private final Integer targetSpan;

    @CustomType.Constructor
    private GetRepositoryFileDiffChange(
        @CustomType.Parameter("baseLine") Integer baseLine,
        @CustomType.Parameter("baseSpan") Integer baseSpan,
        @CustomType.Parameter("diffSections") List<GetRepositoryFileDiffChangeDiffSection> diffSections,
        @CustomType.Parameter("targetLine") Integer targetLine,
        @CustomType.Parameter("targetSpan") Integer targetSpan) {
        this.baseLine = baseLine;
        this.baseSpan = baseSpan;
        this.diffSections = diffSections;
        this.targetLine = targetLine;
        this.targetSpan = targetSpan;
    }

    /**
     * @return The number of a line in the base version.
     * 
     */
    public Integer baseLine() {
        return this.baseLine;
    }
    /**
     * @return Number of lines chunk spans in base version.
     * 
     */
    public Integer baseSpan() {
        return this.baseSpan;
    }
    /**
     * @return List of difference section.
     * 
     */
    public List<GetRepositoryFileDiffChangeDiffSection> diffSections() {
        return this.diffSections;
    }
    /**
     * @return Line number in target version where changes begin.
     * 
     */
    public Integer targetLine() {
        return this.targetLine;
    }
    /**
     * @return Number of lines chunk spans in target version.
     * 
     */
    public Integer targetSpan() {
        return this.targetSpan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryFileDiffChange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer baseLine;
        private Integer baseSpan;
        private List<GetRepositoryFileDiffChangeDiffSection> diffSections;
        private Integer targetLine;
        private Integer targetSpan;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRepositoryFileDiffChange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseLine = defaults.baseLine;
    	      this.baseSpan = defaults.baseSpan;
    	      this.diffSections = defaults.diffSections;
    	      this.targetLine = defaults.targetLine;
    	      this.targetSpan = defaults.targetSpan;
        }

        public Builder baseLine(Integer baseLine) {
            this.baseLine = Objects.requireNonNull(baseLine);
            return this;
        }
        public Builder baseSpan(Integer baseSpan) {
            this.baseSpan = Objects.requireNonNull(baseSpan);
            return this;
        }
        public Builder diffSections(List<GetRepositoryFileDiffChangeDiffSection> diffSections) {
            this.diffSections = Objects.requireNonNull(diffSections);
            return this;
        }
        public Builder diffSections(GetRepositoryFileDiffChangeDiffSection... diffSections) {
            return diffSections(List.of(diffSections));
        }
        public Builder targetLine(Integer targetLine) {
            this.targetLine = Objects.requireNonNull(targetLine);
            return this;
        }
        public Builder targetSpan(Integer targetSpan) {
            this.targetSpan = Objects.requireNonNull(targetSpan);
            return this;
        }        public GetRepositoryFileDiffChange build() {
            return new GetRepositoryFileDiffChange(baseLine, baseSpan, diffSections, targetLine, targetSpan);
        }
    }
}
