package week3day1.assignment;

public class Automation extends MultipleLanguage {

	public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.java();
		auto.Selenium();
		auto.python();
		auto.ruby();

	}

	@Override
	public void ruby() {
		
		System.out.println("Ruby");
		
	}

}
