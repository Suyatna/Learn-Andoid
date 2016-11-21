package id.or.codelabs.introswipe;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WalkthroughFragment extends Fragment {
    private static String resId = "RES_ID";

    private ImageView imgStarted;

    public WalkthroughFragment() {
        // Required empty public constructor
    }

    public static WalkthroughFragment newInstance(int id) {
        Bundle args = new Bundle();
        args.putInt(resId, id);
        WalkthroughFragment fragment = new WalkthroughFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_walkthrough, container, false);
        initView(rootView);

        imgStarted.setImageResource(getArguments().getInt(resId));

        return rootView;
    }

    private void initView(View v) {
        imgStarted = (ImageView) v.findViewById(R.id.imageview_swipe);
    }

}
