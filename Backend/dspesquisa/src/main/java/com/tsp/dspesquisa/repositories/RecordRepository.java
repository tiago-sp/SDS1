package com.tsp.dspesquisa.repositories;

import java.time.Instant;

import com.tsp.dspesquisa.entites.Record;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * GameRepository
 */
@Repository
public interface RecordRepository extends JpaRepository<Record,Long> {

    @Query("SELECT obj FROM Record obj WHERE "
    + "(coalesce(:minDate, null) IS NULL OR obj.moment >= :minDate) AND "
    + "(coalesce(:maxDate, null) IS NULL OR obj.moment <= :maxDate)")

	Page<Record> findByMoments(Instant minDate, Instant maxDate, Pageable pageable);

}