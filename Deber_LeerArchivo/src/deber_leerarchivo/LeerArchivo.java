/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_leerarchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LeerArchivo {

    public static void main(String[] args) {
        File documento = new File("C:\\Users\\dell\\Desktop\\METAS.txt");
        try {
            FileReader lector = new FileReader(documento); 
            BufferedReader re = new BufferedReader(lector);
            String linea = "";
            while ((linea = re.readLine()) != null) { 
                System.out.println(linea);
            }
            re.close();
        } catch (Exception e) {
            System.out.println("ocurrio un error" + e);

        }
    }
}

