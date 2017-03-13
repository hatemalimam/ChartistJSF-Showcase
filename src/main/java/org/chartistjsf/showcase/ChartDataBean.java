package org.chartistjsf.showcase;

import java.io.Serializable;
import java.util.Random;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.chartistjsf.model.chart.AspectRatio;
import org.chartistjsf.model.chart.Axis;
import org.chartistjsf.model.chart.AxisType;
import org.chartistjsf.model.chart.BarChartModel;
import org.chartistjsf.model.chart.BarChartSeries;
import org.chartistjsf.model.chart.ChartSeries;
import org.chartistjsf.model.chart.LineChartModel;
import org.chartistjsf.model.chart.LineChartSeries;
import org.chartistjsf.model.chart.PieChartModel;
import org.omnifaces.util.Faces;
import org.primefaces.event.ItemSelectEvent;

@ManagedBean
@ViewScoped
public class ChartDataBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2010856052083951894L;

	private static final Logger logger = Logger.getLogger(ChartDataBean.class.getName());

	private LineChartModel lineModel;
	private LineChartModel biPolarlineModel;
	private BarChartModel barChartModel;
	private PieChartModel pieChartModel;

	public ChartDataBean() {
		createCharts();
	}

	public void createCharts() {
		createBarModel();
		createLineModel();
		createPieChart();
		createBiPolarLine();
	}

	private void createBiPolarLine() {
		biPolarlineModel = new LineChartModel();
		biPolarlineModel.setAspectRatio(AspectRatio.GOLDEN_SECTION);

		biPolarlineModel.addLabel("1");
		biPolarlineModel.addLabel("2");
		biPolarlineModel.addLabel("3");
		biPolarlineModel.addLabel("4");
		biPolarlineModel.addLabel("5");
		biPolarlineModel.addLabel("6");
		biPolarlineModel.addLabel("7");
		biPolarlineModel.addLabel("8");

		LineChartSeries series1 = new LineChartSeries();
		series1.setName("Series 1");

		series1.set(1);
		series1.set(2);
		series1.set(3);
		series1.set(1);
		series1.set(-2);
		series1.set(0);
		series1.set(1);
		series1.set(0);

		LineChartSeries series2 = new LineChartSeries();
		series2.setName("Series 2");

		series2.set(-2);
		series2.set(-1);
		series2.set(-2);
		series2.set(-1);
		series2.set(-2.5);
		series2.set(-1);
		series2.set(-2);
		series2.set(-1);

		LineChartSeries series3 = new LineChartSeries();
		series3.setName("Series 2");

		series3.set(0);
		series3.set(0);
		series3.set(0);
		series3.set(1);
		series3.set(2);
		series3.set(2.5);
		series3.set(2);
		series3.set(1);

		LineChartSeries series4 = new LineChartSeries();
		series4.setName("Series 2");

		series4.set(2.5);
		series4.set(2);
		series4.set(1);
		series4.set(0.5);
		series4.set(1);
		series4.set(0.5);
		series4.set(-1);
		series4.set(-2.5);

		Axis xAxis = biPolarlineModel.getAxis(AxisType.X);
		xAxis.setShowLabel(false);
		xAxis.setShowGrid(false);

		biPolarlineModel.addSeries(series1);
		biPolarlineModel.addSeries(series2);
		biPolarlineModel.addSeries(series3);
		biPolarlineModel.addSeries(series4);

		biPolarlineModel.setFullWidth(true);
		biPolarlineModel.setShowLine(false);
		biPolarlineModel.setShowPoint(false);
		biPolarlineModel.setShowArea(true);
		biPolarlineModel.setFullWidth(true);
		biPolarlineModel.setLineSmooth(false);
		biPolarlineModel.setHigh(3);
		biPolarlineModel.setLow(-3);

	}

	public void createLineModel() {
		Random random = new Random();
		lineModel = new LineChartModel();
		lineModel.setAspectRatio(AspectRatio.GOLDEN_SECTION);

		lineModel.addLabel("1");
		lineModel.addLabel("2");
		lineModel.addLabel("3");
		lineModel.addLabel("4");
		lineModel.addLabel("5");
		lineModel.addLabel("6");
		lineModel.addLabel("7");
		lineModel.addLabel("8");

		LineChartSeries series1 = new LineChartSeries();
		series1.setName("Series 1");

		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));

		LineChartSeries series2 = new LineChartSeries();
		series2.setName("Series 2");

		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));

		LineChartSeries series3 = new LineChartSeries();
		series3.setName("Series 3");

		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));

		LineChartSeries series4 = new LineChartSeries();
		series4.setName("Series 4");

		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));

		LineChartSeries series5 = new LineChartSeries();
		series5.setName("Series 5");

		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));

		Axis xAxis = lineModel.getAxis(AxisType.X);
		xAxis.setLabelInterpolationFnc("myLabelInterpolationFnc");
		lineModel.addSeries(series1);
		lineModel.addSeries(series2);
		lineModel.addSeries(series3);
		// lineModel.addSeries(series4);
		// lineModel.addSeries(series5);
		lineModel.setResponsiveOptions("myResponsiveOptions");
		// lineModel.addSeries(series4);
		lineModel.setAnimateAdvanced(true);
		lineModel.setShowTooltip(true);
		// lineModel.setAnimatePath(true);
	}

	public void createBarModel() {
		Random random = new Random();
		barChartModel = new BarChartModel();
		barChartModel.setAspectRatio(AspectRatio.GOLDEN_SECTION);

		barChartModel.addLabel("Monday");
		barChartModel.addLabel("Tuesday");
		barChartModel.addLabel("Wednesday");
		barChartModel.addLabel("Thursday");
		barChartModel.addLabel("Friday");
		barChartModel.addLabel("Saturday");
		barChartModel.addLabel("Sunday");

		BarChartSeries series1 = new BarChartSeries();
		series1.setName("Series 1");

		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));
		series1.set(random.nextInt(10));

		BarChartSeries series2 = new BarChartSeries();
		series2.setName("Series 2");

		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));
		series2.set(random.nextInt(10));

		BarChartSeries series3 = new BarChartSeries();
		series3.setName("Series 3");

		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));
		series3.set(random.nextInt(10));

		BarChartSeries series4 = new BarChartSeries();
		series4.setName("Series 4");

		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));
		series4.set(random.nextInt(10));

		BarChartSeries series5 = new BarChartSeries();
		series5.setName("Series 5");

		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));
		series5.set(random.nextInt(10));

		BarChartSeries series6 = new BarChartSeries();
		series6.setName("Series 6");

		series6.set(random.nextInt(10));
		series6.set(random.nextInt(10));
		series6.set(random.nextInt(10));
		series6.set(random.nextInt(10));
		series6.set(random.nextInt(10));
		series6.set(random.nextInt(10));
		series6.set(random.nextInt(10));
		series6.set(random.nextInt(10));

		Axis xAxis = barChartModel.getAxis(AxisType.X);
		xAxis.setShowGrid(false);

		// Axis yAxis = barChartModel.getAxis(AxisType.Y);
		// yAxis.setOffset(20);

		barChartModel.addSeries(series1);
		barChartModel.addSeries(series2);
		barChartModel.addSeries(series3);
		// barChartModel.addSeries(series4);
		// barChartModel.addSeries(series5);
		// barChartModel.addSeries(series6);
		barChartModel.setShowTooltip(true);
		barChartModel.setSeriesBarDistance(15);

		// barChartModel.setStackBars(true);
		// barChartModel.setHorizontalBars(true);
		// barChartModel.setReverseData(true);
		// barChartModel.setAnimatePath(true);

		barChartModel.setAnimateAdvanced(true);
	}

	public void createPieChart() {
		pieChartModel = new PieChartModel();

		pieChartModel.addLabel("Bananas");
		pieChartModel.addLabel("Apples");
		pieChartModel.addLabel("Grapes");

		pieChartModel.set(20);
		pieChartModel.set(10);
		pieChartModel.set(30);

		pieChartModel.setShowTooltip(true);
	}

	public void lineCollectData() {
		String optionsData = Faces.getRequestParameter("optionsData");
		JsonHelper helper = new JsonHelper();
		helper.updateLineData(optionsData, lineModel);
	}

	public void barCollectData() {
		String optionsData = Faces.getRequestParameter("optionsData");
		JsonHelper helper = new JsonHelper();
		helper.updateBarData(optionsData, barChartModel);
	}

	public void pieCollectData() {
		String optionsData = Faces.getRequestParameter("optionsData");
		JsonHelper helper = new JsonHelper();
		helper.updatePieData(optionsData, pieChartModel);
	}

	/**
	 * @return the lineModel
	 */
	public LineChartModel getLineModel() {
		return lineModel;
	}

	/**
	 * @param lineModel
	 *            the lineModel to set
	 */
	public void setLineModel(LineChartModel lineModel) {
		this.lineModel = lineModel;
	}

	/**
	 * @return the barChartModel
	 */
	public BarChartModel getBarChartModel() {
		return barChartModel;
	}

	/**
	 * @param barChartModel
	 *            the barChartModel to set
	 */
	public void setBarChartModel(BarChartModel barChartModel) {
		this.barChartModel = barChartModel;
	}

	/**
	 * @return the pieChartModel
	 */
	public PieChartModel getPieChartModel() {
		return pieChartModel;
	}

	/**
	 * @param pieChartModel
	 *            the pieChartModel to set
	 */
	public void setPieChartModel(PieChartModel pieChartModel) {
		this.pieChartModel = pieChartModel;
	}

	/**
	 * @return the biPolarlineModel
	 */
	public LineChartModel getBiPolarlineModel() {
		return biPolarlineModel;
	}

	/**
	 * @param biPolarlineModel
	 *            the biPolarlineModel to set
	 */
	public void setBiPolarlineModel(LineChartModel biPolarlineModel) {
		this.biPolarlineModel = biPolarlineModel;
	}

	public void itemSelect(ItemSelectEvent event) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected", "Item Value: "
				+ ((ChartSeries) lineModel.getSeries().get(event.getSeriesIndex())).getData().get(event.getItemIndex())
				+ ", Series name:" + ((ChartSeries) lineModel.getSeries().get(event.getSeriesIndex())).getName());

		FacesContext.getCurrentInstance().addMessage(event.getComponent().getClientId(), msg);
	}

	public void barItemSelect(ItemSelectEvent event) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected", "Item Value: "
				+ ((ChartSeries) barChartModel.getSeries().get(event.getSeriesIndex())).getData().get(
						event.getItemIndex()) + ", Series name:"
				+ ((ChartSeries) barChartModel.getSeries().get(event.getSeriesIndex())).getName());

		FacesContext.getCurrentInstance().addMessage(event.getComponent().getClientId(), msg);
	}

	public void pieItemSelect(ItemSelectEvent event) {
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected", "Item Value: "
				+ pieChartModel.getData().get(event.getItemIndex()));

		FacesContext.getCurrentInstance().addMessage(event.getComponent().getClientId(), msg);
	}
}
