package br.unipe.jeffersonguanabara.finalspi.web.rest;

import br.unipe.jeffersonguanabara.finalspi.web.domain.Jedi;
import br.unipe.jeffersonguanabara.finalspi.web.service.JediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jeffersonguanabara/api/jedi")
public class JediRest {

    @Autowired
    private JediService jediService;

    @GetMapping
    public ResponseEntity<List<Jedi>> todosOsJedis() {
        return ResponseEntity.ok().body(jediService.listarTodos());
    }

    @PostMapping("/salvar")
    public ResponseEntity<Jedi> salvarJedi(@RequestBody @Validated Jedi jedi) {
        System.out.println(jedi.toString());
        return ResponseEntity.ok(jediService.salvarJedi(jedi));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarPorId(@PathVariable @Validated Long id) {
        return ResponseEntity.ok(jediService.deletarPorId(id));
    }

    @DeleteMapping("deletarJedi")
    public ResponseEntity deletarJedi(@RequestBody @Validated Jedi jedi) {
        return ResponseEntity.ok(jediService.deletarJedi(jedi));
    }

    @GetMapping("/{id}")
    public ResponseEntity buscarPorId(@PathVariable @Validated Long id) {
        return ResponseEntity.ok().body(jediService.buscarPorId(id));
    }

    @PutMapping("/atualizar")
    public ResponseEntity atualizarJedi(@RequestBody @Validated Jedi jedi) {
        return ResponseEntity.ok(jediService.atualizarJedi(jedi));
    }
}
