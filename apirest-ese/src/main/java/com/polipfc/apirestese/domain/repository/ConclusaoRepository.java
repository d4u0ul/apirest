package com.polipfc.apirestese.domain.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.polipfc.apirestese.domain.model.Conclusao;

@Repository
public interface ConclusaoRepository extends JpaRepository<Conclusao, Long> {

}
