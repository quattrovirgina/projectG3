package com.green.projectg2.category;

import com.green.projectg2.category.model.CategoryInsDto;
import com.green.projectg2.category.model.CategorySelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface CategoryMapper {

    int insCategory(CategoryInsDto dto);

    List<CategorySelVo> selCategory();

}
