import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		Scanner scr = new Scanner(System.in);
		int num=0;
		while(num != 5){
		System.out.println("Selecione uma opcao: 1-Listar, 2-Inserir, 3-Excluir, 4-Atualizar, 5-Sair");
		num = scr.nextInt();

		if(num == 2){
		//Inserir um elemento na tabela
		X usuario = new X (11, "pablo", "pablo",'M');
		if(dao.inserirUsuario(usuario) == true) {
			System.out.println("Inserção com sucesso -> " + usuario.toString());
		}

	} else if(num == 4){
		//Atualizar usuário
		usuario.setSenha("nova senha");
		dao.atualizarUsuario(usuario);
		
		//Mostrar usuários do sexo masculino		
		System.out.println("==== Mostrar usuários do sexo masculino === ");
		X[] usuarios = dao.getUsuariosMasculinos();
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}
		
	} else if(num == 3){
		//Excluir usuário
		dao.excluirUsuario(usuario.getCodigo());

	} else if(num == 1){
		
		//Mostrar usuários
		usuarios = dao.getUsuarios();
		System.out.println("==== Mostrar usuários === ");		
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}
		
	} else if(num == 5){
	
	dao.close();
	
	}
}
}
}