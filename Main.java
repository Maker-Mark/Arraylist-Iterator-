import java.util.*;
import java.io.*;
// import does NOT load in a libary. They are all preloaded. 
// All it does, it does it let you call things by their easy name

public class Main{
  
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
    Integer[] arr = {3,7,10,13};// an array of Integers taht I can put into my arrayList
    // There is a arr.asList() makes it to a list
    java.util.ArrayList<Integer> list = new ArrayList<Integer>();
    list.addAll(Arrays.asList(arr)); // Arrays is a class that has a bunch of static methods that do stuff like convert an array to a list of co
    //addALl takes a collection and adds all the elements frm that collection
    System.out.println(list);
    System.out.println(list.contains(33));
    System.out.println(list.get(1));// by index.
    //System.out.println(list.get(100)); // Array list only lets you acess the placers that you put even if it allocate3d the space in the heap for your array
    list.set(0,100); // Go to position 0 and seet it to 100
    
    for(int i = 0; i < 10; i++){
    list.add(i*2);
    }
  System.out.println("The sum is " + sumAll( list));

  }
  
  private static int sumAllIter(ArrayLIst<Integer> list){
  int total = 0;
    // this is an upcast, sets up poly
    // can have a refence to somthing that inplemtns an iterator 
    // read only, cant manipulate th data
    iterator<Integer> iter = list.iterator(); // asking the list to give me their iterator 
    // We can use an iterator on the lefthand side of an assignment statment
    // I have a reff to an object that implements the iterator interface
    // Unboxing... 
    while(iter.hasNext()){
    int data = iter.next();// when you call next more than once it keeps moving. 
      total+= data;
    }
  return total;
  }
  
      // Arrays have random acess meaing they dont need to start in the begging each time, opposed to linked list that cannot do that, i
      // Used when the method i am wrting has nothing to do ith the object of the class 
    private static int sumAll( ArrayList<Integer> list){
      int total = 0;
     for(int i = 0; i < list.size(); i++){
     total += list.get(i);
     } 
      return total;
      //kennyS wuz hure
      
    }
  // java has the for each loop that does ^^ using the iterator 
  
  public static int sumAllEnhancedArrayList<Integer> list){
  int total = 0;
// data type var    // data structure 
    for(int x       :list)  // syntactic sugar
      total +=;
    return total;
  }
}
