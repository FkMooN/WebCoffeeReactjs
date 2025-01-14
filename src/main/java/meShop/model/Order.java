package meShop.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "order2s")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "paypal_order_id")
    private String paypalOrderId;
    @Column(name = "paypal_order_status")
    private String paypalOrderStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPaypalOrderId() {
		return paypalOrderId;
	}
	public void setPaypalOrderId(String paypalOrderId) {
		this.paypalOrderId = paypalOrderId;
	}
	public String getPaypalOrderStatus() {
		return paypalOrderStatus;
	}
	public void setPaypalOrderStatus(String paypalOrderStatus) {
		this.paypalOrderStatus = paypalOrderStatus;
	}
    
}
