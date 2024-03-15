package in.cjctech.wonderhomeapp.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cjctech.wonderhomeapp.app.model.EmployeeForm;
import in.cjctech.wonderhomeapp.app.repository.EmployeeFormRepository;
import in.cjctech.wonderhomeapp.app.service.EmployeeFormService;

@Service
public class EmployeeFormServiceImpl implements EmployeeFormService 
{
	@Autowired
	private EmployeeFormRepository efr;

	@Override
	public EmployeeForm saveEmp(EmployeeForm ef)
	{
		
		return efr.save(ef);
	}

	@Override
	public List<EmployeeForm> getEmployee()
	{
		
		return efr.findAll();
	}

	@Override
	public void DeleteEmployee(int empId) 
	{
		 efr.deleteById(empId);
		 
		
	}
	
	

//	@Override
//	public EmployeeForm getSingleData(int id) 
//	{
//		
//		return efr.getById(id);
//	}

	
	

}
