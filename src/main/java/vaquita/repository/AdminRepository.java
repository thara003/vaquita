package Vaquita.repository;


import Vaquita.entity.Admin;
import Vaquita.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Vaquita.entity.Course;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>
{

}
