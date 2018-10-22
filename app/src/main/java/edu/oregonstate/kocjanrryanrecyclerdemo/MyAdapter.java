package edu.oregonstate.kocjanrryanrecyclerdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Item> mItems;
    private Context mContext;

    public MyAdapter(List<Item> items, Context context) {
        mItems = items;
        mContext = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mTextViewHeading;
        private TextView mTextViewDescription;

        public ViewHolder(View itemView) {
            super(itemView);
            mTextViewHeading = (TextView) itemView.findViewById(R.id.textViewHeading);
            mTextViewDescription = (TextView) itemView.findViewById(R.id.textViewDescription);
        }
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        return new ViewHolder(vh);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Item item = mItems.get(position);

        holder.mTextViewHeading.setText(item.getHeader());
        holder.mTextViewHeading.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
