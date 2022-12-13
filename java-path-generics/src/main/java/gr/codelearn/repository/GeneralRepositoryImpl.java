package gr.codelearn.repository;


import gr.codelearn.model.Employee;

import java.util.ArrayList;

public class GeneralRepositoryImpl<T> implements GeneralRepository<T> {

	private ArrayList<T> Ts;

	public GeneralRepositoryImpl(){
		Ts = new ArrayList<>();
	}
	//CRUD  create read update delete

	@Override
	public void createT(T t){
		Ts.add(t);
	}

	/**
	 * @param index of the requested T
	 * @return the T object
	 */
	@Override
	public T readT(int index){
		if(index>=0 && index< Ts.size())
			return Ts.get(index);
		else
			return null;
	}

	@Override
	public ArrayList<T> readT(){

		return Ts;
	}

	@Override
	public boolean deleteT(int TIndex){
		T T = readT(TIndex);
		if (T == null ) return false;
		Ts.remove(TIndex);
		return true;
	}


}
