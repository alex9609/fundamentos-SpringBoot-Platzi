package com.fundamentosplatzi.springboot.fundamentos.bean;

public class BeanConsultaCrudImpl implements  BeanConsultaCrud{
    @Override
    public void buscar() {
        System.out.println("Estoy haciendo una consulta en la base de datos");
    }
}
