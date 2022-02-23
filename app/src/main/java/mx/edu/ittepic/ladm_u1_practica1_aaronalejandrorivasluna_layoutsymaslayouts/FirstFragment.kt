package mx.edu.ittepic.ladm_u1_practica1_aaronalejandrorivasluna_layoutsymaslayouts

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*
import mx.edu.ittepic.ladm_u1_practica1_aaronalejandrorivasluna_layoutsymaslayouts.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.btnGuardarP.setOnClickListener{
            if(txtNombrePerro.text.isEmpty() || txtEdad.text.isEmpty() ||
                txtPeso.text.isEmpty() || txtSexo.text.isEmpty() || txtRaza.text.isEmpty()){
                AlertDialog.Builder(requireContext())
                    .setTitle("Fallo")
                    .setMessage("Faltan datos del perro para guardar correctamente.")
                    .show()
            }else{
                AlertDialog.Builder(requireContext())
                    .setTitle("Exitoso")
                    .setMessage("Los datos del perro se han guardado exitosamente.")
                    .show()
            }

        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}