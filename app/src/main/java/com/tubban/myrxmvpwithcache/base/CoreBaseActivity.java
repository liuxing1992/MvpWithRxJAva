package com.tubban.myrxmvpwithcache.base;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tubban.myrxmvpwithcache.rxutils.TUtil;

import butterknife.ButterKnife;

/**
 * Created by hpw on 16/10/12.
 */

public abstract class CoreBaseActivity<T extends CoreBasePresenter, E extends CoreBaseModel> extends AppCompatActivity {

    public T mPresenter;
    public E mModel;
    protected Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        mContext=this;

        mPresenter= TUtil.getT(this,0);
        mModel=TUtil.getT(this,1);
        if (this instanceof CoreBaseView)
            mPresenter.attachVM(this,mModel);

        initView(savedInstanceState);
    }

    public abstract int getLayoutId();

    public abstract void initView(Bundle savedInstanceState);


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
        if (mPresenter!=null)
            mPresenter.detachVM();
    }
}
