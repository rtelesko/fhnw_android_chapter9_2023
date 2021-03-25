package com.example.lotteryfragmentthree;

import androidx.fragment.app.ListFragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.Objects;

// See for ListFragment: https://developer.android.com/reference/androidx/fragment/app/ListFragment
public class MyListFragment extends ListFragment implements OnItemClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Creates a new ArrayAdapter from external resources
        ArrayAdapter adapter = ArrayAdapter.createFromResource(Objects.requireNonNull(getActivity()),
                // Layout can be opened and changed directly with CTRL + left mouse click ==> e.g. textStyle to "italic"
                R.array.players, R.layout.my_list_layout);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getActivity(), "Item at position " + position + ": " + getListView().getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();

    }
}