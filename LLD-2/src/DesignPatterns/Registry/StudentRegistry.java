package DesignPatterns.Registry;

import DesignPatterns.Prototype.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map=new HashMap<String,Student>();
    public void register(String name,Student obj){
        map.put(name,obj);
    };
    public Student getFromRegistry(String key){
        return map.get(key).copy();
    };
}
