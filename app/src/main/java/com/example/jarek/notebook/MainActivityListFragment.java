package com.example.jarek.notebook;


import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class    MainActivityListFragment extends ListFragment {

    private ArrayList<Note> notes;
    private NoteAdapter noteAdapter;
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        //String[] values = new String[] {"Android", "iPhone", "WindowsMobile",
        //                "BlackBerry", "WebOS", "Ubuntu", "Windows7", "Mac OS X",
        //                "Linux", "OS 2"};
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
        //       android.R.layout.simple_list_item_1, values);

        //setListAdapter(adapter);
        notes = new ArrayList<Note>();
        notes.add(new Note("First tile..", "First message", Note.Category.PERSONAL));
        notes.add(new Note("2 tile..", "Second message", Note.Category.TECHNICAL));
        notes.add(new Note("3 tile..", "Third message", Note.Category.QUOTE));
        notes.add(new Note("4 tile..", "Fourth message", Note.Category.FINANCE));
        notes.add(new Note("5 tile..", "Five message", Note.Category.PERSONAL));

        noteAdapter = new NoteAdapter(getActivity(), notes);
        setListAdapter(noteAdapter);

        getListView().setDivider(ContextCompat.getDrawable(getActivity(), android.R.color.black));
        getListView().setDividerHeight(1);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);

    }
}
