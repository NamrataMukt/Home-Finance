package in.cjctech.wonderhomeapp.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.cjctech.wonderhomeapp.app.model.Enquiry;

@Repository
public interface OperationManagerRepository extends JpaRepository<Enquiry, Long> {


}
