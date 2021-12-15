package vaquita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vaquita.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>
{

}
