package com.pantofit.client.web;

import com.pantofit.client.ClientApplication;
import com.pantofit.client.dao.ClientRepository;
import com.pantofit.client.entities.Client;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class ClientController {
    private ClientRepository clientRepository;


            public ClientController(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
            }

    @RequestMapping(value = "/getClient", method = RequestMethod.POST)
    @ResponseBody
            public Client getCLient(@RequestBody Map<String , String> json) {
        Client c = clientRepository.findClientByEmail((json.get("mail")));
        if (c != null) {

            return c;

        } else {

            return null;
        }
    }
}
