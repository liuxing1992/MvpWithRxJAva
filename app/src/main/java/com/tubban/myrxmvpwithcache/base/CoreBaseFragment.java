package com.tubban.myrxmvpwithcache.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tubban.myrxmvpwithcache.rxutils.TUtil;

import butterknife.ButterKnife;

/**
 * Created by hpw on 16/10/27.
 */

//1.mvp模式
//public class SampleFragment extends BaseFragment<NewsChanelPresenter, NewsChannelModel>implements NewsChannelContract.View {
//    @Override
//    public int getLayoutId() {
//        return R.layout.activity_news_channel;
//    }
//
//    @Override
//    public void initPresenter() {
//        mPresenter.setVM(this, mModel);
//    }
//
//    @Override
//    public void initView() {
//    }
//}
//2.普通模式
//public class SampleFragment extends BaseFragment {
//    @Override
//    public int getLayoutResource() {
//        return R.layout.activity_news_channel;
//    }
//
//    @Override
//    public void initPresenter() {
//    }
//
//    @Override
//    public void initView() {
//    }
//}

public abstract class CoreBaseFragment<T extends CoreBasePresenter, E extends CoreBaseModel> extends Fragment {

    public T mPresenter;
    public E mModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return  inflater.inflate(getLayoutId(),container,false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        mPresenter = TUtil.getT(this, 0);
        mModel = TUtil.getT(this, 1);
        ButterKnife.bind(this,view);
        initUI(view,savedInstanceState);
        if (this instanceof CoreBaseView) mPresenter.attachVM(this, mModel);
        super.onViewCreated(view,savedInstanceState);
    }

    public abstract int getLayoutId();
    /**
     * 初始化控件
     */
    public abstract void initUI(View view, @Nullable Bundle savedInstanceState);


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) mPresenter.detachVM();
    }
}
