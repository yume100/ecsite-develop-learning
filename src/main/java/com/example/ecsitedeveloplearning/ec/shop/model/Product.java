package com.example.ecsitedeveloplearning.ec.shop.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "category_id")
    private String categoryId;
    
    @Column(name = "price")
    private Integer price;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "image_path")
    private String imagePath;
    
   @Column(name = "created", nullable = false)
    private Date created;
    
   @Column(name = "updated", nullable = true)
    private Date updated;

}
