//* Tanggal Pengerjaan : 02 - Mei - 2019
//* NIM                : 10116402
//* Nama               : Ahmad Dinar Nugraha
//* Kelas              : AKBIF-9

package com.example.lat3uts_akbif9_10116402_ahmaddinarnugraha;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class RecylerViewAdapterG extends RecyclerView.Adapter<RecylerViewAdapterG.myViewHolder> {

    private Context mContext;
    private List<GalleryActivityModel> mDataGallery;

    public RecylerViewAdapterG(Context mContext, List<GalleryActivityModel> mDataGallery) {
        this.mContext = mContext;
        this.mDataGallery = mDataGallery;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        v = mInflater.inflate(R.layout.cardview_item_gallery,viewGroup,false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {

        myViewHolder.img_photo.setImageResource(mDataGallery.get(i).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mDataGallery.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {

        ImageView img_photo;


        public myViewHolder(View view){
            super(view);

            img_photo = (ImageView) view.findViewById(R.id.img_photo);
        }
    }
}
