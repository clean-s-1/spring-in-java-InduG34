package statisticker;
import java.util.Collections;
import java.util.List;

public class StatsChecker {

	float maxThreshold;
	public IAlerter[] alerters;

	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		this.alerters = alerters;
	}

	public void checkAndAlert(List<Float> numberList) {
		Float max = Collections.max(numberList);
		if (max > maxThreshold) {
			alerters[0].triggerAlert();
			alerters[1].triggerAlert();
		}
	}
}
