package inheritance.abstractclass;

public class BussinessEmailServiceImpl extends EmailService implements Transformer{
	@Override
	void Login() {
		System.out.println("BussinessEmailServiceImpl --> login");
	}
	@Override
	void loginWith2Steps() {
		System.out.println("BussinessEmailServiceImpl --> login with 2 step");
	}
	@Override
	public void sending(boolean isSafe) {
		System.out.println("BussinessEmailServiceImpl --> sending");
	}
}
