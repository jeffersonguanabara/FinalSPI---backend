package br.unipe.jeffersonguanabara.finalspi.web.service;

import br.unipe.jeffersonguanabara.finalspi.web.domain.Jedi;
import br.unipe.jeffersonguanabara.finalspi.web.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class JediService {

    @Autowired
    private JediRepository jediRepository;

    public Jedi salvarJedi(Jedi jedi) {
        return jediRepository.save(jedi);
    }

    public List<Jedi> listarTodos() {
        return jediRepository.findAll();
    }

    public Jedi buscarPorId(Long id) {
        return jediRepository.findById(id).get();
    }

    public ResponseEntity<Jedi> deletarPorId(Long id) {
        jediRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<Jedi> deletarJedi(Jedi jedi) {
        jediRepository.delete(jedi);
        return ResponseEntity.noContent().build();
    }

    public Jedi atualizarJedi(Jedi jedi) {
        if (jedi.getId() == null)
            throw new NoSuchElementException();
        return jediRepository.save(jedi);
    }
}
