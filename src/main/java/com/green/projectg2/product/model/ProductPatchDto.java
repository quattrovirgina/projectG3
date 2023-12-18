package com.green.projectg2.product.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(title="장바구니에서 수정할 목록이 있을 경우", description="장바구니 수정 dto")
public class ProductPatchDto {
    private int productPk;

    private int userPk;

    private String productNm;

    private int categoryPk;

    private String memo;

}

// 모든 dto에 userpk를 넣어놓을것
// xml에서도 userpk를 추가할것