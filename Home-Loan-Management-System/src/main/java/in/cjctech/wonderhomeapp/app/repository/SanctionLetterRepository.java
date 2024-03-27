package in.cjctech.wonderhomeapp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.cjctech.wonderhomeapp.app.model.SanctionLetter;

@Repository
public interface SanctionLetterRepository  extends JpaRepository<SanctionLetter,Long>
{
      public SanctionLetter findById(long id);
}
