package com.Nimish.simpleWebApp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import lombok.Data;



@Data
@Entity
@NoArgsConstructor
public class Product
{
    @Id
    private int prodId;
    private String prodName;
    private int price;

}
