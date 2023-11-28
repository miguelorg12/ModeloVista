package com.example.modelo_vista.ViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.modelo_vista.Singletonviewmodel.SumaInteractor;

public class SumaviewModel extends ViewModel {
    private MutableLiveData<String> resultado = new MutableLiveData<>();
    public LiveData<String> getResultado() {
        return resultado;
    }
    public void Sumar(int num1, int num2){
        int rs = SumaInteractor.sumar(num1,num2);
        resultado.setValue(String.valueOf(rs));
    }
    public void Restar(int num1, int num2){
        int rs = SumaInteractor.restar(num1,num2);
        resultado.setValue(String.valueOf(rs));
    }
}
