package vaquita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vaquita.entity.Events;


@Repository
public interface EventsRepository extends JpaRepository<Events, Integer>
{

}