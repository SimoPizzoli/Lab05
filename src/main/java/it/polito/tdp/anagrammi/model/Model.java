package it.polito.tdp.anagrammi.model;

import java.util.Set;

import it.polito.tdp.anagrammi.DAO.DizionarioDAO;

public class Model {
	
	private DizionarioDAO dizionarioDao;
	private Anagramma anagramma;
	
	public Model() {
		dizionarioDao = new DizionarioDAO();
		anagramma = new Anagramma();
	}
	
	public Set<String> doAnagrammi(String parola){
		return anagramma.doAnagrammi(parola);	
	}
	
	public boolean isCorrect(String anagramma) {
		return this.dizionarioDao.isCorrect(anagramma);
	}
}
