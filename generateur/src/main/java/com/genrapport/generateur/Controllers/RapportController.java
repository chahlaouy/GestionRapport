package com.genrapport.generateur.Controllers;

import java.util.ArrayList;
import java.util.List;

import com.genrapport.generateur.Model.Rapport;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
public class RapportController {

    private List<Rapport> rapports;

    public RapportController() {
        rapports = new ArrayList<Rapport>();
        rapports.add(new Rapport(1, "rapport1"));
        rapports.add(new Rapport(2, "rapport2"));

    }

    public List<Rapport> getRapports() {
        return rapports;
    }

    public void setRapports(List<Rapport> rapports) {
        this.rapports = rapports;
    }

    @GetMapping("/")
    public List<Rapport> list(){
        return rapports;
    }


    // @GetMapping("/{id}")
    // public Rapport rapport(@PathVariable Integer id){
        
    //     return rapports.stream().filter(f -> id.equals(f.getId())).findAny().orElse(null);
    // }
}