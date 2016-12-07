package com.tubban.myrxmvpwithcache.model;

import com.tubban.myrxmvpwithcache.api.RxService;
import com.tubban.myrxmvpwithcache.bean.ProductBean;
import com.tubban.myrxmvpwithcache.contract.DanTangContract;
import com.tubban.myrxmvpwithcache.httpapi.DangTangApi;
import com.tubban.myrxmvpwithcache.rxutils.RxUtil;

import rx.Observable;

/**
 * Created by liu_yao on 2016/12/7.
 */

public class ProductModel implements DanTangContract.ProductModel {

    @Override
    public Observable<ProductBean> getProduct() {
        return RxService.createApi(DangTangApi.class).getProduct2(1,1,20,0).compose(RxUtil.<ProductBean>rxSchedulerHelper());
    }
}
