package main;

public class CricketCoach implements Coach {

	Brojservis broj;
	private String email;
	private String team;
	
	public CricketCoach(){
		
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Cricket Coach";
	}
	
	public void setBroj(Brojservis broj){
		this.broj = broj;
	}

	@Override
	public int getBroj() {
		return broj.getBroj();
	}

}
