package com.gdut.dkmfromcg.scan;

import com.google.zxing.Result;

/**
 * Created by dkmFromCG on 2018/1/28.
 * function:
 */

public interface OnRxScanerListener {
    void onSuccess(String type, Result result);

    void onFail(String type, String message);
}
