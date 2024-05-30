package school.lesson6_2;

import java.util.*;

public class PhoneBook {

    private HashMap<String, List<String>> phoneBook = new HashMap<>();

    public void add(String phoneNumber, String surname){
        List<String> phones = phoneBook.get(surname);
        if (phones == null) {
            phones = new ArrayList<>();
            phoneBook.put(surname, phones);
        }
        phones.add(phoneNumber);
    }

    public List<String> get(String surname){
        return phoneBook.get(surname);
    }
}


