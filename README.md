# DB Sprintstarter
 Implementierte Lösung zur DB Sprintstarter Aufgabe
 
## Beschreibung
 Liest Betriebsstellenverzeichnisdaten aus einer lokalen .csv Datei und stellt Abfragen dieser in Form von JSON-Objekten über einen Rest-Endpoint bereit.
 
### Dependencies
 Java, Maven, Spring-Boot, OpenCsv
 
## Datenbank
 Benötigt "Betriebsstellenverzeichnis.csv" in "src\main\resources\database\".
 https://data.deutschebahn.com/dataset/data-betriebsstellen.html
 
## Benutzung
 GET Request über ".../betriebsstelle/{RL100 Code}".
