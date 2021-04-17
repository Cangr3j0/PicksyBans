package application;

public class timer {
public int adjustedTimeLeftInPhase;
public int adjustedTimeLeftInSec;
public long internalNowInEpochMs;
public boolean isInfinite;
public String phase;
public int timeLeftInPhase;
public int timeLeftInPhaseInSec;
public int totalTimeInPhase;
public int getAdjustedTimeLeftInPhase() {
	return adjustedTimeLeftInPhase;
}
public void setAdjustedTimeLeftInPhase(int adjustedTimeLeftInPhase) {
	this.adjustedTimeLeftInPhase = adjustedTimeLeftInPhase;
}
public int getAdjustedTimeLeftInSec() {
	return adjustedTimeLeftInSec;
}
public void setAdjustedTimeLeftInSec(int adjustedTimeLeftInSec) {
	this.adjustedTimeLeftInSec = adjustedTimeLeftInSec;
}
public long getInternalNowInEpochMs() {
	return internalNowInEpochMs;
}
public void setInternalNowInEpochMs(long internalNowInEpochMs) {
	this.internalNowInEpochMs = internalNowInEpochMs;
}
public boolean isInfinite() {
	return isInfinite;
}
public void setInfinite(boolean isInfinite) {
	this.isInfinite = isInfinite;
}
public String getPhase() {
	return phase;
}
public void setPhase(String phase) {
	this.phase = phase;
}
public int getTimeLeftInPhase() {
	return timeLeftInPhase;
}
public void setTimeLeftInPhase(int timeLeftInPhase) {
	this.timeLeftInPhase = timeLeftInPhase;
}
public int getTimeLeftInPhaseInSec() {
	return timeLeftInPhaseInSec;
}
public void setTimeLeftInPhaseInSec(int timeLeftInPhaseInSec) {
	this.timeLeftInPhaseInSec = timeLeftInPhaseInSec;
}
public int getTotalTimeInPhase() {
	return totalTimeInPhase;
}
public void setTotalTimeInPhase(int totalTimeInPhase) {
	this.totalTimeInPhase = totalTimeInPhase;
}

}
