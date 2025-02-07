package com.example.demo.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.*;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Getter
@Setter
@Entity
@Table(name="excursions")
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id")
    private Long id;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "excursion_price")
    private BigDecimal excursion_price;

    @Column(name = "excursion_title")
    private String excursion_title;

    @Column(name = "image_url")
    private String image_URL;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

//    @Column(name = "vacation_id")
//    private Long vacation_id;

    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "excursion")
    //    private Set<CartItem> cartitems;

    @ManyToMany(mappedBy = "excursions")
    private Set<CartItem> cartItems;

    public Excursion() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Excursion excursion = (Excursion) o;

        return Objects.equals(id, excursion.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }




}
