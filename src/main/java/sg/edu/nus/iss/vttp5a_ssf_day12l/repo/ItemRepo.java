package sg.edu.nus.iss.vttp5a_ssf_day12l.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.vttp5a_ssf_day12l.model.Item;

@Repository
public class ItemRepo {
    private List<Item> itemList;

    public List<Item> getItems() {
        itemList = new ArrayList<>();

        Item itm = new Item("Apple",5);
        itemList.add(itm);
        new Item("Orange",5);
        itemList.add(itm);
        new Item("Banana",3);
        itemList.add(itm);
        new Item("Pear",2);
        itemList.add(itm);
        new Item("Orange",6);
        itemList.add(itm);
        
        return itemList;

    }

}
