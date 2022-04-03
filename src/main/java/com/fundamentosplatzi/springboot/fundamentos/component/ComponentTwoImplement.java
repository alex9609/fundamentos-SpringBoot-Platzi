package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement implements ComponentDependency{

    public void saludar() {
        System.out.println("Hola mundo desde mi componente dos");
    }
}
