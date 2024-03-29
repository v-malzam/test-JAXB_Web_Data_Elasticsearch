package ru.council.test.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@XmlAccessorType(XmlAccessType.FIELD)
public class DeliveryService {

    @XmlElementWrapper(name = "categories")
    private List<Category> category = new ArrayList<>();

    @XmlElementWrapper(name = "products")
    private List<Product> product = new ArrayList<>();

}
