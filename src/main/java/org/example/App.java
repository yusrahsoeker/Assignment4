package org.example;
import java.util.*;

/**
 * Yusrah Soeker (218150768)
 * Assignment 4
 */
public class App 
{

    public static void main(String[] args )
    {
        Employee emp = new Employee("Yusrah", "Soeker", 100);
        Employee emp2 = new Employee ("Amy", "Johnston", 101);
        Employee emp3 = new Employee ("Junaid", "Martin", 102);

        //1. Map
        HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();

        map.put(1, emp);
        map.put(2, emp2);
        map.put(3, emp3);

        System.out.println("MAP");
        //print all objects
        System.out.println(map.toString());

        //get and remove a specific object
        System.out.println("Remove Amy object: " +  map.get(2));
        map.remove(2);
        System.out.println(map.toString());

        //2. Set
        System.out.println("\nSET");
        HashSet <Employee> hashSet = new HashSet<Employee>();
        hashSet.add(emp);
        hashSet.add(emp2);
        hashSet.add(emp3);

        //print all objects
        System.out.println(hashSet.toString());
        //remove an object
        System.out.println("Remove Junaid object: " + hashSet.remove(emp3));

        //print new set of objects
        System.out.println(hashSet.toString());


        //3. List
        System.out.println("\nLIST");

        List <Employee> list = new ArrayList<Employee>();
        list.add(emp);
        list.add(emp2);
        //make element Junaid at index 1 in the array
        list.add(1, emp3);

        //print all objects
        System.out.println(list.toString());
        }
    }

