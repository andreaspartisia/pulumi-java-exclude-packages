// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.ExplainQueryStepResponse;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ExplainQueryStageResponse {
    /**
     * Number of parallel input segments completed.
     * 
     */
    private final String completedParallelInputs;
    /**
     * Milliseconds the average shard spent on CPU-bound tasks.
     * 
     */
    private final String computeMsAvg;
    /**
     * Milliseconds the slowest shard spent on CPU-bound tasks.
     * 
     */
    private final String computeMsMax;
    /**
     * Relative amount of time the average shard spent on CPU-bound tasks.
     * 
     */
    private final Double computeRatioAvg;
    /**
     * Relative amount of time the slowest shard spent on CPU-bound tasks.
     * 
     */
    private final Double computeRatioMax;
    /**
     * Stage end time represented as milliseconds since epoch.
     * 
     */
    private final String endMs;
    /**
     * IDs for stages that are inputs to this stage.
     * 
     */
    private final List<String> inputStages;
    /**
     * Human-readable name for stage.
     * 
     */
    private final String name;
    /**
     * Number of parallel input segments to be processed.
     * 
     */
    private final String parallelInputs;
    /**
     * Milliseconds the average shard spent reading input.
     * 
     */
    private final String readMsAvg;
    /**
     * Milliseconds the slowest shard spent reading input.
     * 
     */
    private final String readMsMax;
    /**
     * Relative amount of time the average shard spent reading input.
     * 
     */
    private final Double readRatioAvg;
    /**
     * Relative amount of time the slowest shard spent reading input.
     * 
     */
    private final Double readRatioMax;
    /**
     * Number of records read into the stage.
     * 
     */
    private final String recordsRead;
    /**
     * Number of records written by the stage.
     * 
     */
    private final String recordsWritten;
    /**
     * Total number of bytes written to shuffle.
     * 
     */
    private final String shuffleOutputBytes;
    /**
     * Total number of bytes written to shuffle and spilled to disk.
     * 
     */
    private final String shuffleOutputBytesSpilled;
    /**
     * Slot-milliseconds used by the stage.
     * 
     */
    private final String slotMs;
    /**
     * Stage start time represented as milliseconds since epoch.
     * 
     */
    private final String startMs;
    /**
     * Current status for the stage.
     * 
     */
    private final String status;
    /**
     * List of operations within the stage in dependency order (approximately chronological).
     * 
     */
    private final List<ExplainQueryStepResponse> steps;
    /**
     * Milliseconds the average shard spent waiting to be scheduled.
     * 
     */
    private final String waitMsAvg;
    /**
     * Milliseconds the slowest shard spent waiting to be scheduled.
     * 
     */
    private final String waitMsMax;
    /**
     * Relative amount of time the average shard spent waiting to be scheduled.
     * 
     */
    private final Double waitRatioAvg;
    /**
     * Relative amount of time the slowest shard spent waiting to be scheduled.
     * 
     */
    private final Double waitRatioMax;
    /**
     * Milliseconds the average shard spent on writing output.
     * 
     */
    private final String writeMsAvg;
    /**
     * Milliseconds the slowest shard spent on writing output.
     * 
     */
    private final String writeMsMax;
    /**
     * Relative amount of time the average shard spent on writing output.
     * 
     */
    private final Double writeRatioAvg;
    /**
     * Relative amount of time the slowest shard spent on writing output.
     * 
     */
    private final Double writeRatioMax;

    @CustomType.Constructor
    private ExplainQueryStageResponse(
        @CustomType.Parameter("completedParallelInputs") String completedParallelInputs,
        @CustomType.Parameter("computeMsAvg") String computeMsAvg,
        @CustomType.Parameter("computeMsMax") String computeMsMax,
        @CustomType.Parameter("computeRatioAvg") Double computeRatioAvg,
        @CustomType.Parameter("computeRatioMax") Double computeRatioMax,
        @CustomType.Parameter("endMs") String endMs,
        @CustomType.Parameter("inputStages") List<String> inputStages,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parallelInputs") String parallelInputs,
        @CustomType.Parameter("readMsAvg") String readMsAvg,
        @CustomType.Parameter("readMsMax") String readMsMax,
        @CustomType.Parameter("readRatioAvg") Double readRatioAvg,
        @CustomType.Parameter("readRatioMax") Double readRatioMax,
        @CustomType.Parameter("recordsRead") String recordsRead,
        @CustomType.Parameter("recordsWritten") String recordsWritten,
        @CustomType.Parameter("shuffleOutputBytes") String shuffleOutputBytes,
        @CustomType.Parameter("shuffleOutputBytesSpilled") String shuffleOutputBytesSpilled,
        @CustomType.Parameter("slotMs") String slotMs,
        @CustomType.Parameter("startMs") String startMs,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("steps") List<ExplainQueryStepResponse> steps,
        @CustomType.Parameter("waitMsAvg") String waitMsAvg,
        @CustomType.Parameter("waitMsMax") String waitMsMax,
        @CustomType.Parameter("waitRatioAvg") Double waitRatioAvg,
        @CustomType.Parameter("waitRatioMax") Double waitRatioMax,
        @CustomType.Parameter("writeMsAvg") String writeMsAvg,
        @CustomType.Parameter("writeMsMax") String writeMsMax,
        @CustomType.Parameter("writeRatioAvg") Double writeRatioAvg,
        @CustomType.Parameter("writeRatioMax") Double writeRatioMax) {
        this.completedParallelInputs = completedParallelInputs;
        this.computeMsAvg = computeMsAvg;
        this.computeMsMax = computeMsMax;
        this.computeRatioAvg = computeRatioAvg;
        this.computeRatioMax = computeRatioMax;
        this.endMs = endMs;
        this.inputStages = inputStages;
        this.name = name;
        this.parallelInputs = parallelInputs;
        this.readMsAvg = readMsAvg;
        this.readMsMax = readMsMax;
        this.readRatioAvg = readRatioAvg;
        this.readRatioMax = readRatioMax;
        this.recordsRead = recordsRead;
        this.recordsWritten = recordsWritten;
        this.shuffleOutputBytes = shuffleOutputBytes;
        this.shuffleOutputBytesSpilled = shuffleOutputBytesSpilled;
        this.slotMs = slotMs;
        this.startMs = startMs;
        this.status = status;
        this.steps = steps;
        this.waitMsAvg = waitMsAvg;
        this.waitMsMax = waitMsMax;
        this.waitRatioAvg = waitRatioAvg;
        this.waitRatioMax = waitRatioMax;
        this.writeMsAvg = writeMsAvg;
        this.writeMsMax = writeMsMax;
        this.writeRatioAvg = writeRatioAvg;
        this.writeRatioMax = writeRatioMax;
    }

    /**
     * Number of parallel input segments completed.
     * 
    */
    public String completedParallelInputs() {
        return this.completedParallelInputs;
    }
    /**
     * Milliseconds the average shard spent on CPU-bound tasks.
     * 
    */
    public String computeMsAvg() {
        return this.computeMsAvg;
    }
    /**
     * Milliseconds the slowest shard spent on CPU-bound tasks.
     * 
    */
    public String computeMsMax() {
        return this.computeMsMax;
    }
    /**
     * Relative amount of time the average shard spent on CPU-bound tasks.
     * 
    */
    public Double computeRatioAvg() {
        return this.computeRatioAvg;
    }
    /**
     * Relative amount of time the slowest shard spent on CPU-bound tasks.
     * 
    */
    public Double computeRatioMax() {
        return this.computeRatioMax;
    }
    /**
     * Stage end time represented as milliseconds since epoch.
     * 
    */
    public String endMs() {
        return this.endMs;
    }
    /**
     * IDs for stages that are inputs to this stage.
     * 
    */
    public List<String> inputStages() {
        return this.inputStages;
    }
    /**
     * Human-readable name for stage.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Number of parallel input segments to be processed.
     * 
    */
    public String parallelInputs() {
        return this.parallelInputs;
    }
    /**
     * Milliseconds the average shard spent reading input.
     * 
    */
    public String readMsAvg() {
        return this.readMsAvg;
    }
    /**
     * Milliseconds the slowest shard spent reading input.
     * 
    */
    public String readMsMax() {
        return this.readMsMax;
    }
    /**
     * Relative amount of time the average shard spent reading input.
     * 
    */
    public Double readRatioAvg() {
        return this.readRatioAvg;
    }
    /**
     * Relative amount of time the slowest shard spent reading input.
     * 
    */
    public Double readRatioMax() {
        return this.readRatioMax;
    }
    /**
     * Number of records read into the stage.
     * 
    */
    public String recordsRead() {
        return this.recordsRead;
    }
    /**
     * Number of records written by the stage.
     * 
    */
    public String recordsWritten() {
        return this.recordsWritten;
    }
    /**
     * Total number of bytes written to shuffle.
     * 
    */
    public String shuffleOutputBytes() {
        return this.shuffleOutputBytes;
    }
    /**
     * Total number of bytes written to shuffle and spilled to disk.
     * 
    */
    public String shuffleOutputBytesSpilled() {
        return this.shuffleOutputBytesSpilled;
    }
    /**
     * Slot-milliseconds used by the stage.
     * 
    */
    public String slotMs() {
        return this.slotMs;
    }
    /**
     * Stage start time represented as milliseconds since epoch.
     * 
    */
    public String startMs() {
        return this.startMs;
    }
    /**
     * Current status for the stage.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * List of operations within the stage in dependency order (approximately chronological).
     * 
    */
    public List<ExplainQueryStepResponse> steps() {
        return this.steps;
    }
    /**
     * Milliseconds the average shard spent waiting to be scheduled.
     * 
    */
    public String waitMsAvg() {
        return this.waitMsAvg;
    }
    /**
     * Milliseconds the slowest shard spent waiting to be scheduled.
     * 
    */
    public String waitMsMax() {
        return this.waitMsMax;
    }
    /**
     * Relative amount of time the average shard spent waiting to be scheduled.
     * 
    */
    public Double waitRatioAvg() {
        return this.waitRatioAvg;
    }
    /**
     * Relative amount of time the slowest shard spent waiting to be scheduled.
     * 
    */
    public Double waitRatioMax() {
        return this.waitRatioMax;
    }
    /**
     * Milliseconds the average shard spent on writing output.
     * 
    */
    public String writeMsAvg() {
        return this.writeMsAvg;
    }
    /**
     * Milliseconds the slowest shard spent on writing output.
     * 
    */
    public String writeMsMax() {
        return this.writeMsMax;
    }
    /**
     * Relative amount of time the average shard spent on writing output.
     * 
    */
    public Double writeRatioAvg() {
        return this.writeRatioAvg;
    }
    /**
     * Relative amount of time the slowest shard spent on writing output.
     * 
    */
    public Double writeRatioMax() {
        return this.writeRatioMax;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExplainQueryStageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String completedParallelInputs;
        private String computeMsAvg;
        private String computeMsMax;
        private Double computeRatioAvg;
        private Double computeRatioMax;
        private String endMs;
        private List<String> inputStages;
        private String name;
        private String parallelInputs;
        private String readMsAvg;
        private String readMsMax;
        private Double readRatioAvg;
        private Double readRatioMax;
        private String recordsRead;
        private String recordsWritten;
        private String shuffleOutputBytes;
        private String shuffleOutputBytesSpilled;
        private String slotMs;
        private String startMs;
        private String status;
        private List<ExplainQueryStepResponse> steps;
        private String waitMsAvg;
        private String waitMsMax;
        private Double waitRatioAvg;
        private Double waitRatioMax;
        private String writeMsAvg;
        private String writeMsMax;
        private Double writeRatioAvg;
        private Double writeRatioMax;

        public Builder() {
    	      // Empty
        }

        public Builder(ExplainQueryStageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completedParallelInputs = defaults.completedParallelInputs;
    	      this.computeMsAvg = defaults.computeMsAvg;
    	      this.computeMsMax = defaults.computeMsMax;
    	      this.computeRatioAvg = defaults.computeRatioAvg;
    	      this.computeRatioMax = defaults.computeRatioMax;
    	      this.endMs = defaults.endMs;
    	      this.inputStages = defaults.inputStages;
    	      this.name = defaults.name;
    	      this.parallelInputs = defaults.parallelInputs;
    	      this.readMsAvg = defaults.readMsAvg;
    	      this.readMsMax = defaults.readMsMax;
    	      this.readRatioAvg = defaults.readRatioAvg;
    	      this.readRatioMax = defaults.readRatioMax;
    	      this.recordsRead = defaults.recordsRead;
    	      this.recordsWritten = defaults.recordsWritten;
    	      this.shuffleOutputBytes = defaults.shuffleOutputBytes;
    	      this.shuffleOutputBytesSpilled = defaults.shuffleOutputBytesSpilled;
    	      this.slotMs = defaults.slotMs;
    	      this.startMs = defaults.startMs;
    	      this.status = defaults.status;
    	      this.steps = defaults.steps;
    	      this.waitMsAvg = defaults.waitMsAvg;
    	      this.waitMsMax = defaults.waitMsMax;
    	      this.waitRatioAvg = defaults.waitRatioAvg;
    	      this.waitRatioMax = defaults.waitRatioMax;
    	      this.writeMsAvg = defaults.writeMsAvg;
    	      this.writeMsMax = defaults.writeMsMax;
    	      this.writeRatioAvg = defaults.writeRatioAvg;
    	      this.writeRatioMax = defaults.writeRatioMax;
        }

        public Builder completedParallelInputs(String completedParallelInputs) {
            this.completedParallelInputs = Objects.requireNonNull(completedParallelInputs);
            return this;
        }
        public Builder computeMsAvg(String computeMsAvg) {
            this.computeMsAvg = Objects.requireNonNull(computeMsAvg);
            return this;
        }
        public Builder computeMsMax(String computeMsMax) {
            this.computeMsMax = Objects.requireNonNull(computeMsMax);
            return this;
        }
        public Builder computeRatioAvg(Double computeRatioAvg) {
            this.computeRatioAvg = Objects.requireNonNull(computeRatioAvg);
            return this;
        }
        public Builder computeRatioMax(Double computeRatioMax) {
            this.computeRatioMax = Objects.requireNonNull(computeRatioMax);
            return this;
        }
        public Builder endMs(String endMs) {
            this.endMs = Objects.requireNonNull(endMs);
            return this;
        }
        public Builder inputStages(List<String> inputStages) {
            this.inputStages = Objects.requireNonNull(inputStages);
            return this;
        }
        public Builder inputStages(String... inputStages) {
            return inputStages(List.of(inputStages));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parallelInputs(String parallelInputs) {
            this.parallelInputs = Objects.requireNonNull(parallelInputs);
            return this;
        }
        public Builder readMsAvg(String readMsAvg) {
            this.readMsAvg = Objects.requireNonNull(readMsAvg);
            return this;
        }
        public Builder readMsMax(String readMsMax) {
            this.readMsMax = Objects.requireNonNull(readMsMax);
            return this;
        }
        public Builder readRatioAvg(Double readRatioAvg) {
            this.readRatioAvg = Objects.requireNonNull(readRatioAvg);
            return this;
        }
        public Builder readRatioMax(Double readRatioMax) {
            this.readRatioMax = Objects.requireNonNull(readRatioMax);
            return this;
        }
        public Builder recordsRead(String recordsRead) {
            this.recordsRead = Objects.requireNonNull(recordsRead);
            return this;
        }
        public Builder recordsWritten(String recordsWritten) {
            this.recordsWritten = Objects.requireNonNull(recordsWritten);
            return this;
        }
        public Builder shuffleOutputBytes(String shuffleOutputBytes) {
            this.shuffleOutputBytes = Objects.requireNonNull(shuffleOutputBytes);
            return this;
        }
        public Builder shuffleOutputBytesSpilled(String shuffleOutputBytesSpilled) {
            this.shuffleOutputBytesSpilled = Objects.requireNonNull(shuffleOutputBytesSpilled);
            return this;
        }
        public Builder slotMs(String slotMs) {
            this.slotMs = Objects.requireNonNull(slotMs);
            return this;
        }
        public Builder startMs(String startMs) {
            this.startMs = Objects.requireNonNull(startMs);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder steps(List<ExplainQueryStepResponse> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }
        public Builder steps(ExplainQueryStepResponse... steps) {
            return steps(List.of(steps));
        }
        public Builder waitMsAvg(String waitMsAvg) {
            this.waitMsAvg = Objects.requireNonNull(waitMsAvg);
            return this;
        }
        public Builder waitMsMax(String waitMsMax) {
            this.waitMsMax = Objects.requireNonNull(waitMsMax);
            return this;
        }
        public Builder waitRatioAvg(Double waitRatioAvg) {
            this.waitRatioAvg = Objects.requireNonNull(waitRatioAvg);
            return this;
        }
        public Builder waitRatioMax(Double waitRatioMax) {
            this.waitRatioMax = Objects.requireNonNull(waitRatioMax);
            return this;
        }
        public Builder writeMsAvg(String writeMsAvg) {
            this.writeMsAvg = Objects.requireNonNull(writeMsAvg);
            return this;
        }
        public Builder writeMsMax(String writeMsMax) {
            this.writeMsMax = Objects.requireNonNull(writeMsMax);
            return this;
        }
        public Builder writeRatioAvg(Double writeRatioAvg) {
            this.writeRatioAvg = Objects.requireNonNull(writeRatioAvg);
            return this;
        }
        public Builder writeRatioMax(Double writeRatioMax) {
            this.writeRatioMax = Objects.requireNonNull(writeRatioMax);
            return this;
        }        public ExplainQueryStageResponse build() {
            return new ExplainQueryStageResponse(completedParallelInputs, computeMsAvg, computeMsMax, computeRatioAvg, computeRatioMax, endMs, inputStages, name, parallelInputs, readMsAvg, readMsMax, readRatioAvg, readRatioMax, recordsRead, recordsWritten, shuffleOutputBytes, shuffleOutputBytesSpilled, slotMs, startMs, status, steps, waitMsAvg, waitMsMax, waitRatioAvg, waitRatioMax, writeMsAvg, writeMsMax, writeRatioAvg, writeRatioMax);
        }
    }
}
