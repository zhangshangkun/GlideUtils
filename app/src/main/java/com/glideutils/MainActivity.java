package com.glideutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.glideutils.utils.GlideUtils;

public class MainActivity extends AppCompatActivity {
    private ImageView imageview1,imageview2,imageview3,imageview4,imageview5,imageview6,imageview7,imageview8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        LoadImage();
    }
    private void initView() {
        imageview1=(ImageView) findViewById(R.id.imageview1);
        imageview2=(ImageView) findViewById(R.id.imageview2);
        imageview3=(ImageView) findViewById(R.id.imageview3);
        imageview4=(ImageView) findViewById(R.id.imageview4);
        imageview5=(ImageView) findViewById(R.id.imageview5);
        imageview6=(ImageView) findViewById(R.id.imageview6);
        imageview7=(ImageView) findViewById(R.id.imageview7);
        imageview8=(ImageView) findViewById(R.id.imageview8);
    }
    private void LoadImage() {
        // Glide.with(GlideActivity.this).load(R.drawable.fail_image).into(imageview1);
        Glide.with(MainActivity.this).load("http://i.imgur.com/DvpvklR.png").thumbnail(0.5f).into(imageview1);
        GlideUtils.getInstance().LoadContextRoundBitmap(MainActivity.this, "http://image3.uuu9.com/war3/dota2/UploadFiles/201303/_Z201303251348195461.jpg", imageview2,8);
        GlideUtils.getInstance().LoadContextCircleBitmap(MainActivity.this, "http://i.imgur.com/DvpvklR.png", imageview3);
        GlideUtils.getInstance().LoadContextBitmap(MainActivity.this, "http://ww1.sinaimg.cn/large/85cccab3gw1etdlhnnn1wg20dw05s4qp.jpg", imageview4, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, GlideUtils.LOAD_BITMAP);
        GlideUtils.getInstance().LoadContextBitmap(MainActivity.this,"http://www.zbjuran.com/uploads/allimg/160413/0920054963-0.gif",imageview5, R.mipmap.ic_launcher, R.mipmap.ic_launcher_round, GlideUtils.LOAD_GIF);
        GlideUtils.getInstance().LoadContextBlurBitmap(MainActivity.this,"http://i.imgur.com/DvpvklR.png", imageview6);
        GlideUtils.getInstance().LoadContextRotateBitmap(MainActivity.this, "http://i.imgur.com/DvpvklR.png", imageview8,90f);
    }
}
