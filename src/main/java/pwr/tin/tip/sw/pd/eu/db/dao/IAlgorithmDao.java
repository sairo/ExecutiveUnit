package pwr.tin.tip.sw.pd.eu.db.dao;

import java.util.List;

import pwr.tin.tip.sw.pd.eu.db.IBaseDao;
import pwr.tin.tip.sw.pd.eu.db.model.Algorithm;

public interface IAlgorithmDao extends IBaseDao {

	/**
	 * Pobiera list� algorytm�w znajduj�cych si� w kontenerze jednostki uruchomieniowej o wskazanym id
	 * 
	 * @param executiveUnitId id jednostki uruchomieniowej
	 * @return lista algorytm�w za�adowanych do kontenera
	 */
	@SuppressWarnings("rawtypes")
	public List getListOfDeployedAlgorithms(Integer executiveUnitId);
	
	public void deleteAlgorithms(Integer executiveUnitId);
	
	public Algorithm getAlgorithmByAlgorithmId(Integer algorithmId, Integer executiveUnitId);
}
