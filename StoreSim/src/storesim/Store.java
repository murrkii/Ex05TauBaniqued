package storesim;
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.earnings = 0;
    ArrayList<Item> itemList = new ArrayList<>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  
  public double getEarnings(){
    return earnings;
  }
  
  public void sellItem(int index){
    if (index < itemList.size()){
        double cost = itemList.get(index).getCost();
        earnings += cost;
        System.out.printf("%n%You sold %s for %.2f%n", itemList.get(index).getName(), cost);
    }
    
    else {  
        System.out.printf("%nThere are only %s items in the store.", itemList.size());
    }
  }
  
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  
  public void addItem(Item i){
    // add Item i to store's itemList
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
  }
  
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
