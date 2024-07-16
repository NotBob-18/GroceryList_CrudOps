package com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha;

import com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.model.GroceryList;
import com.GroceryCrudOpsAlpha.GroceryCrudOpsAlpha.service.GroceryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GroceryCrudOpsAlphaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GroceryCrudOpsAlphaApplication.class, args);

		GroceryList grocerylist = context.getBean(GroceryList.class);



		GroceryService service = context.getBean(GroceryService.class);

		service.getAllGroceryList();
//		System.out.println(grocerylist);
	}

}
