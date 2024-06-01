package uexcel.com.ltts.entity;

import jakarta.persistence.*;

@Entity
public class WalletTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(nullable = false)
    private String sourceAccount;
    @Column(nullable = false)
    private String transactionType;
    @Column(nullable = false)
    private String  sourceName;
    private String cCnumber;
    private String cCtype;
    private double amount;
    private String status;

    @ManyToOne
    private Wallet wallet;

}
