package com.gaoyj.paymentdemo.controller;

import com.gaoyj.paymentdemo.entity.Product;
import com.gaoyj.paymentdemo.service.ProductService;
import com.gaoyj.paymentdemo.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@CrossOrigin
@Api(tags="商品管理")
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @ApiOperation("测试接口")
    @GetMapping("/test")
    public R test() {
        return R.ok().data("message","test hello").data("now",new Date());
    }

    @GetMapping("/list")
    public  R list() {
        List<Product> list = productService.list();
        return R.ok().data("list",list);
    }
}
