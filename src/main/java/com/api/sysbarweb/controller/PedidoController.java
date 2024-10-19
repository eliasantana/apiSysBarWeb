package com.api.sysbarweb.controller;

import com.api.sysbarweb.dto.PedidoDto;
import com.api.sysbarweb.services.PedidoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    PedidoServices services;


    @PostMapping("/adicionar/{idemplogada}/{idfuncionario}/{idemesa}")
    public ResponseEntity<PedidoDto> adicionar(@PathVariable  Long idemplogada,
                                               @PathVariable  Long idfuncionario,
                                               @PathVariable  Long idemesa,
                                               UriComponentsBuilder builder
    ){
       return services.adicionar(idemplogada, idfuncionario, idemesa, builder);
    }
}
