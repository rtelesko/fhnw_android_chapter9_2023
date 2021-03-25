package com.example.lotteryfragmentone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /*
    Creates and returns the view hierarchy associated with the fragment.
    inflater: The LayoutInflater object that can be used to inflate any views in the fragment.
    A LayoutInflater reads an XML in which we describe how we want a UI layout to be.
    It then creates actual View objects for UI from that XML.
    container: ViewGroup: If non-null, this is the parent view that the fragment's UI should be attached to.
    savedInstanceState: Bundle: If non-null, this fragment is being re-constructed from a previous saved state as given here.
    */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /*
        The inflate() method takes three parameters:
        The id of a layout XML file
        a parent ViewGroup into which the fragment's View is to be inserted,
        and a third boolean:
            true: add the child view to parent RIGHT NOW
            false: add the child view to parent NOT NOW
        */
        return inflater.inflate(R.layout.fragment1, container, false);
    }
}