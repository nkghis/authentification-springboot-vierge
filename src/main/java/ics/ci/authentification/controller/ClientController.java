package ics.ci.authentification.controller;

import ics.ci.authentification.entity.Client;
import ics.ci.authentification.repository.ClientRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(value = "/admin/clients")
    public String index(Model model){



        List<Client> clients = clientRepository.findAll();
        model.addAttribute("listClients", clients);
        model.addAttribute("title", "Client - Liste");
        return "client/index";
    }

    @RequestMapping(value = "/admin/clients/new", method = RequestMethod.GET)
    public String newClient(Model model){

        model.addAttribute("monclient",new Client());
        model.addAttribute("title", "Client - Nouveau");
        return "client/new";

    }


    @RequestMapping(value = "/admin/clients/save", method = RequestMethod.POST)
    public String saveClient(@Valid Client client, Errors errors, Model model, RedirectAttributes redirectAttributes){

        if (errors.hasErrors()){
            System.out.println("error YES");
            model.addAttribute("monclient", new Client());
            //model.addAttribute("errors", errors);
            return "client/new";
        }
        clientRepository.save(client);
        redirectAttributes.addFlashAttribute("messagesucces","Opération éffectée avec succès");
        return "redirect:/admin/clients";
    }



    @RequestMapping(value = "/admin/clients/edit/{id}", method = RequestMethod.GET)
    public String editClient(@PathVariable Long id, Model model){

        Client c = clientRepository.getOne(id);

        model.addAttribute("client", c);
        model.addAttribute("title", "Client - Edition");
        return "client/edit";
    }

    @RequestMapping(value = "/admin/clients/delete/{id}", method = RequestMethod.GET)
    public String deleteClient(@PathVariable Long id){

        clientRepository.deleteById(id);
        return "redirect:/admin/clients";
    }
}
