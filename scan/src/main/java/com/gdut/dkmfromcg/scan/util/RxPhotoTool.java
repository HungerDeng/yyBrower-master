package com.gdut.dkmfromcg.scan.util;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by dkmFromCG on 2018/1/28.
 * function:
 */

public class RxPhotoTool {

    public static final int GET_IMAGE_FROM_PHONE = 5002;

    public static void openLocalImage(final Activity activity) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        activity.startActivityForResult(intent, GET_IMAGE_FROM_PHONE);
    }
}
