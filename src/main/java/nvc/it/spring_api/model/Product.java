package nvc.it.spring_api.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("products")
@Getter @Setter @NoArgsConstructor
public class Product {
    @Id
    private String _id;
    private String name;
    private String _price;
    private String unit_in_stock;

    private List<Review> review = new ArrayList<Review>();

    @CreatedDate
    private Date createdAt;

    @LastModifiedBy
    private Date updateAt;
    
}
