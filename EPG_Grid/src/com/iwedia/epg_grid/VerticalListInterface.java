package com.iwedia.epg_grid;

import com.iwedia.epg_grid.HorizListView.OnScrollHappenedListener;

import it.sephiroth.android.library.widget.AdapterView.OnItemClickListener;
import it.sephiroth.android.library.widget.AdapterView.OnItemSelectedListener;

import java.util.Calendar;

/**
 * Interface that vertical list adapter should implement
 * 
 * @author Branimir Pavlovic
 */
public interface VerticalListInterface extends EpgListInterface {

    public void setOnScrollHappenedListener(
            OnScrollHappenedListener mOnScrollHappenedListener);

    public OnScrollHappenedListener getOnScrollHappenedListener();

    public void setListSelector(int selector);

    public void setItemsHeight(int height);

    /**
     * This method must be called for listeners of horizontal list to work
     * 
     * @param onItemSelectedListener
     * @param onItemClickListener
     */
    public void setHorizListListeners(
            OnItemSelectedListener onItemSelectedListener,
            OnItemClickListener onItemClickListener);

    public void setOneMinutePixelWidth(int width);

    public void setStartDate(Calendar startDate);
}
