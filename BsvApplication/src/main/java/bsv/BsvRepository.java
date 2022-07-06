package bsv;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

interface BsvRepository extends JpaRepository<Betriebsstelle, Long>{
	
	List<Betriebsstelle> findByrl100code(String rl100code);
	
}
