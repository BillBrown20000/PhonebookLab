package PhoneBookLab;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> map;

    public PhoneBook(Map<String, List<String>> map){
        this.map = map;
    }
    public PhoneBook(String billy, String johnny, String lucy){
        this(new HashMap<String, List<String>>());
    }

    public void add(String name, String phoneNumber){
        List<String> numbers = new ArrayList<String>();
        numbers.add(phoneNumber);
        map.put(name,numbers);

    }
    public void addAll(String name, String... phoneNumbers) {
        map.put(name, Arrays.asList(phoneNumbers));
    }
    public void remove(String name){

        map.remove(name);
    }
    public Boolean hasEntry(String name) {

        return map.containsKey(name);
    }
    public List<String> lookup(String name){

        return map.get(name);
    }
    public String reverseLookup(String phoneNumber){
        String reverselookup = "";
            for(Map.Entry<String, List<String>> key : map.entrySet()){
                if (key.getValue().contains(phoneNumber)){
                    reverselookup += key.getKey();
                }
            }
            return reverselookup;
    }
    public List<String> getAllContactNames() {
        map.values();
        return (List<String>) map;
    }
    public Map<String, List<String>> getMap(){

        return map;
    }
}
