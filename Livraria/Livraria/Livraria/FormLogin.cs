using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Livraria
{
    public partial class FormLogin : Form
    {
        public FormLogin()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Close();
            
            this.Hide();
            FormPrincipal frm = new FormPrincipal();
            frm.Show();
            
        }

        private void FormLogin_Load(object sender, EventArgs e)
        {

        }
    }
}
