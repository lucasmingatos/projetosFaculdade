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
    public partial class FormEditora : Form
    {
        public FormEditora()
        {
            InitializeComponent();

            this.FormBorderStyle = FormBorderStyle.FixedDialog;
            this.StartPosition = FormStartPosition.CenterScreen;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.ShowIcon = false;
            estadoControles(false);
            exibirDados();
        }

        private void exibirDados()
        {
            tabDados.DataSource = new EditoraDAL().listar();
            tabDados.Columns[0].Width = 100;
            tabDados.Columns[1].Width = 400;
            tabDados.SelectionMode = DataGridViewSelectionMode.FullRowSelect;
            tabDados.AllowUserToAddRows = false;
            tabDados.AllowUserToDeleteRows = false;
            tabDados.AllowUserToOrderColumns = false;
            tabDados.AllowUserToResizeColumns = false;
            tabDados.AllowUserToResizeRows = false;
            tabDados.ReadOnly = true;

            tabDados.Columns[0].HeaderText = "Id";
            tabDados.Columns[1].HeaderText = "Nome";
        }



        private void estadoControles(bool estado)
        {
            txtId.Enabled = false;
            txtNome.Enabled = estado;
            txtPesquisar.Enabled = estado;

            btnNovo.Enabled = !estado;
            btnSalvar.Enabled = estado;
            btnEditar.Enabled = !estado;
            btnCancelar.Enabled = estado;

        }

        private void btnNovo_Click(object sender, EventArgs e)
        {
            estadoControles(true);
            txtId.Clear();
            txtNome.Clear();
            txtNome.Focus();
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
                txtNome.Clear();
            }
        }

        private void btnSalvar_Click(object sender, EventArgs e)
        {
            Editora editora = new Editora();
            editora.Nome = txtNome.Text;

            int id = -1;
            if (!string.IsNullOrEmpty(txtId.Text))
            {
                editora.Id = Convert.ToInt32(txtId.Text);
                id = new EditoraDAL().atualizar(editora);
            }
            else
            {
                id = new EditoraDAL().inserir(editora);
            }

            if (id > 0)
            {
                txtId.Text = id.ToString();
                MessageBox.Show("Operação realizada com sucesso!",
                    "Livraria", MessageBoxButtons.OK, MessageBoxIcon.Information);
                exibirDados();
            }
            else
            {
                MessageBox.Show("Ocorreu um erro durante a operação.",
                    "Livraria", MessageBoxButtons.OK,
                    MessageBoxIcon.Error);
            }
            


        }

        private void tabDados_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
        }

        private void tabDados_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            // linha selecionada pelo usuário
            int linha = e.RowIndex;

            if (linha >= 0)
            {
                //Conteúdo da Coluna ID
                txtId.Text = tabDados.Rows[linha].Cells[0].Value.ToString();

                //Conteúdo da Coluna Nome
                txtNome.Text = tabDados.Rows[linha].Cells[1].Value.ToString();
            }
        }
    }
}
