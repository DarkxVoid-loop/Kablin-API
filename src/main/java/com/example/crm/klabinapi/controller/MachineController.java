package com.example.crm.kablinapi.controller;

@RestController
@requestMapping("/MachineData/reel-measure")
public class MachineController{
    
    @PostMapping
    public MachineSave(){

        return "Sucessful Request"

    }

}