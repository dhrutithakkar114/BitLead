package itaims.com.bitlead;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TomorrowsLeadListFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        ListView l1;

        View view = inflater.inflate(R.layout.fragment_tomorrowsleadlist,null);

        String[] adobe_tomorrowslist= getResources().getStringArray(R.array.adobe_tomorrowslist);

        l1=view.findViewById(R.id.lists);
        l1.setAdapter(new ArrayAdapter<String>(getActivity(), R.layout.fragment_tomorrowssinglelistitem, R.id.label, adobe_tomorrowslist));

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent i = new Intent(getActivity(), SingleListItemView.class);
                getActivity().startActivity(i);
            }
        });
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
    }
}