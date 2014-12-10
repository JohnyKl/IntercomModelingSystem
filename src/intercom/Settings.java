package intercom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Settings implements Serializable{
    static final public int VERIFICATION_ON  = 1;
    static final public int VERIFICATION_OFF = 0;
    
    public ArrayList<String> authoorizedKeys;
    public String            adminPassword;
    public int               verificationMode;
    
    public Settings(){
        authoorizedKeys = new ArrayList<>();
        adminPassword = "12345";
        verificationMode = VERIFICATION_ON;
        authoorizedKeys.add("Ключ_1");
    }            
    
    public static void saveSettings(Settings settings){
        FileOutputStream   fos;
        ObjectOutputStream oos;
        
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            
            oos.writeObject(settings);
            oos.flush();
            oos.close();   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Intercom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Intercom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Settings loadSettings(){
        FileInputStream   fis;
        ObjectInputStream oin;
        
        Settings settings = new Settings();
        
        try {
            fis = new FileInputStream(path);
            oin = new ObjectInputStream(fis);
            
            settings = (Settings) oin.readObject();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Intercom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            //Logger.getLogger(Intercom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return settings;
    }
    
    private static final String path = "intercom_settings.stg";
}
