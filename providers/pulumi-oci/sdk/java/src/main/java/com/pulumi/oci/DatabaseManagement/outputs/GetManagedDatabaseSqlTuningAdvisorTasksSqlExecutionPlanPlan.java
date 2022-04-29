// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetManagedDatabaseSqlTuningAdvisorTasksSqlExecutionPlanPlan {
    /**
     * @return The predicates used to locate rows in an access structure. For example, start or stop predicates for an index range scan.
     * 
     */
    private final String accessPredicates;
    /**
     * @return The attribute of the SQL execution plan.
     * 
     */
    private final String attribute;
    /**
     * @return The number of bytes returned by the current operation.
     * 
     */
    private final String bytes;
    /**
     * @return The number of rows returned by the current operation (estimated by the CBO).
     * 
     */
    private final String cardinality;
    /**
     * @return The cost of the current operation estimated by the cost-based optimizer (CBO).
     * 
     */
    private final Double cost;
    /**
     * @return The CPU cost of the current operation.
     * 
     */
    private final Double cpuCost;
    /**
     * @return The predicates used to filter rows before producing them.
     * 
     */
    private final String filterPredicates;
    /**
     * @return The I/O cost of the current operation.
     * 
     */
    private final Double ioCost;
    /**
     * @return Number of index columns with start and stop keys (that is, the number of columns with matching predicates).
     * 
     */
    private final Integer numberOfSearchColumn;
    /**
     * @return The name of the object.
     * 
     */
    private final String object;
    /**
     * @return The name of the database link used to reference the object.
     * 
     */
    private final String objectNode;
    /**
     * @return The owner of the object.
     * 
     */
    private final String objectOwner;
    /**
     * @return The numbered position of the object name in the original SQL statement.
     * 
     */
    private final Integer objectPosition;
    /**
     * @return The descriptive modifier that further describes the type of object.
     * 
     */
    private final String objectType;
    /**
     * @return The name of the operation performed at this step.
     * 
     */
    private final String operation;
    /**
     * @return The current mode of the optimizer, such as all_rows, first_rows_n (where n = 1, 10, 100, 1000, and so on).
     * 
     */
    private final String optimizerMode;
    /**
     * @return The options used for the operation performed at this step.
     * 
     */
    private final String options;
    /**
     * @return Information about parallel execution servers and parallel queries
     * 
     */
    private final String other;
    /**
     * @return Describes the function of the SQL text in the OTHER column.
     * 
     */
    private final String otherTag;
    /**
     * @return The ID of the next step that operates on the results of this step. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final Integer parentStepId;
    /**
     * @return The ID of the step in the execution plan that has computed the pair of values of partitionStart and partitionStop.
     * 
     */
    private final Integer partitionId;
    /**
     * @return A step may get data from a range of partitions of a partitioned object, such as table or index, based on predicates and sorting order. The partionStart is the starting partition of the range. The partitionStop is the ending partition of the range.
     * 
     */
    private final String partitionStart;
    /**
     * @return A step may get data from a range of partitions of a partitioned object, such as table or index, based on predicates and sorting order. The partionStart is the starting partition of the range. The partitionStop is the ending partition of the range.
     * 
     */
    private final String partitionStop;
    /**
     * @return The numerical representation of the SQL execution plan.
     * 
     */
    private final String planHashValue;
    /**
     * @return The order of processing for steps with the same parent ID.
     * 
     */
    private final Integer position;
    /**
     * @return The place for comments that can be added to the steps of the execution plan.
     * 
     */
    private final String remarks;
    /**
     * @return The identification number of a step in the SQL execution plan. This is unique within the SQL execution plan. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final Integer stepId;
    /**
     * @return The temporary space usage (in bytes) of the operation (sort or hash-join) as estimated by the CBO.
     * 
     */
    private final String tempSpace;
    /**
     * @return The elapsed time (in seconds) of the operation as estimated by the CBO.
     * 
     */
    private final String time;

    @CustomType.Constructor
    private GetManagedDatabaseSqlTuningAdvisorTasksSqlExecutionPlanPlan(
        @CustomType.Parameter("accessPredicates") String accessPredicates,
        @CustomType.Parameter("attribute") String attribute,
        @CustomType.Parameter("bytes") String bytes,
        @CustomType.Parameter("cardinality") String cardinality,
        @CustomType.Parameter("cost") Double cost,
        @CustomType.Parameter("cpuCost") Double cpuCost,
        @CustomType.Parameter("filterPredicates") String filterPredicates,
        @CustomType.Parameter("ioCost") Double ioCost,
        @CustomType.Parameter("numberOfSearchColumn") Integer numberOfSearchColumn,
        @CustomType.Parameter("object") String object,
        @CustomType.Parameter("objectNode") String objectNode,
        @CustomType.Parameter("objectOwner") String objectOwner,
        @CustomType.Parameter("objectPosition") Integer objectPosition,
        @CustomType.Parameter("objectType") String objectType,
        @CustomType.Parameter("operation") String operation,
        @CustomType.Parameter("optimizerMode") String optimizerMode,
        @CustomType.Parameter("options") String options,
        @CustomType.Parameter("other") String other,
        @CustomType.Parameter("otherTag") String otherTag,
        @CustomType.Parameter("parentStepId") Integer parentStepId,
        @CustomType.Parameter("partitionId") Integer partitionId,
        @CustomType.Parameter("partitionStart") String partitionStart,
        @CustomType.Parameter("partitionStop") String partitionStop,
        @CustomType.Parameter("planHashValue") String planHashValue,
        @CustomType.Parameter("position") Integer position,
        @CustomType.Parameter("remarks") String remarks,
        @CustomType.Parameter("stepId") Integer stepId,
        @CustomType.Parameter("tempSpace") String tempSpace,
        @CustomType.Parameter("time") String time) {
        this.accessPredicates = accessPredicates;
        this.attribute = attribute;
        this.bytes = bytes;
        this.cardinality = cardinality;
        this.cost = cost;
        this.cpuCost = cpuCost;
        this.filterPredicates = filterPredicates;
        this.ioCost = ioCost;
        this.numberOfSearchColumn = numberOfSearchColumn;
        this.object = object;
        this.objectNode = objectNode;
        this.objectOwner = objectOwner;
        this.objectPosition = objectPosition;
        this.objectType = objectType;
        this.operation = operation;
        this.optimizerMode = optimizerMode;
        this.options = options;
        this.other = other;
        this.otherTag = otherTag;
        this.parentStepId = parentStepId;
        this.partitionId = partitionId;
        this.partitionStart = partitionStart;
        this.partitionStop = partitionStop;
        this.planHashValue = planHashValue;
        this.position = position;
        this.remarks = remarks;
        this.stepId = stepId;
        this.tempSpace = tempSpace;
        this.time = time;
    }

    /**
     * @return The predicates used to locate rows in an access structure. For example, start or stop predicates for an index range scan.
     * 
     */
    public String accessPredicates() {
        return this.accessPredicates;
    }
    /**
     * @return The attribute of the SQL execution plan.
     * 
     */
    public String attribute() {
        return this.attribute;
    }
    /**
     * @return The number of bytes returned by the current operation.
     * 
     */
    public String bytes() {
        return this.bytes;
    }
    /**
     * @return The number of rows returned by the current operation (estimated by the CBO).
     * 
     */
    public String cardinality() {
        return this.cardinality;
    }
    /**
     * @return The cost of the current operation estimated by the cost-based optimizer (CBO).
     * 
     */
    public Double cost() {
        return this.cost;
    }
    /**
     * @return The CPU cost of the current operation.
     * 
     */
    public Double cpuCost() {
        return this.cpuCost;
    }
    /**
     * @return The predicates used to filter rows before producing them.
     * 
     */
    public String filterPredicates() {
        return this.filterPredicates;
    }
    /**
     * @return The I/O cost of the current operation.
     * 
     */
    public Double ioCost() {
        return this.ioCost;
    }
    /**
     * @return Number of index columns with start and stop keys (that is, the number of columns with matching predicates).
     * 
     */
    public Integer numberOfSearchColumn() {
        return this.numberOfSearchColumn;
    }
    /**
     * @return The name of the object.
     * 
     */
    public String object() {
        return this.object;
    }
    /**
     * @return The name of the database link used to reference the object.
     * 
     */
    public String objectNode() {
        return this.objectNode;
    }
    /**
     * @return The owner of the object.
     * 
     */
    public String objectOwner() {
        return this.objectOwner;
    }
    /**
     * @return The numbered position of the object name in the original SQL statement.
     * 
     */
    public Integer objectPosition() {
        return this.objectPosition;
    }
    /**
     * @return The descriptive modifier that further describes the type of object.
     * 
     */
    public String objectType() {
        return this.objectType;
    }
    /**
     * @return The name of the operation performed at this step.
     * 
     */
    public String operation() {
        return this.operation;
    }
    /**
     * @return The current mode of the optimizer, such as all_rows, first_rows_n (where n = 1, 10, 100, 1000, and so on).
     * 
     */
    public String optimizerMode() {
        return this.optimizerMode;
    }
    /**
     * @return The options used for the operation performed at this step.
     * 
     */
    public String options() {
        return this.options;
    }
    /**
     * @return Information about parallel execution servers and parallel queries
     * 
     */
    public String other() {
        return this.other;
    }
    /**
     * @return Describes the function of the SQL text in the OTHER column.
     * 
     */
    public String otherTag() {
        return this.otherTag;
    }
    /**
     * @return The ID of the next step that operates on the results of this step. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Integer parentStepId() {
        return this.parentStepId;
    }
    /**
     * @return The ID of the step in the execution plan that has computed the pair of values of partitionStart and partitionStop.
     * 
     */
    public Integer partitionId() {
        return this.partitionId;
    }
    /**
     * @return A step may get data from a range of partitions of a partitioned object, such as table or index, based on predicates and sorting order. The partionStart is the starting partition of the range. The partitionStop is the ending partition of the range.
     * 
     */
    public String partitionStart() {
        return this.partitionStart;
    }
    /**
     * @return A step may get data from a range of partitions of a partitioned object, such as table or index, based on predicates and sorting order. The partionStart is the starting partition of the range. The partitionStop is the ending partition of the range.
     * 
     */
    public String partitionStop() {
        return this.partitionStop;
    }
    /**
     * @return The numerical representation of the SQL execution plan.
     * 
     */
    public String planHashValue() {
        return this.planHashValue;
    }
    /**
     * @return The order of processing for steps with the same parent ID.
     * 
     */
    public Integer position() {
        return this.position;
    }
    /**
     * @return The place for comments that can be added to the steps of the execution plan.
     * 
     */
    public String remarks() {
        return this.remarks;
    }
    /**
     * @return The identification number of a step in the SQL execution plan. This is unique within the SQL execution plan. This is not the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Integer stepId() {
        return this.stepId;
    }
    /**
     * @return The temporary space usage (in bytes) of the operation (sort or hash-join) as estimated by the CBO.
     * 
     */
    public String tempSpace() {
        return this.tempSpace;
    }
    /**
     * @return The elapsed time (in seconds) of the operation as estimated by the CBO.
     * 
     */
    public String time() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseSqlTuningAdvisorTasksSqlExecutionPlanPlan defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessPredicates;
        private String attribute;
        private String bytes;
        private String cardinality;
        private Double cost;
        private Double cpuCost;
        private String filterPredicates;
        private Double ioCost;
        private Integer numberOfSearchColumn;
        private String object;
        private String objectNode;
        private String objectOwner;
        private Integer objectPosition;
        private String objectType;
        private String operation;
        private String optimizerMode;
        private String options;
        private String other;
        private String otherTag;
        private Integer parentStepId;
        private Integer partitionId;
        private String partitionStart;
        private String partitionStop;
        private String planHashValue;
        private Integer position;
        private String remarks;
        private Integer stepId;
        private String tempSpace;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseSqlTuningAdvisorTasksSqlExecutionPlanPlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPredicates = defaults.accessPredicates;
    	      this.attribute = defaults.attribute;
    	      this.bytes = defaults.bytes;
    	      this.cardinality = defaults.cardinality;
    	      this.cost = defaults.cost;
    	      this.cpuCost = defaults.cpuCost;
    	      this.filterPredicates = defaults.filterPredicates;
    	      this.ioCost = defaults.ioCost;
    	      this.numberOfSearchColumn = defaults.numberOfSearchColumn;
    	      this.object = defaults.object;
    	      this.objectNode = defaults.objectNode;
    	      this.objectOwner = defaults.objectOwner;
    	      this.objectPosition = defaults.objectPosition;
    	      this.objectType = defaults.objectType;
    	      this.operation = defaults.operation;
    	      this.optimizerMode = defaults.optimizerMode;
    	      this.options = defaults.options;
    	      this.other = defaults.other;
    	      this.otherTag = defaults.otherTag;
    	      this.parentStepId = defaults.parentStepId;
    	      this.partitionId = defaults.partitionId;
    	      this.partitionStart = defaults.partitionStart;
    	      this.partitionStop = defaults.partitionStop;
    	      this.planHashValue = defaults.planHashValue;
    	      this.position = defaults.position;
    	      this.remarks = defaults.remarks;
    	      this.stepId = defaults.stepId;
    	      this.tempSpace = defaults.tempSpace;
    	      this.time = defaults.time;
        }

        public Builder accessPredicates(String accessPredicates) {
            this.accessPredicates = Objects.requireNonNull(accessPredicates);
            return this;
        }
        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        public Builder bytes(String bytes) {
            this.bytes = Objects.requireNonNull(bytes);
            return this;
        }
        public Builder cardinality(String cardinality) {
            this.cardinality = Objects.requireNonNull(cardinality);
            return this;
        }
        public Builder cost(Double cost) {
            this.cost = Objects.requireNonNull(cost);
            return this;
        }
        public Builder cpuCost(Double cpuCost) {
            this.cpuCost = Objects.requireNonNull(cpuCost);
            return this;
        }
        public Builder filterPredicates(String filterPredicates) {
            this.filterPredicates = Objects.requireNonNull(filterPredicates);
            return this;
        }
        public Builder ioCost(Double ioCost) {
            this.ioCost = Objects.requireNonNull(ioCost);
            return this;
        }
        public Builder numberOfSearchColumn(Integer numberOfSearchColumn) {
            this.numberOfSearchColumn = Objects.requireNonNull(numberOfSearchColumn);
            return this;
        }
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder objectNode(String objectNode) {
            this.objectNode = Objects.requireNonNull(objectNode);
            return this;
        }
        public Builder objectOwner(String objectOwner) {
            this.objectOwner = Objects.requireNonNull(objectOwner);
            return this;
        }
        public Builder objectPosition(Integer objectPosition) {
            this.objectPosition = Objects.requireNonNull(objectPosition);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder operation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }
        public Builder optimizerMode(String optimizerMode) {
            this.optimizerMode = Objects.requireNonNull(optimizerMode);
            return this;
        }
        public Builder options(String options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder other(String other) {
            this.other = Objects.requireNonNull(other);
            return this;
        }
        public Builder otherTag(String otherTag) {
            this.otherTag = Objects.requireNonNull(otherTag);
            return this;
        }
        public Builder parentStepId(Integer parentStepId) {
            this.parentStepId = Objects.requireNonNull(parentStepId);
            return this;
        }
        public Builder partitionId(Integer partitionId) {
            this.partitionId = Objects.requireNonNull(partitionId);
            return this;
        }
        public Builder partitionStart(String partitionStart) {
            this.partitionStart = Objects.requireNonNull(partitionStart);
            return this;
        }
        public Builder partitionStop(String partitionStop) {
            this.partitionStop = Objects.requireNonNull(partitionStop);
            return this;
        }
        public Builder planHashValue(String planHashValue) {
            this.planHashValue = Objects.requireNonNull(planHashValue);
            return this;
        }
        public Builder position(Integer position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public Builder remarks(String remarks) {
            this.remarks = Objects.requireNonNull(remarks);
            return this;
        }
        public Builder stepId(Integer stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }
        public Builder tempSpace(String tempSpace) {
            this.tempSpace = Objects.requireNonNull(tempSpace);
            return this;
        }
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }        public GetManagedDatabaseSqlTuningAdvisorTasksSqlExecutionPlanPlan build() {
            return new GetManagedDatabaseSqlTuningAdvisorTasksSqlExecutionPlanPlan(accessPredicates, attribute, bytes, cardinality, cost, cpuCost, filterPredicates, ioCost, numberOfSearchColumn, object, objectNode, objectOwner, objectPosition, objectType, operation, optimizerMode, options, other, otherTag, parentStepId, partitionId, partitionStart, partitionStop, planHashValue, position, remarks, stepId, tempSpace, time);
        }
    }
}
