package com.everis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.everis.domain.Update;

@Repository
public interface UpdateRepository extends JpaRepository<Update, Integer> {

	@Query(value = "select * from update where time > ?1 order by time", nativeQuery = true)
	List<Update> findAllByLastModification(Long time);

}
