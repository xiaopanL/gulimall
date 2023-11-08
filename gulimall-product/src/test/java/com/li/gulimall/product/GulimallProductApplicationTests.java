package com.li.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.li.gulimall.product.entity.BrandEntity;
import com.li.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@RunWith(Runner.class)
@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    private BrandService  brandService;
    @Test
   public void brandService(){
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("小米");
//      brandService.save(brandEntity);
//        System.out.println("保存成功");

      /*  BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("xiaomi");
        brandEntity.setDescript("小米");
        brandEntity.setBrandId(1L);
        brandService.updateById(brandEntity);*/

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1l));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
