package ar.com.astun.astun_osasun;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Narda on 16/3/17.
 */

public class PresentacionActivity extends Fragment {

    private ImageView imageViewPresentacion;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View view = inflater.inflate(R.layout.presentacion_activity, container, false);


        imageViewPresentacion = (ImageView) view.findViewById(R.id.imageViewPresentacion);

        return view;//inflater.inflate(R.layout.grado_brix_densidad, container, false);

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("");
    }
}
