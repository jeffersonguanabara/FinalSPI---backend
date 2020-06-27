package br.unipe.jeffersonguanabara.finalspi.web.repository;

import br.unipe.jeffersonguanabara.finalspi.web.domain.Jedi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JediRepository extends JpaRepository<Jedi, Long> {
}
