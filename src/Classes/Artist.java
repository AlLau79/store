package Classes;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import exceptions.BadNameException;

public class Artist {
    private String name;
    private TreeSet<String> memberNames;
    private Map<String, SortedSet<String>> memberInstruments = new TreeMap<String, SortedSet<String>>();

    public Artist(String name, TreeSet<String> memberNames) throws Exception{
        this.setName(name);
        this.memberNames = memberNames;
    }

    public void addMember(String member, SortedSet<String> instruments){
        memberNames.add(member);
        memberInstruments.put(member, instruments);
    }
    
    public String showMembers(){
        String output = "";
        for (String name : memberNames) {
            output = output + "\nName: " + name + "\nInstruments: " + memberInstruments.get(name);
        }
        return output;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name) throws Exception{
        
        if(name.equals("")) 
            throw new BadNameException();
        
        this.name = name;
    }
}
