package me.amplitudo.tabfragmentapp.ui.newscreen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import me.amplitudo.tabfragmentapp.R;

public class NewScreenFragment extends Fragment {

    private NewScreenViewModel mViewModel;

    public static NewScreenFragment newInstance() {
        return new NewScreenFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_screen, container, false);

        TextView textTitle = view.findViewById(R.id.text_new_screen);

        textTitle.setText("NEW SCREEN");

        Toast.makeText(getContext(), "Ovo je fragment", Toast.LENGTH_SHORT).show();

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(NewScreenViewModel.class);
        // TODO: Use the ViewModel
    }

}
