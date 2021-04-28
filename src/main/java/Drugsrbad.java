import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

public class Drugsrbad {
    public static void main(String[] args) {
        double[] xData = new double[] { 0.0, 1.0, 2.0, 7.0, 12.0, 9.5, 1.7, 8.5, 10.8, 43.8 };
        double[] yData = new double[] { 2.0, 1.0, 0.0, 10.8, 7.9, 48.7, 9.4, 12.6, 9.4, 11.8};

        XYChart chart = QuickChart.getChart("Smart Chart", "X", "Y", "y(x)", xData, yData);
        new SwingWrapper(chart).displayChart();
    }

}
