package in.cjctech.wonderhomeapp.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.cjctech.wonderhomeapp.app.model.CustomerApplicationForm;


@Repository
public interface ApplicantRepository extends JpaRepository<CustomerApplicationForm,Long>
{

	@Query("select c from CustomerApplicationForm  c,StatusCheck sc where c.applicationNumber=sc.applicationNumber AND sc.status=:status")
	public List<CustomerApplicationForm> findCustomerByStatus(@Param("status") String status);

}
