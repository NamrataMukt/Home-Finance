package in.cjctech.wonderhomeapp.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.cjctech.wonderhomeapp.app.model.EmployeeForm;
import in.cjctech.wonderhomeapp.app.service.EmployeeFormService;

@CrossOrigin("*")
@RestController
public class EmployeeFormController 
{
	@Autowired
	private EmployeeFormService efs;
	
	@PostMapping("/saveEmp")
	public ResponseEntity<EmployeeForm>SaveEmployee(@RequestBody EmployeeForm ef)
	{
		EmployeeForm emp=efs.saveEmp(ef);
		return new ResponseEntity<EmployeeForm>(emp,HttpStatus.CREATED);
	}
	
	@GetMapping("/getEmp")
	public ResponseEntity<List<EmployeeForm>>getEmployee()
	{
		List<EmployeeForm> emp=efs.getEmployee();
		return new ResponseEntity<List<EmployeeForm>>(emp,HttpStatus.OK);
	}
	
//	@GetMapping("/getSingleEmp/{empId}")
//	public EmployeeForm getSingleData(@PathVariable("empId") int id)
//	{
//		EmployeeForm emp=efs.getSingleData(id);
//		return emp;
//		
//	}
	
	@PatchMapping("/update/{empId}")
	public ResponseEntity<EmployeeForm>updateEmployee(@RequestBody EmployeeForm empform,@PathVariable("empId") int id)
	{
		EmployeeForm emp=efs.saveEmp(empform);
		
		return new  ResponseEntity<EmployeeForm>(emp,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String>deleteEmployee(@PathVariable("empId") int empId)
	{
		efs.DeleteEmployee(empId);
		
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
		
	}
	
	

}
