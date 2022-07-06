package bsv;

import java.util.Objects;
import com.opencsv.bean.CsvBindByName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Betriebsstelle {

  private @Id @GeneratedValue Long id;
  
  @CsvBindByName(column = "PLC")
  private String plc;
  @CsvBindByName(column = "RL100-Code")
  private String rl100code;
  @CsvBindByName(column = "RL100-Langname")
  private String rl100lang;
  @CsvBindByName(column = "RL100-Kurzname")
  private String rl100kurz;
  @CsvBindByName(column = "Typ Kurz")
  private String typkurz;
  @CsvBindByName(column = "Typ Lang")
  private String typlang;
  @CsvBindByName(column = "Betriebszustand")
  private String betriebszustand;
  @CsvBindByName(column = "Datum ab")
  private Integer datumab;
  @CsvBindByName(column = "Datum bis")
  private Integer datumbis;
  @CsvBindByName(column = "Niederlassung")
  private Integer niederlassung;
  @CsvBindByName(column = "Regionalbereich")
  private String regionalbereich;
  @CsvBindByName(column = "Letzte Änderung")
  private Integer letzteaenderung;

  public Betriebsstelle() {}

  public Betriebsstelle(String plc,
  String rl100code,
  String rl100lang,
  String rl100kurz,
  String typkurz,
  String typlang,
  String betriebszustand,
  Integer datumab,
  Integer datumbis,
  Integer niederlassung,
  String regionalbereich,
  Integer letzteaenderung) {

    this.plc = plc;
    this.rl100code = rl100code;
    this.rl100lang = rl100lang;
    this.rl100kurz = rl100kurz;
    this.typkurz = typkurz;
    this.typlang = typlang;
    this.betriebszustand = betriebszustand;
    this.datumab = datumab;
    this.datumbis = datumbis;
    this.niederlassung = niederlassung;
    this.regionalbereich = regionalbereich;
    this.letzteaenderung = letzteaenderung;
  }
}
