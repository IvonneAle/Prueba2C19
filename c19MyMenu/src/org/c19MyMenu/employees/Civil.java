package org.c19MyMenu.employees;

import org.c19MyMenu.crud.Empleado;

public class Civil extends Empleado{

	@Override
	public void Create(String id, String name, String email, String cPhone) {
		super.Create(id, name, email, cPhone);
		System.out.print("Create Empleado Civil");
	}
	
	@Override
	public void Read(String[][] employee) {
		super.Read(employee);
		System.out.print("Read Empleado Civil");
	}
	
	@Override
	public void Update(String id, int position, String inf,String[][] employee) {
		super.Update(id, position, inf, employee);
		System.out.print("Update Empleado Civil");
	}
	
	@Override
	public void Delete(String[][] employee, String id) {
		super.Delete(employee, id);
		System.out.print("Delete Empleado Civil");
	}
}
