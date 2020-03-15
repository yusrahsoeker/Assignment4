package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class AppTest 
{
    Employee emp = new Employee("Yusrah", "Soeker", 100);
    Employee emp2 = new Employee ("Amy", "Johnston", 101);
    Employee emp3 = new Employee ("Junaid", "Martin", 102);

    @Test
    public void mapTest()
    {
        //hashmap from App class
        HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();
        map.put(1, emp);
        map.put(2, emp2);
        map.put(3, emp3);
        map.remove(2);
        //new hashmap
        HashMap<Integer, Employee> map2 = new HashMap<>();
        map2.put(1, emp);
        map2.put(2, emp2);
        map2.put(3, emp3);
        map2.remove(2);

        //testing if map from main class equals to new map created
        assertEquals(map, map2);
        //testing if map has an object
        assertTrue(map.containsKey(1));
    }
    @Test
    public void setTest()
    {
        HashSet<Employee> hashSet = new HashSet<Employee>();
        //testing to see if Employee object has been added
        hashSet.add(emp3);
        assertTrue(hashSet.contains(emp3));
        //testing to see if it's added into the correct index number
        assertEquals(3, hashSet.size());


    }
    @Test
    public void listTest()
    {
        List<Employee> list = new ArrayList<Employee>();

        //testing to see if Employee object has been added
        list.add(emp);
        assertTrue(list.contains(emp));
        //testing to see if Employee object has been removed
        list.remove(emp2);
        assertTrue(!list.contains(emp2));
    }
}
