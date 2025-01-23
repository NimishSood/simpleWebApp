package com.Nimish.simpleWebApp.model;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@AllArgsConstructor
public class Product
{
    private int prodId;
    private String prodName;
    private int price;

}
