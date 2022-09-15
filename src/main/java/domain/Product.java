package domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class Product implements Serializable {
    private static final long serialVersionUID = 2L;

    @Id
    @NotNull
    private String id;

    @NotNull
    private String name;

    private String description;

    private String manufacturerName;

    @NotNull
    @Min(value = 0, message = "Price cannot be less than 0")
    private Double price;

    private String detailInfo;

    private String imageUrl;

    @NotNull
    @Min(value = 0, message = "Quantity cannot be less more 0")
    private Integer quantity;
}
