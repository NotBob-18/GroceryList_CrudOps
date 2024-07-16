package com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.controller;
import com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.model.GroceryList;
import com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.service.GroceryService;
import com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.type.GroceryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroceryController implements GroceryInterface {


    @Autowired
    private GroceryService groceryService;

    @Autowired
    private GroceryList groceryList;



    @GetMapping("/grocery")
    @Override
    public List<GroceryList> getAllGroceryList() {
        return groceryService.getAllGroceryList();

    }


    @PostMapping("/grocery/create")
    @Override
    public GroceryList createGroceryList(@RequestBody GroceryList groceryList) {
        return groceryService.createGroceryList(groceryList);

    }

    @PutMapping("/grocery/update/{taskId}")
    @Override
    public GroceryList updateGroceryList(@RequestBody GroceryList groceryList, @PathVariable int taskId) {
        groceryService.updateGroceryList(groceryList, taskId);
        return groceryList;
    }



    @DeleteMapping("/grocery/delete/{taskId}")
    @Override
    public List<GroceryList> deleteGroceryListById(@PathVariable int taskId) {
      return groceryService.deleteGroceryListById(taskId);

}
    }




