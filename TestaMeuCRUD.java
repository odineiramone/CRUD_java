package crud;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestaMeuCRUD extends MeuCRUD
{
	public static void main(String[] args)
	{
            Home janela = new Home();
            janela.show();
		/*TestaMeuCRUD cd = new TestaMeuCRUD();
		String codigox= "", telefonex = "";
		Cliente cli = new Cliente();
		int cod = 0;

		String dados = "";
		try
		{
			Scanner in = new Scanner(System.in);
			int opcao = 0;
			do
			{
				System.out.print("Especifique a operação no Banco de Dados \n\n"
						+ "1-Cadastro\n2-Listagem Geral\n3-Pesquisa Individual\n"
						+ "4-Atualização\n5-Exclusão\n6-Sair\n\nSua opção: ");

				opcao = in.nextInt();

				switch(opcao)
				{
                                    case 1: // Cadastro
                                        cli.setNome(JOptionPane.showInputDialog("Digite o nome:"));
                                        cli.setEndereco(JOptionPane.showInputDialog("Digite o Endereco:"));
                                        cli.setTelefone(JOptionPane.showInputDialog("Digite o telefone:"));
                                        cd.cadastrar(cli);
                                        break;

                                    case 2: // Listagem geral
                                        System.out.println("Exibindo tela gráfica");
                                        for (Cliente cliente : cd.consulta())
                                        {
                                            dados = dados + "Codigo: " + cliente.getCodigo() + "\n" +
                                                            "Nome: " + cliente.getNome() + "\n" +
                                                            "Endereço: " + cliente.getEndereco() + "\n" + 
                                                            "Telefone: " + cliente.getTelefone() + "\n\n";
                                        }
                                        JOptionPane.showMessageDialog(null, "Os dados lidos no banco são \n\n" + dados);
                                        dados = "";
                                        System.out.println("Fim da exibição");
                                        break;

					case 3: // Pesquisa individual
                                            cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo para consulta:"));
                                            if (cd.buscaPorCodigo(cod).getCodigo() != null)
                                            {
                                                dados = "Código: " + cd.buscaPorCodigo(cod).getCodigo() + "\n" +
                                                        "Nome: " + cd.buscaPorCodigo(cod).getNome() + "\n" +
                                                        "Endereço: " + cd.buscaPorCodigo(cod).getEndereco() + "\n" +
                                                        "Telefone: " + cd.buscaPorCodigo(cod).getTelefone();
                                            }
                                            JOptionPane.showMessageDialog(null, "Os dados lidos no banco são \n\n" + dados);
                                            dados = "";
                                            break;

					case 4: // Atualização
						cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo para exclusão:"));
						
						if (cd.buscaPorCodigo(cod).getCodigo() != null)
						{
							cli.setCodigo(cd.buscaPorCodigo(cod).getCodigo());
							cli.setNome(JOptionPane.showInputDialog("Digite o nome:"));
			                cli.setEndereco(JOptionPane.showInputDialog("Digite o Endereco:"));
			                cli.setTelefone(JOptionPane.showInputDialog("Digite o telefone:"));
						}

						cd.atualizar(cli);
						
						if (cd.buscaPorCodigo(cod).getCodigo() != null)
						{
							dados = "Código: " + cd.buscaPorCodigo(cod).getCodigo() + "\n" +
					        		"Nome: " + cd.buscaPorCodigo(cod).getNome() + "\n" +
					        		"Endereço: " + cd.buscaPorCodigo(cod).getEndereco() + "\n" +
					        		"Telefone: " + cd.buscaPorCodigo(cod).getTelefone();
						}
						
						JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso\n\n" + dados);
						dados = "";
						break;
						
					case 5: // Exclusão
						cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo para exclusão:"));
						if (cd.buscaPorCodigo(cod).getCodigo() != null)
						{
							dados = "Código: " + cd.buscaPorCodigo(cod).getCodigo() + "\n" +
					        		"Nome: " + cd.buscaPorCodigo(cod).getNome() + "\n" +
					        		"Endereço: " + cd.buscaPorCodigo(cod).getEndereco() + "\n" +
					        		"Telefone: " + cd.buscaPorCodigo(cod).getTelefone();
						}
					    cd.deletar(cod); 
					    dados = dados + "\n\nRegistro eliminado com sucesso";
						JOptionPane.showMessageDialog(null, dados);
						dados = "";
						break;

					default:
						System.out.println("Escolha uma opção válida");
						break;
				}


			}while (opcao != 6);
		}
		catch (Exception ex)
		{
			System.out.println("erro:" + ex);
		}*/
	}
}