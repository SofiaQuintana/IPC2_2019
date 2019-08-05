/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagedeliveryservice.Run;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author zofia
 */
public class PackageDeliveryService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection connection = null;
        try {
                String user = "root";
                String password = "@Dopediamond?8";
                // La url incluye el esquema a usar, en este caso 'mysql'
                String urlConnection = "jdbc:mysql://localhost:3306/PACKAGE_DELIVERY";

                //abrimos una coneccion a la DB usando una url, el usuario y password (SUSTITUIR PASSWORD)
                connection = 
                           DriverManager.getConnection(urlConnection, user, password);

                //Mostramos el nombre del esquema de base de datos, en este caso es mysql
                System.out.println("conectado:" + connection.getCatalog());
//                logIn = new LogInDialog(true, connection);
//                logIn.setVisible(true);
        } catch (Exception e) {
                System.out.println("error");
        }
    }
    
}
