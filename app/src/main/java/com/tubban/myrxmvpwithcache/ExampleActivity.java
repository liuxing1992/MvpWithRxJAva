package com.tubban.myrxmvpwithcache;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tubban.myrxmvpwithcache.adapter.MyAdapter;
import com.tubban.myrxmvpwithcache.base.CoreBaseActivity;
import com.tubban.myrxmvpwithcache.bean.ProductBean;
import com.tubban.myrxmvpwithcache.contract.DanTangContract;
import com.tubban.myrxmvpwithcache.model.ProductModel;
import com.tubban.myrxmvpwithcache.presenter.product.ProductPresenter;

import butterknife.Bind;

public class ExampleActivity extends CoreBaseActivity<ProductPresenter,ProductModel> implements DanTangContract.ProductView{

    @Bind(R.id.recycle)
    RecyclerView mRecycle;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public int getLayoutId() {
        return R.layout.activity_example;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        RecyclerView.LayoutManager manager = new GridLayoutManager(this,2);
        mRecycle.setLayoutManager(manager);
        mPresenter.getProduct();
    }


    @Override
    public void setProduct(ProductBean bean) {
        System.out.println("----"+bean.getData().getItems().size());
    }
}
