package com.tubban.myrxmvpwithcache.presenter.product;

import com.tubban.myrxmvpwithcache.bean.ProductBean;
import com.tubban.myrxmvpwithcache.contract.DanTangContract;

import rx.functions.Action1;

/**
 * Created by liu_yao on 2016/12/7.
 */

public class ProductPresenter extends DanTangContract.ProductPresenter {

    @Override
    public void getProduct() {
        System.out.println("----start");
        mRxManager.add(mModel.getProduct().subscribe(new Action1<ProductBean>() {
            @Override
            public void call(ProductBean bean) {
                System.out.println("----success");
                mView.setProduct(bean);
            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {
                System.out.println("----error");
            }
        }));
    }

    @Override
    public void onStart() {

    }
}
