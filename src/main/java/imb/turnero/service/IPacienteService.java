package imb.turnero.service;

import java.util.List;

import imb.turnero.entity.Paciente;

public interface IPacienteService {
	
	public List<Paciente> buscarPacientes ();
	public Paciente buscarPacientePorId (Integer id);
	public void guardarPaciente (Paciente paciente);
	public void eliminarPaciente (Integer id);
	
}
