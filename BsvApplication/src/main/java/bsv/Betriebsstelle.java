package bsv;

import java.util.Objects;
import com.opencsv.bean.CsvBindByName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

  public Long getId() {
    return this.id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public String getRl100Code() {
    return this.rl100code;
  }
  public void setRl100Code(String rl100code) {
    this.rl100code = rl100code;
  }

  public String getRl100Lang() {
    return this.rl100lang;
  }
  public void setRl100Lang(String rl100lang) {
    this.rl100lang = rl100lang;
  }

  public String getRl100Kurz() {
	  return this.rl100kurz;
  }
  public void setRl100Kurz(String rl100kurz) {
	  this.rl100kurz = rl100kurz;
  }
  
  public String getTypKurz() {
	  return this.typkurz;
  }
  public void setTypKurz(String typkurz) {
	  this.typkurz = typkurz;
  }
  
  public String getTypLang() {
	  return this.typlang;
  }
  public void setTypLang(String typlang) {
	  this.typlang = typlang;
  }
  
  public String getBetriebszustand() {
	  return this.betriebszustand;
  }
  public void setBetriebszustand(String betriebszustand) {
	  this.betriebszustand = betriebszustand;
  }
  
  public Integer getDatumAb() {
	  return this.datumab;
  }
  public void setDatumAb(Integer datumab) {
	  this.datumab = datumab;
  }
  
  public Integer getDatumBis() {
	  return this.datumbis;
  }
  public void setDatumBis(Integer datumbis) {
	  this.datumbis = datumbis;
  }

  public Integer getNiederlassung() {
	  return this.niederlassung;
  }
  public void setNiederlassung(Integer niederlassung) {
	  this.niederlassung = niederlassung;
  }
  
  public String getRegionalbereich() {
	  return this.regionalbereich;
  }
  public void setRegionalbereich(String regionalbereich) {
	  this.regionalbereich = regionalbereich;
  }

  public Integer getLetzteAenderung() {
	  return this.letzteaenderung;
  }
  public void setLetzteAenderung(Integer letzteaenderung) {
	  this.letzteaenderung = letzteaenderung;
  }
  
}
