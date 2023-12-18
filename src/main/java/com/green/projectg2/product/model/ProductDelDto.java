package com.green.projectg2.product.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Data
@Schema(title="장바구니 삭제 DTo", description="장바구니 삭제 dto(한번에 여러개 처리할것)")

public class ProductDelDto {
    private int ProductPk;
    private int userPk;
    // 리스트별로 삭제할걸 선택하여 삭제할것
}
