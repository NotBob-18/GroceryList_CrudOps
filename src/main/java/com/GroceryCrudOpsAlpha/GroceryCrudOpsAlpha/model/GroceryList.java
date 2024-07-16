package com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class GroceryList {

    private int taskId;
    private String task;
    private boolean isComplete;

}
