
package com.proyecto.Proyecto.PApiKardex.controller;

import com.proyecto.Proyecto.PApiKardex.dto.Transaction;
import com.proyecto.Proyecto.PApiKardex.dto.TransactionResponse;
import com.proyecto.Proyecto.PApiKardex.entity.Kardex;
import com.proyecto.Proyecto.PApiKardex.service.KardexService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/kardex")
public class KardexController {
    
    @Autowired
    private KardexService kardexService;
    
    @PostMapping("/placeKardex")
    public TransactionResponse placeOrder(@RequestBody Transaction transaction){
        return kardexService.placeKardex(transaction);
        
    }
    
    @GetMapping("/findById")
    public Kardex findById(@PathVariable Long id){
        return kardexService.findById(id);
        
    }
    
    @GetMapping("/findByAll")
    public List<Kardex> findAll(){
        return (List<Kardex>)kardexService.findAll();
    }
    
    
}
