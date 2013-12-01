package br.com.ntxdev.zup.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import br.com.ntxdev.zup.R;

import com.todddavies.components.progressbar.ProgressWheel;

public class EstatisticasFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_estatisticas, container, false);
		ProgressWheel pResolvido = (ProgressWheel) view.findViewById(R.id.spinnerResolvido);
		pResolvido.setProgress((int) (360.0 / 100.0 * 28));
		
		ProgressWheel pAndamento = (ProgressWheel) view.findViewById(R.id.spinnerAndamento);
		pAndamento.setProgress((int) (360.0 / 100.0 * 61));
		
		ProgressWheel pEmAberto = (ProgressWheel) view.findViewById(R.id.spinnerEmAberto);
		pEmAberto.setProgress((int) (360.0 / 100.0 * 11));
		
		ProgressWheel pNaoResolvido = (ProgressWheel) view.findViewById(R.id.spinnerNaoResolvido);
		pNaoResolvido.setProgress((int) (360.0 / 100.0 * 4));
		return view;
	}
}
