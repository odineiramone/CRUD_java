import java.util.ArrayList;
import java.util.List;

public class MeuCRUD extends MeuDAO
{
	public void cadastrar(Cliente c) throws Exception
	{
		OpenDatabase();
		String SQL = "insert into clientes (nome, endereco, telefone) values (?, ?, ?)";
		pstmt = con.prepareStatement(SQL);
		pstmt.setString(1, c.getNome());
		pstmt.setString(2, c.getEndereco());
		pstmt.setString(3, c.getTelefone());
		pstmt.execute();
		CloseDatabase();
	}

	public List<Cliente> consulta() throws Exception
	{
		OpenDatabase();
		String SQL = "select * from clientes order by codigo asc";
		pstmt = con.prepareStatement(SQL);
		rs = pstmt.executeQuery();
		Cliente c = null;
		List<Cliente> listaClientes = new ArrayList<Cliente>();

		while(rs.next())
		{
			c = new Cliente();
			c.setCodigo(rs.getInt("codigo"));
			c.setNome(rs.getString("nome"));
			c.setTelefone(rs.getString("telefone"));
			c.setEndereco(rs.getString("endereco"));
			listaClientes.add(c);
		}

		CloseDatabase();
		return listaClientes;
	}

	public void atualizar(Cliente c) throws Exception
	{
		OpenDatabase();
		String SQL = "update clientes set nome = ?, endereco = ?, telefone = ?" + " where codigo = ?";
        pstmt = con.prepareStatement(SQL);
        pstmt.setInt(4, c.getCodigo());
        pstmt.setString(1, c.getNome());
        pstmt.setString(2, c.getEndereco());
        pstmt.setString(3, c.getTelefone());
        pstmt.executeUpdate();
        CloseDatabase();
	}

	public Cliente buscaPorCodigo(Integer cod) throws Exception
	{
		OpenDatabase();
		String SQL = "select * from clientes where codigo = " + cod;
		pstmt = con.prepareStatement(SQL);
		rs = pstmt.executeQuery();
		Cliente c = null;
		Cliente cliente = new Cliente();

		while(rs.next())
		{
			cliente = new Cliente();
			cliente.setCodigo(rs.getInt("codigo"));
			cliente.setNome(rs.getString("nome"));
			cliente.setTelefone(rs.getString("telefone"));
			cliente.setEndereco(rs.getString("endereco"));
		}

		CloseDatabase();
		return cliente;

	}

	public void deletar(Integer cod) throws Exception
	{
		OpenDatabase();
        String SQL = "delete from clientes where codigo = " + cod;
        stmt = con.prepareStatement(SQL);
        stmt.executeUpdate(SQL);
        CloseDatabase();
	}
}
