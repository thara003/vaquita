package Vaquita.repository;

import Vaquita.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Vaquita.entity.Course;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>
{

}
