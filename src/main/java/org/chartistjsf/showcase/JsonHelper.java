package org.chartistjsf.showcase;

import org.chartistjsf.model.chart.AspectRatio;
import org.chartistjsf.model.chart.BarChartModel;
import org.chartistjsf.model.chart.LineChartModel;
import org.chartistjsf.model.chart.PieChartModel;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonHelper {

	public void updateLineData(String optionsData, LineChartModel lineChartModel) {
		JsonParser parser = new JsonParser();
		JsonObject o = (JsonObject) parser.parse(optionsData);

		lineChartModel
				.setShowTooltip(o.get("showTooltip") != null && o.get("showTooltip").getAsString().equals("on") ? true
						: false);
		lineChartModel.setAnimateAdvanced(o.get("animateAdvanced") != null
				&& o.get("animateAdvanced").getAsString().equals("on") ? true : false);

		lineChartModel
				.setReverseData(o.get("reverseData") != null && o.get("reverseData").getAsString().equals("on") ? true
						: false);
		lineChartModel
				.setAnimatePath(o.get("animatePath") != null && o.get("animatePath").getAsString().equals("on") ? true
						: false);

		lineChartModel.setShowLine(o.get("showLine") != null && o.get("showLine").getAsString().equals("on") ? true
				: false);

		lineChartModel.setShowPoint(o.get("showPoint") != null && o.get("showPoint").getAsString().equals("on") ? true
				: false);

		lineChartModel.setShowArea(o.get("showArea") != null && o.get("showArea").getAsString().equals("on") ? true
				: false);

		lineChartModel
				.setLineSmooth(o.get("lineSmooth") != null && o.get("lineSmooth").getAsString().equals("on") ? true
						: false);

		lineChartModel.setFullWidth(o.get("fullWidth") != null && o.get("fullWidth").getAsString().equals("on") ? true
				: false);
		lineChartModel.setShowGridBackground(o.get("showGridBackground") != null
				&& o.get("showGridBackground").getAsString().equals("on") ? true : false);

		lineChartModel.setAspectRatio(AspectRatio.valueOf(o.get("aspectRatio") != null ? o.get("aspectRatio")
				.getAsString() : "GOLDEN_SECTION"));

	}

	public void updateBarData(String optionsData, BarChartModel barChartModel) {
		JsonParser parser = new JsonParser();
		JsonObject o = (JsonObject) parser.parse(optionsData);

		barChartModel
				.setShowTooltip(o.get("showTooltip") != null && o.get("showTooltip").getAsString().equals("on") ? true
						: false);
		barChartModel.setAnimateAdvanced(o.get("animateAdvanced") != null
				&& o.get("animateAdvanced").getAsString().equals("on") ? true : false);

		barChartModel
				.setReverseData(o.get("reverseData") != null && o.get("reverseData").getAsString().equals("on") ? true
						: false);
		barChartModel
				.setAnimatePath(o.get("animatePath") != null && o.get("animatePath").getAsString().equals("on") ? true
						: false);

		barChartModel.setStackBars(o.get("stackBars") != null && o.get("stackBars").getAsString().equals("on") ? true
				: false);

		barChartModel.setHorizontalBars(o.get("horizontalBars") != null
				&& o.get("horizontalBars").getAsString().equals("on") ? true : false);
		
		barChartModel.setShowGridBackground(o.get("showGridBackground") != null
				&& o.get("showGridBackground").getAsString().equals("on") ? true : false);

		barChartModel.setAspectRatio(AspectRatio.valueOf(o.get("aspectRatio") != null ? o.get("aspectRatio")
				.getAsString() : "GOLDEN_SECTION"));

	}

	public void updatePieData(String optionsData, PieChartModel pieChartModel) {
		JsonParser parser = new JsonParser();
		JsonObject o = (JsonObject) parser.parse(optionsData);

		pieChartModel
				.setShowTooltip(o.get("showTooltip") != null && o.get("showTooltip").getAsString().equals("on") ? true
						: false);

		pieChartModel.setShowLabel(o.get("showLabel") != null && o.get("showLabel").getAsString().equals("on") ? true
				: false);
		pieChartModel.setDonut(o.get("donut") != null && o.get("donut").getAsString().equals("on") ? true : false);

		if (pieChartModel.isDonut()) {
			pieChartModel.setStartAngle(270);
			pieChartModel.setTotal(120);
		} else {
			pieChartModel.setStartAngle(0);
			pieChartModel.setTotal(0);
		}

		pieChartModel.setAspectRatio(AspectRatio.valueOf(o.get("aspectRatio") != null ? o.get("aspectRatio")
				.getAsString() : "GOLDEN_SECTION"));

	}
}
