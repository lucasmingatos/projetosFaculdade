using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Livraria.model
{
    public class Editora
    {
        public int Id { get; set; }
        public string Nome { get; set; }

        public Editora()
        {
        }

        public Editora(int Id, string Nome)
        {
            this.Id = Id;
            this.Nome = Nome;
        }

        public override string ToString()
        {
            return Nome;
        }

    }
}
