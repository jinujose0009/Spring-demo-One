package jinu.learn.com;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout(){
		return "Run a hard 5k";
	}

	@Override
	public String getDailyfortune() {
		return fortuneService.getFortune();
	}

}
