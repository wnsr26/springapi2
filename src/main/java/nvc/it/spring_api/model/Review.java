package nvc.it.spring_api.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @NoArgsConstructor
public class Review {
    private Integer star;
    private String comment;
    
}
