package application;

public class session {
	
	private actions[][] actions=new actions[10][];
	private int counter;
	private bans bans;
	private boolean hasSimultaneousBans;
	private boolean hasSimultaneousPicks;
	private boolean isCustomGame;
	private boolean isSpectating;
	private int localPlayerCellId;
	private myTeam[] myTeam=new myTeam[5];
	private theirTeam[] theirTeam=new theirTeam[5];
	private timer timer;
	private trades trades[];
	
	

	public bans getBans() {
		return bans;
	}
	public void setBans(bans bans) {
		this.bans = bans;
	}
	public actions[][] getActions() {
		return actions;
	}
	public void setActions(actions[][] actions) {
		this.actions = actions;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public boolean isHasSimultaneousBans() {
		return hasSimultaneousBans;
	}
	public void setHasSimultaneousBans(boolean hasSimultaneousBans) {
		this.hasSimultaneousBans = hasSimultaneousBans;
	}
	public boolean isHasSimultaneousPicks() {
		return hasSimultaneousPicks;
	}
	public void setHasSimultaneousPicks(boolean hasSimultaneousPicks) {
		this.hasSimultaneousPicks = hasSimultaneousPicks;
	}
	public boolean isCustomGame() {
		return isCustomGame;
	}
	public void setCustomGame(boolean isCustomGame) {
		this.isCustomGame = isCustomGame;
	}
	public boolean isSpectating() {
		return isSpectating;
	}
	public void setSpectating(boolean isSpectating) {
		this.isSpectating = isSpectating;
	}
	public int getLocalPlayerCellId() {
		return localPlayerCellId;
	}
	public void setLocalPlayerCellId(int localPlayerCellId) {
		this.localPlayerCellId = localPlayerCellId;
	}
	public myTeam[] getMyTeam() {
		return myTeam;
	}
	public void setMyTeam(myTeam[] myTeam) {
		this.myTeam = myTeam;
	}
	public theirTeam[] getTheirTeam() {
		return theirTeam;
	}
	public void setTheirTeam(theirTeam[] theirTeam) {
		this.theirTeam = theirTeam;
	}
	public timer getTimer() {
		return timer;
	}
	public void setTimer(timer timer) {
		this.timer = timer;
	}
	public trades[] getTrades() {
		return trades;
	}
	public void setTrades(trades[] trades) {
		this.trades = trades;
	}
	
	
	
	
	
}
