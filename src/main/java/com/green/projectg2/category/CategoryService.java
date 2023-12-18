package com.green.projectg2.category;

import com.green.projectg2.category.model.CategorySelVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service

public class CategoryService {
    private final CategoryMapper Cmapper;

    public List<CategorySelVo> selCategory() {
        return Cmapper.selCategory();
    }
}
