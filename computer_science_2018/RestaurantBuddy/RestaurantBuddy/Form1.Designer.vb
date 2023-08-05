<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(Form1))
        Me.txtBill = New System.Windows.Forms.TextBox()
        Me.lblBillLabel = New System.Windows.Forms.Label()
        Me.cmbTip = New System.Windows.Forms.ComboBox()
        Me.lblPercentLabel = New System.Windows.Forms.Label()
        Me.lblTipLabel = New System.Windows.Forms.Label()
        Me.lblTip = New System.Windows.Forms.Label()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.lblTotalLabel = New System.Windows.Forms.Label()
        Me.lblTotal = New System.Windows.Forms.Label()
        Me.txtPeople = New System.Windows.Forms.TextBox()
        Me.lblPeople = New System.Windows.Forms.Label()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'txtBill
        '
        Me.txtBill.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.txtBill.Location = New System.Drawing.Point(137, 12)
        Me.txtBill.Name = "txtBill"
        Me.txtBill.Size = New System.Drawing.Size(100, 38)
        Me.txtBill.TabIndex = 0
        '
        'lblBillLabel
        '
        Me.lblBillLabel.AutoSize = True
        Me.lblBillLabel.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.lblBillLabel.Location = New System.Drawing.Point(14, 19)
        Me.lblBillLabel.Name = "lblBillLabel"
        Me.lblBillLabel.Size = New System.Drawing.Size(50, 31)
        Me.lblBillLabel.TabIndex = 1
        Me.lblBillLabel.Text = "Bill"
        '
        'cmbTip
        '
        Me.cmbTip.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.cmbTip.FormattingEnabled = True
        Me.cmbTip.Items.AddRange(New Object() {"15%", "18%", "20%"})
        Me.cmbTip.Location = New System.Drawing.Point(137, 100)
        Me.cmbTip.Name = "cmbTip"
        Me.cmbTip.Size = New System.Drawing.Size(100, 39)
        Me.cmbTip.TabIndex = 2
        Me.cmbTip.Text = "% Tip"
        '
        'lblPercentLabel
        '
        Me.lblPercentLabel.AutoSize = True
        Me.lblPercentLabel.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.lblPercentLabel.Location = New System.Drawing.Point(12, 100)
        Me.lblPercentLabel.Name = "lblPercentLabel"
        Me.lblPercentLabel.Size = New System.Drawing.Size(83, 31)
        Me.lblPercentLabel.TabIndex = 3
        Me.lblPercentLabel.Text = "Tip %"
        '
        'lblTipLabel
        '
        Me.lblTipLabel.AutoSize = True
        Me.lblTipLabel.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.lblTipLabel.Location = New System.Drawing.Point(14, 274)
        Me.lblTipLabel.Name = "lblTipLabel"
        Me.lblTipLabel.Size = New System.Drawing.Size(52, 31)
        Me.lblTipLabel.TabIndex = 4
        Me.lblTipLabel.Text = "Tip"
        '
        'lblTip
        '
        Me.lblTip.AutoSize = True
        Me.lblTip.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.lblTip.Location = New System.Drawing.Point(93, 274)
        Me.lblTip.Name = "lblTip"
        Me.lblTip.Size = New System.Drawing.Size(52, 31)
        Me.lblTip.TabIndex = 5
        Me.lblTip.Text = "Tip"
        '
        'btnClear
        '
        Me.btnClear.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.btnClear.Location = New System.Drawing.Point(128, 386)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(109, 37)
        Me.btnClear.TabIndex = 6
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'btnExit
        '
        Me.btnExit.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.btnExit.Location = New System.Drawing.Point(20, 386)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(75, 37)
        Me.btnExit.TabIndex = 7
        Me.btnExit.Text = "Exit"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'lblTotalLabel
        '
        Me.lblTotalLabel.AutoSize = True
        Me.lblTotalLabel.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.lblTotalLabel.Location = New System.Drawing.Point(12, 320)
        Me.lblTotalLabel.Name = "lblTotalLabel"
        Me.lblTotalLabel.Size = New System.Drawing.Size(75, 31)
        Me.lblTotalLabel.TabIndex = 8
        Me.lblTotalLabel.Text = "Total"
        '
        'lblTotal
        '
        Me.lblTotal.AutoSize = True
        Me.lblTotal.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.lblTotal.Location = New System.Drawing.Point(93, 320)
        Me.lblTotal.Name = "lblTotal"
        Me.lblTotal.Size = New System.Drawing.Size(144, 31)
        Me.lblTotal.TabIndex = 9
        Me.lblTotal.Text = "Total Price"
        '
        'txtPeople
        '
        Me.txtPeople.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.txtPeople.Location = New System.Drawing.Point(137, 56)
        Me.txtPeople.Name = "txtPeople"
        Me.txtPeople.Size = New System.Drawing.Size(100, 38)
        Me.txtPeople.TabIndex = 10
        Me.txtPeople.Text = "1"
        '
        'lblPeople
        '
        Me.lblPeople.AutoSize = True
        Me.lblPeople.Font = New System.Drawing.Font("Microsoft Sans Serif", 20.0!)
        Me.lblPeople.Location = New System.Drawing.Point(12, 63)
        Me.lblPeople.Name = "lblPeople"
        Me.lblPeople.Size = New System.Drawing.Size(98, 31)
        Me.lblPeople.TabIndex = 11
        Me.lblPeople.Text = "People"
        '
        'PictureBox1
        '
        Me.PictureBox1.Image = CType(resources.GetObject("PictureBox1.Image"), System.Drawing.Image)
        Me.PictureBox1.Location = New System.Drawing.Point(243, 12)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(498, 416)
        Me.PictureBox1.TabIndex = 12
        Me.PictureBox1.TabStop = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.BackColor = System.Drawing.Color.White
        Me.ClientSize = New System.Drawing.Size(747, 435)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.lblPeople)
        Me.Controls.Add(Me.txtPeople)
        Me.Controls.Add(Me.lblTotal)
        Me.Controls.Add(Me.lblTotalLabel)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.lblTip)
        Me.Controls.Add(Me.lblTipLabel)
        Me.Controls.Add(Me.lblPercentLabel)
        Me.Controls.Add(Me.cmbTip)
        Me.Controls.Add(Me.lblBillLabel)
        Me.Controls.Add(Me.txtBill)
        Me.Icon = CType(resources.GetObject("$this.Icon"), System.Drawing.Icon)
        Me.Name = "Form1"
        Me.Text = "Restaurant Buddy"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents txtBill As System.Windows.Forms.TextBox
    Friend WithEvents lblBillLabel As System.Windows.Forms.Label
    Friend WithEvents cmbTip As System.Windows.Forms.ComboBox
    Friend WithEvents lblPercentLabel As System.Windows.Forms.Label
    Friend WithEvents lblTipLabel As System.Windows.Forms.Label
    Friend WithEvents lblTip As System.Windows.Forms.Label
    Friend WithEvents btnClear As System.Windows.Forms.Button
    Friend WithEvents btnExit As System.Windows.Forms.Button
    Friend WithEvents lblTotalLabel As System.Windows.Forms.Label
    Friend WithEvents lblTotal As System.Windows.Forms.Label
    Friend WithEvents txtPeople As System.Windows.Forms.TextBox
    Friend WithEvents lblPeople As System.Windows.Forms.Label
    Friend WithEvents PictureBox1 As System.Windows.Forms.PictureBox

End Class
