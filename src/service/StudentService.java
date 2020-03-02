package service;

import java.util.List;

import dao.Studentdao;
import entity.StudentEntity;

public class StudentService {
	private Studentdao dao = new Studentdao();
	public List<StudentEntity> Find() {
		// TODO Auto-generated method stub
		List<StudentEntity> list = dao.Find();
		if (list != null) {
			return list;
		} else {
			return null;
		}
	}
	public int deleteid(int stuId) {
		int list = dao.deleteid(stuId);
		if (list != 0) {
			return list;
		} else {
			return 0;
		}
	}
	public int Addstu(StudentEntity list) {
		int lista = dao.Addstu(list);
		if (lista != 0) {
			return lista;
		} else {
			return 0;
		}
	}

}
