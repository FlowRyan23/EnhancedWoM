package data;

public class Data {

	private static final int[] stanceCDU = {1, -1, 0, -1, 1, -1, 1, -1, -1, 1, 1, 0, -1, 1, 1, -1, 1, 0, 0, 0, 1, 0, -1, -1, -1, 0, -1, -1, 1, 1, -1, -1, 0, 1, 1, 1, -1, 1};
	private static final int[] stanceSPD = {-1, -1, -1, 1, 1, 0, 1, 0, -1, 0, 1, -1, -1, -1, -1, -1, 1, -1, 1, 1, 1, 1, -1, -1, -1, 0, -1, 1, 1, -1, 0, -1, -1, 1, 1, 1, -1, 1};
	private static final int[] stanceLinke = {-1, 1, -1, 1, 1, 1, -1, 1, 1, -1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, -1, 1, 1, -1, -1, 1, -1, 1, 1, -1, 1, 1, -1, -1, 1, -1, 0, 0};
	private static final int[] stanceGruene = {-1, 1, -1, 1, 1, 1, -1, 1, 1, -1, 1, 1, -1, -1, -1, -1, 1, -1, 1, -1, 1, 1, -1, -1, -1, 1, -1, 1, 1, -1, -1, 1, 0, 0, 1, 1, 0, 1};
	private static final int[] stanceFDP = {-1, -1, -1, -1, -1, 1, 0, -1, -1, 1, -1, -1, -1, 1, 1, -1, 1, 1, -1, 1, 1, 1, 0, -1, 1, -1, -1, -1, 1, 1, -1, 1, 1, 1, 0, 0, -1, 1};
	private static final int[] stanceAfD = {-1, -1, 1, -1, -1, 1, 1, -1, -1, 1, -1, 1, -1, 0, -1, -1, 1, 1, 1, -1, 0, -1, 0, 1, 1, -1, 1, -1, -1, 1, -1, -1, 1, 1, -1, 1, -1, -1};
	private static final int[] stancePiraten = {-1, 1, -1, -1, 1, 1, -1, 1, -1, -1, -1, 1, -1, -1, -1, -1, 1, -1, 1, -1, 1, 1, 1, -1, 1, 1, -1, 1, 1, 0, 1, 1, 1, -1, 1, -1, 1, 1};
	private static final int[] stanceNPD = {1, -1, 1, 1, 1, 1, 1, -1, -1, 0, -1, 1, 1, -1, 0, -1, -1, 1, 0, -1, -1, -1, 1, 1, 1, 1, 1, 1, -1, 1, 0, -1, -1, 0, 1, 1, -1, -1};
	private static final int[] stanceFreie_Waehler = {1, -1, -1, 1, 1, 1, 1, 1, -1, 1, 1, -1, -1, -1, -1, -1, 1, 1, -1, -1, 1, -1, 1, -1, 0, -1, -1, -1, 1, 1, -1, -1, 1, 1, 1, 1, -1, 1};
	private static final int[] stanceTierschutz_Partei = {-1, 1, -1, 1, 1, 0, -1, 1, 1, -1, 1, 1, -1, -1, -1, 0, 1, 0, 1, -1, 0, 1, 1, -1, -1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, -1, 1, 1};
	private static final int[] stance�DP = {-1, 1, -1, 1, 1, 1, 0, 1, 1, -1, -1, 1, -1, -1, 1, -1, 1, 1, 1, -1, 1, 1, 1, -1, 1, 1, -1, 1, 1, 1, 0, -1, -1, 1, -1, 1, -1, 1};
	private static final int[] stancePartei = {-1, 1, 1, 1, 1, 1, -1, 1, 1, -1, -1, 1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, 1, -1, -1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, -1, 1, 1};
	private static final int[] stanceBP = {-1, -1, 1, 1, 1, 1, -1, -1, -1, 0, -1, 0, 0, 1, -1, -1, 1, 1, 1, -1, 1, -1, 1, 1, 1, -1, 0, 1, 1, 1, -1, -1, 1, 1, 0, 1, -1, 0};
	private static final int[] stanceVolksabstimmung = {1, -1, 1, 1, 1, -1, 1, 1, 1, -1, -1, 1, 1, 1, 1, -1, 1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, 1, -1, 1, -1, -1, 1, 1, -1, -1, 1, 1};
	private static final int[] stancePDV = {-1, -1, 1, -1, -1, 0, -1, -1, -1, 0, -1, -1, 1, 1, -1, -1, 0, 0, -1, 1, 1, 1, 0, -1, 1, -1, 0, -1, -1, 1, -1, 1, 1, 1, -1, -1, -1, 0};
	private static final int[] stanceMLPD = {-1, -1, -1, 1, 1, -1, -1, 1, 1, -1, 0, 1, -1, -1, 1, 1, 1, -1, 1, -1, -1, 1, 1, 0, 0, 1, -1, 1, 1, -1, 0, 0, 1, -1, 1, -1, 0, -1};
	private static final int[] stanceB�So = {-1, -1, -1, -1, 1, -1, -1, 1, -1, -1, 1, -1, -1, -1, 1, -1, 1, -1, 0, 1, -1, 1, 0, 1, -1, 1, -1, -1, 1, 1, 0, -1, -1, -1, 1, 1, -1, -1};
	private static final int[] stanceSGP = {-1, -1, -1, 1, 1, 1, -1, 1, 1, -1, -1, 1, -1, -1, 1, 1, 1, -1, 0, 1, -1, 1, 1, -1, 0, 1, -1, 1, 1, 1, 1, 1, 1, -1, 1, -1, 1, -1};
	private static final int[] stanceRechte = {1, -1, 1, 1, 1, 1, 1, -1, -1, 1, -1, 1, 1, 1, -1, 1, -1, 1, -1, 1, -1, -1, 1, 1, 1, -1, 1, 1, -1, 1, -1, -1, 1, 1, 1, 1, 1, -1};
	private static final int[] stanceADD = {-1, -1, -1, 1, 1, -1, 1, -1, -1, -1, 1, -1, -1, -1, -1, -1, 0, 1, -1, 1, 1, 1, 1, -1, 1, 1, -1, -1, 1, 1, -1, 0, 1, 1, -1, 1, -1, 1};
	private static final int[] stanceTierschutz_Allianz = {-1, 0, -1, 0, 1, -1, 1, 1, 0, -1, 1, 1, -1, -1, 0, -1, 1, 0, 1, -1, -1, 0, 1, -1, -1, 0, -1, -1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1};
	private static final int[] stanceB_Stern = {-1, 0, -1, 1, 1, 1, -1, 1, 0, -1, 0, 1, -1, 0, 0, 1, 1, 1, 1, -1, 0, 1, 1, 0, -1, 1, -1, 1, 1, 1, 1, 0, -1, -1, 1, -1, 1, 1};
	private static final int[] stanceBGE = {-1, 1, -1, 1, 1, 1, -1, 1, 1, -1, -1, 1, -1, -1, 0, 0, 1, -1, 1, -1, -1, 1, 1, -1, 0, 0, -1, 1, 1, 0, 1, 1, 0, -1, 1, -1, 1, 1};
	private static final int[] stanceDiB = {-1, 1, -1, 1, 1, 0, -1, 1, 1, -1, 1, 1, -1, -1, 1, -1, 1, -1, 1, -1, 0, 1, 1, -1, -1, 1, -1, 1, 1, 1, 1, 1, 1, -1, 1, -1, 1, 1};
	private static final int[] stanceDM = {-1, -1, 1, 1, 1, -1, -1, 1, -1, -1, 1, 1, -1, 1, -1, -1, 0, 1, -1, -1, 1, 1, 1, 1, -1, 1, 1, -1 ,1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	private static final int[] stanceDKP = {-1, 1, -1, 1, 1, 1, -1, 1, 1, -1, -1, 1, -1, -1, -1, 1, 1, -1, 1, -1, -1, 1, 1, -1, -1, 1, -1, 1, 1, -1, 1, 1, 1, -1, 1, -1, -1, -1};
	private static final int[] stanceGrauen = {1, -1, -1, 1, 1, 1, 1, -1, -1, -1, 1, 1, -1, -1, 1, -1, 1, -1, -1, 1, 0, -1, 1, 1, 1, 1, -1, 1, 1, 1, 1, 0, 1, 1, 1, -1, 0, 0};
	private static final int[] stancedu = {-1, 0, -1, 1, 1, 0, -1, 1, 1, -1, 1, 1, -1, -1, -1, -1, 1, 0, 1, -1, -1, 1, 1, -1, -1, 1, -1, 1, 1, 0, 1, 1, 0, -1, 1, 0, 1, 1};
	private static final int[] stanceMenschliche_Welt = {-1, 1, -1, 1, 1, -1, -1, 1, 1, -1, 1, 1, -1, -1, -1, -1, 0, 0, 1, -1, -1, 1, 1, -1, -1, 1, -1, 1, 1, -1, 1, 1, 0, 1, -1, 1, 1, 1};
	private static final int[] stanceHumanisten = {-1, 0, -1, -1, 1, 1, -1, 0, -1, -1, -1, -1, -1, 0, 1, -1, 1, 1, 1, -1, 1, 1, 0, -1, 0, 0, -1, 1, 1, 0, -1, 1, 0, -1, 1, -1, 1, 1};
	private static final int[] stanceGesundheitsforschung = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	private static final int[] stanceV_Partei_3 = {-1, 1, -1, 1, 1, 1, -1, 0, 1, -1, 1, 1, -1, -1, -1, -1, 1, 0, 1, -1, 1, 1, 1, -1, -1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, -1, 1, 1};
	
	public static enum Party {
		CDU("Christlich Demokratische Union Deutschlands", stanceCDU), 
		SPD("Sozialdemokratische Partei Deutschlands", stanceSPD),
		Linke("Die LINKE", stanceLinke),
		Gruene("B�NDNIS 90/DIE GR�NEN", stanceGruene), 
		FDP("Freie Demokratische Partei", stanceFDP), 
		AfD("Alternative f�r Deutschland", stanceAfD), 
		Piraten("Piratenpartei Deutschland", stancePiraten),
		NPD("Nationaldemokratische Partei Deutschlands", stanceNPD), 
		Freie_Waehler("Freie W�hler", stanceFreie_Waehler), 
		Tierschutz_Partei("PARTEI MENSCH UMWELT TIERSCHUTZ", stanceTierschutz_Partei),
		�DP("�kologisch-Demokratische Partei", stance�DP), 
		Partei("Partei f�r Arbeit, Rechtsstaat, Tierschutz, Elitenf�rderung und basisdemokratische Initiative", stancePartei),
		BP("Bayernpartei", stanceBP), 
		Volksabstimmung("Ab jetzt...Demokratie durch Volksabstimmung", stanceVolksabstimmung), 
		PDV("Partei der Vernunft", stancePDV),
		MLPD("Marxistisch-Leninistische Partei Deutschlands", stanceMLPD), 
		B�So("B�rgerrechtsbewegung Solidarit�t", stanceB�So),
		SGP("Sozialistische Gleichheitspartei, Vierte Internationale", stanceSGP), 
		RECHTE("Die Rechte", stanceRechte), 
		ADD("Allianz Deutscher Demokraten", stanceADD),
		Tierschutz_Allianz("Allianz f�r Menschenrechte, Tier- und Naturschutz", stanceTierschutz_Allianz),
		B_Stern("bergpartei, die �berpartei", stanceB_Stern), 
		BGE("B�ndnis Grundeinkommen", stanceBGE),
		DiB("DEMOKRATIE IN BEWEGUNG", stanceDiB),
		DM("Deutsche Mitte", stanceDM),
		DKP("Deutsche Kommunistische Parte", stanceDKP), 
		Grauen("Die Grauen - F�r alle Generationen", stanceGrauen), 
		du("Die Urbane. Eine HipHop Partei", stancedu),
		Menschliche_Welt("Menschliche Welt", stanceMenschliche_Welt),
		Humanisten("Partei der Humanisten", stanceHumanisten),
		Gesundheitsforschung("Partei f�r Gesundheitsforschung", stanceGesundheitsforschung),
		V_Partei_3("V-Partei� - Partei f�r Ver�nderung, Vegetarier und Veganer", stanceV_Partei_3);
		
		public final static int count = Party.values().length;
		
		public final String longName;
		public final int[] stance;
		
		private Party(String longName, int[] stance) {
			this.longName = longName;
			this.stance = stance;
		}
		
	}
	
	public static final String[] statements = {
			"Bei der Terrorismusbek�mpfung soll die Bundeswehr im Inland eingesetzt werden d�rfen",
			"Dieselkraftstoff f�r Pkw soll h�her besteuert werden",
			"F�r die Aufnahme von neuen Asylsuchenden soll eine j�hrliche Obergrenze gelten",
			"Der Ausbau erneuerbarer Energien soll vom Bund dauerhaft finanziell gef�rdert werden",
			"Der Bund soll mehr Mittel f�r den sozialen Wohnungsbau bereitstellen",
			"BAf�G soll generell unabh�ngig vom Einkommen der Eltern gezahlt werden",
			"Die Video�berwachung im �ffentlichen Raum soll ausgeweitet werden",
			"Deutschland soll einem Schuldenschnitt f�r Griechenland zustimmen",
			"Generelles Tempolimit auf Autobahnen",
			"Die Verteidigungsausgaben Deutschlands sollen erh�ht werden",
			"Betreiber von Internetseiten sollen gesetzlich dazu verpflichtet sein, Falschinformationen (�Fake News�) zu l�schen, auf die sie hingewiesen wurden",
			"�kologische Landwirtschaft soll st�rker gef�rdert werden als konventionelle Landwirtschaft",
			"Kindergeld soll nur an deutsche Familien ausgezahlt werden",
			"Arbeitsvertr�ge sollen weiterhin ohne Angabe von Gr�nden befristet sein d�rfen",
			"Kinder sollen gegen ansteckende Krankheiten geimpft werden m�ssen",
			"Alle Banken sollen verstaatlicht werden",
			"Der V�lkermord an den europ�ischen Juden soll weiterhin zentraler Bestandteil der deutschen Erinnerungskultur sein",
			"Haushalts�bersch�sse sollen �berwiegend zum Abbau von Staatsschulden verwendet werden",
			"Die Gesamtzahl der Nutztiere in den landwirtschaftlichen Betrieben einer Gemeinde soll begrenzt werden k�nnen",
			"In Deutschland soll auch zuk�nftig Braunkohle abgebaut werden d�rfen",
			"Unternehmen sollen weiterhin Leiharbeiterinnen und Leiharbeiter besch�ftigen d�rfen",
			"In Deutschland geborene und aufgewachsene Kinder ausl�ndischer Eltern sollen weiterhin neben der deutschen ihre zweite Staatsangeh�rigkeit behalten d�rfen",
			"Bereits nach 40 Beitragsjahren soll der Renteneintritt abschlagsfrei m�glich sein",
			"Deutschland soll zu einer nationalen W�hrung zur�ckkehren",
			"Die Frauenquote f�r die Aufsichtsr�te b�rsennotierter Unternehmen soll abgeschafft werden",
			"Hohe Verm�gen sollen besteuert werden",
			"F�r begangene Straftaten sollen auch Kinder unter 14 Jahren verurteilt werden k�nnen",
			"Alle B�rgerinnen und B�rger sollen bei gesetzlichen Krankenkassen versichert sein m�ssen",
			"Der Bund soll weiterhin Projekte gegen Rechtsextremismus f�rdern",
			"Der Erwerb von selbstgenutztem Wohneigentum soll bis zu einer bestimmten H�he steuerfrei sein",
			"R�stungsexporte aus Deutschland sollen ausnahmslos verboten werden",
			"Der kontrollierte Verkauf von Cannabis soll generell erlaubt sein",
			"Der Solidarit�tszuschlag soll Ende 2019 vollst�ndig abgeschafft werden",
			"Anerkannten Fl�chtlingen, die sich Integrationsma�nahmen verweigern, sollen die Leistungen gek�rzt werden k�nnen",
			"Eltern sollen f�r ihre Kinder bis zum Ende der Grundschulzeit einen Rechtsanspruch auf Ganztagsbetreuung erhalten",
			"Der Gottesbezug im Grundgesetz soll bestehen bleiben",
			"In Deutschland soll es ein bedingungsloses Grundeinkommen geben",
			"Die Zusammenarbeit der Mitgliedstaaten in der Europ�ischen Union soll verst�rkt werden"
			};
	
}
