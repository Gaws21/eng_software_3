package repositorios;
import modelos.Usuario;

public class UsuarioRepositorio {
	private Usuario[] usuarios;
	private Integer index;
	
	public UsuarioRepositorio() {
		usuarios = new Usuario[100];
		index = 0;
	}
	
	public void adicionar(Usuario usuario) {
		usuarios[index] = usuario;
		index++;
	}
	
	public Integer tamanho() {
		return index;
	}
	
	public Usuario get(Integer i) {
		return usuarios[i];
	}
	
}
