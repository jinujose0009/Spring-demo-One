package jinu.learn.com;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String email;
    private String location;
	public CricketCoach() {
	}
    
	public void setEmail(String email) {
		this.email = email;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	

	public String getEmail() {
		return email;
	}

	public String getLocation() {
		return location;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast ball for 15 min";
	}

	@Override
	public String getDailyfortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
