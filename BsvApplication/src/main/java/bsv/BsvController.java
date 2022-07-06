package bsv;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BsvController {

  private final BsvRepository repository;

  BsvController(BsvRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/betriebsstelle")
  List<Betriebsstelle> all() {
    return repository.findAll();
  }

  @GetMapping("/betriebsstelle/{rl100code}")
  List<Betriebsstelle> one(@PathVariable String rl100code) {
    return repository.findByrl100code(rl100code.toUpperCase());
  }
}