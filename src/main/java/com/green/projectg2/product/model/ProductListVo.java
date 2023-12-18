package com.green.projectg2.product.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(title="리스트 응답 vo", description="장바구니 리스트 응답 vo")
public class ProductListVo {
    private int productPk;

    private String categoryNm;

    private String ProductNm;

    private String memo;

    private String createdAt;

    private int buyingCheck;

    private String buyingDate;
}
