package com.example.myapplication9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static Handler handler;
    private RecyclerView rv_song;

    private int[] images={R.drawable.daoxiang,R.drawable.ykzzldx,R.drawable.hktk,R.drawable.seeyouagain,R.drawable.thegreatestshow};
    private String[] names={"稻香","夜空中最亮的星","海阔天空","See you again","The Greatest Show"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_song = findViewById(R.id.recycle_view);
        //设置布局管理器
        rv_song.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        //设置适配器
        rv_song.setAdapter(new MyAdapter());
        //设置itemView间的间隔
        rv_song.addItemDecoration(new MyDecoration());

    }


    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
        @NonNull
        @Override
        //将itemlayout布局转成转成视图，给MyHolder。
        public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = View.inflate(getApplicationContext(),R.layout.itemlayout,null);//将itemlayout布局转成转成视图
            MyHolder myHolder = new MyHolder(view);//将得到的视图给MyHolder。
            return myHolder;
        }

        @Override
        //制定每个holder里的每个控件的具体内容；
        public void onBindViewHolder(@NonNull MyHolder holder, int position) {
            holder.miv_image.setBackgroundResource(images[position]);
            holder.mtv_name.setText(names[position]);
            //给每个itemView设置点击事件，跳转到相应的界面。
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mintent = null;
                    switch (position){
                        case 0:{
                            mintent = new Intent(MainActivity.this,song1.class);
                            break;
                        }
                        case 1:{
                            mintent = new Intent(MainActivity.this,song2.class);
                            break;
                        }
                        case 2:{
                            mintent = new Intent(MainActivity.this,song3.class);
                            break;
                        }
                        case 3:{
                            mintent = new Intent(MainActivity.this,song4.class);
                            break;
                        }
                        case 4:{
                            mintent = new Intent(MainActivity.this,song5.class);
                            break;
                        }
                    }
                    startActivity(mintent);
                }
            });

        }

        @Override
        //给出item的数量
        public int getItemCount() {
            return names.length;
        }
        //声明MyHolder里面都有哪些控件，并和itemlayout里面的控件一一对应
        public class MyHolder extends RecyclerView.ViewHolder {
            ImageView miv_image;
            TextView mtv_name,mtv_info;
            public MyHolder(@NonNull View itemView) {
                super(itemView);
                miv_image = itemView.findViewById(R.id.iv_image);
                mtv_name = itemView.findViewById(R.id.tv_name);
            }
        }
    }
    //自定义itemView的间隔
    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
//            outRect.set(0,0,0,20);
            outRect.set(0,10,0,10);
        }
    }
}