package uk.co.tommywebdesign.recycleviewexample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.view.SupportMenuInflater;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import uk.co.tommywebdesign.recycleviewexample.R;
import uk.co.tommywebdesign.recycleviewexample.model.ListItem;


/**
 * Created by tommy on 16/10/16.
 */

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppHolder> {


    private List<ListItem>listData;
    private LayoutInflater inflater;

    private ItemClickCallback itemClickCallback;


    public interface   ItemClickCallback{
        void onItemClick(int p);
    }

    public void  setItemClickCallback(final  ItemClickCallback itemClickCallback){
        this.itemClickCallback=itemClickCallback;
    }



    public AppAdapter(List<ListItem>listItem, Context c){
        this.inflater=LayoutInflater.from(c);
        this.listData =listItem;

    }



    @Override
    public AppHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View view   = inflater.inflate(R.layout.list_item,parent,false);
        return new AppHolder(view);
    }

    @Override
    public void onBindViewHolder(AppHolder holder, int position) {

        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.icon.setImageResource(item.getImageResId());



    }

    @Override
    public int getItemCount() {
        return listData.size() ;
    }

    class AppHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView title;
        private ImageView icon;
        private View container;

        public AppHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.list_item_txt);
            icon=(ImageView)itemView.findViewById(R.id.list_item_img);
            container=itemView.findViewById(R.id.list_item_container);

            container.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
                itemClickCallback.onItemClick(getAdapterPosition());
        }
    }






}
