package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class dataHechizos {

	private Summoner SummonerBarrier;
	private Summoner SummonerBoost;
	private Summoner SummonerDot;
	private Summoner SummonerExhaust;
	private Summoner SummonerFlash;
	private Summoner SummonerHaste;
	private Summoner SummonerHeal;
	private Summoner SummonerMana;
	private Summoner SummonerSmite;
	private Summoner SummonerTeleport;
	
	
	public List<Summoner> getAllSummoners(){
		List<Summoner>lista=new ArrayList<Summoner>();
		lista.add(SummonerBarrier);
		lista.add(SummonerBoost);
		lista.add(SummonerDot);
		lista.add(SummonerExhaust);
		lista.add(SummonerFlash);
		lista.add(SummonerHaste);
		lista.add(SummonerHeal);
		lista.add(SummonerMana);
		lista.add(SummonerSmite);
		lista.add(SummonerTeleport);
		return lista;
	}
	public Summoner getSummonerBarrier() {
		return SummonerBarrier;
	}
	public void setSummonerBarrier(Summoner summonerBarrier) {
		SummonerBarrier = summonerBarrier;
	}
	public Summoner getSummonerBoost() {
		return SummonerBoost;
	}
	public void setSummonerBoost(Summoner summonerBoost) {
		SummonerBoost = summonerBoost;
	}
	public Summoner getSummonerDot() {
		return SummonerDot;
	}
	public void setSummonerDot(Summoner summonerDot) {
		SummonerDot = summonerDot;
	}
	public Summoner getSummonerExhaust() {
		return SummonerExhaust;
	}
	public void setSummonerExhaust(Summoner summonerExhaust) {
		SummonerExhaust = summonerExhaust;
	}
	public Summoner getSummonerFlash() {
		return SummonerFlash;
	}
	public void setSummonerFlash(Summoner summonerFlash) {
		SummonerFlash = summonerFlash;
	}
	public Summoner getSummonerHaste() {
		return SummonerHaste;
	}
	public void setSummonerHaste(Summoner summonerHaste) {
		SummonerHaste = summonerHaste;
	}
	public Summoner getSummonerHeal() {
		return SummonerHeal;
	}
	public void setSummonerHeal(Summoner summonerHeal) {
		SummonerHeal = summonerHeal;
	}
	public Summoner getSummonerMana() {
		return SummonerMana;
	}
	public void setSummonerMana(Summoner summonerMana) {
		SummonerMana = summonerMana;
	}
	public Summoner getSummonerSmite() {
		return SummonerSmite;
	}
	public void setSummonerSmite(Summoner summonerSmite) {
		SummonerSmite = summonerSmite;
	}
	public Summoner getSummonerTeleport() {
		return SummonerTeleport;
	}
	public void setSummonerTeleport(Summoner summonerTeleport) {
		SummonerTeleport = summonerTeleport;
	}
	
	public HashMap<Integer,String> MapeoHechizos(){
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(SummonerBarrier.getKey(), SummonerBarrier.getImage().getSprite());
		map.put(SummonerBoost.getKey(), SummonerBoost.getImage().getSprite());
		map.put(SummonerDot.getKey(), SummonerDot.getImage().getSprite());
		map.put(SummonerExhaust.getKey(), SummonerExhaust.getImage().getSprite());
		map.put(SummonerFlash.getKey(), SummonerFlash.getImage().getSprite());
		map.put(SummonerHaste.getKey(), SummonerHaste.getImage().getSprite());
		map.put(SummonerHeal.getKey(), SummonerHeal.getImage().getSprite());
		map.put(SummonerMana.getKey(), SummonerMana.getImage().getSprite());
		map.put(SummonerSmite.getKey(), SummonerSmite.getImage().getSprite());
		map.put(SummonerTeleport.getKey(), SummonerTeleport.getImage().getSprite());
		return map;
	}

	public HashMap<Integer,Integer> MapeoHechizosX(){
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		map.put(SummonerBarrier.getKey(), SummonerBarrier.getImage().getX());
		map.put(SummonerBoost.getKey(), SummonerBoost.getImage().getX());
		map.put(SummonerDot.getKey(), SummonerDot.getImage().getX());
		map.put(SummonerExhaust.getKey(), SummonerExhaust.getImage().getX());
		map.put(SummonerFlash.getKey(), SummonerFlash.getImage().getX());
		map.put(SummonerHaste.getKey(), SummonerHaste.getImage().getX());
		map.put(SummonerHeal.getKey(), SummonerHeal.getImage().getX());
		map.put(SummonerMana.getKey(), SummonerMana.getImage().getX());
		map.put(SummonerSmite.getKey(), SummonerSmite.getImage().getX());
		map.put(SummonerTeleport.getKey(), SummonerTeleport.getImage().getX());
		return map;
	}
	
	public HashMap<Integer,Integer> MapeoHechizosY(){
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		map.put(SummonerBarrier.getKey(), SummonerBarrier.getImage().getY());
		map.put(SummonerBoost.getKey(), SummonerBoost.getImage().getY());
		map.put(SummonerDot.getKey(), SummonerDot.getImage().getY());
		map.put(SummonerExhaust.getKey(), SummonerExhaust.getImage().getY());
		map.put(SummonerFlash.getKey(), SummonerFlash.getImage().getY());
		map.put(SummonerHaste.getKey(), SummonerHaste.getImage().getY());
		map.put(SummonerHeal.getKey(), SummonerHeal.getImage().getY());
		map.put(SummonerMana.getKey(), SummonerMana.getImage().getY());
		map.put(SummonerSmite.getKey(), SummonerSmite.getImage().getY());
		map.put(SummonerTeleport.getKey(), SummonerTeleport.getImage().getY());
		return map;
	}
	
	public HashMap<Integer,Integer> MapeoHechizosW(){
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		map.put(SummonerBarrier.getKey(), SummonerBarrier.getImage().getW());
		map.put(SummonerBoost.getKey(), SummonerBoost.getImage().getW());
		map.put(SummonerDot.getKey(), SummonerDot.getImage().getW());
		map.put(SummonerExhaust.getKey(), SummonerExhaust.getImage().getW());
		map.put(SummonerFlash.getKey(), SummonerFlash.getImage().getW());
		map.put(SummonerHaste.getKey(), SummonerHaste.getImage().getW());
		map.put(SummonerHeal.getKey(), SummonerHeal.getImage().getW());
		map.put(SummonerMana.getKey(), SummonerMana.getImage().getW());
		map.put(SummonerSmite.getKey(), SummonerSmite.getImage().getW());
		map.put(SummonerTeleport.getKey(), SummonerTeleport.getImage().getW());
		return map;
	}

	public HashMap<Integer,Integer> MapeoHechizosH(){
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		map.put(SummonerBarrier.getKey(), SummonerBarrier.getImage().getH());
		map.put(SummonerBoost.getKey(), SummonerBoost.getImage().getH());
		map.put(SummonerDot.getKey(), SummonerDot.getImage().getH());
		map.put(SummonerExhaust.getKey(), SummonerExhaust.getImage().getH());
		map.put(SummonerFlash.getKey(), SummonerFlash.getImage().getH());
		map.put(SummonerHaste.getKey(), SummonerHaste.getImage().getH());
		map.put(SummonerHeal.getKey(), SummonerHeal.getImage().getH());
		map.put(SummonerMana.getKey(), SummonerMana.getImage().getH());
		map.put(SummonerSmite.getKey(), SummonerSmite.getImage().getH());
		map.put(SummonerTeleport.getKey(), SummonerTeleport.getImage().getH());
		return map;
	}

	
}
