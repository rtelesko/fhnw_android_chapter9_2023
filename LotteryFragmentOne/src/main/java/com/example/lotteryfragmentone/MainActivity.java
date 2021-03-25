package com.example.lotteryfragmentone;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
/*
Fragment Life Cycle: https://developer.android.com/guide/components/fragments

There are two ways to add a fragment to an activity: dynamically using Java and statically using XML.
Before embedding a "support" fragment in an Activity make sure the Activity is changed to extend from
FragmentActivity or AppCompatActivity which adds support for the fragment manager to all Android versions.

Important: An Android fragment is not by itself a subclass of View which most other GUI components are.
Instead, a fragment has a view inside it. It is this view which is eventually displayed inside the activity in which the fragment lives.

Because an Android fragment is not a view, adding it to an activity looks somewhat different than adding a view (e.g. TextView).
A fragment is added to a ViewGroup inside the activity. The fragment's view is displayed inside this ViewGroup.

Steps:
1. First the activity obtains a reference to the fragment.
2. Then it gets a reference to the ViewGroup the fragment's view will be rendered inside.
3. Then the activity adds the fragment.
4. The fragment then creates its view and returns it to the activity.
5. The view is then inserted into the ViewGroup parent, and the fragment is alive.
*/

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
