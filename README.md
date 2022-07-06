# DB Sprintstarter
 Implementierte Lösung zur DB Sprintstarter Aufgabe
 
## Beschreibung
 Liest Betriebsstellenverzeichnisdaten aus einer lokalen .csv Datei und stellt Abfragen dieser in Form von JSON-Objekten über einen Rest-Endpoint bereit.
 
## Dependencies
 Java, Maven, Spring-Boot, OpenCsv
 
## Datenbank
 Benötigt "Betriebsstellenverzeichnis.csv" in "src\main\resources\database\".
 https://data.deutschebahn.com/dataset/data-betriebsstellen.html
 
## Benutzung
 1. Build und Run Spring-Boot mit Maven.
 2. GET Request über "localhost:8080/betriebsstelle/{RL100 Code}".
