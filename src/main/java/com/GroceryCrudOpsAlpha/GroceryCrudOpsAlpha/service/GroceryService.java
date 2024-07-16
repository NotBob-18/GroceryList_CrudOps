package com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.service;

import com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.model.GroceryList;
import com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.repository.GroceryRepository;
import com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.type.GroceryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryService implements GroceryInterface {

    @Autowired
    private GroceryRepository groceryRepository;


    @Override
    public List<GroceryList> getAllGroceryList() {
        return groceryRepository.getAllGroceryList();
    }


    @Override
    public GroceryList createGroceryList(GroceryList groceryList) {
        return groceryRepository.createGroceryList(groceryList);
    }

    @Override
    public GroceryList updateGroceryList(GroceryList groceryList, int taskId) {
        return groceryRepository.updateGroceryList(groceryList, taskId);
    }


    @Override
    public List<GroceryList> deleteGroceryListById(int taskId) {
        return groceryRepository.deleteGroceryListById(taskId);
    }


}
