package com.jaug.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String title;

    private String description;

    private int mrpPrice;

    private int sellingPrice;

    private int discountPercent;

    private int quantity;

    private String colour;

    @ElementCollection
    private List<String> images = new ArrayList<>();

    private int numRatings;
    @ManyToOne
    private Category category;

    private  Seller seller;

    private LocalDateTime createdAt;

//   @ElementCollection
    private String Sizes;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Review> reviews = new ArrayList<>();

}
