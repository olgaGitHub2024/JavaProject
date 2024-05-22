package school.lesson6_2;

import java.util.*;

public class PhoneBook {

    private HashMap<String, String> phoneBook = new HashMap<>();

    public void add(String phoneNumber, String surname){
        phoneBook.put(phoneNumber, surname);
    }

    public List<String> get(String surname){
        List<String> phoneNumbers = new ArrayList<>();
        for (Map.Entry<String, String> phoneRecord: phoneBook.entrySet()) {
            if(surname.equals(phoneRecord.getValue())) {
                phoneNumbers.add(phoneRecord.getKey());
            }
        }
        return phoneNumbers;
    }
}

