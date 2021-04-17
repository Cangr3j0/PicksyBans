
package champions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class Data {

	@SerializedName("Aatrox")
	private Aatrox aatrox;
	@SerializedName("Ahri")
	private Ahri ahri;
	@SerializedName("Akali")
	private Akali akali;
	@SerializedName("Alistar")
	private Alistar alistar;
	@SerializedName("Amumu")
	private Amumu amumu;
	@SerializedName("Anivia")
	private Anivia anivia;
	@SerializedName("Annie")
	private Annie annie;
	@SerializedName("Aphelios")
	private Aphelios aphelios;
	@SerializedName("Ashe")
	private Ashe ashe;
	@SerializedName("AurelionSol")
	private AurelionSol aurelionSol;
	@SerializedName("Azir")
	private Azir azir;
	@SerializedName("Bard")
	private Bard bard;
	@SerializedName("Blitzcrank")
	private Blitzcrank blitzcrank;
	@SerializedName("Brand")
	private Brand brand;
	@SerializedName("Braum")
	private Braum braum;
	@SerializedName("Caitlyn")
	private Caitlyn caitlyn;
	@SerializedName("Camille")
	private Camille camille;
	@SerializedName("Cassiopeia")
	private Cassiopeia cassiopeia;
	@SerializedName("Chogath")
	private Chogath chogath;
	@SerializedName("Corki")
	private Corki corki;
	@SerializedName("Darius")
	private Darius darius;
	@SerializedName("Diana")
	private Diana diana;
	@SerializedName("Draven")
	private Draven draven;
	@SerializedName("DrMundo")
	private DrMundo drMundo;
	@SerializedName("Ekko")
	private Ekko ekko;
	@SerializedName("Elise")
	private Elise elise;
	@SerializedName("Evelynn")
	private Evelynn evelynn;
	@SerializedName("Ezreal")
	private Ezreal ezreal;
	@SerializedName("Fiddlesticks")
	private Fiddlesticks fiddlesticks;
	@SerializedName("Fiora")
	private Fiora fiora;
	@SerializedName("Fizz")
	private Fizz fizz;
	@SerializedName("Galio")
	private Galio galio;
	@SerializedName("Gangplank")
	private Gangplank gangplank;
	@SerializedName("Garen")
	private Garen garen;
	@SerializedName("Gnar")
	private Gnar gnar;
	@SerializedName("Gragas")
	private Gragas gragas;
	@SerializedName("Graves")
	private Graves graves;
	@SerializedName("Hecarim")
	private Hecarim hecarim;
	@SerializedName("Heimerdinger")
	private Heimerdinger heimerdinger;
	@SerializedName("Illaoi")
	private Illaoi illaoi;
	@SerializedName("Irelia")
	private Irelia irelia;
	@SerializedName("Ivern")
	private Ivern ivern;
	@SerializedName("Janna")
	private Janna janna;
	@SerializedName("JarvanIV")
	private JarvanIV jarvanIV;
	@SerializedName("Jax")
	private Jax jax;
	@SerializedName("Jayce")
	private Jayce jayce;
	@SerializedName("Jhin")
	private Jhin jhin;
	@SerializedName("Jinx")
	private Jinx jinx;
	@SerializedName("Kaisa")
	private Kaisa kaisa;
	@SerializedName("Kalista")
	private Kalista kalista;
	@SerializedName("Karma")
	private Karma karma;
	@SerializedName("Karthus")
	private Karthus karthus;
	@SerializedName("Kassadin")
	private Kassadin kassadin;
	@SerializedName("Katarina")
	private Katarina katarina;
	@SerializedName("Kayle")
	private Kayle kayle;
	@SerializedName("Kayn")
	private Kayn kayn;
	@SerializedName("Kennen")
	private Kennen kennen;
	@SerializedName("Khazix")
	private Khazix khazix;
	@SerializedName("Kindred")
	private Kindred kindred;
	@SerializedName("Kled")
	private Kled kled;
	@SerializedName("KogMaw")
	private KogMaw kogMaw;
	@SerializedName("Leblanc")
	private Leblanc leblanc;
	@SerializedName("LeeSin")
	private LeeSin leeSin;
	@SerializedName("Leona")
	private Leona leona;
	@SerializedName("Lissandra")
	private Lissandra lissandra;
	@SerializedName("Lucian")
	private Lucian lucian;
	@SerializedName("Lulu")
	private Lulu lulu;
	@SerializedName("Lux")
	private Lux lux;
	@SerializedName("Malphite")
	private Malphite malphite;
	@SerializedName("Malzahar")
	private Malzahar malzahar;
	@SerializedName("Maokai")
	private Maokai maokai;
	@SerializedName("MasterYi")
	private MasterYi masterYi;
	@SerializedName("MissFortune")
	private MissFortune missFortune;
	@SerializedName("Wukong")
	private Wukong wukong;
	@SerializedName("Mordekaiser")
	private Mordekaiser mordekaiser;
	@SerializedName("Morgana")
	private Morgana morgana;
	@SerializedName("Nami")
	private Nami nami;
	@SerializedName("Nasus")
	private Nasus nasus;
	@SerializedName("Nautilus")
	private Nautilus nautilus;
	@SerializedName("Neeko")
	private Neeko neeko;
	@SerializedName("Nidalee")
	private Nidalee nidalee;
	@SerializedName("Nocturne")
	private Nocturne nocturne;
	@SerializedName("Nunu")
	private Nunu nunu;
	@SerializedName("Olaf")
	private Olaf olaf;
	@SerializedName("Orianna")
	private Orianna orianna;
	@SerializedName("Ornn")
	private Ornn ornn;
	@SerializedName("Pantheon")
	private Pantheon pantheon;
	@SerializedName("Poppy")
	private Poppy poppy;
	@SerializedName("Pyke")
	private Pyke pyke;
	@SerializedName("Qiyana")
	private Qiyana qiyana;
	@SerializedName("Quinn")
	private Quinn quinn;
	@SerializedName("Rakan")
	private Rakan rakan;
	@SerializedName("Rammus")
	private Rammus rammus;
	@SerializedName("RekSai")
	private RekSai rekSai;
	@SerializedName("Renekton")
	private Renekton renekton;
	@SerializedName("Rengar")
	private Rengar rengar;
	@SerializedName("Riven")
	private Riven riven;
	@SerializedName("Rumble")
	private Rumble rumble;
	@SerializedName("Ryze")
	private Ryze ryze;
	@SerializedName("Sejuani")
	private Sejuani sejuani;
	@SerializedName("Senna")
	private Senna senna;
	@SerializedName("Sett")
	private Sett sett;
	@SerializedName("Shaco")
	private Shaco shaco;
	@SerializedName("Shen")
	private Shen shen;
	@SerializedName("Shyvana")
	private Shyvana shyvana;
	@SerializedName("Singed")
	private Singed singed;
	@SerializedName("Sion")
	private Sion sion;
	@SerializedName("Sivir")
	private Sivir sivir;
	@SerializedName("Skarner")
	private Skarner skarner;
	@SerializedName("Sona")
	private Sona sona;
	@SerializedName("Soraka")
	private Soraka soraka;
	@SerializedName("Swain")
	private Swain swain;
	@SerializedName("Sylas")
	private Sylas sylas;
	@SerializedName("Syndra")
	private Syndra syndra;
	@SerializedName("TahmKench")
	private TahmKench tahmKench;
	@SerializedName("Taliyah")
	private Taliyah taliyah;
	@SerializedName("Talon")
	private Talon talon;
	@SerializedName("Taric")
	private Taric taric;
	@SerializedName("Teemo")
	private Teemo teemo;
	@SerializedName("Thresh")
	private Thresh thresh;
	@SerializedName("Tristana")
	private Tristana tristana;
	@SerializedName("Trundle")
	private Trundle trundle;
	@SerializedName("Tryndamere")
	private Tryndamere tryndamere;
	@SerializedName("TwistedFate")
	private TwistedFate twistedFate;
	@SerializedName("Twitch")
	private Twitch twitch;
	@SerializedName("Udyr")
	private Udyr udyr;
	@SerializedName("Urgot")
	private Urgot urgot;
	@SerializedName("Varus")
	private Varus varus;
	@SerializedName("Vayne")
	private Vayne vayne;
	@SerializedName("Veigar")
	private Veigar veigar;
	@SerializedName("Velkoz")
	private Velkoz velkoz;
	@SerializedName("Vi")
	private Vi vi;
	@SerializedName("Viktor")
	private Viktor viktor;
	@SerializedName("Vladimir")
	private Vladimir vladimir;
	@SerializedName("Volibear")
	private Volibear volibear;
	@SerializedName("Warwick")
	private Warwick warwick;
	@SerializedName("Xayah")
	private Xayah xayah;
	@SerializedName("Xerath")
	private Xerath xerath;
	@SerializedName("XinZhao")
	private XinZhao xinZhao;
	@SerializedName("Yasuo")
	private Yasuo yasuo;
	@SerializedName("Yorick")
	private Yorick yorick;
	@SerializedName("Yuumi")
	private Yuumi yuumi;
	@SerializedName("Zac")
	private Zac zac;
	@SerializedName("Zed")
	private Zed zed;
	@SerializedName("Ziggs")
	private Ziggs ziggs;
	@SerializedName("Zilean")
	private Zilean zilean;
	@SerializedName("Zoe")
	private Zoe zoe;
	@SerializedName("Zyra")
	private Zyra zyra;

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@SerializedName("Aatrox")
	public Aatrox getAatrox() {
		return aatrox;
	}

	@SerializedName("Aatrox")
	public void setAatrox(Aatrox aatrox) {
		this.aatrox = aatrox;
	}

	@SerializedName("Ahri")
	public Ahri getAhri() {
		return ahri;
	}

	@SerializedName("Ahri")
	public void setAhri(Ahri ahri) {
		this.ahri = ahri;
	}

	@SerializedName("Akali")
	public Akali getAkali() {
		return akali;
	}

	@SerializedName("Akali")
	public void setAkali(Akali akali) {
		this.akali = akali;
	}

	@SerializedName("Alistar")
	public Alistar getAlistar() {
		return alistar;
	}

	@SerializedName("Alistar")
	public void setAlistar(Alistar alistar) {
		this.alistar = alistar;
	}

	@SerializedName("Amumu")
	public Amumu getAmumu() {
		return amumu;
	}

	@SerializedName("Amumu")
	public void setAmumu(Amumu amumu) {
		this.amumu = amumu;
	}

	@SerializedName("Anivia")
	public Anivia getAnivia() {
		return anivia;
	}

	@SerializedName("Anivia")
	public void setAnivia(Anivia anivia) {
		this.anivia = anivia;
	}

	@SerializedName("Annie")
	public Annie getAnnie() {
		return annie;
	}

	@SerializedName("Annie")
	public void setAnnie(Annie annie) {
		this.annie = annie;
	}

	@SerializedName("Aphelios")
	public Aphelios getAphelios() {
		return aphelios;
	}

	@SerializedName("Aphelios")
	public void setAphelios(Aphelios aphelios) {
		this.aphelios = aphelios;
	}

	@SerializedName("Ashe")
	public Ashe getAshe() {
		return ashe;
	}

	@SerializedName("Ashe")
	public void setAshe(Ashe ashe) {
		this.ashe = ashe;
	}

	@SerializedName("AurelionSol")
	public AurelionSol getAurelionSol() {
		return aurelionSol;
	}

	@SerializedName("AurelionSol")
	public void setAurelionSol(AurelionSol aurelionSol) {
		this.aurelionSol = aurelionSol;
	}

	@SerializedName("Azir")
	public Azir getAzir() {
		return azir;
	}

	@SerializedName("Azir")
	public void setAzir(Azir azir) {
		this.azir = azir;
	}

	@SerializedName("Bard")
	public Bard getBard() {
		return bard;
	}

	@SerializedName("Bard")
	public void setBard(Bard bard) {
		this.bard = bard;
	}

	@SerializedName("Blitzcrank")
	public Blitzcrank getBlitzcrank() {
		return blitzcrank;
	}

	@SerializedName("Blitzcrank")
	public void setBlitzcrank(Blitzcrank blitzcrank) {
		this.blitzcrank = blitzcrank;
	}

	@SerializedName("Brand")
	public Brand getBrand() {
		return brand;
	}

	@SerializedName("Brand")
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@SerializedName("Braum")
	public Braum getBraum() {
		return braum;
	}

	@SerializedName("Braum")
	public void setBraum(Braum braum) {
		this.braum = braum;
	}

	@SerializedName("Caitlyn")
	public Caitlyn getCaitlyn() {
		return caitlyn;
	}

	@SerializedName("Caitlyn")
	public void setCaitlyn(Caitlyn caitlyn) {
		this.caitlyn = caitlyn;
	}

	@SerializedName("Camille")
	public Camille getCamille() {
		return camille;
	}

	@SerializedName("Camille")
	public void setCamille(Camille camille) {
		this.camille = camille;
	}

	@SerializedName("Cassiopeia")
	public Cassiopeia getCassiopeia() {
		return cassiopeia;
	}

	@SerializedName("Cassiopeia")
	public void setCassiopeia(Cassiopeia cassiopeia) {
		this.cassiopeia = cassiopeia;
	}

	@SerializedName("Chogath")
	public Chogath getChogath() {
		return chogath;
	}

	@SerializedName("Chogath")
	public void setChogath(Chogath chogath) {
		this.chogath = chogath;
	}

	@SerializedName("Corki")
	public Corki getCorki() {
		return corki;
	}

	@SerializedName("Corki")
	public void setCorki(Corki corki) {
		this.corki = corki;
	}

	@SerializedName("Darius")
	public Darius getDarius() {
		return darius;
	}

	@SerializedName("Darius")
	public void setDarius(Darius darius) {
		this.darius = darius;
	}

	@SerializedName("Diana")
	public Diana getDiana() {
		return diana;
	}

	@SerializedName("Diana")
	public void setDiana(Diana diana) {
		this.diana = diana;
	}

	@SerializedName("Draven")
	public Draven getDraven() {
		return draven;
	}

	@SerializedName("Draven")
	public void setDraven(Draven draven) {
		this.draven = draven;
	}

	@SerializedName("DrMundo")
	public DrMundo getDrMundo() {
		return drMundo;
	}

	@SerializedName("DrMundo")
	public void setDrMundo(DrMundo drMundo) {
		this.drMundo = drMundo;
	}

	@SerializedName("Ekko")
	public Ekko getEkko() {
		return ekko;
	}

	@SerializedName("Ekko")
	public void setEkko(Ekko ekko) {
		this.ekko = ekko;
	}

	@SerializedName("Elise")
	public Elise getElise() {
		return elise;
	}

	@SerializedName("Elise")
	public void setElise(Elise elise) {
		this.elise = elise;
	}

	@SerializedName("Evelynn")
	public Evelynn getEvelynn() {
		return evelynn;
	}

	@SerializedName("Evelynn")
	public void setEvelynn(Evelynn evelynn) {
		this.evelynn = evelynn;
	}

	@SerializedName("Ezreal")
	public Ezreal getEzreal() {
		return ezreal;
	}

	@SerializedName("Ezreal")
	public void setEzreal(Ezreal ezreal) {
		this.ezreal = ezreal;
	}

	@SerializedName("Fiddlesticks")
	public Fiddlesticks getFiddlesticks() {
		return fiddlesticks;
	}

	@SerializedName("Fiddlesticks")
	public void setFiddlesticks(Fiddlesticks fiddlesticks) {
		this.fiddlesticks = fiddlesticks;
	}

	@SerializedName("Fiora")
	public Fiora getFiora() {
		return fiora;
	}

	@SerializedName("Fiora")
	public void setFiora(Fiora fiora) {
		this.fiora = fiora;
	}

	@SerializedName("Fizz")
	public Fizz getFizz() {
		return fizz;
	}

	@SerializedName("Fizz")
	public void setFizz(Fizz fizz) {
		this.fizz = fizz;
	}

	@SerializedName("Galio")
	public Galio getGalio() {
		return galio;
	}

	@SerializedName("Galio")
	public void setGalio(Galio galio) {
		this.galio = galio;
	}

	@SerializedName("Gangplank")
	public Gangplank getGangplank() {
		return gangplank;
	}

	@SerializedName("Gangplank")
	public void setGangplank(Gangplank gangplank) {
		this.gangplank = gangplank;
	}

	@SerializedName("Garen")
	public Garen getGaren() {
		return garen;
	}

	@SerializedName("Garen")
	public void setGaren(Garen garen) {
		this.garen = garen;
	}

	@SerializedName("Gnar")
	public Gnar getGnar() {
		return gnar;
	}

	@SerializedName("Gnar")
	public void setGnar(Gnar gnar) {
		this.gnar = gnar;
	}

	@SerializedName("Gragas")
	public Gragas getGragas() {
		return gragas;
	}

	@SerializedName("Gragas")
	public void setGragas(Gragas gragas) {
		this.gragas = gragas;
	}

	@SerializedName("Graves")
	public Graves getGraves() {
		return graves;
	}

	@SerializedName("Graves")
	public void setGraves(Graves graves) {
		this.graves = graves;
	}

	@SerializedName("Hecarim")
	public Hecarim getHecarim() {
		return hecarim;
	}

	@SerializedName("Hecarim")
	public void setHecarim(Hecarim hecarim) {
		this.hecarim = hecarim;
	}

	@SerializedName("Heimerdinger")
	public Heimerdinger getHeimerdinger() {
		return heimerdinger;
	}

	@SerializedName("Heimerdinger")
	public void setHeimerdinger(Heimerdinger heimerdinger) {
		this.heimerdinger = heimerdinger;
	}

	@SerializedName("Illaoi")
	public Illaoi getIllaoi() {
		return illaoi;
	}

	@SerializedName("Illaoi")
	public void setIllaoi(Illaoi illaoi) {
		this.illaoi = illaoi;
	}

	@SerializedName("Irelia")
	public Irelia getIrelia() {
		return irelia;
	}

	@SerializedName("Irelia")
	public void setIrelia(Irelia irelia) {
		this.irelia = irelia;
	}

	@SerializedName("Ivern")
	public Ivern getIvern() {
		return ivern;
	}

	@SerializedName("Ivern")
	public void setIvern(Ivern ivern) {
		this.ivern = ivern;
	}

	@SerializedName("Janna")
	public Janna getJanna() {
		return janna;
	}

	@SerializedName("Janna")
	public void setJanna(Janna janna) {
		this.janna = janna;
	}

	@SerializedName("JarvanIV")
	public JarvanIV getJarvanIV() {
		return jarvanIV;
	}

	@SerializedName("JarvanIV")
	public void setJarvanIV(JarvanIV jarvanIV) {
		this.jarvanIV = jarvanIV;
	}

	@SerializedName("Jax")
	public Jax getJax() {
		return jax;
	}

	@SerializedName("Jax")
	public void setJax(Jax jax) {
		this.jax = jax;
	}

	@SerializedName("Jayce")
	public Jayce getJayce() {
		return jayce;
	}

	@SerializedName("Jayce")
	public void setJayce(Jayce jayce) {
		this.jayce = jayce;
	}

	@SerializedName("Jhin")
	public Jhin getJhin() {
		return jhin;
	}

	@SerializedName("Jhin")
	public void setJhin(Jhin jhin) {
		this.jhin = jhin;
	}

	@SerializedName("Jinx")
	public Jinx getJinx() {
		return jinx;
	}

	@SerializedName("Jinx")
	public void setJinx(Jinx jinx) {
		this.jinx = jinx;
	}

	@SerializedName("Kaisa")
	public Kaisa getKaisa() {
		return kaisa;
	}

	@SerializedName("Kaisa")
	public void setKaisa(Kaisa kaisa) {
		this.kaisa = kaisa;
	}

	@SerializedName("Kalista")
	public Kalista getKalista() {
		return kalista;
	}

	@SerializedName("Kalista")
	public void setKalista(Kalista kalista) {
		this.kalista = kalista;
	}

	@SerializedName("Karma")
	public Karma getKarma() {
		return karma;
	}

	@SerializedName("Karma")
	public void setKarma(Karma karma) {
		this.karma = karma;
	}

	@SerializedName("Karthus")
	public Karthus getKarthus() {
		return karthus;
	}

	@SerializedName("Karthus")
	public void setKarthus(Karthus karthus) {
		this.karthus = karthus;
	}

	@SerializedName("Kassadin")
	public Kassadin getKassadin() {
		return kassadin;
	}

	@SerializedName("Kassadin")
	public void setKassadin(Kassadin kassadin) {
		this.kassadin = kassadin;
	}

	@SerializedName("Katarina")
	public Katarina getKatarina() {
		return katarina;
	}

	@SerializedName("Katarina")
	public void setKatarina(Katarina katarina) {
		this.katarina = katarina;
	}

	@SerializedName("Kayle")
	public Kayle getKayle() {
		return kayle;
	}

	@SerializedName("Kayle")
	public void setKayle(Kayle kayle) {
		this.kayle = kayle;
	}

	@SerializedName("Kayn")
	public Kayn getKayn() {
		return kayn;
	}

	@SerializedName("Kayn")
	public void setKayn(Kayn kayn) {
		this.kayn = kayn;
	}

	@SerializedName("Kennen")
	public Kennen getKennen() {
		return kennen;
	}

	@SerializedName("Kennen")
	public void setKennen(Kennen kennen) {
		this.kennen = kennen;
	}

	@SerializedName("Khazix")
	public Khazix getKhazix() {
		return khazix;
	}

	@SerializedName("Khazix")
	public void setKhazix(Khazix khazix) {
		this.khazix = khazix;
	}

	@SerializedName("Kindred")
	public Kindred getKindred() {
		return kindred;
	}

	@SerializedName("Kindred")
	public void setKindred(Kindred kindred) {
		this.kindred = kindred;
	}

	@SerializedName("Kled")
	public Kled getKled() {
		return kled;
	}

	@SerializedName("Kled")
	public void setKled(Kled kled) {
		this.kled = kled;
	}

	@SerializedName("KogMaw")
	public KogMaw getKogMaw() {
		return kogMaw;
	}

	@SerializedName("KogMaw")
	public void setKogMaw(KogMaw kogMaw) {
		this.kogMaw = kogMaw;
	}

	@SerializedName("Leblanc")
	public Leblanc getLeblanc() {
		return leblanc;
	}

	@SerializedName("Leblanc")
	public void setLeblanc(Leblanc leblanc) {
		this.leblanc = leblanc;
	}

	@SerializedName("LeeSin")
	public LeeSin getLeeSin() {
		return leeSin;
	}

	@SerializedName("LeeSin")
	public void setLeeSin(LeeSin leeSin) {
		this.leeSin = leeSin;
	}

	@SerializedName("Leona")
	public Leona getLeona() {
		return leona;
	}

	@SerializedName("Leona")
	public void setLeona(Leona leona) {
		this.leona = leona;
	}

	@SerializedName("Lissandra")
	public Lissandra getLissandra() {
		return lissandra;
	}

	@SerializedName("Lissandra")
	public void setLissandra(Lissandra lissandra) {
		this.lissandra = lissandra;
	}

	@SerializedName("Lucian")
	public Lucian getLucian() {
		return lucian;
	}

	@SerializedName("Lucian")
	public void setLucian(Lucian lucian) {
		this.lucian = lucian;
	}

	@SerializedName("Lulu")
	public Lulu getLulu() {
		return lulu;
	}

	@SerializedName("Lulu")
	public void setLulu(Lulu lulu) {
		this.lulu = lulu;
	}

	@SerializedName("Lux")
	public Lux getLux() {
		return lux;
	}

	@SerializedName("Lux")
	public void setLux(Lux lux) {
		this.lux = lux;
	}

	@SerializedName("Malphite")
	public Malphite getMalphite() {
		return malphite;
	}

	@SerializedName("Malphite")
	public void setMalphite(Malphite malphite) {
		this.malphite = malphite;
	}

	@SerializedName("Malzahar")
	public Malzahar getMalzahar() {
		return malzahar;
	}

	@SerializedName("Malzahar")
	public void setMalzahar(Malzahar malzahar) {
		this.malzahar = malzahar;
	}

	@SerializedName("Maokai")
	public Maokai getMaokai() {
		return maokai;
	}

	@SerializedName("Maokai")
	public void setMaokai(Maokai maokai) {
		this.maokai = maokai;
	}

	@SerializedName("MasterYi")
	public MasterYi getMasterYi() {
		return masterYi;
	}

	@SerializedName("MasterYi")
	public void setMasterYi(MasterYi masterYi) {
		this.masterYi = masterYi;
	}

	@SerializedName("MissFortune")
	public MissFortune getMissFortune() {
		return missFortune;
	}

	@SerializedName("MissFortune")
	public void setMissFortune(MissFortune missFortune) {
		this.missFortune = missFortune;
	}

	@SerializedName("wukong")
	public Wukong getWukong() {
		return wukong;
	}

	@SerializedName("Wukong")
	public void setWukong(Wukong wukong) {
		this.wukong = wukong;
	}

	@SerializedName("Mordekaiser")
	public Mordekaiser getMordekaiser() {
		return mordekaiser;
	}

	@SerializedName("Mordekaiser")
	public void setMordekaiser(Mordekaiser mordekaiser) {
		this.mordekaiser = mordekaiser;
	}

	@SerializedName("Morgana")
	public Morgana getMorgana() {
		return morgana;
	}

	@SerializedName("Morgana")
	public void setMorgana(Morgana morgana) {
		this.morgana = morgana;
	}

	@SerializedName("Nami")
	public Nami getNami() {
		return nami;
	}

	@SerializedName("Nami")
	public void setNami(Nami nami) {
		this.nami = nami;
	}

	@SerializedName("Nasus")
	public Nasus getNasus() {
		return nasus;
	}

	@SerializedName("Nasus")
	public void setNasus(Nasus nasus) {
		this.nasus = nasus;
	}

	@SerializedName("Nautilus")
	public Nautilus getNautilus() {
		return nautilus;
	}

	@SerializedName("Nautilus")
	public void setNautilus(Nautilus nautilus) {
		this.nautilus = nautilus;
	}

	@SerializedName("Neeko")
	public Neeko getNeeko() {
		return neeko;
	}

	@SerializedName("Neeko")
	public void setNeeko(Neeko neeko) {
		this.neeko = neeko;
	}

	@SerializedName("Nidalee")
	public Nidalee getNidalee() {
		return nidalee;
	}

	@SerializedName("Nidalee")
	public void setNidalee(Nidalee nidalee) {
		this.nidalee = nidalee;
	}

	@SerializedName("Nocturne")
	public Nocturne getNocturne() {
		return nocturne;
	}

	@SerializedName("Nocturne")
	public void setNocturne(Nocturne nocturne) {
		this.nocturne = nocturne;
	}

	@SerializedName("Nunu")
	public Nunu getNunu() {
		return nunu;
	}

	@SerializedName("Nunu")
	public void setNunu(Nunu nunu) {
		this.nunu = nunu;
	}

	@SerializedName("Olaf")
	public Olaf getOlaf() {
		return olaf;
	}

	@SerializedName("Olaf")
	public void setOlaf(Olaf olaf) {
		this.olaf = olaf;
	}

	@SerializedName("Orianna")
	public Orianna getOrianna() {
		return orianna;
	}

	@SerializedName("Orianna")
	public void setOrianna(Orianna orianna) {
		this.orianna = orianna;
	}

	@SerializedName("Ornn")
	public Ornn getOrnn() {
		return ornn;
	}

	@SerializedName("Ornn")
	public void setOrnn(Ornn ornn) {
		this.ornn = ornn;
	}

	@SerializedName("Pantheon")
	public Pantheon getPantheon() {
		return pantheon;
	}

	@SerializedName("Pantheon")
	public void setPantheon(Pantheon pantheon) {
		this.pantheon = pantheon;
	}

	@SerializedName("Poppy")
	public Poppy getPoppy() {
		return poppy;
	}

	@SerializedName("Poppy")
	public void setPoppy(Poppy poppy) {
		this.poppy = poppy;
	}

	@SerializedName("Pyke")
	public Pyke getPyke() {
		return pyke;
	}

	@SerializedName("Pyke")
	public void setPyke(Pyke pyke) {
		this.pyke = pyke;
	}

	@SerializedName("Qiyana")
	public Qiyana getQiyana() {
		return qiyana;
	}

	@SerializedName("Qiyana")
	public void setQiyana(Qiyana qiyana) {
		this.qiyana = qiyana;
	}

	@SerializedName("Quinn")
	public Quinn getQuinn() {
		return quinn;
	}

	@SerializedName("Quinn")
	public void setQuinn(Quinn quinn) {
		this.quinn = quinn;
	}

	@SerializedName("Rakan")
	public Rakan getRakan() {
		return rakan;
	}

	@SerializedName("Rakan")
	public void setRakan(Rakan rakan) {
		this.rakan = rakan;
	}

	@SerializedName("Rammus")
	public Rammus getRammus() {
		return rammus;
	}

	@SerializedName("Rammus")
	public void setRammus(Rammus rammus) {
		this.rammus = rammus;
	}

	@SerializedName("RekSai")
	public RekSai getRekSai() {
		return rekSai;
	}

	@SerializedName("RekSai")
	public void setRekSai(RekSai rekSai) {
		this.rekSai = rekSai;
	}

	@SerializedName("Renekton")
	public Renekton getRenekton() {
		return renekton;
	}

	@SerializedName("Renekton")
	public void setRenekton(Renekton renekton) {
		this.renekton = renekton;
	}

	@SerializedName("Rengar")
	public Rengar getRengar() {
		return rengar;
	}

	@SerializedName("Rengar")
	public void setRengar(Rengar rengar) {
		this.rengar = rengar;
	}

	@SerializedName("Riven")
	public Riven getRiven() {
		return riven;
	}

	@SerializedName("Riven")
	public void setRiven(Riven riven) {
		this.riven = riven;
	}

	@SerializedName("Rumble")
	public Rumble getRumble() {
		return rumble;
	}

	@SerializedName("Rumble")
	public void setRumble(Rumble rumble) {
		this.rumble = rumble;
	}

	@SerializedName("Ryze")
	public Ryze getRyze() {
		return ryze;
	}

	@SerializedName("Ryze")
	public void setRyze(Ryze ryze) {
		this.ryze = ryze;
	}

	@SerializedName("Sejuani")
	public Sejuani getSejuani() {
		return sejuani;
	}

	@SerializedName("Sejuani")
	public void setSejuani(Sejuani sejuani) {
		this.sejuani = sejuani;
	}

	@SerializedName("Senna")
	public Senna getSenna() {
		return senna;
	}

	@SerializedName("Senna")
	public void setSenna(Senna senna) {
		this.senna = senna;
	}

	@SerializedName("Sett")
	public Sett getSett() {
		return sett;
	}

	@SerializedName("Sett")
	public void setSett(Sett sett) {
		this.sett = sett;
	}

	@SerializedName("Shaco")
	public Shaco getShaco() {
		return shaco;
	}

	@SerializedName("Shaco")
	public void setShaco(Shaco shaco) {
		this.shaco = shaco;
	}

	@SerializedName("Shen")
	public Shen getShen() {
		return shen;
	}

	@SerializedName("Shen")
	public void setShen(Shen shen) {
		this.shen = shen;
	}

	@SerializedName("Shyvana")
	public Shyvana getShyvana() {
		return shyvana;
	}

	@SerializedName("Shyvana")
	public void setShyvana(Shyvana shyvana) {
		this.shyvana = shyvana;
	}

	@SerializedName("Singed")
	public Singed getSinged() {
		return singed;
	}

	@SerializedName("Singed")
	public void setSinged(Singed singed) {
		this.singed = singed;
	}

	@SerializedName("Sion")
	public Sion getSion() {
		return sion;
	}

	@SerializedName("Sion")
	public void setSion(Sion sion) {
		this.sion = sion;
	}

	@SerializedName("Sivir")
	public Sivir getSivir() {
		return sivir;
	}

	@SerializedName("Sivir")
	public void setSivir(Sivir sivir) {
		this.sivir = sivir;
	}

	@SerializedName("Skarner")
	public Skarner getSkarner() {
		return skarner;
	}

	@SerializedName("Skarner")
	public void setSkarner(Skarner skarner) {
		this.skarner = skarner;
	}

	@SerializedName("Sona")
	public Sona getSona() {
		return sona;
	}

	@SerializedName("Sona")
	public void setSona(Sona sona) {
		this.sona = sona;
	}

	@SerializedName("Soraka")
	public Soraka getSoraka() {
		return soraka;
	}

	@SerializedName("Soraka")
	public void setSoraka(Soraka soraka) {
		this.soraka = soraka;
	}

	@SerializedName("Swain")
	public Swain getSwain() {
		return swain;
	}

	@SerializedName("Swain")
	public void setSwain(Swain swain) {
		this.swain = swain;
	}

	@SerializedName("Sylas")
	public Sylas getSylas() {
		return sylas;
	}

	@SerializedName("Sylas")
	public void setSylas(Sylas sylas) {
		this.sylas = sylas;
	}

	@SerializedName("Syndra")
	public Syndra getSyndra() {
		return syndra;
	}

	@SerializedName("Syndra")
	public void setSyndra(Syndra syndra) {
		this.syndra = syndra;
	}

	@SerializedName("TahmKench")
	public TahmKench getTahmKench() {
		return tahmKench;
	}

	@SerializedName("TahmKench")
	public void setTahmKench(TahmKench tahmKench) {
		this.tahmKench = tahmKench;
	}

	@SerializedName("Taliyah")
	public Taliyah getTaliyah() {
		return taliyah;
	}

	@SerializedName("Taliyah")
	public void setTaliyah(Taliyah taliyah) {
		this.taliyah = taliyah;
	}

	@SerializedName("Talon")
	public Talon getTalon() {
		return talon;
	}

	@SerializedName("Talon")
	public void setTalon(Talon talon) {
		this.talon = talon;
	}

	@SerializedName("Taric")
	public Taric getTaric() {
		return taric;
	}

	@SerializedName("Taric")
	public void setTaric(Taric taric) {
		this.taric = taric;
	}

	@SerializedName("Teemo")
	public Teemo getTeemo() {
		return teemo;
	}

	@SerializedName("Teemo")
	public void setTeemo(Teemo teemo) {
		this.teemo = teemo;
	}

	@SerializedName("Thresh")
	public Thresh getThresh() {
		return thresh;
	}

	@SerializedName("Thresh")
	public void setThresh(Thresh thresh) {
		this.thresh = thresh;
	}

	@SerializedName("Tristana")
	public Tristana getTristana() {
		return tristana;
	}

	@SerializedName("Tristana")
	public void setTristana(Tristana tristana) {
		this.tristana = tristana;
	}

	@SerializedName("Trundle")
	public Trundle getTrundle() {
		return trundle;
	}

	@SerializedName("Trundle")
	public void setTrundle(Trundle trundle) {
		this.trundle = trundle;
	}

	@SerializedName("Tryndamere")
	public Tryndamere getTryndamere() {
		return tryndamere;
	}

	@SerializedName("Tryndamere")
	public void setTryndamere(Tryndamere tryndamere) {
		this.tryndamere = tryndamere;
	}

	@SerializedName("TwistedFate")
	public TwistedFate getTwistedFate() {
		return twistedFate;
	}

	@SerializedName("TwistedFate")
	public void setTwistedFate(TwistedFate twistedFate) {
		this.twistedFate = twistedFate;
	}

	@SerializedName("Twitch")
	public Twitch getTwitch() {
		return twitch;
	}

	@SerializedName("Twitch")
	public void setTwitch(Twitch twitch) {
		this.twitch = twitch;
	}

	@SerializedName("Udyr")
	public Udyr getUdyr() {
		return udyr;
	}

	@SerializedName("Udyr")
	public void setUdyr(Udyr udyr) {
		this.udyr = udyr;
	}

	@SerializedName("Urgot")
	public Urgot getUrgot() {
		return urgot;
	}

	@SerializedName("Urgot")
	public void setUrgot(Urgot urgot) {
		this.urgot = urgot;
	}

	@SerializedName("Varus")
	public Varus getVarus() {
		return varus;
	}

	@SerializedName("Varus")
	public void setVarus(Varus varus) {
		this.varus = varus;
	}

	@SerializedName("Vayne")
	public Vayne getVayne() {
		return vayne;
	}

	@SerializedName("Vayne")
	public void setVayne(Vayne vayne) {
		this.vayne = vayne;
	}

	@SerializedName("Veigar")
	public Veigar getVeigar() {
		return veigar;
	}

	@SerializedName("Veigar")
	public void setVeigar(Veigar veigar) {
		this.veigar = veigar;
	}

	@SerializedName("Velkoz")
	public Velkoz getVelkoz() {
		return velkoz;
	}

	@SerializedName("Velkoz")
	public void setVelkoz(Velkoz velkoz) {
		this.velkoz = velkoz;
	}

	@SerializedName("Vi")
	public Vi getVi() {
		return vi;
	}

	@SerializedName("Vi")
	public void setVi(Vi vi) {
		this.vi = vi;
	}

	@SerializedName("Viktor")
	public Viktor getViktor() {
		return viktor;
	}

	@SerializedName("Viktor")
	public void setViktor(Viktor viktor) {
		this.viktor = viktor;
	}

	@SerializedName("Vladimir")
	public Vladimir getVladimir() {
		return vladimir;
	}

	@SerializedName("Vladimir")
	public void setVladimir(Vladimir vladimir) {
		this.vladimir = vladimir;
	}

	@SerializedName("Volibear")
	public Volibear getVolibear() {
		return volibear;
	}

	@SerializedName("Volibear")
	public void setVolibear(Volibear volibear) {
		this.volibear = volibear;
	}

	@SerializedName("Warwick")
	public Warwick getWarwick() {
		return warwick;
	}

	@SerializedName("Warwick")
	public void setWarwick(Warwick warwick) {
		this.warwick = warwick;
	}

	@SerializedName("Xayah")
	public Xayah getXayah() {
		return xayah;
	}

	@SerializedName("Xayah")
	public void setXayah(Xayah xayah) {
		this.xayah = xayah;
	}

	@SerializedName("Xerath")
	public Xerath getXerath() {
		return xerath;
	}

	@SerializedName("Xerath")
	public void setXerath(Xerath xerath) {
		this.xerath = xerath;
	}

	@SerializedName("XinZhao")
	public XinZhao getXinZhao() {
		return xinZhao;
	}

	@SerializedName("XinZhao")
	public void setXinZhao(XinZhao xinZhao) {
		this.xinZhao = xinZhao;
	}

	@SerializedName("Yasuo")
	public Yasuo getYasuo() {
		return yasuo;
	}

	@SerializedName("Yasuo")
	public void setYasuo(Yasuo yasuo) {
		this.yasuo = yasuo;
	}

	@SerializedName("Yorick")
	public Yorick getYorick() {
		return yorick;
	}

	@SerializedName("Yorick")
	public void setYorick(Yorick yorick) {
		this.yorick = yorick;
	}

	@SerializedName("Yuumi")
	public Yuumi getYuumi() {
		return yuumi;
	}

	@SerializedName("Yuumi")
	public void setYuumi(Yuumi yuumi) {
		this.yuumi = yuumi;
	}

	@SerializedName("Zac")
	public Zac getZac() {
		return zac;
	}

	@SerializedName("Zac")
	public void setZac(Zac zac) {
		this.zac = zac;
	}

	@SerializedName("Zed")
	public Zed getZed() {
		return zed;
	}

	@SerializedName("Zed")
	public void setZed(Zed zed) {
		this.zed = zed;
	}

	@SerializedName("Ziggs")
	public Ziggs getZiggs() {
		return ziggs;
	}

	@SerializedName("Ziggs")
	public void setZiggs(Ziggs ziggs) {
		this.ziggs = ziggs;
	}

	@SerializedName("Zilean")
	public Zilean getZilean() {
		return zilean;
	}

	@SerializedName("Zilean")
	public void setZilean(Zilean zilean) {
		this.zilean = zilean;
	}

	@SerializedName("Zoe")
	public Zoe getZoe() {
		return zoe;
	}

	@SerializedName("Zoe")
	public void setZoe(Zoe zoe) {
		this.zoe = zoe;
	}

	@SerializedName("Zyra")
	public Zyra getZyra() {
		return zyra;
	}

	@SerializedName("Zyra")
	public void setZyra(Zyra zyra) {
		this.zyra = zyra;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("aatrox");
		sb.append('=');
		sb.append(((this.aatrox == null) ? "<null>" : this.aatrox));
		sb.append(',');
		sb.append("ahri");
		sb.append('=');
		sb.append(((this.ahri == null) ? "<null>" : this.ahri));
		sb.append(',');
		sb.append("akali");
		sb.append('=');
		sb.append(((this.akali == null) ? "<null>" : this.akali));
		sb.append(',');
		sb.append("alistar");
		sb.append('=');
		sb.append(((this.alistar == null) ? "<null>" : this.alistar));
		sb.append(',');
		sb.append("amumu");
		sb.append('=');
		sb.append(((this.amumu == null) ? "<null>" : this.amumu));
		sb.append(',');
		sb.append("anivia");
		sb.append('=');
		sb.append(((this.anivia == null) ? "<null>" : this.anivia));
		sb.append(',');
		sb.append("annie");
		sb.append('=');
		sb.append(((this.annie == null) ? "<null>" : this.annie));
		sb.append(',');
		sb.append("aphelios");
		sb.append('=');
		sb.append(((this.aphelios == null) ? "<null>" : this.aphelios));
		sb.append(',');
		sb.append("ashe");
		sb.append('=');
		sb.append(((this.ashe == null) ? "<null>" : this.ashe));
		sb.append(',');
		sb.append("aurelionSol");
		sb.append('=');
		sb.append(((this.aurelionSol == null) ? "<null>" : this.aurelionSol));
		sb.append(',');
		sb.append("azir");
		sb.append('=');
		sb.append(((this.azir == null) ? "<null>" : this.azir));
		sb.append(',');
		sb.append("bard");
		sb.append('=');
		sb.append(((this.bard == null) ? "<null>" : this.bard));
		sb.append(',');
		sb.append("blitzcrank");
		sb.append('=');
		sb.append(((this.blitzcrank == null) ? "<null>" : this.blitzcrank));
		sb.append(',');
		sb.append("brand");
		sb.append('=');
		sb.append(((this.brand == null) ? "<null>" : this.brand));
		sb.append(',');
		sb.append("braum");
		sb.append('=');
		sb.append(((this.braum == null) ? "<null>" : this.braum));
		sb.append(',');
		sb.append("caitlyn");
		sb.append('=');
		sb.append(((this.caitlyn == null) ? "<null>" : this.caitlyn));
		sb.append(',');
		sb.append("camille");
		sb.append('=');
		sb.append(((this.camille == null) ? "<null>" : this.camille));
		sb.append(',');
		sb.append("cassiopeia");
		sb.append('=');
		sb.append(((this.cassiopeia == null) ? "<null>" : this.cassiopeia));
		sb.append(',');
		sb.append("chogath");
		sb.append('=');
		sb.append(((this.chogath == null) ? "<null>" : this.chogath));
		sb.append(',');
		sb.append("corki");
		sb.append('=');
		sb.append(((this.corki == null) ? "<null>" : this.corki));
		sb.append(',');
		sb.append("darius");
		sb.append('=');
		sb.append(((this.darius == null) ? "<null>" : this.darius));
		sb.append(',');
		sb.append("diana");
		sb.append('=');
		sb.append(((this.diana == null) ? "<null>" : this.diana));
		sb.append(',');
		sb.append("draven");
		sb.append('=');
		sb.append(((this.draven == null) ? "<null>" : this.draven));
		sb.append(',');
		sb.append("drMundo");
		sb.append('=');
		sb.append(((this.drMundo == null) ? "<null>" : this.drMundo));
		sb.append(',');
		sb.append("ekko");
		sb.append('=');
		sb.append(((this.ekko == null) ? "<null>" : this.ekko));
		sb.append(',');
		sb.append("elise");
		sb.append('=');
		sb.append(((this.elise == null) ? "<null>" : this.elise));
		sb.append(',');
		sb.append("evelynn");
		sb.append('=');
		sb.append(((this.evelynn == null) ? "<null>" : this.evelynn));
		sb.append(',');
		sb.append("ezreal");
		sb.append('=');
		sb.append(((this.ezreal == null) ? "<null>" : this.ezreal));
		sb.append(',');
		sb.append("fiddlesticks");
		sb.append('=');
		sb.append(((this.fiddlesticks == null) ? "<null>" : this.fiddlesticks));
		sb.append(',');
		sb.append("fiora");
		sb.append('=');
		sb.append(((this.fiora == null) ? "<null>" : this.fiora));
		sb.append(',');
		sb.append("fizz");
		sb.append('=');
		sb.append(((this.fizz == null) ? "<null>" : this.fizz));
		sb.append(',');
		sb.append("galio");
		sb.append('=');
		sb.append(((this.galio == null) ? "<null>" : this.galio));
		sb.append(',');
		sb.append("gangplank");
		sb.append('=');
		sb.append(((this.gangplank == null) ? "<null>" : this.gangplank));
		sb.append(',');
		sb.append("garen");
		sb.append('=');
		sb.append(((this.garen == null) ? "<null>" : this.garen));
		sb.append(',');
		sb.append("gnar");
		sb.append('=');
		sb.append(((this.gnar == null) ? "<null>" : this.gnar));
		sb.append(',');
		sb.append("gragas");
		sb.append('=');
		sb.append(((this.gragas == null) ? "<null>" : this.gragas));
		sb.append(',');
		sb.append("graves");
		sb.append('=');
		sb.append(((this.graves == null) ? "<null>" : this.graves));
		sb.append(',');
		sb.append("hecarim");
		sb.append('=');
		sb.append(((this.hecarim == null) ? "<null>" : this.hecarim));
		sb.append(',');
		sb.append("heimerdinger");
		sb.append('=');
		sb.append(((this.heimerdinger == null) ? "<null>" : this.heimerdinger));
		sb.append(',');
		sb.append("illaoi");
		sb.append('=');
		sb.append(((this.illaoi == null) ? "<null>" : this.illaoi));
		sb.append(',');
		sb.append("irelia");
		sb.append('=');
		sb.append(((this.irelia == null) ? "<null>" : this.irelia));
		sb.append(',');
		sb.append("ivern");
		sb.append('=');
		sb.append(((this.ivern == null) ? "<null>" : this.ivern));
		sb.append(',');
		sb.append("janna");
		sb.append('=');
		sb.append(((this.janna == null) ? "<null>" : this.janna));
		sb.append(',');
		sb.append("jarvanIV");
		sb.append('=');
		sb.append(((this.jarvanIV == null) ? "<null>" : this.jarvanIV));
		sb.append(',');
		sb.append("jax");
		sb.append('=');
		sb.append(((this.jax == null) ? "<null>" : this.jax));
		sb.append(',');
		sb.append("jayce");
		sb.append('=');
		sb.append(((this.jayce == null) ? "<null>" : this.jayce));
		sb.append(',');
		sb.append("jhin");
		sb.append('=');
		sb.append(((this.jhin == null) ? "<null>" : this.jhin));
		sb.append(',');
		sb.append("jinx");
		sb.append('=');
		sb.append(((this.jinx == null) ? "<null>" : this.jinx));
		sb.append(',');
		sb.append("kaisa");
		sb.append('=');
		sb.append(((this.kaisa == null) ? "<null>" : this.kaisa));
		sb.append(',');
		sb.append("kalista");
		sb.append('=');
		sb.append(((this.kalista == null) ? "<null>" : this.kalista));
		sb.append(',');
		sb.append("karma");
		sb.append('=');
		sb.append(((this.karma == null) ? "<null>" : this.karma));
		sb.append(',');
		sb.append("karthus");
		sb.append('=');
		sb.append(((this.karthus == null) ? "<null>" : this.karthus));
		sb.append(',');
		sb.append("kassadin");
		sb.append('=');
		sb.append(((this.kassadin == null) ? "<null>" : this.kassadin));
		sb.append(',');
		sb.append("katarina");
		sb.append('=');
		sb.append(((this.katarina == null) ? "<null>" : this.katarina));
		sb.append(',');
		sb.append("kayle");
		sb.append('=');
		sb.append(((this.kayle == null) ? "<null>" : this.kayle));
		sb.append(',');
		sb.append("kayn");
		sb.append('=');
		sb.append(((this.kayn == null) ? "<null>" : this.kayn));
		sb.append(',');
		sb.append("kennen");
		sb.append('=');
		sb.append(((this.kennen == null) ? "<null>" : this.kennen));
		sb.append(',');
		sb.append("khazix");
		sb.append('=');
		sb.append(((this.khazix == null) ? "<null>" : this.khazix));
		sb.append(',');
		sb.append("kindred");
		sb.append('=');
		sb.append(((this.kindred == null) ? "<null>" : this.kindred));
		sb.append(',');
		sb.append("kled");
		sb.append('=');
		sb.append(((this.kled == null) ? "<null>" : this.kled));
		sb.append(',');
		sb.append("kogMaw");
		sb.append('=');
		sb.append(((this.kogMaw == null) ? "<null>" : this.kogMaw));
		sb.append(',');
		sb.append("leblanc");
		sb.append('=');
		sb.append(((this.leblanc == null) ? "<null>" : this.leblanc));
		sb.append(',');
		sb.append("leeSin");
		sb.append('=');
		sb.append(((this.leeSin == null) ? "<null>" : this.leeSin));
		sb.append(',');
		sb.append("leona");
		sb.append('=');
		sb.append(((this.leona == null) ? "<null>" : this.leona));
		sb.append(',');
		sb.append("lissandra");
		sb.append('=');
		sb.append(((this.lissandra == null) ? "<null>" : this.lissandra));
		sb.append(',');
		sb.append("lucian");
		sb.append('=');
		sb.append(((this.lucian == null) ? "<null>" : this.lucian));
		sb.append(',');
		sb.append("lulu");
		sb.append('=');
		sb.append(((this.lulu == null) ? "<null>" : this.lulu));
		sb.append(',');
		sb.append("lux");
		sb.append('=');
		sb.append(((this.lux == null) ? "<null>" : this.lux));
		sb.append(',');
		sb.append("malphite");
		sb.append('=');
		sb.append(((this.malphite == null) ? "<null>" : this.malphite));
		sb.append(',');
		sb.append("malzahar");
		sb.append('=');
		sb.append(((this.malzahar == null) ? "<null>" : this.malzahar));
		sb.append(',');
		sb.append("maokai");
		sb.append('=');
		sb.append(((this.maokai == null) ? "<null>" : this.maokai));
		sb.append(',');
		sb.append("masterYi");
		sb.append('=');
		sb.append(((this.masterYi == null) ? "<null>" : this.masterYi));
		sb.append(',');
		sb.append("missFortune");
		sb.append('=');
		sb.append(((this.missFortune == null) ? "<null>" : this.missFortune));
		sb.append(',');
		sb.append("wukong");
		sb.append('=');
		sb.append(((this.wukong == null) ? "<null>" : this.wukong));
		sb.append(',');
		sb.append("mordekaiser");
		sb.append('=');
		sb.append(((this.mordekaiser == null) ? "<null>" : this.mordekaiser));
		sb.append(',');
		sb.append("morgana");
		sb.append('=');
		sb.append(((this.morgana == null) ? "<null>" : this.morgana));
		sb.append(',');
		sb.append("nami");
		sb.append('=');
		sb.append(((this.nami == null) ? "<null>" : this.nami));
		sb.append(',');
		sb.append("nasus");
		sb.append('=');
		sb.append(((this.nasus == null) ? "<null>" : this.nasus));
		sb.append(',');
		sb.append("nautilus");
		sb.append('=');
		sb.append(((this.nautilus == null) ? "<null>" : this.nautilus));
		sb.append(',');
		sb.append("neeko");
		sb.append('=');
		sb.append(((this.neeko == null) ? "<null>" : this.neeko));
		sb.append(',');
		sb.append("nidalee");
		sb.append('=');
		sb.append(((this.nidalee == null) ? "<null>" : this.nidalee));
		sb.append(',');
		sb.append("nocturne");
		sb.append('=');
		sb.append(((this.nocturne == null) ? "<null>" : this.nocturne));
		sb.append(',');
		sb.append("nunu");
		sb.append('=');
		sb.append(((this.nunu == null) ? "<null>" : this.nunu));
		sb.append(',');
		sb.append("olaf");
		sb.append('=');
		sb.append(((this.olaf == null) ? "<null>" : this.olaf));
		sb.append(',');
		sb.append("orianna");
		sb.append('=');
		sb.append(((this.orianna == null) ? "<null>" : this.orianna));
		sb.append(',');
		sb.append("ornn");
		sb.append('=');
		sb.append(((this.ornn == null) ? "<null>" : this.ornn));
		sb.append(',');
		sb.append("pantheon");
		sb.append('=');
		sb.append(((this.pantheon == null) ? "<null>" : this.pantheon));
		sb.append(',');
		sb.append("poppy");
		sb.append('=');
		sb.append(((this.poppy == null) ? "<null>" : this.poppy));
		sb.append(',');
		sb.append("pyke");
		sb.append('=');
		sb.append(((this.pyke == null) ? "<null>" : this.pyke));
		sb.append(',');
		sb.append("qiyana");
		sb.append('=');
		sb.append(((this.qiyana == null) ? "<null>" : this.qiyana));
		sb.append(',');
		sb.append("quinn");
		sb.append('=');
		sb.append(((this.quinn == null) ? "<null>" : this.quinn));
		sb.append(',');
		sb.append("rakan");
		sb.append('=');
		sb.append(((this.rakan == null) ? "<null>" : this.rakan));
		sb.append(',');
		sb.append("rammus");
		sb.append('=');
		sb.append(((this.rammus == null) ? "<null>" : this.rammus));
		sb.append(',');
		sb.append("rekSai");
		sb.append('=');
		sb.append(((this.rekSai == null) ? "<null>" : this.rekSai));
		sb.append(',');
		sb.append("renekton");
		sb.append('=');
		sb.append(((this.renekton == null) ? "<null>" : this.renekton));
		sb.append(',');
		sb.append("rengar");
		sb.append('=');
		sb.append(((this.rengar == null) ? "<null>" : this.rengar));
		sb.append(',');
		sb.append("riven");
		sb.append('=');
		sb.append(((this.riven == null) ? "<null>" : this.riven));
		sb.append(',');
		sb.append("rumble");
		sb.append('=');
		sb.append(((this.rumble == null) ? "<null>" : this.rumble));
		sb.append(',');
		sb.append("ryze");
		sb.append('=');
		sb.append(((this.ryze == null) ? "<null>" : this.ryze));
		sb.append(',');
		sb.append("sejuani");
		sb.append('=');
		sb.append(((this.sejuani == null) ? "<null>" : this.sejuani));
		sb.append(',');
		sb.append("senna");
		sb.append('=');
		sb.append(((this.senna == null) ? "<null>" : this.senna));
		sb.append(',');
		sb.append("sett");
		sb.append('=');
		sb.append(((this.sett == null) ? "<null>" : this.sett));
		sb.append(',');
		sb.append("shaco");
		sb.append('=');
		sb.append(((this.shaco == null) ? "<null>" : this.shaco));
		sb.append(',');
		sb.append("shen");
		sb.append('=');
		sb.append(((this.shen == null) ? "<null>" : this.shen));
		sb.append(',');
		sb.append("shyvana");
		sb.append('=');
		sb.append(((this.shyvana == null) ? "<null>" : this.shyvana));
		sb.append(',');
		sb.append("singed");
		sb.append('=');
		sb.append(((this.singed == null) ? "<null>" : this.singed));
		sb.append(',');
		sb.append("sion");
		sb.append('=');
		sb.append(((this.sion == null) ? "<null>" : this.sion));
		sb.append(',');
		sb.append("sivir");
		sb.append('=');
		sb.append(((this.sivir == null) ? "<null>" : this.sivir));
		sb.append(',');
		sb.append("skarner");
		sb.append('=');
		sb.append(((this.skarner == null) ? "<null>" : this.skarner));
		sb.append(',');
		sb.append("sona");
		sb.append('=');
		sb.append(((this.sona == null) ? "<null>" : this.sona));
		sb.append(',');
		sb.append("soraka");
		sb.append('=');
		sb.append(((this.soraka == null) ? "<null>" : this.soraka));
		sb.append(',');
		sb.append("swain");
		sb.append('=');
		sb.append(((this.swain == null) ? "<null>" : this.swain));
		sb.append(',');
		sb.append("sylas");
		sb.append('=');
		sb.append(((this.sylas == null) ? "<null>" : this.sylas));
		sb.append(',');
		sb.append("syndra");
		sb.append('=');
		sb.append(((this.syndra == null) ? "<null>" : this.syndra));
		sb.append(',');
		sb.append("tahmKench");
		sb.append('=');
		sb.append(((this.tahmKench == null) ? "<null>" : this.tahmKench));
		sb.append(',');
		sb.append("taliyah");
		sb.append('=');
		sb.append(((this.taliyah == null) ? "<null>" : this.taliyah));
		sb.append(',');
		sb.append("talon");
		sb.append('=');
		sb.append(((this.talon == null) ? "<null>" : this.talon));
		sb.append(',');
		sb.append("taric");
		sb.append('=');
		sb.append(((this.taric == null) ? "<null>" : this.taric));
		sb.append(',');
		sb.append("teemo");
		sb.append('=');
		sb.append(((this.teemo == null) ? "<null>" : this.teemo));
		sb.append(',');
		sb.append("thresh");
		sb.append('=');
		sb.append(((this.thresh == null) ? "<null>" : this.thresh));
		sb.append(',');
		sb.append("tristana");
		sb.append('=');
		sb.append(((this.tristana == null) ? "<null>" : this.tristana));
		sb.append(',');
		sb.append("trundle");
		sb.append('=');
		sb.append(((this.trundle == null) ? "<null>" : this.trundle));
		sb.append(',');
		sb.append("tryndamere");
		sb.append('=');
		sb.append(((this.tryndamere == null) ? "<null>" : this.tryndamere));
		sb.append(',');
		sb.append("twistedFate");
		sb.append('=');
		sb.append(((this.twistedFate == null) ? "<null>" : this.twistedFate));
		sb.append(',');
		sb.append("twitch");
		sb.append('=');
		sb.append(((this.twitch == null) ? "<null>" : this.twitch));
		sb.append(',');
		sb.append("udyr");
		sb.append('=');
		sb.append(((this.udyr == null) ? "<null>" : this.udyr));
		sb.append(',');
		sb.append("urgot");
		sb.append('=');
		sb.append(((this.urgot == null) ? "<null>" : this.urgot));
		sb.append(',');
		sb.append("varus");
		sb.append('=');
		sb.append(((this.varus == null) ? "<null>" : this.varus));
		sb.append(',');
		sb.append("vayne");
		sb.append('=');
		sb.append(((this.vayne == null) ? "<null>" : this.vayne));
		sb.append(',');
		sb.append("veigar");
		sb.append('=');
		sb.append(((this.veigar == null) ? "<null>" : this.veigar));
		sb.append(',');
		sb.append("velkoz");
		sb.append('=');
		sb.append(((this.velkoz == null) ? "<null>" : this.velkoz));
		sb.append(',');
		sb.append("vi");
		sb.append('=');
		sb.append(((this.vi == null) ? "<null>" : this.vi));
		sb.append(',');
		sb.append("viktor");
		sb.append('=');
		sb.append(((this.viktor == null) ? "<null>" : this.viktor));
		sb.append(',');
		sb.append("vladimir");
		sb.append('=');
		sb.append(((this.vladimir == null) ? "<null>" : this.vladimir));
		sb.append(',');
		sb.append("volibear");
		sb.append('=');
		sb.append(((this.volibear == null) ? "<null>" : this.volibear));
		sb.append(',');
		sb.append("warwick");
		sb.append('=');
		sb.append(((this.warwick == null) ? "<null>" : this.warwick));
		sb.append(',');
		sb.append("xayah");
		sb.append('=');
		sb.append(((this.xayah == null) ? "<null>" : this.xayah));
		sb.append(',');
		sb.append("xerath");
		sb.append('=');
		sb.append(((this.xerath == null) ? "<null>" : this.xerath));
		sb.append(',');
		sb.append("xinZhao");
		sb.append('=');
		sb.append(((this.xinZhao == null) ? "<null>" : this.xinZhao));
		sb.append(',');
		sb.append("yasuo");
		sb.append('=');
		sb.append(((this.yasuo == null) ? "<null>" : this.yasuo));
		sb.append(',');
		sb.append("yorick");
		sb.append('=');
		sb.append(((this.yorick == null) ? "<null>" : this.yorick));
		sb.append(',');
		sb.append("yuumi");
		sb.append('=');
		sb.append(((this.yuumi == null) ? "<null>" : this.yuumi));
		sb.append(',');
		sb.append("zac");
		sb.append('=');
		sb.append(((this.zac == null) ? "<null>" : this.zac));
		sb.append(',');
		sb.append("zed");
		sb.append('=');
		sb.append(((this.zed == null) ? "<null>" : this.zed));
		sb.append(',');
		sb.append("ziggs");
		sb.append('=');
		sb.append(((this.ziggs == null) ? "<null>" : this.ziggs));
		sb.append(',');
		sb.append("zilean");
		sb.append('=');
		sb.append(((this.zilean == null) ? "<null>" : this.zilean));
		sb.append(',');
		sb.append("zoe");
		sb.append('=');
		sb.append(((this.zoe == null) ? "<null>" : this.zoe));
		sb.append(',');
		sb.append("zyra");
		sb.append('=');
		sb.append(((this.zyra == null) ? "<null>" : this.zyra));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = ((result * 31) + ((this.qiyana == null) ? 0 : this.qiyana.hashCode()));
		result = ((result * 31) + ((this.kogMaw == null) ? 0 : this.kogMaw.hashCode()));
		result = ((result * 31) + ((this.vladimir == null) ? 0 : this.vladimir.hashCode()));
		result = ((result * 31) + ((this.jayce == null) ? 0 : this.jayce.hashCode()));
		result = ((result * 31) + ((this.drMundo == null) ? 0 : this.drMundo.hashCode()));
		result = ((result * 31) + ((this.janna == null) ? 0 : this.janna.hashCode()));
		result = ((result * 31) + ((this.kalista == null) ? 0 : this.kalista.hashCode()));
		result = ((result * 31) + ((this.irelia == null) ? 0 : this.irelia.hashCode()));
		result = ((result * 31) + ((this.lux == null) ? 0 : this.lux.hashCode()));
		result = ((result * 31) + ((this.azir == null) ? 0 : this.azir.hashCode()));
		result = ((result * 31) + ((this.evelynn == null) ? 0 : this.evelynn.hashCode()));
		result = ((result * 31) + ((this.maokai == null) ? 0 : this.maokai.hashCode()));
		result = ((result * 31) + ((this.aatrox == null) ? 0 : this.aatrox.hashCode()));
		result = ((result * 31) + ((this.rengar == null) ? 0 : this.rengar.hashCode()));
		result = ((result * 31) + ((this.pyke == null) ? 0 : this.pyke.hashCode()));
		result = ((result * 31) + ((this.nocturne == null) ? 0 : this.nocturne.hashCode()));
		result = ((result * 31) + ((this.wukong == null) ? 0 : this.wukong.hashCode()));
		result = ((result * 31) + ((this.brand == null) ? 0 : this.brand.hashCode()));
		result = ((result * 31) + ((this.zac == null) ? 0 : this.zac.hashCode()));
		result = ((result * 31) + ((this.xayah == null) ? 0 : this.xayah.hashCode()));
		result = ((result * 31) + ((this.jax == null) ? 0 : this.jax.hashCode()));
		result = ((result * 31) + ((this.darius == null) ? 0 : this.darius.hashCode()));
		result = ((result * 31) + ((this.teemo == null) ? 0 : this.teemo.hashCode()));
		result = ((result * 31) + ((this.leeSin == null) ? 0 : this.leeSin.hashCode()));
		result = ((result * 31) + ((this.quinn == null) ? 0 : this.quinn.hashCode()));
		result = ((result * 31) + ((this.talon == null) ? 0 : this.talon.hashCode()));
		result = ((result * 31) + ((this.draven == null) ? 0 : this.draven.hashCode()));
		result = ((result * 31) + ((this.katarina == null) ? 0 : this.katarina.hashCode()));
		result = ((result * 31) + ((this.annie == null) ? 0 : this.annie.hashCode()));
		result = ((result * 31) + ((this.graves == null) ? 0 : this.graves.hashCode()));
		result = ((result * 31) + ((this.sona == null) ? 0 : this.sona.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.zilean == null) ? 0 : this.zilean.hashCode()));
		result = ((result * 31) + ((this.rakan == null) ? 0 : this.rakan.hashCode()));
		result = ((result * 31) + ((this.yorick == null) ? 0 : this.yorick.hashCode()));
		result = ((result * 31) + ((this.poppy == null) ? 0 : this.poppy.hashCode()));
		result = ((result * 31) + ((this.xinZhao == null) ? 0 : this.xinZhao.hashCode()));
		result = ((result * 31) + ((this.sejuani == null) ? 0 : this.sejuani.hashCode()));
		result = ((result * 31) + ((this.tristana == null) ? 0 : this.tristana.hashCode()));
		result = ((result * 31) + ((this.neeko == null) ? 0 : this.neeko.hashCode()));
		result = ((result * 31) + ((this.caitlyn == null) ? 0 : this.caitlyn.hashCode()));
		result = ((result * 31) + ((this.singed == null) ? 0 : this.singed.hashCode()));
		result = ((result * 31) + ((this.garen == null) ? 0 : this.garen.hashCode()));
		result = ((result * 31) + ((this.heimerdinger == null) ? 0 : this.heimerdinger.hashCode()));
		result = ((result * 31) + ((this.nidalee == null) ? 0 : this.nidalee.hashCode()));
		result = ((result * 31) + ((this.karma == null) ? 0 : this.karma.hashCode()));
		result = ((result * 31) + ((this.leblanc == null) ? 0 : this.leblanc.hashCode()));
		result = ((result * 31) + ((this.twitch == null) ? 0 : this.twitch.hashCode()));
		result = ((result * 31) + ((this.sett == null) ? 0 : this.sett.hashCode()));
		result = ((result * 31) + ((this.gnar == null) ? 0 : this.gnar.hashCode()));
		result = ((result * 31) + ((this.leona == null) ? 0 : this.leona.hashCode()));
		result = ((result * 31) + ((this.urgot == null) ? 0 : this.urgot.hashCode()));
		result = ((result * 31) + ((this.rekSai == null) ? 0 : this.rekSai.hashCode()));
		result = ((result * 31) + ((this.viktor == null) ? 0 : this.viktor.hashCode()));
		result = ((result * 31) + ((this.fizz == null) ? 0 : this.fizz.hashCode()));
		result = ((result * 31) + ((this.kaisa == null) ? 0 : this.kaisa.hashCode()));
		result = ((result * 31) + ((this.gragas == null) ? 0 : this.gragas.hashCode()));
		result = ((result * 31) + ((this.alistar == null) ? 0 : this.alistar.hashCode()));
		result = ((result * 31) + ((this.volibear == null) ? 0 : this.volibear.hashCode()));
		result = ((result * 31) + ((this.anivia == null) ? 0 : this.anivia.hashCode()));
		result = ((result * 31) + ((this.jinx == null) ? 0 : this.jinx.hashCode()));
		result = ((result * 31) + ((this.khazix == null) ? 0 : this.khazix.hashCode()));
		result = ((result * 31) + ((this.riven == null) ? 0 : this.riven.hashCode()));
		result = ((result * 31) + ((this.sion == null) ? 0 : this.sion.hashCode()));
		result = ((result * 31) + ((this.ashe == null) ? 0 : this.ashe.hashCode()));
		result = ((result * 31) + ((this.nasus == null) ? 0 : this.nasus.hashCode()));
		result = ((result * 31) + ((this.ryze == null) ? 0 : this.ryze.hashCode()));
		result = ((result * 31) + ((this.blitzcrank == null) ? 0 : this.blitzcrank.hashCode()));
		result = ((result * 31) + ((this.malphite == null) ? 0 : this.malphite.hashCode()));
		result = ((result * 31) + ((this.tahmKench == null) ? 0 : this.tahmKench.hashCode()));
		result = ((result * 31) + ((this.taliyah == null) ? 0 : this.taliyah.hashCode()));
		result = ((result * 31) + ((this.senna == null) ? 0 : this.senna.hashCode()));
		result = ((result * 31) + ((this.shen == null) ? 0 : this.shen.hashCode()));
		result = ((result * 31) + ((this.kayle == null) ? 0 : this.kayle.hashCode()));
		result = ((result * 31) + ((this.sivir == null) ? 0 : this.sivir.hashCode()));
		result = ((result * 31) + ((this.yasuo == null) ? 0 : this.yasuo.hashCode()));
		result = ((result * 31) + ((this.ezreal == null) ? 0 : this.ezreal.hashCode()));
		result = ((result * 31) + ((this.zyra == null) ? 0 : this.zyra.hashCode()));
		result = ((result * 31) + ((this.zed == null) ? 0 : this.zed.hashCode()));
		result = ((result * 31) + ((this.hecarim == null) ? 0 : this.hecarim.hashCode()));
		result = ((result * 31) + ((this.trundle == null) ? 0 : this.trundle.hashCode()));
		result = ((result * 31) + ((this.kennen == null) ? 0 : this.kennen.hashCode()));
		result = ((result * 31) + ((this.missFortune == null) ? 0 : this.missFortune.hashCode()));
		result = ((result * 31) + ((this.pantheon == null) ? 0 : this.pantheon.hashCode()));
		result = ((result * 31) + ((this.diana == null) ? 0 : this.diana.hashCode()));
		result = ((result * 31) + ((this.shaco == null) ? 0 : this.shaco.hashCode()));
		result = ((result * 31) + ((this.bard == null) ? 0 : this.bard.hashCode()));
		result = ((result * 31) + ((this.renekton == null) ? 0 : this.renekton.hashCode()));
		result = ((result * 31) + ((this.galio == null) ? 0 : this.galio.hashCode()));
		result = ((result * 31) + ((this.ekko == null) ? 0 : this.ekko.hashCode()));
		result = ((result * 31) + ((this.shyvana == null) ? 0 : this.shyvana.hashCode()));
		result = ((result * 31) + ((this.kassadin == null) ? 0 : this.kassadin.hashCode()));
		result = ((result * 31) + ((this.lissandra == null) ? 0 : this.lissandra.hashCode()));
		result = ((result * 31) + ((this.aurelionSol == null) ? 0 : this.aurelionSol.hashCode()));
		result = ((result * 31) + ((this.varus == null) ? 0 : this.varus.hashCode()));
		result = ((result * 31) + ((this.nautilus == null) ? 0 : this.nautilus.hashCode()));
		result = ((result * 31) + ((this.warwick == null) ? 0 : this.warwick.hashCode()));
		result = ((result * 31) + ((this.soraka == null) ? 0 : this.soraka.hashCode()));
		result = ((result * 31) + ((this.ahri == null) ? 0 : this.ahri.hashCode()));
		result = ((result * 31) + ((this.vi == null) ? 0 : this.vi.hashCode()));
		result = ((result * 31) + ((this.chogath == null) ? 0 : this.chogath.hashCode()));
		result = ((result * 31) + ((this.elise == null) ? 0 : this.elise.hashCode()));
		result = ((result * 31) + ((this.fiddlesticks == null) ? 0 : this.fiddlesticks.hashCode()));
		result = ((result * 31) + ((this.amumu == null) ? 0 : this.amumu.hashCode()));
		result = ((result * 31) + ((this.nami == null) ? 0 : this.nami.hashCode()));
		result = ((result * 31) + ((this.akali == null) ? 0 : this.akali.hashCode()));
		result = ((result * 31) + ((this.rumble == null) ? 0 : this.rumble.hashCode()));
		result = ((result * 31) + ((this.corki == null) ? 0 : this.corki.hashCode()));
		result = ((result * 31) + ((this.velkoz == null) ? 0 : this.velkoz.hashCode()));
		result = ((result * 31) + ((this.gangplank == null) ? 0 : this.gangplank.hashCode()));
		result = ((result * 31) + ((this.aphelios == null) ? 0 : this.aphelios.hashCode()));
		result = ((result * 31) + ((this.vayne == null) ? 0 : this.vayne.hashCode()));
		result = ((result * 31) + ((this.tryndamere == null) ? 0 : this.tryndamere.hashCode()));
		result = ((result * 31) + ((this.zoe == null) ? 0 : this.zoe.hashCode()));
		result = ((result * 31) + ((this.jhin == null) ? 0 : this.jhin.hashCode()));
		result = ((result * 31) + ((this.syndra == null) ? 0 : this.syndra.hashCode()));
		result = ((result * 31) + ((this.karthus == null) ? 0 : this.karthus.hashCode()));
		result = ((result * 31) + ((this.yuumi == null) ? 0 : this.yuumi.hashCode()));
		result = ((result * 31) + ((this.cassiopeia == null) ? 0 : this.cassiopeia.hashCode()));
		result = ((result * 31) + ((this.orianna == null) ? 0 : this.orianna.hashCode()));
		result = ((result * 31) + ((this.ornn == null) ? 0 : this.ornn.hashCode()));
		result = ((result * 31) + ((this.kayn == null) ? 0 : this.kayn.hashCode()));
		result = ((result * 31) + ((this.kindred == null) ? 0 : this.kindred.hashCode()));
		result = ((result * 31) + ((this.xerath == null) ? 0 : this.xerath.hashCode()));
		result = ((result * 31) + ((this.thresh == null) ? 0 : this.thresh.hashCode()));
		result = ((result * 31) + ((this.twistedFate == null) ? 0 : this.twistedFate.hashCode()));
		result = ((result * 31) + ((this.udyr == null) ? 0 : this.udyr.hashCode()));
		result = ((result * 31) + ((this.lulu == null) ? 0 : this.lulu.hashCode()));
		result = ((result * 31) + ((this.veigar == null) ? 0 : this.veigar.hashCode()));
		result = ((result * 31) + ((this.illaoi == null) ? 0 : this.illaoi.hashCode()));
		result = ((result * 31) + ((this.mordekaiser == null) ? 0 : this.mordekaiser.hashCode()));
		result = ((result * 31) + ((this.ivern == null) ? 0 : this.ivern.hashCode()));
		result = ((result * 31) + ((this.camille == null) ? 0 : this.camille.hashCode()));
		result = ((result * 31) + ((this.ziggs == null) ? 0 : this.ziggs.hashCode()));
		result = ((result * 31) + ((this.swain == null) ? 0 : this.swain.hashCode()));
		result = ((result * 31) + ((this.taric == null) ? 0 : this.taric.hashCode()));
		result = ((result * 31) + ((this.kled == null) ? 0 : this.kled.hashCode()));
		result = ((result * 31) + ((this.braum == null) ? 0 : this.braum.hashCode()));
		result = ((result * 31) + ((this.fiora == null) ? 0 : this.fiora.hashCode()));
		result = ((result * 31) + ((this.sylas == null) ? 0 : this.sylas.hashCode()));
		result = ((result * 31) + ((this.lucian == null) ? 0 : this.lucian.hashCode()));
		result = ((result * 31) + ((this.malzahar == null) ? 0 : this.malzahar.hashCode()));
		result = ((result * 31) + ((this.olaf == null) ? 0 : this.olaf.hashCode()));
		result = ((result * 31) + ((this.morgana == null) ? 0 : this.morgana.hashCode()));
		result = ((result * 31) + ((this.jarvanIV == null) ? 0 : this.jarvanIV.hashCode()));
		result = ((result * 31) + ((this.nunu == null) ? 0 : this.nunu.hashCode()));
		result = ((result * 31) + ((this.skarner == null) ? 0 : this.skarner.hashCode()));
		result = ((result * 31) + ((this.masterYi == null) ? 0 : this.masterYi.hashCode()));
		result = ((result * 31) + ((this.rammus == null) ? 0 : this.rammus.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Data) == false) {
			return false;
		}
		Data rhs = ((Data) other);
		return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.qiyana == rhs.qiyana)
				|| ((this.qiyana != null) && this.qiyana.equals(rhs.qiyana)))
				&& ((this.kogMaw == rhs.kogMaw) || ((this.kogMaw != null) && this.kogMaw.equals(rhs.kogMaw))))
				&& ((this.vladimir == rhs.vladimir) || ((this.vladimir != null) && this.vladimir.equals(rhs.vladimir))))
				&& ((this.jayce == rhs.jayce) || ((this.jayce != null) && this.jayce.equals(rhs.jayce))))
				&& ((this.drMundo == rhs.drMundo) || ((this.drMundo != null) && this.drMundo.equals(rhs.drMundo))))
				&& ((this.janna == rhs.janna) || ((this.janna != null) && this.janna.equals(rhs.janna))))
				&& ((this.kalista == rhs.kalista) || ((this.kalista != null) && this.kalista.equals(rhs.kalista))))
				&& ((this.irelia == rhs.irelia) || ((this.irelia != null) && this.irelia.equals(rhs.irelia))))
				&& ((this.lux == rhs.lux) || ((this.lux != null) && this.lux.equals(rhs.lux))))
				&& ((this.azir == rhs.azir) || ((this.azir != null) && this.azir.equals(rhs.azir))))
				&& ((this.evelynn == rhs.evelynn) || ((this.evelynn != null) && this.evelynn.equals(rhs.evelynn))))
				&& ((this.maokai == rhs.maokai) || ((this.maokai != null) && this.maokai.equals(rhs.maokai))))
				&& ((this.aatrox == rhs.aatrox) || ((this.aatrox != null) && this.aatrox.equals(rhs.aatrox))))
				&& ((this.rengar == rhs.rengar) || ((this.rengar != null) && this.rengar.equals(rhs.rengar))))
				&& ((this.pyke == rhs.pyke) || ((this.pyke != null) && this.pyke.equals(rhs.pyke))))
				&& ((this.nocturne == rhs.nocturne) || ((this.nocturne != null) && this.nocturne.equals(rhs.nocturne))))
				&& ((this.wukong == rhs.wukong)
						|| ((this.wukong != null) && this.wukong.equals(rhs.wukong))))
				&& ((this.brand == rhs.brand) || ((this.brand != null) && this.brand.equals(rhs.brand))))
				&& ((this.zac == rhs.zac) || ((this.zac != null) && this.zac.equals(rhs.zac))))
				&& ((this.xayah == rhs.xayah) || ((this.xayah != null) && this.xayah.equals(rhs.xayah))))
				&& ((this.jax == rhs.jax) || ((this.jax != null) && this.jax.equals(rhs.jax))))
				&& ((this.darius == rhs.darius) || ((this.darius != null) && this.darius.equals(rhs.darius))))
				&& ((this.teemo == rhs.teemo) || ((this.teemo != null) && this.teemo.equals(rhs.teemo))))
				&& ((this.leeSin == rhs.leeSin) || ((this.leeSin != null) && this.leeSin.equals(rhs.leeSin))))
				&& ((this.quinn == rhs.quinn) || ((this.quinn != null) && this.quinn.equals(rhs.quinn))))
				&& ((this.talon == rhs.talon) || ((this.talon != null) && this.talon.equals(rhs.talon))))
				&& ((this.draven == rhs.draven) || ((this.draven != null) && this.draven.equals(rhs.draven))))
				&& ((this.katarina == rhs.katarina) || ((this.katarina != null) && this.katarina.equals(rhs.katarina))))
				&& ((this.annie == rhs.annie) || ((this.annie != null) && this.annie.equals(rhs.annie))))
				&& ((this.graves == rhs.graves) || ((this.graves != null) && this.graves.equals(rhs.graves))))
				&& ((this.sona == rhs.sona) || ((this.sona != null) && this.sona.equals(rhs.sona))))
				&& ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null)
						&& this.additionalProperties.equals(rhs.additionalProperties))))
				&& ((this.zilean == rhs.zilean) || ((this.zilean != null) && this.zilean.equals(rhs.zilean))))
				&& ((this.rakan == rhs.rakan) || ((this.rakan != null) && this.rakan.equals(rhs.rakan))))
				&& ((this.yorick == rhs.yorick) || ((this.yorick != null) && this.yorick.equals(rhs.yorick))))
				&& ((this.poppy == rhs.poppy) || ((this.poppy != null) && this.poppy.equals(rhs.poppy))))
				&& ((this.xinZhao == rhs.xinZhao) || ((this.xinZhao != null) && this.xinZhao.equals(rhs.xinZhao))))
				&& ((this.sejuani == rhs.sejuani) || ((this.sejuani != null) && this.sejuani.equals(rhs.sejuani))))
				&& ((this.tristana == rhs.tristana) || ((this.tristana != null) && this.tristana.equals(rhs.tristana))))
				&& ((this.neeko == rhs.neeko) || ((this.neeko != null) && this.neeko.equals(rhs.neeko))))
				&& ((this.caitlyn == rhs.caitlyn) || ((this.caitlyn != null) && this.caitlyn.equals(rhs.caitlyn))))
				&& ((this.singed == rhs.singed) || ((this.singed != null) && this.singed.equals(rhs.singed))))
				&& ((this.garen == rhs.garen) || ((this.garen != null) && this.garen.equals(rhs.garen))))
				&& ((this.heimerdinger == rhs.heimerdinger)
						|| ((this.heimerdinger != null) && this.heimerdinger.equals(rhs.heimerdinger))))
				&& ((this.nidalee == rhs.nidalee) || ((this.nidalee != null) && this.nidalee.equals(rhs.nidalee))))
				&& ((this.karma == rhs.karma) || ((this.karma != null) && this.karma.equals(rhs.karma))))
				&& ((this.leblanc == rhs.leblanc) || ((this.leblanc != null) && this.leblanc.equals(rhs.leblanc))))
				&& ((this.twitch == rhs.twitch) || ((this.twitch != null) && this.twitch.equals(rhs.twitch))))
				&& ((this.sett == rhs.sett) || ((this.sett != null) && this.sett.equals(rhs.sett))))
				&& ((this.gnar == rhs.gnar) || ((this.gnar != null) && this.gnar.equals(rhs.gnar))))
				&& ((this.leona == rhs.leona) || ((this.leona != null) && this.leona.equals(rhs.leona))))
				&& ((this.urgot == rhs.urgot) || ((this.urgot != null) && this.urgot.equals(rhs.urgot))))
				&& ((this.rekSai == rhs.rekSai) || ((this.rekSai != null) && this.rekSai.equals(rhs.rekSai))))
				&& ((this.viktor == rhs.viktor) || ((this.viktor != null) && this.viktor.equals(rhs.viktor))))
				&& ((this.fizz == rhs.fizz) || ((this.fizz != null) && this.fizz.equals(rhs.fizz))))
				&& ((this.kaisa == rhs.kaisa) || ((this.kaisa != null) && this.kaisa.equals(rhs.kaisa))))
				&& ((this.gragas == rhs.gragas) || ((this.gragas != null) && this.gragas.equals(rhs.gragas))))
				&& ((this.alistar == rhs.alistar) || ((this.alistar != null) && this.alistar.equals(rhs.alistar))))
				&& ((this.volibear == rhs.volibear) || ((this.volibear != null) && this.volibear.equals(rhs.volibear))))
				&& ((this.anivia == rhs.anivia) || ((this.anivia != null) && this.anivia.equals(rhs.anivia))))
				&& ((this.jinx == rhs.jinx) || ((this.jinx != null) && this.jinx.equals(rhs.jinx))))
				&& ((this.khazix == rhs.khazix) || ((this.khazix != null) && this.khazix.equals(rhs.khazix))))
				&& ((this.riven == rhs.riven) || ((this.riven != null) && this.riven.equals(rhs.riven))))
				&& ((this.sion == rhs.sion) || ((this.sion != null) && this.sion.equals(rhs.sion))))
				&& ((this.ashe == rhs.ashe) || ((this.ashe != null) && this.ashe.equals(rhs.ashe))))
				&& ((this.nasus == rhs.nasus) || ((this.nasus != null) && this.nasus.equals(rhs.nasus))))
				&& ((this.ryze == rhs.ryze) || ((this.ryze != null) && this.ryze.equals(rhs.ryze))))
				&& ((this.blitzcrank == rhs.blitzcrank)
						|| ((this.blitzcrank != null) && this.blitzcrank.equals(rhs.blitzcrank))))
				&& ((this.malphite == rhs.malphite) || ((this.malphite != null) && this.malphite.equals(rhs.malphite))))
				&& ((this.tahmKench == rhs.tahmKench)
						|| ((this.tahmKench != null) && this.tahmKench.equals(rhs.tahmKench))))
				&& ((this.taliyah == rhs.taliyah) || ((this.taliyah != null) && this.taliyah.equals(rhs.taliyah))))
				&& ((this.senna == rhs.senna) || ((this.senna != null) && this.senna.equals(rhs.senna))))
				&& ((this.shen == rhs.shen) || ((this.shen != null) && this.shen.equals(rhs.shen))))
				&& ((this.kayle == rhs.kayle) || ((this.kayle != null) && this.kayle.equals(rhs.kayle))))
				&& ((this.sivir == rhs.sivir) || ((this.sivir != null) && this.sivir.equals(rhs.sivir))))
				&& ((this.yasuo == rhs.yasuo) || ((this.yasuo != null) && this.yasuo.equals(rhs.yasuo))))
				&& ((this.ezreal == rhs.ezreal) || ((this.ezreal != null) && this.ezreal.equals(rhs.ezreal))))
				&& ((this.zyra == rhs.zyra) || ((this.zyra != null) && this.zyra.equals(rhs.zyra))))
				&& ((this.zed == rhs.zed) || ((this.zed != null) && this.zed.equals(rhs.zed))))
				&& ((this.hecarim == rhs.hecarim) || ((this.hecarim != null) && this.hecarim.equals(rhs.hecarim))))
				&& ((this.trundle == rhs.trundle) || ((this.trundle != null) && this.trundle.equals(rhs.trundle))))
				&& ((this.kennen == rhs.kennen) || ((this.kennen != null) && this.kennen.equals(rhs.kennen))))
				&& ((this.missFortune == rhs.missFortune)
						|| ((this.missFortune != null) && this.missFortune.equals(rhs.missFortune))))
				&& ((this.pantheon == rhs.pantheon) || ((this.pantheon != null) && this.pantheon.equals(rhs.pantheon))))
				&& ((this.diana == rhs.diana) || ((this.diana != null) && this.diana.equals(rhs.diana))))
				&& ((this.shaco == rhs.shaco) || ((this.shaco != null) && this.shaco.equals(rhs.shaco))))
				&& ((this.bard == rhs.bard) || ((this.bard != null) && this.bard.equals(rhs.bard))))
				&& ((this.renekton == rhs.renekton) || ((this.renekton != null) && this.renekton.equals(rhs.renekton))))
				&& ((this.galio == rhs.galio) || ((this.galio != null) && this.galio.equals(rhs.galio))))
				&& ((this.ekko == rhs.ekko) || ((this.ekko != null) && this.ekko.equals(rhs.ekko))))
				&& ((this.shyvana == rhs.shyvana) || ((this.shyvana != null) && this.shyvana.equals(rhs.shyvana))))
				&& ((this.kassadin == rhs.kassadin) || ((this.kassadin != null) && this.kassadin.equals(rhs.kassadin))))
				&& ((this.lissandra == rhs.lissandra)
						|| ((this.lissandra != null) && this.lissandra.equals(rhs.lissandra))))
				&& ((this.aurelionSol == rhs.aurelionSol)
						|| ((this.aurelionSol != null) && this.aurelionSol.equals(rhs.aurelionSol))))
				&& ((this.varus == rhs.varus) || ((this.varus != null) && this.varus.equals(rhs.varus))))
				&& ((this.nautilus == rhs.nautilus) || ((this.nautilus != null) && this.nautilus.equals(rhs.nautilus))))
				&& ((this.warwick == rhs.warwick) || ((this.warwick != null) && this.warwick.equals(rhs.warwick))))
				&& ((this.soraka == rhs.soraka) || ((this.soraka != null) && this.soraka.equals(rhs.soraka))))
				&& ((this.ahri == rhs.ahri) || ((this.ahri != null) && this.ahri.equals(rhs.ahri))))
				&& ((this.vi == rhs.vi) || ((this.vi != null) && this.vi.equals(rhs.vi))))
				&& ((this.chogath == rhs.chogath) || ((this.chogath != null) && this.chogath.equals(rhs.chogath))))
				&& ((this.elise == rhs.elise) || ((this.elise != null) && this.elise.equals(rhs.elise))))
				&& ((this.fiddlesticks == rhs.fiddlesticks)
						|| ((this.fiddlesticks != null) && this.fiddlesticks.equals(rhs.fiddlesticks))))
				&& ((this.amumu == rhs.amumu) || ((this.amumu != null) && this.amumu.equals(rhs.amumu))))
				&& ((this.nami == rhs.nami) || ((this.nami != null) && this.nami.equals(rhs.nami))))
				&& ((this.akali == rhs.akali) || ((this.akali != null) && this.akali.equals(rhs.akali))))
				&& ((this.rumble == rhs.rumble) || ((this.rumble != null) && this.rumble.equals(rhs.rumble))))
				&& ((this.corki == rhs.corki) || ((this.corki != null) && this.corki.equals(rhs.corki))))
				&& ((this.velkoz == rhs.velkoz) || ((this.velkoz != null) && this.velkoz.equals(rhs.velkoz))))
				&& ((this.gangplank == rhs.gangplank)
						|| ((this.gangplank != null) && this.gangplank.equals(rhs.gangplank))))
				&& ((this.aphelios == rhs.aphelios) || ((this.aphelios != null) && this.aphelios.equals(rhs.aphelios))))
				&& ((this.vayne == rhs.vayne) || ((this.vayne != null) && this.vayne.equals(rhs.vayne))))
				&& ((this.tryndamere == rhs.tryndamere)
						|| ((this.tryndamere != null) && this.tryndamere.equals(rhs.tryndamere))))
				&& ((this.zoe == rhs.zoe) || ((this.zoe != null) && this.zoe.equals(rhs.zoe))))
				&& ((this.jhin == rhs.jhin) || ((this.jhin != null) && this.jhin.equals(rhs.jhin))))
				&& ((this.syndra == rhs.syndra) || ((this.syndra != null) && this.syndra.equals(rhs.syndra))))
				&& ((this.karthus == rhs.karthus) || ((this.karthus != null) && this.karthus.equals(rhs.karthus))))
				&& ((this.yuumi == rhs.yuumi) || ((this.yuumi != null) && this.yuumi.equals(rhs.yuumi))))
				&& ((this.cassiopeia == rhs.cassiopeia)
						|| ((this.cassiopeia != null) && this.cassiopeia.equals(rhs.cassiopeia))))
				&& ((this.orianna == rhs.orianna) || ((this.orianna != null) && this.orianna.equals(rhs.orianna))))
				&& ((this.ornn == rhs.ornn) || ((this.ornn != null) && this.ornn.equals(rhs.ornn))))
				&& ((this.kayn == rhs.kayn) || ((this.kayn != null) && this.kayn.equals(rhs.kayn))))
				&& ((this.kindred == rhs.kindred) || ((this.kindred != null) && this.kindred.equals(rhs.kindred))))
				&& ((this.xerath == rhs.xerath) || ((this.xerath != null) && this.xerath.equals(rhs.xerath))))
				&& ((this.thresh == rhs.thresh) || ((this.thresh != null) && this.thresh.equals(rhs.thresh))))
				&& ((this.twistedFate == rhs.twistedFate)
						|| ((this.twistedFate != null) && this.twistedFate.equals(rhs.twistedFate))))
				&& ((this.udyr == rhs.udyr) || ((this.udyr != null) && this.udyr.equals(rhs.udyr))))
				&& ((this.lulu == rhs.lulu) || ((this.lulu != null) && this.lulu.equals(rhs.lulu))))
				&& ((this.veigar == rhs.veigar) || ((this.veigar != null) && this.veigar.equals(rhs.veigar))))
				&& ((this.illaoi == rhs.illaoi) || ((this.illaoi != null) && this.illaoi.equals(rhs.illaoi))))
				&& ((this.mordekaiser == rhs.mordekaiser)
						|| ((this.mordekaiser != null) && this.mordekaiser.equals(rhs.mordekaiser))))
				&& ((this.ivern == rhs.ivern) || ((this.ivern != null) && this.ivern.equals(rhs.ivern))))
				&& ((this.camille == rhs.camille) || ((this.camille != null) && this.camille.equals(rhs.camille))))
				&& ((this.ziggs == rhs.ziggs) || ((this.ziggs != null) && this.ziggs.equals(rhs.ziggs))))
				&& ((this.swain == rhs.swain) || ((this.swain != null) && this.swain.equals(rhs.swain))))
				&& ((this.taric == rhs.taric) || ((this.taric != null) && this.taric.equals(rhs.taric))))
				&& ((this.kled == rhs.kled) || ((this.kled != null) && this.kled.equals(rhs.kled))))
				&& ((this.braum == rhs.braum) || ((this.braum != null) && this.braum.equals(rhs.braum))))
				&& ((this.fiora == rhs.fiora) || ((this.fiora != null) && this.fiora.equals(rhs.fiora))))
				&& ((this.sylas == rhs.sylas) || ((this.sylas != null) && this.sylas.equals(rhs.sylas))))
				&& ((this.lucian == rhs.lucian) || ((this.lucian != null) && this.lucian.equals(rhs.lucian))))
				&& ((this.malzahar == rhs.malzahar) || ((this.malzahar != null) && this.malzahar.equals(rhs.malzahar))))
				&& ((this.olaf == rhs.olaf) || ((this.olaf != null) && this.olaf.equals(rhs.olaf))))
				&& ((this.morgana == rhs.morgana) || ((this.morgana != null) && this.morgana.equals(rhs.morgana))))
				&& ((this.jarvanIV == rhs.jarvanIV) || ((this.jarvanIV != null) && this.jarvanIV.equals(rhs.jarvanIV))))
				&& ((this.nunu == rhs.nunu) || ((this.nunu != null) && this.nunu.equals(rhs.nunu))))
				&& ((this.skarner == rhs.skarner) || ((this.skarner != null) && this.skarner.equals(rhs.skarner))))
				&& ((this.masterYi == rhs.masterYi) || ((this.masterYi != null) && this.masterYi.equals(rhs.masterYi))))
				&& ((this.rammus == rhs.rammus) || ((this.rammus != null) && this.rammus.equals(rhs.rammus))));
	}
	
	
	public HashMap<String,String> mapChamps(){
		HashMap<String,String>map=new HashMap<String,String>();
		 map.put(aatrox.getKey(),aatrox.getName());

			map.put(ahri.getKey(),ahri.getName());

			map.put(akali.getKey(),akali.getName());

			map.put(alistar.getKey(),alistar.getName());

			map.put(amumu.getKey(),amumu.getName());

			map.put(anivia.getKey(),anivia.getName());

			map.put(annie.getKey(),annie.getName());

			map.put(aphelios.getKey(),aphelios.getName());

			map.put(ashe.getKey(),ashe.getName());

			map.put(aurelionSol.getKey(),aurelionSol.getName());

			map.put(azir.getKey(),azir.getName());

			map.put(bard.getKey(),bard.getName());

			map.put(blitzcrank.getKey(),blitzcrank.getName());

			map.put(brand.getKey(),brand.getName());

			map.put(braum.getKey(),braum.getName());

			map.put(caitlyn.getKey(),caitlyn.getName());

			map.put(camille.getKey(),camille.getName());

			map.put(cassiopeia.getKey(),cassiopeia.getName());

			map.put(chogath.getKey(),chogath.getName());

			map.put(corki.getKey(),corki.getName());

			map.put(darius.getKey(),darius.getName());

			map.put(diana.getKey(),diana.getName());

			map.put(draven.getKey(),draven.getName());

			map.put(drMundo.getKey(),drMundo.getName());

			map.put(ekko.getKey(),ekko.getName());

			map.put(elise.getKey(),elise.getName());

			map.put(evelynn.getKey(),evelynn.getName());

			map.put(ezreal.getKey(),ezreal.getName());

			map.put(fiddlesticks.getKey(),fiddlesticks.getName());

			map.put(fiora.getKey(),fiora.getName());

			map.put(fizz.getKey(),fizz.getName());

			map.put(galio.getKey(),galio.getName());

			map.put(gangplank.getKey(),gangplank.getName());

			map.put(garen.getKey(),garen.getName());

			map.put(gnar.getKey(),gnar.getName());

			map.put(gragas.getKey(),gragas.getName());

			map.put(graves.getKey(),graves.getName());

			map.put(hecarim.getKey(),hecarim.getName());

			map.put(heimerdinger.getKey(),heimerdinger.getName());

			map.put(illaoi.getKey(),illaoi.getName());

			map.put(irelia.getKey(),irelia.getName());

			map.put(ivern.getKey(),ivern.getName());

			map.put(janna.getKey(),janna.getName());

			map.put(jarvanIV.getKey(),jarvanIV.getName());

			map.put(jax.getKey(),jax.getName());

			map.put(jayce.getKey(),jayce.getName());

			map.put(jhin.getKey(),jhin.getName());

			map.put(jinx.getKey(),jinx.getName());

			map.put(kaisa.getKey(),kaisa.getName());

			map.put(kalista.getKey(),kalista.getName());

			map.put(karma.getKey(),karma.getName());

			map.put(karthus.getKey(),karthus.getName());

			map.put(kassadin.getKey(),kassadin.getName());

			map.put(katarina.getKey(),katarina.getName());

			map.put(kayle.getKey(),kayle.getName());

			map.put(kayn.getKey(),kayn.getName());

			map.put(kennen.getKey(),kennen.getName());

			map.put(khazix.getKey(),khazix.getName());

			map.put(kindred.getKey(),kindred.getName());

			map.put(kled.getKey(),kled.getName());

			map.put(kogMaw.getKey(),kogMaw.getName());

			map.put(leblanc.getKey(),leblanc.getName());

			map.put(leeSin.getKey(),leeSin.getName());

			map.put(leona.getKey(),leona.getName());

			map.put(lissandra.getKey(),lissandra.getName());

			map.put(lucian.getKey(),lucian.getName());

			map.put(lulu.getKey(),lulu.getName());

			map.put(lux.getKey(),lux.getName());

			map.put(malphite.getKey(),malphite.getName());

			map.put(malzahar.getKey(),malzahar.getName());

			map.put(maokai.getKey(),maokai.getName());

			map.put(masterYi.getKey(),masterYi.getName());

			map.put(missFortune.getKey(),missFortune.getName());

			map.put(mordekaiser.getKey(),mordekaiser.getName());

			map.put(morgana.getKey(),morgana.getName());

			map.put(nami.getKey(),nami.getName());

			map.put(nasus.getKey(),nasus.getName());

			map.put(nautilus.getKey(),nautilus.getName());

			map.put(neeko.getKey(),neeko.getName());

			map.put(nidalee.getKey(),nidalee.getName());

			map.put(nocturne.getKey(),nocturne.getName());

			map.put(nunu.getKey(),nunu.getName());

			map.put(olaf.getKey(),olaf.getName());

			map.put(orianna.getKey(),orianna.getName());

			map.put(ornn.getKey(),ornn.getName());

			map.put(pantheon.getKey(),pantheon.getName());

			map.put(poppy.getKey(),poppy.getName());

			map.put(pyke.getKey(),pyke.getName());

			map.put(qiyana.getKey(),qiyana.getName());

			map.put(quinn.getKey(),quinn.getName());

			map.put(rakan.getKey(),rakan.getName());

			map.put(rammus.getKey(),rammus.getName());

			map.put(rekSai.getKey(),rekSai.getName());

			map.put(renekton.getKey(),renekton.getName());

			map.put(rengar.getKey(),rengar.getName());

			map.put(riven.getKey(),riven.getName());

			map.put(rumble.getKey(),rumble.getName());

			map.put(ryze.getKey(),ryze.getName());

			map.put(sejuani.getKey(),sejuani.getName());

			map.put(senna.getKey(),senna.getName());

			map.put(sett.getKey(),sett.getName());

			map.put(shaco.getKey(),shaco.getName());

			map.put(shen.getKey(),shen.getName());

			map.put(shyvana.getKey(),shyvana.getName());

			map.put(singed.getKey(),singed.getName());

			map.put(sion.getKey(),sion.getName());

			map.put(sivir.getKey(),sivir.getName());

			map.put(skarner.getKey(),skarner.getName());

			map.put(sona.getKey(),sona.getName());

			map.put(soraka.getKey(),soraka.getName());

			map.put(swain.getKey(),swain.getName());

			map.put(sylas.getKey(),sylas.getName());

			map.put(syndra.getKey(),syndra.getName());

			map.put(tahmKench.getKey(),tahmKench.getName());

			map.put(taliyah.getKey(),taliyah.getName());

			map.put(talon.getKey(),talon.getName());

			map.put(taric.getKey(),taric.getName());

			map.put(teemo.getKey(),teemo.getName());

			map.put(thresh.getKey(),thresh.getName());

			map.put(tristana.getKey(),tristana.getName());

			map.put(trundle.getKey(),trundle.getName());

			map.put(tryndamere.getKey(),tryndamere.getName());

			map.put(twistedFate.getKey(),twistedFate.getName());

			map.put(twitch.getKey(),twitch.getName());

			map.put(udyr.getKey(),udyr.getName());

			map.put(urgot.getKey(),urgot.getName());

			map.put(varus.getKey(),varus.getName());

			map.put(vayne.getKey(),vayne.getName());

			map.put(veigar.getKey(),veigar.getName());

			map.put(velkoz.getKey(),velkoz.getName());

			map.put(vi.getKey(),vi.getName());

			map.put(viktor.getKey(),viktor.getName());

			map.put(vladimir.getKey(),vladimir.getName());

			map.put(volibear.getKey(),volibear.getName());

			map.put(warwick.getKey(),warwick.getName());

            map.put(wukong.getKey(), wukong.getName());

			map.put(xayah.getKey(),xayah.getName());

			map.put(xerath.getKey(),xerath.getName());

			map.put(xinZhao.getKey(),xinZhao.getName());

			map.put(yasuo.getKey(),yasuo.getName());

			map.put(yorick.getKey(),yorick.getName());

			map.put(yuumi.getKey(),yuumi.getName());

			map.put(zac.getKey(),zac.getName());

			map.put(zed.getKey(),zed.getName());

			map.put(ziggs.getKey(),ziggs.getName());

			map.put(zilean.getKey(),zilean.getName());

			map.put(zoe.getKey(),zoe.getName());

			map.put(zyra.getKey(),zyra.getName());
		return map;
		
	}
	
	
	/// MIO
	public Collection<String> listaCampeones() {
		List<String> lista = new ArrayList<String>();
		lista.add("Aatrox");

		lista.add("Ahri");

		lista.add("Akali");

		lista.add("Alistar");

		lista.add("Amumu");

		lista.add("Anivia");

		lista.add("Annie");

		lista.add("Aphelios");

		lista.add("Ashe");

		lista.add("AurelionSol");

		lista.add("Azir");

		lista.add("Bard");

		lista.add("Blitzcrank");

		lista.add("Brand");

		lista.add("Braum");

		lista.add("Caitlyn");

		lista.add("Camille");

		lista.add("Cassiopeia");

		lista.add("Chogath");

		lista.add("Corki");

		lista.add("Darius");

		lista.add("Diana");

		lista.add("Draven");

		lista.add("DrMundo");

		lista.add("Ekko");

		lista.add("Elise");

		lista.add("Evelynn");

		lista.add("Ezreal");

		lista.add("Fiddlesticks");

		lista.add("Fiora");

		lista.add("Fizz");

		lista.add("Galio");

		lista.add("Gangplank");

		lista.add("Garen");

		lista.add("Gnar");

		lista.add("Gragas");

		lista.add("Graves");

		lista.add("Hecarim");

		lista.add("Heimerdinger");

		lista.add("Illaoi");

		lista.add("Irelia");

		lista.add("Ivern");

		lista.add("Janna");

		lista.add("JarvanIV");

		lista.add("Jax");

		lista.add("Jayce");

		lista.add("Jhin");

		lista.add("Jinx");

		lista.add("Kaisa");

		lista.add("Kalista");

		lista.add("Karma");

		lista.add("Karthus");

		lista.add("Kassadin");

		lista.add("Katarina");

		lista.add("Kayle");

		lista.add("Kayn");

		lista.add("Kennen");

		lista.add("Khazix");

		lista.add("Kindred");

		lista.add("Kled");

		lista.add("KogMaw");

		lista.add("Leblanc");

		lista.add("LeeSin");

		lista.add("Leona");

		lista.add("Lissandra");

		lista.add("Lucian");

		lista.add("Lulu");

		lista.add("Lux");

		lista.add("Malphite");

		lista.add("Malzahar");

		lista.add("Maokai");

		lista.add("MasterYi");

		lista.add("MissFortune");

		lista.add("Mordekaiser");

		lista.add("Morgana");

		lista.add("Nami");

		lista.add("Nasus");

		lista.add("Nautilus");

		lista.add("Neeko");

		lista.add("Nidalee");

		lista.add("Nocturne");

		lista.add("Nunu");

		lista.add("Olaf");

		lista.add("Orianna");

		lista.add("Ornn");

		lista.add("Pantheon");

		lista.add("Poppy");

		lista.add("Pyke");

		lista.add("Qiyana");

		lista.add("Quinn");

		lista.add("Rakan");

		lista.add("Rammus");

		lista.add("RekSai");

		lista.add("Renekton");

		lista.add("Rengar");

		lista.add("Riven");

		lista.add("Rumble");

		lista.add("Ryze");

		lista.add("Sejuani");

		lista.add("Senna");

		lista.add("Sett");

		lista.add("Shaco");

		lista.add("Shen");

		lista.add("Shyvana");

		lista.add("Singed");

		lista.add("Sion");

		lista.add("Sivir");

		lista.add("Skarner");

		lista.add("Sona");

		lista.add("Soraka");

		lista.add("Swain");

		lista.add("Sylas");

		lista.add("Syndra");

		lista.add("TahmKench");

		lista.add("Taliyah");

		lista.add("Talon");

		lista.add("Taric");

		lista.add("Teemo");

		lista.add("Thresh");

		lista.add("Tristana");

		lista.add("Trundle");

		lista.add("Tryndamere");

		lista.add("TwistedFate");

		lista.add("Twitch");

		lista.add("Udyr");

		lista.add("Urgot");

		lista.add("Varus");

		lista.add("Vayne");

		lista.add("Veigar");

		lista.add("Velkoz");

		lista.add("Vi");

		lista.add("Viktor");

		lista.add("Vladimir");

		lista.add("Volibear");

		lista.add("Warwick");

		lista.add("Wukong");

		lista.add("Xayah");

		lista.add("Xerath");

		lista.add("XinZhao");

		lista.add("Yasuo");

		lista.add("Yorick");

		lista.add("Yuumi");

		lista.add("Zac");

		lista.add("Zed");

		lista.add("Ziggs");

		lista.add("Zilean");

		lista.add("Zoe");

		lista.add("Zyra");

		return lista;
	}
	
	public HashMap<String,Object> mapChampsObject(){
		HashMap<String,Object>map=new HashMap<String,Object>();
		 map.put(aatrox.getKey(),aatrox);

			map.put(ahri.getKey(),ahri);

			map.put(akali.getKey(),akali);

			map.put(alistar.getKey(),alistar);

			map.put(amumu.getKey(),amumu);

			map.put(anivia.getKey(),anivia);

			map.put(annie.getKey(),annie);

			map.put(aphelios.getKey(),aphelios);

			map.put(ashe.getKey(),ashe);

			map.put(aurelionSol.getKey(),aurelionSol);

			map.put(azir.getKey(),azir);

			map.put(bard.getKey(),bard);

			map.put(blitzcrank.getKey(),blitzcrank);

			map.put(brand.getKey(),brand);

			map.put(braum.getKey(),braum);

			map.put(caitlyn.getKey(),caitlyn);

			map.put(camille.getKey(),camille);

			map.put(cassiopeia.getKey(),cassiopeia);

			map.put(chogath.getKey(),chogath);

			map.put(corki.getKey(),corki);

			map.put(darius.getKey(),darius);

			map.put(diana.getKey(),diana);

			map.put(draven.getKey(),draven);

			map.put(drMundo.getKey(),drMundo);

			map.put(ekko.getKey(),ekko);

			map.put(elise.getKey(),elise);

			map.put(evelynn.getKey(),evelynn);

			map.put(ezreal.getKey(),ezreal);

			map.put(fiddlesticks.getKey(),fiddlesticks);

			map.put(fiora.getKey(),fiora);

			map.put(fizz.getKey(),fizz);

			map.put(galio.getKey(),galio);

			map.put(gangplank.getKey(),gangplank);

			map.put(garen.getKey(),garen);

			map.put(gnar.getKey(),gnar);

			map.put(gragas.getKey(),gragas);

			map.put(graves.getKey(),graves);

			map.put(hecarim.getKey(),hecarim);

			map.put(heimerdinger.getKey(),heimerdinger);

			map.put(illaoi.getKey(),illaoi);

			map.put(irelia.getKey(),irelia);

			map.put(ivern.getKey(),ivern);

			map.put(janna.getKey(),janna);

			map.put(jarvanIV.getKey(),jarvanIV);

			map.put(jax.getKey(),jax);

			map.put(jayce.getKey(),jayce);

			map.put(jhin.getKey(),jhin);

			map.put(jinx.getKey(),jinx);

			map.put(kaisa.getKey(),kaisa);

			map.put(kalista.getKey(),kalista);

			map.put(karma.getKey(),karma);

			map.put(karthus.getKey(),karthus);

			map.put(kassadin.getKey(),kassadin);

			map.put(katarina.getKey(),katarina);

			map.put(kayle.getKey(),kayle);

			map.put(kayn.getKey(),kayn);

			map.put(kennen.getKey(),kennen);

			map.put(khazix.getKey(),khazix);

			map.put(kindred.getKey(),kindred);

			map.put(kled.getKey(),kled);

			map.put(kogMaw.getKey(),kogMaw);

			map.put(leblanc.getKey(),leblanc);

			map.put(leeSin.getKey(),leeSin);

			map.put(leona.getKey(),leona);

			map.put(lissandra.getKey(),lissandra);

			map.put(lucian.getKey(),lucian);

			map.put(lulu.getKey(),lulu);

			map.put(lux.getKey(),lux);

			map.put(malphite.getKey(),malphite);

			map.put(malzahar.getKey(),malzahar);

			map.put(maokai.getKey(),maokai);

			map.put(masterYi.getKey(),masterYi);

			map.put(missFortune.getKey(),missFortune);

			map.put(mordekaiser.getKey(),mordekaiser);

			map.put(morgana.getKey(),morgana);

			map.put(nami.getKey(),nami);

			map.put(nasus.getKey(),nasus);

			map.put(nautilus.getKey(),nautilus);

			map.put(neeko.getKey(),neeko);

			map.put(nidalee.getKey(),nidalee);

			map.put(nocturne.getKey(),nocturne);

			map.put(nunu.getKey(),nunu);

			map.put(olaf.getKey(),olaf);

			map.put(orianna.getKey(),orianna);

			map.put(ornn.getKey(),ornn);

			map.put(pantheon.getKey(),pantheon);

			map.put(poppy.getKey(),poppy);

			map.put(pyke.getKey(),pyke);

			map.put(qiyana.getKey(),qiyana);

			map.put(quinn.getKey(),quinn);

			map.put(rakan.getKey(),rakan);

			map.put(rammus.getKey(),rammus);

			map.put(rekSai.getKey(),rekSai);

			map.put(renekton.getKey(),renekton);

			map.put(rengar.getKey(),rengar);

			map.put(riven.getKey(),riven);

			map.put(rumble.getKey(),rumble);

			map.put(ryze.getKey(),ryze);

			map.put(sejuani.getKey(),sejuani);

			map.put(senna.getKey(),senna);

			map.put(sett.getKey(),sett);

			map.put(shaco.getKey(),shaco);

			map.put(shen.getKey(),shen);

			map.put(shyvana.getKey(),shyvana);

			map.put(singed.getKey(),singed);

			map.put(sion.getKey(),sion);

			map.put(sivir.getKey(),sivir);

			map.put(skarner.getKey(),skarner);

			map.put(sona.getKey(),sona);

			map.put(soraka.getKey(),soraka);

			map.put(swain.getKey(),swain);

			map.put(sylas.getKey(),sylas);

			map.put(syndra.getKey(),syndra);

			map.put(tahmKench.getKey(),tahmKench);

			map.put(taliyah.getKey(),taliyah);

			map.put(talon.getKey(),talon);

			map.put(taric.getKey(),taric);

			map.put(teemo.getKey(),teemo);

			map.put(thresh.getKey(),thresh);

			map.put(tristana.getKey(),tristana);

			map.put(trundle.getKey(),trundle);

			map.put(tryndamere.getKey(),tryndamere);

			map.put(twistedFate.getKey(),twistedFate);

			map.put(twitch.getKey(),twitch);

			map.put(udyr.getKey(),udyr);

			map.put(urgot.getKey(),urgot);

			map.put(varus.getKey(),varus);

			map.put(vayne.getKey(),vayne);

			map.put(veigar.getKey(),veigar);

			map.put(velkoz.getKey(),velkoz);

			map.put(vi.getKey(),vi);

			map.put(viktor.getKey(),viktor);

			map.put(vladimir.getKey(),vladimir);

			map.put(volibear.getKey(),volibear);

			map.put(warwick.getKey(),warwick);

            map.put(wukong.getKey(), wukong);

			map.put(xayah.getKey(),xayah);

			map.put(xerath.getKey(),xerath);

			map.put(xinZhao.getKey(),xinZhao);

			map.put(yasuo.getKey(),yasuo);

			map.put(yorick.getKey(),yorick);

			map.put(yuumi.getKey(),yuumi);

			map.put(zac.getKey(),zac);

			map.put(zed.getKey(),zed);

			map.put(ziggs.getKey(),ziggs);

			map.put(zilean.getKey(),zilean);

			map.put(zoe.getKey(),zoe);

			map.put(zyra.getKey(),zyra);
		return map;
		
	}
	
	
	public HashMap<String,String> mapImageChamps(){
		HashMap<String,String>map=new HashMap<String,String>();
		map.put("0", "0.png");
		 map.put(aatrox.getKey(),aatrox.getImage().getSprite());

			map.put(ahri.getKey(),ahri.getImage().getSprite());

			map.put(akali.getKey(),akali.getImage().getSprite());

			map.put(alistar.getKey(),alistar.getImage().getSprite());

			map.put(amumu.getKey(),amumu.getImage().getSprite());

			map.put(anivia.getKey(),anivia.getImage().getSprite());

			map.put(annie.getKey(),annie.getImage().getSprite());

			map.put(aphelios.getKey(),aphelios.getImage().getSprite());

			map.put(ashe.getKey(),ashe.getImage().getSprite());

			map.put(aurelionSol.getKey(),aurelionSol.getImage().getSprite());

			map.put(azir.getKey(),azir.getImage().getSprite());

			map.put(bard.getKey(),bard.getImage().getSprite());

			map.put(blitzcrank.getKey(),blitzcrank.getImage().getSprite());

			map.put(brand.getKey(),brand.getImage().getSprite());

			map.put(braum.getKey(),braum.getImage().getSprite());

			map.put(caitlyn.getKey(),caitlyn.getImage().getSprite());

			map.put(camille.getKey(),camille.getImage().getSprite());

			map.put(cassiopeia.getKey(),cassiopeia.getImage().getSprite());

			map.put(chogath.getKey(),chogath.getImage().getSprite());

			map.put(corki.getKey(),corki.getImage().getSprite());

			map.put(darius.getKey(),darius.getImage().getSprite());

			map.put(diana.getKey(),diana.getImage().getSprite());

			map.put(draven.getKey(),draven.getImage().getSprite());

			map.put(drMundo.getKey(),drMundo.getImage().getSprite());

			map.put(ekko.getKey(),ekko.getImage().getSprite());

			map.put(elise.getKey(),elise.getImage().getSprite());

			map.put(evelynn.getKey(),evelynn.getImage().getSprite());

			map.put(ezreal.getKey(),ezreal.getImage().getSprite());

			map.put(fiddlesticks.getKey(),fiddlesticks.getImage().getSprite());

			map.put(fiora.getKey(),fiora.getImage().getSprite());

			map.put(fizz.getKey(),fizz.getImage().getSprite());

			map.put(galio.getKey(),galio.getImage().getSprite());

			map.put(gangplank.getKey(),gangplank.getImage().getSprite());

			map.put(garen.getKey(),garen.getImage().getSprite());

			map.put(gnar.getKey(),gnar.getImage().getSprite());

			map.put(gragas.getKey(),gragas.getImage().getSprite());

			map.put(graves.getKey(),graves.getImage().getSprite());

			map.put(hecarim.getKey(),hecarim.getImage().getSprite());

			map.put(heimerdinger.getKey(),heimerdinger.getImage().getSprite());

			map.put(illaoi.getKey(),illaoi.getImage().getSprite());

			map.put(irelia.getKey(),irelia.getImage().getSprite());

			map.put(ivern.getKey(),ivern.getImage().getSprite());

			map.put(janna.getKey(),janna.getImage().getSprite());

			map.put(jarvanIV.getKey(),jarvanIV.getImage().getSprite());

			map.put(jax.getKey(),jax.getImage().getSprite());

			map.put(jayce.getKey(),jayce.getImage().getSprite());

			map.put(jhin.getKey(),jhin.getImage().getSprite());

			map.put(jinx.getKey(),jinx.getImage().getSprite());

			map.put(kaisa.getKey(),kaisa.getImage().getSprite());

			map.put(kalista.getKey(),kalista.getImage().getSprite());

			map.put(karma.getKey(),karma.getImage().getSprite());

			map.put(karthus.getKey(),karthus.getImage().getSprite());

			map.put(kassadin.getKey(),kassadin.getImage().getSprite());

			map.put(katarina.getKey(),katarina.getImage().getSprite());

			map.put(kayle.getKey(),kayle.getImage().getSprite());

			map.put(kayn.getKey(),kayn.getImage().getSprite());

			map.put(kennen.getKey(),kennen.getImage().getSprite());

			map.put(khazix.getKey(),khazix.getImage().getSprite());

			map.put(kindred.getKey(),kindred.getImage().getSprite());

			map.put(kled.getKey(),kled.getImage().getSprite());

			map.put(kogMaw.getKey(),kogMaw.getImage().getSprite());

			map.put(leblanc.getKey(),leblanc.getImage().getSprite());

			map.put(leeSin.getKey(),leeSin.getImage().getSprite());

			map.put(leona.getKey(),leona.getImage().getSprite());

			map.put(lissandra.getKey(),lissandra.getImage().getSprite());

			map.put(lucian.getKey(),lucian.getImage().getSprite());

			map.put(lulu.getKey(),lulu.getImage().getSprite());

			map.put(lux.getKey(),lux.getImage().getSprite());

			map.put(malphite.getKey(),malphite.getImage().getSprite());

			map.put(malzahar.getKey(),malzahar.getImage().getSprite());

			map.put(maokai.getKey(),maokai.getImage().getSprite());

			map.put(masterYi.getKey(),masterYi.getImage().getSprite());

			map.put(missFortune.getKey(),missFortune.getImage().getSprite());

			map.put(mordekaiser.getKey(),mordekaiser.getImage().getSprite());

			map.put(morgana.getKey(),morgana.getImage().getSprite());

			map.put(nami.getKey(),nami.getImage().getSprite());

			map.put(nasus.getKey(),nasus.getImage().getSprite());

			map.put(nautilus.getKey(),nautilus.getImage().getSprite());

			map.put(neeko.getKey(),neeko.getImage().getSprite());

			map.put(nidalee.getKey(),nidalee.getImage().getSprite());

			map.put(nocturne.getKey(),nocturne.getImage().getSprite());

			map.put(nunu.getKey(),nunu.getImage().getSprite());

			map.put(olaf.getKey(),olaf.getImage().getSprite());

			map.put(orianna.getKey(),orianna.getImage().getSprite());

			map.put(ornn.getKey(),ornn.getImage().getSprite());

			map.put(pantheon.getKey(),pantheon.getImage().getSprite());

			map.put(poppy.getKey(),poppy.getImage().getSprite());

			map.put(pyke.getKey(),pyke.getImage().getSprite());

			map.put(qiyana.getKey(),qiyana.getImage().getSprite());

			map.put(quinn.getKey(),quinn.getImage().getSprite());

			map.put(rakan.getKey(),rakan.getImage().getSprite());

			map.put(rammus.getKey(),rammus.getImage().getSprite());

			map.put(rekSai.getKey(),rekSai.getImage().getSprite());

			map.put(renekton.getKey(),renekton.getImage().getSprite());

			map.put(rengar.getKey(),rengar.getImage().getSprite());

			map.put(riven.getKey(),riven.getImage().getSprite());

			map.put(rumble.getKey(),rumble.getImage().getSprite());

			map.put(ryze.getKey(),ryze.getImage().getSprite());

			map.put(sejuani.getKey(),sejuani.getImage().getSprite());

			map.put(senna.getKey(),senna.getImage().getSprite());

			map.put(sett.getKey(),sett.getImage().getSprite());

			map.put(shaco.getKey(),shaco.getImage().getSprite());

			map.put(shen.getKey(),shen.getImage().getSprite());

			map.put(shyvana.getKey(),shyvana.getImage().getSprite());

			map.put(singed.getKey(),singed.getImage().getSprite());

			map.put(sion.getKey(),sion.getImage().getSprite());

			map.put(sivir.getKey(),sivir.getImage().getSprite());

			map.put(skarner.getKey(),skarner.getImage().getSprite());

			map.put(sona.getKey(),sona.getImage().getSprite());

			map.put(soraka.getKey(),soraka.getImage().getSprite());

			map.put(swain.getKey(),swain.getImage().getSprite());

			map.put(sylas.getKey(),sylas.getImage().getSprite());

			map.put(syndra.getKey(),syndra.getImage().getSprite());

			map.put(tahmKench.getKey(),tahmKench.getImage().getSprite());

			map.put(taliyah.getKey(),taliyah.getImage().getSprite());

			map.put(talon.getKey(),talon.getImage().getSprite());

			map.put(taric.getKey(),taric.getImage().getSprite());

			map.put(teemo.getKey(),teemo.getImage().getSprite());

			map.put(thresh.getKey(),thresh.getImage().getSprite());

			map.put(tristana.getKey(),tristana.getImage().getSprite());

			map.put(trundle.getKey(),trundle.getImage().getSprite());

			map.put(tryndamere.getKey(),tryndamere.getImage().getSprite());

			map.put(twistedFate.getKey(),twistedFate.getImage().getSprite());

			map.put(twitch.getKey(),twitch.getImage().getSprite());

			map.put(udyr.getKey(),udyr.getImage().getSprite());

			map.put(urgot.getKey(),urgot.getImage().getSprite());

			map.put(varus.getKey(),varus.getImage().getSprite());

			map.put(vayne.getKey(),vayne.getImage().getSprite());

			map.put(veigar.getKey(),veigar.getImage().getSprite());

			map.put(velkoz.getKey(),velkoz.getImage().getSprite());

			map.put(vi.getKey(),vi.getImage().getSprite());

			map.put(viktor.getKey(),viktor.getImage().getSprite());

			map.put(vladimir.getKey(),vladimir.getImage().getSprite());

			map.put(volibear.getKey(),volibear.getImage().getSprite());

			map.put(warwick.getKey(),warwick.getImage().getSprite());

            map.put(wukong.getKey(), wukong.getImage().getSprite());

			map.put(xayah.getKey(),xayah.getImage().getSprite());

			map.put(xerath.getKey(),xerath.getImage().getSprite());

			map.put(xinZhao.getKey(),xinZhao.getImage().getSprite());

			map.put(yasuo.getKey(),yasuo.getImage().getSprite());

			map.put(yorick.getKey(),yorick.getImage().getSprite());

			map.put(yuumi.getKey(),yuumi.getImage().getSprite());

			map.put(zac.getKey(),zac.getImage().getSprite());

			map.put(zed.getKey(),zed.getImage().getSprite());

			map.put(ziggs.getKey(),ziggs.getImage().getSprite());

			map.put(zilean.getKey(),zilean.getImage().getSprite());

			map.put(zoe.getKey(),zoe.getImage().getSprite());

			map.put(zyra.getKey(),zyra.getImage().getSprite());
		return map;
		
	}
	
	public HashMap<String,Integer> mapImageXChamps(){
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("0", 0);
		 map.put(aatrox.getKey(),aatrox.getImage().getX());

			map.put(ahri.getKey(),ahri.getImage().getX());

			map.put(akali.getKey(),akali.getImage().getX());

			map.put(alistar.getKey(),alistar.getImage().getX());

			map.put(amumu.getKey(),amumu.getImage().getX());

			map.put(anivia.getKey(),anivia.getImage().getX());

			map.put(annie.getKey(),annie.getImage().getX());

			map.put(aphelios.getKey(),aphelios.getImage().getX());

			map.put(ashe.getKey(),ashe.getImage().getX());

			map.put(aurelionSol.getKey(),aurelionSol.getImage().getX());

			map.put(azir.getKey(),azir.getImage().getX());

			map.put(bard.getKey(),bard.getImage().getX());

			map.put(blitzcrank.getKey(),blitzcrank.getImage().getX());

			map.put(brand.getKey(),brand.getImage().getX());

			map.put(braum.getKey(),braum.getImage().getX());

			map.put(caitlyn.getKey(),caitlyn.getImage().getX());

			map.put(camille.getKey(),camille.getImage().getX());

			map.put(cassiopeia.getKey(),cassiopeia.getImage().getX());

			map.put(chogath.getKey(),chogath.getImage().getX());

			map.put(corki.getKey(),corki.getImage().getX());

			map.put(darius.getKey(),darius.getImage().getX());

			map.put(diana.getKey(),diana.getImage().getX());

			map.put(draven.getKey(),draven.getImage().getX());

			map.put(drMundo.getKey(),drMundo.getImage().getX());

			map.put(ekko.getKey(),ekko.getImage().getX());

			map.put(elise.getKey(),elise.getImage().getX());

			map.put(evelynn.getKey(),evelynn.getImage().getX());

			map.put(ezreal.getKey(),ezreal.getImage().getX());

			map.put(fiddlesticks.getKey(),fiddlesticks.getImage().getX());

			map.put(fiora.getKey(),fiora.getImage().getX());

			map.put(fizz.getKey(),fizz.getImage().getX());

			map.put(galio.getKey(),galio.getImage().getX());

			map.put(gangplank.getKey(),gangplank.getImage().getX());

			map.put(garen.getKey(),garen.getImage().getX());

			map.put(gnar.getKey(),gnar.getImage().getX());

			map.put(gragas.getKey(),gragas.getImage().getX());

			map.put(graves.getKey(),graves.getImage().getX());

			map.put(hecarim.getKey(),hecarim.getImage().getX());

			map.put(heimerdinger.getKey(),heimerdinger.getImage().getX());

			map.put(illaoi.getKey(),illaoi.getImage().getX());

			map.put(irelia.getKey(),irelia.getImage().getX());

			map.put(ivern.getKey(),ivern.getImage().getX());

			map.put(janna.getKey(),janna.getImage().getX());

			map.put(jarvanIV.getKey(),jarvanIV.getImage().getX());

			map.put(jax.getKey(),jax.getImage().getX());

			map.put(jayce.getKey(),jayce.getImage().getX());

			map.put(jhin.getKey(),jhin.getImage().getX());

			map.put(jinx.getKey(),jinx.getImage().getX());

			map.put(kaisa.getKey(),kaisa.getImage().getX());

			map.put(kalista.getKey(),kalista.getImage().getX());

			map.put(karma.getKey(),karma.getImage().getX());

			map.put(karthus.getKey(),karthus.getImage().getX());

			map.put(kassadin.getKey(),kassadin.getImage().getX());

			map.put(katarina.getKey(),katarina.getImage().getX());

			map.put(kayle.getKey(),kayle.getImage().getX());

			map.put(kayn.getKey(),kayn.getImage().getX());

			map.put(kennen.getKey(),kennen.getImage().getX());

			map.put(khazix.getKey(),khazix.getImage().getX());

			map.put(kindred.getKey(),kindred.getImage().getX());

			map.put(kled.getKey(),kled.getImage().getX());

			map.put(kogMaw.getKey(),kogMaw.getImage().getX());

			map.put(leblanc.getKey(),leblanc.getImage().getX());

			map.put(leeSin.getKey(),leeSin.getImage().getX());

			map.put(leona.getKey(),leona.getImage().getX());

			map.put(lissandra.getKey(),lissandra.getImage().getX());

			map.put(lucian.getKey(),lucian.getImage().getX());

			map.put(lulu.getKey(),lulu.getImage().getX());

			map.put(lux.getKey(),lux.getImage().getX());

			map.put(malphite.getKey(),malphite.getImage().getX());

			map.put(malzahar.getKey(),malzahar.getImage().getX());

			map.put(maokai.getKey(),maokai.getImage().getX());

			map.put(masterYi.getKey(),masterYi.getImage().getX());

			map.put(missFortune.getKey(),missFortune.getImage().getX());

			map.put(mordekaiser.getKey(),mordekaiser.getImage().getX());

			map.put(morgana.getKey(),morgana.getImage().getX());

			map.put(nami.getKey(),nami.getImage().getX());

			map.put(nasus.getKey(),nasus.getImage().getX());

			map.put(nautilus.getKey(),nautilus.getImage().getX());

			map.put(neeko.getKey(),neeko.getImage().getX());

			map.put(nidalee.getKey(),nidalee.getImage().getX());

			map.put(nocturne.getKey(),nocturne.getImage().getX());

			map.put(nunu.getKey(),nunu.getImage().getX());

			map.put(olaf.getKey(),olaf.getImage().getX());

			map.put(orianna.getKey(),orianna.getImage().getX());

			map.put(ornn.getKey(),ornn.getImage().getX());

			map.put(pantheon.getKey(),pantheon.getImage().getX());

			map.put(poppy.getKey(),poppy.getImage().getX());

			map.put(pyke.getKey(),pyke.getImage().getX());

			map.put(qiyana.getKey(),qiyana.getImage().getX());

			map.put(quinn.getKey(),quinn.getImage().getX());

			map.put(rakan.getKey(),rakan.getImage().getX());

			map.put(rammus.getKey(),rammus.getImage().getX());

			map.put(rekSai.getKey(),rekSai.getImage().getX());

			map.put(renekton.getKey(),renekton.getImage().getX());

			map.put(rengar.getKey(),rengar.getImage().getX());

			map.put(riven.getKey(),riven.getImage().getX());

			map.put(rumble.getKey(),rumble.getImage().getX());

			map.put(ryze.getKey(),ryze.getImage().getX());

			map.put(sejuani.getKey(),sejuani.getImage().getX());

			map.put(senna.getKey(),senna.getImage().getX());

			map.put(sett.getKey(),sett.getImage().getX());

			map.put(shaco.getKey(),shaco.getImage().getX());

			map.put(shen.getKey(),shen.getImage().getX());

			map.put(shyvana.getKey(),shyvana.getImage().getX());

			map.put(singed.getKey(),singed.getImage().getX());

			map.put(sion.getKey(),sion.getImage().getX());

			map.put(sivir.getKey(),sivir.getImage().getX());

			map.put(skarner.getKey(),skarner.getImage().getX());

			map.put(sona.getKey(),sona.getImage().getX());

			map.put(soraka.getKey(),soraka.getImage().getX());

			map.put(swain.getKey(),swain.getImage().getX());

			map.put(sylas.getKey(),sylas.getImage().getX());

			map.put(syndra.getKey(),syndra.getImage().getX());

			map.put(tahmKench.getKey(),tahmKench.getImage().getX());

			map.put(taliyah.getKey(),taliyah.getImage().getX());

			map.put(talon.getKey(),talon.getImage().getX());

			map.put(taric.getKey(),taric.getImage().getX());

			map.put(teemo.getKey(),teemo.getImage().getX());

			map.put(thresh.getKey(),thresh.getImage().getX());

			map.put(tristana.getKey(),tristana.getImage().getX());

			map.put(trundle.getKey(),trundle.getImage().getX());

			map.put(tryndamere.getKey(),tryndamere.getImage().getX());

			map.put(twistedFate.getKey(),twistedFate.getImage().getX());

			map.put(twitch.getKey(),twitch.getImage().getX());

			map.put(udyr.getKey(),udyr.getImage().getX());

			map.put(urgot.getKey(),urgot.getImage().getX());

			map.put(varus.getKey(),varus.getImage().getX());

			map.put(vayne.getKey(),vayne.getImage().getX());

			map.put(veigar.getKey(),veigar.getImage().getX());

			map.put(velkoz.getKey(),velkoz.getImage().getX());

			map.put(vi.getKey(),vi.getImage().getX());

			map.put(viktor.getKey(),viktor.getImage().getX());

			map.put(vladimir.getKey(),vladimir.getImage().getX());

			map.put(volibear.getKey(),volibear.getImage().getX());

			map.put(warwick.getKey(),warwick.getImage().getX());

            map.put(wukong.getKey(), wukong.getImage().getX());

			map.put(xayah.getKey(),xayah.getImage().getX());

			map.put(xerath.getKey(),xerath.getImage().getX());

			map.put(xinZhao.getKey(),xinZhao.getImage().getX());

			map.put(yasuo.getKey(),yasuo.getImage().getX());

			map.put(yorick.getKey(),yorick.getImage().getX());

			map.put(yuumi.getKey(),yuumi.getImage().getX());

			map.put(zac.getKey(),zac.getImage().getX());

			map.put(zed.getKey(),zed.getImage().getX());

			map.put(ziggs.getKey(),ziggs.getImage().getX());

			map.put(zilean.getKey(),zilean.getImage().getX());

			map.put(zoe.getKey(),zoe.getImage().getX());

			map.put(zyra.getKey(),zyra.getImage().getX());
		return map;
		
	}
	
	public HashMap<String,Integer> mapImageYChamps(){
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("0", 0);
		 map.put(aatrox.getKey(),aatrox.getImage().getY());

			map.put(ahri.getKey(),ahri.getImage().getY());

			map.put(akali.getKey(),akali.getImage().getY());

			map.put(alistar.getKey(),alistar.getImage().getY());

			map.put(amumu.getKey(),amumu.getImage().getY());

			map.put(anivia.getKey(),anivia.getImage().getY());

			map.put(annie.getKey(),annie.getImage().getY());

			map.put(aphelios.getKey(),aphelios.getImage().getY());

			map.put(ashe.getKey(),ashe.getImage().getY());

			map.put(aurelionSol.getKey(),aurelionSol.getImage().getY());

			map.put(azir.getKey(),azir.getImage().getY());

			map.put(bard.getKey(),bard.getImage().getY());

			map.put(blitzcrank.getKey(),blitzcrank.getImage().getY());

			map.put(brand.getKey(),brand.getImage().getY());

			map.put(braum.getKey(),braum.getImage().getY());

			map.put(caitlyn.getKey(),caitlyn.getImage().getY());

			map.put(camille.getKey(),camille.getImage().getY());

			map.put(cassiopeia.getKey(),cassiopeia.getImage().getY());

			map.put(chogath.getKey(),chogath.getImage().getY());

			map.put(corki.getKey(),corki.getImage().getY());

			map.put(darius.getKey(),darius.getImage().getY());

			map.put(diana.getKey(),diana.getImage().getY());

			map.put(draven.getKey(),draven.getImage().getY());

			map.put(drMundo.getKey(),drMundo.getImage().getY());

			map.put(ekko.getKey(),ekko.getImage().getY());

			map.put(elise.getKey(),elise.getImage().getY());

			map.put(evelynn.getKey(),evelynn.getImage().getY());

			map.put(ezreal.getKey(),ezreal.getImage().getY());

			map.put(fiddlesticks.getKey(),fiddlesticks.getImage().getY());

			map.put(fiora.getKey(),fiora.getImage().getY());

			map.put(fizz.getKey(),fizz.getImage().getY());

			map.put(galio.getKey(),galio.getImage().getY());

			map.put(gangplank.getKey(),gangplank.getImage().getY());

			map.put(garen.getKey(),garen.getImage().getY());

			map.put(gnar.getKey(),gnar.getImage().getY());

			map.put(gragas.getKey(),gragas.getImage().getY());

			map.put(graves.getKey(),graves.getImage().getY());

			map.put(hecarim.getKey(),hecarim.getImage().getY());

			map.put(heimerdinger.getKey(),heimerdinger.getImage().getY());

			map.put(illaoi.getKey(),illaoi.getImage().getY());

			map.put(irelia.getKey(),irelia.getImage().getY());

			map.put(ivern.getKey(),ivern.getImage().getY());

			map.put(janna.getKey(),janna.getImage().getY());

			map.put(jarvanIV.getKey(),jarvanIV.getImage().getY());

			map.put(jax.getKey(),jax.getImage().getY());

			map.put(jayce.getKey(),jayce.getImage().getY());

			map.put(jhin.getKey(),jhin.getImage().getY());

			map.put(jinx.getKey(),jinx.getImage().getY());

			map.put(kaisa.getKey(),kaisa.getImage().getY());

			map.put(kalista.getKey(),kalista.getImage().getY());

			map.put(karma.getKey(),karma.getImage().getY());

			map.put(karthus.getKey(),karthus.getImage().getY());

			map.put(kassadin.getKey(),kassadin.getImage().getY());

			map.put(katarina.getKey(),katarina.getImage().getY());

			map.put(kayle.getKey(),kayle.getImage().getY());

			map.put(kayn.getKey(),kayn.getImage().getY());

			map.put(kennen.getKey(),kennen.getImage().getY());

			map.put(khazix.getKey(),khazix.getImage().getY());

			map.put(kindred.getKey(),kindred.getImage().getY());

			map.put(kled.getKey(),kled.getImage().getY());

			map.put(kogMaw.getKey(),kogMaw.getImage().getY());

			map.put(leblanc.getKey(),leblanc.getImage().getY());

			map.put(leeSin.getKey(),leeSin.getImage().getY());

			map.put(leona.getKey(),leona.getImage().getY());

			map.put(lissandra.getKey(),lissandra.getImage().getY());

			map.put(lucian.getKey(),lucian.getImage().getY());

			map.put(lulu.getKey(),lulu.getImage().getY());

			map.put(lux.getKey(),lux.getImage().getY());

			map.put(malphite.getKey(),malphite.getImage().getY());

			map.put(malzahar.getKey(),malzahar.getImage().getY());

			map.put(maokai.getKey(),maokai.getImage().getY());

			map.put(masterYi.getKey(),masterYi.getImage().getY());

			map.put(missFortune.getKey(),missFortune.getImage().getY());

			map.put(mordekaiser.getKey(),mordekaiser.getImage().getY());

			map.put(morgana.getKey(),morgana.getImage().getY());

			map.put(nami.getKey(),nami.getImage().getY());

			map.put(nasus.getKey(),nasus.getImage().getY());

			map.put(nautilus.getKey(),nautilus.getImage().getY());

			map.put(neeko.getKey(),neeko.getImage().getY());

			map.put(nidalee.getKey(),nidalee.getImage().getY());

			map.put(nocturne.getKey(),nocturne.getImage().getY());

			map.put(nunu.getKey(),nunu.getImage().getY());

			map.put(olaf.getKey(),olaf.getImage().getY());

			map.put(orianna.getKey(),orianna.getImage().getY());

			map.put(ornn.getKey(),ornn.getImage().getY());

			map.put(pantheon.getKey(),pantheon.getImage().getY());

			map.put(poppy.getKey(),poppy.getImage().getY());

			map.put(pyke.getKey(),pyke.getImage().getY());

			map.put(qiyana.getKey(),qiyana.getImage().getY());

			map.put(quinn.getKey(),quinn.getImage().getY());

			map.put(rakan.getKey(),rakan.getImage().getY());

			map.put(rammus.getKey(),rammus.getImage().getY());

			map.put(rekSai.getKey(),rekSai.getImage().getY());

			map.put(renekton.getKey(),renekton.getImage().getY());

			map.put(rengar.getKey(),rengar.getImage().getY());

			map.put(riven.getKey(),riven.getImage().getY());

			map.put(rumble.getKey(),rumble.getImage().getY());

			map.put(ryze.getKey(),ryze.getImage().getY());

			map.put(sejuani.getKey(),sejuani.getImage().getY());

			map.put(senna.getKey(),senna.getImage().getY());

			map.put(sett.getKey(),sett.getImage().getY());

			map.put(shaco.getKey(),shaco.getImage().getY());

			map.put(shen.getKey(),shen.getImage().getY());

			map.put(shyvana.getKey(),shyvana.getImage().getY());

			map.put(singed.getKey(),singed.getImage().getY());

			map.put(sion.getKey(),sion.getImage().getY());

			map.put(sivir.getKey(),sivir.getImage().getY());

			map.put(skarner.getKey(),skarner.getImage().getY());

			map.put(sona.getKey(),sona.getImage().getY());

			map.put(soraka.getKey(),soraka.getImage().getY());

			map.put(swain.getKey(),swain.getImage().getY());

			map.put(sylas.getKey(),sylas.getImage().getY());

			map.put(syndra.getKey(),syndra.getImage().getY());

			map.put(tahmKench.getKey(),tahmKench.getImage().getY());

			map.put(taliyah.getKey(),taliyah.getImage().getY());

			map.put(talon.getKey(),talon.getImage().getY());

			map.put(taric.getKey(),taric.getImage().getY());

			map.put(teemo.getKey(),teemo.getImage().getY());

			map.put(thresh.getKey(),thresh.getImage().getY());

			map.put(tristana.getKey(),tristana.getImage().getY());

			map.put(trundle.getKey(),trundle.getImage().getY());

			map.put(tryndamere.getKey(),tryndamere.getImage().getY());

			map.put(twistedFate.getKey(),twistedFate.getImage().getY());

			map.put(twitch.getKey(),twitch.getImage().getY());

			map.put(udyr.getKey(),udyr.getImage().getY());

			map.put(urgot.getKey(),urgot.getImage().getY());

			map.put(varus.getKey(),varus.getImage().getY());

			map.put(vayne.getKey(),vayne.getImage().getY());

			map.put(veigar.getKey(),veigar.getImage().getY());

			map.put(velkoz.getKey(),velkoz.getImage().getY());

			map.put(vi.getKey(),vi.getImage().getY());

			map.put(viktor.getKey(),viktor.getImage().getY());

			map.put(vladimir.getKey(),vladimir.getImage().getY());

			map.put(volibear.getKey(),volibear.getImage().getY());

			map.put(warwick.getKey(),warwick.getImage().getY());

            map.put(wukong.getKey(), wukong.getImage().getY());

			map.put(xayah.getKey(),xayah.getImage().getY());

			map.put(xerath.getKey(),xerath.getImage().getY());

			map.put(xinZhao.getKey(),xinZhao.getImage().getY());

			map.put(yasuo.getKey(),yasuo.getImage().getY());

			map.put(yorick.getKey(),yorick.getImage().getY());

			map.put(yuumi.getKey(),yuumi.getImage().getY());

			map.put(zac.getKey(),zac.getImage().getY());

			map.put(zed.getKey(),zed.getImage().getY());

			map.put(ziggs.getKey(),ziggs.getImage().getY());

			map.put(zilean.getKey(),zilean.getImage().getY());

			map.put(zoe.getKey(),zoe.getImage().getY());

			map.put(zyra.getKey(),zyra.getImage().getY());
		return map;
		
	}
	
	public HashMap<String,Integer> mapImageWChamps(){
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("0", 48);
		 map.put(aatrox.getKey(),aatrox.getImage().getW());

			map.put(ahri.getKey(),ahri.getImage().getW());

			map.put(akali.getKey(),akali.getImage().getW());

			map.put(alistar.getKey(),alistar.getImage().getW());

			map.put(amumu.getKey(),amumu.getImage().getW());

			map.put(anivia.getKey(),anivia.getImage().getW());

			map.put(annie.getKey(),annie.getImage().getW());

			map.put(aphelios.getKey(),aphelios.getImage().getW());

			map.put(ashe.getKey(),ashe.getImage().getW());

			map.put(aurelionSol.getKey(),aurelionSol.getImage().getW());

			map.put(azir.getKey(),azir.getImage().getW());

			map.put(bard.getKey(),bard.getImage().getW());

			map.put(blitzcrank.getKey(),blitzcrank.getImage().getW());

			map.put(brand.getKey(),brand.getImage().getW());

			map.put(braum.getKey(),braum.getImage().getW());

			map.put(caitlyn.getKey(),caitlyn.getImage().getW());

			map.put(camille.getKey(),camille.getImage().getW());

			map.put(cassiopeia.getKey(),cassiopeia.getImage().getW());

			map.put(chogath.getKey(),chogath.getImage().getW());

			map.put(corki.getKey(),corki.getImage().getW());

			map.put(darius.getKey(),darius.getImage().getW());

			map.put(diana.getKey(),diana.getImage().getW());

			map.put(draven.getKey(),draven.getImage().getW());

			map.put(drMundo.getKey(),drMundo.getImage().getW());

			map.put(ekko.getKey(),ekko.getImage().getW());

			map.put(elise.getKey(),elise.getImage().getW());

			map.put(evelynn.getKey(),evelynn.getImage().getW());

			map.put(ezreal.getKey(),ezreal.getImage().getW());

			map.put(fiddlesticks.getKey(),fiddlesticks.getImage().getW());

			map.put(fiora.getKey(),fiora.getImage().getW());

			map.put(fizz.getKey(),fizz.getImage().getW());

			map.put(galio.getKey(),galio.getImage().getW());

			map.put(gangplank.getKey(),gangplank.getImage().getW());

			map.put(garen.getKey(),garen.getImage().getW());

			map.put(gnar.getKey(),gnar.getImage().getW());

			map.put(gragas.getKey(),gragas.getImage().getW());

			map.put(graves.getKey(),graves.getImage().getW());

			map.put(hecarim.getKey(),hecarim.getImage().getW());

			map.put(heimerdinger.getKey(),heimerdinger.getImage().getW());

			map.put(illaoi.getKey(),illaoi.getImage().getW());

			map.put(irelia.getKey(),irelia.getImage().getW());

			map.put(ivern.getKey(),ivern.getImage().getW());

			map.put(janna.getKey(),janna.getImage().getW());

			map.put(jarvanIV.getKey(),jarvanIV.getImage().getW());

			map.put(jax.getKey(),jax.getImage().getW());

			map.put(jayce.getKey(),jayce.getImage().getW());

			map.put(jhin.getKey(),jhin.getImage().getW());

			map.put(jinx.getKey(),jinx.getImage().getW());

			map.put(kaisa.getKey(),kaisa.getImage().getW());

			map.put(kalista.getKey(),kalista.getImage().getW());

			map.put(karma.getKey(),karma.getImage().getW());

			map.put(karthus.getKey(),karthus.getImage().getW());

			map.put(kassadin.getKey(),kassadin.getImage().getW());

			map.put(katarina.getKey(),katarina.getImage().getW());

			map.put(kayle.getKey(),kayle.getImage().getW());

			map.put(kayn.getKey(),kayn.getImage().getW());

			map.put(kennen.getKey(),kennen.getImage().getW());

			map.put(khazix.getKey(),khazix.getImage().getW());

			map.put(kindred.getKey(),kindred.getImage().getW());

			map.put(kled.getKey(),kled.getImage().getW());

			map.put(kogMaw.getKey(),kogMaw.getImage().getW());

			map.put(leblanc.getKey(),leblanc.getImage().getW());

			map.put(leeSin.getKey(),leeSin.getImage().getW());

			map.put(leona.getKey(),leona.getImage().getW());

			map.put(lissandra.getKey(),lissandra.getImage().getW());

			map.put(lucian.getKey(),lucian.getImage().getW());

			map.put(lulu.getKey(),lulu.getImage().getW());

			map.put(lux.getKey(),lux.getImage().getW());

			map.put(malphite.getKey(),malphite.getImage().getW());

			map.put(malzahar.getKey(),malzahar.getImage().getW());

			map.put(maokai.getKey(),maokai.getImage().getW());

			map.put(masterYi.getKey(),masterYi.getImage().getW());

			map.put(missFortune.getKey(),missFortune.getImage().getW());

			map.put(mordekaiser.getKey(),mordekaiser.getImage().getW());

			map.put(morgana.getKey(),morgana.getImage().getW());

			map.put(nami.getKey(),nami.getImage().getW());

			map.put(nasus.getKey(),nasus.getImage().getW());

			map.put(nautilus.getKey(),nautilus.getImage().getW());

			map.put(neeko.getKey(),neeko.getImage().getW());

			map.put(nidalee.getKey(),nidalee.getImage().getW());

			map.put(nocturne.getKey(),nocturne.getImage().getW());

			map.put(nunu.getKey(),nunu.getImage().getW());

			map.put(olaf.getKey(),olaf.getImage().getW());

			map.put(orianna.getKey(),orianna.getImage().getW());

			map.put(ornn.getKey(),ornn.getImage().getW());

			map.put(pantheon.getKey(),pantheon.getImage().getW());

			map.put(poppy.getKey(),poppy.getImage().getW());

			map.put(pyke.getKey(),pyke.getImage().getW());

			map.put(qiyana.getKey(),qiyana.getImage().getW());

			map.put(quinn.getKey(),quinn.getImage().getW());

			map.put(rakan.getKey(),rakan.getImage().getW());

			map.put(rammus.getKey(),rammus.getImage().getW());

			map.put(rekSai.getKey(),rekSai.getImage().getW());

			map.put(renekton.getKey(),renekton.getImage().getW());

			map.put(rengar.getKey(),rengar.getImage().getW());

			map.put(riven.getKey(),riven.getImage().getW());

			map.put(rumble.getKey(),rumble.getImage().getW());

			map.put(ryze.getKey(),ryze.getImage().getW());

			map.put(sejuani.getKey(),sejuani.getImage().getW());

			map.put(senna.getKey(),senna.getImage().getW());

			map.put(sett.getKey(),sett.getImage().getW());

			map.put(shaco.getKey(),shaco.getImage().getW());

			map.put(shen.getKey(),shen.getImage().getW());

			map.put(shyvana.getKey(),shyvana.getImage().getW());

			map.put(singed.getKey(),singed.getImage().getW());

			map.put(sion.getKey(),sion.getImage().getW());

			map.put(sivir.getKey(),sivir.getImage().getW());

			map.put(skarner.getKey(),skarner.getImage().getW());

			map.put(sona.getKey(),sona.getImage().getW());

			map.put(soraka.getKey(),soraka.getImage().getW());

			map.put(swain.getKey(),swain.getImage().getW());

			map.put(sylas.getKey(),sylas.getImage().getW());

			map.put(syndra.getKey(),syndra.getImage().getW());

			map.put(tahmKench.getKey(),tahmKench.getImage().getW());

			map.put(taliyah.getKey(),taliyah.getImage().getW());

			map.put(talon.getKey(),talon.getImage().getW());

			map.put(taric.getKey(),taric.getImage().getW());

			map.put(teemo.getKey(),teemo.getImage().getW());

			map.put(thresh.getKey(),thresh.getImage().getW());

			map.put(tristana.getKey(),tristana.getImage().getW());

			map.put(trundle.getKey(),trundle.getImage().getW());

			map.put(tryndamere.getKey(),tryndamere.getImage().getW());

			map.put(twistedFate.getKey(),twistedFate.getImage().getW());

			map.put(twitch.getKey(),twitch.getImage().getW());

			map.put(udyr.getKey(),udyr.getImage().getW());

			map.put(urgot.getKey(),urgot.getImage().getW());

			map.put(varus.getKey(),varus.getImage().getW());

			map.put(vayne.getKey(),vayne.getImage().getW());

			map.put(veigar.getKey(),veigar.getImage().getW());

			map.put(velkoz.getKey(),velkoz.getImage().getW());

			map.put(vi.getKey(),vi.getImage().getW());

			map.put(viktor.getKey(),viktor.getImage().getW());

			map.put(vladimir.getKey(),vladimir.getImage().getW());

			map.put(volibear.getKey(),volibear.getImage().getW());

			map.put(warwick.getKey(),warwick.getImage().getW());

            map.put(wukong.getKey(), wukong.getImage().getW());

			map.put(xayah.getKey(),xayah.getImage().getW());

			map.put(xerath.getKey(),xerath.getImage().getW());

			map.put(xinZhao.getKey(),xinZhao.getImage().getW());

			map.put(yasuo.getKey(),yasuo.getImage().getW());

			map.put(yorick.getKey(),yorick.getImage().getW());

			map.put(yuumi.getKey(),yuumi.getImage().getW());

			map.put(zac.getKey(),zac.getImage().getW());

			map.put(zed.getKey(),zed.getImage().getW());

			map.put(ziggs.getKey(),ziggs.getImage().getW());

			map.put(zilean.getKey(),zilean.getImage().getW());

			map.put(zoe.getKey(),zoe.getImage().getW());

			map.put(zyra.getKey(),zyra.getImage().getW());
		return map;
		
	}
	
	public HashMap<String,Integer> mapImageHChamps(){
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		map.put("0", 48);
		 map.put(aatrox.getKey(),aatrox.getImage().getH());

			map.put(ahri.getKey(),ahri.getImage().getH());

			map.put(akali.getKey(),akali.getImage().getH());

			map.put(alistar.getKey(),alistar.getImage().getH());

			map.put(amumu.getKey(),amumu.getImage().getH());

			map.put(anivia.getKey(),anivia.getImage().getH());

			map.put(annie.getKey(),annie.getImage().getH());

			map.put(aphelios.getKey(),aphelios.getImage().getH());

			map.put(ashe.getKey(),ashe.getImage().getH());

			map.put(aurelionSol.getKey(),aurelionSol.getImage().getH());

			map.put(azir.getKey(),azir.getImage().getH());

			map.put(bard.getKey(),bard.getImage().getH());

			map.put(blitzcrank.getKey(),blitzcrank.getImage().getH());

			map.put(brand.getKey(),brand.getImage().getH());

			map.put(braum.getKey(),braum.getImage().getH());

			map.put(caitlyn.getKey(),caitlyn.getImage().getH());

			map.put(camille.getKey(),camille.getImage().getH());

			map.put(cassiopeia.getKey(),cassiopeia.getImage().getH());

			map.put(chogath.getKey(),chogath.getImage().getH());

			map.put(corki.getKey(),corki.getImage().getH());

			map.put(darius.getKey(),darius.getImage().getH());

			map.put(diana.getKey(),diana.getImage().getH());

			map.put(draven.getKey(),draven.getImage().getH());

			map.put(drMundo.getKey(),drMundo.getImage().getH());

			map.put(ekko.getKey(),ekko.getImage().getH());

			map.put(elise.getKey(),elise.getImage().getH());

			map.put(evelynn.getKey(),evelynn.getImage().getH());

			map.put(ezreal.getKey(),ezreal.getImage().getH());

			map.put(fiddlesticks.getKey(),fiddlesticks.getImage().getH());

			map.put(fiora.getKey(),fiora.getImage().getH());

			map.put(fizz.getKey(),fizz.getImage().getH());

			map.put(galio.getKey(),galio.getImage().getH());

			map.put(gangplank.getKey(),gangplank.getImage().getH());

			map.put(garen.getKey(),garen.getImage().getH());

			map.put(gnar.getKey(),gnar.getImage().getH());

			map.put(gragas.getKey(),gragas.getImage().getH());

			map.put(graves.getKey(),graves.getImage().getH());

			map.put(hecarim.getKey(),hecarim.getImage().getH());

			map.put(heimerdinger.getKey(),heimerdinger.getImage().getH());

			map.put(illaoi.getKey(),illaoi.getImage().getH());

			map.put(irelia.getKey(),irelia.getImage().getH());

			map.put(ivern.getKey(),ivern.getImage().getH());

			map.put(janna.getKey(),janna.getImage().getH());

			map.put(jarvanIV.getKey(),jarvanIV.getImage().getH());

			map.put(jax.getKey(),jax.getImage().getH());

			map.put(jayce.getKey(),jayce.getImage().getH());

			map.put(jhin.getKey(),jhin.getImage().getH());

			map.put(jinx.getKey(),jinx.getImage().getH());

			map.put(kaisa.getKey(),kaisa.getImage().getH());

			map.put(kalista.getKey(),kalista.getImage().getH());

			map.put(karma.getKey(),karma.getImage().getH());

			map.put(karthus.getKey(),karthus.getImage().getH());

			map.put(kassadin.getKey(),kassadin.getImage().getH());

			map.put(katarina.getKey(),katarina.getImage().getH());

			map.put(kayle.getKey(),kayle.getImage().getH());

			map.put(kayn.getKey(),kayn.getImage().getH());

			map.put(kennen.getKey(),kennen.getImage().getH());

			map.put(khazix.getKey(),khazix.getImage().getH());

			map.put(kindred.getKey(),kindred.getImage().getH());

			map.put(kled.getKey(),kled.getImage().getH());

			map.put(kogMaw.getKey(),kogMaw.getImage().getH());

			map.put(leblanc.getKey(),leblanc.getImage().getH());

			map.put(leeSin.getKey(),leeSin.getImage().getH());

			map.put(leona.getKey(),leona.getImage().getH());

			map.put(lissandra.getKey(),lissandra.getImage().getH());

			map.put(lucian.getKey(),lucian.getImage().getH());

			map.put(lulu.getKey(),lulu.getImage().getH());

			map.put(lux.getKey(),lux.getImage().getH());

			map.put(malphite.getKey(),malphite.getImage().getH());

			map.put(malzahar.getKey(),malzahar.getImage().getH());

			map.put(maokai.getKey(),maokai.getImage().getH());

			map.put(masterYi.getKey(),masterYi.getImage().getH());

			map.put(missFortune.getKey(),missFortune.getImage().getH());

			map.put(mordekaiser.getKey(),mordekaiser.getImage().getH());

			map.put(morgana.getKey(),morgana.getImage().getH());

			map.put(nami.getKey(),nami.getImage().getH());

			map.put(nasus.getKey(),nasus.getImage().getH());

			map.put(nautilus.getKey(),nautilus.getImage().getH());

			map.put(neeko.getKey(),neeko.getImage().getH());

			map.put(nidalee.getKey(),nidalee.getImage().getH());

			map.put(nocturne.getKey(),nocturne.getImage().getH());

			map.put(nunu.getKey(),nunu.getImage().getH());

			map.put(olaf.getKey(),olaf.getImage().getH());

			map.put(orianna.getKey(),orianna.getImage().getH());

			map.put(ornn.getKey(),ornn.getImage().getH());

			map.put(pantheon.getKey(),pantheon.getImage().getH());

			map.put(poppy.getKey(),poppy.getImage().getH());

			map.put(pyke.getKey(),pyke.getImage().getH());

			map.put(qiyana.getKey(),qiyana.getImage().getH());

			map.put(quinn.getKey(),quinn.getImage().getH());

			map.put(rakan.getKey(),rakan.getImage().getH());

			map.put(rammus.getKey(),rammus.getImage().getH());

			map.put(rekSai.getKey(),rekSai.getImage().getH());

			map.put(renekton.getKey(),renekton.getImage().getH());

			map.put(rengar.getKey(),rengar.getImage().getH());

			map.put(riven.getKey(),riven.getImage().getH());

			map.put(rumble.getKey(),rumble.getImage().getH());

			map.put(ryze.getKey(),ryze.getImage().getH());

			map.put(sejuani.getKey(),sejuani.getImage().getH());

			map.put(senna.getKey(),senna.getImage().getH());

			map.put(sett.getKey(),sett.getImage().getH());

			map.put(shaco.getKey(),shaco.getImage().getH());

			map.put(shen.getKey(),shen.getImage().getH());

			map.put(shyvana.getKey(),shyvana.getImage().getH());

			map.put(singed.getKey(),singed.getImage().getH());

			map.put(sion.getKey(),sion.getImage().getH());

			map.put(sivir.getKey(),sivir.getImage().getH());

			map.put(skarner.getKey(),skarner.getImage().getH());

			map.put(sona.getKey(),sona.getImage().getH());

			map.put(soraka.getKey(),soraka.getImage().getH());

			map.put(swain.getKey(),swain.getImage().getH());

			map.put(sylas.getKey(),sylas.getImage().getH());

			map.put(syndra.getKey(),syndra.getImage().getH());

			map.put(tahmKench.getKey(),tahmKench.getImage().getH());

			map.put(taliyah.getKey(),taliyah.getImage().getH());

			map.put(talon.getKey(),talon.getImage().getH());

			map.put(taric.getKey(),taric.getImage().getH());

			map.put(teemo.getKey(),teemo.getImage().getH());

			map.put(thresh.getKey(),thresh.getImage().getH());

			map.put(tristana.getKey(),tristana.getImage().getH());

			map.put(trundle.getKey(),trundle.getImage().getH());

			map.put(tryndamere.getKey(),tryndamere.getImage().getH());

			map.put(twistedFate.getKey(),twistedFate.getImage().getH());

			map.put(twitch.getKey(),twitch.getImage().getH());

			map.put(udyr.getKey(),udyr.getImage().getH());

			map.put(urgot.getKey(),urgot.getImage().getH());

			map.put(varus.getKey(),varus.getImage().getH());

			map.put(vayne.getKey(),vayne.getImage().getH());

			map.put(veigar.getKey(),veigar.getImage().getH());

			map.put(velkoz.getKey(),velkoz.getImage().getH());

			map.put(vi.getKey(),vi.getImage().getH());

			map.put(viktor.getKey(),viktor.getImage().getH());

			map.put(vladimir.getKey(),vladimir.getImage().getH());

			map.put(volibear.getKey(),volibear.getImage().getH());

			map.put(warwick.getKey(),warwick.getImage().getH());

            map.put(wukong.getKey(), wukong.getImage().getH());

			map.put(xayah.getKey(),xayah.getImage().getH());

			map.put(xerath.getKey(),xerath.getImage().getH());

			map.put(xinZhao.getKey(),xinZhao.getImage().getH());

			map.put(yasuo.getKey(),yasuo.getImage().getH());

			map.put(yorick.getKey(),yorick.getImage().getH());

			map.put(yuumi.getKey(),yuumi.getImage().getH());

			map.put(zac.getKey(),zac.getImage().getH());

			map.put(zed.getKey(),zed.getImage().getH());

			map.put(ziggs.getKey(),ziggs.getImage().getH());

			map.put(zilean.getKey(),zilean.getImage().getH());

			map.put(zoe.getKey(),zoe.getImage().getH());

			map.put(zyra.getKey(),zyra.getImage().getH());
		return map;
		
	}
	
}
