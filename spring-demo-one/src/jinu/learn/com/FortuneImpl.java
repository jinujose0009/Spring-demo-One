package jinu.learn.com;

public class FortuneImpl implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

	@Override
	public String alternateFortune() {
		// TODO Auto-generated method stub
		return "This is my alterante fortune";
	}

}
