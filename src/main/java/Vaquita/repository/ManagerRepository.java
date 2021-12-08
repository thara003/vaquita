package Vaquita.repository;


import Vaquita.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Vaquita.entity.Course;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer>
{

}
