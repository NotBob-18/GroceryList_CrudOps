package com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.repository;

import com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.model.GroceryList;
import com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.type.GroceryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroceryRepository implements GroceryInterface {


   private JdbcTemplate jdbc;
   private GroceryList groceryList;


    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {

        this.jdbc = jdbc;
    }





    @Override
    public List<GroceryList> getAllGroceryList() {

        String sql = "SELECT * FROM grocerylist";

        return jdbc.query(sql, new BeanPropertyRowMapper<>(GroceryList.class));

    }



    @Override
    public GroceryList createGroceryList(GroceryList groceryList) {

    String sql = "INSERT INTO grocerylist (taskid, task, iscomplete) VALUES (?, ?, ?)";

    int row = jdbc.update(sql, groceryList.getTaskId(), groceryList.getTask(), groceryList.isComplete());

        System.out.println(row + " rows affected");

        return groceryList;
    }


    @Override
    public GroceryList updateGroceryList(GroceryList groceryList, int taskId) {

        String sql = "UPDATE grocerylist SET task = ?, iscomplete = ? WHERE taskid = ?";

        int row = jdbc.update(sql, groceryList.getTask(), groceryList.isComplete(), groceryList.getTaskId());

        System.out.println(row + " rows affected");
        return groceryList;
    }


    @Override
    public List<GroceryList> deleteGroceryListById(int taskId) {

        String sql = "DELETE FROM grocerylist WHERE taskid = ?";

        int rowsAffected = jdbc.update(sql, taskId);

        System.out.println(rowsAffected + " rows affected");

        return getAllGroceryList();
    }


}
