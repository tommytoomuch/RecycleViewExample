package uk.co.tommywebdesign.recycleviewexample.model;

/**
 * Created by tommy on 16/10/16.
 */

public class ListItem {

    private String title;
    private int setImageResId;

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public boolean isFav() {
        return fav;
    }

    public void setFav(boolean fav) {
        this.fav = fav;
    }

    private String subTitle;
    private boolean fav = false;

    public int getImageResId() {
        return setImageResId;
    }

    public void setImageResId(int setImageResId) {
        this.setImageResId = setImageResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String tile) {
        this.title = tile;
    }
}
