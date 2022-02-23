package mx.edu.ittepic.ladm_u1_practica1_aaronalejandrorivasluna_layoutsymaslayouts

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import mx.edu.ittepic.ladm_u1_practica1_aaronalejandrorivasluna_layoutsymaslayouts.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Tip: Recuerda salir a pasear con tu perro por lo menos 15 minutos por día", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}