package vaquita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vaquita.entity.Billing;


@Repository
public interface BillingRepository extends JpaRepository<Billing, Integer>
{

}