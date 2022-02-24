package mediatek2022;

public interface Utilisateur {
	String name();
	boolean isBibliothecaire();
	/*
	 * data() permet de récup�rer les informations qui seraient n�cessaires � des
	 * contr�les sur l'abonn� (age, abonnement d�sactiv�,...)
	 */	
	Object[] data();
}
