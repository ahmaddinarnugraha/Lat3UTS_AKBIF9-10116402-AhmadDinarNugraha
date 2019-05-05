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
import android.widget.TextView;

import com.example.lat3uts_akbif9_10116402_ahmaddinarnugraha.DailyActivityModel;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.myViewHolder> {

    Context mContext;
    List<DailyActivityModel> mDataDaily;
    List<GalleryActivityModel> mDataGallery;

    public RecyclerViewAdapter(Context mContext, List<DailyActivityModel> mDataDaily) {
        this.mContext = mContext;
        this.mDataDaily = mDataDaily;
        this.mDataGallery = mDataGallery;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_daily, viewGroup,false);
        myViewHolder vHolder = new myViewHolder(v);

        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder myViewHolder, int i) {

        myViewHolder.tv_kegiatan.setText(mDataDaily.get(i).getKegiatan());
        myViewHolder.img_kegiatan.setImageResource(mDataDaily.get(i).getGbr());
    }

    @Override
    public int getItemCount() {
        return mDataDaily.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_kegiatan;
        private ImageView img_kegiatan;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            img_kegiatan = (ImageView) itemView.findViewById(R.id.gbr);
        tv_kegiatan = (TextView) itemView.findViewById(R.id.tv_kegiatan);
        }
    }


}
