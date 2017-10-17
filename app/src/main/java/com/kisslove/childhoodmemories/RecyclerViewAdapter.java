package com.kisslove.childhoodmemories;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kisslove.childhoodmemories.model.Memory;
import com.kisslove.childhoodmemories.model.MemoryLab;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by ivan on 17.10.17.
 */

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MemoryHolder> {

    MemoryLab memoryLab;
    Context context;

    public RecyclerViewAdapter(MemoryLab memoryLab, Context context) {
        this.memoryLab = memoryLab;
        this.context = context;
    }

    @Override
    public MemoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.memory_card_view,parent,false);
        MemoryHolder holder = new MemoryHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MemoryHolder holder, int position) {
        Memory memory = memoryLab.getMemoryList().get(position);
        holder.memoryDate.setText(memory.getMemoryDate().toString());
        holder.memoryTitle.setText(memory.getTitle());
        holder.memoryImage.setImageResource(R.drawable.child);
    }

    @Override
    public int getItemCount() {
        return memoryLab.getMemoryList().size();
    }

    public class MemoryHolder extends RecyclerView.ViewHolder{

        CircleImageView memoryImage;
        TextView memoryTitle;
        TextView memoryDate;

        public MemoryHolder(View itemView) {
            super(itemView);
            memoryImage = itemView.findViewById(R.id.memory_photo_imgv);
            memoryTitle = itemView.findViewById(R.id.memory_title_txtv);
            memoryDate = itemView.findViewById(R.id.memory_date_txtv);
        }
    }
}
