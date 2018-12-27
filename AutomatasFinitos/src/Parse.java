/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


/**
 *
 * @author Fran
 */
public class Parse {
    public Parse(){}
    public void leer (File file) throws FileNotFoundException, IOException{
        FileInputStream inputStream = null;
        Scanner sc = null;
        try{
            //inputStream = new FileInputStream(file);
            //sc = new Scanner(inputStream, "UTF-8");
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            if(sc.ioException() != null){  throw sc.ioException();   }
        }
        finally{
            if (inputStream != null){   inputStream.close();    }
            if (sc != null) {   sc.close();     }
        }
    }
    
}
