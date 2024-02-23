<<<<<<< HEAD
package Game;

import Inventory.Clue;
import Inventory.Notebook;
import Location.Location;
import People.Hero;
import UI.GameFrame;
import Utility.JsonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.Headers;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Game {
    public static void run() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GameFrame();
            }
        });
    }
}
=======
package Game;

import Inventory.Clue;
import Inventory.Notebook;
import Location.Location;
import People.Hero;
import Utility.JsonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.Headers;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Game {
    public static void resetGameState() {
        try {
            JsonUtil.resetLocations();
            JsonUtil.resetMainHeroLocation();

            ObjectMapper mapper = new ObjectMapper();

            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src\\Resources\\Notebook.json"), new Notebook());

        } catch (IOException e) {
            new RuntimeException(e);
        }
    }
}
>>>>>>> b1d61b5539b184d7b607e3cc6c7bd8898f692f6a
