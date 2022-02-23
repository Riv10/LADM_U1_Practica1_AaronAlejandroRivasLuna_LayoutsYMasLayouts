package mx.edu.ittepic.ladm_u1_practica1_aaronalejandrorivasluna_layoutsymaslayouts

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*
import mx.edu.ittepic.ladm_u1_practica1_aaronalejandrorivasluna_layoutsymaslayouts.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.btnGuardarU.setOnClickListener{
            if(txtNombreD.text.isEmpty() || txtEdadD.text.isEmpty() ||
                txtDomicilio.text.isEmpty() || txtSexoD.text.isEmpty() || txtTel.text.isEmpty()){
                AlertDialog.Builder(requireContext())
                    .setTitle("Fallo")
                    .setMessage("Faltan datos del dueño para guardar correctamente.")
                    .show()
            }else{
                AlertDialog.Builder(requireContext())
                    .setTitle("Exitoso")
                    .setMessage("Los datos del dueño se han guardado exitosamente.")
                    .show()
            }
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}