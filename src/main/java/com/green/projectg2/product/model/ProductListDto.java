package com.green.projectg2.product.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(title="리스트 응답 dto", description = "장바구니 리스트 응답 dto")
public class ProductListDto {
    private int userPk;

    private int isList;

    private String createdAt;
}
