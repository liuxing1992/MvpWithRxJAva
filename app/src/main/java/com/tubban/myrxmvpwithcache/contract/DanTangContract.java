package com.tubban.myrxmvpwithcache.contract;

import com.tubban.myrxmvpwithcache.base.CoreBaseModel;
import com.tubban.myrxmvpwithcache.base.CoreBasePresenter;
import com.tubban.myrxmvpwithcache.base.CoreBaseView;
import com.tubban.myrxmvpwithcache.bean.ProductBean;

import rx.Observable;

/**
 * 将所有的presenter view model写在这里
 *
 * Created by liu_yao on 2016/12/7.
 */

public interface DanTangContract {

    //单糖单品
    interface  ProductModel extends CoreBaseModel{
        Observable<ProductBean> getProduct();
    }

    interface  ProductView extends CoreBaseView{
        void  setProduct(ProductBean bean);
    }

    abstract class ProductPresenter extends CoreBasePresenter<ProductModel,ProductView>{

       public abstract void getProduct();
    }

    //
}
