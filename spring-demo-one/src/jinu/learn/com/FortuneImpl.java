package jinu.learn.com;

public class FortuneImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
