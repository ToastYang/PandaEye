package com.pandaq.pandaeye.ui.ImplView;

import com.pandaq.pandaeye.model.neteasynews.NewsContent;

/**
 * Created by PandaQ on 2016/10/10.
 * email : 767807368@qq.com
 */

public interface ITopNewsInfoActivity {
    void showProgressBar();

    void hideProgressBar();

    void loadTopNewsInfo(String newsId);

    void loadFail(String errmsg);

    void loadSuccess(NewsContent topNewsContent);
}
