package com.niepengfei.langjitianya.backend.controller.item;

import com.niepengfei.langjitianya.backend.remote.item.ItemRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jack
 */
@Controller
public class ItemViewController {



    @GetMapping(value = {"/index.htm","/"})
    public String index(){
      return "index";
    }
}
