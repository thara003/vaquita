package vaquita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import vaquita.entity.Userrequest;

@Repository
public interface UserrequestRepository extends JpaRepository<Userrequest, Integer>
{

}