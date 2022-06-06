package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declarar a lista
    ListView listaPlanetas;

    //criando vetores dados
    String nomePlanetas[] = {"Jupter", "Lua", "Marte", "Mercurio", "netuno", "plutao", "saturno", "sol", "terra", "urano", "venus"};
    int imagemPlanetas[] = {R.drawable.jupiter, R.drawable.lua, R.drawable.marte, R.drawable.mercurio,
            R.drawable.netuno, R.drawable.plutao, R.drawable.saturno, R.drawable.sol, R.drawable.terra,
            R.drawable.urano, R.drawable.venus};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPlanetas = findViewById(R.id.idListPlanetas);

        MyAdapter adapter = new MyAdapter();

        listaPlanetas.setAdapter(adapter);
    }

    //criando a classe interna - inner class
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imagemPlanetas.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //declarar os componetes do modelo que serão utilizados na lista

            ImageView imgPlanetas;
            TextView txtPlanetas;


            View view1 = getLayoutInflater().inflate(R.layout.modelo_planetas,null);

            txtPlanetas = view1.findViewById(R.id.txtModeloPlaneta);
            imgPlanetas = view1.findViewById(R.id.imgModeloPlaneta);

            //Implamentar os metodos nos componentes
            txtPlanetas.setText(nomePlanetas[position]);
            imgPlanetas.setImageResource(imagemPlanetas[position]);

            return view1;
        }
    }

}