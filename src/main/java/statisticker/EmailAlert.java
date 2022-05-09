package statisticker;

public class EmailAlert implements IAlerter {

	public boolean emailSent = false;

	@Override
	public void triggerAlert() {
		this.emailSent = true;
	}

}
