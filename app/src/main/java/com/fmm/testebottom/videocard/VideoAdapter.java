package com.fmm.testebottom.videocard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.fmm.testebottom.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class VideoAdapter extends ArrayAdapter<Video> {
    private final Context context;
    private final ArrayList<Video> cards;

    public VideoAdapter(Context context, ArrayList<Video> cards) {
        super(context, R.layout.video_card, cards);
        this.context = context;
        this.cards = cards;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.video_card, parent, false);

        ImageView thumbnail = (ImageView) rowView.findViewById(R.id.thumbnail);
        TextView title = (TextView) rowView.findViewById(R.id.title);
        TextView description = (TextView) rowView.findViewById(R.id.description);

        thumbnail.setImageResource(cards.get(position).getThumbnail());
        title.setText(cards.get(position).getTitle());
        description.setText(cards.get(position).getDescription());

        return rowView;
    }
}
