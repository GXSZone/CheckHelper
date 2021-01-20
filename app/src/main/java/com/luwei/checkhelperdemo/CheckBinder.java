package com.luwei.checkhelperdemo;

import androidx.annotation.NonNull;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gsxzone.checkhelper.CheckHelper;
import com.luwei.recyclerview.adapter.extension.LwItemBinder;
import com.luwei.recyclerview.adapter.extension.LwViewHolder;

/**
 * Created by Mr_Zeng
 *
 * @date 2019/1/5
 */
public class CheckBinder extends LwItemBinder<String> {

    CheckHelper mHelper;

    public CheckBinder(@NonNull CheckHelper helper){
        mHelper = helper;
    }


    @Override
    protected View getView(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        return inflater.inflate(R.layout.item_check, parent, false);
    }

    @Override
    protected void onBind(@NonNull LwViewHolder holder, @NonNull String item) {
        holder.setText(R.id.tv_content, item);
        mHelper.bind(item, holder, holder.itemView);
    }


}
