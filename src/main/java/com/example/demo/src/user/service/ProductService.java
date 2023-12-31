package com.example.demo.src.user.service;


import com.example.demo.common.BaseException;
import com.example.demo.src.user.dao.ProductDao;
import com.example.demo.src.user.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.demo.common.BaseResponseStatus.DATABASE_ERROR;

@Service
@RequiredArgsConstructor //생성자
public class ProductService {

    private final ProductDao productDao;

    //GET
    public GetProductRes getProductDeatilById(int productId) throws BaseException{
        try{
            GetProductRes getProductRes = productDao.getProductDeatilById(productId);
            return getProductRes;
        }catch (Exception exception){
            throw new BaseException(DATABASE_ERROR);
        }
    }

//    //POST
//    public PostAdminProductRes insertProductDetail(PostAdminProductRes postAdminProductRes) throws BaseException {
//        try{
//            PostAdminProductRes insertedProductDetail = productDao.insertProductDetail(postAdminProductRes);
//            return new PostAdminProductRes(productId);
//        } catch (Exception exception) {
//            throw new BaseException(DATABASE_ERROR);
//        }
//    }
}
