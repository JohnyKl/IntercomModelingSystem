package intercom;

import java.util.ArrayList;

public class Housemates {
    
    static final public String welcomeMessage         = "Ласкаво просимо!\n";
    static final public String doorClosedMessage      = "Ключ не підходить.\n";
    static final public String answerNegativeMessage  = "- Ні, вибачте, я не впущу вас.\n"
                                                        + "Двері заблоковано.\n";
    static final public String answerPositiveMessage  = "- Добре, проходьте.\n"
                                                        + "Двері відчинено.\n";
    static final public String askMessage             = "- Алло. Хто там?\n";
    
    static final public int NUMBER_OF_APARTMENTS   = 36;
    static final public int FIRST_APARTMENT_NUMBER = 1;
       
    public ArrayList<String> positiveResponses;
    public ArrayList<String> negativeResponses;
    
    private final Settings settings;
    
    public Housemates(Settings settings){
        this.settings = settings;
        
        positiveResponses = new ArrayList<>();
        negativeResponses = new ArrayList<>();
        
        writeInResponsesLists();
    }
    
    private void writeInResponsesLists(){
        positiveResponses.add("- Це я!");
        positiveResponses.add("- Листоноша. Вам надійшов замовний лист.");
        positiveResponses.add("- Швидка допомога!");
        
        negativeResponses.add("- Відкрийте, будь-ласка!");
        negativeResponses.add("- Доставка квітів");
        negativeResponses.add("- Реклама. Вам не потрібні нові шпалери?");
    }
    
    public String checkKey(String key){
        String resultMessage = doorClosedMessage;
        
        boolean checkResult = false;
        
        if(settings.verificationMode == Settings.VERIFICATION_ON){//якщо перевірка ключів увімкнена
            for (int i = 0; i < settings.authoorizedKeys.size() && !checkResult; i++){//доки не знайдено вірного ключа
                String authorizedKey = settings.authoorizedKeys.get(i);//взяти і-ий ключ з списку авторизованих ключів
                
                if(authorizedKey.equals(key)){//порівняти значення переданого ключа з і-тим, якщо рівні то
                    resultMessage = welcomeMessage;//вивести привітальне повідомлення
                    checkResult   = true;//прапорецем позначити, що ключ аутентифіковано
                }
            }
        }  
        else{
            resultMessage = welcomeMessage;//якщо перевірка ключів вимкнена, будь-який ключ буде "довіреним"
        }
        
        return resultMessage;
    }
    
    public String checkGuestResponse(String response){
        String checkResult = response + "\n" + answerNegativeMessage;//по замовчуванню встановитинегативну відповідь
        
        for(int i = 0; i < positiveResponses.size() && !checkResult.equals(answerPositiveMessage); i++){//до кінця списку і поки не позначено відповідь як задовільну для пропуску всередину будинку
            if(response.equals(positiveResponses.get(i))){//порівнювати надану відповідь з списком позитивних, які дозволяють впустити гостя
                checkResult = response + "\n" + answerPositiveMessage;//якщо знайдено позитивну, вивести привітальне повідомлення
            }
        }        
        return checkResult;
    }   
    
    public boolean checkApartmentCall(String command){//перевірка набраного коду квартири
        boolean isApartment = false;//чи це код квартири - по замовчуванню false
        
        for(int i = FIRST_APARTMENT_NUMBER; (i < FIRST_APARTMENT_NUMBER + NUMBER_OF_APARTMENTS) && !isApartment; i++){//поки не знайдено співпадіння номеру квартири
                if(command.equals(Integer.toString(i))){//перевіряти введений код з номерами квартир в цьому будинку
                    isApartment = true;
                }
            }        
        return isApartment;
    }
}
