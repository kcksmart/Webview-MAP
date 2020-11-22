package sample;

import com.sun.xml.internal.ws.api.pipe.Engine;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private WebView webView;
    private WebEngine engine;

    @Override
    public void initialize(URL url,ResourceBundle rb) {
    engine = webView.getEngine();
    }

    public void btn1(ActionEvent event){
        engine.load("https://www.openstreetmap.org/#map=18/51.10347/8.07121&layers=TNDG");
    }
    public void btn2(ActionEvent event){
        WebView  browser = new WebView();
        WebEngine engine = browser.getEngine();
        String url = getClass().getResource("index.html").toExternalForm();
        engine.load(url);

        //URL urlHello = getClass().getResource("index.html");
        //engine.load(urlHello.toExternalForm());
        //getChildren().add(webView);
        //final WebEngine engine = new WebEngine(getClass().getResource("MAP/index.html").toString());
        //final WebView webView = new WebView(engine);
        //URL urlHello = getClass().getResource("index.html");
        //engine.load(urlHello.toExternalForm());
        //getChildren().add(webView);
    }

    private Collection<WebView> getChildren() {
        return null;
    }

    public void btn3(ActionEvent event){
        URL urlHello = getClass().getResource("openstreetmap.html");
        engine.load(urlHello.toExternalForm());
        getChildren().add(webView);
    //final URL urlosmMap = getClass().getResource("/MAP/index.html");
    //engine.load(urlosmMap.toExternalForm());
    //getChildren().add(webView);
    }


    private class var {
    }
    private class file extends var{
        public file(String s) {
            super();
        }
    }

}
