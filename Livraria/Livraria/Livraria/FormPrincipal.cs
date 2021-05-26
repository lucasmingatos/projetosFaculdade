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
    public partial class FormPrincipal : Form
    {
        public FormPrincipal()
        {
            InitializeComponent();

            this.Text = "Livraria";
            this.IsMdiContainer = true;
            this.WindowState = FormWindowState.Maximized;

            FormLogin frm = new FormLogin();
            frm.ShowDialog();

        }

        private void sairToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();

        }

        private void editoraToolStripMenuItem_Click(object sender, EventArgs e)
        {

            Form frm = new FormEditora();
            frm.MdiParent = this;
            frm.Show();

        }

        private void livroToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form frm = new FormLivro();
            frm.MdiParent = this;
            frm.Show();
        }
    }
}
