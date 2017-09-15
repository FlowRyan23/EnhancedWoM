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
	private static final int[] stanceÖDP = {-1, 1, -1, 1, 1, 1, 0, 1, 1, -1, -1, 1, -1, -1, 1, -1, 1, 1, 1, -1, 1, 1, 1, -1, 1, 1, -1, 1, 1, 1, 0, -1, -1, 1, -1, 1, -1, 1};
	private static final int[] stancePartei = {-1, 1, 1, 1, 1, 1, -1, 1, 1, -1, -1, 1, -1, -1, 1, -1, 1, -1, -1, -1, -1, 1, 1, -1, -1, 1, -1, 1, 1, 1, 1, 1, 1, 1, 1, -1, 1, 1};
	private static final int[] stanceBP = {-1, -1, 1, 1, 1, 1, -1, -1, -1, 0, -1, 0, 0, 1, -1, -1, 1, 1, 1, -1, 1, -1, 1, 1, 1, -1, 0, 1, 1, 1, -1, -1, 1, 1, 0, 1, -1, 0};
	private static final int[] stanceVolksabstimmung = {1, -1, 1, 1, 1, -1, 1, 1, 1, -1, -1, 1, 1, 1, 1, -1, 1, -1, 1, 1, -1, -1, -1, -1, 1, 1, -1, 1, -1, 1, -1, -1, 1, 1, -1, -1, 1, 1};
	private static final int[] stancePDV = {-1, -1, 1, -1, -1, 0, -1, -1, -1, 0, -1, -1, 1, 1, -1, -1, 0, 0, -1, 1, 1, 1, 0, -1, 1, -1, 0, -1, -1, 1, -1, 1, 1, 1, -1, -1, -1, 0};
	private static final int[] stanceMLPD = {-1, -1, -1, 1, 1, -1, -1, 1, 1, -1, 0, 1, -1, -1, 1, 1, 1, -1, 1, -1, -1, 1, 1, 0, 0, 1, -1, 1, 1, -1, 0, 0, 1, -1, 1, -1, 0, -1};
	private static final int[] stanceBüSo = {-1, -1, -1, -1, 1, -1, -1, 1, -1, -1, 1, -1, -1, -1, 1, -1, 1, -1, 0, 1, -1, 1, 0, 1, -1, 1, -1, -1, 1, 1, 0, -1, -1, -1, 1, 1, -1, -1};
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
		Gruene("BÜNDNIS 90/DIE GRÜNEN", stanceGruene), 
		FDP("Freie Demokratische Partei", stanceFDP), 
		AfD("Alternative für Deutschland", stanceAfD), 
		Piraten("Piratenpartei Deutschland", stancePiraten),
		NPD("Nationaldemokratische Partei Deutschlands", stanceNPD), 
		Freie_Waehler("Freie Wähler", stanceFreie_Waehler), 
		Tierschutz_Partei("PARTEI MENSCH UMWELT TIERSCHUTZ", stanceTierschutz_Partei),
		ÖDP("Ökologisch-Demokratische Partei", stanceÖDP), 
		Partei("Partei für Arbeit, Rechtsstaat, Tierschutz, Elitenförderung und basisdemokratische Initiative", stancePartei),
		BP("Bayernpartei", stanceBP), 
		Volksabstimmung("Ab jetzt...Demokratie durch Volksabstimmung", stanceVolksabstimmung), 
		PDV("Partei der Vernunft", stancePDV),
		MLPD("Marxistisch-Leninistische Partei Deutschlands", stanceMLPD), 
		BüSo("Bürgerrechtsbewegung Solidarität", stanceBüSo),
		SGP("Sozialistische Gleichheitspartei, Vierte Internationale", stanceSGP), 
		RECHTE("Die Rechte", stanceRechte), 
		ADD("Allianz Deutscher Demokraten", stanceADD),
		Tierschutz_Allianz("Allianz für Menschenrechte, Tier- und Naturschutz", stanceTierschutz_Allianz),
		B_Stern("bergpartei, die überpartei", stanceB_Stern), 
		BGE("Bündnis Grundeinkommen", stanceBGE),
		DiB("DEMOKRATIE IN BEWEGUNG", stanceDiB),
		DM("Deutsche Mitte", stanceDM),
		DKP("Deutsche Kommunistische Parte", stanceDKP), 
		Grauen("Die Grauen - Für alle Generationen", stanceGrauen), 
		du("Die Urbane. Eine HipHop Partei", stancedu),
		Menschliche_Welt("Menschliche Welt", stanceMenschliche_Welt),
		Humanisten("Partei der Humanisten", stanceHumanisten),
		Gesundheitsforschung("Partei für Gesundheitsforschung", stanceGesundheitsforschung),
		V_Partei_3("V-Partei³ - Partei für Veränderung, Vegetarier und Veganer", stanceV_Partei_3);
		
		public final static int count = Party.values().length;
		
		public final String longName;
		public final int[] stance;
		
		private Party(String longName, int[] stance) {
			this.longName = longName;
			this.stance = stance;
		}
		
	}
	
	public static final String[] statements = {
			"Bei der Terrorismusbekämpfung soll die Bundeswehr im Inland eingesetzt werden dürfen",
			"Dieselkraftstoff für Pkw soll höher besteuert werden",
			"Für die Aufnahme von neuen Asylsuchenden soll eine jährliche Obergrenze gelten",
			"Der Ausbau erneuerbarer Energien soll vom Bund dauerhaft finanziell gefördert werden",
			"Der Bund soll mehr Mittel für den sozialen Wohnungsbau bereitstellen",
			"BAföG soll generell unabhängig vom Einkommen der Eltern gezahlt werden",
			"Die Videoüberwachung im öffentlichen Raum soll ausgeweitet werden",
			"Deutschland soll einem Schuldenschnitt für Griechenland zustimmen",
			"Generelles Tempolimit auf Autobahnen",
			"Die Verteidigungsausgaben Deutschlands sollen erhöht werden",
			"Betreiber von Internetseiten sollen gesetzlich dazu verpflichtet sein, Falschinformationen (“Fake News”) zu löschen, auf die sie hingewiesen wurden",
			"Ökologische Landwirtschaft soll stärker gefördert werden als konventionelle Landwirtschaft",
			"Kindergeld soll nur an deutsche Familien ausgezahlt werden",
			"Arbeitsverträge sollen weiterhin ohne Angabe von Gründen befristet sein dürfen",
			"Kinder sollen gegen ansteckende Krankheiten geimpft werden müssen",
			"Alle Banken sollen verstaatlicht werden",
			"Der Völkermord an den europäischen Juden soll weiterhin zentraler Bestandteil der deutschen Erinnerungskultur sein",
			"Haushaltsüberschüsse sollen überwiegend zum Abbau von Staatsschulden verwendet werden",
			"Die Gesamtzahl der Nutztiere in den landwirtschaftlichen Betrieben einer Gemeinde soll begrenzt werden können",
			"In Deutschland soll auch zukünftig Braunkohle abgebaut werden dürfen",
			"Unternehmen sollen weiterhin Leiharbeiterinnen und Leiharbeiter beschäftigen dürfen",
			"In Deutschland geborene und aufgewachsene Kinder ausländischer Eltern sollen weiterhin neben der deutschen ihre zweite Staatsangehörigkeit behalten dürfen",
			"Bereits nach 40 Beitragsjahren soll der Renteneintritt abschlagsfrei möglich sein",
			"Deutschland soll zu einer nationalen Währung zurückkehren",
			"Die Frauenquote für die Aufsichtsräte börsennotierter Unternehmen soll abgeschafft werden",
			"Hohe Vermögen sollen besteuert werden",
			"Für begangene Straftaten sollen auch Kinder unter 14 Jahren verurteilt werden können",
			"Alle Bürgerinnen und Bürger sollen bei gesetzlichen Krankenkassen versichert sein müssen",
			"Der Bund soll weiterhin Projekte gegen Rechtsextremismus fördern",
			"Der Erwerb von selbstgenutztem Wohneigentum soll bis zu einer bestimmten Höhe steuerfrei sein",
			"Rüstungsexporte aus Deutschland sollen ausnahmslos verboten werden",
			"Der kontrollierte Verkauf von Cannabis soll generell erlaubt sein",
			"Der Solidaritätszuschlag soll Ende 2019 vollständig abgeschafft werden",
			"Anerkannten Flüchtlingen, die sich Integrationsmaßnahmen verweigern, sollen die Leistungen gekürzt werden können",
			"Eltern sollen für ihre Kinder bis zum Ende der Grundschulzeit einen Rechtsanspruch auf Ganztagsbetreuung erhalten",
			"Der Gottesbezug im Grundgesetz soll bestehen bleiben",
			"In Deutschland soll es ein bedingungsloses Grundeinkommen geben",
			"Die Zusammenarbeit der Mitgliedstaaten in der Europäischen Union soll verstärkt werden"
			};
	
}
