package main;

public class BaseballCoach implements Coach {
	
	private Brojservis broj;
	
	public BaseballCoach(Brojservis brojservis) {
		this.broj = brojservis;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes batting practice";
	}

	@Override
	public int getBroj() {
		return broj.getBroj();
	}
}
