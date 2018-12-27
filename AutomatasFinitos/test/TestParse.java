/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fran
 */
public class TestParse {
    @Test
    public void TestParse() throws IOException {
        Parse parse = new Parse();
        File file = new File("./Files/fichero.txt");
        //String path = "\\Files\\fichero.txt";
        parse.leer(file);
    }
    
}
