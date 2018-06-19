package com.dev.class3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Contact> {


    public ListAdapter(Context context, int resource, ArrayList<Contact> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.itemlistrow, null);
        }


        TextView txtName = convertView.findViewById(R.id.txt_name);
        TextView txtPhone = convertView.findViewById(R.id.txt_phone);
        ImageView img = convertView.findViewById(R.id.img_profile);


        Contact contact = getItem(position);


        txtName.setText(contact.getFirstName() + " " + contact.getSecondName());
        txtPhone.setText(contact.getPhone());
        if (contact.isBloocked()) {
            txtName.setTextColor(getContext().getResources().getColor(R.color.colorAccent));
        } else {
            txtName.setTextColor(getContext().getResources().getColor(android.R.color.black));

        }
        txtPhone.setVisibility(View.VISIBLE);
        img.setImageResource(contact.getImage());


        return convertView;
    }


}
