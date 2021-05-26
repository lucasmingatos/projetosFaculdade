using Npgsql;
using System;

using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Livraria.controller
{
    public class Conexao
    {

        const string URL = "Host=localhost;Username=postgres;Password=password;Database=livraria_db";
      
        public NpgsqlConnection conectar()
        {
            try
            {
                return new NpgsqlConnection(URL);
            }
            catch (Exception erro)
            {
                Console.WriteLine("ERRO: " + erro.Message);
                return null;
            }
        }


    }
}
