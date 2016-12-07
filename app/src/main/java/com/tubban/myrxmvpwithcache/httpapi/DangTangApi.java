package com.tubban.myrxmvpwithcache.httpapi;

import com.tubban.myrxmvpwithcache.bean.ProductBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by liu_yao on 2016/12/7.
 */

public interface DangTangApi {

    /**
     *
     * @path 将字段放入url替换
     * @queey 将字段拼接 gender=gender放入
     *
     * @return
     */

    @GET("v2/items?gender=1&generation=1&limit=20&offset=0")
    Observable<ProductBean> getProduct();

    @GET("v2/items")
    Observable<ProductBean> getProduct2(@Query("gender") int gender,@Query("generation") int generation
    ,@Query("limit") int limit ,@Query("offset") int offset);
}
