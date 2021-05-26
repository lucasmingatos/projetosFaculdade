using Npgsql;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Teste
{
    class Program
    {
        static void Main(string[] args)
        {
            string URL = "Host=localhost;Username=postgres;Password=password;Database=livraria_db";


            NpgsqlConnection con = new NpgsqlConnection(URL);

            NpgsqlCommand cmd = new NpgsqlCommand();

            cmd.Connection = con;
            cmd.CommandText = "INSERT INTO editora (nome) VALUES ('NOVA EDITORA')";
            con.Open();
            cmd.ExecuteNonQuery();
            con.Close();

            Console.ReadLine();

        }

    }
    
}
