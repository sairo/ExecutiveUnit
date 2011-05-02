package pwr.tin.tip.sw.pd.eu.db.service;

import java.util.Hashtable;

import pwr.tin.tip.sw.pd.eu.db.model.Algorithm;

public interface IAlgorithmService {

	/**
	 * �aduje algorytmy do przestrzeni centralnej
	 * 
	 * @param algorithmSpace przestrze� centralna dla algorytm�w
	 */
	public void loadAlgorithmIntoSpace(Hashtable<Integer, Algorithm> algorithmSpace);
	
	public void saveAlgorithm(Algorithm algorithm);
	
	public void deleteAlgorithms();
	
	public Algorithm getAlgorithmByAlgorithmId(Integer algorithmId);
}
