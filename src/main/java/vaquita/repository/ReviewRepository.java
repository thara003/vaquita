package Vaquita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Vaquita.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>
{

}