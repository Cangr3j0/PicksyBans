package application;

public class bans {

	private int[] myTeamBans=new int[5];
	private int numbans;
	private int []theirTeamBans=new int[5];
	
	
	public int[] getMyTeamBans() {
		return myTeamBans;
	}
	public void setMyTeamBans(int[] myTeamBans) {
		this.myTeamBans = myTeamBans;
	}
	public int getNumbans() {
		return numbans;
	}
	public void setNumbans(int numbans) {
		this.numbans = numbans;
	}
	public int[] getTheirTeamBans() {
		return theirTeamBans;
	}
	public void setTheirTeamBans(int[] theirTeamBans) {
		this.theirTeamBans = theirTeamBans;
	}
	
}
