package in.cjctech.wonderhomeapp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.cjctech.wonderhomeapp.app.model.DependantDetails;

@Repository
public interface DependantDetailsRepository extends JpaRepository<DependantDetails, Long> 
{
    
}
