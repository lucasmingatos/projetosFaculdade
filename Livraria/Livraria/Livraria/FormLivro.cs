using Livraria.controller;
using Livraria.model;
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
    public partial class FormLivro : Form
    {
        public FormLivro()
        {
            InitializeComponent();

            this.FormBorderStyle = FormBorderStyle.FixedDialog;
            this.StartPosition = FormStartPosition.CenterScreen;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.ShowIcon = false;
            estadoControles(false);

            rdbTitulo.Checked = true;
            preencherComboEditoras();
            exibirDados(new LivroDAL().listar());
        }

        private void preencherComboEditoras()
        {
            cbxEditora.DataSource = new EditoraDAL().listar();
            cbxEditora.ValueMember = "id";
            cbxEditora.DisplayMember = "nome";
            cbxEditora.SelectedIndex = 0;
        }

        private void exibirDados(DataTable dados)
        {
            tabDados.DataSource = dados;
            if (tabDados.DataSource != null)
            {
                tabDados.Columns[0].Width = 80;
                tabDados.Columns[1].Width = 200;
                tabDados.Columns[2].Width = 150;
                tabDados.Columns[3].Width = 80;
                tabDados.Columns[4].Width = 100;
                tabDados.Columns[5].Width = 80;
                tabDados.Columns[6].Width = 100;
                tabDados.SelectionMode = DataGridViewSelectionMode.FullRowSelect;
                tabDados.AllowUserToAddRows = false;
                tabDados.AllowUserToDeleteRows = false;
                tabDados.AllowUserToOrderColumns = false;
                tabDados.AllowUserToResizeColumns = false;
                tabDados.AllowUserToResizeRows = false;
                tabDados.ReadOnly = true;

                tabDados.Columns[0].HeaderText = "Id";
                tabDados.Columns[1].HeaderText = "Titulo";
                tabDados.Columns[2].HeaderText = "Autor";
                tabDados.Columns[3].HeaderText = "Ano";
                tabDados.Columns[4].HeaderText = "Preço";
                tabDados.Columns[5].HeaderText = "Quantidade";
                tabDados.Columns[6].HeaderText = "Editora";
            }
        }


        public void estadoControles(bool estado)
        {
            txtId.Enabled = false;
            txtTitulo.Enabled = estado;
            txtAutor.Enabled = estado;
            txtAno.Enabled = estado;
            cbxEditora.Enabled = estado;
            txtPreco.Enabled = estado;
            txtQuantidade.Enabled = estado;
            //txtPesquisar.Enabled = estado;

            btnNovo.Enabled = !estado;
            btnSalvar.Enabled = estado;
            btnEditar.Enabled = !estado;
            btnCancelar.Enabled = estado;

        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            estadoControles(true);
            txtId.Clear();
            txtTitulo.Clear();
            txtAutor.Clear();
            cbxEditora.SelectedIndex = 0;
            txtAno.Clear();
            txtPreco.Clear();
            txtQuantidade.Clear();
            txtTitulo.Focus();
           
        }

        private void btnEditar_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrEmpty(txtId.Text))
            {
                MessageBox.Show(
                    "Selecione o registro para edição.",
                    "Livraria",
                    MessageBoxButtons.OK,
                    MessageBoxIcon.Warning
                );
            }
            else
            {
                estadoControles(true);
            }
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            estadoControles(false);
            if (string.IsNullOrEmpty(txtId.Text))
            {
                txtTitulo.Clear();
                txtAutor.Clear();
                cbxEditora.SelectedIndex = 0;
                txtAno.Clear();
                txtPreco.Clear();
                txtQuantidade.Clear();
            }
        }

        private void btnSalvar_Click(object sender, EventArgs e)
        {
            Livro livro = new Livro();
            livro.IdEditora = (int)cbxEditora.SelectedValue;
            livro.Titulo = txtTitulo.Text;
            livro.Autor = txtAutor.Text;
            livro.Ano = Convert.ToInt32(txtAno.Text);
            livro.Quantidade = Convert.ToInt32(txtQuantidade.Text);

            int id = -1;
            if (!string.IsNullOrEmpty(txtId.Text))
            {
                livro.Id = Convert.ToInt32(txtId.Text);
                id = new LivroDAL().atualizar(livro);
            }
            else
            {
                id = new LivroDAL().inserir(livro);
            }

            if (id > 0)
            {
                txtId.Text = id.ToString();
                MessageBox.Show("Operação realizada com sucesso!",
                    "Livraria", MessageBoxButtons.OK, MessageBoxIcon.Information);
                exibirDados(new LivroDAL().listar());
            }
            else
            {
                MessageBox.Show("Ocorreu um erro durante a operação.",
                    "Livraria", MessageBoxButtons.OK,
                    MessageBoxIcon.Error);
            }
            estadoControles(false);
        }

        private void txtPesquisar_KeyPress(object sender, KeyPressEventArgs e)
        {
            string chave = txtPesquisar.Text;
            if (chave.Length == 0)
            {
                exibirDados(new LivroDAL().listar());
            }
            else
            {
                if (rdbTitulo.Checked)
                {
                    exibirDados(new LivroDAL().pesquisarPorTitulo(chave));
                }
                else
                {
                    exibirDados(new LivroDAL().pesquisarPorEditora(chave));
                }
                
            }

        }
    }
}
