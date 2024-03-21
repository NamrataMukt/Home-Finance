package in.cjctech.wonderhomeapp.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import in.cjctech.wonderhomeapp.app.model.EmployeeForm;

public interface EmployeeFormService 
{

	public EmployeeForm saveEmp(EmployeeForm ef);

	public List<EmployeeForm> getEmployee();

	public void DeleteEmployee(int empId);



	

//	public EmployeeForm getSingleData(int id);

	
	

}
