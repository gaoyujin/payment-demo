package com.gaoyj.paymentdemo.service.impl;

import com.gaoyj.paymentdemo.entity.Product;
import com.gaoyj.paymentdemo.mapper.ProductMapper;
import com.gaoyj.paymentdemo.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
