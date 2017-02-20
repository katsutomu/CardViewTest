package com.example.katsu.cardviewtest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.katsu.cardviewtest.databinding.TextLayoutBinding;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    String[] datas = {
            "口コミ",
            "ぶろぐ",
            "口コミ",
            "ぶろぐ",
            "口コミ",
            "ぶろぐ",
            "口コミ",
            "ぶろぐ",
            "口コミ",
            "ぶろぐ",
            "口コミ",
            "ぶろぐ",
            "口コミ",
            "ぶろぐ",
    };
    LayoutInflater inflater = null;
    public RecyclerAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType %2 == 0) {
            return new WordOfMouthViewHolder(inflater.inflate(R.layout.text_layout, parent, false));
        }
        return new BlogViewHolder(inflater.inflate(R.layout.text_layout2, parent, false));
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    @Override
    public int getItemCount() {
        return datas.length;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (holder.getItemViewType() == 0) {
            WordOfMouthViewHolder wordOfMouthViewHolder = (WordOfMouthViewHolder) holder;
            WordOfMouth wordOfMouth = new WordOfMouth();
            wordOfMouth.title = "hieee" + position;
            wordOfMouthViewHolder.setData(wordOfMouth);
        }
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
    class WordOfMouthViewHolder extends RecyclerAdapter.ViewHolder {
        TextLayoutBinding binding;
        // ヘッダのViewHolder
        public WordOfMouthViewHolder(View itemView) {
            super(itemView);
            binding = TextLayoutBinding.bind(itemView);
        }

        public void setData(WordOfMouth wordOfMouth) {
            binding.setWordOfMouth(wordOfMouth);
        }
    }

    class BlogViewHolder extends RecyclerAdapter.ViewHolder {
        // フッタのViewHolder
        public BlogViewHolder(View itemView) {
            super(itemView);
        }
    }
}
