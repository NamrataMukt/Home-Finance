package in.cjctech.wonderhomeapp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.cjctech.wonderhomeapp.app.model.Mortage;

@Repository
public interface MortageRepository extends JpaRepository<Mortage, Long>
{

}
