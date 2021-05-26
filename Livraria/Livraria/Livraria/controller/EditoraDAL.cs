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
    public class EditoraDAL
    {
        private NpgsqlConnection con;
        private NpgsqlCommand cmd;

        public EditoraDAL()
        {
            this.con = new Conexao().conectar();
        }

        public int inserir(Editora e)
        {
            try
            {
                string SQL = "INSERT INTO editora (nome) values (@nome) RETURNING id; ";

                cmd = new NpgsqlCommand(SQL, con);
                cmd.Parameters.AddWithValue("@nome", e.Nome);

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

        public int atualizar(Editora e)
        {
            try
            {
                string SQL = "UPDATE editora SET nome=@nome WHERE id=@id";

                cmd = new NpgsqlCommand(SQL, con);
                cmd.Parameters.AddWithValue("@nome", e.Nome);
                cmd.Parameters.AddWithValue("@id", e.Id );

                con.Open();
                cmd.ExecuteNonQuery();

                return e.Id;
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
                string SQL = "SELECT * FROM editora ORDER BY id";
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

        public List<object> pesquisarPorNome(string nome)
        {
            try
            {
                string SQL = "";
                return null;
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
