
package com.proyecto.Proyecto.PApiKardex.service;

import com.proyecto.Proyecto.PApiKardex.dto.Transaction;
import com.proyecto.Proyecto.PApiKardex.dto.TransactionResponse;
import com.proyecto.Proyecto.PApiKardex.entity.Kardex;
import java.util.List;

public interface KardexService {
     public TransactionResponse placeKardex(Transaction transaction);
     public List<Kardex> findAll();
     public Kardex findById(Long id);
     

}
