package hw213;

public class WorldCup {
	private String time;
	private String place;
	private String winner;
	
	
	@Override
	public String toString() {
		return time + ", " + place + ", " + winner;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public String getWinner() {
		return winner;
	}


	public void setWinner(String winner) {
		this.winner = winner;
	}


	public WorldCup(String time, String place, String winner) {
		super();
		this.time = time;
		this.place = place;
		this.winner = winner;
	}
	
	
	
	
}
