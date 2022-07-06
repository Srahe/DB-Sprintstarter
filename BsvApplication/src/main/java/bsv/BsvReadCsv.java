package bsv;

import java.io.*;
import java.util.*;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.enums.CSVReaderNullFieldIndicator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class BsvReadCsv {

  private static final Logger log = LoggerFactory.getLogger(BsvReadCsv.class);

  @Bean
  CommandLineRunner initDatabase(BsvRepository repository) {
	  
	  return args -> {
		  
		  log.info("Loading database from .csv...");
		  try(Reader reader = new BufferedReader(new InputStreamReader(
				  getClass().getClassLoader().getResourceAsStream("database/Betriebsstellenverzeichnis.csv"), "UTF-8"))){
			  CsvToBean<Betriebsstelle> csvToBean = new CsvToBeanBuilder(reader)
					  .withType(Betriebsstelle.class)
					  .withSeparator(';')
					  .build();
			  
			  List<Betriebsstelle> betriebsstellen = csvToBean.parse();
			  repository.saveAll(betriebsstellen);
			  List<Betriebsstelle> bs = repository.findByrl100code("XBHC");
			  log.info("Successfully loaded database from .csv.");
		  } catch (Exception ex) {
			  log.error("Error when loading database from .csv.");
          }
    };
  }
}