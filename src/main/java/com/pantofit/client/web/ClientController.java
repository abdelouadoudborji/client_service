package com.pantofit.client.web;

import com.pantofit.client.ClientApplication;
import com.pantofit.client.dao.ClientRepository;
import com.pantofit.client.entities.Client;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class ClientController {
    private ClientRepository clientRepository;


            public ClientController(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
            }
    
    @GetMapping(path="/getClientCode/{code}")
    public  Long getAbonnement(@PathVariable(name="code") String code){
    Client client=this.clientRepository.findClientByCode(code);
    if(client!=null){
        System.out.println(client.getId());
        return client.getId();
    }
    else{
        return 0L;

    }


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
