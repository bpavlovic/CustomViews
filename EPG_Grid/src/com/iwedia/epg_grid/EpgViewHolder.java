package com.iwedia.epg_grid;

import android.view.View;

public class EpgViewHolder {
    private View mChannelIndicator;
    private HorizListView mHList;
    private int mPosition = 0;

    public EpgViewHolder(View convertView) {
        mChannelIndicator = convertView
                .findViewById(R.id.epg_channel_indicator);
        mHList = (HorizListView) convertView.findViewById(R.id.epg_hlist);
    }

    public View getChannelIndicator() {
        return mChannelIndicator;
    }

    public HorizListView getHList() {
        return mHList;
    }

    public int getPosition() {
        return mPosition;
    }

    public void setPosition(int mPosition) {
        this.mPosition = mPosition;
    }
}
