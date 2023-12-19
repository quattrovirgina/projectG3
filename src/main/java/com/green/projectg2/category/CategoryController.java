package com.green.projectg2.category;

import com.green.projectg2.category.model.CategoryInsDto;
import com.green.projectg2.category.model.CategorySelVo;
import com.green.projectg2.product.common.ResVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/category")
public class CategoryController {
    private final CategoryService Cservice;

    @GetMapping
    public List<CategorySelVo> categorySel() {
        return Cservice.selCategory();
    }

    @PostMapping
    public ResVo InsCategory(CategoryInsDto dto) {
        return Cservice.CategoryIns(dto);
    }



}
