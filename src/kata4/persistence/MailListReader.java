
package kata4.persistence;

import kata4.model.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    public static List<Mail> read(String filename) {
        List<Mail> list=new ArrayList<>();
        try{
        BufferedReader read= new BufferedReader(new FileReader(new File(filename)));
        while(true){
            String line=read.readLine();
            if(line==null) break;
            if(Mail.isMail(line)){
                list.add(new Mail(line));
            }
        }
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado:");
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
        return list;
    }
    
}
