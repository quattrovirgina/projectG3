package com.green.projectg2.product.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name="구매확정 dto")
public class ProductCompleteDto {
    private int productPk;
}
