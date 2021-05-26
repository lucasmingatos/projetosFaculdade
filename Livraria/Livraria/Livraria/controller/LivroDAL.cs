using Livraria.model;
using Npgsql;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Livraria.controller
{
    public class LivroDAL
    {
        private NpgsqlConnection con;
        private NpgsqlCommand cmd;

        public LivroDAL()
        {
            this.con = new Conexao().conectar();
        }

        public int inserir(Livro l)
        {
            try
            {
                string SQL = "INSERT INTO livro (id_editora,titulo,autor,ano,preco,quantidade) values (@id_editora,@titulo,@autor,@ano,@preco,@quantidade) RETURNING id; ";

                cmd = new NpgsqlCommand(SQL, con);
                cmd.Parameters.AddWithValue("@id_editora", l.IdEditora);
                cmd.Parameters.AddWithValue("@titulo", l.Titulo);
                cmd.Parameters.AddWithValue("@autor", l.Autor);
                cmd.Parameters.AddWithValue("@ano", l.Ano);
                cmd.Parameters.AddWithValue("@preco", l.Preco);
                cmd.Parameters.AddWithValue("@quantidade", l.Quantidade);

                con.Open();
                return Convert.ToInt32(cmd.ExecuteScalar());
            }
            catch (Exception erro)
            {
                Console.WriteLine("ERRO: " + erro.Message);
                return -1;
            }
            finally
            {
                con.Close();
            }

        }

        public int atualizar(Livro l)
        {
            try
            {
                string SQL = "";
                return -1;
            }
            catch (Exception erro)
            {
                Console.WriteLine("ERRO: " + erro.Message);
                return -1;
            }
            finally
            {
                con.Close();
            }

        }

        public DataTable listar()
        {
            try
            {
                string SQL = "select l.id,l.titulo,l.autor,l.ano,l.preco,l.quantidade,e.nome from livro as l inner join editora as e on (l.id_editora = e.id) order by id";
                con.Open();

                NpgsqlDataAdapter da = new NpgsqlDataAdapter(SQL, con);

                DataTable dt = new DataTable();
                da.Fill(dt);

                return dt;
            }
            catch (Exception erro)
            {
                Console.WriteLine("ERRO: " + erro.Message);
                return null;
            }
            finally
            {
                con.Close();
            }
        }

        public DataTable pesquisarPorTitulo(string titulo)
        {
            try
            {
                return listar()
                    .Select("titulo like '%" + titulo + "%'")
                    .CopyToDataTable(); ;
            }
            catch (Exception erro)
            {
                Console.WriteLine("ERRO: " + erro.Message);
                return null;
            }
            finally
            {
                con.Close();
            }
        }
        public DataTable pesquisarPorEditora(string editora)
        {
            try
            {
                return listar()
                    .Select("nome like '%" + editora + "%'")
                    .CopyToDataTable(); ;
            }
            catch (Exception erro)
            {
                Console.WriteLine("ERRO: " + erro.Message);
                return null;
            }
            finally
            {
                con.Close();
            }
        }

    }
}
