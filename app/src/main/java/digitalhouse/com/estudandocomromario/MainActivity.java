package digitalhouse.com.estudandocomromario;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoLogin;
    private Button botaoCor;
    private EditText login;
    private EditText senha;
    private View view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoLogin = (Button) findViewById(R.id.botaoLogin);
        botaoLogin.setOnClickListener(this);

        botaoCor = (Button) findViewById(R.id.botaoCor);
        botaoCor.setOnClickListener(this);

        login = (EditText) findViewById(R.id.login);

        senha = (EditText) findViewById(R.id.senha);
        view = (View) findViewById(R.id.view);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == (R.id.botaoLogin)) {

            if (login.getText().toString().equals("kaio@digitalhouse.com") && senha.getText().toString().equals("1234")){
                Toast.makeText(getApplicationContext(),"Bem vindo a Digital house",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(getApplicationContext(),"Acesso negado",Toast.LENGTH_SHORT).show();

            }


        }
        if (v.getId() == (R.id.botaoCor)) {
            view.setBackgroundColor(Color.parseColor("#A0522D"));

        }
    }
}
