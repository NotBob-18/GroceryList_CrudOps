package com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.type;



import com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.model.GroceryList;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface GroceryInterface {

  // get all the items from the GroceryList
  public List<GroceryList> getAllGroceryList();

  // create a new Grocerylist item
  public GroceryList createGroceryList(GroceryList groceryList);

  // update an item on the GroceryListGa
  public GroceryList updateGroceryList(GroceryList groceryList, int taskId);

  // delete item from Grocerylist
  public List<GroceryList> deleteGroceryListById(int taskId);

}
