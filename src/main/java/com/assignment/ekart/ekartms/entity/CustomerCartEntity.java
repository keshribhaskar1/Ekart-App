package com.assignment.ekart.ekartms.entity;

import com.assignment.ekart.ekartms.model.CartProduct;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@Builder
@Table(name = "CustomerCart")
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCartEntity {
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer cartId;

    @Column(name = "customer_email_id")
    private String customerEmailId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="cart_products")
    private Set<CartProductEntity> cartProducts;
}
