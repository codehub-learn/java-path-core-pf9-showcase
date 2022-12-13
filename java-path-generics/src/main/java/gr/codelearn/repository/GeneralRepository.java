package gr.codelearn.repository;

import java.util.ArrayList;

public interface GeneralRepository<T>  {

	//CRUD  create read update delete

	 void createT(T t);
	 T readT(int index);
	 ArrayList<T> readT();
//	ArrayList<T> readT(String name);

	 boolean deleteT(int TIndex);

}
