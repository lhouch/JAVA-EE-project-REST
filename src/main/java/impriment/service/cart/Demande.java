package impriment.service.cart;

public class Demande {
	
	private int id;
	private String matric;
	
	private String numeroma;		//Numéro d’immatriculation actuel
	private String dateachat;		//Date d’achat, le cas échéant
	private String datecertificata;	//Date de certificat actuel
	private String datepm;			//Date de 1ère immatriculation
	private String numeroformulec;	//Numéro de formule du certificat d’immatriculation 
	private String marque;			//Marque (D.1)
	private String typev;			//Type variante version (D.2)
	private String denominationc;	//Dénomination commerciale (D.3)
	private String numeroidv;		//Numéro d’identification du véhicule (E)
	private String genrenational;	//Genre national  
	private String numerexp;
	private String nomd;
	private String sexe;
	public String getNomd() {
		return nomd;
	}
	public void setNomd(String nomd) {
		this.nomd = nomd;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getMatric() {
		return matric;
	}
	public void setMatric(String matric) {
		this.matric = matric;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumeroma() {
		return numeroma;
	}
	public void setNumeroma(String numeroma) {
		this.numeroma = numeroma;
	}
	public String getDateachat() {
		return dateachat;
	}
	public void setDateachat(String dateachat) {
		this.dateachat = dateachat;
	}
	public String getDatecertificata() {
		return datecertificata;
	}
	public void setDatecertificata(String datecertificata) {
		this.datecertificata = datecertificata;
	}
	public String getDatepm() {
		return datepm;
	}
	public void setDatepm(String datepm) {
		this.datepm = datepm;
	}
	public String getNumeroformulec() {
		return numeroformulec;
	}
	public void setNumeroformulec(String numeroformulec) {
		this.numeroformulec = numeroformulec;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getTypev() {
		return typev;
	}
	public void setTypev(String typev) {
		this.typev = typev;
	}
	public String getDenominationc() {
		return denominationc;
	}
	public void setDenominationc(String denominationc) {
		this.denominationc = denominationc;
	}
	public String getNumeroidv() {
		return numeroidv;
	}
	public void setNumeroidv(String numeroidv) {
		this.numeroidv = numeroidv;
	}
	public String getGenrenational() {
		return genrenational;
	}
	public void setGenrenational(String genrenational) {
		this.genrenational = genrenational;
	}
	public String getNumerexp() {
		return numerexp;
	}
	public void setNumerexp(String numerexp) {
		this.numerexp = numerexp;
	}
	
	

}
