package com.kisslove.childhoodmemories.image_utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;

import com.kisslove.childhoodmemories.R;

/**
 * Created by ivan on 17.10.17.
 */
public class CornerBitmap {
    public static RoundedBitmapDrawable getCorneredBitmap(int resource, Context context){
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.child);
        RoundedBitmapDrawable drawable = RoundedBitmapDrawableFactory.create(context.getResources(), bitmap);
        drawable.setCornerRadius(Math.max(bitmap.getWidth(), bitmap.getHeight())/2.0f);
        return drawable;
    }
}
