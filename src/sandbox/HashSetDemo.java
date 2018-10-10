package sandbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {

  public static void demoHashSet() {

    // HashSet
    HashSet<String> countriesSet = new HashSet<String>();
    countriesSet.add("United Kingdom");
    countriesSet.add("United Kingdom");  // duplicate will be automatically removed
    countriesSet.add("United States");
    countriesSet.add("China");
    countriesSet.add("Egypt");
    countriesSet.add("Nigeria");
    System.out.println("countriesSet (naturally unsorted and can't be sorted)");
    System.out.println(countriesSet);
    //Collections.sort(countriesSet); // sort works on a list so this doesn't compile

    // ArrayList
    ArrayList<String> countriesList = new ArrayList();
    countriesList.add("United Kingdom");
    countriesList.add("United Kingdom");  // duplicates allowed
    countriesList.add("United States");
    countriesList.add("China");
    countriesList.add("Egypt");
    countriesList.add("Nigeria");
    System.out.println("countriesList unsorted");
    System.out.println(countriesList);
    Collections.sort(countriesList); // can be sorted
    System.out.println("countriesList sorted");
    System.out.println(countriesList);
  }
}
