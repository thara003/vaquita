package vaquita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vaquita.entity.Review;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>
{

}
