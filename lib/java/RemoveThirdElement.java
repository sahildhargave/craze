import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveThirdElement {

  public static void main(String[] args) {
    // Create and populate an ArrayList
    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("First");
    arrayList.add("Second");
    arrayList.add("Third");
    arrayList.add("Fourth");
    arrayList.add("Fifth");

    // Remove the third element from the ArrayList
    if (arrayList.size() >= 3) {
      arrayList.remove(2); // Index 2 represents the third element
      System.out.println(
        "After removing the third element from ArrayList: " + arrayList
      );
    } else {
      System.out.println("ArrayList does not contain a third element.");
    }

    // Create and populate a LinkedList
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("One");
    linkedList.add("Two");
    linkedList.add("Three");
    linkedList.add("Four");
    linkedList.add("Five");

    // Remove the third element from the LinkedList
    if (linkedList.size() >= 3) {
      linkedList.remove(2); // Index 2 represents the third element
      System.out.println(
        "After removing the third element from LinkedList: " + linkedList
      );
    } else {
      System.out.println("LinkedList does not contain a third element.");
    }

    // Create and populate a HashSet
    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("Apple");
    hashSet.add("Banana");
    hashSet.add("Cherry");
    hashSet.add("Date");
    hashSet.add("Fig");

    // Remove the third element from the HashSet
    if (hashSet.size() >= 3) {
      String thirdElement = null;
      int count = 0;
      for (String element : hashSet) {
        if (count == 2) {
          thirdElement = element;
          break;
        }
        count++;
      }
      hashSet.remove(thirdElement);
      System.out.println(
        "After removing the third element from HashSet: " + hashSet
      );
    } else {
      System.out.println("HashSet does not contain a third element.");
    }
  }
}
