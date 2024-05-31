# nachhaltigkeits-dashboard


## Mit GitLab arbeiten
Bevor der Entwickler mit der zugewiesenen Aufgabe beginnt, lesen Sie bitte sorgfältig, wie man mit Git arbeitet, [hier.](https://gitlab.rz.htw-berlin.de/brajko/nachhaltigkeits-dashboard/-/wikis/Wie-richte-ich-das-GitLab-Repo-in-meinem-lokalen-Rechner-ein%3F)

## Name
Nachhaltigkeit-Dashboard

## Description
Dashboard zum Messen der Nachhaltigkeit eines Produkts während des ganzen Softwareentwicklungsprozesses. Dieses Repository ist das Backend-Repo für die Anwendung.

## Installation einer Spring Boot App Backend
#### Voraussetzungen

- **Java Development Kit (JDK)**: Version 17-19
- **Gradle**: Version 8
- **IntelliJ IDEA**: Beliebige aktuelle Version

#### Installation

1. **JDK installieren**

   Stellen Sie sicher, dass Sie JDK 17, 18 oder 19 auf Ihrem System installiert haben. Sie können das JDK von der offiziellen [Oracle Webseite](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) oder von [AdoptOpenJDK](https://adoptopenjdk.net/) herunterladen.

2. **Gradle installieren**

   Laden Sie Gradle 8 von der [offiziellen Webseite](https://gradle.org/releases/) herunter und folgen Sie den Installationsanweisungen für Ihr Betriebssystem.

3. **IntelliJ IDEA installieren**

   Laden Sie IntelliJ IDEA von der [offiziellen Webseite](https://www.jetbrains.com/idea/download/) herunter und installieren Sie es.

4. **Projekt klonen**

   Klonen Sie das Git-Repository Ihres Projekts auf Ihr lokales System:
   
   ```sh
   git clone https://github.com/IhrBenutzername/IhrProjekt.git
   ```

5. **Projekt in IntelliJ IDEA importieren**

   - Öffnen Sie IntelliJ IDEA.
   - Wählen Sie **"Open"** und navigieren Sie zu dem Verzeichnis, in das Sie das Repository geklont haben.
   - Wählen Sie die `build.gradle` Datei und klicken Sie auf **"OK"**.
   - IntelliJ IDEA wird das Projekt automatisch importieren und alle notwendigen Abhängigkeiten herunterladen.

6. **Konfiguration**

   - Stellen Sie sicher, dass die korrekte JDK-Version für das Projekt ausgewählt ist:
     - Gehen Sie zu **File > Project Structure**.
     - Wählen Sie **Project** und stellen Sie sicher, dass die Projekt SDK auf die installierte JDK-Version 17, 18 oder 19 gesetzt ist.

7. **Build und Ausführen**

   - Um das Projekt zu bauen, können Sie den folgenden Befehl im Terminal innerhalb des Projektverzeichnisses ausführen:
   
     ```sh
     ./gradlew build
     ```
   
   - Um die Anwendung auszuführen, verwenden Sie:
   
     ```sh
     ./gradlew bootRun
     ```

#### Weitere Informationen

Für weitere Informationen zur Verwendung von Spring Boot, Java und Gradle, besuchen Sie die offiziellen Dokumentationen:
- [Spring Boot Dokumentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
- [Gradle Dokumentation](https://docs.gradle.org/current/userguide/userguide.html)
- [IntelliJ IDEA Dokumentation](https://www.jetbrains.com/idea/documentation/)

---

# ToDos

## Authors and acknowledgment
Show your appreciation to those who have contributed to the project.

## License
For open source projects, say how it is licensed.

## Project status
If you have run out of energy or time for your project, put a note at the top of the README saying that development has slowed down or stopped completely. Someone may choose to fork your project or volunteer to step in as a maintainer or owner, allowing your project to keep going. You can also make an explicit request for maintainers.
