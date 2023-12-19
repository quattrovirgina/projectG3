package com.green.projectg2.product;

import com.green.projectg2.product.common.ResVo;
import com.green.projectg2.product.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/product")

public class ProductController {
    private final ProductService Pservice;

    @PostMapping
    public ResVo Postit(@RequestBody ProductInsDto dto) {
        return Pservice.PostIt(dto);
    }

    @GetMapping
    public List<ProductListVo> Getit(ProductListDto dto) {
        return Pservice.getP(dto);
    }

    @PutMapping
    public ResVo PutIt(@RequestBody ProductPatchDto dto) {
        return Pservice.putP(dto);
    }

    @DeleteMapping
    public ResVo DeleteIt(ProductDelDto dto) {
        return Pservice.delP(dto);
    }

    @PatchMapping
    public ResVo CompleteBuy(ProductCompleteDto dto) {
        return Pservice.comP(dto);
    }
}

// 예외찾을때는 swagger에서 하나씩 입력함으로써 찾아볼것
