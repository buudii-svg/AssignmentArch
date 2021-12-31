package com.example.demo.Controllers;

import java.util.ArrayList;

import com.example.demo.observers.FavouriteArea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class FavAreaController {
    ArrayList<FavouriteArea> favAreas = new ArrayList<>();

    @PostMapping("/favArea/add")
    public boolean addFavArea(@RequestBody FavouriteArea fArea)
    {
        for(FavouriteArea f : favAreas)
        {
            if(f.getName() == fArea.getName())
            {
                return false;
            }
        }
        favAreas.add(fArea);
        return true;
    }

    // @GetMapping("/favArea/{driverId}")
    // public ArrayList<FavouriteArea> listAllFavAreas(@PathVariable int driverId)
    // {
    //     for(FavouriteArea fArea : favAreas)
    //     {
            
    //     }
    // }

    
}
