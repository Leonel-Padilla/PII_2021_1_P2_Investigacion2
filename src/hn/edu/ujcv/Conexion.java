package hn.edu.ujcv;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import java.net.URL;


public class Conexion {

    static Logger log = Logger.getLogger(Conexion.class);

    URL url = Conexion.class.getResource("Log4j.properties");

    public void establecerConexion (String caracter){
        PropertyConfigurator.configure(url);

        switch (caracter) {
            case "Si":
                log.info("La conexion fue exitosa");
                break;
            case "No se":
                log.warn("Posiblimente un error vaya a ocurir");
                break;
            case "No":
                log.fatal("Ha ocurrido un error fatal");
                break;
            default:
                log.fatal("Ha ocurrido un ENORME error fatal");
        }
        //-----
    }

    //------------------------------------------------------------------------------------------------------------------
}
