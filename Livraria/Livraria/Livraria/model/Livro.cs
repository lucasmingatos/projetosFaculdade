using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Livraria.model
{
    public class Livro
    {
        public int Id { get; set; }
        public string Titulo { get; set; }
        public string Autor { get; set; }
        public int Ano { get; set; }
        public double Preco { get; set; }
        public int Quantidade { get; set; }
        public int IdEditora { get; set; }

        public Livro()
        {
        }

        public override string ToString()
        {
            return Titulo;
        }


    }
}
