package GroovyForJavaEyes
/**
 * Created by lizhe on 14/12/26.
 */

import javafx.application.Application
import javafx.event.ActionEvent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class Song {
    def name
    def artist
    def genre

    def getGenre() {
        genre?.toUpperCase()
    }

    String toString() {
        "${name}, ${artist}, ${genre}"
    }
}

public class JavaFXDemo extends Application {

    public static void main(args) {
        launch(JavaFXDemo, args);
    }

    @Override
    void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World!")
        def btn = new Button()
        btn.setText("Say 'Hello World'")
        btn.setOnAction({ ActionEvent e ->
            println("Hello World! ${e.eventType.toString()}")

            def message = 12.0
            println message.class

            def range = 0..4
            println range.class
            assert range instanceof List

            def coll = ["Groovy", "Java", "Ruby"]
            println coll.class
            assert coll instanceof Collection
            assert coll instanceof ArrayList

            coll.add("Python")
            coll << "Smalltalk"
            coll[5] = "Perl"

            println coll

            def numbers = [1, 2, 3, 4]
            assert numbers + 5 == [1, 2, 3, 4, 5]
            assert numbers - [2, 3] == [1, 4]

            def hash = [name: "Andy", "VPN-#": 45]
            assert hash.getClass() == LinkedHashMap

            hash.put("id", 23)
            assert hash.get("name") == "Andy"

            hash.dob = "01/29/76"
            assert hash.dob == "01/29/76"

            def acoll = ["Groovy", "Java", "Ruby"]

            for (Iterator iter = acoll.iterator(); iter.hasNext();) {
                println iter.next()
            }

            acoll.each {
                println it
            }

            acoll.each { value ->
                println value
            }

            hash.each { key, value ->
                println "${key} : ${value}"
            }

            def excite = { word ->
                return "${word}!!"
            }

            assert "Groovy!!" == excite("Groovy")
            assert "Java!!" == excite.call("Java")

            def sng = new Song(name: "Le Freak", artist: "Chic", genre: "Disco")
            println(sng)
            def sng2 = new Song(name: "Kung Fu Fighting", genre: "Disco")
            println(sng2)
            def sng3 = new Song()
            sng3.name = "Funkytown"
            sng3.artist = "Lipps Inc."
            sng3.setGenre("Disco")

            assert sng3.getArtist() == "Lipps Inc."

            println(sng3)

            assert sng3.genre == "DISCO"
        })
        def root = new StackPane()
        root.getChildren().add(btn)
        primaryStage.setScene(new Scene(root, 300, 250))
        primaryStage.show()
    }
}