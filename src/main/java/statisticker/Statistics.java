package statisticker;
import java.util.Collections;
import java.util.List;

public class Statistics {
	static class Stats {
		public Float min = Float.NaN;
		public Float max = Float.NaN;
		public Float average = Float.NaN;
	}

	public static Stats getStatistics(List<Float> numberList) {
		Statistics.Stats stats = new Stats();
		if (!numberList.isEmpty()) {
			stats.min = Collections.min(numberList);
			stats.max = Collections.max(numberList);
			Float totalSum = 0.0f;
			for (Float number : numberList) {
				totalSum += number;
			}
			int size = numberList.size();
			stats.average = (Float) totalSum / size;
		}
		return stats;
	}
}
