package com.senon.mvpretrofitrx.base;

import io.reactivex.ObservableTransformer;

/**
 * 作者：senon on 2017/12/27 10:10
 * 邮箱：a1083911695@163.com
 */

public interface BaseView {
    <T> ObservableTransformer<T, T> bindLifecycle();
}
