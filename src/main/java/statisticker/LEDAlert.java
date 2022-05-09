package statisticker;

public class LEDAlert implements IAlerter {

	public boolean ledGlows;

	@Override
	public void triggerAlert() {
		this.ledGlows = true;
	}
}