package intercom;  

public class Control {
    static final public int UNDEFINITE_CALL_TYPE = 0;
    static final public int APARTMENT_CALL_TYPE  = 1;
    static final public int SETTINGS_CALL_TYPE   = 2;
    static final public int CHANGE_PASSWORD_TYPE = 3;
    static final public int ADD_KEY_TYPE         = 4;
    static final public int DELETE_KEY_TYPE      = 5;
       
    static final public String addKeyMessage          = "Додано довірений ключ.\n"; 
    static final public String deleteKeyMessage       = "Довірений ключ видалено.\n"; 
    static final public String welcomeAdminMessage    = "Меню налаштування до ваших послуг.\n";
    static final public String verificationOffMessage = "Увага! Перевірка ключів відключена!\n";
    static final public String verificationOnMessage  = "Увага! Перевірка ключів включена!\n";
    static final public String changedPasswordMessage = "Увага! Пароль змінено.\n";
    static final public String askToEnterNewPassword  = "Введіть новий пароль: \n";
    static final public String askToSelectKey         = "Оберіть ключ.\n";
    static final public String endOfBlock             = "_____________________________________\n";
    
    public boolean waitForEnterCode;
    public int     callType;    
    public int     settingType;
    
    public  Housemates housemates;  
    public  Settings   settings;    
    
    public Control(){
        settings = Settings.loadSettings();
        
        levelPointer     = LEVEL_ZERO;
        waitForEnterCode = false;
        callType         = UNDEFINITE_CALL_TYPE;    
        settingType      = UNDEFINITE_CALL_TYPE;
        this.buffer      = "";
        this.housemates  = new Housemates(settings);
    }
    
    public String execComand(String enteredCode, String value){//виконання введеної команди
        String execResult = buffer;
        
        switch(levelPointer){
            case LEVEL_ZERO: {
                execResult += checkTypeOfFirstLevel(enteredCode);//перевірка команди нульового рівня
            } break;
            case LEVEL_ONE: {
                execResult += checkTypeOfSecondLevel(enteredCode);//перевірка команди першого рівня
            } break; 
            case LEVEL_TWO: {//перевірка команди другого рівня
                switch(settingType){
                    case Control.ADD_KEY_TYPE:{//якщо команда типу "додати ключ"
                        execResult += addKey(value);//додати передане значеня ключа 
                    } break;
                    case Control.DELETE_KEY_TYPE:{
                        execResult += removeKey(value);
                    } break;
                    case Control.CHANGE_PASSWORD_TYPE:{
                        execResult += changePassword(value);
                    }
                    execResult += endOfBlock;
                } break; 
            }
        }
        return execResult;
    }
    
    private String checkTypeOfFirstLevel(String code){
        String answer = "";
        
        if(code.equals(settings.adminPassword)){//якщо введено пароль адміністратора, встановити прапор меню налаштувань
            levelPointer = LEVEL_ONE;
            
            callType = SETTINGS_CALL_TYPE;
            
            answer = welcomeAdminMessage;
        }
        else{
            if(housemates.checkApartmentCall(code)){//інакше перевірка коду квартири 
                callType = APARTMENT_CALL_TYPE;
                
                answer = Housemates.askMessage;
            }
        }       
        return answer;
    }
    
    private String checkTypeOfSecondLevel(String code){
       String checkResult = "";
       
       if(code.equals(verificationOffCommand)){
           settings.verificationMode = Settings.VERIFICATION_OFF;
           
           levelPointer = LEVEL_ZERO;
           callType     = UNDEFINITE_CALL_TYPE;
           
           checkResult = verificationOffMessage + endOfBlock;
       }
       else if(code.equals(verificationOnCommand)){
           settings.verificationMode = Settings.VERIFICATION_ON;
           
           levelPointer = LEVEL_ZERO;
           callType     = UNDEFINITE_CALL_TYPE;
           
           checkResult = verificationOnMessage + endOfBlock;
       }
       else if(code.equals(changePasswordCommand)){
           changeFlags(LEVEL_TWO, CHANGE_PASSWORD_TYPE, true);  
           checkResult  = askToEnterNewPassword;
       }
       else if(code.equals(deleteKeyCommand)){
           changeFlags(LEVEL_TWO, DELETE_KEY_TYPE, true);                      
           checkResult  = askToSelectKey;
       }
       else if(code.equals(addKeyCommand)){
           changeFlags(LEVEL_TWO, ADD_KEY_TYPE, true);
           checkResult  = askToSelectKey;           
       }
       return checkResult;
    }
    
    private void changeFlags(int level, int setting, boolean wait){
        levelPointer     = level;
        settingType      = setting;
        waitForEnterCode = wait;
    }
    
    private void skipFlags(){
        levelPointer     = LEVEL_ZERO;
        waitForEnterCode = false;
        callType         = UNDEFINITE_CALL_TYPE;    
        settingType      = UNDEFINITE_CALL_TYPE;
    }
    
    public String removeKey(String key){
        String resultMessage = "";
        
        if(!key.equals("")){
            settings.authoorizedKeys.remove(key);

            resultMessage = deleteKeyMessage;
        }
        skipFlags();
        
        return resultMessage + endOfBlock;
    }
    
    public String addKey(String key){
        String resultMessage = "";
        
        if(!key.equals("")){
                    settings.authoorizedKeys.add(key);
                    
                    resultMessage = addKeyMessage;
                }
        skipFlags();
        
        return resultMessage + endOfBlock; 
    }
    
    public String changePassword(String password){
        String changeResult = "";
        
        if(!password.equals("")){
            settings.adminPassword = password;
            
            changeResult = changedPasswordMessage;
        }  
        skipFlags();
        
        return changeResult + endOfBlock;
    }
        
    void refreshBuffer(String buffer){
        this.buffer = buffer;
    }   
    
    static final private int LEVEL_ZERO  = 0;
    static final private int LEVEL_ONE   = 1;
    static final private int LEVEL_TWO   = 2;
    
    private String buffer;   
    private int levelPointer;    
    
    static private final String verificationOnCommand  = "1";
    static private final String verificationOffCommand = "2";
    static private final String changePasswordCommand  = "3";
    static private final String addKeyCommand          = "4";
    static private final String deleteKeyCommand       = "5";
}
