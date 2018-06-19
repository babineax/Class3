package com.dev.class3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    private final ArrayList<Contact> contacts;
    private final Context context;


    public GridAdapter(Context context, ArrayList<Contact> contacts) {
        this.contacts = contacts;
        this.context = context;
    }


    @Override
    public int getCount() {
        return contacts.size();
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.grid_item, null);
        }
        TextView txtName = convertView.findViewById(R.id.txt_name);
        TextView txtPhone = convertView.findViewById(R.id.txt_phone);
        ImageView img = convertView.findViewById(R.id.img_profile);
        //Contact contact=getItem(position);
        Contact contact = contacts.get(position);

        txtName.setText(contact.getFirstName() + " " + contact.getSecondName());
        txtPhone.setText(contact.getPhone());
        if (contact.isBloocked()) {
            txtName.setTextColor(context.getResources().getColor(R.color.colorAccent));
        } else {
            txtName.setTextColor(context.getResources().getColor(android.R.color.black));

        }
        txtPhone.setVisibility(View.VISIBLE);
        img.setImageResource(contact.getImage());


        return convertView;
    }

}

