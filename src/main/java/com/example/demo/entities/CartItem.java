package com.example.demo.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.*;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Getter
@Setter
@Entity
@Table(name="cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private Long id;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    public CartItem() {
    }

//    @Column(name = "cart_id")   // This was commented out before 1/29/25
//    private Long cart_id;       // This was commented out before 1/29/25
//
//    @Column(name = "vacation_id")   // This was commented out before 1/29/25
//    private Long vacation_id;       // This was commented out before 1/29/25

    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cartitem")
//    private Set<Excursion> excursions = new HashSet<>();


    @ManyToMany
    @JoinTable(
            name = "excursion_cartitem",
            joinColumns = @JoinColumn(name = "cart_item_id"),
            inverseJoinColumns = @JoinColumn(name = "excursion_id")
    )
    private Set<Excursion> excursions;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartItem cartItem = (CartItem) o;

        return Objects.equals(id, cartItem.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }





}
