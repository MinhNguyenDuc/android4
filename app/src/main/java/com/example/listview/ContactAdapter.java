package com.example.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    private List<ContactModel> listContact;
    private Activity activity;

    public ContactAdapter(List<ContactModel> listContact, Activity activity) {
        this.listContact = listContact;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_contact, parent, false);
            ViewHolder holder = new ViewHolder();
            ContactModel model = listContact.get(position);
            holder.tvName = (TextView)convertView.findViewById(R.id.tvName);
            holder.tvPhone = (TextView)convertView.findViewById(R.id.tvPhone);
            holder.ivAvatar = (ImageView) convertView.findViewById(R.id.ivAvatar);
            convertView.setTag(holder);
        }

        ViewHolder viewHolder = (ViewHolder)convertView.getTag();

        ContactModel model = listContact.get(position);
        viewHolder.tvName.setText(model.getName());
        viewHolder.tvPhone.setText(model.getPhone());
        viewHolder.ivAvatar.setImageResource(model.getImage());

        return convertView;
    }

    static class ViewHolder {
        TextView tvName;
        TextView tvPhone;
        ImageView ivAvatar;
    }
}
