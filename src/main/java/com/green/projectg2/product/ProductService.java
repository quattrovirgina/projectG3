package com.green.projectg2.product;

import com.green.projectg2.product.common.ResVo;
import com.green.projectg2.product.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service

public class ProductService {
    private final ProductMapper pMapper;

    // 장바구니에 구매할목록 추가
    public ResVo PostIt(ProductInsDto dto) {
        int result = pMapper.insProduct(dto);

        if(result == 0) {
            return new ResVo(0);
        }
        return new ResVo(1);
    }

    // 구매할 상품목록 조회
    public List<ProductListVo> getP(ProductListDto dto) {
        return pMapper.selProduct(dto);
    }


    // 수정할 상품목록
    public ResVo putP(ProductPatchDto dto) {

        int result = pMapper.updProduct(dto);

        if(result == 1) {
            return new ResVo(1);
        }
        return new ResVo(0);
    }

    // 삭제할 상품목록
    public ResVo delP(ProductDelDto dto) {

        int result = pMapper.delProduct(dto);
        int result2 = pMapper.deletedProduct(dto);

       if(result == 0 && result2 == 0) {
           return new ResVo(0);
       }
        return new ResVo(1);
    }

    public ResVo comP(ProductCompleteDto dto) {
        int result = pMapper.CompleteProduct(dto);

        if(result == 0) {
            return new ResVo(0);
        }
        return new ResVo(1);
    }


}
