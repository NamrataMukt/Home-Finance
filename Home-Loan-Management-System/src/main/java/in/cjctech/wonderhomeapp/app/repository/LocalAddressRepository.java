package in.cjctech.wonderhomeapp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.cjctech.wonderhomeapp.app.model.LocalAddress;

public interface LocalAddressRepository extends JpaRepository<LocalAddress, Integer>
{

}
