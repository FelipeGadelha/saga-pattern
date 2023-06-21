package br.com.felipe.gadelha.sale.domain.model;

import java.math.BigDecimal;

public class Order {
    private Integer id;
    private Integer productId;
    private Integer userId;
    private BigDecimal price;
    private OrderStatus status;
    private Integer quantity;

    @Deprecated protected Order() {}
    public Order(Integer id, Integer productId, Integer userId, BigDecimal price, OrderStatus status, Integer quantity) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.price = price;
        this.status = status;
        this.quantity = quantity;
    }

    public Integer getId() { return id; }
    public Integer getProductId() { return productId; }
    public Integer getUserId() { return userId; }
    public BigDecimal getPrice() { return price; }
    public OrderStatus getStatus() { return status; }
    public Integer getQuantity() { return quantity; }
}