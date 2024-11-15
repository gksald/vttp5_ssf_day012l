package sg.edu.nus.iss.vttp5a_ssf_day12l.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.vttp5a_ssf_day12l.model.Item;
import sg.edu.nus.iss.vttp5a_ssf_day12l.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
    
    @Autowired
    ItemService itemService;

    @GetMapping("")
    public String cartItems(Model model) {
        List<Item> items = itemService.getItems();
        model.addAttribute("items", items);
        return "cartlist";
    }
}
