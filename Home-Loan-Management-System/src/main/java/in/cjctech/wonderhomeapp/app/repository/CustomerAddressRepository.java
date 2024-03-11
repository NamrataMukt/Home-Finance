package in.cjctech.wonderhomeapp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.cjctech.wonderhomeapp.app.model.CustomerAddress;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Long>
{

}
