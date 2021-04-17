package application;

public class actions {
private int actorCellId;
private int championId;
private boolean completed;
private long id;
private boolean isAllyAction;
private boolean isInProgress;
private int pickTurn;
private String type;


public int getActorCellId() {
	return actorCellId;
}
public void setActorCellId(int actorCellId) {
	this.actorCellId = actorCellId;
}
public int getChampionId() {
	return championId;
}
public void setChampionId(int championId) {
	this.championId = championId;
}
public boolean isCompleted() {
	return completed;
}
public void setCompleted(boolean completed) {
	this.completed = completed;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public boolean isAllyAction() {
	return isAllyAction;
}
public void setAllyAction(boolean isAllyAction) {
	this.isAllyAction = isAllyAction;
}
public boolean isInProgress() {
	return isInProgress;
}
public void setInProgress(boolean isInProgress) {
	this.isInProgress = isInProgress;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getPickTurn() {
	return pickTurn;
}
public void setPickTurn(int pickTurn) {
	this.pickTurn = pickTurn;
}



}
