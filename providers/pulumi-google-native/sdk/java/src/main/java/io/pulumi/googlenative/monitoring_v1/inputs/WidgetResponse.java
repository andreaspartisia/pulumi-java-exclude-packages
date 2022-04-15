// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v1.inputs.AlertChartResponse;
import io.pulumi.googlenative.monitoring_v1.inputs.EmptyResponse;
import io.pulumi.googlenative.monitoring_v1.inputs.LogsPanelResponse;
import io.pulumi.googlenative.monitoring_v1.inputs.ScorecardResponse;
import io.pulumi.googlenative.monitoring_v1.inputs.TextResponse;
import io.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesTableResponse;
import io.pulumi.googlenative.monitoring_v1.inputs.XyChartResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Widget contains a single dashboard component and configuration of how to present the component in the dashboard.
 * 
 */
public final class WidgetResponse extends io.pulumi.resources.InvokeArgs {

    public static final WidgetResponse Empty = new WidgetResponse();

    /**
     * A chart of alert policy data.
     * 
     */
    @Import(name="alertChart", required=true)
      private final AlertChartResponse alertChart;

    public AlertChartResponse alertChart() {
        return this.alertChart;
    }

    /**
     * A blank space.
     * 
     */
    @Import(name="blank", required=true)
      private final EmptyResponse blank;

    public EmptyResponse blank() {
        return this.blank;
    }

    /**
     * A widget that shows a stream of logs.
     * 
     */
    @Import(name="logsPanel", required=true)
      private final LogsPanelResponse logsPanel;

    public LogsPanelResponse logsPanel() {
        return this.logsPanel;
    }

    /**
     * A scorecard summarizing time series data.
     * 
     */
    @Import(name="scorecard", required=true)
      private final ScorecardResponse scorecard;

    public ScorecardResponse scorecard() {
        return this.scorecard;
    }

    /**
     * A raw string or markdown displaying textual content.
     * 
     */
    @Import(name="text", required=true)
      private final TextResponse text;

    public TextResponse text() {
        return this.text;
    }

    /**
     * A widget that displays time series data in a tabular format.
     * 
     */
    @Import(name="timeSeriesTable", required=true)
      private final TimeSeriesTableResponse timeSeriesTable;

    public TimeSeriesTableResponse timeSeriesTable() {
        return this.timeSeriesTable;
    }

    /**
     * Optional. The title of the widget.
     * 
     */
    @Import(name="title", required=true)
      private final String title;

    public String title() {
        return this.title;
    }

    /**
     * A chart of time series data.
     * 
     */
    @Import(name="xyChart", required=true)
      private final XyChartResponse xyChart;

    public XyChartResponse xyChart() {
        return this.xyChart;
    }

    public WidgetResponse(
        AlertChartResponse alertChart,
        EmptyResponse blank,
        LogsPanelResponse logsPanel,
        ScorecardResponse scorecard,
        TextResponse text,
        TimeSeriesTableResponse timeSeriesTable,
        String title,
        XyChartResponse xyChart) {
        this.alertChart = Objects.requireNonNull(alertChart, "expected parameter 'alertChart' to be non-null");
        this.blank = Objects.requireNonNull(blank, "expected parameter 'blank' to be non-null");
        this.logsPanel = Objects.requireNonNull(logsPanel, "expected parameter 'logsPanel' to be non-null");
        this.scorecard = Objects.requireNonNull(scorecard, "expected parameter 'scorecard' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
        this.timeSeriesTable = Objects.requireNonNull(timeSeriesTable, "expected parameter 'timeSeriesTable' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
        this.xyChart = Objects.requireNonNull(xyChart, "expected parameter 'xyChart' to be non-null");
    }

    private WidgetResponse() {
        this.alertChart = null;
        this.blank = null;
        this.logsPanel = null;
        this.scorecard = null;
        this.text = null;
        this.timeSeriesTable = null;
        this.title = null;
        this.xyChart = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WidgetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertChartResponse alertChart;
        private EmptyResponse blank;
        private LogsPanelResponse logsPanel;
        private ScorecardResponse scorecard;
        private TextResponse text;
        private TimeSeriesTableResponse timeSeriesTable;
        private String title;
        private XyChartResponse xyChart;

        public Builder() {
    	      // Empty
        }

        public Builder(WidgetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertChart = defaults.alertChart;
    	      this.blank = defaults.blank;
    	      this.logsPanel = defaults.logsPanel;
    	      this.scorecard = defaults.scorecard;
    	      this.text = defaults.text;
    	      this.timeSeriesTable = defaults.timeSeriesTable;
    	      this.title = defaults.title;
    	      this.xyChart = defaults.xyChart;
        }

        public Builder alertChart(AlertChartResponse alertChart) {
            this.alertChart = Objects.requireNonNull(alertChart);
            return this;
        }
        public Builder blank(EmptyResponse blank) {
            this.blank = Objects.requireNonNull(blank);
            return this;
        }
        public Builder logsPanel(LogsPanelResponse logsPanel) {
            this.logsPanel = Objects.requireNonNull(logsPanel);
            return this;
        }
        public Builder scorecard(ScorecardResponse scorecard) {
            this.scorecard = Objects.requireNonNull(scorecard);
            return this;
        }
        public Builder text(TextResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public Builder timeSeriesTable(TimeSeriesTableResponse timeSeriesTable) {
            this.timeSeriesTable = Objects.requireNonNull(timeSeriesTable);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder xyChart(XyChartResponse xyChart) {
            this.xyChart = Objects.requireNonNull(xyChart);
            return this;
        }        public WidgetResponse build() {
            return new WidgetResponse(alertChart, blank, logsPanel, scorecard, text, timeSeriesTable, title, xyChart);
        }
    }
}
